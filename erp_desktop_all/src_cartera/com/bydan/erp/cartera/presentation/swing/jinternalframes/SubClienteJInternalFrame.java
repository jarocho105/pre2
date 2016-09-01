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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.SubClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class SubClienteJInternalFrame extends SubClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSubCliente;
	
	protected JMenuBar jmenuBarSubCliente;
	
	protected JMenu jmenuSubCliente;
	protected JMenu jmenuDatosSubCliente;
	protected JMenu jmenuArchivoSubCliente;
	protected JMenu jmenuAccionesSubCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSubCliente;	
	protected GridBagConstraints gridBagConstraintsSubCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SubClienteDetalleFormJInternalFrame jInternalFrameDetalleFormSubCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSubCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSubCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected PaisBeanSwingJInternalFrame paisnacionalidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_paisnacionalidad="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";

	protected EstadoLegalBeanSwingJInternalFrame estadolegalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadolegal="";

	protected TipoNivelEduBeanSwingJInternalFrame tiponiveleduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiponiveledu="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public SubClienteSessionBean subclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public PaisSessionBean paisnacionalidadSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;
	public EstadoLegalSessionBean estadolegalSessionBean;
	public TipoNivelEduSessionBean tiponiveleduSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SubCliente> subclientes;		
	public List<SubCliente> subclientesEliminados;	
	public List<SubCliente> subclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySubCliente;		
	protected JButton jButtonAbrirOrderBySubCliente;
	
	
	//protected JPanel jPanelOrderBySubCliente;
	//public JScrollPane jScrollPanelOrderBySubCliente;	
	//protected JButton jButtonCerrarOrderBySubCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SubClienteLogic subclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSubCliente;
	public JScrollPane jScrollPanelDatosEdicionSubCliente;
	public JScrollPane jScrollPanelDatosGeneralSubCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosSubClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSubCliente;
	//public JScrollPane jScrollPanelImportacionSubCliente;
	
	
	
	protected JPanel jPanelAccionesSubCliente;
	
    protected JPanel jPanelPaginacionSubCliente;
    protected JPanel jPanelParametrosReportesSubCliente;
	protected JPanel jPanelParametrosReportesAccionesSubCliente;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralSubCliente;
	protected Integer iXPanelCamposIniciogeneralSubCliente=0;
	protected Integer iYPanelCamposIniciogeneralSubCliente=0;

	protected JPanel jPanelCamposInicioubicacionSubCliente;
	protected Integer iXPanelCamposInicioubicacionSubCliente=0;
	protected Integer iYPanelCamposInicioubicacionSubCliente=0;

	protected JPanel jPanelCamposIniciopersonalSubCliente;
	protected Integer iXPanelCamposIniciopersonalSubCliente=0;
	protected Integer iYPanelCamposIniciopersonalSubCliente=0;

	protected JPanel jPanelCamposIniciocontableSubCliente;
	protected Integer iXPanelCamposIniciocontableSubCliente=0;
	protected Integer iYPanelCamposIniciocontableSubCliente=0;

	protected JPanel jPanelCamposIniciocontratoSubCliente;
	protected Integer iXPanelCamposIniciocontratoSubCliente=0;
	protected Integer iYPanelCamposIniciocontratoSubCliente=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SubCliente;
	protected JPanel jPanelParametrosAuxiliar2SubCliente;
	protected JPanel jPanelParametrosAuxiliar3SubCliente;
	protected JPanel jPanelParametrosAuxiliar4SubCliente;
	//protected JPanel jPanelParametrosAuxiliar5SubCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoSubCliente;
	//protected JPanel jPanelImportacionSubCliente;
	
	
	public JTable jTableDatosSubCliente;
	
	
	
	//public JTable jTableDatosSubClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSubCliente;
	protected JButton jButtonDuplicarSubCliente;
	protected JButton jButtonCopiarSubCliente;
	protected JButton jButtonVerFormSubCliente;
	protected JButton jButtonNuevoRelacionesSubCliente;
	protected JButton jButtonModificarSubCliente;
	
    protected JButton jButtonGuardarCambiosTablaSubCliente;
	protected JButton jButtonCerrarSubCliente;
	
	
	protected JButton jButtonRecargarInformacionSubCliente;
	protected JButton jButtonProcesarInformacionSubCliente;
	
	
	protected JButton jButtonAnterioresSubCliente;
	protected JButton jButtonSiguientesSubCliente;
	protected JButton jButtonNuevoGuardarCambiosSubCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSubCliente;
	//protected JButton jButtonCerrarReporteDinamicoSubCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoSubCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionSubCliente;
	//protected JButton jButtonGenerarImportacionSubCliente;
	//protected JButton jButtonCerrarImportacionSubCliente;
	//protected JFileChooser jFileChooserImportacionSubCliente;
	//protected File fileImportacionSubCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSubCliente;
	protected JButton jButtonDuplicarToolBarSubCliente;
	protected JButton jButtonNuevoRelacionesToolBarSubCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarSubCliente;
	protected JButton jButtonCopiarToolBarSubCliente;
	protected JButton jButtonVerFormToolBarSubCliente;
	public JButton jButtonGuardarCambiosTablaToolBarSubCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarSubCliente;
	protected JButton jButtonCerrarToolBarSubCliente;
	
	protected JButton jButtonRecargarInformacionToolBarSubCliente;
	protected JButton jButtonProcesarInformacionToolBarSubCliente;
	protected JButton jButtonAnterioresToolBarSubCliente;
	protected JButton jButtonSiguientesToolBarSubCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarSubCliente;
	protected JButton jButtonAbrirOrderByToolBarSubCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSubCliente;
	protected JMenuItem jMenuItemDuplicarSubCliente;
	protected JMenuItem jMenuItemNuevoRelacionesSubCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSubCliente;
	protected JMenuItem jMenuItemCopiarSubCliente;
	protected JMenuItem jMenuItemVerFormSubCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaSubCliente;
	protected JMenuItem jMenuItemCerrarSubCliente;
	protected JMenuItem jMenuItemDetalleCerrarSubCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySubCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarSubCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionSubCliente;
	protected JMenuItem jMenuItemProcesarInformacionSubCliente;
	protected JMenuItem jMenuItemAnterioresSubCliente;
	protected JMenuItem jMenuItemSiguientesSubCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSubCliente;
	protected JMenuItem jMenuItemAbrirOrderBySubCliente;
	protected JMenuItem jMenuItemMostrarOcultarSubCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSubCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSubCliente;
	protected JCheckBox jCheckBoxSeleccionadosSubCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSubCliente;
	protected JCheckBox jCheckBoxConGraficoReporteSubCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSubCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSubCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSubCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSubCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSubCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSubCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSubCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSubCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSubCliente;
	protected JTextField jTextFieldValorCampoGeneralSubCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSubCliente;
	//public JList<Reporte> jListColumnasSelectReporteSubCliente;
	//public JScrollPane jScrollColumnasSelectReporteSubCliente;
	
	//public JLabel jLabelRelacionesSelectReporteSubCliente;
	//public JList<Reporte> jListRelacionesSelectReporteSubCliente;
	//public JScrollPane jScrollRelacionesSelectReporteSubCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSubCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSubCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSubCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoSubCliente;
	
		
	//public JLabel jLabelArchivoImportacionSubCliente;	
	//public JLabel jLabelPathArchivoImportacionSubCliente;
	//protected JTextField jTextFieldPathArchivoImportacionSubCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSubCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSubCliente;
	
	//public JLabel jLabelColumnaCategoriaValorSubCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSubCliente;
	
	//public JLabel jLabelColumnasValoresGraficoSubCliente;
	//public JList<Reporte> jListColumnasValoresGraficoSubCliente;
	//public JScrollPane jScrollColumnasValoresGraficoSubCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSubCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSubCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSubCliente;
	public JPanel jPanelBusquedaPorIdentificacionSubCliente;
	public JButton jButtonBusquedaPorIdentificacionSubCliente;
	public JPanel jPanelBusquedaPorNombreCompletoSubCliente;
	public JButton jButtonBusquedaPorNombreCompletoSubCliente;
	public JPanel jPanelBusquedaPorRucSubCliente;
	public JButton jButtonBusquedaPorRucSubCliente;
	public JPanel jPanelFK_IdClienteSubCliente;
	public JButton jButtonFK_IdClienteSubCliente;
	public JPanel jPanelFK_IdEstadoCivilSubCliente;
	public JButton jButtonFK_IdEstadoCivilSubCliente;
	public JPanel jPanelFK_IdEstadoLegalSubCliente;
	public JButton jButtonFK_IdEstadoLegalSubCliente;
	public JPanel jPanelFK_IdTipoIdentificacionSubCliente;
	public JButton jButtonFK_IdTipoIdentificacionSubCliente;
	
	public JPanel jPanelidentificacionBusquedaPorIdentificacionSubCliente;
	public JLabel jLabelidentificacionBusquedaPorIdentificacionSubCliente;
	public JTextField jTextFieldidentificacionBusquedaPorIdentificacionSubCliente;
	public JButton jButtonidentificacionBusquedaPorIdentificacionSubClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_completoBusquedaPorNombreCompletoSubCliente;
	public JLabel jLabelnombre_completoBusquedaPorNombreCompletoSubCliente;
	public JTextArea jTextAreanombre_completoBusquedaPorNombreCompletoSubCliente;
	public JButton jButtonnombre_completoBusquedaPorNombreCompletoSubClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelrucBusquedaPorRucSubCliente;
	public JLabel jLabelrucBusquedaPorRucSubCliente;
	public JTextField jTextFieldrucBusquedaPorRucSubCliente;
	public JButton jButtonrucBusquedaPorRucSubClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteSubCliente;
	public JLabel jLabelid_clienteFK_IdClienteSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteSubCliente;
	public JButton jButtonid_clienteFK_IdClienteSubCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteSubClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteSubCliente;
	
	public JPanel jPanelid_estado_civilFK_IdEstadoCivilSubCliente;
	public JLabel jLabelid_estado_civilFK_IdEstadoCivilSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_civilFK_IdEstadoCivilSubCliente;
	public JButton jButtonid_estado_civilFK_IdEstadoCivilSubCliente= new JButtonMe();
	public JButton jButtonid_estado_civilFK_IdEstadoCivilSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_civilFK_IdEstadoCivilSubClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_legalFK_IdEstadoLegalSubCliente;
	public JLabel jLabelid_estado_legalFK_IdEstadoLegalSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_legalFK_IdEstadoLegalSubCliente;
	public JButton jButtonid_estado_legalFK_IdEstadoLegalSubCliente= new JButtonMe();
	public JButton jButtonid_estado_legalFK_IdEstadoLegalSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_legalFK_IdEstadoLegalSubClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_identificacionFK_IdTipoIdentificacionSubCliente;
	public JLabel jLabelid_tipo_identificacionFK_IdTipoIdentificacionSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionSubCliente;
	public JButton jButtonid_tipo_identificacionFK_IdTipoIdentificacionSubCliente= new JButtonMe();
	public JButton jButtonid_tipo_identificacionFK_IdTipoIdentificacionSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_identificacionFK_IdTipoIdentificacionSubClienteBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=1364;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SubClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SubCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SubCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSubCliente)	{
		this.jButtonRecargarInformacionSubCliente = jButtonRecargarInformacionSubCliente;
	}
	
	public JButton getjButtonProcesarInformacionSubCliente() {
		return this.jButtonProcesarInformacionSubCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSubCliente)	{
		this.jButtonProcesarInformacionSubCliente = jButtonProcesarInformacionSubCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionSubCliente() {
		return this.jButtonRecargarInformacionSubCliente;
	}
	
	
	public List<SubCliente> getsubclientes() {
		return this.subclientes;
	}

	public void setsubclientes(List<SubCliente> subclientes) {
		this.subclientes = subclientes;
	}
	
	public List<SubCliente> getsubclientesAux() {
		return this.subclientesAux;
	}

	public void setsubclientesAux(List<SubCliente> subclientesAux) {
		this.subclientesAux = subclientesAux;
	}
	
	public List<SubCliente> getsubclientesEliminados() {
		return this.subclientesEliminados;
	}

	public void setSubClientesEliminados(List<SubCliente> subclientesEliminados) {
		this.subclientesEliminados = subclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSubCliente() {
		return jComboBoxTiposSeleccionarSubCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSubCliente(
			JComboBox jComboBoxTiposSeleccionarSubCliente) {
		this.jComboBoxTiposSeleccionarSubCliente = jComboBoxTiposSeleccionarSubCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarSubCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSubCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSubCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSubCliente() {
		return jTextFieldValorCampoGeneralSubCliente;
	}

	public void setjTextFieldValorCampoGeneralSubCliente(
			JTextField jTextFieldValorCampoGeneralSubCliente) {
		this.jTextFieldValorCampoGeneralSubCliente = jTextFieldValorCampoGeneralSubCliente;
	}

	public void setBorderResaltarValorCampoGeneralSubCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSubCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSubCliente() {
		return this.jCheckBoxSeleccionarTodosSubCliente;
	}

	public void setjCheckBoxSeleccionarTodosSubCliente(
			JCheckBox jCheckBoxSeleccionarTodosSubCliente) {
		this.jCheckBoxSeleccionarTodosSubCliente = jCheckBoxSeleccionarTodosSubCliente;
	}

	public void setBorderResaltarSeleccionarTodosSubCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSubCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSubCliente() {
		return this.jCheckBoxSeleccionadosSubCliente;
	}

	public void setjCheckBoxSeleccionadosSubCliente(
			JCheckBox jCheckBoxSeleccionadosSubCliente) {
		this.jCheckBoxSeleccionadosSubCliente = jCheckBoxSeleccionadosSubCliente;
	}
	
	public void setBorderResaltarSeleccionadosSubCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSubCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSubCliente() {
		return this.jComboBoxTiposArchivosReportesSubCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSubCliente(
			JComboBox jComboBoxTiposArchivosReportesSubCliente) {
		this.jComboBoxTiposArchivosReportesSubCliente = jComboBoxTiposArchivosReportesSubCliente;
	}

	public void setBorderResaltarTiposArchivosReportesSubCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSubCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSubCliente() {
		return this.jComboBoxTiposReportesSubCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSubCliente(
			JComboBox jComboBoxTiposReportesSubCliente) {
		this.jComboBoxTiposReportesSubCliente = jComboBoxTiposReportesSubCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSubCliente() {
	//	return jComboBoxTiposReportesDinamicoSubCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSubCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoSubCliente) {
	//	this.jComboBoxTiposReportesDinamicoSubCliente = jComboBoxTiposReportesDinamicoSubCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSubCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoSubCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSubCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSubCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSubCliente = jComboBoxTiposArchivosReportesDinamicoSubCliente;
	//}
	
	public void setBorderResaltarTiposReportesSubCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSubCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSubCliente() {
		return this.jComboBoxTiposGraficosReportesSubCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSubCliente(
			JComboBox jComboBoxTiposGraficosReportesSubCliente) {
		this.jComboBoxTiposGraficosReportesSubCliente = jComboBoxTiposGraficosReportesSubCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesSubCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSubCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSubCliente() {
		return this.jComboBoxTiposPaginacionSubCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSubCliente(
			JComboBox jComboBoxTiposPaginacionSubCliente) {
		this.jComboBoxTiposPaginacionSubCliente = jComboBoxTiposPaginacionSubCliente;
	}
	
	public void setBorderResaltarTiposPaginacionSubCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSubCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSubCliente() {
		return this.jComboBoxTiposRelacionesSubCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSubCliente() {
		return this.jComboBoxTiposAccionesSubCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSubCliente(
			JComboBox jComboBoxTiposRelacionesSubCliente) {
		this.jComboBoxTiposRelacionesSubCliente = jComboBoxTiposRelacionesSubCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSubCliente(
			JComboBox jComboBoxTiposAccionesSubCliente) {
		this.jComboBoxTiposAccionesSubCliente = jComboBoxTiposAccionesSubCliente;
	}
	
	public void setBorderResaltarTiposRelacionesSubCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSubCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSubCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSubCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSubCliente() {
	//	return jCheckBoxConGraficoDinamicoSubCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoSubCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoSubCliente) {
	//	this.jCheckBoxConGraficoDinamicoSubCliente = jCheckBoxConGraficoDinamicoSubCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSubCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSubCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSubCliente .setBorder(borderResaltar);		
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
		this.subclienteSessionBean=new SubClienteSessionBean();
		
		this.subclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.subclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SubClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sub Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 3450) {
			iWidth=3450;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.subclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SubCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSubCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSubCliente,this.jTtoolBarSubCliente,
							"nuevo","nuevo","Nuevo"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSubCliente,this.jTtoolBarSubCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSubCliente,this.jTtoolBarSubCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSubCliente,this.jTtoolBarSubCliente,
							"duplicar","duplicar","Duplicar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSubCliente,this.jTtoolBarSubCliente,
							"copiar","copiar","Copiar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSubCliente,this.jTtoolBarSubCliente,
							"ver_form","ver_form","Ver"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubCliente,this.jTtoolBarSubCliente,
							"recargar","recargar","Recargar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubCliente,this.jTtoolBarSubCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubCliente,this.jTtoolBarSubCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSubCliente,this.jTtoolBarSubCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSubCliente,this.jTtoolBarSubCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSubCliente,this.jTtoolBarSubCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSubCliente,this.jTtoolBarSubCliente,
							"cerrar","cerrar","Salir"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSubCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSubCliente;
			
				this.jButtonProcesarInformacionToolBarSubCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSubCliente;
				
		//protected JButton jButtonModificarToolBarSubCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSubCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSubCliente=new JMenuMe("General");
		this.jmenuArchivoSubCliente=new JMenuMe("Archivo");
		this.jmenuAccionesSubCliente=new JMenuMe("Acciones");
		this.jmenuDatosSubCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSubCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSubCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSubCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSubCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSubCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSubCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSubCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSubCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSubCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSubCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSubCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSubCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSubCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSubCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSubCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSubCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSubCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSubCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSubCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSubCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSubCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSubCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSubCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSubCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSubCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSubCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSubCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSubCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSubCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSubCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSubCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSubCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSubCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSubCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSubCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSubCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySubCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySubCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySubCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSubCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSubCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSubCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySubCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySubCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySubCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSubCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSubCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSubCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSubCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSubCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSubCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSubCliente.add(this.jMenuItemCerrarSubCliente);
			
			this.jmenuAccionesSubCliente.add(this.jMenuItemNuevoSubCliente);
			this.jmenuAccionesSubCliente.add(this.jMenuItemNuevoGuardarCambiosSubCliente);
			this.jmenuAccionesSubCliente.add(this.jMenuItemNuevoRelacionesSubCliente);
			this.jmenuAccionesSubCliente.add(this.jMenuItemGuardarCambiosTablaSubCliente);		
			this.jmenuAccionesSubCliente.add(this.jMenuItemDuplicarSubCliente);		
			this.jmenuAccionesSubCliente.add(this.jMenuItemCopiarSubCliente);		
			this.jmenuAccionesSubCliente.add(this.jMenuItemVerFormSubCliente);		
			
			this.jmenuDatosSubCliente.add(this.jMenuItemRecargarInformacionSubCliente);				
			this.jmenuDatosSubCliente.add(this.jMenuItemAnterioresSubCliente);				
			this.jmenuDatosSubCliente.add(this.jMenuItemSiguientesSubCliente);				
			this.jmenuDatosSubCliente.add(this.jMenuItemAbrirOrderBySubCliente);				
			this.jmenuDatosSubCliente.add(this.jMenuItemMostrarOcultarSubCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSubCliente.add(this.jMenuItemGuardarCambiosSubCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSubCliente.add(this.jmenuArchivoSubCliente);		
			this.jmenuBarSubCliente.add(this.jmenuAccionesSubCliente);		
			this.jmenuBarSubCliente.add(this.jmenuDatosSubCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSubCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSubCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdentificacionSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdentificacionSubCliente.setToolTipText("Buscar Por Identificacion ");
		this.jButtonBusquedaPorIdentificacionSubCliente= new JButtonMe();
		this.jButtonBusquedaPorIdentificacionSubCliente.setText("Buscar");
		this.jButtonBusquedaPorIdentificacionSubCliente.setToolTipText("Buscar Por Identificacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdentificacionSubCliente,"buscar_button","Buscar Por Identificacion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdentificacionSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidentificacionBusquedaPorIdentificacionSubCliente = new JLabelMe();
		jLabelidentificacionBusquedaPorIdentificacionSubCliente.setText("Identificacion :");
		jLabelidentificacionBusquedaPorIdentificacionSubCliente.setToolTipText("Identificacion");
		jLabelidentificacionBusquedaPorIdentificacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidentificacionBusquedaPorIdentificacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidentificacionBusquedaPorIdentificacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidentificacionBusquedaPorIdentificacionSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldidentificacionBusquedaPorIdentificacionSubCliente= new JTextFieldMe();
		jTextFieldidentificacionBusquedaPorIdentificacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionBusquedaPorIdentificacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionBusquedaPorIdentificacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionBusquedaPorIdentificacionSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreCompletoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCompletoSubCliente.setToolTipText("Buscar Por Nombre Completo ");
		this.jButtonBusquedaPorNombreCompletoSubCliente= new JButtonMe();
		this.jButtonBusquedaPorNombreCompletoSubCliente.setText("Buscar");
		this.jButtonBusquedaPorNombreCompletoSubCliente.setToolTipText("Buscar Por Nombre Completo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCompletoSubCliente,"buscar_button","Buscar Por Nombre Completo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCompletoSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombre_completoBusquedaPorNombreCompletoSubCliente = new JLabelMe();
		jLabelnombre_completoBusquedaPorNombreCompletoSubCliente.setText("Nombre Completo :");
		jLabelnombre_completoBusquedaPorNombreCompletoSubCliente.setToolTipText("Nombre Completo");
		jLabelnombre_completoBusquedaPorNombreCompletoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_completoBusquedaPorNombreCompletoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_completoBusquedaPorNombreCompletoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoBusquedaPorNombreCompletoSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre_completoBusquedaPorNombreCompletoSubCliente= new JTextAreaMe();
		jTextAreanombre_completoBusquedaPorNombreCompletoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoBusquedaPorNombreCompletoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoBusquedaPorNombreCompletoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoBusquedaPorNombreCompletoSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorRucSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorRucSubCliente.setToolTipText("Buscar Por Ruc ");
		this.jButtonBusquedaPorRucSubCliente= new JButtonMe();
		this.jButtonBusquedaPorRucSubCliente.setText("Buscar");
		this.jButtonBusquedaPorRucSubCliente.setToolTipText("Buscar Por Ruc ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorRucSubCliente,"buscar_button","Buscar Por Ruc ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorRucSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelrucBusquedaPorRucSubCliente = new JLabelMe();
		jLabelrucBusquedaPorRucSubCliente.setText("Ruc :");
		jLabelrucBusquedaPorRucSubCliente.setToolTipText("Ruc");
		jLabelrucBusquedaPorRucSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelrucBusquedaPorRucSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldrucBusquedaPorRucSubCliente= new JTextFieldMe();
		jTextFieldrucBusquedaPorRucSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucBusquedaPorRucSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteSubCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteSubCliente= new JButtonMe();
		this.jButtonFK_IdClienteSubCliente.setText("Buscar");
		this.jButtonFK_IdClienteSubCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteSubCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteSubCliente = new JLabelMe();
		jLabelid_clienteFK_IdClienteSubCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClienteSubCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteSubCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteSubCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteSubCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteSubCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteSubCliente.setFocusable(false);

		this.jPanelFK_IdEstadoCivilSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoCivilSubCliente.setToolTipText("Buscar Por Estado Civil ");
		this.jButtonFK_IdEstadoCivilSubCliente= new JButtonMe();
		this.jButtonFK_IdEstadoCivilSubCliente.setText("Buscar");
		this.jButtonFK_IdEstadoCivilSubCliente.setToolTipText("Buscar Por Estado Civil ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoCivilSubCliente,"buscar_button","Buscar Por Estado Civil ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoCivilSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_civilFK_IdEstadoCivilSubCliente = new JLabelMe();
		jLabelid_estado_civilFK_IdEstadoCivilSubCliente.setText("Estado Civil :");
		jLabelid_estado_civilFK_IdEstadoCivilSubCliente.setToolTipText("Estado Civil");
		jLabelid_estado_civilFK_IdEstadoCivilSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_civilFK_IdEstadoCivilSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_civilFK_IdEstadoCivilSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_civilFK_IdEstadoCivilSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_civilFK_IdEstadoCivilSubCliente= new JComboBoxMe();
		jComboBoxid_estado_civilFK_IdEstadoCivilSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilFK_IdEstadoCivilSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilFK_IdEstadoCivilSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_civilFK_IdEstadoCivilSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoLegalSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoLegalSubCliente.setToolTipText("Buscar Por Estado Legal ");
		this.jButtonFK_IdEstadoLegalSubCliente= new JButtonMe();
		this.jButtonFK_IdEstadoLegalSubCliente.setText("Buscar");
		this.jButtonFK_IdEstadoLegalSubCliente.setToolTipText("Buscar Por Estado Legal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoLegalSubCliente,"buscar_button","Buscar Por Estado Legal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoLegalSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_legalFK_IdEstadoLegalSubCliente = new JLabelMe();
		jLabelid_estado_legalFK_IdEstadoLegalSubCliente.setText("Estado Legal :");
		jLabelid_estado_legalFK_IdEstadoLegalSubCliente.setToolTipText("Estado Legal");
		jLabelid_estado_legalFK_IdEstadoLegalSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_legalFK_IdEstadoLegalSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_legalFK_IdEstadoLegalSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_legalFK_IdEstadoLegalSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_legalFK_IdEstadoLegalSubCliente= new JComboBoxMe();
		jComboBoxid_estado_legalFK_IdEstadoLegalSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalFK_IdEstadoLegalSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalFK_IdEstadoLegalSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_legalFK_IdEstadoLegalSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoIdentificacionSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIdentificacionSubCliente.setToolTipText("Buscar Por Tipo Identificacion ");
		this.jButtonFK_IdTipoIdentificacionSubCliente= new JButtonMe();
		this.jButtonFK_IdTipoIdentificacionSubCliente.setText("Buscar");
		this.jButtonFK_IdTipoIdentificacionSubCliente.setToolTipText("Buscar Por Tipo Identificacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIdentificacionSubCliente,"buscar_button","Buscar Por Tipo Identificacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIdentificacionSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionSubCliente = new JLabelMe();
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionSubCliente.setText("Tipo Identificacion :");
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionSubCliente.setToolTipText("Tipo Identificacion");
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_identificacionFK_IdTipoIdentificacionSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionSubCliente= new JComboBoxMe();
		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSubCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasSubCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSubCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSubCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSubCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSubCliente = new SubClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sub Cliente DATOS");
			this.jInternalFrameDetalleFormSubCliente = new SubClienteDetalleFormJInternalFrame(jDesktopPane,this.subclienteSessionBean.getConGuardarRelaciones(),this.subclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSubCliente = null;//new SubClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSubCliente= new GridBagLayout();
		
		
		this.jTableDatosSubCliente = new JTableMe();      
		
		String sToolTipSubCliente="";
		sToolTipSubCliente=SubClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSubCliente+="(Cartera.SubCliente)";
		}
		
		if(!this.subclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipSubCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSubCliente.setToolTipText(sToolTipSubCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSubCliente);
		this.jTableDatosSubCliente.setAutoCreateRowSorter(true);
		this.jTableDatosSubCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSubCliente.setRowSelectionAllowed(true);
		this.jTableDatosSubCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSubCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSubCliente = new JButtonMe();
		this.jButtonDuplicarSubCliente = new JButtonMe();
		this.jButtonCopiarSubCliente = new JButtonMe();
		this.jButtonVerFormSubCliente = new JButtonMe();
		this.jButtonNuevoRelacionesSubCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSubCliente = new JButtonMe();
		this.jButtonCerrarSubCliente = new JButtonMe();
		
		this.jScrollPanelDatosSubCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralSubCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioubicacionSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciopersonalSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontratoSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Sub Cliente";
		
		if(!this.subclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosSubCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSubCliente.setToolTipText("Acciones");
        this.jPanelAccionesSubCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralSubCliente.setName("jPanelCamposFingeneralSubCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioubicacionSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicacion"));
		this.jPanelCamposInicioubicacionSubCliente.setName("jPanelCamposFinubicacionSubCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioubicacionSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciopersonalSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal"));
		this.jPanelCamposIniciopersonalSubCliente.setName("jPanelCamposFinpersonalSubCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciopersonalSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontableSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableSubCliente.setName("jPanelCamposFincontableSubCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontratoSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Contrato"));
		this.jPanelCamposIniciocontratoSubCliente.setName("jPanelCamposFincontratoSubCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontratoSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoSubCliente=new ReporteDinamicoJInternalFrame(SubClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSubCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSubCliente=new ImportacionJInternalFrame(SubClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSubCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySubCliente = new JButtonMe();
		
		this.jButtonAbrirOrderBySubCliente.setText("Orden");
		this.jButtonAbrirOrderBySubCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySubCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySubCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubCliente,false,this);
			
			//this.cargarOrderBySubCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySubCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubCliente,true,this);
			
			//this.cargarOrderBySubCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSubCliente.setMinimumSize(new Dimension(400,50));//3430
		this.jTableDatosSubCliente.setMaximumSize(new Dimension(400,50));//3430
		this.jTableDatosSubCliente.setPreferredSize(new Dimension(400,50));//3430
		
		this.jScrollPanelDatosSubCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSubCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSubCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSubCliente.setText("Nuevo");
		this.jButtonDuplicarSubCliente.setText("Duplicar");
		this.jButtonCopiarSubCliente.setText("Copiar");
		this.jButtonVerFormSubCliente.setText("Ver");
		this.jButtonNuevoRelacionesSubCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSubCliente.setText("Guardar");
		this.jButtonCerrarSubCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSubCliente,"nuevo_button","Nuevo",this.subclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSubCliente,"duplicar_button","Duplicar",this.subclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSubCliente,"copiar_button","Copiar",this.subclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSubCliente,"ver_form","Ver",this.subclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSubCliente,"nuevorelaciones_button","Nuevo Rel",this.subclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSubCliente,"guardarcambiostabla_button","Guardar",this.subclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSubCliente,"cerrar_button","Salir",this.subclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSubCliente.setToolTipText("Nuevo"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSubCliente.setToolTipText("Duplicar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSubCliente.setToolTipText("Copiar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSubCliente.setToolTipText("Ver"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSubCliente.setToolTipText("Nuevo Rel"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSubCliente.setToolTipText("Guardar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSubCliente.setToolTipText("Salir"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSubCliente";
		inputMap = this.jButtonNuevoSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSubCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSubCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarSubCliente";
		inputMap = this.jButtonDuplicarSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSubCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSubCliente"));
		
		//COPIAR
		sMapKey = "CopiarSubCliente";
		inputMap = this.jButtonCopiarSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSubCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSubCliente"));
		
		//VEr FORM
		sMapKey = "VerFormSubCliente";
		inputMap = this.jButtonVerFormSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSubCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSubCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSubCliente";
		inputMap = this.jButtonNuevoRelacionesSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSubCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSubCliente";
		inputMap = this.jButtonModificarSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSubCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSubCliente";
		inputMap = this.jButtonCerrarSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSubCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSubCliente";
		inputMap = this.jButtonGuardarCambiosTablaSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSubCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SubCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SubCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SubCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SubCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SubCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSubCliente.setName("jPanelParametrosReportesSubCliente"); 
		
		this.jPanelParametrosReportesAccionesSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSubCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSubCliente.setName("jPanelParametrosReportesAccionesSubCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSubCliente = new JButtonMe();
		this.jButtonRecargarInformacionSubCliente.setText("Recargar");
		this.jButtonRecargarInformacionSubCliente.setToolTipText("Recargar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSubCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSubCliente = new JButtonMe();
		this.jButtonProcesarInformacionSubCliente.setText("Procesar");
		this.jButtonProcesarInformacionSubCliente.setToolTipText("Procesar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSubCliente.setVisible(false);
			
		this.jButtonProcesarInformacionSubCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSubCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSubCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSubCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSubCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSubCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubCliente.setText("TIPO");       
		this.jComboBoxTiposReportesSubCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSubCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSubCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSubCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSubCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionSubCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSubCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSubCliente.setText("Accion");
		this.jComboBoxTiposRelacionesSubCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSubCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSubCliente.setText("Accion");
		this.jComboBoxTiposAccionesSubCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSubCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSubCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarSubCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSubCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSubCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSubCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSubCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSubCliente = new JLabelMe();
		
		this.jLabelAccionesSubCliente.setText("Acciones");		
		this.jLabelAccionesSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSubCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSubCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSubCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSubCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSubCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSubCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSubCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSubCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSubCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSubCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSubCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteSubCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSubCliente = new JButtonMe();
		//this.jButtonAnterioresSubCliente.setText("<<");
        this.jButtonAnterioresSubCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSubCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSubCliente = new JButtonMe();
		//this.jButtonSiguientesSubCliente.setText(">>");
        this.jButtonSiguientesSubCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSubCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSubCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSubCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosSubCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSubCliente,"nuevoguardarcambios_button","Nue",this.subclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSubCliente";
		inputMap = this.jButtonNuevoGuardarCambiosSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSubCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSubCliente";
		inputMap = this.jButtonRecargarInformacionSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSubCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSubCliente";
		inputMap = this.jButtonSiguientesSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSubCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSubCliente";
		inputMap = this.jButtonAnterioresSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSubCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSubCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSubCliente.setMinimumSize(new Dimension(this.getWidth(),SubClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSubCliente.setMaximumSize(new Dimension(this.getWidth(),SubClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSubCliente.setPreferredSize(new Dimension(this.getWidth(),SubClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSubCliente = new GridBagLayout();

			this.jPanelPaginacionSubCliente.setLayout(gridaBagLayoutPaginacionSubCliente);						
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = 0;
			this.gridBagConstraintsSubCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSubCliente.add(this.jButtonAnterioresSubCliente, this.gridBagConstraintsSubCliente);
					
						
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSubCliente.gridy = 0;
			
			this.jPanelPaginacionSubCliente.add(this.jButtonNuevoGuardarCambiosSubCliente, this.gridBagConstraintsSubCliente);
						
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSubCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSubCliente.gridy = 0;
			this.jPanelPaginacionSubCliente.add(this.jButtonSiguientesSubCliente, this.gridBagConstraintsSubCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = 1;
			this.gridBagConstraintsSubCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubCliente.add(this.jButtonNuevoSubCliente, this.gridBagConstraintsSubCliente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsSubCliente = new GridBagConstraints();
				this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSubCliente.gridy = 1;
				this.gridBagConstraintsSubCliente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionSubCliente.add(this.jButtonNuevoRelacionesSubCliente, this.gridBagConstraintsSubCliente);
			}
			
			
			if(!this.subclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSubCliente = new GridBagConstraints();
				this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSubCliente.gridy = 1;
				this.gridBagConstraintsSubCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSubCliente.add(this.jButtonGuardarCambiosTablaSubCliente, this.gridBagConstraintsSubCliente);
			}
			
			
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = 1;
			this.gridBagConstraintsSubCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubCliente.add(this.jButtonDuplicarSubCliente, this.gridBagConstraintsSubCliente);
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = 1;
			this.gridBagConstraintsSubCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubCliente.add(this.jButtonCopiarSubCliente, this.gridBagConstraintsSubCliente);
		
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = 1;
			this.gridBagConstraintsSubCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubCliente.add(this.jButtonVerFormSubCliente, this.gridBagConstraintsSubCliente);
		
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = 1;
			this.gridBagConstraintsSubCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSubCliente.add(this.jButtonCerrarSubCliente, this.gridBagConstraintsSubCliente);
		
		
		
		this.jButtonRecargarInformacionSubCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSubCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSubCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSubCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSubCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSubCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSubCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSubCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSubCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSubCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSubCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSubCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSubCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSubCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSubCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSubCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSubCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSubCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSubCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSubCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSubCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSubCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSubCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSubCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSubCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSubCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSubCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSubCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSubCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSubCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSubCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSubCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSubCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSubCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSubCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSubCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SubCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SubCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SubCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SubCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSubCliente.setLayout(gridaBagParametrosReportesSubCliente);
			this.jPanelParametrosReportesAccionesSubCliente.setLayout(gridaBagParametrosReportesAccionesSubCliente);
			
			
			this.jPanelParametrosAuxiliar1SubCliente.setLayout(gridaBagParametrosAuxiliar1SubCliente);
			this.jPanelParametrosAuxiliar2SubCliente.setLayout(gridaBagParametrosAuxiliar2SubCliente);
			this.jPanelParametrosAuxiliar3SubCliente.setLayout(gridaBagParametrosAuxiliar3SubCliente);
			this.jPanelParametrosAuxiliar4SubCliente.setLayout(gridaBagParametrosAuxiliar4SubCliente);
			//this.jPanelParametrosAuxiliar5SubCliente.setLayout(gridaBagParametrosAuxiliar2SubCliente);			
			
			
			
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubCliente.add(this.jButtonRecargarInformacionSubCliente, this.gridBagConstraintsSubCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubCliente.add(this.jComboBoxTiposPaginacionSubCliente, this.gridBagConstraintsSubCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubCliente.add(this.jCheckBoxConAltoMaximoTablaSubCliente, this.gridBagConstraintsSubCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubCliente.add(this.jComboBoxTiposArchivosReportesSubCliente, this.gridBagConstraintsSubCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubCliente.add(this.jPanelParametrosAuxiliar1SubCliente, this.gridBagConstraintsSubCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SubCliente.add(this.jComboBoxTiposReportesSubCliente, this.gridBagConstraintsSubCliente);																		
			
			
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SubCliente.add(this.jComboBoxTiposGraficosReportesSubCliente, this.gridBagConstraintsSubCliente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubCliente.add(this.jPanelParametrosAuxiliar4SubCliente, this.gridBagConstraintsSubCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubCliente.add(this.jComboBoxTiposReportesSubCliente, this.gridBagConstraintsSubCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubCliente.add(this.jCheckBoxGenerarReporteSubCliente, this.gridBagConstraintsSubCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubCliente.add(this.jPanelParametrosAuxiliar2SubCliente, this.gridBagConstraintsSubCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubCliente.add(this.jLabelAccionesSubCliente, this.gridBagConstraintsSubCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSubCliente = new GridBagConstraints();
				this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSubCliente.add(this.jButtonAbrirOrderBySubCliente, this.gridBagConstraintsSubCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubCliente.add(this.jComboBoxTiposSeleccionarSubCliente, this.gridBagConstraintsSubCliente);			
			
			
			/*
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubCliente.add(this.jCheckBoxSeleccionarTodosSubCliente, this.gridBagConstraintsSubCliente);
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubCliente.add(this.jCheckBoxConGraficoReporteSubCliente, this.gridBagConstraintsSubCliente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubCliente.add(this.jCheckBoxSeleccionarTodosSubCliente, this.gridBagConstraintsSubCliente);															
				
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubCliente.add(this.jCheckBoxSeleccionadosSubCliente, this.gridBagConstraintsSubCliente);															
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubCliente.add(this.jCheckBoxConGraficoReporteSubCliente, this.gridBagConstraintsSubCliente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubCliente.add(this.jPanelParametrosAuxiliar3SubCliente, this.gridBagConstraintsSubCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubCliente.add(this.jComboBoxTiposRelacionesSubCliente, this.gridBagConstraintsSubCliente);
				
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubCliente.add(this.jComboBoxTiposAccionesSubCliente, this.gridBagConstraintsSubCliente);
	
				
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubCliente.add(this.jTextFieldValorCampoGeneralSubCliente, this.gridBagConstraintsSubCliente);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralSubCliente= new GridBagLayout();
		this.jPanelCamposIniciogeneralSubCliente.setLayout(gridaBagLayoutCamposIniciogeneralSubCliente);

		GridBagLayout gridaBagLayoutCamposInicioubicacionSubCliente= new GridBagLayout();
		this.jPanelCamposInicioubicacionSubCliente.setLayout(gridaBagLayoutCamposInicioubicacionSubCliente);

		GridBagLayout gridaBagLayoutCamposIniciopersonalSubCliente= new GridBagLayout();
		this.jPanelCamposIniciopersonalSubCliente.setLayout(gridaBagLayoutCamposIniciopersonalSubCliente);

		GridBagLayout gridaBagLayoutCamposIniciocontableSubCliente= new GridBagLayout();
		this.jPanelCamposIniciocontableSubCliente.setLayout(gridaBagLayoutCamposIniciocontableSubCliente);

		GridBagLayout gridaBagLayoutCamposIniciocontratoSubCliente= new GridBagLayout();
		this.jPanelCamposIniciocontratoSubCliente.setLayout(gridaBagLayoutCamposIniciocontratoSubCliente);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSubCliente = new GridBagLayout();

			this.jScrollPanelDatosSubCliente.setLayout(gridaBagLayoutDatosSubCliente);
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = 0;
			this.gridBagConstraintsSubCliente.gridx = 0;
			
			this.jScrollPanelDatosSubCliente.add(this.jTableDatosSubCliente, this.gridBagConstraintsSubCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSubCliente.setViewportView(this.jTableDatosSubCliente);
		this.jTableDatosSubCliente.setFillsViewportHeight(true);
		this.jTableDatosSubCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSubCliente= new GridBagLayout();
		this.jPanelAccionesSubCliente.setLayout(gridaBagLayoutAccionesSubCliente);
		
		
		/*	
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 0;
			
		this.jPanelAccionesSubCliente.add(this.jButtonNuevoSubCliente, this.gridBagConstraintsSubCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdentificacionSubCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdentificacionSubCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdentificacionSubCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdentificacionSubCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdentificacionSubCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdentificacionSubCliente.setLayout(gridaBagLayoutBusquedaPorIdentificacionSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 0;
		jPanelBusquedaPorIdentificacionSubCliente.add(jLabelidentificacionBusquedaPorIdentificacionSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 1;
		jPanelBusquedaPorIdentificacionSubCliente.add(jTextFieldidentificacionBusquedaPorIdentificacionSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 1;
		gridBagConstraintsSubCliente.gridx =1;
		jPanelBusquedaPorIdentificacionSubCliente.add(jButtonBusquedaPorIdentificacionSubCliente, gridBagConstraintsSubCliente);

		jTabbedPaneBusquedasSubCliente.addTab("1.-Por Identificacion ", jPanelBusquedaPorIdentificacionSubCliente);
		jTabbedPaneBusquedasSubCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreCompletoSubCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCompletoSubCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCompletoSubCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCompletoSubCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCompletoSubCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCompletoSubCliente.setLayout(gridaBagLayoutBusquedaPorNombreCompletoSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 0;
		jPanelBusquedaPorNombreCompletoSubCliente.add(jLabelnombre_completoBusquedaPorNombreCompletoSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 1;
		jPanelBusquedaPorNombreCompletoSubCliente.add(jTextAreanombre_completoBusquedaPorNombreCompletoSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 1;
		gridBagConstraintsSubCliente.gridx =1;
		jPanelBusquedaPorNombreCompletoSubCliente.add(jButtonBusquedaPorNombreCompletoSubCliente, gridBagConstraintsSubCliente);

		jTabbedPaneBusquedasSubCliente.addTab("2.-Por Nombre Completo ", jPanelBusquedaPorNombreCompletoSubCliente);
		jTabbedPaneBusquedasSubCliente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorRucSubCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorRucSubCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorRucSubCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorRucSubCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorRucSubCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorRucSubCliente.setLayout(gridaBagLayoutBusquedaPorRucSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 0;
		jPanelBusquedaPorRucSubCliente.add(jLabelrucBusquedaPorRucSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 1;
		jPanelBusquedaPorRucSubCliente.add(jTextFieldrucBusquedaPorRucSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 1;
		gridBagConstraintsSubCliente.gridx =1;
		jPanelBusquedaPorRucSubCliente.add(jButtonBusquedaPorRucSubCliente, gridBagConstraintsSubCliente);

		jTabbedPaneBusquedasSubCliente.addTab("3.-Por Ruc ", jPanelBusquedaPorRucSubCliente);
		jTabbedPaneBusquedasSubCliente.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdClienteSubCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClienteSubCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteSubCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteSubCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteSubCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteSubCliente.setLayout(gridaBagLayoutFK_IdClienteSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 0;
		jPanelFK_IdClienteSubCliente.add(jLabelid_clienteFK_IdClienteSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 1;
		jPanelFK_IdClienteSubCliente.add(jComboBoxid_clienteFK_IdClienteSubCliente, gridBagConstraintsSubCliente);


		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 0;
		jPanelFK_IdClienteSubCliente.add(this.jButtonBuscarFK_IdClienteid_clienteSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 1;
		gridBagConstraintsSubCliente.gridx =1;
		jPanelFK_IdClienteSubCliente.add(jButtonFK_IdClienteSubCliente, gridBagConstraintsSubCliente);

		jTabbedPaneBusquedasSubCliente.addTab("4.-Por Cliente ", jPanelFK_IdClienteSubCliente);
		jTabbedPaneBusquedasSubCliente.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstadoCivilSubCliente= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoCivilSubCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoCivilSubCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoCivilSubCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoCivilSubCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoCivilSubCliente.setLayout(gridaBagLayoutFK_IdEstadoCivilSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 0;
		jPanelFK_IdEstadoCivilSubCliente.add(jLabelid_estado_civilFK_IdEstadoCivilSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 1;
		jPanelFK_IdEstadoCivilSubCliente.add(jComboBoxid_estado_civilFK_IdEstadoCivilSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 1;
		gridBagConstraintsSubCliente.gridx =1;
		jPanelFK_IdEstadoCivilSubCliente.add(jButtonFK_IdEstadoCivilSubCliente, gridBagConstraintsSubCliente);

		jTabbedPaneBusquedasSubCliente.addTab("5.-Por Estado Civil ", jPanelFK_IdEstadoCivilSubCliente);
		jTabbedPaneBusquedasSubCliente.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdEstadoLegalSubCliente= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoLegalSubCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoLegalSubCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoLegalSubCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoLegalSubCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoLegalSubCliente.setLayout(gridaBagLayoutFK_IdEstadoLegalSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 0;
		jPanelFK_IdEstadoLegalSubCliente.add(jLabelid_estado_legalFK_IdEstadoLegalSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 1;
		jPanelFK_IdEstadoLegalSubCliente.add(jComboBoxid_estado_legalFK_IdEstadoLegalSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 1;
		gridBagConstraintsSubCliente.gridx =1;
		jPanelFK_IdEstadoLegalSubCliente.add(jButtonFK_IdEstadoLegalSubCliente, gridBagConstraintsSubCliente);

		jTabbedPaneBusquedasSubCliente.addTab("6.-Por Estado Legal ", jPanelFK_IdEstadoLegalSubCliente);
		jTabbedPaneBusquedasSubCliente.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoIdentificacionSubCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTipoIdentificacionSubCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoIdentificacionSubCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoIdentificacionSubCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoIdentificacionSubCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoIdentificacionSubCliente.setLayout(gridaBagLayoutFK_IdTipoIdentificacionSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 0;
		jPanelFK_IdTipoIdentificacionSubCliente.add(jLabelid_tipo_identificacionFK_IdTipoIdentificacionSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 0;
		gridBagConstraintsSubCliente.gridx = 1;
		jPanelFK_IdTipoIdentificacionSubCliente.add(jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionSubCliente, gridBagConstraintsSubCliente);

		gridBagConstraintsSubCliente = new GridBagConstraints();
		gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubCliente.gridy = 1;
		gridBagConstraintsSubCliente.gridx =1;
		jPanelFK_IdTipoIdentificacionSubCliente.add(jButtonFK_IdTipoIdentificacionSubCliente, gridBagConstraintsSubCliente);

		jTabbedPaneBusquedasSubCliente.addTab("7.-Por Tipo Identificacion ", jPanelFK_IdTipoIdentificacionSubCliente);
		jTabbedPaneBusquedasSubCliente.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSubCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSubCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.subclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSubCliente = new GridBagConstraints();						
			this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubCliente.gridx = 0;		
			//this.gridBagConstraintsSubCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSubCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSubCliente, this.gridBagConstraintsSubCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSubCliente.gridx = 0;		
		//this.gridBagConstraintsSubCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSubCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSubCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubCliente.gridx = 0;		
			this.gridBagConstraintsSubCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSubCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSubCliente, this.gridBagConstraintsSubCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSubCliente, this.gridBagConstraintsSubCliente);								
		
		
		/*
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSubCliente, this.gridBagConstraintsSubCliente);
		*/		
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSubCliente.gridx =0;
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSubCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSubCliente, this.gridBagConstraintsSubCliente);
				
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSubCliente, this.gridBagConstraintsSubCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(SubClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSubCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSubCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosSubCliente.setLayout(gridaBagLayoutBusquedasParametrosSubCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSubCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSubCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSubCliente, this.gridBagConstraintsSubCliente);
			
			
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSubCliente, this.gridBagConstraintsSubCliente);
		
			
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSubCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSubCliente, this.gridBagConstraintsSubCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSubCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSubCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSubCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSubCliente.setName("jPanelReporteDinamicoSubCliente"); 
		
		this.jPanelReporteDinamicoSubCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSubCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSubCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSubCliente.setLayout(gridaBagLayoutReporteDinamicoSubCliente);
		
		
		this.jInternalFrameReporteDinamicoSubCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSubCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSubCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSubCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSubCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSubCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSubCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSubCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSubCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoSubCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoSubCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSubCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSubCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSubCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSubCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteSubCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubCliente.add(this.jLabelColumnasSelectReporteSubCliente, this.gridBagConstraintsSubCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSubCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteSubCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSubCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSubCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSubCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSubCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSubCliente=new JScrollPane(this.jListColumnasSelectReporteSubCliente);
			
			this.jScrollColumnasSelectReporteSubCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSubCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSubCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSubCliente.add(this.jListColumnasSelectReporteSubCliente, this.gridBagConstraintsSubCliente);
		this.jPanelReporteDinamicoSubCliente.add(this.jScrollColumnasSelectReporteSubCliente, this.gridBagConstraintsSubCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSubCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteSubCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubCliente.add(this.jLabelRelacionesSelectReporteSubCliente, this.gridBagConstraintsSubCliente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSubCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteSubCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSubCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSubCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSubCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSubCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSubCliente=new JScrollPane(this.jListRelacionesSelectReporteSubCliente);
			
			this.jScrollRelacionesSelectReporteSubCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSubCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSubCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSubCliente.add(this.jListRelacionesSelectReporteSubCliente, this.gridBagConstraintsSubCliente);
		this.jPanelReporteDinamicoSubCliente.add(this.jScrollRelacionesSelectReporteSubCliente, this.gridBagConstraintsSubCliente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoSubCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSubCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoSubCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSubCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSubCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSubCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSubCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSubCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSubCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSubCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSubCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSubCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSubCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSubCliente = new JLabelMe();

		this.jLabelConGraficoDinamicoSubCliente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubCliente.add(this.jLabelConGraficoDinamicoSubCliente, this.gridBagConstraintsSubCliente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSubCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSubCliente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSubCliente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSubCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSubCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSubCliente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubCliente.add(this.jCheckBoxConGraficoDinamicoSubCliente, this.gridBagConstraintsSubCliente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSubCliente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSubCliente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubCliente.add(this.jLabelColumnaCategoriaGraficoSubCliente, this.gridBagConstraintsSubCliente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSubCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSubCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSubCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSubCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSubCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSubCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSubCliente.add(this.jComboBoxColumnaCategoriaGraficoSubCliente, this.gridBagConstraintsSubCliente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSubCliente = new JLabelMe();

		this.jLabelColumnaCategoriaValorSubCliente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubCliente.add(this.jLabelColumnaCategoriaValorSubCliente, this.gridBagConstraintsSubCliente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSubCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSubCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSubCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSubCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSubCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSubCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSubCliente.add(this.jComboBoxColumnaCategoriaValorSubCliente, this.gridBagConstraintsSubCliente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSubCliente = new JLabelMe();

		this.jLabelColumnasValoresGraficoSubCliente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubCliente.add(this.jLabelColumnasValoresGraficoSubCliente, this.gridBagConstraintsSubCliente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSubCliente = new JList<Reporte>();
		this.jListColumnasValoresGraficoSubCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSubCliente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSubCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSubCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSubCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSubCliente=new JScrollPane(this.jListColumnasValoresGraficoSubCliente);
			
			this.jScrollColumnasValoresGraficoSubCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSubCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSubCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSubCliente.add(this.jListColumnasSelectReporteSubCliente, this.gridBagConstraintsSubCliente);
		this.jPanelReporteDinamicoSubCliente.add(this.jScrollColumnasValoresGraficoSubCliente, this.gridBagConstraintsSubCliente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSubCliente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSubCliente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubCliente.add(this.jLabelTiposGraficosReportesDinamicoSubCliente, this.gridBagConstraintsSubCliente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSubCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSubCliente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSubCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSubCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSubCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSubCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubCliente.add(this.jComboBoxTiposGraficosReportesDinamicoSubCliente, this.gridBagConstraintsSubCliente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSubCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSubCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubCliente.add(this.jLabelGenerarExcelReporteDinamicoSubCliente, this.gridBagConstraintsSubCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSubCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSubCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSubCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSubCliente.setToolTipText("Generar EXCEL"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSubCliente.add(this.jButtonGenerarExcelReporteDinamicoSubCliente, this.gridBagConstraintsSubCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubCliente.add(this.jComboBoxTiposReportesDinamicoSubCliente, this.gridBagConstraintsSubCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSubCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSubCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubCliente.add(this.jLabelTiposArchivoReporteDinamicoSubCliente, this.gridBagConstraintsSubCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubCliente.add(this.jComboBoxTiposArchivosReportesDinamicoSubCliente, this.gridBagConstraintsSubCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSubCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSubCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSubCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSubCliente.setToolTipText("Generar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubCliente.add(this.jButtonGenerarReporteDinamicoSubCliente, this.gridBagConstraintsSubCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSubCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSubCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSubCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSubCliente.setToolTipText("Cancelar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubCliente.add(this.jButtonCerrarReporteDinamicoSubCliente, this.gridBagConstraintsSubCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSubCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSubCliente= new JScrollPane(jPanelReporteDinamicoSubCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSubCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSubCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSubCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSubCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSubCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSubCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSubCliente);
		this.jInternalFrameReporteDinamicoSubCliente.getContentPane().add(this.jScrollPanelReporteDinamicoSubCliente, this.gridBagConstraintsSubCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSubCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSubCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSubCliente.setName("jPanelImportacionSubCliente"); 
		
		this.jPanelImportacionSubCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSubCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSubCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSubCliente.setLayout(gridaBagLayoutImportacionSubCliente);
		
		
		this.jInternalFrameImportacionSubCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSubCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSubCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSubCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSubCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSubCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSubCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSubCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSubCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSubCliente.setResizable(true);
	    this.jInternalFrameImportacionSubCliente.setClosable(true);
	    this.jInternalFrameImportacionSubCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSubCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSubCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSubCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSubCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSubCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSubCliente.setResizable(true);
	    this.jInternalFrameImportacionSubCliente.setClosable(true);
	    this.jInternalFrameImportacionSubCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSubCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSubCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSubCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSubCliente = new JLabelMe();

		this.jLabelArchivoImportacionSubCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsSubCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSubCliente.add(this.jLabelArchivoImportacionSubCliente, this.gridBagConstraintsSubCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSubCliente = new JFileChooser();		
		this.jFileChooserImportacionSubCliente.setToolTipText("ESCOGER ARCHIVO"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSubCliente = new JButtonMe();
		this.jButtonAbrirImportacionSubCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSubCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSubCliente.setToolTipText("Generar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsSubCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubCliente.add(this.jButtonAbrirImportacionSubCliente, this.gridBagConstraintsSubCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSubCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionSubCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsSubCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSubCliente.add(this.jLabelPathArchivoImportacionSubCliente, this.gridBagConstraintsSubCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSubCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSubCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSubCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSubCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsSubCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubCliente.add(this.jTextFieldPathArchivoImportacionSubCliente, this.gridBagConstraintsSubCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSubCliente = new JButtonMe();
		this.jButtonGenerarImportacionSubCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSubCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSubCliente.setToolTipText("Generar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsSubCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubCliente.add(this.jButtonGenerarImportacionSubCliente, this.gridBagConstraintsSubCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSubCliente = new JButtonMe();
		this.jButtonCerrarImportacionSubCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSubCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSubCliente.setToolTipText("Cancelar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsSubCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubCliente.add(this.jButtonCerrarImportacionSubCliente, this.gridBagConstraintsSubCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSubCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionSubCliente= new JScrollPane(jPanelImportacionSubCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsSubCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSubCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSubCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSubCliente);
		this.jInternalFrameImportacionSubCliente.getContentPane().add(this.jScrollPanelImportacionSubCliente, this.gridBagConstraintsSubCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySubCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySubCliente = new JButtonMe();
			this.jButtonAbrirOrderBySubCliente.setText("Orden");
			this.jButtonAbrirOrderBySubCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySubCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySubCliente";
			inputMap = this.jButtonAbrirOrderBySubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySubCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderBySubCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySubCliente.setName("jPanelOrderBySubCliente"); 
			
			this.jPanelOrderBySubCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySubCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySubCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySubCliente.setLayout(gridaBagLayoutOrderBySubCliente);
			
			
			this.jTableDatosSubClienteOrderBy = new JTableMe();        
			this.jTableDatosSubClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSubClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSubClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSubClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSubClienteOrderBy.setViewportView(this.jTableDatosSubClienteOrderBy);
			this.jTableDatosSubClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSubClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySubCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySubCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySubCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSubCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySubCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySubCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySubCliente.setTitle("Orden");
			this.jInternalFrameOrderBySubCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySubCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySubCliente.setResizable(true);
			this.jInternalFrameOrderBySubCliente.setClosable(true);
			this.jInternalFrameOrderBySubCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySubCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySubCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySubCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSubCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSubCliente.ipady =150;
				
			this.jPanelOrderBySubCliente.add(jScrollPanelDatosSubClienteOrderBy, this.gridBagConstraintsSubCliente);//this.jTableDatosSubClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySubCliente = new JButtonMe();
			this.jButtonCerrarOrderBySubCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySubCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySubCliente.setToolTipText("Cancelar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSubCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySubCliente.add(this.jButtonCerrarOrderBySubCliente, this.gridBagConstraintsSubCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSubCliente = new GridBagLayout();
			
			this.jScrollPanelOrderBySubCliente= new JScrollPane(jPanelOrderBySubCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsSubCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySubCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySubCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSubCliente);
			
			this.jInternalFrameOrderBySubCliente.getContentPane().add(this.jScrollPanelOrderBySubCliente, this.gridBagConstraintsSubCliente);			
		
		} else {
			this.jButtonAbrirOrderBySubCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//7530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=600;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.subclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSubCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSubCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSubCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSubCliente.getRowHeight();//SubClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.subclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SubClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSubCliente.isSelected()) {
					iHeightTable=SubClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SubClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SubClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SubClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSubCliente.isSelected()) {
					iHeightTable=SubClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SubClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SubClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSubCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSubCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSubCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSubCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSubCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSubCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySubCliente!=null && this.jInternalFrameOrderBySubCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.subclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySubCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySubCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySubCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySubCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySubCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySubCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySubCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSubCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSubCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSubCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=subclienteLogic.getSubClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SubCliente> TraerSubClienteBeans(List<SubCliente> subclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(SubCliente subcliente:subclientes) {
					
				if(!(SubClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SubClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					subcliente.setsDetalleGeneralEntityReporte(SubClienteConstantesFunciones.getSubClienteDescripcion(subcliente));
										
						
					
					

					if(subcliente.getFacturas()!=null && Funciones.existeClass(classes,Factura.class)) {
						try{subcliente.setfacturasDescripcionReporte(new JRBeanCollectionDataSource(FacturaJInternalFrame.TraerFacturaBeans(subcliente.getFacturas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(subcliente.getConsignacions()!=null && Funciones.existeClass(classes,Consignacion.class)) {
						try{subcliente.setconsignacionsDescripcionReporte(new JRBeanCollectionDataSource(ConsignacionJInternalFrame.TraerConsignacionBeans(subcliente.getConsignacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(subcliente.getGuiaRemisions()!=null && Funciones.existeClass(classes,GuiaRemision.class)) {
						try{subcliente.setguiaremisionsDescripcionReporte(new JRBeanCollectionDataSource(GuiaRemisionJInternalFrame.TraerGuiaRemisionBeans(subcliente.getGuiaRemisions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(subcliente.getProformas()!=null && Funciones.existeClass(classes,Proforma.class)) {
						try{subcliente.setproformasDescripcionReporte(new JRBeanCollectionDataSource(ProformaJInternalFrame.TraerProformaBeans(subcliente.getProformas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(subcliente.getPedidoExpors()!=null && Funciones.existeClass(classes,PedidoExpor.class)) {
						try{subcliente.setpedidoexporsDescripcionReporte(new JRBeanCollectionDataSource(PedidoExporJInternalFrame.TraerPedidoExporBeans(subcliente.getPedidoExpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(subcliente.getPedidos()!=null && Funciones.existeClass(classes,Pedido.class)) {
						try{subcliente.setpedidosDescripcionReporte(new JRBeanCollectionDataSource(PedidoJInternalFrame.TraerPedidoBeans(subcliente.getPedidos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//subcliente.setsDetalleGeneralEntityReporte(subcliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//subclientebeans.add(subclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return subclientes;
    }
	//PARA REPORTES FIN
}
