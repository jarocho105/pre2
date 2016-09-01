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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.facturacion.util.ParametroFactuSecuencialConstantesFunciones;

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
public class ParametroFactuSecuencialJInternalFrame extends ParametroFactuSecuencialBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroFactuSecuencial;
	
	protected JMenuBar jmenuBarParametroFactuSecuencial;
	
	protected JMenu jmenuParametroFactuSecuencial;
	protected JMenu jmenuDatosParametroFactuSecuencial;
	protected JMenu jmenuArchivoParametroFactuSecuencial;
	protected JMenu jmenuAccionesParametroFactuSecuencial;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFactuSecuencial;	
	protected GridBagConstraints gridBagConstraintsParametroFactuSecuencial;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroFactuSecuencialDetalleFormJInternalFrame jInternalFrameDetalleFormParametroFactuSecuencial;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroFactuSecuencial;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroFactuSecuencial;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentogeneral="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected TipoParamFactuPlazoBeanSwingJInternalFrame tipoparamfactuplazoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparamfactuplazo="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected BodegaBeanSwingJInternalFrame bodegatransferenciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegatransferencia="";

	protected TransaccionBeanSwingJInternalFrame transacciontransferenciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transacciontransferencia="";
	
	public ParametroFactuSecuencialSessionBean parametrofactusecuencialSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public TipoParamFactuPlazoSessionBean tipoparamfactuplazoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public BodegaSessionBean bodegatransferenciaSessionBean;
	public TransaccionSessionBean transacciontransferenciaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroFactuSecuencial> parametrofactusecuencials;		
	public List<ParametroFactuSecuencial> parametrofactusecuencialsEliminados;	
	public List<ParametroFactuSecuencial> parametrofactusecuencialsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroFactuSecuencial;		
	protected JButton jButtonAbrirOrderByParametroFactuSecuencial;
	
	
	//protected JPanel jPanelOrderByParametroFactuSecuencial;
	//public JScrollPane jScrollPanelOrderByParametroFactuSecuencial;	
	//protected JButton jButtonCerrarOrderByParametroFactuSecuencial;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroFactuSecuencialLogic parametrofactusecuencialLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroFactuSecuencial;
	public JScrollPane jScrollPanelDatosEdicionParametroFactuSecuencial;
	public JScrollPane jScrollPanelDatosGeneralParametroFactuSecuencial;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroFactuSecuencialOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroFactuSecuencial;
	//public JScrollPane jScrollPanelImportacionParametroFactuSecuencial;
	
	
	
	protected JPanel jPanelAccionesParametroFactuSecuencial;
	
    protected JPanel jPanelPaginacionParametroFactuSecuencial;
    protected JPanel jPanelParametrosReportesParametroFactuSecuencial;
	protected JPanel jPanelParametrosReportesAccionesParametroFactuSecuencial;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralParametroFactuSecuencial;
	protected Integer iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
	protected Integer iYPanelCamposIniciogeneralParametroFactuSecuencial=0;

	protected JPanel jPanelCamposIniciotransferenciaParametroFactuSecuencial;
	protected Integer iXPanelCamposIniciotransferenciaParametroFactuSecuencial=0;
	protected Integer iYPanelCamposIniciotransferenciaParametroFactuSecuencial=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroFactuSecuencial;
	protected JPanel jPanelParametrosAuxiliar2ParametroFactuSecuencial;
	protected JPanel jPanelParametrosAuxiliar3ParametroFactuSecuencial;
	protected JPanel jPanelParametrosAuxiliar4ParametroFactuSecuencial;
	//protected JPanel jPanelParametrosAuxiliar5ParametroFactuSecuencial;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroFactuSecuencial;
	//protected JPanel jPanelImportacionParametroFactuSecuencial;
	
	
	public JTable jTableDatosParametroFactuSecuencial;
	
	
	
	//public JTable jTableDatosParametroFactuSecuencialOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroFactuSecuencial;
	protected JButton jButtonDuplicarParametroFactuSecuencial;
	protected JButton jButtonCopiarParametroFactuSecuencial;
	protected JButton jButtonVerFormParametroFactuSecuencial;
	protected JButton jButtonNuevoRelacionesParametroFactuSecuencial;
	protected JButton jButtonModificarParametroFactuSecuencial;
	
    protected JButton jButtonGuardarCambiosTablaParametroFactuSecuencial;
	protected JButton jButtonCerrarParametroFactuSecuencial;
	
	
	protected JButton jButtonRecargarInformacionParametroFactuSecuencial;
	protected JButton jButtonProcesarInformacionParametroFactuSecuencial;
	
	
	protected JButton jButtonAnterioresParametroFactuSecuencial;
	protected JButton jButtonSiguientesParametroFactuSecuencial;
	protected JButton jButtonNuevoGuardarCambiosParametroFactuSecuencial;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroFactuSecuencial;
	//protected JButton jButtonCerrarReporteDinamicoParametroFactuSecuencial;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroFactuSecuencial;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroFactuSecuencial;
	//protected JButton jButtonGenerarImportacionParametroFactuSecuencial;
	//protected JButton jButtonCerrarImportacionParametroFactuSecuencial;
	//protected JFileChooser jFileChooserImportacionParametroFactuSecuencial;
	//protected File fileImportacionParametroFactuSecuencial;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFactuSecuencial;
	protected JButton jButtonDuplicarToolBarParametroFactuSecuencial;
	protected JButton jButtonNuevoRelacionesToolBarParametroFactuSecuencial;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroFactuSecuencial;
	protected JButton jButtonCopiarToolBarParametroFactuSecuencial;
	protected JButton jButtonVerFormToolBarParametroFactuSecuencial;
	public JButton jButtonGuardarCambiosTablaToolBarParametroFactuSecuencial;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFactuSecuencial;
	protected JButton jButtonCerrarToolBarParametroFactuSecuencial;
	
	protected JButton jButtonRecargarInformacionToolBarParametroFactuSecuencial;
	protected JButton jButtonProcesarInformacionToolBarParametroFactuSecuencial;
	protected JButton jButtonAnterioresToolBarParametroFactuSecuencial;
	protected JButton jButtonSiguientesToolBarParametroFactuSecuencial;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroFactuSecuencial;
	protected JButton jButtonAbrirOrderByToolBarParametroFactuSecuencial;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFactuSecuencial;
	protected JMenuItem jMenuItemDuplicarParametroFactuSecuencial;
	protected JMenuItem jMenuItemNuevoRelacionesParametroFactuSecuencial;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroFactuSecuencial;
	protected JMenuItem jMenuItemCopiarParametroFactuSecuencial;
	protected JMenuItem jMenuItemVerFormParametroFactuSecuencial;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFactuSecuencial;
	protected JMenuItem jMenuItemCerrarParametroFactuSecuencial;
	protected JMenuItem jMenuItemDetalleCerrarParametroFactuSecuencial;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroFactuSecuencial;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFactuSecuencial;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroFactuSecuencial;
	protected JMenuItem jMenuItemProcesarInformacionParametroFactuSecuencial;
	protected JMenuItem jMenuItemAnterioresParametroFactuSecuencial;
	protected JMenuItem jMenuItemSiguientesParametroFactuSecuencial;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFactuSecuencial;
	protected JMenuItem jMenuItemAbrirOrderByParametroFactuSecuencial;
	protected JMenuItem jMenuItemMostrarOcultarParametroFactuSecuencial;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFactuSecuencial;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroFactuSecuencial;
	protected JCheckBox jCheckBoxSeleccionadosParametroFactuSecuencial;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroFactuSecuencial;
	protected JCheckBox jCheckBoxConGraficoReporteParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroFactuSecuencial;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroFactuSecuencial;
	protected JTextField jTextFieldValorCampoGeneralParametroFactuSecuencial;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroFactuSecuencial;
	//public JList<Reporte> jListColumnasSelectReporteParametroFactuSecuencial;
	//public JScrollPane jScrollColumnasSelectReporteParametroFactuSecuencial;
	
	//public JLabel jLabelRelacionesSelectReporteParametroFactuSecuencial;
	//public JList<Reporte> jListRelacionesSelectReporteParametroFactuSecuencial;
	//public JScrollPane jScrollRelacionesSelectReporteParametroFactuSecuencial;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroFactuSecuencial;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroFactuSecuencial;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroFactuSecuencial;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroFactuSecuencial;
	
		
	//public JLabel jLabelArchivoImportacionParametroFactuSecuencial;	
	//public JLabel jLabelPathArchivoImportacionParametroFactuSecuencial;
	//protected JTextField jTextFieldPathArchivoImportacionParametroFactuSecuencial;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroFactuSecuencial;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroFactuSecuencial;
	
	//public JLabel jLabelColumnaCategoriaValorParametroFactuSecuencial;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroFactuSecuencial;
	
	//public JLabel jLabelColumnasValoresGraficoParametroFactuSecuencial;
	//public JList<Reporte> jListColumnasValoresGraficoParametroFactuSecuencial;
	//public JScrollPane jScrollColumnasValoresGraficoParametroFactuSecuencial;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroFactuSecuencial;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroFactuSecuencial;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroFactuSecuencial;
	public JPanel jPanelFK_IdBodegaParametroFactuSecuencial;
	public JButton jButtonFK_IdBodegaParametroFactuSecuencial;
	public JPanel jPanelFK_IdBodegaTransferenciaParametroFactuSecuencial;
	public JButton jButtonFK_IdBodegaTransferenciaParametroFactuSecuencial;
	public JPanel jPanelFK_IdFormatoParametroFactuSecuencial;
	public JButton jButtonFK_IdFormatoParametroFactuSecuencial;
	public JPanel jPanelFK_IdTipoDocumentoGeneralParametroFactuSecuencial;
	public JButton jButtonFK_IdTipoDocumentoGeneralParametroFactuSecuencial;
	public JPanel jPanelFK_IdTipoParamFactuPlazoParametroFactuSecuencial;
	public JButton jButtonFK_IdTipoParamFactuPlazoParametroFactuSecuencial;
	public JPanel jPanelFK_IdTransaccionTransferenciaParametroFactuSecuencial;
	public JButton jButtonFK_IdTransaccionTransferenciaParametroFactuSecuencial;
	
	public JPanel jPanelid_bodegaFK_IdBodegaParametroFactuSecuencial;
	public JLabel jLabelid_bodegaFK_IdBodegaParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaParametroFactuSecuencial;
	public JButton jButtonid_bodegaFK_IdBodegaParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroFactuSecuencialBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial;
	public JLabel jLabelid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial;
	public JButton jButtonid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencialBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formatoFK_IdFormatoParametroFactuSecuencial;
	public JLabel jLabelid_formatoFK_IdFormatoParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoParametroFactuSecuencial;
	public JButton jButtonid_formatoFK_IdFormatoParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoParametroFactuSecuencialBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial;
	public JLabel jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial;
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencialBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial;
	public JLabel jLabelid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial;
	public JButton jButtonid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencialBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial;
	public JLabel jLabelid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial;
	public JButton jButtonid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencialBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroFactuSecuencialJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroFactuSecuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuSecuencialJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuSecuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuSecuencialJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuSecuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuSecuencialJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFactuSecuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroFactuSecuencial)	{
		this.jButtonRecargarInformacionParametroFactuSecuencial = jButtonRecargarInformacionParametroFactuSecuencial;
	}
	
	public JButton getjButtonProcesarInformacionParametroFactuSecuencial() {
		return this.jButtonProcesarInformacionParametroFactuSecuencial;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFactuSecuencial)	{
		this.jButtonProcesarInformacionParametroFactuSecuencial = jButtonProcesarInformacionParametroFactuSecuencial;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroFactuSecuencial() {
		return this.jButtonRecargarInformacionParametroFactuSecuencial;
	}
	
	
	public List<ParametroFactuSecuencial> getparametrofactusecuencials() {
		return this.parametrofactusecuencials;
	}

	public void setparametrofactusecuencials(List<ParametroFactuSecuencial> parametrofactusecuencials) {
		this.parametrofactusecuencials = parametrofactusecuencials;
	}
	
	public List<ParametroFactuSecuencial> getparametrofactusecuencialsAux() {
		return this.parametrofactusecuencialsAux;
	}

	public void setparametrofactusecuencialsAux(List<ParametroFactuSecuencial> parametrofactusecuencialsAux) {
		this.parametrofactusecuencialsAux = parametrofactusecuencialsAux;
	}
	
	public List<ParametroFactuSecuencial> getparametrofactusecuencialsEliminados() {
		return this.parametrofactusecuencialsEliminados;
	}

	public void setParametroFactuSecuencialsEliminados(List<ParametroFactuSecuencial> parametrofactusecuencialsEliminados) {
		this.parametrofactusecuencialsEliminados = parametrofactusecuencialsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroFactuSecuencial() {
		return jComboBoxTiposSeleccionarParametroFactuSecuencial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroFactuSecuencial(
			JComboBox jComboBoxTiposSeleccionarParametroFactuSecuencial) {
		this.jComboBoxTiposSeleccionarParametroFactuSecuencial = jComboBoxTiposSeleccionarParametroFactuSecuencial;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroFactuSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroFactuSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroFactuSecuencial .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroFactuSecuencial() {
		return jTextFieldValorCampoGeneralParametroFactuSecuencial;
	}

	public void setjTextFieldValorCampoGeneralParametroFactuSecuencial(
			JTextField jTextFieldValorCampoGeneralParametroFactuSecuencial) {
		this.jTextFieldValorCampoGeneralParametroFactuSecuencial = jTextFieldValorCampoGeneralParametroFactuSecuencial;
	}

	public void setBorderResaltarValorCampoGeneralParametroFactuSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuSecuencial.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroFactuSecuencial .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroFactuSecuencial() {
		return this.jCheckBoxSeleccionarTodosParametroFactuSecuencial;
	}

	public void setjCheckBoxSeleccionarTodosParametroFactuSecuencial(
			JCheckBox jCheckBoxSeleccionarTodosParametroFactuSecuencial) {
		this.jCheckBoxSeleccionarTodosParametroFactuSecuencial = jCheckBoxSeleccionarTodosParametroFactuSecuencial;
	}

	public void setBorderResaltarSeleccionarTodosParametroFactuSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuSecuencial.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroFactuSecuencial .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroFactuSecuencial() {
		return this.jCheckBoxSeleccionadosParametroFactuSecuencial;
	}

	public void setjCheckBoxSeleccionadosParametroFactuSecuencial(
			JCheckBox jCheckBoxSeleccionadosParametroFactuSecuencial) {
		this.jCheckBoxSeleccionadosParametroFactuSecuencial = jCheckBoxSeleccionadosParametroFactuSecuencial;
	}
	
	public void setBorderResaltarSeleccionadosParametroFactuSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuSecuencial.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroFactuSecuencial .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroFactuSecuencial() {
		return this.jComboBoxTiposArchivosReportesParametroFactuSecuencial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroFactuSecuencial(
			JComboBox jComboBoxTiposArchivosReportesParametroFactuSecuencial) {
		this.jComboBoxTiposArchivosReportesParametroFactuSecuencial = jComboBoxTiposArchivosReportesParametroFactuSecuencial;
	}

	public void setBorderResaltarTiposArchivosReportesParametroFactuSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroFactuSecuencial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroFactuSecuencial() {
		return this.jComboBoxTiposReportesParametroFactuSecuencial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroFactuSecuencial(
			JComboBox jComboBoxTiposReportesParametroFactuSecuencial) {
		this.jComboBoxTiposReportesParametroFactuSecuencial = jComboBoxTiposReportesParametroFactuSecuencial;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroFactuSecuencial() {
	//	return jComboBoxTiposReportesDinamicoParametroFactuSecuencial;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroFactuSecuencial(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroFactuSecuencial) {
	//	this.jComboBoxTiposReportesDinamicoParametroFactuSecuencial = jComboBoxTiposReportesDinamicoParametroFactuSecuencial;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial = jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial;
	//}
	
	public void setBorderResaltarTiposReportesParametroFactuSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroFactuSecuencial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroFactuSecuencial() {
		return this.jComboBoxTiposGraficosReportesParametroFactuSecuencial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroFactuSecuencial(
			JComboBox jComboBoxTiposGraficosReportesParametroFactuSecuencial) {
		this.jComboBoxTiposGraficosReportesParametroFactuSecuencial = jComboBoxTiposGraficosReportesParametroFactuSecuencial;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroFactuSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroFactuSecuencial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroFactuSecuencial() {
		return this.jComboBoxTiposPaginacionParametroFactuSecuencial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroFactuSecuencial(
			JComboBox jComboBoxTiposPaginacionParametroFactuSecuencial) {
		this.jComboBoxTiposPaginacionParametroFactuSecuencial = jComboBoxTiposPaginacionParametroFactuSecuencial;
	}
	
	public void setBorderResaltarTiposPaginacionParametroFactuSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroFactuSecuencial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroFactuSecuencial() {
		return this.jComboBoxTiposRelacionesParametroFactuSecuencial;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFactuSecuencial() {
		return this.jComboBoxTiposAccionesParametroFactuSecuencial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFactuSecuencial(
			JComboBox jComboBoxTiposRelacionesParametroFactuSecuencial) {
		this.jComboBoxTiposRelacionesParametroFactuSecuencial = jComboBoxTiposRelacionesParametroFactuSecuencial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFactuSecuencial(
			JComboBox jComboBoxTiposAccionesParametroFactuSecuencial) {
		this.jComboBoxTiposAccionesParametroFactuSecuencial = jComboBoxTiposAccionesParametroFactuSecuencial;
	}
	
	public void setBorderResaltarTiposRelacionesParametroFactuSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroFactuSecuencial .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroFactuSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroFactuSecuencial .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroFactuSecuencial() {
	//	return jCheckBoxConGraficoDinamicoParametroFactuSecuencial;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroFactuSecuencial(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroFactuSecuencial) {
	//	this.jCheckBoxConGraficoDinamicoParametroFactuSecuencial = jCheckBoxConGraficoDinamicoParametroFactuSecuencial;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroFactuSecuencial() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroFactuSecuencial.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroFactuSecuencial .setBorder(borderResaltar);		
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
		this.parametrofactusecuencialSessionBean=new ParametroFactuSecuencialSessionBean();
		
		this.parametrofactusecuencialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofactusecuencialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroFactuSecuencialJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroFactuSecuencialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFactuSecuencialJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFactuSecuencialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFactuSecuencialJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Secuencial  MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroFactuSecuencialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroFactuSecuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroFactuSecuencial= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"nuevo","nuevo","Nuevo"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"duplicar","duplicar","Duplicar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"copiar","copiar","Copiar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"ver_form","ver_form","Ver"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"recargar","recargar","Recargar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroFactuSecuencial,this.jTtoolBarParametroFactuSecuencial,
							"cerrar","cerrar","Salir"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroFactuSecuencial=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroFactuSecuencial;
			
				this.jButtonProcesarInformacionToolBarParametroFactuSecuencial=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroFactuSecuencial;
				
		//protected JButton jButtonModificarToolBarParametroFactuSecuencial;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroFactuSecuencial=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroFactuSecuencial=new JMenuMe("General");
		this.jmenuArchivoParametroFactuSecuencial=new JMenuMe("Archivo");
		this.jmenuAccionesParametroFactuSecuencial=new JMenuMe("Acciones");
		this.jmenuDatosParametroFactuSecuencial=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFactuSecuencial= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFactuSecuencial.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFactuSecuencial,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroFactuSecuencial= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroFactuSecuencial.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroFactuSecuencial,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroFactuSecuencial= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroFactuSecuencial.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroFactuSecuencial,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroFactuSecuencial= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFactuSecuencial.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFactuSecuencial,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroFactuSecuencial= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroFactuSecuencial.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroFactuSecuencial,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroFactuSecuencial= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroFactuSecuencial.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroFactuSecuencial,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroFactuSecuencial= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroFactuSecuencial.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroFactuSecuencial,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFactuSecuencial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFactuSecuencial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFactuSecuencial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroFactuSecuencial= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroFactuSecuencial.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroFactuSecuencial,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroFactuSecuencial= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroFactuSecuencial.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroFactuSecuencial,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroFactuSecuencial= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroFactuSecuencial.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroFactuSecuencial,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroFactuSecuencial= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroFactuSecuencial.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroFactuSecuencial,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroFactuSecuencial= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroFactuSecuencial.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroFactuSecuencial,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFactuSecuencial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFactuSecuencial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFactuSecuencial,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroFactuSecuencial= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroFactuSecuencial.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroFactuSecuencial,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFactuSecuencial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFactuSecuencial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFactuSecuencial,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroFactuSecuencial= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroFactuSecuencial.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroFactuSecuencial,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroFactuSecuencial.add(this.jMenuItemCerrarParametroFactuSecuencial);
			
			this.jmenuAccionesParametroFactuSecuencial.add(this.jMenuItemNuevoParametroFactuSecuencial);
			this.jmenuAccionesParametroFactuSecuencial.add(this.jMenuItemNuevoGuardarCambiosParametroFactuSecuencial);
			this.jmenuAccionesParametroFactuSecuencial.add(this.jMenuItemNuevoRelacionesParametroFactuSecuencial);
			this.jmenuAccionesParametroFactuSecuencial.add(this.jMenuItemGuardarCambiosTablaParametroFactuSecuencial);		
			this.jmenuAccionesParametroFactuSecuencial.add(this.jMenuItemDuplicarParametroFactuSecuencial);		
			this.jmenuAccionesParametroFactuSecuencial.add(this.jMenuItemCopiarParametroFactuSecuencial);		
			this.jmenuAccionesParametroFactuSecuencial.add(this.jMenuItemVerFormParametroFactuSecuencial);		
			
			this.jmenuDatosParametroFactuSecuencial.add(this.jMenuItemRecargarInformacionParametroFactuSecuencial);				
			this.jmenuDatosParametroFactuSecuencial.add(this.jMenuItemAnterioresParametroFactuSecuencial);				
			this.jmenuDatosParametroFactuSecuencial.add(this.jMenuItemSiguientesParametroFactuSecuencial);				
			this.jmenuDatosParametroFactuSecuencial.add(this.jMenuItemAbrirOrderByParametroFactuSecuencial);				
			this.jmenuDatosParametroFactuSecuencial.add(this.jMenuItemMostrarOcultarParametroFactuSecuencial);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroFactuSecuencial.add(this.jMenuItemGuardarCambiosParametroFactuSecuencial);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroFactuSecuencial.add(this.jmenuArchivoParametroFactuSecuencial);		
			this.jmenuBarParametroFactuSecuencial.add(this.jmenuAccionesParametroFactuSecuencial);		
			this.jmenuBarParametroFactuSecuencial.add(this.jmenuDatosParametroFactuSecuencial);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroFactuSecuencial);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroFactuSecuencial() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaParametroFactuSecuencial.setToolTipText("Buscar Por Bodega Defecto ");
		this.jButtonFK_IdBodegaParametroFactuSecuencial= new JButtonMe();
		this.jButtonFK_IdBodegaParametroFactuSecuencial.setText("Buscar");
		this.jButtonFK_IdBodegaParametroFactuSecuencial.setToolTipText("Buscar Por Bodega Defecto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaParametroFactuSecuencial,"buscar_button","Buscar Por Bodega Defecto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaParametroFactuSecuencial = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaParametroFactuSecuencial.setText("Bodega Defecto :");
		jLabelid_bodegaFK_IdBodegaParametroFactuSecuencial.setToolTipText("Bodega Defecto");
		jLabelid_bodegaFK_IdBodegaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaTransferenciaParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaTransferenciaParametroFactuSecuencial.setToolTipText("Buscar Por Bodega Transferencia ");
		this.jButtonFK_IdBodegaTransferenciaParametroFactuSecuencial= new JButtonMe();
		this.jButtonFK_IdBodegaTransferenciaParametroFactuSecuencial.setText("Buscar");
		this.jButtonFK_IdBodegaTransferenciaParametroFactuSecuencial.setToolTipText("Buscar Por Bodega Transferencia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaTransferenciaParametroFactuSecuencial,"buscar_button","Buscar Por Bodega Transferencia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaTransferenciaParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial = new JLabelMe();
		jLabelid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial.setText("Bodega Transferencia :");
		jLabelid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial.setToolTipText("Bodega Transferencia");
		jLabelid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_transferenciaFK_IdBodegaTransferenciaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoParametroFactuSecuencial.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoParametroFactuSecuencial= new JButtonMe();
		this.jButtonFK_IdFormatoParametroFactuSecuencial.setText("Buscar");
		this.jButtonFK_IdFormatoParametroFactuSecuencial.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoParametroFactuSecuencial,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoParametroFactuSecuencial = new JLabelMe();
		jLabelid_formatoFK_IdFormatoParametroFactuSecuencial.setText("Formato :");
		jLabelid_formatoFK_IdFormatoParametroFactuSecuencial.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoGeneralParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoGeneralParametroFactuSecuencial.setToolTipText("Buscar Por T. Documento General ");
		this.jButtonFK_IdTipoDocumentoGeneralParametroFactuSecuencial= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoGeneralParametroFactuSecuencial.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoGeneralParametroFactuSecuencial.setToolTipText("Buscar Por T. Documento General ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoGeneralParametroFactuSecuencial,"buscar_button","Buscar Por T. Documento General ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoGeneralParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial = new JLabelMe();
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial.setText("T. Documento General :");
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial.setToolTipText("T. Documento General");
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoParamFactuPlazoParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoParamFactuPlazoParametroFactuSecuencial.setToolTipText("Buscar Por T. Parametro Plazo ");
		this.jButtonFK_IdTipoParamFactuPlazoParametroFactuSecuencial= new JButtonMe();
		this.jButtonFK_IdTipoParamFactuPlazoParametroFactuSecuencial.setText("Buscar");
		this.jButtonFK_IdTipoParamFactuPlazoParametroFactuSecuencial.setToolTipText("Buscar Por T. Parametro Plazo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoParamFactuPlazoParametroFactuSecuencial,"buscar_button","Buscar Por T. Parametro Plazo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoParamFactuPlazoParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial = new JLabelMe();
		jLabelid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial.setText("T. Parametro Plazo :");
		jLabelid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial.setToolTipText("T. Parametro Plazo");
		jLabelid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_param_factu_plazoFK_IdTipoParamFactuPlazoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionTransferenciaParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionTransferenciaParametroFactuSecuencial.setToolTipText("Buscar Por Transaccion Transferencia ");
		this.jButtonFK_IdTransaccionTransferenciaParametroFactuSecuencial= new JButtonMe();
		this.jButtonFK_IdTransaccionTransferenciaParametroFactuSecuencial.setText("Buscar");
		this.jButtonFK_IdTransaccionTransferenciaParametroFactuSecuencial.setToolTipText("Buscar Por Transaccion Transferencia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionTransferenciaParametroFactuSecuencial,"buscar_button","Buscar Por Transaccion Transferencia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionTransferenciaParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial = new JLabelMe();
		jLabelid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial.setText("Transaccion Transferencia :");
		jLabelid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial.setToolTipText("Transaccion Transferencia");
		jLabelid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_transferenciaFK_IdTransaccionTransferenciaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroFactuSecuencial=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroFactuSecuencial.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroFactuSecuencial.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroFactuSecuencial.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroFactuSecuencial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroFactuSecuencial = new ParametroFactuSecuencialDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Secuencial  DATOS");
			this.jInternalFrameDetalleFormParametroFactuSecuencial = new ParametroFactuSecuencialDetalleFormJInternalFrame(jDesktopPane,this.parametrofactusecuencialSessionBean.getConGuardarRelaciones(),this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroFactuSecuencial = null;//new ParametroFactuSecuencialDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFactuSecuencial= new GridBagLayout();
		
		
		this.jTableDatosParametroFactuSecuencial = new JTableMe();      
		
		String sToolTipParametroFactuSecuencial="";
		sToolTipParametroFactuSecuencial=ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFactuSecuencial+="(Facturacion.ParametroFactuSecuencial)";
		}
		
		if(!this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFactuSecuencial+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroFactuSecuencial.setToolTipText(sToolTipParametroFactuSecuencial);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroFactuSecuencial);
		this.jTableDatosParametroFactuSecuencial.setAutoCreateRowSorter(true);
		this.jTableDatosParametroFactuSecuencial.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroFactuSecuencial.setRowSelectionAllowed(true);
		this.jTableDatosParametroFactuSecuencial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroFactuSecuencial = new JButtonMe();
		this.jButtonDuplicarParametroFactuSecuencial = new JButtonMe();
		this.jButtonCopiarParametroFactuSecuencial = new JButtonMe();
		this.jButtonVerFormParametroFactuSecuencial = new JButtonMe();
		this.jButtonNuevoRelacionesParametroFactuSecuencial = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroFactuSecuencial = new JButtonMe();
		this.jButtonCerrarParametroFactuSecuencial = new JButtonMe();
		
		this.jScrollPanelDatosParametroFactuSecuencial = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroFactuSecuencial = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotransferenciaParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Parametro Secuencial ";
		
		if(!this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Secuencial s" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFactuSecuencial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFactuSecuencial.setToolTipText("Acciones");
        this.jPanelAccionesParametroFactuSecuencial.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroFactuSecuencial.setName("jPanelCamposFingeneralParametroFactuSecuencial");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotransferenciaParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Transferencia"));
		this.jPanelCamposIniciotransferenciaParametroFactuSecuencial.setName("jPanelCamposFintransferenciaParametroFactuSecuencial");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotransferenciaParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroFactuSecuencial=new ReporteDinamicoJInternalFrame(ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroFactuSecuencial();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroFactuSecuencial=new ImportacionJInternalFrame(ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroFactuSecuencial();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroFactuSecuencial = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroFactuSecuencial.setText("Orden");
		this.jButtonAbrirOrderByParametroFactuSecuencial.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFactuSecuencial,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFactuSecuencial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFactuSecuencial,false,this);
			
			//this.cargarOrderByParametroFactuSecuencial(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFactuSecuencial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFactuSecuencial,true,this);
			
			//this.cargarOrderByParametroFactuSecuencial(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroFactuSecuencial.setMinimumSize(new Dimension(400,50));//1930
		this.jTableDatosParametroFactuSecuencial.setMaximumSize(new Dimension(400,50));//1930
		this.jTableDatosParametroFactuSecuencial.setPreferredSize(new Dimension(400,50));//1930
		
		this.jScrollPanelDatosParametroFactuSecuencial.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFactuSecuencial.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFactuSecuencial.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroFactuSecuencial.setText("Nuevo");
		this.jButtonDuplicarParametroFactuSecuencial.setText("Duplicar");
		this.jButtonCopiarParametroFactuSecuencial.setText("Copiar");
		this.jButtonVerFormParametroFactuSecuencial.setText("Ver");
		this.jButtonNuevoRelacionesParametroFactuSecuencial.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroFactuSecuencial.setText("Guardar");
		this.jButtonCerrarParametroFactuSecuencial.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFactuSecuencial,"nuevo_button","Nuevo",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroFactuSecuencial,"duplicar_button","Duplicar",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroFactuSecuencial,"copiar_button","Copiar",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroFactuSecuencial,"ver_form","Ver",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroFactuSecuencial,"nuevorelaciones_button","Nuevo Rel",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFactuSecuencial,"guardarcambiostabla_button","Guardar",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFactuSecuencial,"cerrar_button","Salir",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroFactuSecuencial.setToolTipText("Nuevo"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroFactuSecuencial.setToolTipText("Duplicar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroFactuSecuencial.setToolTipText("Copiar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroFactuSecuencial.setToolTipText("Ver"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroFactuSecuencial.setToolTipText("Nuevo Rel"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroFactuSecuencial.setToolTipText("Guardar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFactuSecuencial.setToolTipText("Salir"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFactuSecuencial";
		inputMap = this.jButtonNuevoParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFactuSecuencial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFactuSecuencial"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroFactuSecuencial";
		inputMap = this.jButtonDuplicarParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroFactuSecuencial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroFactuSecuencial"));
		
		//COPIAR
		sMapKey = "CopiarParametroFactuSecuencial";
		inputMap = this.jButtonCopiarParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroFactuSecuencial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroFactuSecuencial"));
		
		//VEr FORM
		sMapKey = "VerFormParametroFactuSecuencial";
		inputMap = this.jButtonVerFormParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroFactuSecuencial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroFactuSecuencial"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroFactuSecuencial";
		inputMap = this.jButtonNuevoRelacionesParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroFactuSecuencial"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroFactuSecuencial";
		inputMap = this.jButtonModificarParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroFactuSecuencial"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroFactuSecuencial";
		inputMap = this.jButtonCerrarParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFactuSecuencial"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFactuSecuencial";
		inputMap = this.jButtonGuardarCambiosTablaParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFactuSecuencial"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroFactuSecuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroFactuSecuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroFactuSecuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroFactuSecuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroFactuSecuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroFactuSecuencial.setName("jPanelParametrosReportesParametroFactuSecuencial"); 
		
		this.jPanelParametrosReportesAccionesParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroFactuSecuencial.setName("jPanelParametrosReportesAccionesParametroFactuSecuencial"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroFactuSecuencial = new JButtonMe();
		this.jButtonRecargarInformacionParametroFactuSecuencial.setText("Recargar");
		this.jButtonRecargarInformacionParametroFactuSecuencial.setToolTipText("Recargar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroFactuSecuencial,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroFactuSecuencial = new JButtonMe();
		this.jButtonProcesarInformacionParametroFactuSecuencial.setText("Procesar");
		this.jButtonProcesarInformacionParametroFactuSecuencial.setToolTipText("Procesar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroFactuSecuencial.setVisible(false);
			
		this.jButtonProcesarInformacionParametroFactuSecuencial.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFactuSecuencial.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFactuSecuencial.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroFactuSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuSecuencial.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroFactuSecuencial.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroFactuSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuSecuencial.setText("TIPO");       
		this.jComboBoxTiposReportesParametroFactuSecuencial.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroFactuSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuSecuencial.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroFactuSecuencial.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroFactuSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroFactuSecuencial.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroFactuSecuencial.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroFactuSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroFactuSecuencial.setText("Accion");
		this.jComboBoxTiposRelacionesParametroFactuSecuencial.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroFactuSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFactuSecuencial.setText("Accion");
		this.jComboBoxTiposAccionesParametroFactuSecuencial.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroFactuSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroFactuSecuencial.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroFactuSecuencial.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroFactuSecuencial=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroFactuSecuencial.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFactuSecuencial.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFactuSecuencial.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroFactuSecuencial = new JLabelMe();
		
		this.jLabelAccionesParametroFactuSecuencial.setText("Acciones");		
		this.jLabelAccionesParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroFactuSecuencial = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroFactuSecuencial.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroFactuSecuencial.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroFactuSecuencial = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroFactuSecuencial.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroFactuSecuencial.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroFactuSecuencial = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroFactuSecuencial.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroFactuSecuencial.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroFactuSecuencial = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroFactuSecuencial.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroFactuSecuencial.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroFactuSecuencial = new JButtonMe();
		//this.jButtonAnterioresParametroFactuSecuencial.setText("<<");
        this.jButtonAnterioresParametroFactuSecuencial.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroFactuSecuencial,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroFactuSecuencial = new JButtonMe();
		//this.jButtonSiguientesParametroFactuSecuencial.setText(">>");
        this.jButtonSiguientesParametroFactuSecuencial.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroFactuSecuencial,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroFactuSecuencial = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroFactuSecuencial.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroFactuSecuencial.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroFactuSecuencial,"nuevoguardarcambios_button","Nue",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroFactuSecuencial";
		inputMap = this.jButtonNuevoGuardarCambiosParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroFactuSecuencial"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroFactuSecuencial";
		inputMap = this.jButtonRecargarInformacionParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroFactuSecuencial"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroFactuSecuencial";
		inputMap = this.jButtonSiguientesParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroFactuSecuencial"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroFactuSecuencial";
		inputMap = this.jButtonAnterioresParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroFactuSecuencial"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroFactuSecuencial();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroFactuSecuencial.setMinimumSize(new Dimension(this.getWidth(),ParametroFactuSecuencialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuSecuencialBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFactuSecuencial.setMaximumSize(new Dimension(this.getWidth(),ParametroFactuSecuencialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuSecuencialBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFactuSecuencial.setPreferredSize(new Dimension(this.getWidth(),ParametroFactuSecuencialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuSecuencialBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroFactuSecuencial = new GridBagLayout();

			this.jPanelPaginacionParametroFactuSecuencial.setLayout(gridaBagLayoutPaginacionParametroFactuSecuencial);						
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroFactuSecuencial.add(this.jButtonAnterioresParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
					
						
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
			
			this.jPanelPaginacionParametroFactuSecuencial.add(this.jButtonNuevoGuardarCambiosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
						
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
			this.jPanelPaginacionParametroFactuSecuencial.add(this.jButtonSiguientesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = 1;
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuSecuencial.add(this.jButtonNuevoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
						
			
			
			if(!this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroFactuSecuencial.gridy = 1;
				this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroFactuSecuencial.add(this.jButtonGuardarCambiosTablaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			}
			
			
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = 1;
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuSecuencial.add(this.jButtonDuplicarParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = 1;
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuSecuencial.add(this.jButtonCopiarParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = 1;
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuSecuencial.add(this.jButtonVerFormParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = 1;
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroFactuSecuencial.add(this.jButtonCerrarParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		
		
		
		this.jButtonRecargarInformacionParametroFactuSecuencial.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFactuSecuencial.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFactuSecuencial.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroFactuSecuencial.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFactuSecuencial.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFactuSecuencial.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroFactuSecuencial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFactuSecuencial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFactuSecuencial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroFactuSecuencial.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFactuSecuencial.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFactuSecuencial.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroFactuSecuencial.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFactuSecuencial.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFactuSecuencial.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroFactuSecuencial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFactuSecuencial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFactuSecuencial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroFactuSecuencial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuSecuencial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuSecuencial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroFactuSecuencial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFactuSecuencial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFactuSecuencial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroFactuSecuencial.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFactuSecuencial.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFactuSecuencial.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroFactuSecuencial.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFactuSecuencial.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFactuSecuencial.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroFactuSecuencial.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFactuSecuencial.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFactuSecuencial.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroFactuSecuencial.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFactuSecuencial.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFactuSecuencial.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroFactuSecuencial = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroFactuSecuencial = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroFactuSecuencial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroFactuSecuencial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroFactuSecuencial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroFactuSecuencial = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroFactuSecuencial.setLayout(gridaBagParametrosReportesParametroFactuSecuencial);
			this.jPanelParametrosReportesAccionesParametroFactuSecuencial.setLayout(gridaBagParametrosReportesAccionesParametroFactuSecuencial);
			
			
			this.jPanelParametrosAuxiliar1ParametroFactuSecuencial.setLayout(gridaBagParametrosAuxiliar1ParametroFactuSecuencial);
			this.jPanelParametrosAuxiliar2ParametroFactuSecuencial.setLayout(gridaBagParametrosAuxiliar2ParametroFactuSecuencial);
			this.jPanelParametrosAuxiliar3ParametroFactuSecuencial.setLayout(gridaBagParametrosAuxiliar3ParametroFactuSecuencial);
			this.jPanelParametrosAuxiliar4ParametroFactuSecuencial.setLayout(gridaBagParametrosAuxiliar4ParametroFactuSecuencial);
			//this.jPanelParametrosAuxiliar5ParametroFactuSecuencial.setLayout(gridaBagParametrosAuxiliar2ParametroFactuSecuencial);			
			
			
			
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jButtonRecargarInformacionParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuSecuencial.add(this.jComboBoxTiposPaginacionParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuSecuencial.add(this.jCheckBoxConAltoMaximoTablaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuSecuencial.add(this.jComboBoxTiposArchivosReportesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jPanelParametrosAuxiliar1ParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuSecuencial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroFactuSecuencial.add(this.jComboBoxTiposReportesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jPanelParametrosAuxiliar4ParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jComboBoxTiposReportesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jCheckBoxGenerarReporteParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jPanelParametrosAuxiliar2ParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuSecuencial.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jLabelAccionesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jButtonAbrirOrderByParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jComboBoxTiposSeleccionarParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);			
			
			
			/*
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuSecuencial.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jCheckBoxSeleccionarTodosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuSecuencial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFactuSecuencial.add(this.jCheckBoxSeleccionarTodosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);															
				
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuSecuencial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFactuSecuencial.add(this.jCheckBoxSeleccionadosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jPanelParametrosAuxiliar3ParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jComboBoxTiposAccionesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
	
				
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuSecuencial.add(this.jTextFieldValorCampoGeneralParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroFactuSecuencial= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroFactuSecuencial.setLayout(gridaBagLayoutCamposIniciogeneralParametroFactuSecuencial);

		GridBagLayout gridaBagLayoutCamposIniciotransferenciaParametroFactuSecuencial= new GridBagLayout();
		this.jPanelCamposIniciotransferenciaParametroFactuSecuencial.setLayout(gridaBagLayoutCamposIniciotransferenciaParametroFactuSecuencial);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroFactuSecuencial = new GridBagLayout();

			this.jScrollPanelDatosParametroFactuSecuencial.setLayout(gridaBagLayoutDatosParametroFactuSecuencial);
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
			this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
			
			this.jScrollPanelDatosParametroFactuSecuencial.add(this.jTableDatosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroFactuSecuencial.setViewportView(this.jTableDatosParametroFactuSecuencial);
		this.jTableDatosParametroFactuSecuencial.setFillsViewportHeight(true);
		this.jTableDatosParametroFactuSecuencial.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroFactuSecuencial= new GridBagLayout();
		this.jPanelAccionesParametroFactuSecuencial.setLayout(gridaBagLayoutAccionesParametroFactuSecuencial);
		
		
		/*	
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
			
		this.jPanelAccionesParametroFactuSecuencial.add(this.jButtonNuevoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFactuSecuencial);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();						
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;		
			//this.gridBagConstraintsParametroFactuSecuencial.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFactuSecuencial.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;		
		//this.gridBagConstraintsParametroFactuSecuencial.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroFactuSecuencial);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);								
		
		
		/*
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		*/		
		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuSecuencial.gridx =0;
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFactuSecuencial.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
				
		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroFactuSecuencialJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroFactuSecuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFactuSecuencial = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroFactuSecuencial.setLayout(gridaBagLayoutBusquedasParametrosParametroFactuSecuencial);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroFactuSecuencial=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			
			
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		
			
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroFactuSecuencial;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroFactuSecuencial() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroFactuSecuencial = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroFactuSecuencial.setName("jPanelReporteDinamicoParametroFactuSecuencial"); 
		
		this.jPanelReporteDinamicoParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroFactuSecuencial.setLayout(gridaBagLayoutReporteDinamicoParametroFactuSecuencial);
		
		
		this.jInternalFrameReporteDinamicoParametroFactuSecuencial= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroFactuSecuencial = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFactuSecuencial= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroFactuSecuencial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroFactuSecuencial.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroFactuSecuencial.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroFactuSecuencial.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroFactuSecuencial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroFactuSecuencial.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroFactuSecuencial.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroFactuSecuencial.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Secuencial s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroFactuSecuencial = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroFactuSecuencial.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFactuSecuencial.add(this.jLabelColumnasSelectReporteParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroFactuSecuencial = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroFactuSecuencial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroFactuSecuencial.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroFactuSecuencial.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFactuSecuencial.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFactuSecuencial.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroFactuSecuencial=new JScrollPane(this.jListColumnasSelectReporteParametroFactuSecuencial);
			
			this.jScrollColumnasSelectReporteParametroFactuSecuencial.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFactuSecuencial.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFactuSecuencial.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroFactuSecuencial.add(this.jListColumnasSelectReporteParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		this.jPanelReporteDinamicoParametroFactuSecuencial.add(this.jScrollColumnasSelectReporteParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroFactuSecuencial = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroFactuSecuencial.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroFactuSecuencial = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroFactuSecuencial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroFactuSecuencial.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroFactuSecuencial.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFactuSecuencial.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFactuSecuencial.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroFactuSecuencial=new JScrollPane(this.jListRelacionesSelectReporteParametroFactuSecuencial);
			
			this.jScrollRelacionesSelectReporteParametroFactuSecuencial.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFactuSecuencial.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFactuSecuencial.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroFactuSecuencial = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroFactuSecuencial = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroFactuSecuencial = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroFactuSecuencial = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroFactuSecuencial.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroFactuSecuencial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFactuSecuencial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFactuSecuencial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroFactuSecuencial = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroFactuSecuencial.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuSecuencial.add(this.jLabelGenerarExcelReporteDinamicoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroFactuSecuencial = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroFactuSecuencial.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroFactuSecuencial,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroFactuSecuencial.setToolTipText("Generar EXCEL"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroFactuSecuencial.add(this.jButtonGenerarExcelReporteDinamicoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuSecuencial.add(this.jComboBoxTiposReportesDinamicoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroFactuSecuencial = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroFactuSecuencial.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuSecuencial.add(this.jLabelTiposArchivoReporteDinamicoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuSecuencial.add(this.jComboBoxTiposArchivosReportesDinamicoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroFactuSecuencial = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroFactuSecuencial.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroFactuSecuencial,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroFactuSecuencial.setToolTipText("Generar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuSecuencial.add(this.jButtonGenerarReporteDinamicoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroFactuSecuencial = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroFactuSecuencial.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroFactuSecuencial,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroFactuSecuencial.setToolTipText("Cancelar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuSecuencial.add(this.jButtonCerrarReporteDinamicoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroFactuSecuencial = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroFactuSecuencial= new JScrollPane(jPanelReporteDinamicoParametroFactuSecuencial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Secuencial s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuSecuencial.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroFactuSecuencial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroFactuSecuencial.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroFactuSecuencial);
		this.jInternalFrameReporteDinamicoParametroFactuSecuencial.getContentPane().add(this.jScrollPanelReporteDinamicoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroFactuSecuencial() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroFactuSecuencial = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroFactuSecuencial.setName("jPanelImportacionParametroFactuSecuencial"); 
		
		this.jPanelImportacionParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroFactuSecuencial.setLayout(gridaBagLayoutImportacionParametroFactuSecuencial);
		
		
		this.jInternalFrameImportacionParametroFactuSecuencial= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroFactuSecuencial= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroFactuSecuencial = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFactuSecuencial= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroFactuSecuencial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFactuSecuencial.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFactuSecuencial.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroFactuSecuencial.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFactuSecuencial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFactuSecuencial.setResizable(true);
	    this.jInternalFrameImportacionParametroFactuSecuencial.setClosable(true);
	    this.jInternalFrameImportacionParametroFactuSecuencial.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroFactuSecuencial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFactuSecuencial.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFactuSecuencial.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroFactuSecuencial.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFactuSecuencial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFactuSecuencial.setResizable(true);
	    this.jInternalFrameImportacionParametroFactuSecuencial.setClosable(true);
	    this.jInternalFrameImportacionParametroFactuSecuencial.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Secuencial s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroFactuSecuencial = new JLabelMe();

		this.jLabelArchivoImportacionParametroFactuSecuencial.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFactuSecuencial.add(this.jLabelArchivoImportacionParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroFactuSecuencial = new JFileChooser();		
		this.jFileChooserImportacionParametroFactuSecuencial.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroFactuSecuencial = new JButtonMe();
		this.jButtonAbrirImportacionParametroFactuSecuencial.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroFactuSecuencial,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroFactuSecuencial.setToolTipText("Generar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuSecuencial.add(this.jButtonAbrirImportacionParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroFactuSecuencial = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroFactuSecuencial.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFactuSecuencial.add(this.jLabelPathArchivoImportacionParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroFactuSecuencial=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroFactuSecuencial.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFactuSecuencial.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFactuSecuencial.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuSecuencial.add(this.jTextFieldPathArchivoImportacionParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroFactuSecuencial = new JButtonMe();
		this.jButtonGenerarImportacionParametroFactuSecuencial.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroFactuSecuencial,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroFactuSecuencial.setToolTipText("Generar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuSecuencial.add(this.jButtonGenerarImportacionParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroFactuSecuencial = new JButtonMe();
		this.jButtonCerrarImportacionParametroFactuSecuencial.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroFactuSecuencial,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroFactuSecuencial.setToolTipText("Cancelar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuSecuencial.add(this.jButtonCerrarImportacionParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroFactuSecuencial = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroFactuSecuencial= new JScrollPane(jPanelImportacionParametroFactuSecuencial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroFactuSecuencial.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroFactuSecuencial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroFactuSecuencial.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroFactuSecuencial);
		this.jInternalFrameImportacionParametroFactuSecuencial.getContentPane().add(this.jScrollPanelImportacionParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroFactuSecuencial(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroFactuSecuencial = new JButtonMe();
			this.jButtonAbrirOrderByParametroFactuSecuencial.setText("Orden");
			this.jButtonAbrirOrderByParametroFactuSecuencial.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFactuSecuencial,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroFactuSecuencial";
			inputMap = this.jButtonAbrirOrderByParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroFactuSecuencial"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroFactuSecuencial = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroFactuSecuencial.setName("jPanelOrderByParametroFactuSecuencial"); 
			
			this.jPanelOrderByParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroFactuSecuencial.setLayout(gridaBagLayoutOrderByParametroFactuSecuencial);
			
			
			this.jTableDatosParametroFactuSecuencialOrderBy = new JTableMe();        
			this.jTableDatosParametroFactuSecuencialOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroFactuSecuencialOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroFactuSecuencialOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroFactuSecuencialOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroFactuSecuencialOrderBy.setViewportView(this.jTableDatosParametroFactuSecuencialOrderBy);
			this.jTableDatosParametroFactuSecuencialOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroFactuSecuencialOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroFactuSecuencial= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroFactuSecuencial= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroFactuSecuencial = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroFactuSecuencial= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroFactuSecuencial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroFactuSecuencial.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroFactuSecuencial.setTitle("Orden");
			this.jInternalFrameOrderByParametroFactuSecuencial.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroFactuSecuencial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroFactuSecuencial.setResizable(true);
			this.jInternalFrameOrderByParametroFactuSecuencial.setClosable(true);
			this.jInternalFrameOrderByParametroFactuSecuencial.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Secuencial s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroFactuSecuencial.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroFactuSecuencial.ipady =150;
				
			this.jPanelOrderByParametroFactuSecuencial.add(jScrollPanelDatosParametroFactuSecuencialOrderBy, this.gridBagConstraintsParametroFactuSecuencial);//this.jTableDatosParametroFactuSecuencialTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroFactuSecuencial = new JButtonMe();
			this.jButtonCerrarOrderByParametroFactuSecuencial.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroFactuSecuencial,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroFactuSecuencial.setToolTipText("Cancelar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroFactuSecuencial.add(this.jButtonCerrarOrderByParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroFactuSecuencial = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroFactuSecuencial= new JScrollPane(jPanelOrderByParametroFactuSecuencial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroFactuSecuencial.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroFactuSecuencial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroFactuSecuencial.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroFactuSecuencial);
			
			this.jInternalFrameOrderByParametroFactuSecuencial.getContentPane().add(this.jScrollPanelOrderByParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);			
		
		} else {
			this.jButtonAbrirOrderByParametroFactuSecuencial = new JButtonMe();
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
		int iWidthTableCalculado=0;//3930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrofactusecuencialSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroFactuSecuencial.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroFactuSecuencial.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroFactuSecuencial.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroFactuSecuencial.getRowHeight();//ParametroFactuSecuencialConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroFactuSecuencialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFactuSecuencial.isSelected()) {
					iHeightTable=ParametroFactuSecuencialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFactuSecuencialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFactuSecuencialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroFactuSecuencialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFactuSecuencial.isSelected()) {
					iHeightTable=ParametroFactuSecuencialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFactuSecuencialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFactuSecuencialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroFactuSecuencial!=null && this.jInternalFrameOrderByParametroFactuSecuencial.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroFactuSecuencial.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroFactuSecuencial.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroFactuSecuencial.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroFactuSecuencial.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroFactuSecuencial.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroFactuSecuencial.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroFactuSecuencial.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrofactusecuencialLogic.getParametroFactuSecuencials().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrofactusecuencials.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroFactuSecuencial> TraerParametroFactuSecuencialBeans(List<ParametroFactuSecuencial> parametrofactusecuencials,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroFactuSecuencial parametrofactusecuencial:parametrofactusecuencials) {
					
				if(!(ParametroFactuSecuencialConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroFactuSecuencialConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrofactusecuencial.setsDetalleGeneralEntityReporte(ParametroFactuSecuencialConstantesFunciones.getParametroFactuSecuencialDescripcion(parametrofactusecuencial));
										
					parametrofactusecuencial.setcon_detalle_descripcion(ParametroFactuSecuencialConstantesFunciones.getcon_detalleDescripcion(parametrofactusecuencial));parametrofactusecuencial.setcon_lector_descripcion(ParametroFactuSecuencialConstantesFunciones.getcon_lectorDescripcion(parametrofactusecuencial));parametrofactusecuencial.setcon_transferencia_descripcion(ParametroFactuSecuencialConstantesFunciones.getcon_transferenciaDescripcion(parametrofactusecuencial));	
					
						
					
				} else  {
							
					//parametrofactusecuencial.setsDetalleGeneralEntityReporte(parametrofactusecuencial.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrofactusecuencialbeans.add(parametrofactusecuencialbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrofactusecuencials;
    }
	//PARA REPORTES FIN
}
