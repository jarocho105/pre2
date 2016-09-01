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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.FormularioRentaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class FormularioRentaJInternalFrame extends FormularioRentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFormularioRenta;
	
	protected JMenuBar jmenuBarFormularioRenta;
	
	protected JMenu jmenuFormularioRenta;
	protected JMenu jmenuDatosFormularioRenta;
	protected JMenu jmenuArchivoFormularioRenta;
	protected JMenu jmenuAccionesFormularioRenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormularioRenta;	
	protected GridBagConstraints gridBagConstraintsFormularioRenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormularioRentaDetalleFormJInternalFrame jInternalFrameDetalleFormFormularioRenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormularioRenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormularioRenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected DatoFormularioRentaBeanSwingJInternalFrame datoformulariorentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_datoformulariorenta="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parametroformularioiva="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public FormularioRentaSessionBean formulariorentaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public DatoFormularioRentaSessionBean datoformulariorentaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public ParametroFormularioIvaSessionBean parametroformularioivaSessionBean;
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FormularioRenta> formulariorentas;		
	public List<FormularioRenta> formulariorentasEliminados;	
	public List<FormularioRenta> formulariorentasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFormularioRenta;		
	protected JButton jButtonAbrirOrderByFormularioRenta;
	
	
	//protected JPanel jPanelOrderByFormularioRenta;
	//public JScrollPane jScrollPanelOrderByFormularioRenta;	
	//protected JButton jButtonCerrarOrderByFormularioRenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FormularioRentaLogic formulariorentaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormularioRenta;
	public JScrollPane jScrollPanelDatosEdicionFormularioRenta;
	public JScrollPane jScrollPanelDatosGeneralFormularioRenta;
    
	
	
	//public JScrollPane jScrollPanelDatosFormularioRentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormularioRenta;
	//public JScrollPane jScrollPanelImportacionFormularioRenta;
	
	
	
	protected JPanel jPanelAccionesFormularioRenta;
	
    protected JPanel jPanelPaginacionFormularioRenta;
    protected JPanel jPanelParametrosReportesFormularioRenta;
	protected JPanel jPanelParametrosReportesAccionesFormularioRenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FormularioRenta;
	protected JPanel jPanelParametrosAuxiliar2FormularioRenta;
	protected JPanel jPanelParametrosAuxiliar3FormularioRenta;
	protected JPanel jPanelParametrosAuxiliar4FormularioRenta;
	//protected JPanel jPanelParametrosAuxiliar5FormularioRenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoFormularioRenta;
	//protected JPanel jPanelImportacionFormularioRenta;
	
	
	public JTable jTableDatosFormularioRenta;
	
	
	
	//public JTable jTableDatosFormularioRentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormularioRenta;
	protected JButton jButtonDuplicarFormularioRenta;
	protected JButton jButtonCopiarFormularioRenta;
	protected JButton jButtonVerFormFormularioRenta;
	protected JButton jButtonNuevoRelacionesFormularioRenta;
	protected JButton jButtonModificarFormularioRenta;
	
    protected JButton jButtonGuardarCambiosTablaFormularioRenta;
	protected JButton jButtonCerrarFormularioRenta;
	
	
	protected JButton jButtonRecargarInformacionFormularioRenta;
	protected JButton jButtonProcesarInformacionFormularioRenta;
	
	
	protected JButton jButtonAnterioresFormularioRenta;
	protected JButton jButtonSiguientesFormularioRenta;
	protected JButton jButtonNuevoGuardarCambiosFormularioRenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFormularioRenta;
	//protected JButton jButtonCerrarReporteDinamicoFormularioRenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormularioRenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormularioRenta;
	//protected JButton jButtonGenerarImportacionFormularioRenta;
	//protected JButton jButtonCerrarImportacionFormularioRenta;
	//protected JFileChooser jFileChooserImportacionFormularioRenta;
	//protected File fileImportacionFormularioRenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormularioRenta;
	protected JButton jButtonDuplicarToolBarFormularioRenta;
	protected JButton jButtonNuevoRelacionesToolBarFormularioRenta;
	
	
	public JButton jButtonGuardarCambiosToolBarFormularioRenta;
	protected JButton jButtonCopiarToolBarFormularioRenta;
	protected JButton jButtonVerFormToolBarFormularioRenta;
	public JButton jButtonGuardarCambiosTablaToolBarFormularioRenta;
	protected JButton jButtonMostrarOcultarTablaToolBarFormularioRenta;
	protected JButton jButtonCerrarToolBarFormularioRenta;
	
	protected JButton jButtonRecargarInformacionToolBarFormularioRenta;
	protected JButton jButtonProcesarInformacionToolBarFormularioRenta;
	protected JButton jButtonAnterioresToolBarFormularioRenta;
	protected JButton jButtonSiguientesToolBarFormularioRenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormularioRenta;
	protected JButton jButtonAbrirOrderByToolBarFormularioRenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormularioRenta;
	protected JMenuItem jMenuItemDuplicarFormularioRenta;
	protected JMenuItem jMenuItemNuevoRelacionesFormularioRenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormularioRenta;
	protected JMenuItem jMenuItemCopiarFormularioRenta;
	protected JMenuItem jMenuItemVerFormFormularioRenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormularioRenta;
	protected JMenuItem jMenuItemCerrarFormularioRenta;
	protected JMenuItem jMenuItemDetalleCerrarFormularioRenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormularioRenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormularioRenta;
	
	protected JMenuItem jMenuItemRecargarInformacionFormularioRenta;
	protected JMenuItem jMenuItemProcesarInformacionFormularioRenta;
	protected JMenuItem jMenuItemAnterioresFormularioRenta;
	protected JMenuItem jMenuItemSiguientesFormularioRenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormularioRenta;
	protected JMenuItem jMenuItemAbrirOrderByFormularioRenta;
	protected JMenuItem jMenuItemMostrarOcultarFormularioRenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormularioRenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormularioRenta;
	protected JCheckBox jCheckBoxSeleccionadosFormularioRenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormularioRenta;
	protected JCheckBox jCheckBoxConGraficoReporteFormularioRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormularioRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormularioRenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormularioRenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormularioRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormularioRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormularioRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormularioRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormularioRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormularioRenta;
	protected JTextField jTextFieldValorCampoGeneralFormularioRenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFormularioRenta;
	//public JList<Reporte> jListColumnasSelectReporteFormularioRenta;
	//public JScrollPane jScrollColumnasSelectReporteFormularioRenta;
	
	//public JLabel jLabelRelacionesSelectReporteFormularioRenta;
	//public JList<Reporte> jListRelacionesSelectReporteFormularioRenta;
	//public JScrollPane jScrollRelacionesSelectReporteFormularioRenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormularioRenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormularioRenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormularioRenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormularioRenta;
	
		
	//public JLabel jLabelArchivoImportacionFormularioRenta;	
	//public JLabel jLabelPathArchivoImportacionFormularioRenta;
	//protected JTextField jTextFieldPathArchivoImportacionFormularioRenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormularioRenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormularioRenta;
	
	//public JLabel jLabelColumnaCategoriaValorFormularioRenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormularioRenta;
	
	//public JLabel jLabelColumnasValoresGraficoFormularioRenta;
	//public JList<Reporte> jListColumnasValoresGraficoFormularioRenta;
	//public JScrollPane jScrollColumnasValoresGraficoFormularioRenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormularioRenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormularioRenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFormularioRenta;
	public JPanel jPanelFK_IdCuentaContableFormularioRenta;
	public JButton jButtonFK_IdCuentaContableFormularioRenta;
	public JPanel jPanelFK_IdDatoFormularioRentaFormularioRenta;
	public JButton jButtonFK_IdDatoFormularioRentaFormularioRenta;
	public JPanel jPanelFK_IdPaisFormularioRenta;
	public JButton jButtonFK_IdPaisFormularioRenta;
	public JPanel jPanelFK_IdParametroFormularioIvaFormularioRenta;
	public JButton jButtonFK_IdParametroFormularioIvaFormularioRenta;
	public JPanel jPanelFK_IdTipoRetencionFormularioRenta;
	public JButton jButtonFK_IdTipoRetencionFormularioRenta;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableFormularioRenta;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormularioRenta= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormularioRentaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormularioRentaArbol= new JButtonMe();

	
	public JPanel jPanelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta;
	public JLabel jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta;
	public JButton jButtonid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta= new JButtonMe();
	public JButton jButtonid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisFormularioRenta;
	public JLabel jLabelid_paisFK_IdPaisFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisFormularioRenta;
	public JButton jButtonid_paisFK_IdPaisFormularioRenta= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisFormularioRentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta;
	public JLabel jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta;
	public JButton jButtonid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta= new JButtonMe();
	public JButton jButtonid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencionFK_IdTipoRetencionFormularioRenta;
	public JLabel jLabelid_tipo_retencionFK_IdTipoRetencionFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta;
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionFormularioRenta= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionFormularioRentaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public FormularioRentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormularioRenta)	{
		this.jButtonRecargarInformacionFormularioRenta = jButtonRecargarInformacionFormularioRenta;
	}
	
	public JButton getjButtonProcesarInformacionFormularioRenta() {
		return this.jButtonProcesarInformacionFormularioRenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormularioRenta)	{
		this.jButtonProcesarInformacionFormularioRenta = jButtonProcesarInformacionFormularioRenta;
	}
	
	
	public JButton getjButtonRecargarInformacionFormularioRenta() {
		return this.jButtonRecargarInformacionFormularioRenta;
	}
	
	
	public List<FormularioRenta> getformulariorentas() {
		return this.formulariorentas;
	}

	public void setformulariorentas(List<FormularioRenta> formulariorentas) {
		this.formulariorentas = formulariorentas;
	}
	
	public List<FormularioRenta> getformulariorentasAux() {
		return this.formulariorentasAux;
	}

	public void setformulariorentasAux(List<FormularioRenta> formulariorentasAux) {
		this.formulariorentasAux = formulariorentasAux;
	}
	
	public List<FormularioRenta> getformulariorentasEliminados() {
		return this.formulariorentasEliminados;
	}

	public void setFormularioRentasEliminados(List<FormularioRenta> formulariorentasEliminados) {
		this.formulariorentasEliminados = formulariorentasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormularioRenta() {
		return jComboBoxTiposSeleccionarFormularioRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormularioRenta(
			JComboBox jComboBoxTiposSeleccionarFormularioRenta) {
		this.jComboBoxTiposSeleccionarFormularioRenta = jComboBoxTiposSeleccionarFormularioRenta;
	}
	
	public void setBorderResaltarTiposSeleccionarFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormularioRenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormularioRenta() {
		return jTextFieldValorCampoGeneralFormularioRenta;
	}

	public void setjTextFieldValorCampoGeneralFormularioRenta(
			JTextField jTextFieldValorCampoGeneralFormularioRenta) {
		this.jTextFieldValorCampoGeneralFormularioRenta = jTextFieldValorCampoGeneralFormularioRenta;
	}

	public void setBorderResaltarValorCampoGeneralFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormularioRenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormularioRenta() {
		return this.jCheckBoxSeleccionarTodosFormularioRenta;
	}

	public void setjCheckBoxSeleccionarTodosFormularioRenta(
			JCheckBox jCheckBoxSeleccionarTodosFormularioRenta) {
		this.jCheckBoxSeleccionarTodosFormularioRenta = jCheckBoxSeleccionarTodosFormularioRenta;
	}

	public void setBorderResaltarSeleccionarTodosFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFormularioRenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormularioRenta() {
		return this.jCheckBoxSeleccionadosFormularioRenta;
	}

	public void setjCheckBoxSeleccionadosFormularioRenta(
			JCheckBox jCheckBoxSeleccionadosFormularioRenta) {
		this.jCheckBoxSeleccionadosFormularioRenta = jCheckBoxSeleccionadosFormularioRenta;
	}
	
	public void setBorderResaltarSeleccionadosFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFormularioRenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormularioRenta() {
		return this.jComboBoxTiposArchivosReportesFormularioRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormularioRenta(
			JComboBox jComboBoxTiposArchivosReportesFormularioRenta) {
		this.jComboBoxTiposArchivosReportesFormularioRenta = jComboBoxTiposArchivosReportesFormularioRenta;
	}

	public void setBorderResaltarTiposArchivosReportesFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormularioRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormularioRenta() {
		return this.jComboBoxTiposReportesFormularioRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormularioRenta(
			JComboBox jComboBoxTiposReportesFormularioRenta) {
		this.jComboBoxTiposReportesFormularioRenta = jComboBoxTiposReportesFormularioRenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormularioRenta() {
	//	return jComboBoxTiposReportesDinamicoFormularioRenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormularioRenta(
	//		JComboBox jComboBoxTiposReportesDinamicoFormularioRenta) {
	//	this.jComboBoxTiposReportesDinamicoFormularioRenta = jComboBoxTiposReportesDinamicoFormularioRenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormularioRenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormularioRenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormularioRenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormularioRenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta = jComboBoxTiposArchivosReportesDinamicoFormularioRenta;
	//}
	
	public void setBorderResaltarTiposReportesFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormularioRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormularioRenta() {
		return this.jComboBoxTiposGraficosReportesFormularioRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormularioRenta(
			JComboBox jComboBoxTiposGraficosReportesFormularioRenta) {
		this.jComboBoxTiposGraficosReportesFormularioRenta = jComboBoxTiposGraficosReportesFormularioRenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormularioRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormularioRenta() {
		return this.jComboBoxTiposPaginacionFormularioRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormularioRenta(
			JComboBox jComboBoxTiposPaginacionFormularioRenta) {
		this.jComboBoxTiposPaginacionFormularioRenta = jComboBoxTiposPaginacionFormularioRenta;
	}
	
	public void setBorderResaltarTiposPaginacionFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormularioRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormularioRenta() {
		return this.jComboBoxTiposRelacionesFormularioRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRenta() {
		return this.jComboBoxTiposAccionesFormularioRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormularioRenta(
			JComboBox jComboBoxTiposRelacionesFormularioRenta) {
		this.jComboBoxTiposRelacionesFormularioRenta = jComboBoxTiposRelacionesFormularioRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRenta(
			JComboBox jComboBoxTiposAccionesFormularioRenta) {
		this.jComboBoxTiposAccionesFormularioRenta = jComboBoxTiposAccionesFormularioRenta;
	}
	
	public void setBorderResaltarTiposRelacionesFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormularioRenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormularioRenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormularioRenta() {
	//	return jCheckBoxConGraficoDinamicoFormularioRenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormularioRenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormularioRenta) {
	//	this.jCheckBoxConGraficoDinamicoFormularioRenta = jCheckBoxConGraficoDinamicoFormularioRenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormularioRenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormularioRenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormularioRenta .setBorder(borderResaltar);		
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
		this.formulariorentaSessionBean=new FormularioRentaSessionBean();
		
		this.formulariorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formulariorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formulariorentaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormularioRentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formulario Renta MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
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
		
		FormularioRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFormularioRenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"nuevo","nuevo","Nuevo"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"duplicar","duplicar","Duplicar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"copiar","copiar","Copiar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"ver_form","ver_form","Ver"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"recargar","recargar","Recargar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormularioRenta,this.jTtoolBarFormularioRenta,
							"cerrar","cerrar","Salir"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormularioRenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormularioRenta;
			
				this.jButtonProcesarInformacionToolBarFormularioRenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormularioRenta;
				
		//protected JButton jButtonModificarToolBarFormularioRenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFormularioRenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormularioRenta=new JMenuMe("General");
		this.jmenuArchivoFormularioRenta=new JMenuMe("Archivo");
		this.jmenuAccionesFormularioRenta=new JMenuMe("Acciones");
		this.jmenuDatosFormularioRenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormularioRenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormularioRenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormularioRenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormularioRenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormularioRenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormularioRenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormularioRenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormularioRenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormularioRenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormularioRenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormularioRenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormularioRenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormularioRenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormularioRenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormularioRenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormularioRenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormularioRenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormularioRenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormularioRenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormularioRenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormularioRenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormularioRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormularioRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormularioRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormularioRenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormularioRenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormularioRenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormularioRenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormularioRenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormularioRenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormularioRenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormularioRenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormularioRenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormularioRenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormularioRenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormularioRenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormularioRenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormularioRenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormularioRenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormularioRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormularioRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormularioRenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormularioRenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormularioRenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormularioRenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormularioRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormularioRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormularioRenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormularioRenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormularioRenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormularioRenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormularioRenta.add(this.jMenuItemCerrarFormularioRenta);
			
			this.jmenuAccionesFormularioRenta.add(this.jMenuItemNuevoFormularioRenta);
			this.jmenuAccionesFormularioRenta.add(this.jMenuItemNuevoGuardarCambiosFormularioRenta);
			this.jmenuAccionesFormularioRenta.add(this.jMenuItemNuevoRelacionesFormularioRenta);
			this.jmenuAccionesFormularioRenta.add(this.jMenuItemGuardarCambiosTablaFormularioRenta);		
			this.jmenuAccionesFormularioRenta.add(this.jMenuItemDuplicarFormularioRenta);		
			this.jmenuAccionesFormularioRenta.add(this.jMenuItemCopiarFormularioRenta);		
			this.jmenuAccionesFormularioRenta.add(this.jMenuItemVerFormFormularioRenta);		
			
			this.jmenuDatosFormularioRenta.add(this.jMenuItemRecargarInformacionFormularioRenta);				
			this.jmenuDatosFormularioRenta.add(this.jMenuItemAnterioresFormularioRenta);				
			this.jmenuDatosFormularioRenta.add(this.jMenuItemSiguientesFormularioRenta);				
			this.jmenuDatosFormularioRenta.add(this.jMenuItemAbrirOrderByFormularioRenta);				
			this.jmenuDatosFormularioRenta.add(this.jMenuItemMostrarOcultarFormularioRenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormularioRenta.add(this.jMenuItemGuardarCambiosFormularioRenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormularioRenta.add(this.jmenuArchivoFormularioRenta);		
			this.jmenuBarFormularioRenta.add(this.jmenuAccionesFormularioRenta);		
			this.jmenuBarFormularioRenta.add(this.jmenuDatosFormularioRenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormularioRenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFormularioRenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableFormularioRenta.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableFormularioRenta= new JButtonMe();
		this.jButtonFK_IdCuentaContableFormularioRenta.setText("Buscar");
		this.jButtonFK_IdCuentaContableFormularioRenta.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableFormularioRenta,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableFormularioRenta = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableFormularioRenta.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableFormularioRenta.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDatoFormularioRentaFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDatoFormularioRentaFormularioRenta.setToolTipText("Buscar Por Dato Formulario Renta ");
		this.jButtonFK_IdDatoFormularioRentaFormularioRenta= new JButtonMe();
		this.jButtonFK_IdDatoFormularioRentaFormularioRenta.setText("Buscar");
		this.jButtonFK_IdDatoFormularioRentaFormularioRenta.setToolTipText("Buscar Por Dato Formulario Renta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDatoFormularioRentaFormularioRenta,"buscar_button","Buscar Por Dato Formulario Renta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDatoFormularioRentaFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta = new JLabelMe();
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setText("Dato Formulario Renta :");
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setToolTipText("Dato Formulario Renta");
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta= new JComboBoxMe();
		jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisFormularioRenta.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisFormularioRenta= new JButtonMe();
		this.jButtonFK_IdPaisFormularioRenta.setText("Buscar");
		this.jButtonFK_IdPaisFormularioRenta.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisFormularioRenta,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisFormularioRenta = new JLabelMe();
		jLabelid_paisFK_IdPaisFormularioRenta.setText("Pais :");
		jLabelid_paisFK_IdPaisFormularioRenta.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisFormularioRenta= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdParametroFormularioIvaFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdParametroFormularioIvaFormularioRenta.setToolTipText("Buscar Por Parametro Formulario Iva ");
		this.jButtonFK_IdParametroFormularioIvaFormularioRenta= new JButtonMe();
		this.jButtonFK_IdParametroFormularioIvaFormularioRenta.setText("Buscar");
		this.jButtonFK_IdParametroFormularioIvaFormularioRenta.setToolTipText("Buscar Por Parametro Formulario Iva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdParametroFormularioIvaFormularioRenta,"buscar_button","Buscar Por Parametro Formulario Iva ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdParametroFormularioIvaFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta = new JLabelMe();
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setText("Parametro Formulario Iva :");
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setToolTipText("Parametro Formulario Iva");
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta= new JComboBoxMe();
		jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionFormularioRenta.setToolTipText("Buscar Por Tipo Retencion ");
		this.jButtonFK_IdTipoRetencionFormularioRenta= new JButtonMe();
		this.jButtonFK_IdTipoRetencionFormularioRenta.setText("Buscar");
		this.jButtonFK_IdTipoRetencionFormularioRenta.setToolTipText("Buscar Por Tipo Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionFormularioRenta,"buscar_button","Buscar Por Tipo Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencionFK_IdTipoRetencionFormularioRenta = new JLabelMe();
		jLabelid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setText("Tipo Retencion :");
		jLabelid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setToolTipText("Tipo Retencion");
		jLabelid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionFK_IdTipoRetencionFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta= new JComboBoxMe();
		jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormularioRenta=new JTabbedPane();


		this.jTabbedPaneBusquedasFormularioRenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormularioRenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormularioRenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormularioRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFormularioRenta = new FormularioRentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Formulario Renta DATOS");
			this.jInternalFrameDetalleFormFormularioRenta = new FormularioRentaDetalleFormJInternalFrame(jDesktopPane,this.formulariorentaSessionBean.getConGuardarRelaciones(),this.formulariorentaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormularioRenta = null;//new FormularioRentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormularioRenta= new GridBagLayout();
		
		
		this.jTableDatosFormularioRenta = new JTableMe();      
		
		String sToolTipFormularioRenta="";
		sToolTipFormularioRenta=FormularioRentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormularioRenta+="(Contabilidad.FormularioRenta)";
		}
		
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormularioRenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormularioRenta.setToolTipText(sToolTipFormularioRenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormularioRenta);
		this.jTableDatosFormularioRenta.setAutoCreateRowSorter(true);
		this.jTableDatosFormularioRenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormularioRenta.setRowSelectionAllowed(true);
		this.jTableDatosFormularioRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormularioRenta = new JButtonMe();
		this.jButtonDuplicarFormularioRenta = new JButtonMe();
		this.jButtonCopiarFormularioRenta = new JButtonMe();
		this.jButtonVerFormFormularioRenta = new JButtonMe();
		this.jButtonNuevoRelacionesFormularioRenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormularioRenta = new JButtonMe();
		this.jButtonCerrarFormularioRenta = new JButtonMe();
		
		this.jScrollPanelDatosFormularioRenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormularioRenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Formulario Renta";
		
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Rentas" + this.sPath));
		} else {
			this.jScrollPanelDatosFormularioRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormularioRenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFormularioRenta=new ReporteDinamicoJInternalFrame(FormularioRentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormularioRenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormularioRenta=new ImportacionJInternalFrame(FormularioRentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormularioRenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFormularioRenta = new JButtonMe();
		
		this.jButtonAbrirOrderByFormularioRenta.setText("Orden");
		this.jButtonAbrirOrderByFormularioRenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormularioRenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormularioRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioRenta,false,this);
			
			//this.cargarOrderByFormularioRenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormularioRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioRenta,true,this);
			
			//this.cargarOrderByFormularioRenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormularioRenta.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosFormularioRenta.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosFormularioRenta.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosFormularioRenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormularioRenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormularioRenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormularioRenta.setText("Nuevo");
		this.jButtonDuplicarFormularioRenta.setText("Duplicar");
		this.jButtonCopiarFormularioRenta.setText("Copiar");
		this.jButtonVerFormFormularioRenta.setText("Ver");
		this.jButtonNuevoRelacionesFormularioRenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormularioRenta.setText("Guardar");
		this.jButtonCerrarFormularioRenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormularioRenta,"nuevo_button","Nuevo",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormularioRenta,"duplicar_button","Duplicar",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormularioRenta,"copiar_button","Copiar",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormularioRenta,"ver_form","Ver",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormularioRenta,"nuevorelaciones_button","Nuevo Rel",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormularioRenta,"guardarcambiostabla_button","Guardar",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormularioRenta,"cerrar_button","Salir",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormularioRenta.setToolTipText("Nuevo"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormularioRenta.setToolTipText("Duplicar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormularioRenta.setToolTipText("Copiar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormularioRenta.setToolTipText("Ver"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormularioRenta.setToolTipText("Nuevo Rel"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormularioRenta.setToolTipText("Guardar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormularioRenta.setToolTipText("Salir"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormularioRenta";
		inputMap = this.jButtonNuevoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormularioRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormularioRenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormularioRenta";
		inputMap = this.jButtonDuplicarFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormularioRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormularioRenta"));
		
		//COPIAR
		sMapKey = "CopiarFormularioRenta";
		inputMap = this.jButtonCopiarFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormularioRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormularioRenta"));
		
		//VEr FORM
		sMapKey = "VerFormFormularioRenta";
		inputMap = this.jButtonVerFormFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormularioRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormularioRenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormularioRenta";
		inputMap = this.jButtonNuevoRelacionesFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormularioRenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormularioRenta";
		inputMap = this.jButtonModificarFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormularioRenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormularioRenta";
		inputMap = this.jButtonCerrarFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormularioRenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormularioRenta";
		inputMap = this.jButtonGuardarCambiosTablaFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormularioRenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormularioRenta.setName("jPanelParametrosReportesFormularioRenta"); 
		
		this.jPanelParametrosReportesAccionesFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormularioRenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormularioRenta.setName("jPanelParametrosReportesAccionesFormularioRenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFormularioRenta = new JButtonMe();
		this.jButtonRecargarInformacionFormularioRenta.setText("Recargar");
		this.jButtonRecargarInformacionFormularioRenta.setToolTipText("Recargar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormularioRenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFormularioRenta = new JButtonMe();
		this.jButtonProcesarInformacionFormularioRenta.setText("Procesar");
		this.jButtonProcesarInformacionFormularioRenta.setToolTipText("Procesar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormularioRenta.setVisible(false);
			
		this.jButtonProcesarInformacionFormularioRenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormularioRenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormularioRenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioRenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormularioRenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioRenta.setText("TIPO");       
		this.jComboBoxTiposReportesFormularioRenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioRenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormularioRenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormularioRenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormularioRenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormularioRenta.setText("Accion");
		this.jComboBoxTiposRelacionesFormularioRenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRenta.setText("Accion");
		this.jComboBoxTiposAccionesFormularioRenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormularioRenta.setText("Accion");
		this.jComboBoxTiposSeleccionarFormularioRenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormularioRenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormularioRenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormularioRenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormularioRenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFormularioRenta = new JLabelMe();
		
		this.jLabelAccionesFormularioRenta.setText("Acciones");		
		this.jLabelAccionesFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormularioRenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormularioRenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormularioRenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormularioRenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormularioRenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormularioRenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFormularioRenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormularioRenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormularioRenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormularioRenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormularioRenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormularioRenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFormularioRenta = new JButtonMe();
		//this.jButtonAnterioresFormularioRenta.setText("<<");
        this.jButtonAnterioresFormularioRenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormularioRenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormularioRenta = new JButtonMe();
		//this.jButtonSiguientesFormularioRenta.setText(">>");
        this.jButtonSiguientesFormularioRenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormularioRenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormularioRenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormularioRenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormularioRenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormularioRenta,"nuevoguardarcambios_button","Nue",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormularioRenta";
		inputMap = this.jButtonNuevoGuardarCambiosFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormularioRenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFormularioRenta";
		inputMap = this.jButtonRecargarInformacionFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormularioRenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormularioRenta";
		inputMap = this.jButtonSiguientesFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormularioRenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormularioRenta";
		inputMap = this.jButtonAnterioresFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormularioRenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFormularioRenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormularioRenta.setMinimumSize(new Dimension(this.getWidth(),FormularioRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioRentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormularioRenta.setMaximumSize(new Dimension(this.getWidth(),FormularioRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioRentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormularioRenta.setPreferredSize(new Dimension(this.getWidth(),FormularioRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioRentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormularioRenta = new GridBagLayout();

			this.jPanelPaginacionFormularioRenta.setLayout(gridaBagLayoutPaginacionFormularioRenta);						
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = 0;
			this.gridBagConstraintsFormularioRenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormularioRenta.add(this.jButtonAnterioresFormularioRenta, this.gridBagConstraintsFormularioRenta);
					
						
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormularioRenta.gridy = 0;
			
			this.jPanelPaginacionFormularioRenta.add(this.jButtonNuevoGuardarCambiosFormularioRenta, this.gridBagConstraintsFormularioRenta);
						
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormularioRenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormularioRenta.gridy = 0;
			this.jPanelPaginacionFormularioRenta.add(this.jButtonSiguientesFormularioRenta, this.gridBagConstraintsFormularioRenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = 1;
			this.gridBagConstraintsFormularioRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRenta.add(this.jButtonNuevoFormularioRenta, this.gridBagConstraintsFormularioRenta);
						
			
			
			if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
				this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormularioRenta.gridy = 1;
				this.gridBagConstraintsFormularioRenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormularioRenta.add(this.jButtonGuardarCambiosTablaFormularioRenta, this.gridBagConstraintsFormularioRenta);
			}
			
			
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = 1;
			this.gridBagConstraintsFormularioRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRenta.add(this.jButtonDuplicarFormularioRenta, this.gridBagConstraintsFormularioRenta);
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = 1;
			this.gridBagConstraintsFormularioRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRenta.add(this.jButtonCopiarFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = 1;
			this.gridBagConstraintsFormularioRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRenta.add(this.jButtonVerFormFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = 1;
			this.gridBagConstraintsFormularioRenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormularioRenta.add(this.jButtonCerrarFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
		
		
		this.jButtonRecargarInformacionFormularioRenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormularioRenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormularioRenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFormularioRenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormularioRenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormularioRenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormularioRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormularioRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormularioRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormularioRenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormularioRenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormularioRenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormularioRenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormularioRenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormularioRenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormularioRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormularioRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormularioRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormularioRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormularioRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormularioRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormularioRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormularioRenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormularioRenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormularioRenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormularioRenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormularioRenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormularioRenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFormularioRenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormularioRenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormularioRenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormularioRenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormularioRenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormularioRenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormularioRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormularioRenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FormularioRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FormularioRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FormularioRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FormularioRenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormularioRenta.setLayout(gridaBagParametrosReportesFormularioRenta);
			this.jPanelParametrosReportesAccionesFormularioRenta.setLayout(gridaBagParametrosReportesAccionesFormularioRenta);
			
			
			this.jPanelParametrosAuxiliar1FormularioRenta.setLayout(gridaBagParametrosAuxiliar1FormularioRenta);
			this.jPanelParametrosAuxiliar2FormularioRenta.setLayout(gridaBagParametrosAuxiliar2FormularioRenta);
			this.jPanelParametrosAuxiliar3FormularioRenta.setLayout(gridaBagParametrosAuxiliar3FormularioRenta);
			this.jPanelParametrosAuxiliar4FormularioRenta.setLayout(gridaBagParametrosAuxiliar4FormularioRenta);
			//this.jPanelParametrosAuxiliar5FormularioRenta.setLayout(gridaBagParametrosAuxiliar2FormularioRenta);			
			
			
			
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRenta.add(this.jButtonRecargarInformacionFormularioRenta, this.gridBagConstraintsFormularioRenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioRenta.add(this.jComboBoxTiposPaginacionFormularioRenta, this.gridBagConstraintsFormularioRenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioRenta.add(this.jCheckBoxConAltoMaximoTablaFormularioRenta, this.gridBagConstraintsFormularioRenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioRenta.add(this.jComboBoxTiposArchivosReportesFormularioRenta, this.gridBagConstraintsFormularioRenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRenta.add(this.jPanelParametrosAuxiliar1FormularioRenta, this.gridBagConstraintsFormularioRenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FormularioRenta.add(this.jComboBoxTiposReportesFormularioRenta, this.gridBagConstraintsFormularioRenta);																		
			
			
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FormularioRenta.add(this.jComboBoxTiposGraficosReportesFormularioRenta, this.gridBagConstraintsFormularioRenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRenta.add(this.jPanelParametrosAuxiliar4FormularioRenta, this.gridBagConstraintsFormularioRenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRenta.add(this.jComboBoxTiposReportesFormularioRenta, this.gridBagConstraintsFormularioRenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioRenta.add(this.jCheckBoxGenerarReporteFormularioRenta, this.gridBagConstraintsFormularioRenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRenta.add(this.jPanelParametrosAuxiliar2FormularioRenta, this.gridBagConstraintsFormularioRenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioRenta.add(this.jLabelAccionesFormularioRenta, this.gridBagConstraintsFormularioRenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
				this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormularioRenta.add(this.jButtonAbrirOrderByFormularioRenta, this.gridBagConstraintsFormularioRenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRenta.add(this.jComboBoxTiposSeleccionarFormularioRenta, this.gridBagConstraintsFormularioRenta);			
			
			
			/*
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioRenta.add(this.jCheckBoxSeleccionarTodosFormularioRenta, this.gridBagConstraintsFormularioRenta);
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioRenta.add(this.jCheckBoxConGraficoReporteFormularioRenta, this.gridBagConstraintsFormularioRenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormularioRenta.add(this.jCheckBoxSeleccionarTodosFormularioRenta, this.gridBagConstraintsFormularioRenta);															
				
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormularioRenta.add(this.jCheckBoxSeleccionadosFormularioRenta, this.gridBagConstraintsFormularioRenta);															
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormularioRenta.add(this.jCheckBoxConGraficoReporteFormularioRenta, this.gridBagConstraintsFormularioRenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRenta.add(this.jPanelParametrosAuxiliar3FormularioRenta, this.gridBagConstraintsFormularioRenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRenta.add(this.jComboBoxTiposAccionesFormularioRenta, this.gridBagConstraintsFormularioRenta);
	
				
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRenta.add(this.jTextFieldValorCampoGeneralFormularioRenta, this.gridBagConstraintsFormularioRenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormularioRenta = new GridBagLayout();

			this.jScrollPanelDatosFormularioRenta.setLayout(gridaBagLayoutDatosFormularioRenta);
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = 0;
			this.gridBagConstraintsFormularioRenta.gridx = 0;
			
			this.jScrollPanelDatosFormularioRenta.add(this.jTableDatosFormularioRenta, this.gridBagConstraintsFormularioRenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormularioRenta.setViewportView(this.jTableDatosFormularioRenta);
		this.jTableDatosFormularioRenta.setFillsViewportHeight(true);
		this.jTableDatosFormularioRenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormularioRenta= new GridBagLayout();
		this.jPanelAccionesFormularioRenta.setLayout(gridaBagLayoutAccionesFormularioRenta);
		
		
		/*	
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 0;
			
		this.jPanelAccionesFormularioRenta.add(this.jButtonNuevoFormularioRenta, this.gridBagConstraintsFormularioRenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableFormularioRenta= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableFormularioRenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFormularioRenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFormularioRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableFormularioRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableFormularioRenta.setLayout(gridaBagLayoutFK_IdCuentaContableFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 0;
		gridBagConstraintsFormularioRenta.gridx = 0;
		jPanelFK_IdCuentaContableFormularioRenta.add(jLabelid_cuenta_contableFK_IdCuentaContableFormularioRenta, gridBagConstraintsFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 0;
		gridBagConstraintsFormularioRenta.gridx = 1;
		jPanelFK_IdCuentaContableFormularioRenta.add(jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta, gridBagConstraintsFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 1;
		gridBagConstraintsFormularioRenta.gridx =1;
		jPanelFK_IdCuentaContableFormularioRenta.add(jButtonFK_IdCuentaContableFormularioRenta, gridBagConstraintsFormularioRenta);

		jTabbedPaneBusquedasFormularioRenta.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableFormularioRenta);
		jTabbedPaneBusquedasFormularioRenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDatoFormularioRentaFormularioRenta= new GridBagLayout();
		gridaBagLayoutFK_IdDatoFormularioRentaFormularioRenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDatoFormularioRentaFormularioRenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDatoFormularioRentaFormularioRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDatoFormularioRentaFormularioRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDatoFormularioRentaFormularioRenta.setLayout(gridaBagLayoutFK_IdDatoFormularioRentaFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 0;
		gridBagConstraintsFormularioRenta.gridx = 0;
		jPanelFK_IdDatoFormularioRentaFormularioRenta.add(jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta, gridBagConstraintsFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 0;
		gridBagConstraintsFormularioRenta.gridx = 1;
		jPanelFK_IdDatoFormularioRentaFormularioRenta.add(jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta, gridBagConstraintsFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 1;
		gridBagConstraintsFormularioRenta.gridx =1;
		jPanelFK_IdDatoFormularioRentaFormularioRenta.add(jButtonFK_IdDatoFormularioRentaFormularioRenta, gridBagConstraintsFormularioRenta);

		jTabbedPaneBusquedasFormularioRenta.addTab("2.-Por Dato Formulario Renta ", jPanelFK_IdDatoFormularioRentaFormularioRenta);
		jTabbedPaneBusquedasFormularioRenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisFormularioRenta= new GridBagLayout();
		gridaBagLayoutFK_IdPaisFormularioRenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisFormularioRenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisFormularioRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisFormularioRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisFormularioRenta.setLayout(gridaBagLayoutFK_IdPaisFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 0;
		gridBagConstraintsFormularioRenta.gridx = 0;
		jPanelFK_IdPaisFormularioRenta.add(jLabelid_paisFK_IdPaisFormularioRenta, gridBagConstraintsFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 0;
		gridBagConstraintsFormularioRenta.gridx = 1;
		jPanelFK_IdPaisFormularioRenta.add(jComboBoxid_paisFK_IdPaisFormularioRenta, gridBagConstraintsFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 1;
		gridBagConstraintsFormularioRenta.gridx =1;
		jPanelFK_IdPaisFormularioRenta.add(jButtonFK_IdPaisFormularioRenta, gridBagConstraintsFormularioRenta);

		jTabbedPaneBusquedasFormularioRenta.addTab("3.-Por Pais ", jPanelFK_IdPaisFormularioRenta);
		jTabbedPaneBusquedasFormularioRenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdParametroFormularioIvaFormularioRenta= new GridBagLayout();
		gridaBagLayoutFK_IdParametroFormularioIvaFormularioRenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdParametroFormularioIvaFormularioRenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdParametroFormularioIvaFormularioRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdParametroFormularioIvaFormularioRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdParametroFormularioIvaFormularioRenta.setLayout(gridaBagLayoutFK_IdParametroFormularioIvaFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 0;
		gridBagConstraintsFormularioRenta.gridx = 0;
		jPanelFK_IdParametroFormularioIvaFormularioRenta.add(jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta, gridBagConstraintsFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 0;
		gridBagConstraintsFormularioRenta.gridx = 1;
		jPanelFK_IdParametroFormularioIvaFormularioRenta.add(jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta, gridBagConstraintsFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 1;
		gridBagConstraintsFormularioRenta.gridx =1;
		jPanelFK_IdParametroFormularioIvaFormularioRenta.add(jButtonFK_IdParametroFormularioIvaFormularioRenta, gridBagConstraintsFormularioRenta);

		jTabbedPaneBusquedasFormularioRenta.addTab("4.-Por Parametro Formulario Iva ", jPanelFK_IdParametroFormularioIvaFormularioRenta);
		jTabbedPaneBusquedasFormularioRenta.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionFormularioRenta= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionFormularioRenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionFormularioRenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionFormularioRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionFormularioRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionFormularioRenta.setLayout(gridaBagLayoutFK_IdTipoRetencionFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 0;
		gridBagConstraintsFormularioRenta.gridx = 0;
		jPanelFK_IdTipoRetencionFormularioRenta.add(jLabelid_tipo_retencionFK_IdTipoRetencionFormularioRenta, gridBagConstraintsFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 0;
		gridBagConstraintsFormularioRenta.gridx = 1;
		jPanelFK_IdTipoRetencionFormularioRenta.add(jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta, gridBagConstraintsFormularioRenta);

		gridBagConstraintsFormularioRenta = new GridBagConstraints();
		gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta.gridy = 1;
		gridBagConstraintsFormularioRenta.gridx =1;
		jPanelFK_IdTipoRetencionFormularioRenta.add(jButtonFK_IdTipoRetencionFormularioRenta, gridBagConstraintsFormularioRenta);

		jTabbedPaneBusquedasFormularioRenta.addTab("5.-Por Tipo Retencion ", jPanelFK_IdTipoRetencionFormularioRenta);
		jTabbedPaneBusquedasFormularioRenta.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormularioRenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormularioRenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();						
			this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioRenta.gridx = 0;		
			//this.gridBagConstraintsFormularioRenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormularioRenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormularioRenta, this.gridBagConstraintsFormularioRenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormularioRenta.gridx = 0;		
		//this.gridBagConstraintsFormularioRenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormularioRenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormularioRenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioRenta.gridx = 0;		
			this.gridBagConstraintsFormularioRenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormularioRenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFormularioRenta, this.gridBagConstraintsFormularioRenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFormularioRenta, this.gridBagConstraintsFormularioRenta);								
		
		
		/*
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormularioRenta, this.gridBagConstraintsFormularioRenta);
		*/		
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormularioRenta.gridx =0;
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormularioRenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormularioRenta, this.gridBagConstraintsFormularioRenta);
				
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormularioRenta, this.gridBagConstraintsFormularioRenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FormularioRentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormularioRenta = new GridBagLayout();
			this.jPanelBusquedasParametrosFormularioRenta.setLayout(gridaBagLayoutBusquedasParametrosFormularioRenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormularioRenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormularioRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormularioRenta, this.gridBagConstraintsFormularioRenta);
			
			
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
			
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormularioRenta, this.gridBagConstraintsFormularioRenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormularioRenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormularioRenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormularioRenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormularioRenta.setName("jPanelReporteDinamicoFormularioRenta"); 
		
		this.jPanelReporteDinamicoFormularioRenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormularioRenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormularioRenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormularioRenta.setLayout(gridaBagLayoutReporteDinamicoFormularioRenta);
		
		
		this.jInternalFrameReporteDinamicoFormularioRenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormularioRenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormularioRenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormularioRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormularioRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormularioRenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormularioRenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormularioRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormularioRenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormularioRenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormularioRenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormularioRenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormularioRenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormularioRenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Rentas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormularioRenta = new JLabelMe();

		this.jLabelColumnasSelectReporteFormularioRenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormularioRenta.add(this.jLabelColumnasSelectReporteFormularioRenta, this.gridBagConstraintsFormularioRenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormularioRenta = new JList<Reporte>();
		this.jListColumnasSelectReporteFormularioRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormularioRenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormularioRenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormularioRenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormularioRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormularioRenta=new JScrollPane(this.jListColumnasSelectReporteFormularioRenta);
			
			this.jScrollColumnasSelectReporteFormularioRenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormularioRenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormularioRenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormularioRenta.add(this.jListColumnasSelectReporteFormularioRenta, this.gridBagConstraintsFormularioRenta);
		this.jPanelReporteDinamicoFormularioRenta.add(this.jScrollColumnasSelectReporteFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormularioRenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormularioRenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormularioRenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormularioRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormularioRenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormularioRenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormularioRenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormularioRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormularioRenta=new JScrollPane(this.jListRelacionesSelectReporteFormularioRenta);
			
			this.jScrollRelacionesSelectReporteFormularioRenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormularioRenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormularioRenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFormularioRenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormularioRenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormularioRenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormularioRenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormularioRenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormularioRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormularioRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormularioRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFormularioRenta = new JLabelMe();

		this.jLabelConGraficoDinamicoFormularioRenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormularioRenta.add(this.jLabelConGraficoDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFormularioRenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFormularioRenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFormularioRenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFormularioRenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormularioRenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormularioRenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRenta.add(this.jCheckBoxConGraficoDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFormularioRenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFormularioRenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormularioRenta.add(this.jLabelColumnaCategoriaGraficoFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFormularioRenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormularioRenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFormularioRenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFormularioRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormularioRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormularioRenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFormularioRenta.add(this.jComboBoxColumnaCategoriaGraficoFormularioRenta, this.gridBagConstraintsFormularioRenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFormularioRenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorFormularioRenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRenta.add(this.jLabelColumnaCategoriaValorFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFormularioRenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFormularioRenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFormularioRenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFormularioRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormularioRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormularioRenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFormularioRenta.add(this.jComboBoxColumnaCategoriaValorFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFormularioRenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoFormularioRenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRenta.add(this.jLabelColumnasValoresGraficoFormularioRenta, this.gridBagConstraintsFormularioRenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFormularioRenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoFormularioRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFormularioRenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFormularioRenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormularioRenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormularioRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFormularioRenta=new JScrollPane(this.jListColumnasValoresGraficoFormularioRenta);
			
			this.jScrollColumnasValoresGraficoFormularioRenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormularioRenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormularioRenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFormularioRenta.add(this.jListColumnasSelectReporteFormularioRenta, this.gridBagConstraintsFormularioRenta);
		this.jPanelReporteDinamicoFormularioRenta.add(this.jScrollColumnasValoresGraficoFormularioRenta, this.gridBagConstraintsFormularioRenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFormularioRenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFormularioRenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRenta.add(this.jLabelTiposGraficosReportesDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFormularioRenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormularioRenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFormularioRenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFormularioRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormularioRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormularioRenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRenta.add(this.jComboBoxTiposGraficosReportesDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormularioRenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormularioRenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRenta.add(this.jLabelGenerarExcelReporteDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormularioRenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormularioRenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormularioRenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormularioRenta.setToolTipText("Generar EXCEL"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormularioRenta.add(this.jButtonGenerarExcelReporteDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRenta.add(this.jComboBoxTiposReportesDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormularioRenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormularioRenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRenta.add(this.jLabelTiposArchivoReporteDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRenta.add(this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormularioRenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormularioRenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormularioRenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormularioRenta.setToolTipText("Generar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRenta.add(this.jButtonGenerarReporteDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormularioRenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormularioRenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormularioRenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormularioRenta.setToolTipText("Cancelar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRenta.add(this.jButtonCerrarReporteDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormularioRenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormularioRenta= new JScrollPane(jPanelReporteDinamicoFormularioRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormularioRenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormularioRenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormularioRenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Rentas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormularioRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormularioRenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormularioRenta);
		this.jInternalFrameReporteDinamicoFormularioRenta.getContentPane().add(this.jScrollPanelReporteDinamicoFormularioRenta, this.gridBagConstraintsFormularioRenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormularioRenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormularioRenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormularioRenta.setName("jPanelImportacionFormularioRenta"); 
		
		this.jPanelImportacionFormularioRenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormularioRenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormularioRenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormularioRenta.setLayout(gridaBagLayoutImportacionFormularioRenta);
		
		
		this.jInternalFrameImportacionFormularioRenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormularioRenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormularioRenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormularioRenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormularioRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormularioRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormularioRenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormularioRenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormularioRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormularioRenta.setResizable(true);
	    this.jInternalFrameImportacionFormularioRenta.setClosable(true);
	    this.jInternalFrameImportacionFormularioRenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormularioRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormularioRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormularioRenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormularioRenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormularioRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormularioRenta.setResizable(true);
	    this.jInternalFrameImportacionFormularioRenta.setClosable(true);
	    this.jInternalFrameImportacionFormularioRenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormularioRenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormularioRenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormularioRenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Rentas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormularioRenta = new JLabelMe();

		this.jLabelArchivoImportacionFormularioRenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormularioRenta.add(this.jLabelArchivoImportacionFormularioRenta, this.gridBagConstraintsFormularioRenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormularioRenta = new JFileChooser();		
		this.jFileChooserImportacionFormularioRenta.setToolTipText("ESCOGER ARCHIVO"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormularioRenta = new JButtonMe();
		this.jButtonAbrirImportacionFormularioRenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormularioRenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormularioRenta.setToolTipText("Generar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRenta.add(this.jButtonAbrirImportacionFormularioRenta, this.gridBagConstraintsFormularioRenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormularioRenta = new JLabelMe();

		this.jLabelPathArchivoImportacionFormularioRenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormularioRenta.add(this.jLabelPathArchivoImportacionFormularioRenta, this.gridBagConstraintsFormularioRenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormularioRenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormularioRenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormularioRenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormularioRenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRenta.add(this.jTextFieldPathArchivoImportacionFormularioRenta, this.gridBagConstraintsFormularioRenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormularioRenta = new JButtonMe();
		this.jButtonGenerarImportacionFormularioRenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormularioRenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormularioRenta.setToolTipText("Generar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRenta.add(this.jButtonGenerarImportacionFormularioRenta, this.gridBagConstraintsFormularioRenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormularioRenta = new JButtonMe();
		this.jButtonCerrarImportacionFormularioRenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormularioRenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormularioRenta.setToolTipText("Cancelar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRenta.add(this.jButtonCerrarImportacionFormularioRenta, this.gridBagConstraintsFormularioRenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormularioRenta = new GridBagLayout();
		
		this.jScrollPanelImportacionFormularioRenta= new JScrollPane(jPanelImportacionFormularioRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy =iPosYImportacion;
		this.gridBagConstraintsFormularioRenta.gridx =iPosXImportacion;
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormularioRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormularioRenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormularioRenta);
		this.jInternalFrameImportacionFormularioRenta.getContentPane().add(this.jScrollPanelImportacionFormularioRenta, this.gridBagConstraintsFormularioRenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormularioRenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormularioRenta = new JButtonMe();
			this.jButtonAbrirOrderByFormularioRenta.setText("Orden");
			this.jButtonAbrirOrderByFormularioRenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormularioRenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormularioRenta";
			inputMap = this.jButtonAbrirOrderByFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormularioRenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormularioRenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormularioRenta.setName("jPanelOrderByFormularioRenta"); 
			
			this.jPanelOrderByFormularioRenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormularioRenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormularioRenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormularioRenta.setLayout(gridaBagLayoutOrderByFormularioRenta);
			
			
			this.jTableDatosFormularioRentaOrderBy = new JTableMe();        
			this.jTableDatosFormularioRentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormularioRentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormularioRentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormularioRentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormularioRentaOrderBy.setViewportView(this.jTableDatosFormularioRentaOrderBy);
			this.jTableDatosFormularioRentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormularioRentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormularioRenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormularioRenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormularioRenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormularioRenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormularioRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormularioRenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormularioRenta.setTitle("Orden");
			this.jInternalFrameOrderByFormularioRenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormularioRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormularioRenta.setResizable(true);
			this.jInternalFrameOrderByFormularioRenta.setClosable(true);
			this.jInternalFrameOrderByFormularioRenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormularioRenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormularioRenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormularioRenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Rentas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormularioRenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormularioRenta.ipady =150;
				
			this.jPanelOrderByFormularioRenta.add(jScrollPanelDatosFormularioRentaOrderBy, this.gridBagConstraintsFormularioRenta);//this.jTableDatosFormularioRentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormularioRenta = new JButtonMe();
			this.jButtonCerrarOrderByFormularioRenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormularioRenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormularioRenta.setToolTipText("Cancelar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormularioRenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormularioRenta.add(this.jButtonCerrarOrderByFormularioRenta, this.gridBagConstraintsFormularioRenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormularioRenta = new GridBagLayout();
			
			this.jScrollPanelOrderByFormularioRenta= new JScrollPane(jPanelOrderByFormularioRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormularioRenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormularioRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormularioRenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormularioRenta);
			
			this.jInternalFrameOrderByFormularioRenta.getContentPane().add(this.jScrollPanelOrderByFormularioRenta, this.gridBagConstraintsFormularioRenta);			
		
		} else {
			this.jButtonAbrirOrderByFormularioRenta = new JButtonMe();
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
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formulariorentaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormularioRenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormularioRenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormularioRenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormularioRenta.getRowHeight();//FormularioRentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormularioRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormularioRenta.isSelected()) {
					iHeightTable=FormularioRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormularioRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormularioRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormularioRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormularioRenta.isSelected()) {
					iHeightTable=FormularioRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormularioRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormularioRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormularioRenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormularioRenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormularioRenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormularioRenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormularioRenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormularioRenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormularioRenta!=null && this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy()!=null) {
			//if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormularioRenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormularioRenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormularioRenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFormularioRenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormularioRenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormularioRenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formulariorentaLogic.getFormularioRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formulariorentas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FormularioRenta> TraerFormularioRentaBeans(List<FormularioRenta> formulariorentas,ArrayList<Classe> classes)throws Exception {
		try {
			for(FormularioRenta formulariorenta:formulariorentas) {
					
				if(!(FormularioRentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormularioRentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formulariorenta.setsDetalleGeneralEntityReporte(FormularioRentaConstantesFunciones.getFormularioRentaDescripcion(formulariorenta));
										
						
					
						
					
				} else  {
							
					//formulariorenta.setsDetalleGeneralEntityReporte(formulariorenta.getsDetalleGeneralEntityReporte());
										
				}
				
				//formulariorentabeans.add(formulariorentabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formulariorentas;
    }
	//PARA REPORTES FIN
}
