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
import com.bydan.erp.contabilidad.util.ParametroContabilidadDefectoConstantesFunciones;

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
public class ParametroContabilidadDefectoJInternalFrame extends ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroContabilidadDefecto;
	
	protected JMenuBar jmenuBarParametroContabilidadDefecto;
	
	protected JMenu jmenuParametroContabilidadDefecto;
	protected JMenu jmenuDatosParametroContabilidadDefecto;
	protected JMenu jmenuArchivoParametroContabilidadDefecto;
	protected JMenu jmenuAccionesParametroContabilidadDefecto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroContabilidadDefecto;	
	protected GridBagConstraints gridBagConstraintsParametroContabilidadDefecto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroContabilidadDefectoDetalleFormJInternalFrame jInternalFrameDetalleFormParametroContabilidadDefecto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroContabilidadDefecto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroContabilidadDefecto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoMonedaBeanSwingJInternalFrame tipomonedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomoneda="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoIntervaloBeanSwingJInternalFrame tipointervaloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipointervalo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected EstadoAsientoContableBeanSwingJInternalFrame estadoasientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoasientocontable="";
	
	public ParametroContabilidadDefectoSessionBean parametrocontabilidaddefectoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoMonedaSessionBean tipomonedaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoIntervaloSessionBean tipointervaloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public EstadoAsientoContableSessionBean estadoasientocontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroContabilidadDefecto> parametrocontabilidaddefectos;		
	public List<ParametroContabilidadDefecto> parametrocontabilidaddefectosEliminados;	
	public List<ParametroContabilidadDefecto> parametrocontabilidaddefectosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroContabilidadDefecto;		
	protected JButton jButtonAbrirOrderByParametroContabilidadDefecto;
	
	
	//protected JPanel jPanelOrderByParametroContabilidadDefecto;
	//public JScrollPane jScrollPanelOrderByParametroContabilidadDefecto;	
	//protected JButton jButtonCerrarOrderByParametroContabilidadDefecto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroContabilidadDefectoLogic parametrocontabilidaddefectoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroContabilidadDefecto;
	public JScrollPane jScrollPanelDatosEdicionParametroContabilidadDefecto;
	public JScrollPane jScrollPanelDatosGeneralParametroContabilidadDefecto;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroContabilidadDefectoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroContabilidadDefecto;
	//public JScrollPane jScrollPanelImportacionParametroContabilidadDefecto;
	
	
	
	protected JPanel jPanelAccionesParametroContabilidadDefecto;
	
    protected JPanel jPanelPaginacionParametroContabilidadDefecto;
    protected JPanel jPanelParametrosReportesParametroContabilidadDefecto;
	protected JPanel jPanelParametrosReportesAccionesParametroContabilidadDefecto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroContabilidadDefecto;
	protected JPanel jPanelParametrosAuxiliar2ParametroContabilidadDefecto;
	protected JPanel jPanelParametrosAuxiliar3ParametroContabilidadDefecto;
	protected JPanel jPanelParametrosAuxiliar4ParametroContabilidadDefecto;
	//protected JPanel jPanelParametrosAuxiliar5ParametroContabilidadDefecto;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroContabilidadDefecto;
	//protected JPanel jPanelImportacionParametroContabilidadDefecto;
	
	
	public JTable jTableDatosParametroContabilidadDefecto;
	
	
	
	//public JTable jTableDatosParametroContabilidadDefectoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroContabilidadDefecto;
	protected JButton jButtonDuplicarParametroContabilidadDefecto;
	protected JButton jButtonCopiarParametroContabilidadDefecto;
	protected JButton jButtonVerFormParametroContabilidadDefecto;
	protected JButton jButtonNuevoRelacionesParametroContabilidadDefecto;
	protected JButton jButtonModificarParametroContabilidadDefecto;
	
    protected JButton jButtonGuardarCambiosTablaParametroContabilidadDefecto;
	protected JButton jButtonCerrarParametroContabilidadDefecto;
	
	
	protected JButton jButtonRecargarInformacionParametroContabilidadDefecto;
	protected JButton jButtonProcesarInformacionParametroContabilidadDefecto;
	
	
	protected JButton jButtonAnterioresParametroContabilidadDefecto;
	protected JButton jButtonSiguientesParametroContabilidadDefecto;
	protected JButton jButtonNuevoGuardarCambiosParametroContabilidadDefecto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroContabilidadDefecto;
	//protected JButton jButtonCerrarReporteDinamicoParametroContabilidadDefecto;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroContabilidadDefecto;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroContabilidadDefecto;
	//protected JButton jButtonGenerarImportacionParametroContabilidadDefecto;
	//protected JButton jButtonCerrarImportacionParametroContabilidadDefecto;
	//protected JFileChooser jFileChooserImportacionParametroContabilidadDefecto;
	//protected File fileImportacionParametroContabilidadDefecto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroContabilidadDefecto;
	protected JButton jButtonDuplicarToolBarParametroContabilidadDefecto;
	protected JButton jButtonNuevoRelacionesToolBarParametroContabilidadDefecto;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroContabilidadDefecto;
	protected JButton jButtonCopiarToolBarParametroContabilidadDefecto;
	protected JButton jButtonVerFormToolBarParametroContabilidadDefecto;
	public JButton jButtonGuardarCambiosTablaToolBarParametroContabilidadDefecto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroContabilidadDefecto;
	protected JButton jButtonCerrarToolBarParametroContabilidadDefecto;
	
	protected JButton jButtonRecargarInformacionToolBarParametroContabilidadDefecto;
	protected JButton jButtonProcesarInformacionToolBarParametroContabilidadDefecto;
	protected JButton jButtonAnterioresToolBarParametroContabilidadDefecto;
	protected JButton jButtonSiguientesToolBarParametroContabilidadDefecto;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroContabilidadDefecto;
	protected JButton jButtonAbrirOrderByToolBarParametroContabilidadDefecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroContabilidadDefecto;
	protected JMenuItem jMenuItemDuplicarParametroContabilidadDefecto;
	protected JMenuItem jMenuItemNuevoRelacionesParametroContabilidadDefecto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroContabilidadDefecto;
	protected JMenuItem jMenuItemCopiarParametroContabilidadDefecto;
	protected JMenuItem jMenuItemVerFormParametroContabilidadDefecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroContabilidadDefecto;
	protected JMenuItem jMenuItemCerrarParametroContabilidadDefecto;
	protected JMenuItem jMenuItemDetalleCerrarParametroContabilidadDefecto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroContabilidadDefecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroContabilidadDefecto;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroContabilidadDefecto;
	protected JMenuItem jMenuItemProcesarInformacionParametroContabilidadDefecto;
	protected JMenuItem jMenuItemAnterioresParametroContabilidadDefecto;
	protected JMenuItem jMenuItemSiguientesParametroContabilidadDefecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroContabilidadDefecto;
	protected JMenuItem jMenuItemAbrirOrderByParametroContabilidadDefecto;
	protected JMenuItem jMenuItemMostrarOcultarParametroContabilidadDefecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroContabilidadDefecto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroContabilidadDefecto;
	protected JCheckBox jCheckBoxSeleccionadosParametroContabilidadDefecto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroContabilidadDefecto;
	protected JCheckBox jCheckBoxConGraficoReporteParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroContabilidadDefecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroContabilidadDefecto;
	protected JTextField jTextFieldValorCampoGeneralParametroContabilidadDefecto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroContabilidadDefecto;
	//public JList<Reporte> jListColumnasSelectReporteParametroContabilidadDefecto;
	//public JScrollPane jScrollColumnasSelectReporteParametroContabilidadDefecto;
	
	//public JLabel jLabelRelacionesSelectReporteParametroContabilidadDefecto;
	//public JList<Reporte> jListRelacionesSelectReporteParametroContabilidadDefecto;
	//public JScrollPane jScrollRelacionesSelectReporteParametroContabilidadDefecto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroContabilidadDefecto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroContabilidadDefecto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroContabilidadDefecto;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroContabilidadDefecto;
	
		
	//public JLabel jLabelArchivoImportacionParametroContabilidadDefecto;	
	//public JLabel jLabelPathArchivoImportacionParametroContabilidadDefecto;
	//protected JTextField jTextFieldPathArchivoImportacionParametroContabilidadDefecto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroContabilidadDefecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroContabilidadDefecto;
	
	//public JLabel jLabelColumnaCategoriaValorParametroContabilidadDefecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroContabilidadDefecto;
	
	//public JLabel jLabelColumnasValoresGraficoParametroContabilidadDefecto;
	//public JList<Reporte> jListColumnasValoresGraficoParametroContabilidadDefecto;
	//public JScrollPane jScrollColumnasValoresGraficoParametroContabilidadDefecto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroContabilidadDefecto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroContabilidadDefecto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroContabilidadDefecto;
	public JPanel jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto;
	public JButton jButtonFK_IdEstadoAsientoContableParametroContabilidadDefecto;
	public JPanel jPanelFK_IdModuloParametroContabilidadDefecto;
	public JButton jButtonFK_IdModuloParametroContabilidadDefecto;
	public JPanel jPanelFK_IdTipoDocumentoParametroContabilidadDefecto;
	public JButton jButtonFK_IdTipoDocumentoParametroContabilidadDefecto;
	public JPanel jPanelFK_IdTipoIntervaloParametroContabilidadDefecto;
	public JButton jButtonFK_IdTipoIntervaloParametroContabilidadDefecto;
	public JPanel jPanelFK_IdTipoMonedaParametroContabilidadDefecto;
	public JButton jButtonFK_IdTipoMonedaParametroContabilidadDefecto;
	public JPanel jPanelFK_IdTipoMovimientoParametroContabilidadDefecto;
	public JButton jButtonFK_IdTipoMovimientoParametroContabilidadDefecto;
	
	public JPanel jPanelid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto;
	public JLabel jLabelid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto;
	public JButton jButtonid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloFK_IdModuloParametroContabilidadDefecto;
	public JLabel jLabelid_moduloFK_IdModuloParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto;
	public JButton jButtonid_moduloFK_IdModuloParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloParametroContabilidadDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto;
	public JLabel jLabelid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto;
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto;
	public JLabel jLabelid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto;
	public JButton jButtonid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto;
	public JLabel jLabelid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto;
	public JButton jButtonid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto;
	public JLabel jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto;
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefectoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroContabilidadDefectoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroContabilidadDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContabilidadDefectoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroContabilidadDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContabilidadDefectoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroContabilidadDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContabilidadDefectoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroContabilidadDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroContabilidadDefecto)	{
		this.jButtonRecargarInformacionParametroContabilidadDefecto = jButtonRecargarInformacionParametroContabilidadDefecto;
	}
	
	public JButton getjButtonProcesarInformacionParametroContabilidadDefecto() {
		return this.jButtonProcesarInformacionParametroContabilidadDefecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroContabilidadDefecto)	{
		this.jButtonProcesarInformacionParametroContabilidadDefecto = jButtonProcesarInformacionParametroContabilidadDefecto;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroContabilidadDefecto() {
		return this.jButtonRecargarInformacionParametroContabilidadDefecto;
	}
	
	
	public List<ParametroContabilidadDefecto> getparametrocontabilidaddefectos() {
		return this.parametrocontabilidaddefectos;
	}

	public void setparametrocontabilidaddefectos(List<ParametroContabilidadDefecto> parametrocontabilidaddefectos) {
		this.parametrocontabilidaddefectos = parametrocontabilidaddefectos;
	}
	
	public List<ParametroContabilidadDefecto> getparametrocontabilidaddefectosAux() {
		return this.parametrocontabilidaddefectosAux;
	}

	public void setparametrocontabilidaddefectosAux(List<ParametroContabilidadDefecto> parametrocontabilidaddefectosAux) {
		this.parametrocontabilidaddefectosAux = parametrocontabilidaddefectosAux;
	}
	
	public List<ParametroContabilidadDefecto> getparametrocontabilidaddefectosEliminados() {
		return this.parametrocontabilidaddefectosEliminados;
	}

	public void setParametroContabilidadDefectosEliminados(List<ParametroContabilidadDefecto> parametrocontabilidaddefectosEliminados) {
		this.parametrocontabilidaddefectosEliminados = parametrocontabilidaddefectosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroContabilidadDefecto() {
		return jComboBoxTiposSeleccionarParametroContabilidadDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroContabilidadDefecto(
			JComboBox jComboBoxTiposSeleccionarParametroContabilidadDefecto) {
		this.jComboBoxTiposSeleccionarParametroContabilidadDefecto = jComboBoxTiposSeleccionarParametroContabilidadDefecto;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroContabilidadDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroContabilidadDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroContabilidadDefecto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroContabilidadDefecto() {
		return jTextFieldValorCampoGeneralParametroContabilidadDefecto;
	}

	public void setjTextFieldValorCampoGeneralParametroContabilidadDefecto(
			JTextField jTextFieldValorCampoGeneralParametroContabilidadDefecto) {
		this.jTextFieldValorCampoGeneralParametroContabilidadDefecto = jTextFieldValorCampoGeneralParametroContabilidadDefecto;
	}

	public void setBorderResaltarValorCampoGeneralParametroContabilidadDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContabilidadDefecto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroContabilidadDefecto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroContabilidadDefecto() {
		return this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto;
	}

	public void setjCheckBoxSeleccionarTodosParametroContabilidadDefecto(
			JCheckBox jCheckBoxSeleccionarTodosParametroContabilidadDefecto) {
		this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto = jCheckBoxSeleccionarTodosParametroContabilidadDefecto;
	}

	public void setBorderResaltarSeleccionarTodosParametroContabilidadDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContabilidadDefecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroContabilidadDefecto() {
		return this.jCheckBoxSeleccionadosParametroContabilidadDefecto;
	}

	public void setjCheckBoxSeleccionadosParametroContabilidadDefecto(
			JCheckBox jCheckBoxSeleccionadosParametroContabilidadDefecto) {
		this.jCheckBoxSeleccionadosParametroContabilidadDefecto = jCheckBoxSeleccionadosParametroContabilidadDefecto;
	}
	
	public void setBorderResaltarSeleccionadosParametroContabilidadDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContabilidadDefecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroContabilidadDefecto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroContabilidadDefecto() {
		return this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroContabilidadDefecto(
			JComboBox jComboBoxTiposArchivosReportesParametroContabilidadDefecto) {
		this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto = jComboBoxTiposArchivosReportesParametroContabilidadDefecto;
	}

	public void setBorderResaltarTiposArchivosReportesParametroContabilidadDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContabilidadDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroContabilidadDefecto() {
		return this.jComboBoxTiposReportesParametroContabilidadDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroContabilidadDefecto(
			JComboBox jComboBoxTiposReportesParametroContabilidadDefecto) {
		this.jComboBoxTiposReportesParametroContabilidadDefecto = jComboBoxTiposReportesParametroContabilidadDefecto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroContabilidadDefecto() {
	//	return jComboBoxTiposReportesDinamicoParametroContabilidadDefecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroContabilidadDefecto(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroContabilidadDefecto) {
	//	this.jComboBoxTiposReportesDinamicoParametroContabilidadDefecto = jComboBoxTiposReportesDinamicoParametroContabilidadDefecto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto = jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto;
	//}
	
	public void setBorderResaltarTiposReportesParametroContabilidadDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContabilidadDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroContabilidadDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroContabilidadDefecto() {
		return this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroContabilidadDefecto(
			JComboBox jComboBoxTiposGraficosReportesParametroContabilidadDefecto) {
		this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto = jComboBoxTiposGraficosReportesParametroContabilidadDefecto;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroContabilidadDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContabilidadDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroContabilidadDefecto() {
		return this.jComboBoxTiposPaginacionParametroContabilidadDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroContabilidadDefecto(
			JComboBox jComboBoxTiposPaginacionParametroContabilidadDefecto) {
		this.jComboBoxTiposPaginacionParametroContabilidadDefecto = jComboBoxTiposPaginacionParametroContabilidadDefecto;
	}
	
	public void setBorderResaltarTiposPaginacionParametroContabilidadDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContabilidadDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroContabilidadDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroContabilidadDefecto() {
		return this.jComboBoxTiposRelacionesParametroContabilidadDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroContabilidadDefecto() {
		return this.jComboBoxTiposAccionesParametroContabilidadDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroContabilidadDefecto(
			JComboBox jComboBoxTiposRelacionesParametroContabilidadDefecto) {
		this.jComboBoxTiposRelacionesParametroContabilidadDefecto = jComboBoxTiposRelacionesParametroContabilidadDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroContabilidadDefecto(
			JComboBox jComboBoxTiposAccionesParametroContabilidadDefecto) {
		this.jComboBoxTiposAccionesParametroContabilidadDefecto = jComboBoxTiposAccionesParametroContabilidadDefecto;
	}
	
	public void setBorderResaltarTiposRelacionesParametroContabilidadDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContabilidadDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroContabilidadDefecto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroContabilidadDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContabilidadDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroContabilidadDefecto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroContabilidadDefecto() {
	//	return jCheckBoxConGraficoDinamicoParametroContabilidadDefecto;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroContabilidadDefecto(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroContabilidadDefecto) {
	//	this.jCheckBoxConGraficoDinamicoParametroContabilidadDefecto = jCheckBoxConGraficoDinamicoParametroContabilidadDefecto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroContabilidadDefecto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroContabilidadDefecto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroContabilidadDefecto .setBorder(borderResaltar);		
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
		this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		
		this.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroContabilidadDefectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Contabilidad Defecto MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroContabilidadDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroContabilidadDefecto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"nuevo","nuevo","Nuevo"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"duplicar","duplicar","Duplicar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"copiar","copiar","Copiar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"ver_form","ver_form","Ver"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"recargar","recargar","Recargar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,
							"cerrar","cerrar","Salir"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroContabilidadDefecto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroContabilidadDefecto;
			
				this.jButtonProcesarInformacionToolBarParametroContabilidadDefecto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroContabilidadDefecto;
				
		//protected JButton jButtonModificarToolBarParametroContabilidadDefecto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroContabilidadDefecto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroContabilidadDefecto=new JMenuMe("General");
		this.jmenuArchivoParametroContabilidadDefecto=new JMenuMe("Archivo");
		this.jmenuAccionesParametroContabilidadDefecto=new JMenuMe("Acciones");
		this.jmenuDatosParametroContabilidadDefecto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroContabilidadDefecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroContabilidadDefecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroContabilidadDefecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroContabilidadDefecto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroContabilidadDefecto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroContabilidadDefecto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroContabilidadDefecto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroContabilidadDefecto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroContabilidadDefecto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroContabilidadDefecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroContabilidadDefecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroContabilidadDefecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroContabilidadDefecto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroContabilidadDefecto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroContabilidadDefecto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroContabilidadDefecto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroContabilidadDefecto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroContabilidadDefecto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroContabilidadDefecto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroContabilidadDefecto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroContabilidadDefecto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroContabilidadDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroContabilidadDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroContabilidadDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroContabilidadDefecto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroContabilidadDefecto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroContabilidadDefecto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroContabilidadDefecto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroContabilidadDefecto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroContabilidadDefecto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroContabilidadDefecto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroContabilidadDefecto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroContabilidadDefecto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroContabilidadDefecto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroContabilidadDefecto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroContabilidadDefecto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroContabilidadDefecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroContabilidadDefecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroContabilidadDefecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroContabilidadDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroContabilidadDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroContabilidadDefecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroContabilidadDefecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroContabilidadDefecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroContabilidadDefecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroContabilidadDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroContabilidadDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroContabilidadDefecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroContabilidadDefecto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroContabilidadDefecto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroContabilidadDefecto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroContabilidadDefecto.add(this.jMenuItemCerrarParametroContabilidadDefecto);
			
			this.jmenuAccionesParametroContabilidadDefecto.add(this.jMenuItemNuevoParametroContabilidadDefecto);
			this.jmenuAccionesParametroContabilidadDefecto.add(this.jMenuItemNuevoGuardarCambiosParametroContabilidadDefecto);
			this.jmenuAccionesParametroContabilidadDefecto.add(this.jMenuItemNuevoRelacionesParametroContabilidadDefecto);
			this.jmenuAccionesParametroContabilidadDefecto.add(this.jMenuItemGuardarCambiosTablaParametroContabilidadDefecto);		
			this.jmenuAccionesParametroContabilidadDefecto.add(this.jMenuItemDuplicarParametroContabilidadDefecto);		
			this.jmenuAccionesParametroContabilidadDefecto.add(this.jMenuItemCopiarParametroContabilidadDefecto);		
			this.jmenuAccionesParametroContabilidadDefecto.add(this.jMenuItemVerFormParametroContabilidadDefecto);		
			
			this.jmenuDatosParametroContabilidadDefecto.add(this.jMenuItemRecargarInformacionParametroContabilidadDefecto);				
			this.jmenuDatosParametroContabilidadDefecto.add(this.jMenuItemAnterioresParametroContabilidadDefecto);				
			this.jmenuDatosParametroContabilidadDefecto.add(this.jMenuItemSiguientesParametroContabilidadDefecto);				
			this.jmenuDatosParametroContabilidadDefecto.add(this.jMenuItemAbrirOrderByParametroContabilidadDefecto);				
			this.jmenuDatosParametroContabilidadDefecto.add(this.jMenuItemMostrarOcultarParametroContabilidadDefecto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroContabilidadDefecto.add(this.jMenuItemGuardarCambiosParametroContabilidadDefecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroContabilidadDefecto.add(this.jmenuArchivoParametroContabilidadDefecto);		
			this.jmenuBarParametroContabilidadDefecto.add(this.jmenuAccionesParametroContabilidadDefecto);		
			this.jmenuBarParametroContabilidadDefecto.add(this.jmenuDatosParametroContabilidadDefecto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroContabilidadDefecto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroContabilidadDefecto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto.setToolTipText("Buscar Por Estado Asiento C. ");
		this.jButtonFK_IdEstadoAsientoContableParametroContabilidadDefecto= new JButtonMe();
		this.jButtonFK_IdEstadoAsientoContableParametroContabilidadDefecto.setText("Buscar");
		this.jButtonFK_IdEstadoAsientoContableParametroContabilidadDefecto.setToolTipText("Buscar Por Estado Asiento C. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoAsientoContableParametroContabilidadDefecto,"buscar_button","Buscar Por Estado Asiento C. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoAsientoContableParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto = new JLabelMe();
		jLabelid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setText("Estado Asiento C. :");
		jLabelid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setToolTipText("Estado Asiento C.");
		jLabelid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdModuloParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModuloParametroContabilidadDefecto.setToolTipText("Buscar Por Modulo ");
		this.jButtonFK_IdModuloParametroContabilidadDefecto= new JButtonMe();
		this.jButtonFK_IdModuloParametroContabilidadDefecto.setText("Buscar");
		this.jButtonFK_IdModuloParametroContabilidadDefecto.setToolTipText("Buscar Por Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModuloParametroContabilidadDefecto,"buscar_button","Buscar Por Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModuloParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloFK_IdModuloParametroContabilidadDefecto = new JLabelMe();
		jLabelid_moduloFK_IdModuloParametroContabilidadDefecto.setText("Modulo :");
		jLabelid_moduloFK_IdModuloParametroContabilidadDefecto.setToolTipText("Modulo");
		jLabelid_moduloFK_IdModuloParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFK_IdModuloParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoParametroContabilidadDefecto.setToolTipText("Buscar Por Tipo Documento ");
		this.jButtonFK_IdTipoDocumentoParametroContabilidadDefecto= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoParametroContabilidadDefecto.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoParametroContabilidadDefecto.setToolTipText("Buscar Por Tipo Documento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoParametroContabilidadDefecto,"buscar_button","Buscar Por Tipo Documento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto = new JLabelMe();
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setText("Tipo Documento :");
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setToolTipText("Tipo Documento");
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoIntervaloParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIntervaloParametroContabilidadDefecto.setToolTipText("Buscar Por Tipo Intervalo ");
		this.jButtonFK_IdTipoIntervaloParametroContabilidadDefecto= new JButtonMe();
		this.jButtonFK_IdTipoIntervaloParametroContabilidadDefecto.setText("Buscar");
		this.jButtonFK_IdTipoIntervaloParametroContabilidadDefecto.setToolTipText("Buscar Por Tipo Intervalo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIntervaloParametroContabilidadDefecto,"buscar_button","Buscar Por Tipo Intervalo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIntervaloParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto = new JLabelMe();
		jLabelid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setText("Tipo Intervalo :");
		jLabelid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setToolTipText("Tipo Intervalo");
		jLabelid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMonedaParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMonedaParametroContabilidadDefecto.setToolTipText("Buscar Por Tipo Moneda ");
		this.jButtonFK_IdTipoMonedaParametroContabilidadDefecto= new JButtonMe();
		this.jButtonFK_IdTipoMonedaParametroContabilidadDefecto.setText("Buscar");
		this.jButtonFK_IdTipoMonedaParametroContabilidadDefecto.setToolTipText("Buscar Por Tipo Moneda ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMonedaParametroContabilidadDefecto,"buscar_button","Buscar Por Tipo Moneda ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMonedaParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto = new JLabelMe();
		jLabelid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setText("Tipo Moneda :");
		jLabelid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setToolTipText("Tipo Moneda");
		jLabelid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoParametroContabilidadDefecto.setToolTipText("Buscar Por Tipo Movimiento ");
		this.jButtonFK_IdTipoMovimientoParametroContabilidadDefecto= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoParametroContabilidadDefecto.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoParametroContabilidadDefecto.setToolTipText("Buscar Por Tipo Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoParametroContabilidadDefecto,"buscar_button","Buscar Por Tipo Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto = new JLabelMe();
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setText("Tipo Movimiento :");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setToolTipText("Tipo Movimiento");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroContabilidadDefecto=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroContabilidadDefecto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroContabilidadDefecto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroContabilidadDefecto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroContabilidadDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroContabilidadDefecto = new ParametroContabilidadDefectoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Contabilidad Defecto DATOS");
			this.jInternalFrameDetalleFormParametroContabilidadDefecto = new ParametroContabilidadDefectoDetalleFormJInternalFrame(jDesktopPane,this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones(),this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto = null;//new ParametroContabilidadDefectoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroContabilidadDefecto= new GridBagLayout();
		
		
		this.jTableDatosParametroContabilidadDefecto = new JTableMe();      
		
		String sToolTipParametroContabilidadDefecto="";
		sToolTipParametroContabilidadDefecto=ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroContabilidadDefecto+="(Contabilidad.ParametroContabilidadDefecto)";
		}
		
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroContabilidadDefecto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroContabilidadDefecto.setToolTipText(sToolTipParametroContabilidadDefecto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroContabilidadDefecto);
		this.jTableDatosParametroContabilidadDefecto.setAutoCreateRowSorter(true);
		this.jTableDatosParametroContabilidadDefecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroContabilidadDefecto.setRowSelectionAllowed(true);
		this.jTableDatosParametroContabilidadDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroContabilidadDefecto = new JButtonMe();
		this.jButtonDuplicarParametroContabilidadDefecto = new JButtonMe();
		this.jButtonCopiarParametroContabilidadDefecto = new JButtonMe();
		this.jButtonVerFormParametroContabilidadDefecto = new JButtonMe();
		this.jButtonNuevoRelacionesParametroContabilidadDefecto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroContabilidadDefecto = new JButtonMe();
		this.jButtonCerrarParametroContabilidadDefecto = new JButtonMe();
		
		this.jScrollPanelDatosParametroContabilidadDefecto = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroContabilidadDefecto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Contabilidad Defecto";
		
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidad Defectos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroContabilidadDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroContabilidadDefecto.setToolTipText("Acciones");
        this.jPanelAccionesParametroContabilidadDefecto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroContabilidadDefecto=new ReporteDinamicoJInternalFrame(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroContabilidadDefecto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroContabilidadDefecto=new ImportacionJInternalFrame(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroContabilidadDefecto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroContabilidadDefecto = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroContabilidadDefecto.setText("Orden");
		this.jButtonAbrirOrderByParametroContabilidadDefecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroContabilidadDefecto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroContabilidadDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroContabilidadDefecto,false,this);
			
			//this.cargarOrderByParametroContabilidadDefecto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroContabilidadDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroContabilidadDefecto,true,this);
			
			//this.cargarOrderByParametroContabilidadDefecto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroContabilidadDefecto.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosParametroContabilidadDefecto.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosParametroContabilidadDefecto.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosParametroContabilidadDefecto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroContabilidadDefecto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroContabilidadDefecto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroContabilidadDefecto.setText("Nuevo");
		this.jButtonDuplicarParametroContabilidadDefecto.setText("Duplicar");
		this.jButtonCopiarParametroContabilidadDefecto.setText("Copiar");
		this.jButtonVerFormParametroContabilidadDefecto.setText("Ver");
		this.jButtonNuevoRelacionesParametroContabilidadDefecto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.setText("Guardar");
		this.jButtonCerrarParametroContabilidadDefecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroContabilidadDefecto,"nuevo_button","Nuevo",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroContabilidadDefecto,"duplicar_button","Duplicar",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroContabilidadDefecto,"copiar_button","Copiar",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroContabilidadDefecto,"ver_form","Ver",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroContabilidadDefecto,"nuevorelaciones_button","Nuevo Rel",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroContabilidadDefecto,"guardarcambiostabla_button","Guardar",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroContabilidadDefecto,"cerrar_button","Salir",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroContabilidadDefecto.setToolTipText("Nuevo"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroContabilidadDefecto.setToolTipText("Duplicar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroContabilidadDefecto.setToolTipText("Copiar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroContabilidadDefecto.setToolTipText("Ver"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroContabilidadDefecto.setToolTipText("Nuevo Rel"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.setToolTipText("Guardar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroContabilidadDefecto.setToolTipText("Salir"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroContabilidadDefecto";
		inputMap = this.jButtonNuevoParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroContabilidadDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroContabilidadDefecto"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroContabilidadDefecto";
		inputMap = this.jButtonDuplicarParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroContabilidadDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroContabilidadDefecto"));
		
		//COPIAR
		sMapKey = "CopiarParametroContabilidadDefecto";
		inputMap = this.jButtonCopiarParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroContabilidadDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroContabilidadDefecto"));
		
		//VEr FORM
		sMapKey = "VerFormParametroContabilidadDefecto";
		inputMap = this.jButtonVerFormParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroContabilidadDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroContabilidadDefecto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroContabilidadDefecto";
		inputMap = this.jButtonNuevoRelacionesParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroContabilidadDefecto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroContabilidadDefecto";
		inputMap = this.jButtonModificarParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroContabilidadDefecto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroContabilidadDefecto";
		inputMap = this.jButtonCerrarParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroContabilidadDefecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroContabilidadDefecto";
		inputMap = this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroContabilidadDefecto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroContabilidadDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroContabilidadDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroContabilidadDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroContabilidadDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroContabilidadDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroContabilidadDefecto.setName("jPanelParametrosReportesParametroContabilidadDefecto"); 
		
		this.jPanelParametrosReportesAccionesParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroContabilidadDefecto.setName("jPanelParametrosReportesAccionesParametroContabilidadDefecto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroContabilidadDefecto = new JButtonMe();
		this.jButtonRecargarInformacionParametroContabilidadDefecto.setText("Recargar");
		this.jButtonRecargarInformacionParametroContabilidadDefecto.setToolTipText("Recargar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroContabilidadDefecto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroContabilidadDefecto = new JButtonMe();
		this.jButtonProcesarInformacionParametroContabilidadDefecto.setText("Procesar");
		this.jButtonProcesarInformacionParametroContabilidadDefecto.setToolTipText("Procesar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroContabilidadDefecto.setVisible(false);
			
		this.jButtonProcesarInformacionParametroContabilidadDefecto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroContabilidadDefecto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroContabilidadDefecto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroContabilidadDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto.setText("TIPO");       
		this.jComboBoxTiposReportesParametroContabilidadDefecto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroContabilidadDefecto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroContabilidadDefecto.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroContabilidadDefecto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroContabilidadDefecto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroContabilidadDefecto.setText("Accion");
		this.jComboBoxTiposRelacionesParametroContabilidadDefecto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroContabilidadDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroContabilidadDefecto.setText("Accion");
		this.jComboBoxTiposAccionesParametroContabilidadDefecto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroContabilidadDefecto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroContabilidadDefecto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroContabilidadDefecto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroContabilidadDefecto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroContabilidadDefecto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroContabilidadDefecto = new JLabelMe();
		
		this.jLabelAccionesParametroContabilidadDefecto.setText("Acciones");		
		this.jLabelAccionesParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroContabilidadDefecto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroContabilidadDefecto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroContabilidadDefecto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroContabilidadDefecto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroContabilidadDefecto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroContabilidadDefecto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroContabilidadDefecto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroContabilidadDefecto.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroContabilidadDefecto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroContabilidadDefecto = new JButtonMe();
		//this.jButtonAnterioresParametroContabilidadDefecto.setText("<<");
        this.jButtonAnterioresParametroContabilidadDefecto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroContabilidadDefecto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroContabilidadDefecto = new JButtonMe();
		//this.jButtonSiguientesParametroContabilidadDefecto.setText(">>");
        this.jButtonSiguientesParametroContabilidadDefecto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroContabilidadDefecto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroContabilidadDefecto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroContabilidadDefecto.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroContabilidadDefecto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroContabilidadDefecto,"nuevoguardarcambios_button","Nue",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroContabilidadDefecto";
		inputMap = this.jButtonNuevoGuardarCambiosParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroContabilidadDefecto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroContabilidadDefecto";
		inputMap = this.jButtonRecargarInformacionParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroContabilidadDefecto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroContabilidadDefecto";
		inputMap = this.jButtonSiguientesParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroContabilidadDefecto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroContabilidadDefecto";
		inputMap = this.jButtonAnterioresParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroContabilidadDefecto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroContabilidadDefecto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroContabilidadDefecto.setMinimumSize(new Dimension(this.getWidth(),ParametroContabilidadDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroContabilidadDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroContabilidadDefecto.setMaximumSize(new Dimension(this.getWidth(),ParametroContabilidadDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroContabilidadDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroContabilidadDefecto.setPreferredSize(new Dimension(this.getWidth(),ParametroContabilidadDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroContabilidadDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroContabilidadDefecto = new GridBagLayout();

			this.jPanelPaginacionParametroContabilidadDefecto.setLayout(gridaBagLayoutPaginacionParametroContabilidadDefecto);						
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroContabilidadDefecto.add(this.jButtonAnterioresParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
					
						
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
			
			this.jPanelPaginacionParametroContabilidadDefecto.add(this.jButtonNuevoGuardarCambiosParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
						
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
			this.jPanelPaginacionParametroContabilidadDefecto.add(this.jButtonSiguientesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroContabilidadDefecto.add(this.jButtonNuevoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
						
			
			
			if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
				this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroContabilidadDefecto.add(this.jButtonGuardarCambiosTablaParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			}
			
			
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroContabilidadDefecto.add(this.jButtonDuplicarParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroContabilidadDefecto.add(this.jButtonCopiarParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroContabilidadDefecto.add(this.jButtonVerFormParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroContabilidadDefecto.add(this.jButtonCerrarParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		
		
		
		this.jButtonRecargarInformacionParametroContabilidadDefecto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroContabilidadDefecto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroContabilidadDefecto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroContabilidadDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroContabilidadDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroContabilidadDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroContabilidadDefecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroContabilidadDefecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroContabilidadDefecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroContabilidadDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroContabilidadDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroContabilidadDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroContabilidadDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroContabilidadDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroContabilidadDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroContabilidadDefecto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroContabilidadDefecto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroContabilidadDefecto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroContabilidadDefecto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroContabilidadDefecto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroContabilidadDefecto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroContabilidadDefecto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroContabilidadDefecto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroContabilidadDefecto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroContabilidadDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroContabilidadDefecto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroContabilidadDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroContabilidadDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroContabilidadDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroContabilidadDefecto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroContabilidadDefecto.setLayout(gridaBagParametrosReportesParametroContabilidadDefecto);
			this.jPanelParametrosReportesAccionesParametroContabilidadDefecto.setLayout(gridaBagParametrosReportesAccionesParametroContabilidadDefecto);
			
			
			this.jPanelParametrosAuxiliar1ParametroContabilidadDefecto.setLayout(gridaBagParametrosAuxiliar1ParametroContabilidadDefecto);
			this.jPanelParametrosAuxiliar2ParametroContabilidadDefecto.setLayout(gridaBagParametrosAuxiliar2ParametroContabilidadDefecto);
			this.jPanelParametrosAuxiliar3ParametroContabilidadDefecto.setLayout(gridaBagParametrosAuxiliar3ParametroContabilidadDefecto);
			this.jPanelParametrosAuxiliar4ParametroContabilidadDefecto.setLayout(gridaBagParametrosAuxiliar4ParametroContabilidadDefecto);
			//this.jPanelParametrosAuxiliar5ParametroContabilidadDefecto.setLayout(gridaBagParametrosAuxiliar2ParametroContabilidadDefecto);			
			
			
			
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jButtonRecargarInformacionParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroContabilidadDefecto.add(this.jComboBoxTiposPaginacionParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroContabilidadDefecto.add(this.jCheckBoxConAltoMaximoTablaParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroContabilidadDefecto.add(this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jPanelParametrosAuxiliar1ParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroContabilidadDefecto.add(this.jComboBoxTiposReportesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jPanelParametrosAuxiliar4ParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jComboBoxTiposReportesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jCheckBoxGenerarReporteParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jPanelParametrosAuxiliar2ParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jLabelAccionesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jButtonAbrirOrderByParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jComboBoxTiposSeleccionarParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);			
			
			
			/*
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroContabilidadDefecto.add(this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);															
				
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroContabilidadDefecto.add(this.jCheckBoxSeleccionadosParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jPanelParametrosAuxiliar3ParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jComboBoxTiposAccionesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
	
				
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroContabilidadDefecto.add(this.jTextFieldValorCampoGeneralParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroContabilidadDefecto = new GridBagLayout();

			this.jScrollPanelDatosParametroContabilidadDefecto.setLayout(gridaBagLayoutDatosParametroContabilidadDefecto);
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
			
			this.jScrollPanelDatosParametroContabilidadDefecto.add(this.jTableDatosParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroContabilidadDefecto.setViewportView(this.jTableDatosParametroContabilidadDefecto);
		this.jTableDatosParametroContabilidadDefecto.setFillsViewportHeight(true);
		this.jTableDatosParametroContabilidadDefecto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroContabilidadDefecto= new GridBagLayout();
		this.jPanelAccionesParametroContabilidadDefecto.setLayout(gridaBagLayoutAccionesParametroContabilidadDefecto);
		
		
		/*	
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
			
		this.jPanelAccionesParametroContabilidadDefecto.add(this.jButtonNuevoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEstadoAsientoContableParametroContabilidadDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoAsientoContableParametroContabilidadDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoAsientoContableParametroContabilidadDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoAsientoContableParametroContabilidadDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoAsientoContableParametroContabilidadDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto.setLayout(gridaBagLayoutFK_IdEstadoAsientoContableParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
		jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto.add(jLabelid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
		jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto.add(jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
		gridBagConstraintsParametroContabilidadDefecto.gridx =1;
		jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto.add(jButtonFK_IdEstadoAsientoContableParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		jTabbedPaneBusquedasParametroContabilidadDefecto.addTab("1.-Por Estado Asiento C. ", jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);
		jTabbedPaneBusquedasParametroContabilidadDefecto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdModuloParametroContabilidadDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdModuloParametroContabilidadDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModuloParametroContabilidadDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModuloParametroContabilidadDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModuloParametroContabilidadDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModuloParametroContabilidadDefecto.setLayout(gridaBagLayoutFK_IdModuloParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
		jPanelFK_IdModuloParametroContabilidadDefecto.add(jLabelid_moduloFK_IdModuloParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
		jPanelFK_IdModuloParametroContabilidadDefecto.add(jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
		gridBagConstraintsParametroContabilidadDefecto.gridx =1;
		jPanelFK_IdModuloParametroContabilidadDefecto.add(jButtonFK_IdModuloParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		jTabbedPaneBusquedasParametroContabilidadDefecto.addTab("2.-Por Modulo ", jPanelFK_IdModuloParametroContabilidadDefecto);
		jTabbedPaneBusquedasParametroContabilidadDefecto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoParametroContabilidadDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoParametroContabilidadDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoParametroContabilidadDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoParametroContabilidadDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoParametroContabilidadDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoParametroContabilidadDefecto.setLayout(gridaBagLayoutFK_IdTipoDocumentoParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
		jPanelFK_IdTipoDocumentoParametroContabilidadDefecto.add(jLabelid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
		jPanelFK_IdTipoDocumentoParametroContabilidadDefecto.add(jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
		gridBagConstraintsParametroContabilidadDefecto.gridx =1;
		jPanelFK_IdTipoDocumentoParametroContabilidadDefecto.add(jButtonFK_IdTipoDocumentoParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		jTabbedPaneBusquedasParametroContabilidadDefecto.addTab("3.-Por Tipo Documento ", jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);
		jTabbedPaneBusquedasParametroContabilidadDefecto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoIntervaloParametroContabilidadDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoIntervaloParametroContabilidadDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoIntervaloParametroContabilidadDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoIntervaloParametroContabilidadDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoIntervaloParametroContabilidadDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoIntervaloParametroContabilidadDefecto.setLayout(gridaBagLayoutFK_IdTipoIntervaloParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
		jPanelFK_IdTipoIntervaloParametroContabilidadDefecto.add(jLabelid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
		jPanelFK_IdTipoIntervaloParametroContabilidadDefecto.add(jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
		gridBagConstraintsParametroContabilidadDefecto.gridx =1;
		jPanelFK_IdTipoIntervaloParametroContabilidadDefecto.add(jButtonFK_IdTipoIntervaloParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		jTabbedPaneBusquedasParametroContabilidadDefecto.addTab("4.-Por Tipo Intervalo ", jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);
		jTabbedPaneBusquedasParametroContabilidadDefecto.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoMonedaParametroContabilidadDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMonedaParametroContabilidadDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMonedaParametroContabilidadDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMonedaParametroContabilidadDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMonedaParametroContabilidadDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMonedaParametroContabilidadDefecto.setLayout(gridaBagLayoutFK_IdTipoMonedaParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
		jPanelFK_IdTipoMonedaParametroContabilidadDefecto.add(jLabelid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
		jPanelFK_IdTipoMonedaParametroContabilidadDefecto.add(jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
		gridBagConstraintsParametroContabilidadDefecto.gridx =1;
		jPanelFK_IdTipoMonedaParametroContabilidadDefecto.add(jButtonFK_IdTipoMonedaParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		jTabbedPaneBusquedasParametroContabilidadDefecto.addTab("5.-Por Tipo Moneda ", jPanelFK_IdTipoMonedaParametroContabilidadDefecto);
		jTabbedPaneBusquedasParametroContabilidadDefecto.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoMovimientoParametroContabilidadDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMovimientoParametroContabilidadDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoParametroContabilidadDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoParametroContabilidadDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMovimientoParametroContabilidadDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMovimientoParametroContabilidadDefecto.setLayout(gridaBagLayoutFK_IdTipoMovimientoParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
		jPanelFK_IdTipoMovimientoParametroContabilidadDefecto.add(jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
		jPanelFK_IdTipoMovimientoParametroContabilidadDefecto.add(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContabilidadDefecto.gridy = 1;
		gridBagConstraintsParametroContabilidadDefecto.gridx =1;
		jPanelFK_IdTipoMovimientoParametroContabilidadDefecto.add(jButtonFK_IdTipoMovimientoParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);

		jTabbedPaneBusquedasParametroContabilidadDefecto.addTab("6.-Por Tipo Movimiento ", jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);
		jTabbedPaneBusquedasParametroContabilidadDefecto.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroContabilidadDefecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroContabilidadDefecto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();						
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;		
			//this.gridBagConstraintsParametroContabilidadDefecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;		
		//this.gridBagConstraintsParametroContabilidadDefecto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroContabilidadDefecto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;		
			this.gridBagConstraintsParametroContabilidadDefecto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);								
		
		
		/*
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		*/		
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx =0;
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroContabilidadDefecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
				
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroContabilidadDefectoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroContabilidadDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroContabilidadDefecto = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroContabilidadDefecto.setLayout(gridaBagLayoutBusquedasParametrosParametroContabilidadDefecto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroContabilidadDefecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			
			
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		
			
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroContabilidadDefecto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroContabilidadDefecto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroContabilidadDefecto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroContabilidadDefecto.setName("jPanelReporteDinamicoParametroContabilidadDefecto"); 
		
		this.jPanelReporteDinamicoParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroContabilidadDefecto.setLayout(gridaBagLayoutReporteDinamicoParametroContabilidadDefecto);
		
		
		this.jInternalFrameReporteDinamicoParametroContabilidadDefecto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroContabilidadDefecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroContabilidadDefecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidad Defectos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroContabilidadDefecto = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroContabilidadDefecto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroContabilidadDefecto.add(this.jLabelColumnasSelectReporteParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroContabilidadDefecto = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroContabilidadDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroContabilidadDefecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroContabilidadDefecto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroContabilidadDefecto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroContabilidadDefecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroContabilidadDefecto=new JScrollPane(this.jListColumnasSelectReporteParametroContabilidadDefecto);
			
			this.jScrollColumnasSelectReporteParametroContabilidadDefecto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroContabilidadDefecto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroContabilidadDefecto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroContabilidadDefecto.add(this.jListColumnasSelectReporteParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		this.jPanelReporteDinamicoParametroContabilidadDefecto.add(this.jScrollColumnasSelectReporteParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroContabilidadDefecto = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroContabilidadDefecto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroContabilidadDefecto = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroContabilidadDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroContabilidadDefecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroContabilidadDefecto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroContabilidadDefecto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroContabilidadDefecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroContabilidadDefecto=new JScrollPane(this.jListRelacionesSelectReporteParametroContabilidadDefecto);
			
			this.jScrollRelacionesSelectReporteParametroContabilidadDefecto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroContabilidadDefecto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroContabilidadDefecto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroContabilidadDefecto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroContabilidadDefecto = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroContabilidadDefecto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroContabilidadDefecto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroContabilidadDefecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroContabilidadDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroContabilidadDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroContabilidadDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroContabilidadDefecto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroContabilidadDefecto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroContabilidadDefecto.add(this.jLabelGenerarExcelReporteDinamicoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroContabilidadDefecto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroContabilidadDefecto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroContabilidadDefecto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroContabilidadDefecto.setToolTipText("Generar EXCEL"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroContabilidadDefecto.add(this.jButtonGenerarExcelReporteDinamicoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroContabilidadDefecto.add(this.jComboBoxTiposReportesDinamicoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroContabilidadDefecto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroContabilidadDefecto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroContabilidadDefecto.add(this.jLabelTiposArchivoReporteDinamicoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroContabilidadDefecto.add(this.jComboBoxTiposArchivosReportesDinamicoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroContabilidadDefecto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroContabilidadDefecto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroContabilidadDefecto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroContabilidadDefecto.setToolTipText("Generar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroContabilidadDefecto.add(this.jButtonGenerarReporteDinamicoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroContabilidadDefecto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroContabilidadDefecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroContabilidadDefecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroContabilidadDefecto.setToolTipText("Cancelar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroContabilidadDefecto.add(this.jButtonCerrarReporteDinamicoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroContabilidadDefecto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroContabilidadDefecto= new JScrollPane(jPanelReporteDinamicoParametroContabilidadDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidad Defectos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroContabilidadDefecto);
		this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getContentPane().add(this.jScrollPanelReporteDinamicoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroContabilidadDefecto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroContabilidadDefecto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroContabilidadDefecto.setName("jPanelImportacionParametroContabilidadDefecto"); 
		
		this.jPanelImportacionParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroContabilidadDefecto.setLayout(gridaBagLayoutImportacionParametroContabilidadDefecto);
		
		
		this.jInternalFrameImportacionParametroContabilidadDefecto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroContabilidadDefecto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroContabilidadDefecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroContabilidadDefecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroContabilidadDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroContabilidadDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroContabilidadDefecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroContabilidadDefecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroContabilidadDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroContabilidadDefecto.setResizable(true);
	    this.jInternalFrameImportacionParametroContabilidadDefecto.setClosable(true);
	    this.jInternalFrameImportacionParametroContabilidadDefecto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroContabilidadDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroContabilidadDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroContabilidadDefecto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroContabilidadDefecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroContabilidadDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroContabilidadDefecto.setResizable(true);
	    this.jInternalFrameImportacionParametroContabilidadDefecto.setClosable(true);
	    this.jInternalFrameImportacionParametroContabilidadDefecto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidad Defectos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroContabilidadDefecto = new JLabelMe();

		this.jLabelArchivoImportacionParametroContabilidadDefecto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroContabilidadDefecto.add(this.jLabelArchivoImportacionParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroContabilidadDefecto = new JFileChooser();		
		this.jFileChooserImportacionParametroContabilidadDefecto.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroContabilidadDefecto = new JButtonMe();
		this.jButtonAbrirImportacionParametroContabilidadDefecto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroContabilidadDefecto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroContabilidadDefecto.setToolTipText("Generar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroContabilidadDefecto.add(this.jButtonAbrirImportacionParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroContabilidadDefecto = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroContabilidadDefecto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroContabilidadDefecto.add(this.jLabelPathArchivoImportacionParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroContabilidadDefecto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroContabilidadDefecto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroContabilidadDefecto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroContabilidadDefecto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroContabilidadDefecto.add(this.jTextFieldPathArchivoImportacionParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroContabilidadDefecto = new JButtonMe();
		this.jButtonGenerarImportacionParametroContabilidadDefecto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroContabilidadDefecto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroContabilidadDefecto.setToolTipText("Generar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroContabilidadDefecto.add(this.jButtonGenerarImportacionParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroContabilidadDefecto = new JButtonMe();
		this.jButtonCerrarImportacionParametroContabilidadDefecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroContabilidadDefecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroContabilidadDefecto.setToolTipText("Cancelar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroContabilidadDefecto.add(this.jButtonCerrarImportacionParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroContabilidadDefecto = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroContabilidadDefecto= new JScrollPane(jPanelImportacionParametroContabilidadDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroContabilidadDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroContabilidadDefecto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroContabilidadDefecto);
		this.jInternalFrameImportacionParametroContabilidadDefecto.getContentPane().add(this.jScrollPanelImportacionParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroContabilidadDefecto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroContabilidadDefecto = new JButtonMe();
			this.jButtonAbrirOrderByParametroContabilidadDefecto.setText("Orden");
			this.jButtonAbrirOrderByParametroContabilidadDefecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroContabilidadDefecto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroContabilidadDefecto";
			inputMap = this.jButtonAbrirOrderByParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroContabilidadDefecto"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroContabilidadDefecto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroContabilidadDefecto.setName("jPanelOrderByParametroContabilidadDefecto"); 
			
			this.jPanelOrderByParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroContabilidadDefecto.setLayout(gridaBagLayoutOrderByParametroContabilidadDefecto);
			
			
			this.jTableDatosParametroContabilidadDefectoOrderBy = new JTableMe();        
			this.jTableDatosParametroContabilidadDefectoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroContabilidadDefectoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroContabilidadDefectoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroContabilidadDefectoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroContabilidadDefectoOrderBy.setViewportView(this.jTableDatosParametroContabilidadDefectoOrderBy);
			this.jTableDatosParametroContabilidadDefectoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroContabilidadDefectoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroContabilidadDefecto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroContabilidadDefecto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroContabilidadDefecto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroContabilidadDefecto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroContabilidadDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroContabilidadDefecto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroContabilidadDefecto.setTitle("Orden");
			this.jInternalFrameOrderByParametroContabilidadDefecto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroContabilidadDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroContabilidadDefecto.setResizable(true);
			this.jInternalFrameOrderByParametroContabilidadDefecto.setClosable(true);
			this.jInternalFrameOrderByParametroContabilidadDefecto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidad Defectos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroContabilidadDefecto.ipady =150;
				
			this.jPanelOrderByParametroContabilidadDefecto.add(jScrollPanelDatosParametroContabilidadDefectoOrderBy, this.gridBagConstraintsParametroContabilidadDefecto);//this.jTableDatosParametroContabilidadDefectoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroContabilidadDefecto = new JButtonMe();
			this.jButtonCerrarOrderByParametroContabilidadDefecto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroContabilidadDefecto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroContabilidadDefecto.setToolTipText("Cancelar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroContabilidadDefecto.add(this.jButtonCerrarOrderByParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroContabilidadDefecto = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroContabilidadDefecto= new JScrollPane(jPanelOrderByParametroContabilidadDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroContabilidadDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroContabilidadDefecto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroContabilidadDefecto);
			
			this.jInternalFrameOrderByParametroContabilidadDefecto.getContentPane().add(this.jScrollPanelOrderByParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);			
		
		} else {
			this.jButtonAbrirOrderByParametroContabilidadDefecto = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroContabilidadDefecto.getRowHeight();//ParametroContabilidadDefectoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroContabilidadDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroContabilidadDefecto.isSelected()) {
					iHeightTable=ParametroContabilidadDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroContabilidadDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroContabilidadDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroContabilidadDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroContabilidadDefecto.isSelected()) {
					iHeightTable=ParametroContabilidadDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroContabilidadDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroContabilidadDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroContabilidadDefecto!=null && this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroContabilidadDefecto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroContabilidadDefecto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroContabilidadDefecto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocontabilidaddefectos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroContabilidadDefecto> TraerParametroContabilidadDefectoBeans(List<ParametroContabilidadDefecto> parametrocontabilidaddefectos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectos) {
					
				if(!(ParametroContabilidadDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroContabilidadDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrocontabilidaddefecto.setsDetalleGeneralEntityReporte(ParametroContabilidadDefectoConstantesFunciones.getParametroContabilidadDefectoDescripcion(parametrocontabilidaddefecto));
										
						
					
						
					
				} else  {
							
					//parametrocontabilidaddefecto.setsDetalleGeneralEntityReporte(parametrocontabilidaddefecto.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrocontabilidaddefectobeans.add(parametrocontabilidaddefectobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrocontabilidaddefectos;
    }
	//PARA REPORTES FIN
}
