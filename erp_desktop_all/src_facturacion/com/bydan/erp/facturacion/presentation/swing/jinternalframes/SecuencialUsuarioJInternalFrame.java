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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.SecuencialUsuarioConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class SecuencialUsuarioJInternalFrame extends SecuencialUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSecuencialUsuario;
	
	protected JMenuBar jmenuBarSecuencialUsuario;
	
	protected JMenu jmenuSecuencialUsuario;
	protected JMenu jmenuDatosSecuencialUsuario;
	protected JMenu jmenuArchivoSecuencialUsuario;
	protected JMenu jmenuAccionesSecuencialUsuario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSecuencialUsuario;	
	protected GridBagConstraints gridBagConstraintsSecuencialUsuario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SecuencialUsuarioDetalleFormJInternalFrame jInternalFrameDetalleFormSecuencialUsuario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSecuencialUsuario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSecuencialUsuario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentogeneral="";
	
	public SecuencialUsuarioSessionBean secuencialusuarioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SecuencialUsuario> secuencialusuarios;		
	public List<SecuencialUsuario> secuencialusuariosEliminados;	
	public List<SecuencialUsuario> secuencialusuariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySecuencialUsuario;		
	protected JButton jButtonAbrirOrderBySecuencialUsuario;
	
	
	//protected JPanel jPanelOrderBySecuencialUsuario;
	//public JScrollPane jScrollPanelOrderBySecuencialUsuario;	
	//protected JButton jButtonCerrarOrderBySecuencialUsuario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SecuencialUsuarioLogic secuencialusuarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSecuencialUsuario;
	public JScrollPane jScrollPanelDatosEdicionSecuencialUsuario;
	public JScrollPane jScrollPanelDatosGeneralSecuencialUsuario;
    
	
	
	//public JScrollPane jScrollPanelDatosSecuencialUsuarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSecuencialUsuario;
	//public JScrollPane jScrollPanelImportacionSecuencialUsuario;
	
	
	
	protected JPanel jPanelAccionesSecuencialUsuario;
	
    protected JPanel jPanelPaginacionSecuencialUsuario;
    protected JPanel jPanelParametrosReportesSecuencialUsuario;
	protected JPanel jPanelParametrosReportesAccionesSecuencialUsuario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SecuencialUsuario;
	protected JPanel jPanelParametrosAuxiliar2SecuencialUsuario;
	protected JPanel jPanelParametrosAuxiliar3SecuencialUsuario;
	protected JPanel jPanelParametrosAuxiliar4SecuencialUsuario;
	//protected JPanel jPanelParametrosAuxiliar5SecuencialUsuario;
	
	
	
	//protected JPanel jPanelReporteDinamicoSecuencialUsuario;
	//protected JPanel jPanelImportacionSecuencialUsuario;
	
	
	public JTable jTableDatosSecuencialUsuario;
	
	
	
	//public JTable jTableDatosSecuencialUsuarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSecuencialUsuario;
	protected JButton jButtonDuplicarSecuencialUsuario;
	protected JButton jButtonCopiarSecuencialUsuario;
	protected JButton jButtonVerFormSecuencialUsuario;
	protected JButton jButtonNuevoRelacionesSecuencialUsuario;
	protected JButton jButtonModificarSecuencialUsuario;
	
    protected JButton jButtonGuardarCambiosTablaSecuencialUsuario;
	protected JButton jButtonCerrarSecuencialUsuario;
	
	
	protected JButton jButtonRecargarInformacionSecuencialUsuario;
	protected JButton jButtonProcesarInformacionSecuencialUsuario;
	
	
	protected JButton jButtonAnterioresSecuencialUsuario;
	protected JButton jButtonSiguientesSecuencialUsuario;
	protected JButton jButtonNuevoGuardarCambiosSecuencialUsuario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSecuencialUsuario;
	//protected JButton jButtonCerrarReporteDinamicoSecuencialUsuario;
	//protected JButton jButtonGenerarExcelReporteDinamicoSecuencialUsuario;	
	
	
	
	//protected JButton jButtonAbrirImportacionSecuencialUsuario;
	//protected JButton jButtonGenerarImportacionSecuencialUsuario;
	//protected JButton jButtonCerrarImportacionSecuencialUsuario;
	//protected JFileChooser jFileChooserImportacionSecuencialUsuario;
	//protected File fileImportacionSecuencialUsuario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSecuencialUsuario;
	protected JButton jButtonDuplicarToolBarSecuencialUsuario;
	protected JButton jButtonNuevoRelacionesToolBarSecuencialUsuario;
	
	
	public JButton jButtonGuardarCambiosToolBarSecuencialUsuario;
	protected JButton jButtonCopiarToolBarSecuencialUsuario;
	protected JButton jButtonVerFormToolBarSecuencialUsuario;
	public JButton jButtonGuardarCambiosTablaToolBarSecuencialUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarSecuencialUsuario;
	protected JButton jButtonCerrarToolBarSecuencialUsuario;
	
	protected JButton jButtonRecargarInformacionToolBarSecuencialUsuario;
	protected JButton jButtonProcesarInformacionToolBarSecuencialUsuario;
	protected JButton jButtonAnterioresToolBarSecuencialUsuario;
	protected JButton jButtonSiguientesToolBarSecuencialUsuario;
	protected JButton jButtonNuevoGuardarCambiosToolBarSecuencialUsuario;
	protected JButton jButtonAbrirOrderByToolBarSecuencialUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSecuencialUsuario;
	protected JMenuItem jMenuItemDuplicarSecuencialUsuario;
	protected JMenuItem jMenuItemNuevoRelacionesSecuencialUsuario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSecuencialUsuario;
	protected JMenuItem jMenuItemCopiarSecuencialUsuario;
	protected JMenuItem jMenuItemVerFormSecuencialUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaSecuencialUsuario;
	protected JMenuItem jMenuItemCerrarSecuencialUsuario;
	protected JMenuItem jMenuItemDetalleCerrarSecuencialUsuario;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySecuencialUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarSecuencialUsuario;
	
	protected JMenuItem jMenuItemRecargarInformacionSecuencialUsuario;
	protected JMenuItem jMenuItemProcesarInformacionSecuencialUsuario;
	protected JMenuItem jMenuItemAnterioresSecuencialUsuario;
	protected JMenuItem jMenuItemSiguientesSecuencialUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSecuencialUsuario;
	protected JMenuItem jMenuItemAbrirOrderBySecuencialUsuario;
	protected JMenuItem jMenuItemMostrarOcultarSecuencialUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSecuencialUsuario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSecuencialUsuario;
	protected JCheckBox jCheckBoxSeleccionadosSecuencialUsuario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSecuencialUsuario;
	protected JCheckBox jCheckBoxConGraficoReporteSecuencialUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSecuencialUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSecuencialUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSecuencialUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSecuencialUsuario;
	protected JTextField jTextFieldValorCampoGeneralSecuencialUsuario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSecuencialUsuario;
	//public JList<Reporte> jListColumnasSelectReporteSecuencialUsuario;
	//public JScrollPane jScrollColumnasSelectReporteSecuencialUsuario;
	
	//public JLabel jLabelRelacionesSelectReporteSecuencialUsuario;
	//public JList<Reporte> jListRelacionesSelectReporteSecuencialUsuario;
	//public JScrollPane jScrollRelacionesSelectReporteSecuencialUsuario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSecuencialUsuario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSecuencialUsuario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSecuencialUsuario;
	//public JLabel jLabelTiposArchivoReporteDinamicoSecuencialUsuario;
	
		
	//public JLabel jLabelArchivoImportacionSecuencialUsuario;	
	//public JLabel jLabelPathArchivoImportacionSecuencialUsuario;
	//protected JTextField jTextFieldPathArchivoImportacionSecuencialUsuario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSecuencialUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSecuencialUsuario;
	
	//public JLabel jLabelColumnaCategoriaValorSecuencialUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSecuencialUsuario;
	
	//public JLabel jLabelColumnasValoresGraficoSecuencialUsuario;
	//public JList<Reporte> jListColumnasValoresGraficoSecuencialUsuario;
	//public JScrollPane jScrollColumnasValoresGraficoSecuencialUsuario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSecuencialUsuario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSecuencialUsuario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSecuencialUsuario;
	public JPanel jPanelBusquedaPorAutorizacionSecuencialUsuario;
	public JButton jButtonBusquedaPorAutorizacionSecuencialUsuario;
	public JPanel jPanelBusquedaPorFechaFinSecuencialUsuario;
	public JButton jButtonBusquedaPorFechaFinSecuencialUsuario;
	public JPanel jPanelBusquedaPorFechaInicioSecuencialUsuario;
	public JButton jButtonBusquedaPorFechaInicioSecuencialUsuario;
	public JPanel jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario;
	public JButton jButtonBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario;
	public JPanel jPanelBusquedaPorSerieSecuencialUsuario;
	public JButton jButtonBusquedaPorSerieSecuencialUsuario;
	public JPanel jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario;
	public JButton jButtonFK_IdTipoDocumentoGeneralSecuencialUsuario;
	public JPanel jPanelFK_IdUsuarioSecuencialUsuario;
	public JButton jButtonFK_IdUsuarioSecuencialUsuario;
	
	public JPanel jPanelautorizacionBusquedaPorAutorizacionSecuencialUsuario;
	public JLabel jLabelautorizacionBusquedaPorAutorizacionSecuencialUsuario;
	public JTextField jTextFieldautorizacionBusquedaPorAutorizacionSecuencialUsuario;
	public JButton jButtonautorizacionBusquedaPorAutorizacionSecuencialUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaPorFechaFinSecuencialUsuario;
	public JLabel jLabelfecha_finBusquedaPorFechaFinSecuencialUsuario;
	//public JFormattedTextField jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario;

	public JDateChooser jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario;
	public JButton jButtonfecha_finBusquedaPorFechaFinSecuencialUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_inicioBusquedaPorFechaInicioSecuencialUsuario;
	public JLabel jLabelfecha_inicioBusquedaPorFechaInicioSecuencialUsuario;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario;

	public JDateChooser jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario;
	public JButton jButtonfecha_inicioBusquedaPorFechaInicioSecuencialUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario;
	public JLabel jLabelid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario;
	public JButton jButtonid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario;
	public JLabel jLabelid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario;
	public JButton jButtonid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelserieBusquedaPorSerieSecuencialUsuario;
	public JLabel jLabelserieBusquedaPorSerieSecuencialUsuario;
	public JTextField jTextFieldserieBusquedaPorSerieSecuencialUsuario;
	public JButton jButtonserieBusquedaPorSerieSecuencialUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario;
	public JLabel jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario;
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_usuarioFK_IdUsuarioSecuencialUsuario;
	public JLabel jLabelid_usuarioFK_IdUsuarioSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario;
	public JButton jButtonid_usuarioFK_IdUsuarioSecuencialUsuario= new JButtonMe();
	public JButton jButtonid_usuarioFK_IdUsuarioSecuencialUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioFK_IdUsuarioSecuencialUsuarioBusqueda= new JButtonMe();

	
	
	
	
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
	public SecuencialUsuarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SecuencialUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialUsuarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SecuencialUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialUsuarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SecuencialUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialUsuarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SecuencialUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSecuencialUsuario)	{
		this.jButtonRecargarInformacionSecuencialUsuario = jButtonRecargarInformacionSecuencialUsuario;
	}
	
	public JButton getjButtonProcesarInformacionSecuencialUsuario() {
		return this.jButtonProcesarInformacionSecuencialUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSecuencialUsuario)	{
		this.jButtonProcesarInformacionSecuencialUsuario = jButtonProcesarInformacionSecuencialUsuario;
	}
	
	
	public JButton getjButtonRecargarInformacionSecuencialUsuario() {
		return this.jButtonRecargarInformacionSecuencialUsuario;
	}
	
	
	public List<SecuencialUsuario> getsecuencialusuarios() {
		return this.secuencialusuarios;
	}

	public void setsecuencialusuarios(List<SecuencialUsuario> secuencialusuarios) {
		this.secuencialusuarios = secuencialusuarios;
	}
	
	public List<SecuencialUsuario> getsecuencialusuariosAux() {
		return this.secuencialusuariosAux;
	}

	public void setsecuencialusuariosAux(List<SecuencialUsuario> secuencialusuariosAux) {
		this.secuencialusuariosAux = secuencialusuariosAux;
	}
	
	public List<SecuencialUsuario> getsecuencialusuariosEliminados() {
		return this.secuencialusuariosEliminados;
	}

	public void setSecuencialUsuariosEliminados(List<SecuencialUsuario> secuencialusuariosEliminados) {
		this.secuencialusuariosEliminados = secuencialusuariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSecuencialUsuario() {
		return jComboBoxTiposSeleccionarSecuencialUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSecuencialUsuario(
			JComboBox jComboBoxTiposSeleccionarSecuencialUsuario) {
		this.jComboBoxTiposSeleccionarSecuencialUsuario = jComboBoxTiposSeleccionarSecuencialUsuario;
	}
	
	public void setBorderResaltarTiposSeleccionarSecuencialUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSecuencialUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSecuencialUsuario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSecuencialUsuario() {
		return jTextFieldValorCampoGeneralSecuencialUsuario;
	}

	public void setjTextFieldValorCampoGeneralSecuencialUsuario(
			JTextField jTextFieldValorCampoGeneralSecuencialUsuario) {
		this.jTextFieldValorCampoGeneralSecuencialUsuario = jTextFieldValorCampoGeneralSecuencialUsuario;
	}

	public void setBorderResaltarValorCampoGeneralSecuencialUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencialUsuario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSecuencialUsuario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSecuencialUsuario() {
		return this.jCheckBoxSeleccionarTodosSecuencialUsuario;
	}

	public void setjCheckBoxSeleccionarTodosSecuencialUsuario(
			JCheckBox jCheckBoxSeleccionarTodosSecuencialUsuario) {
		this.jCheckBoxSeleccionarTodosSecuencialUsuario = jCheckBoxSeleccionarTodosSecuencialUsuario;
	}

	public void setBorderResaltarSeleccionarTodosSecuencialUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencialUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSecuencialUsuario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSecuencialUsuario() {
		return this.jCheckBoxSeleccionadosSecuencialUsuario;
	}

	public void setjCheckBoxSeleccionadosSecuencialUsuario(
			JCheckBox jCheckBoxSeleccionadosSecuencialUsuario) {
		this.jCheckBoxSeleccionadosSecuencialUsuario = jCheckBoxSeleccionadosSecuencialUsuario;
	}
	
	public void setBorderResaltarSeleccionadosSecuencialUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencialUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSecuencialUsuario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSecuencialUsuario() {
		return this.jComboBoxTiposArchivosReportesSecuencialUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSecuencialUsuario(
			JComboBox jComboBoxTiposArchivosReportesSecuencialUsuario) {
		this.jComboBoxTiposArchivosReportesSecuencialUsuario = jComboBoxTiposArchivosReportesSecuencialUsuario;
	}

	public void setBorderResaltarTiposArchivosReportesSecuencialUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencialUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSecuencialUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSecuencialUsuario() {
		return this.jComboBoxTiposReportesSecuencialUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSecuencialUsuario(
			JComboBox jComboBoxTiposReportesSecuencialUsuario) {
		this.jComboBoxTiposReportesSecuencialUsuario = jComboBoxTiposReportesSecuencialUsuario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSecuencialUsuario() {
	//	return jComboBoxTiposReportesDinamicoSecuencialUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSecuencialUsuario(
	//		JComboBox jComboBoxTiposReportesDinamicoSecuencialUsuario) {
	//	this.jComboBoxTiposReportesDinamicoSecuencialUsuario = jComboBoxTiposReportesDinamicoSecuencialUsuario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSecuencialUsuario() {
	//	return jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSecuencialUsuario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario = jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario;
	//}
	
	public void setBorderResaltarTiposReportesSecuencialUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencialUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSecuencialUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSecuencialUsuario() {
		return this.jComboBoxTiposGraficosReportesSecuencialUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSecuencialUsuario(
			JComboBox jComboBoxTiposGraficosReportesSecuencialUsuario) {
		this.jComboBoxTiposGraficosReportesSecuencialUsuario = jComboBoxTiposGraficosReportesSecuencialUsuario;
	}
	
	public void setBorderResaltarTiposGraficosReportesSecuencialUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencialUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSecuencialUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSecuencialUsuario() {
		return this.jComboBoxTiposPaginacionSecuencialUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSecuencialUsuario(
			JComboBox jComboBoxTiposPaginacionSecuencialUsuario) {
		this.jComboBoxTiposPaginacionSecuencialUsuario = jComboBoxTiposPaginacionSecuencialUsuario;
	}
	
	public void setBorderResaltarTiposPaginacionSecuencialUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencialUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSecuencialUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSecuencialUsuario() {
		return this.jComboBoxTiposRelacionesSecuencialUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSecuencialUsuario() {
		return this.jComboBoxTiposAccionesSecuencialUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSecuencialUsuario(
			JComboBox jComboBoxTiposRelacionesSecuencialUsuario) {
		this.jComboBoxTiposRelacionesSecuencialUsuario = jComboBoxTiposRelacionesSecuencialUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSecuencialUsuario(
			JComboBox jComboBoxTiposAccionesSecuencialUsuario) {
		this.jComboBoxTiposAccionesSecuencialUsuario = jComboBoxTiposAccionesSecuencialUsuario;
	}
	
	public void setBorderResaltarTiposRelacionesSecuencialUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencialUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSecuencialUsuario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSecuencialUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencialUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSecuencialUsuario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSecuencialUsuario() {
	//	return jCheckBoxConGraficoDinamicoSecuencialUsuario;
	//}

	//public void setjCheckBoxConGraficoDinamicoSecuencialUsuario(
	//		JCheckBox jCheckBoxConGraficoDinamicoSecuencialUsuario) {
	//	this.jCheckBoxConGraficoDinamicoSecuencialUsuario = jCheckBoxConGraficoDinamicoSecuencialUsuario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSecuencialUsuario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSecuencialUsuario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSecuencialUsuario .setBorder(borderResaltar);		
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
		this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
		
		this.secuencialusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.secuencialusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.secuencialusuarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SecuencialUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SecuencialUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SecuencialUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SecuencialUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SecuencialUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Secuencial Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
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
		
		SecuencialUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SecuencialUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSecuencialUsuario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"nuevo","nuevo","Nuevo"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"duplicar","duplicar","Duplicar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"copiar","copiar","Copiar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"ver_form","ver_form","Ver"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"recargar","recargar","Recargar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSecuencialUsuario,this.jTtoolBarSecuencialUsuario,
							"cerrar","cerrar","Salir"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSecuencialUsuario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSecuencialUsuario;
			
				this.jButtonProcesarInformacionToolBarSecuencialUsuario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSecuencialUsuario;
				
		//protected JButton jButtonModificarToolBarSecuencialUsuario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSecuencialUsuario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSecuencialUsuario=new JMenuMe("General");
		this.jmenuArchivoSecuencialUsuario=new JMenuMe("Archivo");
		this.jmenuAccionesSecuencialUsuario=new JMenuMe("Acciones");
		this.jmenuDatosSecuencialUsuario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSecuencialUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSecuencialUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSecuencialUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSecuencialUsuario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSecuencialUsuario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSecuencialUsuario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSecuencialUsuario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSecuencialUsuario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSecuencialUsuario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSecuencialUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSecuencialUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSecuencialUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSecuencialUsuario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSecuencialUsuario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSecuencialUsuario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSecuencialUsuario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSecuencialUsuario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSecuencialUsuario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSecuencialUsuario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSecuencialUsuario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSecuencialUsuario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSecuencialUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSecuencialUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSecuencialUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSecuencialUsuario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSecuencialUsuario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSecuencialUsuario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSecuencialUsuario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSecuencialUsuario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSecuencialUsuario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSecuencialUsuario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSecuencialUsuario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSecuencialUsuario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSecuencialUsuario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSecuencialUsuario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSecuencialUsuario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySecuencialUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySecuencialUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySecuencialUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSecuencialUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSecuencialUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSecuencialUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySecuencialUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySecuencialUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySecuencialUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSecuencialUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSecuencialUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSecuencialUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSecuencialUsuario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSecuencialUsuario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSecuencialUsuario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSecuencialUsuario.add(this.jMenuItemCerrarSecuencialUsuario);
			
			this.jmenuAccionesSecuencialUsuario.add(this.jMenuItemNuevoSecuencialUsuario);
			this.jmenuAccionesSecuencialUsuario.add(this.jMenuItemNuevoGuardarCambiosSecuencialUsuario);
			this.jmenuAccionesSecuencialUsuario.add(this.jMenuItemNuevoRelacionesSecuencialUsuario);
			this.jmenuAccionesSecuencialUsuario.add(this.jMenuItemGuardarCambiosTablaSecuencialUsuario);		
			this.jmenuAccionesSecuencialUsuario.add(this.jMenuItemDuplicarSecuencialUsuario);		
			this.jmenuAccionesSecuencialUsuario.add(this.jMenuItemCopiarSecuencialUsuario);		
			this.jmenuAccionesSecuencialUsuario.add(this.jMenuItemVerFormSecuencialUsuario);		
			
			this.jmenuDatosSecuencialUsuario.add(this.jMenuItemRecargarInformacionSecuencialUsuario);				
			this.jmenuDatosSecuencialUsuario.add(this.jMenuItemAnterioresSecuencialUsuario);				
			this.jmenuDatosSecuencialUsuario.add(this.jMenuItemSiguientesSecuencialUsuario);				
			this.jmenuDatosSecuencialUsuario.add(this.jMenuItemAbrirOrderBySecuencialUsuario);				
			this.jmenuDatosSecuencialUsuario.add(this.jMenuItemMostrarOcultarSecuencialUsuario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSecuencialUsuario.add(this.jMenuItemGuardarCambiosSecuencialUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSecuencialUsuario.add(this.jmenuArchivoSecuencialUsuario);		
			this.jmenuBarSecuencialUsuario.add(this.jmenuAccionesSecuencialUsuario);		
			this.jmenuBarSecuencialUsuario.add(this.jmenuDatosSecuencialUsuario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSecuencialUsuario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSecuencialUsuario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorAutorizacionSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorAutorizacionSecuencialUsuario.setToolTipText("Buscar Por Autorizacion ");
		this.jButtonBusquedaPorAutorizacionSecuencialUsuario= new JButtonMe();
		this.jButtonBusquedaPorAutorizacionSecuencialUsuario.setText("Buscar");
		this.jButtonBusquedaPorAutorizacionSecuencialUsuario.setToolTipText("Buscar Por Autorizacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorAutorizacionSecuencialUsuario,"buscar_button","Buscar Por Autorizacion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorAutorizacionSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelautorizacionBusquedaPorAutorizacionSecuencialUsuario = new JLabelMe();
		jLabelautorizacionBusquedaPorAutorizacionSecuencialUsuario.setText("Autorizacion :");
		jLabelautorizacionBusquedaPorAutorizacionSecuencialUsuario.setToolTipText("Autorizacion");
		jLabelautorizacionBusquedaPorAutorizacionSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelautorizacionBusquedaPorAutorizacionSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelautorizacionBusquedaPorAutorizacionSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelautorizacionBusquedaPorAutorizacionSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldautorizacionBusquedaPorAutorizacionSecuencialUsuario= new JTextFieldMe();
		jTextFieldautorizacionBusquedaPorAutorizacionSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacionBusquedaPorAutorizacionSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacionBusquedaPorAutorizacionSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldautorizacionBusquedaPorAutorizacionSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorFechaFinSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaFinSecuencialUsuario.setToolTipText("Buscar Por Fecha Fin ");
		this.jButtonBusquedaPorFechaFinSecuencialUsuario= new JButtonMe();
		this.jButtonBusquedaPorFechaFinSecuencialUsuario.setText("Buscar");
		this.jButtonBusquedaPorFechaFinSecuencialUsuario.setToolTipText("Buscar Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaFinSecuencialUsuario,"buscar_button","Buscar Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaFinSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_finBusquedaPorFechaFinSecuencialUsuario = new JLabelMe();
		jLabelfecha_finBusquedaPorFechaFinSecuencialUsuario.setText("Fecha Fin :");
		jLabelfecha_finBusquedaPorFechaFinSecuencialUsuario.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaPorFechaFinSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaPorFechaFinSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaPorFechaFinSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaPorFechaFinSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario= new JDateChooser();
		jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario.setDate(new Date());
		jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorFechaInicioSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaInicioSecuencialUsuario.setToolTipText("Buscar Por Fecha Inicio ");
		this.jButtonBusquedaPorFechaInicioSecuencialUsuario= new JButtonMe();
		this.jButtonBusquedaPorFechaInicioSecuencialUsuario.setText("Buscar");
		this.jButtonBusquedaPorFechaInicioSecuencialUsuario.setToolTipText("Buscar Por Fecha Inicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaInicioSecuencialUsuario,"buscar_button","Buscar Por Fecha Inicio ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaInicioSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_inicioBusquedaPorFechaInicioSecuencialUsuario = new JLabelMe();
		jLabelfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaPorFechaInicioSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario= new JDateChooser();
		jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.setDate(new Date());
		jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setToolTipText("Buscar Por Usuario Por T. Documento General ");
		this.jButtonBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario= new JButtonMe();
		this.jButtonBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setText("Buscar");
		this.jButtonBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setToolTipText("Buscar Por Usuario Por T. Documento General ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario,"buscar_button","Buscar Por Usuario Por T. Documento General ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario = new JLabelMe();
		jLabelid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setText("Usuario :");
		jLabelid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setToolTipText("Usuario");
		jLabelid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario= new JComboBoxMe();
		jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario = new JLabelMe();
		jLabelid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setText("T. Documento General :");
		jLabelid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setToolTipText("T. Documento General");
		jLabelid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario= new JComboBoxMe();
		jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorSerieSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorSerieSecuencialUsuario.setToolTipText("Buscar Por Serie ");
		this.jButtonBusquedaPorSerieSecuencialUsuario= new JButtonMe();
		this.jButtonBusquedaPorSerieSecuencialUsuario.setText("Buscar");
		this.jButtonBusquedaPorSerieSecuencialUsuario.setToolTipText("Buscar Por Serie ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorSerieSecuencialUsuario,"buscar_button","Buscar Por Serie ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorSerieSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelserieBusquedaPorSerieSecuencialUsuario = new JLabelMe();
		jLabelserieBusquedaPorSerieSecuencialUsuario.setText("Serie :");
		jLabelserieBusquedaPorSerieSecuencialUsuario.setToolTipText("Serie");
		jLabelserieBusquedaPorSerieSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelserieBusquedaPorSerieSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelserieBusquedaPorSerieSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelserieBusquedaPorSerieSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldserieBusquedaPorSerieSecuencialUsuario= new JTextFieldMe();
		jTextFieldserieBusquedaPorSerieSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieBusquedaPorSerieSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieBusquedaPorSerieSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieBusquedaPorSerieSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario.setToolTipText("Buscar Por T. Documento General ");
		this.jButtonFK_IdTipoDocumentoGeneralSecuencialUsuario= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoGeneralSecuencialUsuario.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoGeneralSecuencialUsuario.setToolTipText("Buscar Por T. Documento General ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoGeneralSecuencialUsuario,"buscar_button","Buscar Por T. Documento General ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoGeneralSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario = new JLabelMe();
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setText("T. Documento General :");
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setToolTipText("T. Documento General");
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario= new JComboBoxMe();
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUsuarioSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUsuarioSecuencialUsuario.setToolTipText("Buscar Por Usuario ");
		this.jButtonFK_IdUsuarioSecuencialUsuario= new JButtonMe();
		this.jButtonFK_IdUsuarioSecuencialUsuario.setText("Buscar");
		this.jButtonFK_IdUsuarioSecuencialUsuario.setToolTipText("Buscar Por Usuario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUsuarioSecuencialUsuario,"buscar_button","Buscar Por Usuario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUsuarioSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_usuarioFK_IdUsuarioSecuencialUsuario = new JLabelMe();
		jLabelid_usuarioFK_IdUsuarioSecuencialUsuario.setText("Usuario :");
		jLabelid_usuarioFK_IdUsuarioSecuencialUsuario.setToolTipText("Usuario");
		jLabelid_usuarioFK_IdUsuarioSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioFK_IdUsuarioSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioFK_IdUsuarioSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioFK_IdUsuarioSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario= new JComboBoxMe();
		jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSecuencialUsuario=new JTabbedPane();


		this.jTabbedPaneBusquedasSecuencialUsuario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSecuencialUsuario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSecuencialUsuario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSecuencialUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSecuencialUsuario = new SecuencialUsuarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Secuencial Usuario DATOS");
			this.jInternalFrameDetalleFormSecuencialUsuario = new SecuencialUsuarioDetalleFormJInternalFrame(jDesktopPane,this.secuencialusuarioSessionBean.getConGuardarRelaciones(),this.secuencialusuarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSecuencialUsuario = null;//new SecuencialUsuarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSecuencialUsuario= new GridBagLayout();
		
		
		this.jTableDatosSecuencialUsuario = new JTableMe();      
		
		String sToolTipSecuencialUsuario="";
		sToolTipSecuencialUsuario=SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSecuencialUsuario+="(Facturacion.SecuencialUsuario)";
		}
		
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipSecuencialUsuario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSecuencialUsuario.setToolTipText(sToolTipSecuencialUsuario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSecuencialUsuario);
		this.jTableDatosSecuencialUsuario.setAutoCreateRowSorter(true);
		this.jTableDatosSecuencialUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSecuencialUsuario.setRowSelectionAllowed(true);
		this.jTableDatosSecuencialUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSecuencialUsuario = new JButtonMe();
		this.jButtonDuplicarSecuencialUsuario = new JButtonMe();
		this.jButtonCopiarSecuencialUsuario = new JButtonMe();
		this.jButtonVerFormSecuencialUsuario = new JButtonMe();
		this.jButtonNuevoRelacionesSecuencialUsuario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSecuencialUsuario = new JButtonMe();
		this.jButtonCerrarSecuencialUsuario = new JButtonMe();
		
		this.jScrollPanelDatosSecuencialUsuario = new JScrollPane();   
        this.jScrollPanelDatosGeneralSecuencialUsuario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Secuencial Usuario";
		
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuencial Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatosSecuencialUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSecuencialUsuario.setToolTipText("Acciones");
        this.jPanelAccionesSecuencialUsuario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSecuencialUsuario=new ReporteDinamicoJInternalFrame(SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSecuencialUsuario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSecuencialUsuario=new ImportacionJInternalFrame(SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSecuencialUsuario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySecuencialUsuario = new JButtonMe();
		
		this.jButtonAbrirOrderBySecuencialUsuario.setText("Orden");
		this.jButtonAbrirOrderBySecuencialUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySecuencialUsuario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySecuencialUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySecuencialUsuario,false,this);
			
			//this.cargarOrderBySecuencialUsuario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySecuencialUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySecuencialUsuario,true,this);
			
			//this.cargarOrderBySecuencialUsuario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSecuencialUsuario.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosSecuencialUsuario.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosSecuencialUsuario.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosSecuencialUsuario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSecuencialUsuario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSecuencialUsuario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSecuencialUsuario.setText("Nuevo");
		this.jButtonDuplicarSecuencialUsuario.setText("Duplicar");
		this.jButtonCopiarSecuencialUsuario.setText("Copiar");
		this.jButtonVerFormSecuencialUsuario.setText("Ver");
		this.jButtonNuevoRelacionesSecuencialUsuario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSecuencialUsuario.setText("Guardar");
		this.jButtonCerrarSecuencialUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSecuencialUsuario,"nuevo_button","Nuevo",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSecuencialUsuario,"duplicar_button","Duplicar",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSecuencialUsuario,"copiar_button","Copiar",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSecuencialUsuario,"ver_form","Ver",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSecuencialUsuario,"nuevorelaciones_button","Nuevo Rel",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSecuencialUsuario,"guardarcambiostabla_button","Guardar",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSecuencialUsuario,"cerrar_button","Salir",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSecuencialUsuario.setToolTipText("Nuevo"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSecuencialUsuario.setToolTipText("Duplicar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSecuencialUsuario.setToolTipText("Copiar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSecuencialUsuario.setToolTipText("Ver"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSecuencialUsuario.setToolTipText("Nuevo Rel"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSecuencialUsuario.setToolTipText("Guardar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSecuencialUsuario.setToolTipText("Salir"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSecuencialUsuario";
		inputMap = this.jButtonNuevoSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSecuencialUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSecuencialUsuario"));
		
		//DUPLICAR
		sMapKey = "DuplicarSecuencialUsuario";
		inputMap = this.jButtonDuplicarSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSecuencialUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSecuencialUsuario"));
		
		//COPIAR
		sMapKey = "CopiarSecuencialUsuario";
		inputMap = this.jButtonCopiarSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSecuencialUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSecuencialUsuario"));
		
		//VEr FORM
		sMapKey = "VerFormSecuencialUsuario";
		inputMap = this.jButtonVerFormSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSecuencialUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSecuencialUsuario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSecuencialUsuario";
		inputMap = this.jButtonNuevoRelacionesSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSecuencialUsuario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSecuencialUsuario";
		inputMap = this.jButtonModificarSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSecuencialUsuario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSecuencialUsuario";
		inputMap = this.jButtonCerrarSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSecuencialUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSecuencialUsuario";
		inputMap = this.jButtonGuardarCambiosTablaSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSecuencialUsuario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SecuencialUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SecuencialUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SecuencialUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SecuencialUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SecuencialUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSecuencialUsuario.setName("jPanelParametrosReportesSecuencialUsuario"); 
		
		this.jPanelParametrosReportesAccionesSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSecuencialUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSecuencialUsuario.setName("jPanelParametrosReportesAccionesSecuencialUsuario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSecuencialUsuario = new JButtonMe();
		this.jButtonRecargarInformacionSecuencialUsuario.setText("Recargar");
		this.jButtonRecargarInformacionSecuencialUsuario.setToolTipText("Recargar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSecuencialUsuario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSecuencialUsuario = new JButtonMe();
		this.jButtonProcesarInformacionSecuencialUsuario.setText("Procesar");
		this.jButtonProcesarInformacionSecuencialUsuario.setToolTipText("Procesar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSecuencialUsuario.setVisible(false);
			
		this.jButtonProcesarInformacionSecuencialUsuario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSecuencialUsuario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSecuencialUsuario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSecuencialUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSecuencialUsuario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSecuencialUsuario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSecuencialUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSecuencialUsuario.setText("TIPO");       
		this.jComboBoxTiposReportesSecuencialUsuario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSecuencialUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSecuencialUsuario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSecuencialUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSecuencialUsuario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSecuencialUsuario.setText("Paginacion");
		this.jComboBoxTiposPaginacionSecuencialUsuario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSecuencialUsuario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSecuencialUsuario.setText("Accion");
		this.jComboBoxTiposRelacionesSecuencialUsuario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSecuencialUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSecuencialUsuario.setText("Accion");
		this.jComboBoxTiposAccionesSecuencialUsuario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSecuencialUsuario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSecuencialUsuario.setText("Accion");
		this.jComboBoxTiposSeleccionarSecuencialUsuario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSecuencialUsuario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSecuencialUsuario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSecuencialUsuario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSecuencialUsuario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSecuencialUsuario = new JLabelMe();
		
		this.jLabelAccionesSecuencialUsuario.setText("Acciones");		
		this.jLabelAccionesSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSecuencialUsuario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSecuencialUsuario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSecuencialUsuario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSecuencialUsuario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSecuencialUsuario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSecuencialUsuario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSecuencialUsuario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSecuencialUsuario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSecuencialUsuario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSecuencialUsuario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSecuencialUsuario.setText("Graf.");
		this.jCheckBoxConGraficoReporteSecuencialUsuario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSecuencialUsuario = new JButtonMe();
		//this.jButtonAnterioresSecuencialUsuario.setText("<<");
        this.jButtonAnterioresSecuencialUsuario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSecuencialUsuario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSecuencialUsuario = new JButtonMe();
		//this.jButtonSiguientesSecuencialUsuario.setText(">>");
        this.jButtonSiguientesSecuencialUsuario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSecuencialUsuario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSecuencialUsuario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSecuencialUsuario.setText("Nue");
        this.jButtonNuevoGuardarCambiosSecuencialUsuario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSecuencialUsuario,"nuevoguardarcambios_button","Nue",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSecuencialUsuario";
		inputMap = this.jButtonNuevoGuardarCambiosSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSecuencialUsuario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSecuencialUsuario";
		inputMap = this.jButtonRecargarInformacionSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSecuencialUsuario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSecuencialUsuario";
		inputMap = this.jButtonSiguientesSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSecuencialUsuario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSecuencialUsuario";
		inputMap = this.jButtonAnterioresSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSecuencialUsuario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSecuencialUsuario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSecuencialUsuario.setMinimumSize(new Dimension(this.getWidth(),SecuencialUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SecuencialUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSecuencialUsuario.setMaximumSize(new Dimension(this.getWidth(),SecuencialUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SecuencialUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSecuencialUsuario.setPreferredSize(new Dimension(this.getWidth(),SecuencialUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SecuencialUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSecuencialUsuario = new GridBagLayout();

			this.jPanelPaginacionSecuencialUsuario.setLayout(gridaBagLayoutPaginacionSecuencialUsuario);						
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = 0;
			this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSecuencialUsuario.add(this.jButtonAnterioresSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
					
						
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSecuencialUsuario.gridy = 0;
			
			this.jPanelPaginacionSecuencialUsuario.add(this.jButtonNuevoGuardarCambiosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
						
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSecuencialUsuario.gridy = 0;
			this.jPanelPaginacionSecuencialUsuario.add(this.jButtonSiguientesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = 1;
			this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSecuencialUsuario.add(this.jButtonNuevoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
						
			
			
			if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
				this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSecuencialUsuario.gridy = 1;
				this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSecuencialUsuario.add(this.jButtonGuardarCambiosTablaSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			}
			
			
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = 1;
			this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSecuencialUsuario.add(this.jButtonDuplicarSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = 1;
			this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSecuencialUsuario.add(this.jButtonCopiarSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = 1;
			this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSecuencialUsuario.add(this.jButtonVerFormSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = 1;
			this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSecuencialUsuario.add(this.jButtonCerrarSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		
		
		
		this.jButtonRecargarInformacionSecuencialUsuario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSecuencialUsuario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSecuencialUsuario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSecuencialUsuario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSecuencialUsuario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSecuencialUsuario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSecuencialUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSecuencialUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSecuencialUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSecuencialUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSecuencialUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSecuencialUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSecuencialUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSecuencialUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSecuencialUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSecuencialUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSecuencialUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSecuencialUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSecuencialUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSecuencialUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSecuencialUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSecuencialUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSecuencialUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSecuencialUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSecuencialUsuario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSecuencialUsuario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSecuencialUsuario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSecuencialUsuario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSecuencialUsuario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSecuencialUsuario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSecuencialUsuario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSecuencialUsuario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSecuencialUsuario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSecuencialUsuario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSecuencialUsuario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSecuencialUsuario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSecuencialUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSecuencialUsuario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SecuencialUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SecuencialUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SecuencialUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SecuencialUsuario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSecuencialUsuario.setLayout(gridaBagParametrosReportesSecuencialUsuario);
			this.jPanelParametrosReportesAccionesSecuencialUsuario.setLayout(gridaBagParametrosReportesAccionesSecuencialUsuario);
			
			
			this.jPanelParametrosAuxiliar1SecuencialUsuario.setLayout(gridaBagParametrosAuxiliar1SecuencialUsuario);
			this.jPanelParametrosAuxiliar2SecuencialUsuario.setLayout(gridaBagParametrosAuxiliar2SecuencialUsuario);
			this.jPanelParametrosAuxiliar3SecuencialUsuario.setLayout(gridaBagParametrosAuxiliar3SecuencialUsuario);
			this.jPanelParametrosAuxiliar4SecuencialUsuario.setLayout(gridaBagParametrosAuxiliar4SecuencialUsuario);
			//this.jPanelParametrosAuxiliar5SecuencialUsuario.setLayout(gridaBagParametrosAuxiliar2SecuencialUsuario);			
			
			
			
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jButtonRecargarInformacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SecuencialUsuario.add(this.jComboBoxTiposPaginacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SecuencialUsuario.add(this.jCheckBoxConAltoMaximoTablaSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SecuencialUsuario.add(this.jComboBoxTiposArchivosReportesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jPanelParametrosAuxiliar1SecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSecuencialUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SecuencialUsuario.add(this.jComboBoxTiposReportesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jPanelParametrosAuxiliar4SecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jComboBoxTiposReportesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jCheckBoxGenerarReporteSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jPanelParametrosAuxiliar2SecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSecuencialUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jLabelAccionesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
				this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSecuencialUsuario.add(this.jButtonAbrirOrderBySecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jComboBoxTiposSeleccionarSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);			
			
			
			/*
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSecuencialUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jCheckBoxSeleccionarTodosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSecuencialUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SecuencialUsuario.add(this.jCheckBoxSeleccionarTodosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);															
				
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSecuencialUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SecuencialUsuario.add(this.jCheckBoxSeleccionadosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jPanelParametrosAuxiliar3SecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jComboBoxTiposAccionesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
	
				
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSecuencialUsuario.add(this.jTextFieldValorCampoGeneralSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSecuencialUsuario = new GridBagLayout();

			this.jScrollPanelDatosSecuencialUsuario.setLayout(gridaBagLayoutDatosSecuencialUsuario);
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = 0;
			this.gridBagConstraintsSecuencialUsuario.gridx = 0;
			
			this.jScrollPanelDatosSecuencialUsuario.add(this.jTableDatosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSecuencialUsuario.setViewportView(this.jTableDatosSecuencialUsuario);
		this.jTableDatosSecuencialUsuario.setFillsViewportHeight(true);
		this.jTableDatosSecuencialUsuario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSecuencialUsuario= new GridBagLayout();
		this.jPanelAccionesSecuencialUsuario.setLayout(gridaBagLayoutAccionesSecuencialUsuario);
		
		
		/*	
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 0;
			
		this.jPanelAccionesSecuencialUsuario.add(this.jButtonNuevoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorAutorizacionSecuencialUsuario= new GridBagLayout();
		gridaBagLayoutBusquedaPorAutorizacionSecuencialUsuario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorAutorizacionSecuencialUsuario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorAutorizacionSecuencialUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorAutorizacionSecuencialUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorAutorizacionSecuencialUsuario.setLayout(gridaBagLayoutBusquedaPorAutorizacionSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 0;
		jPanelBusquedaPorAutorizacionSecuencialUsuario.add(jLabelautorizacionBusquedaPorAutorizacionSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 1;
		jPanelBusquedaPorAutorizacionSecuencialUsuario.add(jTextFieldautorizacionBusquedaPorAutorizacionSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 1;
		gridBagConstraintsSecuencialUsuario.gridx =1;
		jPanelBusquedaPorAutorizacionSecuencialUsuario.add(jButtonBusquedaPorAutorizacionSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		jTabbedPaneBusquedasSecuencialUsuario.addTab("1.-Por Autorizacion ", jPanelBusquedaPorAutorizacionSecuencialUsuario);
		jTabbedPaneBusquedasSecuencialUsuario.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorFechaFinSecuencialUsuario= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaFinSecuencialUsuario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaFinSecuencialUsuario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaFinSecuencialUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaFinSecuencialUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaFinSecuencialUsuario.setLayout(gridaBagLayoutBusquedaPorFechaFinSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 0;
		jPanelBusquedaPorFechaFinSecuencialUsuario.add(jLabelfecha_finBusquedaPorFechaFinSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 1;
		jPanelBusquedaPorFechaFinSecuencialUsuario.add(jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 1;
		gridBagConstraintsSecuencialUsuario.gridx =1;
		jPanelBusquedaPorFechaFinSecuencialUsuario.add(jButtonBusquedaPorFechaFinSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		jTabbedPaneBusquedasSecuencialUsuario.addTab("2.-Por Fecha Fin ", jPanelBusquedaPorFechaFinSecuencialUsuario);
		jTabbedPaneBusquedasSecuencialUsuario.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorFechaInicioSecuencialUsuario= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaInicioSecuencialUsuario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaInicioSecuencialUsuario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaInicioSecuencialUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaInicioSecuencialUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaInicioSecuencialUsuario.setLayout(gridaBagLayoutBusquedaPorFechaInicioSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 0;
		jPanelBusquedaPorFechaInicioSecuencialUsuario.add(jLabelfecha_inicioBusquedaPorFechaInicioSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 1;
		jPanelBusquedaPorFechaInicioSecuencialUsuario.add(jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 1;
		gridBagConstraintsSecuencialUsuario.gridx =1;
		jPanelBusquedaPorFechaInicioSecuencialUsuario.add(jButtonBusquedaPorFechaInicioSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		jTabbedPaneBusquedasSecuencialUsuario.addTab("3.-Por Fecha Inicio ", jPanelBusquedaPorFechaInicioSecuencialUsuario);
		jTabbedPaneBusquedasSecuencialUsuario.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setLayout(gridaBagLayoutBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 0;
		jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.add(jLabelid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 1;
		jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.add(jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario, gridBagConstraintsSecuencialUsuario);


		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 1;
		gridBagConstraintsSecuencialUsuario.gridx = 0;
		jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.add(jLabelid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 1;
		gridBagConstraintsSecuencialUsuario.gridx = 1;
		jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.add(jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 2;
		gridBagConstraintsSecuencialUsuario.gridx =1;
		jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.add(jButtonBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		jTabbedPaneBusquedasSecuencialUsuario.addTab("4.-Por Usuario Por T. Documento General ", jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);
		jTabbedPaneBusquedasSecuencialUsuario.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutBusquedaPorSerieSecuencialUsuario= new GridBagLayout();
		gridaBagLayoutBusquedaPorSerieSecuencialUsuario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorSerieSecuencialUsuario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorSerieSecuencialUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorSerieSecuencialUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorSerieSecuencialUsuario.setLayout(gridaBagLayoutBusquedaPorSerieSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 0;
		jPanelBusquedaPorSerieSecuencialUsuario.add(jLabelserieBusquedaPorSerieSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 1;
		jPanelBusquedaPorSerieSecuencialUsuario.add(jTextFieldserieBusquedaPorSerieSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 1;
		gridBagConstraintsSecuencialUsuario.gridx =1;
		jPanelBusquedaPorSerieSecuencialUsuario.add(jButtonBusquedaPorSerieSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		jTabbedPaneBusquedasSecuencialUsuario.addTab("5.-Por Serie ", jPanelBusquedaPorSerieSecuencialUsuario);
		jTabbedPaneBusquedasSecuencialUsuario.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoGeneralSecuencialUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoGeneralSecuencialUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoGeneralSecuencialUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoGeneralSecuencialUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoGeneralSecuencialUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario.setLayout(gridaBagLayoutFK_IdTipoDocumentoGeneralSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 0;
		jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario.add(jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 1;
		jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario.add(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 1;
		gridBagConstraintsSecuencialUsuario.gridx =1;
		jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario.add(jButtonFK_IdTipoDocumentoGeneralSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		jTabbedPaneBusquedasSecuencialUsuario.addTab("6.-Por T. Documento General ", jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario);
		jTabbedPaneBusquedasSecuencialUsuario.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdUsuarioSecuencialUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdUsuarioSecuencialUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUsuarioSecuencialUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUsuarioSecuencialUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUsuarioSecuencialUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUsuarioSecuencialUsuario.setLayout(gridaBagLayoutFK_IdUsuarioSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 0;
		jPanelFK_IdUsuarioSecuencialUsuario.add(jLabelid_usuarioFK_IdUsuarioSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 0;
		gridBagConstraintsSecuencialUsuario.gridx = 1;
		jPanelFK_IdUsuarioSecuencialUsuario.add(jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencialUsuario.gridy = 1;
		gridBagConstraintsSecuencialUsuario.gridx =1;
		jPanelFK_IdUsuarioSecuencialUsuario.add(jButtonFK_IdUsuarioSecuencialUsuario, gridBagConstraintsSecuencialUsuario);

		jTabbedPaneBusquedasSecuencialUsuario.addTab("7.-Por Usuario ", jPanelFK_IdUsuarioSecuencialUsuario);
		jTabbedPaneBusquedasSecuencialUsuario.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSecuencialUsuario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();						
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSecuencialUsuario.gridx = 0;		
			//this.gridBagConstraintsSecuencialUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSecuencialUsuario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSecuencialUsuario.gridx = 0;		
		//this.gridBagConstraintsSecuencialUsuario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSecuencialUsuario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSecuencialUsuario.gridx = 0;		
			this.gridBagConstraintsSecuencialUsuario.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSecuencialUsuario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencialUsuario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);								
		
		
		/*
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencialUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		*/		
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSecuencialUsuario.gridx =0;
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSecuencialUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
				
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencialUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SecuencialUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSecuencialUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSecuencialUsuario = new GridBagLayout();
			this.jPanelBusquedasParametrosSecuencialUsuario.setLayout(gridaBagLayoutBusquedasParametrosSecuencialUsuario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSecuencialUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSecuencialUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSecuencialUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSecuencialUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencialUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			
			
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencialUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		
			
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSecuencialUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSecuencialUsuario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSecuencialUsuario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSecuencialUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSecuencialUsuario.setName("jPanelReporteDinamicoSecuencialUsuario"); 
		
		this.jPanelReporteDinamicoSecuencialUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSecuencialUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSecuencialUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSecuencialUsuario.setLayout(gridaBagLayoutReporteDinamicoSecuencialUsuario);
		
		
		this.jInternalFrameReporteDinamicoSecuencialUsuario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSecuencialUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSecuencialUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSecuencialUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSecuencialUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSecuencialUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSecuencialUsuario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSecuencialUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSecuencialUsuario.setResizable(true);
	    this.jInternalFrameReporteDinamicoSecuencialUsuario.setClosable(true);
	    this.jInternalFrameReporteDinamicoSecuencialUsuario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSecuencialUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSecuencialUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSecuencialUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuencial Usuarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSecuencialUsuario = new JLabelMe();

		this.jLabelColumnasSelectReporteSecuencialUsuario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSecuencialUsuario.add(this.jLabelColumnasSelectReporteSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSecuencialUsuario = new JList<Reporte>();
		this.jListColumnasSelectReporteSecuencialUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSecuencialUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSecuencialUsuario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSecuencialUsuario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSecuencialUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSecuencialUsuario=new JScrollPane(this.jListColumnasSelectReporteSecuencialUsuario);
			
			this.jScrollColumnasSelectReporteSecuencialUsuario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSecuencialUsuario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSecuencialUsuario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSecuencialUsuario.add(this.jListColumnasSelectReporteSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		this.jPanelReporteDinamicoSecuencialUsuario.add(this.jScrollColumnasSelectReporteSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSecuencialUsuario = new JLabelMe();

		this.jLabelRelacionesSelectReporteSecuencialUsuario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSecuencialUsuario = new JList<Reporte>();
		this.jListRelacionesSelectReporteSecuencialUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSecuencialUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSecuencialUsuario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSecuencialUsuario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSecuencialUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSecuencialUsuario=new JScrollPane(this.jListRelacionesSelectReporteSecuencialUsuario);
			
			this.jScrollRelacionesSelectReporteSecuencialUsuario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSecuencialUsuario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSecuencialUsuario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSecuencialUsuario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSecuencialUsuario = new JComboBoxMe();
		this.jListColumnasValoresGraficoSecuencialUsuario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSecuencialUsuario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSecuencialUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSecuencialUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSecuencialUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSecuencialUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSecuencialUsuario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSecuencialUsuario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSecuencialUsuario.add(this.jLabelGenerarExcelReporteDinamicoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSecuencialUsuario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSecuencialUsuario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSecuencialUsuario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSecuencialUsuario.setToolTipText("Generar EXCEL"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSecuencialUsuario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSecuencialUsuario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSecuencialUsuario.add(this.jButtonGenerarExcelReporteDinamicoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSecuencialUsuario.add(this.jComboBoxTiposReportesDinamicoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSecuencialUsuario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSecuencialUsuario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSecuencialUsuario.add(this.jLabelTiposArchivoReporteDinamicoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSecuencialUsuario.add(this.jComboBoxTiposArchivosReportesDinamicoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSecuencialUsuario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSecuencialUsuario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSecuencialUsuario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSecuencialUsuario.setToolTipText("Generar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSecuencialUsuario.add(this.jButtonGenerarReporteDinamicoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSecuencialUsuario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSecuencialUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSecuencialUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSecuencialUsuario.setToolTipText("Cancelar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSecuencialUsuario.add(this.jButtonCerrarReporteDinamicoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSecuencialUsuario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSecuencialUsuario= new JScrollPane(jPanelReporteDinamicoSecuencialUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSecuencialUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSecuencialUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSecuencialUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuencial Usuarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSecuencialUsuario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSecuencialUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSecuencialUsuario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSecuencialUsuario);
		this.jInternalFrameReporteDinamicoSecuencialUsuario.getContentPane().add(this.jScrollPanelReporteDinamicoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSecuencialUsuario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSecuencialUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSecuencialUsuario.setName("jPanelImportacionSecuencialUsuario"); 
		
		this.jPanelImportacionSecuencialUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSecuencialUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSecuencialUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSecuencialUsuario.setLayout(gridaBagLayoutImportacionSecuencialUsuario);
		
		
		this.jInternalFrameImportacionSecuencialUsuario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSecuencialUsuario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSecuencialUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSecuencialUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSecuencialUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSecuencialUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSecuencialUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSecuencialUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSecuencialUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSecuencialUsuario.setResizable(true);
	    this.jInternalFrameImportacionSecuencialUsuario.setClosable(true);
	    this.jInternalFrameImportacionSecuencialUsuario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSecuencialUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSecuencialUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSecuencialUsuario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSecuencialUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSecuencialUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSecuencialUsuario.setResizable(true);
	    this.jInternalFrameImportacionSecuencialUsuario.setClosable(true);
	    this.jInternalFrameImportacionSecuencialUsuario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSecuencialUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSecuencialUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSecuencialUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuencial Usuarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSecuencialUsuario = new JLabelMe();

		this.jLabelArchivoImportacionSecuencialUsuario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSecuencialUsuario.add(this.jLabelArchivoImportacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSecuencialUsuario = new JFileChooser();		
		this.jFileChooserImportacionSecuencialUsuario.setToolTipText("ESCOGER ARCHIVO"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSecuencialUsuario = new JButtonMe();
		this.jButtonAbrirImportacionSecuencialUsuario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSecuencialUsuario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSecuencialUsuario.setToolTipText("Generar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSecuencialUsuario.add(this.jButtonAbrirImportacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSecuencialUsuario = new JLabelMe();

		this.jLabelPathArchivoImportacionSecuencialUsuario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSecuencialUsuario.add(this.jLabelPathArchivoImportacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSecuencialUsuario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSecuencialUsuario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSecuencialUsuario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSecuencialUsuario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSecuencialUsuario.add(this.jTextFieldPathArchivoImportacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSecuencialUsuario = new JButtonMe();
		this.jButtonGenerarImportacionSecuencialUsuario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSecuencialUsuario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSecuencialUsuario.setToolTipText("Generar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSecuencialUsuario.add(this.jButtonGenerarImportacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSecuencialUsuario = new JButtonMe();
		this.jButtonCerrarImportacionSecuencialUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSecuencialUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSecuencialUsuario.setToolTipText("Cancelar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSecuencialUsuario.add(this.jButtonCerrarImportacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSecuencialUsuario = new GridBagLayout();
		
		this.jScrollPanelImportacionSecuencialUsuario= new JScrollPane(jPanelImportacionSecuencialUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy =iPosYImportacion;
		this.gridBagConstraintsSecuencialUsuario.gridx =iPosXImportacion;
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSecuencialUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSecuencialUsuario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSecuencialUsuario);
		this.jInternalFrameImportacionSecuencialUsuario.getContentPane().add(this.jScrollPanelImportacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySecuencialUsuario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySecuencialUsuario = new JButtonMe();
			this.jButtonAbrirOrderBySecuencialUsuario.setText("Orden");
			this.jButtonAbrirOrderBySecuencialUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySecuencialUsuario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySecuencialUsuario";
			inputMap = this.jButtonAbrirOrderBySecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySecuencialUsuario"));
		
		
			GridBagLayout gridaBagLayoutOrderBySecuencialUsuario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySecuencialUsuario.setName("jPanelOrderBySecuencialUsuario"); 
			
			this.jPanelOrderBySecuencialUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySecuencialUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySecuencialUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySecuencialUsuario.setLayout(gridaBagLayoutOrderBySecuencialUsuario);
			
			
			this.jTableDatosSecuencialUsuarioOrderBy = new JTableMe();        
			this.jTableDatosSecuencialUsuarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSecuencialUsuarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSecuencialUsuarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSecuencialUsuarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSecuencialUsuarioOrderBy.setViewportView(this.jTableDatosSecuencialUsuarioOrderBy);
			this.jTableDatosSecuencialUsuarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSecuencialUsuarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySecuencialUsuario= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySecuencialUsuario= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySecuencialUsuario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSecuencialUsuario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySecuencialUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySecuencialUsuario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySecuencialUsuario.setTitle("Orden");
			this.jInternalFrameOrderBySecuencialUsuario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySecuencialUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySecuencialUsuario.setResizable(true);
			this.jInternalFrameOrderBySecuencialUsuario.setClosable(true);
			this.jInternalFrameOrderBySecuencialUsuario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySecuencialUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySecuencialUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySecuencialUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuencial Usuarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSecuencialUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSecuencialUsuario.ipady =150;
				
			this.jPanelOrderBySecuencialUsuario.add(jScrollPanelDatosSecuencialUsuarioOrderBy, this.gridBagConstraintsSecuencialUsuario);//this.jTableDatosSecuencialUsuarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySecuencialUsuario = new JButtonMe();
			this.jButtonCerrarOrderBySecuencialUsuario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySecuencialUsuario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySecuencialUsuario.setToolTipText("Cancelar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSecuencialUsuario.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySecuencialUsuario.add(this.jButtonCerrarOrderBySecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSecuencialUsuario = new GridBagLayout();
			
			this.jScrollPanelOrderBySecuencialUsuario= new JScrollPane(jPanelOrderBySecuencialUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.gridy =iPosYOrderBy;
			this.gridBagConstraintsSecuencialUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySecuencialUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySecuencialUsuario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSecuencialUsuario);
			
			this.jInternalFrameOrderBySecuencialUsuario.getContentPane().add(this.jScrollPanelOrderBySecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);			
		
		} else {
			this.jButtonAbrirOrderBySecuencialUsuario = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.secuencialusuarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSecuencialUsuario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSecuencialUsuario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSecuencialUsuario.getRowHeight();//SecuencialUsuarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SecuencialUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSecuencialUsuario.isSelected()) {
					iHeightTable=SecuencialUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SecuencialUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SecuencialUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SecuencialUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSecuencialUsuario.isSelected()) {
					iHeightTable=SecuencialUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SecuencialUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SecuencialUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSecuencialUsuario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSecuencialUsuario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSecuencialUsuario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSecuencialUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSecuencialUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSecuencialUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySecuencialUsuario!=null && this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy()!=null) {
			//if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySecuencialUsuario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySecuencialUsuario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySecuencialUsuario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSecuencialUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSecuencialUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSecuencialUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=secuencialusuarioLogic.getSecuencialUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=secuencialusuarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SecuencialUsuario> TraerSecuencialUsuarioBeans(List<SecuencialUsuario> secuencialusuarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(SecuencialUsuario secuencialusuario:secuencialusuarios) {
					
				if(!(SecuencialUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SecuencialUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					secuencialusuario.setsDetalleGeneralEntityReporte(SecuencialUsuarioConstantesFunciones.getSecuencialUsuarioDescripcion(secuencialusuario));
										
					secuencialusuario.setesta_activo_descripcion(SecuencialUsuarioConstantesFunciones.getesta_activoDescripcion(secuencialusuario));	
					
						
					
				} else  {
							
					//secuencialusuario.setsDetalleGeneralEntityReporte(secuencialusuario.getsDetalleGeneralEntityReporte());
										
				}
				
				//secuencialusuariobeans.add(secuencialusuariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return secuencialusuarios;
    }
	//PARA REPORTES FIN
}
