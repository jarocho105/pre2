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
import com.bydan.erp.contabilidad.util.FormularioIvaConstantesFunciones;

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
public class FormularioIvaJInternalFrame extends FormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFormularioIva;
	
	protected JMenuBar jmenuBarFormularioIva;
	
	protected JMenu jmenuFormularioIva;
	protected JMenu jmenuDatosFormularioIva;
	protected JMenu jmenuArchivoFormularioIva;
	protected JMenu jmenuAccionesFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormularioIva;	
	protected GridBagConstraints gridBagConstraintsFormularioIva;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormularioIvaDetalleFormJInternalFrame jInternalFrameDetalleFormFormularioIva;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormularioIva;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormularioIva;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected DatoFormularioIvaBeanSwingJInternalFrame datoformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_datoformularioiva="";

	protected GrupoParametroFormularioIvaBeanSwingJInternalFrame grupoparametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupoparametroformularioiva="";

	protected ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parametroformularioiva="";
	
	public FormularioIvaSessionBean formularioivaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public DatoFormularioIvaSessionBean datoformularioivaSessionBean;
	public GrupoParametroFormularioIvaSessionBean grupoparametroformularioivaSessionBean;
	public ParametroFormularioIvaSessionBean parametroformularioivaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FormularioIva> formularioivas;		
	public List<FormularioIva> formularioivasEliminados;	
	public List<FormularioIva> formularioivasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFormularioIva;		
	protected JButton jButtonAbrirOrderByFormularioIva;
	
	
	//protected JPanel jPanelOrderByFormularioIva;
	//public JScrollPane jScrollPanelOrderByFormularioIva;	
	//protected JButton jButtonCerrarOrderByFormularioIva;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FormularioIvaLogic formularioivaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralFormularioIva;
    
	
	
	//public JScrollPane jScrollPanelDatosFormularioIvaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormularioIva;
	//public JScrollPane jScrollPanelImportacionFormularioIva;
	
	
	
	protected JPanel jPanelAccionesFormularioIva;
	
    protected JPanel jPanelPaginacionFormularioIva;
    protected JPanel jPanelParametrosReportesFormularioIva;
	protected JPanel jPanelParametrosReportesAccionesFormularioIva;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FormularioIva;
	protected JPanel jPanelParametrosAuxiliar2FormularioIva;
	protected JPanel jPanelParametrosAuxiliar3FormularioIva;
	protected JPanel jPanelParametrosAuxiliar4FormularioIva;
	//protected JPanel jPanelParametrosAuxiliar5FormularioIva;
	
	
	
	//protected JPanel jPanelReporteDinamicoFormularioIva;
	//protected JPanel jPanelImportacionFormularioIva;
	
	
	public JTable jTableDatosFormularioIva;
	
	
	
	//public JTable jTableDatosFormularioIvaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormularioIva;
	protected JButton jButtonDuplicarFormularioIva;
	protected JButton jButtonCopiarFormularioIva;
	protected JButton jButtonVerFormFormularioIva;
	protected JButton jButtonNuevoRelacionesFormularioIva;
	protected JButton jButtonModificarFormularioIva;
	
    protected JButton jButtonGuardarCambiosTablaFormularioIva;
	protected JButton jButtonCerrarFormularioIva;
	
	
	protected JButton jButtonRecargarInformacionFormularioIva;
	protected JButton jButtonProcesarInformacionFormularioIva;
	
	
	protected JButton jButtonAnterioresFormularioIva;
	protected JButton jButtonSiguientesFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosFormularioIva;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFormularioIva;
	//protected JButton jButtonCerrarReporteDinamicoFormularioIva;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormularioIva;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormularioIva;
	//protected JButton jButtonGenerarImportacionFormularioIva;
	//protected JButton jButtonCerrarImportacionFormularioIva;
	//protected JFileChooser jFileChooserImportacionFormularioIva;
	//protected File fileImportacionFormularioIva;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormularioIva;
	protected JButton jButtonDuplicarToolBarFormularioIva;
	protected JButton jButtonNuevoRelacionesToolBarFormularioIva;
	
	
	public JButton jButtonGuardarCambiosToolBarFormularioIva;
	protected JButton jButtonCopiarToolBarFormularioIva;
	protected JButton jButtonVerFormToolBarFormularioIva;
	public JButton jButtonGuardarCambiosTablaToolBarFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarFormularioIva;
	protected JButton jButtonCerrarToolBarFormularioIva;
	
	protected JButton jButtonRecargarInformacionToolBarFormularioIva;
	protected JButton jButtonProcesarInformacionToolBarFormularioIva;
	protected JButton jButtonAnterioresToolBarFormularioIva;
	protected JButton jButtonSiguientesToolBarFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormularioIva;
	protected JButton jButtonAbrirOrderByToolBarFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormularioIva;
	protected JMenuItem jMenuItemDuplicarFormularioIva;
	protected JMenuItem jMenuItemNuevoRelacionesFormularioIva;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormularioIva;
	protected JMenuItem jMenuItemCopiarFormularioIva;
	protected JMenuItem jMenuItemVerFormFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormularioIva;
	protected JMenuItem jMenuItemCerrarFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarFormularioIva;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormularioIva;
	
	protected JMenuItem jMenuItemRecargarInformacionFormularioIva;
	protected JMenuItem jMenuItemProcesarInformacionFormularioIva;
	protected JMenuItem jMenuItemAnterioresFormularioIva;
	protected JMenuItem jMenuItemSiguientesFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormularioIva;
	protected JMenuItem jMenuItemAbrirOrderByFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormularioIva;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormularioIva;
	protected JCheckBox jCheckBoxSeleccionadosFormularioIva;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormularioIva;
	protected JCheckBox jCheckBoxConGraficoReporteFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormularioIva;
	protected JTextField jTextFieldValorCampoGeneralFormularioIva;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFormularioIva;
	//public JList<Reporte> jListColumnasSelectReporteFormularioIva;
	//public JScrollPane jScrollColumnasSelectReporteFormularioIva;
	
	//public JLabel jLabelRelacionesSelectReporteFormularioIva;
	//public JList<Reporte> jListRelacionesSelectReporteFormularioIva;
	//public JScrollPane jScrollRelacionesSelectReporteFormularioIva;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormularioIva;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormularioIva;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormularioIva;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormularioIva;
	
		
	//public JLabel jLabelArchivoImportacionFormularioIva;	
	//public JLabel jLabelPathArchivoImportacionFormularioIva;
	//protected JTextField jTextFieldPathArchivoImportacionFormularioIva;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormularioIva;
	
	//public JLabel jLabelColumnaCategoriaValorFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormularioIva;
	
	//public JLabel jLabelColumnasValoresGraficoFormularioIva;
	//public JList<Reporte> jListColumnasValoresGraficoFormularioIva;
	//public JScrollPane jScrollColumnasValoresGraficoFormularioIva;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormularioIva;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormularioIva;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFormularioIva;
	public JPanel jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva;
	public JButton jButtonBusquedaPorDatoFormularioPorGrupoFormularioIva;
	public JPanel jPanelFK_IdDatoFormularioIvaFormularioIva;
	public JButton jButtonFK_IdDatoFormularioIvaFormularioIva;
	public JPanel jPanelFK_IdGrupoParametroFormularioIvaFormularioIva;
	public JButton jButtonFK_IdGrupoParametroFormularioIvaFormularioIva;
	public JPanel jPanelFK_IdParametroFormularioIvaFormularioIva;
	public JButton jButtonFK_IdParametroFormularioIvaFormularioIva;
	
	public JPanel jPanelid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva;
	public JLabel jLabelid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva;
	public JButton jButtonid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva= new JButtonMe();
	public JButton jButtonid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva;
	public JLabel jLabelid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva;
	public JButton jButtonid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva= new JButtonMe();
	public JButton jButtonid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva;
	public JLabel jLabelid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva;
	public JButton jButtonid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva= new JButtonMe();
	public JButton jButtonid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva;
	public JLabel jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva;
	public JButton jButtonid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva= new JButtonMe();
	public JButton jButtonid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva;
	public JLabel jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva;
	public JButton jButtonid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva= new JButtonMe();
	public JButton jButtonid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIvaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FormularioIvaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioIvaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioIvaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioIvaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormularioIva)	{
		this.jButtonRecargarInformacionFormularioIva = jButtonRecargarInformacionFormularioIva;
	}
	
	public JButton getjButtonProcesarInformacionFormularioIva() {
		return this.jButtonProcesarInformacionFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormularioIva)	{
		this.jButtonProcesarInformacionFormularioIva = jButtonProcesarInformacionFormularioIva;
	}
	
	
	public JButton getjButtonRecargarInformacionFormularioIva() {
		return this.jButtonRecargarInformacionFormularioIva;
	}
	
	
	public List<FormularioIva> getformularioivas() {
		return this.formularioivas;
	}

	public void setformularioivas(List<FormularioIva> formularioivas) {
		this.formularioivas = formularioivas;
	}
	
	public List<FormularioIva> getformularioivasAux() {
		return this.formularioivasAux;
	}

	public void setformularioivasAux(List<FormularioIva> formularioivasAux) {
		this.formularioivasAux = formularioivasAux;
	}
	
	public List<FormularioIva> getformularioivasEliminados() {
		return this.formularioivasEliminados;
	}

	public void setFormularioIvasEliminados(List<FormularioIva> formularioivasEliminados) {
		this.formularioivasEliminados = formularioivasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormularioIva() {
		return jComboBoxTiposSeleccionarFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormularioIva(
			JComboBox jComboBoxTiposSeleccionarFormularioIva) {
		this.jComboBoxTiposSeleccionarFormularioIva = jComboBoxTiposSeleccionarFormularioIva;
	}
	
	public void setBorderResaltarTiposSeleccionarFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormularioIva .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormularioIva() {
		return jTextFieldValorCampoGeneralFormularioIva;
	}

	public void setjTextFieldValorCampoGeneralFormularioIva(
			JTextField jTextFieldValorCampoGeneralFormularioIva) {
		this.jTextFieldValorCampoGeneralFormularioIva = jTextFieldValorCampoGeneralFormularioIva;
	}

	public void setBorderResaltarValorCampoGeneralFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioIva.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormularioIva .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormularioIva() {
		return this.jCheckBoxSeleccionarTodosFormularioIva;
	}

	public void setjCheckBoxSeleccionarTodosFormularioIva(
			JCheckBox jCheckBoxSeleccionarTodosFormularioIva) {
		this.jCheckBoxSeleccionarTodosFormularioIva = jCheckBoxSeleccionarTodosFormularioIva;
	}

	public void setBorderResaltarSeleccionarTodosFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFormularioIva .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormularioIva() {
		return this.jCheckBoxSeleccionadosFormularioIva;
	}

	public void setjCheckBoxSeleccionadosFormularioIva(
			JCheckBox jCheckBoxSeleccionadosFormularioIva) {
		this.jCheckBoxSeleccionadosFormularioIva = jCheckBoxSeleccionadosFormularioIva;
	}
	
	public void setBorderResaltarSeleccionadosFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFormularioIva .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormularioIva() {
		return this.jComboBoxTiposArchivosReportesFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormularioIva(
			JComboBox jComboBoxTiposArchivosReportesFormularioIva) {
		this.jComboBoxTiposArchivosReportesFormularioIva = jComboBoxTiposArchivosReportesFormularioIva;
	}

	public void setBorderResaltarTiposArchivosReportesFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormularioIva() {
		return this.jComboBoxTiposReportesFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormularioIva(
			JComboBox jComboBoxTiposReportesFormularioIva) {
		this.jComboBoxTiposReportesFormularioIva = jComboBoxTiposReportesFormularioIva;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormularioIva() {
	//	return jComboBoxTiposReportesDinamicoFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormularioIva(
	//		JComboBox jComboBoxTiposReportesDinamicoFormularioIva) {
	//	this.jComboBoxTiposReportesDinamicoFormularioIva = jComboBoxTiposReportesDinamicoFormularioIva;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormularioIva() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormularioIva(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormularioIva) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormularioIva = jComboBoxTiposArchivosReportesDinamicoFormularioIva;
	//}
	
	public void setBorderResaltarTiposReportesFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormularioIva() {
		return this.jComboBoxTiposGraficosReportesFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormularioIva(
			JComboBox jComboBoxTiposGraficosReportesFormularioIva) {
		this.jComboBoxTiposGraficosReportesFormularioIva = jComboBoxTiposGraficosReportesFormularioIva;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormularioIva() {
		return this.jComboBoxTiposPaginacionFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormularioIva(
			JComboBox jComboBoxTiposPaginacionFormularioIva) {
		this.jComboBoxTiposPaginacionFormularioIva = jComboBoxTiposPaginacionFormularioIva;
	}
	
	public void setBorderResaltarTiposPaginacionFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormularioIva() {
		return this.jComboBoxTiposRelacionesFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioIva() {
		return this.jComboBoxTiposAccionesFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormularioIva(
			JComboBox jComboBoxTiposRelacionesFormularioIva) {
		this.jComboBoxTiposRelacionesFormularioIva = jComboBoxTiposRelacionesFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioIva(
			JComboBox jComboBoxTiposAccionesFormularioIva) {
		this.jComboBoxTiposAccionesFormularioIva = jComboBoxTiposAccionesFormularioIva;
	}
	
	public void setBorderResaltarTiposRelacionesFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormularioIva .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormularioIva .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormularioIva() {
	//	return jCheckBoxConGraficoDinamicoFormularioIva;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormularioIva(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormularioIva) {
	//	this.jCheckBoxConGraficoDinamicoFormularioIva = jCheckBoxConGraficoDinamicoFormularioIva;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormularioIva() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormularioIva.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormularioIva .setBorder(borderResaltar);		
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
		this.formularioivaSessionBean=new FormularioIvaSessionBean();
		
		this.formularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formularioivaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formulario Iva MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
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
		
		FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFormularioIva= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"nuevo","nuevo","Nuevo"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"duplicar","duplicar","Duplicar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"copiar","copiar","Copiar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"ver_form","ver_form","Ver"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"recargar","recargar","Recargar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormularioIva,this.jTtoolBarFormularioIva,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormularioIva,this.jTtoolBarFormularioIva,
							"cerrar","cerrar","Salir"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormularioIva=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormularioIva;
			
				this.jButtonProcesarInformacionToolBarFormularioIva=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormularioIva;
				
		//protected JButton jButtonModificarToolBarFormularioIva;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFormularioIva=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormularioIva=new JMenuMe("General");
		this.jmenuArchivoFormularioIva=new JMenuMe("Archivo");
		this.jmenuAccionesFormularioIva=new JMenuMe("Acciones");
		this.jmenuDatosFormularioIva=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormularioIva= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormularioIva.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormularioIva,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormularioIva= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormularioIva.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormularioIva,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormularioIva= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormularioIva.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormularioIva,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormularioIva= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormularioIva.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormularioIva,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormularioIva= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormularioIva.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormularioIva,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormularioIva= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormularioIva.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormularioIva,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormularioIva= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormularioIva.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormularioIva,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormularioIva= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormularioIva.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormularioIva,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormularioIva= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormularioIva.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormularioIva,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormularioIva= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormularioIva.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormularioIva,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormularioIva.add(this.jMenuItemCerrarFormularioIva);
			
			this.jmenuAccionesFormularioIva.add(this.jMenuItemNuevoFormularioIva);
			this.jmenuAccionesFormularioIva.add(this.jMenuItemNuevoGuardarCambiosFormularioIva);
			this.jmenuAccionesFormularioIva.add(this.jMenuItemNuevoRelacionesFormularioIva);
			this.jmenuAccionesFormularioIva.add(this.jMenuItemGuardarCambiosTablaFormularioIva);		
			this.jmenuAccionesFormularioIva.add(this.jMenuItemDuplicarFormularioIva);		
			this.jmenuAccionesFormularioIva.add(this.jMenuItemCopiarFormularioIva);		
			this.jmenuAccionesFormularioIva.add(this.jMenuItemVerFormFormularioIva);		
			
			this.jmenuDatosFormularioIva.add(this.jMenuItemRecargarInformacionFormularioIva);				
			this.jmenuDatosFormularioIva.add(this.jMenuItemAnterioresFormularioIva);				
			this.jmenuDatosFormularioIva.add(this.jMenuItemSiguientesFormularioIva);				
			this.jmenuDatosFormularioIva.add(this.jMenuItemAbrirOrderByFormularioIva);				
			this.jmenuDatosFormularioIva.add(this.jMenuItemMostrarOcultarFormularioIva);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormularioIva.add(this.jMenuItemGuardarCambiosFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormularioIva.add(this.jmenuArchivoFormularioIva);		
			this.jmenuBarFormularioIva.add(this.jmenuAccionesFormularioIva);		
			this.jmenuBarFormularioIva.add(this.jmenuDatosFormularioIva);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormularioIva);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFormularioIva() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva.setToolTipText("Buscar Por Dato Formulario Iva Por Grupo Parametro Formulario Iva ");
		this.jButtonBusquedaPorDatoFormularioPorGrupoFormularioIva= new JButtonMe();
		this.jButtonBusquedaPorDatoFormularioPorGrupoFormularioIva.setText("Buscar");
		this.jButtonBusquedaPorDatoFormularioPorGrupoFormularioIva.setToolTipText("Buscar Por Dato Formulario Iva Por Grupo Parametro Formulario Iva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorDatoFormularioPorGrupoFormularioIva,"buscar_button","Buscar Por Dato Formulario Iva Por Grupo Parametro Formulario Iva ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorDatoFormularioPorGrupoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva = new JLabelMe();
		jLabelid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setText("Dato Formulario Iva :");
		jLabelid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setToolTipText("Dato Formulario Iva");
		jLabelid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva= new JComboBoxMe();
		jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva = new JLabelMe();
		jLabelid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setText("Grupo Parametro Formulario Iva :");
		jLabelid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setToolTipText("Grupo Parametro Formulario Iva");
		jLabelid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva= new JComboBoxMe();
		jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDatoFormularioIvaFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDatoFormularioIvaFormularioIva.setToolTipText("Buscar Por Dato Formulario Iva ");
		this.jButtonFK_IdDatoFormularioIvaFormularioIva= new JButtonMe();
		this.jButtonFK_IdDatoFormularioIvaFormularioIva.setText("Buscar");
		this.jButtonFK_IdDatoFormularioIvaFormularioIva.setToolTipText("Buscar Por Dato Formulario Iva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDatoFormularioIvaFormularioIva,"buscar_button","Buscar Por Dato Formulario Iva ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDatoFormularioIvaFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva = new JLabelMe();
		jLabelid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setText("Dato Formulario Iva :");
		jLabelid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setToolTipText("Dato Formulario Iva");
		jLabelid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva= new JComboBoxMe();
		jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdGrupoParametroFormularioIvaFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGrupoParametroFormularioIvaFormularioIva.setToolTipText("Buscar Por Grupo Parametro Formulario Iva ");
		this.jButtonFK_IdGrupoParametroFormularioIvaFormularioIva= new JButtonMe();
		this.jButtonFK_IdGrupoParametroFormularioIvaFormularioIva.setText("Buscar");
		this.jButtonFK_IdGrupoParametroFormularioIvaFormularioIva.setToolTipText("Buscar Por Grupo Parametro Formulario Iva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGrupoParametroFormularioIvaFormularioIva,"buscar_button","Buscar Por Grupo Parametro Formulario Iva ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGrupoParametroFormularioIvaFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva = new JLabelMe();
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setText("Grupo Parametro Formulario Iva :");
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setToolTipText("Grupo Parametro Formulario Iva");
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva= new JComboBoxMe();
		jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdParametroFormularioIvaFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdParametroFormularioIvaFormularioIva.setToolTipText("Buscar Por Parametro Formulario Iva ");
		this.jButtonFK_IdParametroFormularioIvaFormularioIva= new JButtonMe();
		this.jButtonFK_IdParametroFormularioIvaFormularioIva.setText("Buscar");
		this.jButtonFK_IdParametroFormularioIvaFormularioIva.setToolTipText("Buscar Por Parametro Formulario Iva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdParametroFormularioIvaFormularioIva,"buscar_button","Buscar Por Parametro Formulario Iva ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdParametroFormularioIvaFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva = new JLabelMe();
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setText("Parametro Formulario Iva :");
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setToolTipText("Parametro Formulario Iva");
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva= new JComboBoxMe();
		jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormularioIva=new JTabbedPane();


		this.jTabbedPaneBusquedasFormularioIva.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormularioIva.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormularioIva.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFormularioIva = new FormularioIvaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Formulario Iva DATOS");
			this.jInternalFrameDetalleFormFormularioIva = new FormularioIvaDetalleFormJInternalFrame(jDesktopPane,this.formularioivaSessionBean.getConGuardarRelaciones(),this.formularioivaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormularioIva = null;//new FormularioIvaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormularioIva= new GridBagLayout();
		
		
		this.jTableDatosFormularioIva = new JTableMe();      
		
		String sToolTipFormularioIva="";
		sToolTipFormularioIva=FormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormularioIva+="(Contabilidad.FormularioIva)";
		}
		
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormularioIva+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormularioIva.setToolTipText(sToolTipFormularioIva);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormularioIva);
		this.jTableDatosFormularioIva.setAutoCreateRowSorter(true);
		this.jTableDatosFormularioIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormularioIva.setRowSelectionAllowed(true);
		this.jTableDatosFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormularioIva = new JButtonMe();
		this.jButtonDuplicarFormularioIva = new JButtonMe();
		this.jButtonCopiarFormularioIva = new JButtonMe();
		this.jButtonVerFormFormularioIva = new JButtonMe();
		this.jButtonNuevoRelacionesFormularioIva = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormularioIva = new JButtonMe();
		this.jButtonCerrarFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormularioIva = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Formulario Iva";
		
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioIva.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFormularioIva=new ReporteDinamicoJInternalFrame(FormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormularioIva();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormularioIva=new ImportacionJInternalFrame(FormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormularioIva();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFormularioIva = new JButtonMe();
		
		this.jButtonAbrirOrderByFormularioIva.setText("Orden");
		this.jButtonAbrirOrderByFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormularioIva,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioIva,false,this);
			
			//this.cargarOrderByFormularioIva(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioIva,true,this);
			
			//this.cargarOrderByFormularioIva(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormularioIva.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosFormularioIva.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosFormularioIva.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosFormularioIva.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormularioIva.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormularioIva.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormularioIva.setText("Nuevo");
		this.jButtonDuplicarFormularioIva.setText("Duplicar");
		this.jButtonCopiarFormularioIva.setText("Copiar");
		this.jButtonVerFormFormularioIva.setText("Ver");
		this.jButtonNuevoRelacionesFormularioIva.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormularioIva.setText("Guardar");
		this.jButtonCerrarFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormularioIva,"nuevo_button","Nuevo",this.formularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormularioIva,"duplicar_button","Duplicar",this.formularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormularioIva,"copiar_button","Copiar",this.formularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormularioIva,"ver_form","Ver",this.formularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormularioIva,"nuevorelaciones_button","Nuevo Rel",this.formularioivaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormularioIva,"guardarcambiostabla_button","Guardar",this.formularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormularioIva,"cerrar_button","Salir",this.formularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormularioIva.setToolTipText("Nuevo"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormularioIva.setToolTipText("Duplicar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormularioIva.setToolTipText("Copiar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormularioIva.setToolTipText("Ver"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormularioIva.setToolTipText("Nuevo Rel"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormularioIva.setToolTipText("Guardar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormularioIva.setToolTipText("Salir"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormularioIva";
		inputMap = this.jButtonNuevoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormularioIva"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormularioIva";
		inputMap = this.jButtonDuplicarFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormularioIva"));
		
		//COPIAR
		sMapKey = "CopiarFormularioIva";
		inputMap = this.jButtonCopiarFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormularioIva"));
		
		//VEr FORM
		sMapKey = "VerFormFormularioIva";
		inputMap = this.jButtonVerFormFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormularioIva"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormularioIva";
		inputMap = this.jButtonNuevoRelacionesFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormularioIva"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormularioIva";
		inputMap = this.jButtonModificarFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormularioIva"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormularioIva";
		inputMap = this.jButtonCerrarFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormularioIva"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormularioIva.setName("jPanelParametrosReportesFormularioIva"); 
		
		this.jPanelParametrosReportesAccionesFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormularioIva.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormularioIva.setName("jPanelParametrosReportesAccionesFormularioIva"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFormularioIva = new JButtonMe();
		this.jButtonRecargarInformacionFormularioIva.setText("Recargar");
		this.jButtonRecargarInformacionFormularioIva.setToolTipText("Recargar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormularioIva,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFormularioIva = new JButtonMe();
		this.jButtonProcesarInformacionFormularioIva.setText("Procesar");
		this.jButtonProcesarInformacionFormularioIva.setToolTipText("Procesar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormularioIva.setVisible(false);
			
		this.jButtonProcesarInformacionFormularioIva.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormularioIva.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormularioIva.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioIva.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormularioIva.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioIva.setText("TIPO");       
		this.jComboBoxTiposReportesFormularioIva.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioIva.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormularioIva.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormularioIva.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormularioIva.setText("Accion");
		this.jComboBoxTiposRelacionesFormularioIva.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesFormularioIva.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormularioIva.setText("Accion");
		this.jComboBoxTiposSeleccionarFormularioIva.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormularioIva=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormularioIva.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormularioIva.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormularioIva.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFormularioIva = new JLabelMe();
		
		this.jLabelAccionesFormularioIva.setText("Acciones");		
		this.jLabelAccionesFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormularioIva = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormularioIva.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormularioIva.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormularioIva.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormularioIva.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormularioIva.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormularioIva.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormularioIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormularioIva.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormularioIva.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFormularioIva = new JButtonMe();
		//this.jButtonAnterioresFormularioIva.setText("<<");
        this.jButtonAnterioresFormularioIva.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormularioIva,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormularioIva = new JButtonMe();
		//this.jButtonSiguientesFormularioIva.setText(">>");
        this.jButtonSiguientesFormularioIva.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormularioIva,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormularioIva = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormularioIva.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormularioIva.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormularioIva,"nuevoguardarcambios_button","Nue",this.formularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormularioIva";
		inputMap = this.jButtonNuevoGuardarCambiosFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormularioIva"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFormularioIva";
		inputMap = this.jButtonRecargarInformacionFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormularioIva"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormularioIva";
		inputMap = this.jButtonSiguientesFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormularioIva"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormularioIva";
		inputMap = this.jButtonAnterioresFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormularioIva"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFormularioIva();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormularioIva.setMinimumSize(new Dimension(this.getWidth(),FormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormularioIva.setMaximumSize(new Dimension(this.getWidth(),FormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormularioIva.setPreferredSize(new Dimension(this.getWidth(),FormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormularioIva = new GridBagLayout();

			this.jPanelPaginacionFormularioIva.setLayout(gridaBagLayoutPaginacionFormularioIva);						
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = 0;
			this.gridBagConstraintsFormularioIva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormularioIva.add(this.jButtonAnterioresFormularioIva, this.gridBagConstraintsFormularioIva);
					
						
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormularioIva.gridy = 0;
			
			this.jPanelPaginacionFormularioIva.add(this.jButtonNuevoGuardarCambiosFormularioIva, this.gridBagConstraintsFormularioIva);
						
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormularioIva.gridy = 0;
			this.jPanelPaginacionFormularioIva.add(this.jButtonSiguientesFormularioIva, this.gridBagConstraintsFormularioIva);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = 1;
			this.gridBagConstraintsFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioIva.add(this.jButtonNuevoFormularioIva, this.gridBagConstraintsFormularioIva);
						
			
			
			if(!this.formularioivaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormularioIva.gridy = 1;
				this.gridBagConstraintsFormularioIva.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormularioIva.add(this.jButtonGuardarCambiosTablaFormularioIva, this.gridBagConstraintsFormularioIva);
			}
			
			
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = 1;
			this.gridBagConstraintsFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioIva.add(this.jButtonDuplicarFormularioIva, this.gridBagConstraintsFormularioIva);
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = 1;
			this.gridBagConstraintsFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioIva.add(this.jButtonCopiarFormularioIva, this.gridBagConstraintsFormularioIva);
		
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = 1;
			this.gridBagConstraintsFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioIva.add(this.jButtonVerFormFormularioIva, this.gridBagConstraintsFormularioIva);
		
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = 1;
			this.gridBagConstraintsFormularioIva.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormularioIva.add(this.jButtonCerrarFormularioIva, this.gridBagConstraintsFormularioIva);
		
		
		
		this.jButtonRecargarInformacionFormularioIva.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormularioIva.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormularioIva.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFormularioIva.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormularioIva.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormularioIva.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormularioIva.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormularioIva.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormularioIva.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormularioIva.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormularioIva.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormularioIva.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFormularioIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormularioIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormularioIva.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormularioIva.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormularioIva.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormularioIva.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormularioIva = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FormularioIva = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormularioIva.setLayout(gridaBagParametrosReportesFormularioIva);
			this.jPanelParametrosReportesAccionesFormularioIva.setLayout(gridaBagParametrosReportesAccionesFormularioIva);
			
			
			this.jPanelParametrosAuxiliar1FormularioIva.setLayout(gridaBagParametrosAuxiliar1FormularioIva);
			this.jPanelParametrosAuxiliar2FormularioIva.setLayout(gridaBagParametrosAuxiliar2FormularioIva);
			this.jPanelParametrosAuxiliar3FormularioIva.setLayout(gridaBagParametrosAuxiliar3FormularioIva);
			this.jPanelParametrosAuxiliar4FormularioIva.setLayout(gridaBagParametrosAuxiliar4FormularioIva);
			//this.jPanelParametrosAuxiliar5FormularioIva.setLayout(gridaBagParametrosAuxiliar2FormularioIva);			
			
			
			
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioIva.add(this.jButtonRecargarInformacionFormularioIva, this.gridBagConstraintsFormularioIva);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioIva.add(this.jComboBoxTiposPaginacionFormularioIva, this.gridBagConstraintsFormularioIva);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioIva.add(this.jCheckBoxConAltoMaximoTablaFormularioIva, this.gridBagConstraintsFormularioIva);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioIva.add(this.jComboBoxTiposArchivosReportesFormularioIva, this.gridBagConstraintsFormularioIva);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioIva.add(this.jPanelParametrosAuxiliar1FormularioIva, this.gridBagConstraintsFormularioIva);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FormularioIva.add(this.jComboBoxTiposReportesFormularioIva, this.gridBagConstraintsFormularioIva);																		
			
			
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FormularioIva.add(this.jComboBoxTiposGraficosReportesFormularioIva, this.gridBagConstraintsFormularioIva);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioIva.add(this.jPanelParametrosAuxiliar4FormularioIva, this.gridBagConstraintsFormularioIva);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioIva.add(this.jComboBoxTiposReportesFormularioIva, this.gridBagConstraintsFormularioIva);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioIva.add(this.jCheckBoxGenerarReporteFormularioIva, this.gridBagConstraintsFormularioIva);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioIva.add(this.jPanelParametrosAuxiliar2FormularioIva, this.gridBagConstraintsFormularioIva);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioIva.add(this.jLabelAccionesFormularioIva, this.gridBagConstraintsFormularioIva);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormularioIva.add(this.jButtonAbrirOrderByFormularioIva, this.gridBagConstraintsFormularioIva);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioIva.add(this.jComboBoxTiposSeleccionarFormularioIva, this.gridBagConstraintsFormularioIva);			
			
			
			/*
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioIva.add(this.jCheckBoxSeleccionarTodosFormularioIva, this.gridBagConstraintsFormularioIva);
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioIva.add(this.jCheckBoxConGraficoReporteFormularioIva, this.gridBagConstraintsFormularioIva);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormularioIva.add(this.jCheckBoxSeleccionarTodosFormularioIva, this.gridBagConstraintsFormularioIva);															
				
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormularioIva.add(this.jCheckBoxSeleccionadosFormularioIva, this.gridBagConstraintsFormularioIva);															
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormularioIva.add(this.jCheckBoxConGraficoReporteFormularioIva, this.gridBagConstraintsFormularioIva);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioIva.add(this.jPanelParametrosAuxiliar3FormularioIva, this.gridBagConstraintsFormularioIva);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioIva.add(this.jComboBoxTiposAccionesFormularioIva, this.gridBagConstraintsFormularioIva);
	
				
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioIva.add(this.jTextFieldValorCampoGeneralFormularioIva, this.gridBagConstraintsFormularioIva);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormularioIva = new GridBagLayout();

			this.jScrollPanelDatosFormularioIva.setLayout(gridaBagLayoutDatosFormularioIva);
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = 0;
			this.gridBagConstraintsFormularioIva.gridx = 0;
			
			this.jScrollPanelDatosFormularioIva.add(this.jTableDatosFormularioIva, this.gridBagConstraintsFormularioIva);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormularioIva.setViewportView(this.jTableDatosFormularioIva);
		this.jTableDatosFormularioIva.setFillsViewportHeight(true);
		this.jTableDatosFormularioIva.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormularioIva= new GridBagLayout();
		this.jPanelAccionesFormularioIva.setLayout(gridaBagLayoutAccionesFormularioIva);
		
		
		/*	
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 0;
			
		this.jPanelAccionesFormularioIva.add(this.jButtonNuevoFormularioIva, this.gridBagConstraintsFormularioIva);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorDatoFormularioPorGrupoFormularioIva= new GridBagLayout();
		gridaBagLayoutBusquedaPorDatoFormularioPorGrupoFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorDatoFormularioPorGrupoFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorDatoFormularioPorGrupoFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorDatoFormularioPorGrupoFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva.setLayout(gridaBagLayoutBusquedaPorDatoFormularioPorGrupoFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 0;
		gridBagConstraintsFormularioIva.gridx = 0;
		jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva.add(jLabelid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva, gridBagConstraintsFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 0;
		gridBagConstraintsFormularioIva.gridx = 1;
		jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva.add(jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva, gridBagConstraintsFormularioIva);


		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 1;
		gridBagConstraintsFormularioIva.gridx = 0;
		jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva.add(jLabelid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva, gridBagConstraintsFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 1;
		gridBagConstraintsFormularioIva.gridx = 1;
		jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva.add(jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva, gridBagConstraintsFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 2;
		gridBagConstraintsFormularioIva.gridx =1;
		jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva.add(jButtonBusquedaPorDatoFormularioPorGrupoFormularioIva, gridBagConstraintsFormularioIva);

		jTabbedPaneBusquedasFormularioIva.addTab("1.-Por Dato Formulario Iva Por Grupo Parametro Formulario Iva ", jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva);
		jTabbedPaneBusquedasFormularioIva.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDatoFormularioIvaFormularioIva= new GridBagLayout();
		gridaBagLayoutFK_IdDatoFormularioIvaFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDatoFormularioIvaFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDatoFormularioIvaFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDatoFormularioIvaFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDatoFormularioIvaFormularioIva.setLayout(gridaBagLayoutFK_IdDatoFormularioIvaFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 0;
		gridBagConstraintsFormularioIva.gridx = 0;
		jPanelFK_IdDatoFormularioIvaFormularioIva.add(jLabelid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva, gridBagConstraintsFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 0;
		gridBagConstraintsFormularioIva.gridx = 1;
		jPanelFK_IdDatoFormularioIvaFormularioIva.add(jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva, gridBagConstraintsFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 1;
		gridBagConstraintsFormularioIva.gridx =1;
		jPanelFK_IdDatoFormularioIvaFormularioIva.add(jButtonFK_IdDatoFormularioIvaFormularioIva, gridBagConstraintsFormularioIva);

		jTabbedPaneBusquedasFormularioIva.addTab("2.-Por Dato Formulario Iva ", jPanelFK_IdDatoFormularioIvaFormularioIva);
		jTabbedPaneBusquedasFormularioIva.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdGrupoParametroFormularioIvaFormularioIva= new GridBagLayout();
		gridaBagLayoutFK_IdGrupoParametroFormularioIvaFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGrupoParametroFormularioIvaFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGrupoParametroFormularioIvaFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGrupoParametroFormularioIvaFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGrupoParametroFormularioIvaFormularioIva.setLayout(gridaBagLayoutFK_IdGrupoParametroFormularioIvaFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 0;
		gridBagConstraintsFormularioIva.gridx = 0;
		jPanelFK_IdGrupoParametroFormularioIvaFormularioIva.add(jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva, gridBagConstraintsFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 0;
		gridBagConstraintsFormularioIva.gridx = 1;
		jPanelFK_IdGrupoParametroFormularioIvaFormularioIva.add(jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva, gridBagConstraintsFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 1;
		gridBagConstraintsFormularioIva.gridx =1;
		jPanelFK_IdGrupoParametroFormularioIvaFormularioIva.add(jButtonFK_IdGrupoParametroFormularioIvaFormularioIva, gridBagConstraintsFormularioIva);

		jTabbedPaneBusquedasFormularioIva.addTab("3.-Por Grupo Parametro Formulario Iva ", jPanelFK_IdGrupoParametroFormularioIvaFormularioIva);
		jTabbedPaneBusquedasFormularioIva.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdParametroFormularioIvaFormularioIva= new GridBagLayout();
		gridaBagLayoutFK_IdParametroFormularioIvaFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdParametroFormularioIvaFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdParametroFormularioIvaFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdParametroFormularioIvaFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdParametroFormularioIvaFormularioIva.setLayout(gridaBagLayoutFK_IdParametroFormularioIvaFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 0;
		gridBagConstraintsFormularioIva.gridx = 0;
		jPanelFK_IdParametroFormularioIvaFormularioIva.add(jLabelid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva, gridBagConstraintsFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 0;
		gridBagConstraintsFormularioIva.gridx = 1;
		jPanelFK_IdParametroFormularioIvaFormularioIva.add(jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva, gridBagConstraintsFormularioIva);

		gridBagConstraintsFormularioIva = new GridBagConstraints();
		gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioIva.gridy = 1;
		gridBagConstraintsFormularioIva.gridx =1;
		jPanelFK_IdParametroFormularioIvaFormularioIva.add(jButtonFK_IdParametroFormularioIvaFormularioIva, gridBagConstraintsFormularioIva);

		jTabbedPaneBusquedasFormularioIva.addTab("4.-Por Parametro Formulario Iva ", jPanelFK_IdParametroFormularioIvaFormularioIva);
		jTabbedPaneBusquedasFormularioIva.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormularioIva);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioIva.gridx = 0;		
			//this.gridBagConstraintsFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormularioIva.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormularioIva, this.gridBagConstraintsFormularioIva);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormularioIva.gridx = 0;		
		//this.gridBagConstraintsFormularioIva.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormularioIva.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormularioIva);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioIva.gridx = 0;		
			this.gridBagConstraintsFormularioIva.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormularioIva.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFormularioIva, this.gridBagConstraintsFormularioIva);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioIva.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFormularioIva, this.gridBagConstraintsFormularioIva);								
		
		
		/*
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormularioIva, this.gridBagConstraintsFormularioIva);
		*/		
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormularioIva.gridx =0;
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormularioIva, this.gridBagConstraintsFormularioIva);
				
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormularioIva, this.gridBagConstraintsFormularioIva);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormularioIva = new GridBagLayout();
			this.jPanelBusquedasParametrosFormularioIva.setLayout(gridaBagLayoutBusquedasParametrosFormularioIva);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormularioIva, this.gridBagConstraintsFormularioIva);
			
			
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormularioIva, this.gridBagConstraintsFormularioIva);
		
			
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormularioIva, this.gridBagConstraintsFormularioIva);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormularioIva;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormularioIva() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormularioIva.setName("jPanelReporteDinamicoFormularioIva"); 
		
		this.jPanelReporteDinamicoFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormularioIva.setLayout(gridaBagLayoutReporteDinamicoFormularioIva);
		
		
		this.jInternalFrameReporteDinamicoFormularioIva= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormularioIva.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormularioIva.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormularioIva.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormularioIva.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Ivas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormularioIva = new JLabelMe();

		this.jLabelColumnasSelectReporteFormularioIva.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormularioIva.add(this.jLabelColumnasSelectReporteFormularioIva, this.gridBagConstraintsFormularioIva);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormularioIva = new JList<Reporte>();
		this.jListColumnasSelectReporteFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormularioIva=new JScrollPane(this.jListColumnasSelectReporteFormularioIva);
			
			this.jScrollColumnasSelectReporteFormularioIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormularioIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormularioIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormularioIva.add(this.jListColumnasSelectReporteFormularioIva, this.gridBagConstraintsFormularioIva);
		this.jPanelReporteDinamicoFormularioIva.add(this.jScrollColumnasSelectReporteFormularioIva, this.gridBagConstraintsFormularioIva);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormularioIva = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormularioIva.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormularioIva = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormularioIva=new JScrollPane(this.jListRelacionesSelectReporteFormularioIva);
			
			this.jScrollRelacionesSelectReporteFormularioIva.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormularioIva.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormularioIva.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFormularioIva = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormularioIva = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormularioIva = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormularioIva.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFormularioIva = new JLabelMe();

		this.jLabelConGraficoDinamicoFormularioIva.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormularioIva.add(this.jLabelConGraficoDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFormularioIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFormularioIva.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFormularioIva.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFormularioIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormularioIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormularioIva.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioIva.add(this.jCheckBoxConGraficoDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFormularioIva = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFormularioIva.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormularioIva.add(this.jLabelColumnaCategoriaGraficoFormularioIva, this.gridBagConstraintsFormularioIva);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFormularioIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormularioIva.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFormularioIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormularioIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFormularioIva.add(this.jComboBoxColumnaCategoriaGraficoFormularioIva, this.gridBagConstraintsFormularioIva);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFormularioIva = new JLabelMe();

		this.jLabelColumnaCategoriaValorFormularioIva.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioIva.add(this.jLabelColumnaCategoriaValorFormularioIva, this.gridBagConstraintsFormularioIva);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFormularioIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFormularioIva.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFormularioIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormularioIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFormularioIva.add(this.jComboBoxColumnaCategoriaValorFormularioIva, this.gridBagConstraintsFormularioIva);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFormularioIva = new JLabelMe();

		this.jLabelColumnasValoresGraficoFormularioIva.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioIva.add(this.jLabelColumnasValoresGraficoFormularioIva, this.gridBagConstraintsFormularioIva);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFormularioIva = new JList<Reporte>();
		this.jListColumnasValoresGraficoFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFormularioIva.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFormularioIva=new JScrollPane(this.jListColumnasValoresGraficoFormularioIva);
			
			this.jScrollColumnasValoresGraficoFormularioIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormularioIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormularioIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFormularioIva.add(this.jListColumnasSelectReporteFormularioIva, this.gridBagConstraintsFormularioIva);
		this.jPanelReporteDinamicoFormularioIva.add(this.jScrollColumnasValoresGraficoFormularioIva, this.gridBagConstraintsFormularioIva);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFormularioIva = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFormularioIva.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioIva.add(this.jLabelTiposGraficosReportesDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFormularioIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormularioIva.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFormularioIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormularioIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioIva.add(this.jComboBoxTiposGraficosReportesDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormularioIva = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormularioIva.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioIva.add(this.jLabelGenerarExcelReporteDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormularioIva = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormularioIva.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormularioIva,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormularioIva.setToolTipText("Generar EXCEL"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormularioIva.add(this.jButtonGenerarExcelReporteDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioIva.add(this.jComboBoxTiposReportesDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormularioIva = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormularioIva.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioIva.add(this.jLabelTiposArchivoReporteDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioIva.add(this.jComboBoxTiposArchivosReportesDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormularioIva = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormularioIva.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormularioIva,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormularioIva.setToolTipText("Generar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioIva.add(this.jButtonGenerarReporteDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormularioIva = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormularioIva.setToolTipText("Cancelar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioIva.add(this.jButtonCerrarReporteDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormularioIva = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormularioIva= new JScrollPane(jPanelReporteDinamicoFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Ivas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormularioIva.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormularioIva.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormularioIva);
		this.jInternalFrameReporteDinamicoFormularioIva.getContentPane().add(this.jScrollPanelReporteDinamicoFormularioIva, this.gridBagConstraintsFormularioIva);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormularioIva() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormularioIva.setName("jPanelImportacionFormularioIva"); 
		
		this.jPanelImportacionFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormularioIva.setLayout(gridaBagLayoutImportacionFormularioIva);
		
		
		this.jInternalFrameImportacionFormularioIva= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormularioIva= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionFormularioIva.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormularioIva.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionFormularioIva.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Ivas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormularioIva = new JLabelMe();

		this.jLabelArchivoImportacionFormularioIva.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormularioIva.add(this.jLabelArchivoImportacionFormularioIva, this.gridBagConstraintsFormularioIva);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormularioIva = new JFileChooser();		
		this.jFileChooserImportacionFormularioIva.setToolTipText("ESCOGER ARCHIVO"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormularioIva = new JButtonMe();
		this.jButtonAbrirImportacionFormularioIva.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormularioIva,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormularioIva.setToolTipText("Generar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioIva.add(this.jButtonAbrirImportacionFormularioIva, this.gridBagConstraintsFormularioIva);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormularioIva = new JLabelMe();

		this.jLabelPathArchivoImportacionFormularioIva.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormularioIva.add(this.jLabelPathArchivoImportacionFormularioIva, this.gridBagConstraintsFormularioIva);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormularioIva=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormularioIva.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormularioIva.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormularioIva.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioIva.add(this.jTextFieldPathArchivoImportacionFormularioIva, this.gridBagConstraintsFormularioIva);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormularioIva = new JButtonMe();
		this.jButtonGenerarImportacionFormularioIva.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormularioIva,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormularioIva.setToolTipText("Generar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioIva.add(this.jButtonGenerarImportacionFormularioIva, this.gridBagConstraintsFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormularioIva = new JButtonMe();
		this.jButtonCerrarImportacionFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormularioIva.setToolTipText("Cancelar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioIva.add(this.jButtonCerrarImportacionFormularioIva, this.gridBagConstraintsFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormularioIva = new GridBagLayout();
		
		this.jScrollPanelImportacionFormularioIva= new JScrollPane(jPanelImportacionFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy =iPosYImportacion;
		this.gridBagConstraintsFormularioIva.gridx =iPosXImportacion;
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormularioIva.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormularioIva);
		this.jInternalFrameImportacionFormularioIva.getContentPane().add(this.jScrollPanelImportacionFormularioIva, this.gridBagConstraintsFormularioIva);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormularioIva(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormularioIva = new JButtonMe();
			this.jButtonAbrirOrderByFormularioIva.setText("Orden");
			this.jButtonAbrirOrderByFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormularioIva,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormularioIva";
			inputMap = this.jButtonAbrirOrderByFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormularioIva"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormularioIva = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormularioIva.setName("jPanelOrderByFormularioIva"); 
			
			this.jPanelOrderByFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormularioIva.setLayout(gridaBagLayoutOrderByFormularioIva);
			
			
			this.jTableDatosFormularioIvaOrderBy = new JTableMe();        
			this.jTableDatosFormularioIvaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormularioIvaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormularioIvaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormularioIvaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormularioIvaOrderBy.setViewportView(this.jTableDatosFormularioIvaOrderBy);
			this.jTableDatosFormularioIvaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormularioIvaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormularioIva= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormularioIva= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormularioIva = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormularioIva= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormularioIva.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormularioIva.setTitle("Orden");
			this.jInternalFrameOrderByFormularioIva.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormularioIva.setResizable(true);
			this.jInternalFrameOrderByFormularioIva.setClosable(true);
			this.jInternalFrameOrderByFormularioIva.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Ivas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormularioIva.ipady =150;
				
			this.jPanelOrderByFormularioIva.add(jScrollPanelDatosFormularioIvaOrderBy, this.gridBagConstraintsFormularioIva);//this.jTableDatosFormularioIvaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormularioIva = new JButtonMe();
			this.jButtonCerrarOrderByFormularioIva.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormularioIva,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormularioIva.setToolTipText("Cancelar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormularioIva.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormularioIva.add(this.jButtonCerrarOrderByFormularioIva, this.gridBagConstraintsFormularioIva);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormularioIva = new GridBagLayout();
			
			this.jScrollPanelOrderByFormularioIva= new JScrollPane(jPanelOrderByFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormularioIva.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormularioIva);
			
			this.jInternalFrameOrderByFormularioIva.getContentPane().add(this.jScrollPanelOrderByFormularioIva, this.gridBagConstraintsFormularioIva);			
		
		} else {
			this.jButtonAbrirOrderByFormularioIva = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formularioivaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormularioIva.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormularioIva.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormularioIva.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormularioIva.getRowHeight();//FormularioIvaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormularioIva.isSelected()) {
					iHeightTable=FormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormularioIva.isSelected()) {
					iHeightTable=FormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormularioIva.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormularioIva.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormularioIva.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormularioIva!=null && this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy()!=null) {
			//if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormularioIva.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormularioIva.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormularioIva.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formularioivaLogic.getFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formularioivas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FormularioIva> TraerFormularioIvaBeans(List<FormularioIva> formularioivas,ArrayList<Classe> classes)throws Exception {
		try {
			for(FormularioIva formularioiva:formularioivas) {
					
				if(!(FormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formularioiva.setsDetalleGeneralEntityReporte(FormularioIvaConstantesFunciones.getFormularioIvaDescripcion(formularioiva));
										
						
					
						
					
				} else  {
							
					//formularioiva.setsDetalleGeneralEntityReporte(formularioiva.getsDetalleGeneralEntityReporte());
										
				}
				
				//formularioivabeans.add(formularioivabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formularioivas;
    }
	//PARA REPORTES FIN
}
