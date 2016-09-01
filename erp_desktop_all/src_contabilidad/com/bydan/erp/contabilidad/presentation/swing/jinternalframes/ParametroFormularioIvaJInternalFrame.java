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
import com.bydan.erp.contabilidad.util.ParametroFormularioIvaConstantesFunciones;

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
public class ParametroFormularioIvaJInternalFrame extends ParametroFormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroFormularioIva;
	
	protected JMenuBar jmenuBarParametroFormularioIva;
	
	protected JMenu jmenuParametroFormularioIva;
	protected JMenu jmenuDatosParametroFormularioIva;
	protected JMenu jmenuArchivoParametroFormularioIva;
	protected JMenu jmenuAccionesParametroFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFormularioIva;	
	protected GridBagConstraints gridBagConstraintsParametroFormularioIva;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroFormularioIvaDetalleFormJInternalFrame jInternalFrameDetalleFormParametroFormularioIva;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroFormularioIva;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroFormularioIva;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoParametroFormularioIvaBeanSwingJInternalFrame tipoparametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparametroformularioiva="";

	protected GrupoParametroFormularioIvaBeanSwingJInternalFrame grupoparametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupoparametroformularioiva="";

	protected SubGrupoParametroFormularioIvaBeanSwingJInternalFrame subgrupoparametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subgrupoparametroformularioiva="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontable1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable1="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontable2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontable3BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable3="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontable4BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable4="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontable5BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable5="";
	
	public ParametroFormularioIvaSessionBean parametroformularioivaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoParametroFormularioIvaSessionBean tipoparametroformularioivaSessionBean;
	public GrupoParametroFormularioIvaSessionBean grupoparametroformularioivaSessionBean;
	public SubGrupoParametroFormularioIvaSessionBean subgrupoparametroformularioivaSessionBean;
	public CuentaContableSessionBean cuentacontable1SessionBean;
	public CuentaContableSessionBean cuentacontable2SessionBean;
	public CuentaContableSessionBean cuentacontable3SessionBean;
	public CuentaContableSessionBean cuentacontable4SessionBean;
	public CuentaContableSessionBean cuentacontable5SessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroFormularioIva> parametroformularioivas;		
	public List<ParametroFormularioIva> parametroformularioivasEliminados;	
	public List<ParametroFormularioIva> parametroformularioivasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroFormularioIva;		
	protected JButton jButtonAbrirOrderByParametroFormularioIva;
	
	
	//protected JPanel jPanelOrderByParametroFormularioIva;
	//public JScrollPane jScrollPanelOrderByParametroFormularioIva;	
	//protected JButton jButtonCerrarOrderByParametroFormularioIva;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroFormularioIvaLogic parametroformularioivaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionParametroFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralParametroFormularioIva;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroFormularioIvaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroFormularioIva;
	//public JScrollPane jScrollPanelImportacionParametroFormularioIva;
	
	
	
	protected JPanel jPanelAccionesParametroFormularioIva;
	
    protected JPanel jPanelPaginacionParametroFormularioIva;
    protected JPanel jPanelParametrosReportesParametroFormularioIva;
	protected JPanel jPanelParametrosReportesAccionesParametroFormularioIva;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralParametroFormularioIva;
	protected Integer iXPanelCamposIniciogeneralParametroFormularioIva=0;
	protected Integer iYPanelCamposIniciogeneralParametroFormularioIva=0;

	protected JPanel jPanelCamposIniciocuenta_contableParametroFormularioIva;
	protected Integer iXPanelCamposIniciocuenta_contableParametroFormularioIva=0;
	protected Integer iYPanelCamposIniciocuenta_contableParametroFormularioIva=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar2ParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar3ParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar4ParametroFormularioIva;
	//protected JPanel jPanelParametrosAuxiliar5ParametroFormularioIva;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroFormularioIva;
	//protected JPanel jPanelImportacionParametroFormularioIva;
	
	
	public JTable jTableDatosParametroFormularioIva;
	
	
	
	//public JTable jTableDatosParametroFormularioIvaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroFormularioIva;
	protected JButton jButtonDuplicarParametroFormularioIva;
	protected JButton jButtonCopiarParametroFormularioIva;
	protected JButton jButtonVerFormParametroFormularioIva;
	protected JButton jButtonNuevoRelacionesParametroFormularioIva;
	protected JButton jButtonModificarParametroFormularioIva;
	
    protected JButton jButtonGuardarCambiosTablaParametroFormularioIva;
	protected JButton jButtonCerrarParametroFormularioIva;
	
	
	protected JButton jButtonRecargarInformacionParametroFormularioIva;
	protected JButton jButtonProcesarInformacionParametroFormularioIva;
	
	
	protected JButton jButtonAnterioresParametroFormularioIva;
	protected JButton jButtonSiguientesParametroFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosParametroFormularioIva;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroFormularioIva;
	//protected JButton jButtonCerrarReporteDinamicoParametroFormularioIva;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroFormularioIva;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroFormularioIva;
	//protected JButton jButtonGenerarImportacionParametroFormularioIva;
	//protected JButton jButtonCerrarImportacionParametroFormularioIva;
	//protected JFileChooser jFileChooserImportacionParametroFormularioIva;
	//protected File fileImportacionParametroFormularioIva;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFormularioIva;
	protected JButton jButtonDuplicarToolBarParametroFormularioIva;
	protected JButton jButtonNuevoRelacionesToolBarParametroFormularioIva;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroFormularioIva;
	protected JButton jButtonCopiarToolBarParametroFormularioIva;
	protected JButton jButtonVerFormToolBarParametroFormularioIva;
	public JButton jButtonGuardarCambiosTablaToolBarParametroFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFormularioIva;
	protected JButton jButtonCerrarToolBarParametroFormularioIva;
	
	protected JButton jButtonRecargarInformacionToolBarParametroFormularioIva;
	protected JButton jButtonProcesarInformacionToolBarParametroFormularioIva;
	protected JButton jButtonAnterioresToolBarParametroFormularioIva;
	protected JButton jButtonSiguientesToolBarParametroFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroFormularioIva;
	protected JButton jButtonAbrirOrderByToolBarParametroFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFormularioIva;
	protected JMenuItem jMenuItemDuplicarParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoRelacionesParametroFormularioIva;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroFormularioIva;
	protected JMenuItem jMenuItemCopiarParametroFormularioIva;
	protected JMenuItem jMenuItemVerFormParametroFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFormularioIva;
	protected JMenuItem jMenuItemCerrarParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFormularioIva;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroFormularioIva;
	protected JMenuItem jMenuItemProcesarInformacionParametroFormularioIva;
	protected JMenuItem jMenuItemAnterioresParametroFormularioIva;
	protected JMenuItem jMenuItemSiguientesParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFormularioIva;
	protected JMenuItem jMenuItemAbrirOrderByParametroFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarParametroFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFormularioIva;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroFormularioIva;
	protected JCheckBox jCheckBoxSeleccionadosParametroFormularioIva;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroFormularioIva;
	protected JCheckBox jCheckBoxConGraficoReporteParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroFormularioIva;
	protected JTextField jTextFieldValorCampoGeneralParametroFormularioIva;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroFormularioIva;
	//public JList<Reporte> jListColumnasSelectReporteParametroFormularioIva;
	//public JScrollPane jScrollColumnasSelectReporteParametroFormularioIva;
	
	//public JLabel jLabelRelacionesSelectReporteParametroFormularioIva;
	//public JList<Reporte> jListRelacionesSelectReporteParametroFormularioIva;
	//public JScrollPane jScrollRelacionesSelectReporteParametroFormularioIva;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroFormularioIva;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroFormularioIva;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroFormularioIva;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroFormularioIva;
	
		
	//public JLabel jLabelArchivoImportacionParametroFormularioIva;	
	//public JLabel jLabelPathArchivoImportacionParametroFormularioIva;
	//protected JTextField jTextFieldPathArchivoImportacionParametroFormularioIva;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroFormularioIva;
	
	//public JLabel jLabelColumnaCategoriaValorParametroFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroFormularioIva;
	
	//public JLabel jLabelColumnasValoresGraficoParametroFormularioIva;
	//public JList<Reporte> jListColumnasValoresGraficoParametroFormularioIva;
	//public JScrollPane jScrollColumnasValoresGraficoParametroFormularioIva;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroFormularioIva;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroFormularioIva;
	public JPanel jPanelFK_IdGrupoParametroFormularioIvaParametroFormularioIva;
	public JButton jButtonFK_IdGrupoParametroFormularioIvaParametroFormularioIva;
	public JPanel jPanelFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva;
	public JButton jButtonFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva;
	public JPanel jPanelFK_IdTipoParametroFormularioIvaParametroFormularioIva;
	public JButton jButtonFK_IdTipoParametroFormularioIvaParametroFormularioIva;
	
	public JPanel jPanelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva;
	public JLabel jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva;
	public JButton jButtonid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva;
	public JLabel jLabelid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva;
	public JButton jButtonid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva;
	public JLabel jLabelid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva;
	public JButton jButtonid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIvaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroFormularioIvaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFormularioIvaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFormularioIvaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFormularioIvaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroFormularioIva)	{
		this.jButtonRecargarInformacionParametroFormularioIva = jButtonRecargarInformacionParametroFormularioIva;
	}
	
	public JButton getjButtonProcesarInformacionParametroFormularioIva() {
		return this.jButtonProcesarInformacionParametroFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFormularioIva)	{
		this.jButtonProcesarInformacionParametroFormularioIva = jButtonProcesarInformacionParametroFormularioIva;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroFormularioIva() {
		return this.jButtonRecargarInformacionParametroFormularioIva;
	}
	
	
	public List<ParametroFormularioIva> getparametroformularioivas() {
		return this.parametroformularioivas;
	}

	public void setparametroformularioivas(List<ParametroFormularioIva> parametroformularioivas) {
		this.parametroformularioivas = parametroformularioivas;
	}
	
	public List<ParametroFormularioIva> getparametroformularioivasAux() {
		return this.parametroformularioivasAux;
	}

	public void setparametroformularioivasAux(List<ParametroFormularioIva> parametroformularioivasAux) {
		this.parametroformularioivasAux = parametroformularioivasAux;
	}
	
	public List<ParametroFormularioIva> getparametroformularioivasEliminados() {
		return this.parametroformularioivasEliminados;
	}

	public void setParametroFormularioIvasEliminados(List<ParametroFormularioIva> parametroformularioivasEliminados) {
		this.parametroformularioivasEliminados = parametroformularioivasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroFormularioIva() {
		return jComboBoxTiposSeleccionarParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroFormularioIva(
			JComboBox jComboBoxTiposSeleccionarParametroFormularioIva) {
		this.jComboBoxTiposSeleccionarParametroFormularioIva = jComboBoxTiposSeleccionarParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroFormularioIva() {
		return jTextFieldValorCampoGeneralParametroFormularioIva;
	}

	public void setjTextFieldValorCampoGeneralParametroFormularioIva(
			JTextField jTextFieldValorCampoGeneralParametroFormularioIva) {
		this.jTextFieldValorCampoGeneralParametroFormularioIva = jTextFieldValorCampoGeneralParametroFormularioIva;
	}

	public void setBorderResaltarValorCampoGeneralParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFormularioIva.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroFormularioIva .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroFormularioIva() {
		return this.jCheckBoxSeleccionarTodosParametroFormularioIva;
	}

	public void setjCheckBoxSeleccionarTodosParametroFormularioIva(
			JCheckBox jCheckBoxSeleccionarTodosParametroFormularioIva) {
		this.jCheckBoxSeleccionarTodosParametroFormularioIva = jCheckBoxSeleccionarTodosParametroFormularioIva;
	}

	public void setBorderResaltarSeleccionarTodosParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroFormularioIva() {
		return this.jCheckBoxSeleccionadosParametroFormularioIva;
	}

	public void setjCheckBoxSeleccionadosParametroFormularioIva(
			JCheckBox jCheckBoxSeleccionadosParametroFormularioIva) {
		this.jCheckBoxSeleccionadosParametroFormularioIva = jCheckBoxSeleccionadosParametroFormularioIva;
	}
	
	public void setBorderResaltarSeleccionadosParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroFormularioIva() {
		return this.jComboBoxTiposArchivosReportesParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroFormularioIva(
			JComboBox jComboBoxTiposArchivosReportesParametroFormularioIva) {
		this.jComboBoxTiposArchivosReportesParametroFormularioIva = jComboBoxTiposArchivosReportesParametroFormularioIva;
	}

	public void setBorderResaltarTiposArchivosReportesParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroFormularioIva() {
		return this.jComboBoxTiposReportesParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroFormularioIva(
			JComboBox jComboBoxTiposReportesParametroFormularioIva) {
		this.jComboBoxTiposReportesParametroFormularioIva = jComboBoxTiposReportesParametroFormularioIva;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroFormularioIva() {
	//	return jComboBoxTiposReportesDinamicoParametroFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroFormularioIva(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroFormularioIva) {
	//	this.jComboBoxTiposReportesDinamicoParametroFormularioIva = jComboBoxTiposReportesDinamicoParametroFormularioIva;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroFormularioIva() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroFormularioIva(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva = jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva;
	//}
	
	public void setBorderResaltarTiposReportesParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroFormularioIva() {
		return this.jComboBoxTiposGraficosReportesParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroFormularioIva(
			JComboBox jComboBoxTiposGraficosReportesParametroFormularioIva) {
		this.jComboBoxTiposGraficosReportesParametroFormularioIva = jComboBoxTiposGraficosReportesParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroFormularioIva() {
		return this.jComboBoxTiposPaginacionParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroFormularioIva(
			JComboBox jComboBoxTiposPaginacionParametroFormularioIva) {
		this.jComboBoxTiposPaginacionParametroFormularioIva = jComboBoxTiposPaginacionParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposPaginacionParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroFormularioIva() {
		return this.jComboBoxTiposRelacionesParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFormularioIva() {
		return this.jComboBoxTiposAccionesParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFormularioIva(
			JComboBox jComboBoxTiposRelacionesParametroFormularioIva) {
		this.jComboBoxTiposRelacionesParametroFormularioIva = jComboBoxTiposRelacionesParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesParametroFormularioIva) {
		this.jComboBoxTiposAccionesParametroFormularioIva = jComboBoxTiposAccionesParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposRelacionesParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroFormularioIva() {
	//	return jCheckBoxConGraficoDinamicoParametroFormularioIva;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroFormularioIva(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroFormularioIva) {
	//	this.jCheckBoxConGraficoDinamicoParametroFormularioIva = jCheckBoxConGraficoDinamicoParametroFormularioIva;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroFormularioIva() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroFormularioIva.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroFormularioIva .setBorder(borderResaltar);		
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
		this.parametroformularioivaSessionBean=new ParametroFormularioIvaSessionBean();
		
		this.parametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroformularioivaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Formulario Iva MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroFormularioIva= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"nuevo","nuevo","Nuevo"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"duplicar","duplicar","Duplicar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"copiar","copiar","Copiar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"ver_form","ver_form","Ver"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"recargar","recargar","Recargar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroFormularioIva,this.jTtoolBarParametroFormularioIva,
							"cerrar","cerrar","Salir"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroFormularioIva=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroFormularioIva;
			
				this.jButtonProcesarInformacionToolBarParametroFormularioIva=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroFormularioIva;
				
		//protected JButton jButtonModificarToolBarParametroFormularioIva;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroFormularioIva=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroFormularioIva=new JMenuMe("General");
		this.jmenuArchivoParametroFormularioIva=new JMenuMe("Archivo");
		this.jmenuAccionesParametroFormularioIva=new JMenuMe("Acciones");
		this.jmenuDatosParametroFormularioIva=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroFormularioIva= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroFormularioIva.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroFormularioIva,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroFormularioIva= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroFormularioIva.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroFormularioIva,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroFormularioIva= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroFormularioIva.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroFormularioIva,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroFormularioIva= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroFormularioIva.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroFormularioIva,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroFormularioIva= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroFormularioIva.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroFormularioIva,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroFormularioIva= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroFormularioIva.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroFormularioIva,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroFormularioIva= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroFormularioIva.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroFormularioIva,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroFormularioIva= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroFormularioIva.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroFormularioIva,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroFormularioIva= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroFormularioIva.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroFormularioIva,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroFormularioIva= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroFormularioIva.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroFormularioIva,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroFormularioIva.add(this.jMenuItemCerrarParametroFormularioIva);
			
			this.jmenuAccionesParametroFormularioIva.add(this.jMenuItemNuevoParametroFormularioIva);
			this.jmenuAccionesParametroFormularioIva.add(this.jMenuItemNuevoGuardarCambiosParametroFormularioIva);
			this.jmenuAccionesParametroFormularioIva.add(this.jMenuItemNuevoRelacionesParametroFormularioIva);
			this.jmenuAccionesParametroFormularioIva.add(this.jMenuItemGuardarCambiosTablaParametroFormularioIva);		
			this.jmenuAccionesParametroFormularioIva.add(this.jMenuItemDuplicarParametroFormularioIva);		
			this.jmenuAccionesParametroFormularioIva.add(this.jMenuItemCopiarParametroFormularioIva);		
			this.jmenuAccionesParametroFormularioIva.add(this.jMenuItemVerFormParametroFormularioIva);		
			
			this.jmenuDatosParametroFormularioIva.add(this.jMenuItemRecargarInformacionParametroFormularioIva);				
			this.jmenuDatosParametroFormularioIva.add(this.jMenuItemAnterioresParametroFormularioIva);				
			this.jmenuDatosParametroFormularioIva.add(this.jMenuItemSiguientesParametroFormularioIva);				
			this.jmenuDatosParametroFormularioIva.add(this.jMenuItemAbrirOrderByParametroFormularioIva);				
			this.jmenuDatosParametroFormularioIva.add(this.jMenuItemMostrarOcultarParametroFormularioIva);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroFormularioIva.add(this.jMenuItemGuardarCambiosParametroFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroFormularioIva.add(this.jmenuArchivoParametroFormularioIva);		
			this.jmenuBarParametroFormularioIva.add(this.jmenuAccionesParametroFormularioIva);		
			this.jmenuBarParametroFormularioIva.add(this.jmenuDatosParametroFormularioIva);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroFormularioIva);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroFormularioIva() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdGrupoParametroFormularioIvaParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setToolTipText("Buscar Por Grupo Parametro ");
		this.jButtonFK_IdGrupoParametroFormularioIvaParametroFormularioIva= new JButtonMe();
		this.jButtonFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setText("Buscar");
		this.jButtonFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setToolTipText("Buscar Por Grupo Parametro ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGrupoParametroFormularioIvaParametroFormularioIva,"buscar_button","Buscar Por Grupo Parametro ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGrupoParametroFormularioIvaParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva = new JLabelMe();
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setText("Grupo Parametro :");
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setToolTipText("Grupo Parametro");
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setToolTipText("Buscar Por Sub Grupo Parametro ");
		this.jButtonFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva= new JButtonMe();
		this.jButtonFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setText("Buscar");
		this.jButtonFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setToolTipText("Buscar Por Sub Grupo Parametro ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva,"buscar_button","Buscar Por Sub Grupo Parametro ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva = new JLabelMe();
		jLabelid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setText("Sub Grupo Parametro :");
		jLabelid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setToolTipText("Sub Grupo Parametro");
		jLabelid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoParametroFormularioIvaParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoParametroFormularioIvaParametroFormularioIva.setToolTipText("Buscar Por Tipo Parametro ");
		this.jButtonFK_IdTipoParametroFormularioIvaParametroFormularioIva= new JButtonMe();
		this.jButtonFK_IdTipoParametroFormularioIvaParametroFormularioIva.setText("Buscar");
		this.jButtonFK_IdTipoParametroFormularioIvaParametroFormularioIva.setToolTipText("Buscar Por Tipo Parametro ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoParametroFormularioIvaParametroFormularioIva,"buscar_button","Buscar Por Tipo Parametro ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoParametroFormularioIvaParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva = new JLabelMe();
		jLabelid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva.setText("Tipo Parametro :");
		jLabelid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva.setToolTipText("Tipo Parametro");
		jLabelid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroFormularioIva=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroFormularioIva.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroFormularioIva.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroFormularioIva.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroFormularioIva = new ParametroFormularioIvaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Formulario Iva DATOS");
			this.jInternalFrameDetalleFormParametroFormularioIva = new ParametroFormularioIvaDetalleFormJInternalFrame(jDesktopPane,this.parametroformularioivaSessionBean.getConGuardarRelaciones(),this.parametroformularioivaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroFormularioIva = null;//new ParametroFormularioIvaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFormularioIva= new GridBagLayout();
		
		
		this.jTableDatosParametroFormularioIva = new JTableMe();      
		
		String sToolTipParametroFormularioIva="";
		sToolTipParametroFormularioIva=ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFormularioIva+="(Contabilidad.ParametroFormularioIva)";
		}
		
		if(!this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFormularioIva+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroFormularioIva.setToolTipText(sToolTipParametroFormularioIva);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroFormularioIva);
		this.jTableDatosParametroFormularioIva.setAutoCreateRowSorter(true);
		this.jTableDatosParametroFormularioIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroFormularioIva.setRowSelectionAllowed(true);
		this.jTableDatosParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroFormularioIva = new JButtonMe();
		this.jButtonDuplicarParametroFormularioIva = new JButtonMe();
		this.jButtonCopiarParametroFormularioIva = new JButtonMe();
		this.jButtonVerFormParametroFormularioIva = new JButtonMe();
		this.jButtonNuevoRelacionesParametroFormularioIva = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarParametroFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosParametroFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroFormularioIva = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Parametro Formulario Iva";
		
		if(!this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Formulario Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesParametroFormularioIva.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroFormularioIva.setName("jPanelCamposFingeneralParametroFormularioIva");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableParametroFormularioIva.setName("jPanelCamposFincuenta_contableParametroFormularioIva");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroFormularioIva=new ReporteDinamicoJInternalFrame(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroFormularioIva();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroFormularioIva=new ImportacionJInternalFrame(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroFormularioIva();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroFormularioIva = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroFormularioIva.setText("Orden");
		this.jButtonAbrirOrderByParametroFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFormularioIva,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFormularioIva,false,this);
			
			//this.cargarOrderByParametroFormularioIva(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFormularioIva,true,this);
			
			//this.cargarOrderByParametroFormularioIva(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroFormularioIva.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosParametroFormularioIva.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosParametroFormularioIva.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosParametroFormularioIva.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFormularioIva.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFormularioIva.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroFormularioIva.setText("Nuevo");
		this.jButtonDuplicarParametroFormularioIva.setText("Duplicar");
		this.jButtonCopiarParametroFormularioIva.setText("Copiar");
		this.jButtonVerFormParametroFormularioIva.setText("Ver");
		this.jButtonNuevoRelacionesParametroFormularioIva.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroFormularioIva.setText("Guardar");
		this.jButtonCerrarParametroFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFormularioIva,"nuevo_button","Nuevo",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroFormularioIva,"duplicar_button","Duplicar",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroFormularioIva,"copiar_button","Copiar",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroFormularioIva,"ver_form","Ver",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroFormularioIva,"nuevorelaciones_button","Nuevo Rel",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFormularioIva,"guardarcambiostabla_button","Guardar",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFormularioIva,"cerrar_button","Salir",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroFormularioIva.setToolTipText("Nuevo"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroFormularioIva.setToolTipText("Duplicar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroFormularioIva.setToolTipText("Copiar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroFormularioIva.setToolTipText("Ver"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroFormularioIva.setToolTipText("Nuevo Rel"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroFormularioIva.setToolTipText("Guardar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFormularioIva.setToolTipText("Salir"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFormularioIva";
		inputMap = this.jButtonNuevoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFormularioIva"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroFormularioIva";
		inputMap = this.jButtonDuplicarParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroFormularioIva"));
		
		//COPIAR
		sMapKey = "CopiarParametroFormularioIva";
		inputMap = this.jButtonCopiarParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroFormularioIva"));
		
		//VEr FORM
		sMapKey = "VerFormParametroFormularioIva";
		inputMap = this.jButtonVerFormParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroFormularioIva"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroFormularioIva";
		inputMap = this.jButtonNuevoRelacionesParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroFormularioIva"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroFormularioIva";
		inputMap = this.jButtonModificarParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroFormularioIva"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroFormularioIva";
		inputMap = this.jButtonCerrarParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFormularioIva"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroFormularioIva.setName("jPanelParametrosReportesParametroFormularioIva"); 
		
		this.jPanelParametrosReportesAccionesParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroFormularioIva.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroFormularioIva.setName("jPanelParametrosReportesAccionesParametroFormularioIva"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroFormularioIva = new JButtonMe();
		this.jButtonRecargarInformacionParametroFormularioIva.setText("Recargar");
		this.jButtonRecargarInformacionParametroFormularioIva.setToolTipText("Recargar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroFormularioIva,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroFormularioIva = new JButtonMe();
		this.jButtonProcesarInformacionParametroFormularioIva.setText("Procesar");
		this.jButtonProcesarInformacionParametroFormularioIva.setToolTipText("Procesar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroFormularioIva.setVisible(false);
			
		this.jButtonProcesarInformacionParametroFormularioIva.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFormularioIva.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFormularioIva.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroFormularioIva.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposReportesParametroFormularioIva.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroFormularioIva.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroFormularioIva.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposRelacionesParametroFormularioIva.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesParametroFormularioIva.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroFormularioIva.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroFormularioIva=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroFormularioIva.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFormularioIva.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFormularioIva.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroFormularioIva = new JLabelMe();
		
		this.jLabelAccionesParametroFormularioIva.setText("Acciones");		
		this.jLabelAccionesParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroFormularioIva.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroFormularioIva.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroFormularioIva.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroFormularioIva.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroFormularioIva.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroFormularioIva.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroFormularioIva.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroFormularioIva.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroFormularioIva = new JButtonMe();
		//this.jButtonAnterioresParametroFormularioIva.setText("<<");
        this.jButtonAnterioresParametroFormularioIva.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroFormularioIva,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroFormularioIva = new JButtonMe();
		//this.jButtonSiguientesParametroFormularioIva.setText(">>");
        this.jButtonSiguientesParametroFormularioIva.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroFormularioIva,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroFormularioIva = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroFormularioIva.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroFormularioIva.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroFormularioIva,"nuevoguardarcambios_button","Nue",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroFormularioIva";
		inputMap = this.jButtonNuevoGuardarCambiosParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroFormularioIva"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroFormularioIva";
		inputMap = this.jButtonRecargarInformacionParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroFormularioIva"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroFormularioIva";
		inputMap = this.jButtonSiguientesParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroFormularioIva"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroFormularioIva";
		inputMap = this.jButtonAnterioresParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroFormularioIva"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroFormularioIva();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroFormularioIva.setMinimumSize(new Dimension(this.getWidth(),ParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFormularioIva.setMaximumSize(new Dimension(this.getWidth(),ParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFormularioIva.setPreferredSize(new Dimension(this.getWidth(),ParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroFormularioIva = new GridBagLayout();

			this.jPanelPaginacionParametroFormularioIva.setLayout(gridaBagLayoutPaginacionParametroFormularioIva);						
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = 0;
			this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroFormularioIva.add(this.jButtonAnterioresParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
					
						
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFormularioIva.gridy = 0;
			
			this.jPanelPaginacionParametroFormularioIva.add(this.jButtonNuevoGuardarCambiosParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
						
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFormularioIva.gridy = 0;
			this.jPanelPaginacionParametroFormularioIva.add(this.jButtonSiguientesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFormularioIva.add(this.jButtonNuevoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroFormularioIva.gridy = 1;
				this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionParametroFormularioIva.add(this.jButtonNuevoRelacionesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			}
			
			
			if(!this.parametroformularioivaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroFormularioIva.gridy = 1;
				this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroFormularioIva.add(this.jButtonGuardarCambiosTablaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			}
			
			
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFormularioIva.add(this.jButtonDuplicarParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFormularioIva.add(this.jButtonCopiarParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFormularioIva.add(this.jButtonVerFormParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroFormularioIva.add(this.jButtonCerrarParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
		
		
		this.jButtonRecargarInformacionParametroFormularioIva.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFormularioIva.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFormularioIva.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroFormularioIva.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFormularioIva.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFormularioIva.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroFormularioIva.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFormularioIva.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFormularioIva.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroFormularioIva.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFormularioIva.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFormularioIva.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroFormularioIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFormularioIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFormularioIva.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroFormularioIva.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFormularioIva.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFormularioIva.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroFormularioIva = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroFormularioIva = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroFormularioIva.setLayout(gridaBagParametrosReportesParametroFormularioIva);
			this.jPanelParametrosReportesAccionesParametroFormularioIva.setLayout(gridaBagParametrosReportesAccionesParametroFormularioIva);
			
			
			this.jPanelParametrosAuxiliar1ParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar1ParametroFormularioIva);
			this.jPanelParametrosAuxiliar2ParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar2ParametroFormularioIva);
			this.jPanelParametrosAuxiliar3ParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar3ParametroFormularioIva);
			this.jPanelParametrosAuxiliar4ParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar4ParametroFormularioIva);
			//this.jPanelParametrosAuxiliar5ParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar2ParametroFormularioIva);			
			
			
			
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jButtonRecargarInformacionParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFormularioIva.add(this.jComboBoxTiposPaginacionParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFormularioIva.add(this.jCheckBoxConAltoMaximoTablaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFormularioIva.add(this.jComboBoxTiposArchivosReportesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jPanelParametrosAuxiliar1ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroFormularioIva.add(this.jComboBoxTiposReportesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);																		
			
			
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ParametroFormularioIva.add(this.jComboBoxTiposGraficosReportesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jPanelParametrosAuxiliar4ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jComboBoxTiposReportesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jCheckBoxGenerarReporteParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jPanelParametrosAuxiliar2ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jLabelAccionesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroFormularioIva.add(this.jButtonAbrirOrderByParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jComboBoxTiposSeleccionarParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);			
			
			
			/*
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jCheckBoxSeleccionarTodosParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jCheckBoxConGraficoReporteParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFormularioIva.add(this.jCheckBoxSeleccionarTodosParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);															
				
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFormularioIva.add(this.jCheckBoxSeleccionadosParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);															
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFormularioIva.add(this.jCheckBoxConGraficoReporteParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jPanelParametrosAuxiliar3ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jComboBoxTiposRelacionesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
				
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jComboBoxTiposAccionesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
	
				
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFormularioIva.add(this.jTextFieldValorCampoGeneralParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroFormularioIva= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroFormularioIva.setLayout(gridaBagLayoutCamposIniciogeneralParametroFormularioIva);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableParametroFormularioIva= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableParametroFormularioIva.setLayout(gridaBagLayoutCamposIniciocuenta_contableParametroFormularioIva);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroFormularioIva = new GridBagLayout();

			this.jScrollPanelDatosParametroFormularioIva.setLayout(gridaBagLayoutDatosParametroFormularioIva);
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = 0;
			this.gridBagConstraintsParametroFormularioIva.gridx = 0;
			
			this.jScrollPanelDatosParametroFormularioIva.add(this.jTableDatosParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroFormularioIva.setViewportView(this.jTableDatosParametroFormularioIva);
		this.jTableDatosParametroFormularioIva.setFillsViewportHeight(true);
		this.jTableDatosParametroFormularioIva.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesParametroFormularioIva.setLayout(gridaBagLayoutAccionesParametroFormularioIva);
		
		
		/*	
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 0;
			
		this.jPanelAccionesParametroFormularioIva.add(this.jButtonNuevoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdGrupoParametroFormularioIvaParametroFormularioIva= new GridBagLayout();
		gridaBagLayoutFK_IdGrupoParametroFormularioIvaParametroFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGrupoParametroFormularioIvaParametroFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGrupoParametroFormularioIvaParametroFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGrupoParametroFormularioIvaParametroFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGrupoParametroFormularioIvaParametroFormularioIva.setLayout(gridaBagLayoutFK_IdGrupoParametroFormularioIvaParametroFormularioIva);

		gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFormularioIva.gridy = 0;
		gridBagConstraintsParametroFormularioIva.gridx = 0;
		jPanelFK_IdGrupoParametroFormularioIvaParametroFormularioIva.add(jLabelid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva, gridBagConstraintsParametroFormularioIva);

		gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFormularioIva.gridy = 0;
		gridBagConstraintsParametroFormularioIva.gridx = 1;
		jPanelFK_IdGrupoParametroFormularioIvaParametroFormularioIva.add(jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaParametroFormularioIva, gridBagConstraintsParametroFormularioIva);

		gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFormularioIva.gridy = 1;
		gridBagConstraintsParametroFormularioIva.gridx =1;
		jPanelFK_IdGrupoParametroFormularioIvaParametroFormularioIva.add(jButtonFK_IdGrupoParametroFormularioIvaParametroFormularioIva, gridBagConstraintsParametroFormularioIva);

		jTabbedPaneBusquedasParametroFormularioIva.addTab("1.-Por Grupo Parametro ", jPanelFK_IdGrupoParametroFormularioIvaParametroFormularioIva);
		jTabbedPaneBusquedasParametroFormularioIva.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva= new GridBagLayout();
		gridaBagLayoutFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.setLayout(gridaBagLayoutFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva);

		gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFormularioIva.gridy = 0;
		gridBagConstraintsParametroFormularioIva.gridx = 0;
		jPanelFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.add(jLabelid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva, gridBagConstraintsParametroFormularioIva);

		gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFormularioIva.gridy = 0;
		gridBagConstraintsParametroFormularioIva.gridx = 1;
		jPanelFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.add(jComboBoxid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva, gridBagConstraintsParametroFormularioIva);

		gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFormularioIva.gridy = 1;
		gridBagConstraintsParametroFormularioIva.gridx =1;
		jPanelFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva.add(jButtonFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva, gridBagConstraintsParametroFormularioIva);

		jTabbedPaneBusquedasParametroFormularioIva.addTab("2.-Por Sub Grupo Parametro ", jPanelFK_IdSubGrupoParametroFormularioIvaParametroFormularioIva);
		jTabbedPaneBusquedasParametroFormularioIva.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoParametroFormularioIvaParametroFormularioIva= new GridBagLayout();
		gridaBagLayoutFK_IdTipoParametroFormularioIvaParametroFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoParametroFormularioIvaParametroFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoParametroFormularioIvaParametroFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoParametroFormularioIvaParametroFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoParametroFormularioIvaParametroFormularioIva.setLayout(gridaBagLayoutFK_IdTipoParametroFormularioIvaParametroFormularioIva);

		gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFormularioIva.gridy = 0;
		gridBagConstraintsParametroFormularioIva.gridx = 0;
		jPanelFK_IdTipoParametroFormularioIvaParametroFormularioIva.add(jLabelid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva, gridBagConstraintsParametroFormularioIva);

		gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFormularioIva.gridy = 0;
		gridBagConstraintsParametroFormularioIva.gridx = 1;
		jPanelFK_IdTipoParametroFormularioIvaParametroFormularioIva.add(jComboBoxid_tipo_parametro_formulario_ivaFK_IdTipoParametroFormularioIvaParametroFormularioIva, gridBagConstraintsParametroFormularioIva);

		gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFormularioIva.gridy = 1;
		gridBagConstraintsParametroFormularioIva.gridx =1;
		jPanelFK_IdTipoParametroFormularioIvaParametroFormularioIva.add(jButtonFK_IdTipoParametroFormularioIvaParametroFormularioIva, gridBagConstraintsParametroFormularioIva);

		jTabbedPaneBusquedasParametroFormularioIva.addTab("3.-Por Tipo Parametro ", jPanelFK_IdTipoParametroFormularioIvaParametroFormularioIva);
		jTabbedPaneBusquedasParametroFormularioIva.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFormularioIva);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFormularioIva.gridx = 0;		
			//this.gridBagConstraintsParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFormularioIva.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroFormularioIva.gridx = 0;		
		//this.gridBagConstraintsParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroFormularioIva);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFormularioIva.gridx = 0;		
			this.gridBagConstraintsParametroFormularioIva.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroFormularioIva.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFormularioIva.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);								
		
		
		/*
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		*/		
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFormularioIva.gridx =0;
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
				
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFormularioIva = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroFormularioIva.setLayout(gridaBagLayoutBusquedasParametrosParametroFormularioIva);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			
			
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
			
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroFormularioIva;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroFormularioIva() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroFormularioIva.setName("jPanelReporteDinamicoParametroFormularioIva"); 
		
		this.jPanelReporteDinamicoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroFormularioIva.setLayout(gridaBagLayoutReporteDinamicoParametroFormularioIva);
		
		
		this.jInternalFrameReporteDinamicoParametroFormularioIva= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroFormularioIva.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroFormularioIva.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroFormularioIva.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroFormularioIva.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Formulario Ivas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroFormularioIva = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroFormularioIva.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jLabelColumnasSelectReporteParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroFormularioIva = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroFormularioIva=new JScrollPane(this.jListColumnasSelectReporteParametroFormularioIva);
			
			this.jScrollColumnasSelectReporteParametroFormularioIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFormularioIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFormularioIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroFormularioIva.add(this.jListColumnasSelectReporteParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jScrollColumnasSelectReporteParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroFormularioIva = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroFormularioIva.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jLabelRelacionesSelectReporteParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroFormularioIva = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroFormularioIva=new JScrollPane(this.jListRelacionesSelectReporteParametroFormularioIva);
			
			this.jScrollRelacionesSelectReporteParametroFormularioIva.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFormularioIva.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFormularioIva.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroFormularioIva.add(this.jListRelacionesSelectReporteParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jScrollRelacionesSelectReporteParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoParametroFormularioIva = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroFormularioIva = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroFormularioIva = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoParametroFormularioIva = new JLabelMe();

		this.jLabelConGraficoDinamicoParametroFormularioIva.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jLabelConGraficoDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoParametroFormularioIva.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoParametroFormularioIva.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoParametroFormularioIva.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jCheckBoxConGraficoDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoParametroFormularioIva = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoParametroFormularioIva.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jLabelColumnaCategoriaGraficoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoParametroFormularioIva.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoParametroFormularioIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoParametroFormularioIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jComboBoxColumnaCategoriaGraficoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorParametroFormularioIva = new JLabelMe();

		this.jLabelColumnaCategoriaValorParametroFormularioIva.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jLabelColumnaCategoriaValorParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorParametroFormularioIva.setText("Accion");
        this.jComboBoxColumnaCategoriaValorParametroFormularioIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorParametroFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorParametroFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorParametroFormularioIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jComboBoxColumnaCategoriaValorParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoParametroFormularioIva = new JLabelMe();

		this.jLabelColumnasValoresGraficoParametroFormularioIva.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jLabelColumnasValoresGraficoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoParametroFormularioIva = new JList<Reporte>();
		this.jListColumnasValoresGraficoParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoParametroFormularioIva.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoParametroFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoParametroFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoParametroFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoParametroFormularioIva=new JScrollPane(this.jListColumnasValoresGraficoParametroFormularioIva);
			
			this.jScrollColumnasValoresGraficoParametroFormularioIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoParametroFormularioIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoParametroFormularioIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoParametroFormularioIva.add(this.jListColumnasSelectReporteParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jScrollColumnasValoresGraficoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoParametroFormularioIva = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoParametroFormularioIva.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jLabelTiposGraficosReportesDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoParametroFormularioIva.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoParametroFormularioIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoParametroFormularioIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jComboBoxTiposGraficosReportesDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroFormularioIva = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroFormularioIva.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jLabelGenerarExcelReporteDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroFormularioIva.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroFormularioIva,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroFormularioIva.setToolTipText("Generar EXCEL"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroFormularioIva.add(this.jButtonGenerarExcelReporteDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jComboBoxTiposReportesDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroFormularioIva = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroFormularioIva.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jLabelTiposArchivoReporteDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jComboBoxTiposArchivosReportesDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroFormularioIva.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroFormularioIva,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroFormularioIva.setToolTipText("Generar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jButtonGenerarReporteDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroFormularioIva.setToolTipText("Cancelar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFormularioIva.add(this.jButtonCerrarReporteDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroFormularioIva = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroFormularioIva= new JScrollPane(jPanelReporteDinamicoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Formulario Ivas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroFormularioIva.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroFormularioIva);
		this.jInternalFrameReporteDinamicoParametroFormularioIva.getContentPane().add(this.jScrollPanelReporteDinamicoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroFormularioIva() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroFormularioIva.setName("jPanelImportacionParametroFormularioIva"); 
		
		this.jPanelImportacionParametroFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroFormularioIva.setLayout(gridaBagLayoutImportacionParametroFormularioIva);
		
		
		this.jInternalFrameImportacionParametroFormularioIva= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroFormularioIva= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionParametroFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionParametroFormularioIva.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFormularioIva.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionParametroFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionParametroFormularioIva.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Formulario Ivas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroFormularioIva = new JLabelMe();

		this.jLabelArchivoImportacionParametroFormularioIva.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFormularioIva.add(this.jLabelArchivoImportacionParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroFormularioIva = new JFileChooser();		
		this.jFileChooserImportacionParametroFormularioIva.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroFormularioIva = new JButtonMe();
		this.jButtonAbrirImportacionParametroFormularioIva.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroFormularioIva,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroFormularioIva.setToolTipText("Generar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFormularioIva.add(this.jButtonAbrirImportacionParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroFormularioIva = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroFormularioIva.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFormularioIva.add(this.jLabelPathArchivoImportacionParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroFormularioIva=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroFormularioIva.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFormularioIva.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFormularioIva.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFormularioIva.add(this.jTextFieldPathArchivoImportacionParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarImportacionParametroFormularioIva.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroFormularioIva,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroFormularioIva.setToolTipText("Generar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFormularioIva.add(this.jButtonGenerarImportacionParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarImportacionParametroFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroFormularioIva.setToolTipText("Cancelar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFormularioIva.add(this.jButtonCerrarImportacionParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroFormularioIva = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroFormularioIva= new JScrollPane(jPanelImportacionParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroFormularioIva.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroFormularioIva);
		this.jInternalFrameImportacionParametroFormularioIva.getContentPane().add(this.jScrollPanelImportacionParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroFormularioIva(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroFormularioIva = new JButtonMe();
			this.jButtonAbrirOrderByParametroFormularioIva.setText("Orden");
			this.jButtonAbrirOrderByParametroFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFormularioIva,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroFormularioIva";
			inputMap = this.jButtonAbrirOrderByParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroFormularioIva"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroFormularioIva = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroFormularioIva.setName("jPanelOrderByParametroFormularioIva"); 
			
			this.jPanelOrderByParametroFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroFormularioIva.setLayout(gridaBagLayoutOrderByParametroFormularioIva);
			
			
			this.jTableDatosParametroFormularioIvaOrderBy = new JTableMe();        
			this.jTableDatosParametroFormularioIvaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroFormularioIvaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroFormularioIvaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroFormularioIvaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroFormularioIvaOrderBy.setViewportView(this.jTableDatosParametroFormularioIvaOrderBy);
			this.jTableDatosParametroFormularioIvaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroFormularioIvaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroFormularioIva= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroFormularioIva= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroFormularioIva = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroFormularioIva= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroFormularioIva.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroFormularioIva.setTitle("Orden");
			this.jInternalFrameOrderByParametroFormularioIva.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroFormularioIva.setResizable(true);
			this.jInternalFrameOrderByParametroFormularioIva.setClosable(true);
			this.jInternalFrameOrderByParametroFormularioIva.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Formulario Ivas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroFormularioIva.ipady =150;
				
			this.jPanelOrderByParametroFormularioIva.add(jScrollPanelDatosParametroFormularioIvaOrderBy, this.gridBagConstraintsParametroFormularioIva);//this.jTableDatosParametroFormularioIvaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroFormularioIva = new JButtonMe();
			this.jButtonCerrarOrderByParametroFormularioIva.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroFormularioIva,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroFormularioIva.setToolTipText("Cancelar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroFormularioIva.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroFormularioIva.add(this.jButtonCerrarOrderByParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroFormularioIva = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroFormularioIva= new JScrollPane(jPanelOrderByParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroFormularioIva);
			
			this.jInternalFrameOrderByParametroFormularioIva.getContentPane().add(this.jScrollPanelOrderByParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);			
		
		} else {
			this.jButtonAbrirOrderByParametroFormularioIva = new JButtonMe();
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
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametroformularioivaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroFormularioIva.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroFormularioIva.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroFormularioIva.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroFormularioIva.getRowHeight();//ParametroFormularioIvaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFormularioIva.isSelected()) {
					iHeightTable=ParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFormularioIva.isSelected()) {
					iHeightTable=ParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroFormularioIva!=null && this.jInternalFrameOrderByParametroFormularioIva.getjTableDatosOrderBy()!=null) {
			//if(!this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroFormularioIva.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroFormularioIva.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroFormularioIva.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroFormularioIva.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroFormularioIva.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroFormularioIva.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroFormularioIva.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametroformularioivaLogic.getParametroFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroformularioivas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroFormularioIva> TraerParametroFormularioIvaBeans(List<ParametroFormularioIva> parametroformularioivas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroFormularioIva parametroformularioiva:parametroformularioivas) {
					
				if(!(ParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametroformularioiva.setsDetalleGeneralEntityReporte(ParametroFormularioIvaConstantesFunciones.getParametroFormularioIvaDescripcion(parametroformularioiva));
										
					parametroformularioiva.setcon_total_descripcion(ParametroFormularioIvaConstantesFunciones.getcon_totalDescripcion(parametroformularioiva));	
					
					

					if(parametroformularioiva.getFormularioRentas()!=null && Funciones.existeClass(classes,FormularioRenta.class)) {
						try{parametroformularioiva.setformulariorentasDescripcionReporte(new JRBeanCollectionDataSource(FormularioRentaJInternalFrame.TraerFormularioRentaBeans(parametroformularioiva.getFormularioRentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(parametroformularioiva.getFormularioIvas()!=null && Funciones.existeClass(classes,FormularioIva.class)) {
						try{parametroformularioiva.setformularioivasDescripcionReporte(new JRBeanCollectionDataSource(FormularioIvaJInternalFrame.TraerFormularioIvaBeans(parametroformularioiva.getFormularioIvas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//parametroformularioiva.setsDetalleGeneralEntityReporte(parametroformularioiva.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametroformularioivabeans.add(parametroformularioivabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametroformularioivas;
    }
	//PARA REPORTES FIN
}
