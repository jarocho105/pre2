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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.contabilidad.util.SriConstantesFunciones;

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
public class SriJInternalFrame extends SriBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	/*
	public JToolBar jTtoolBarSri;
	
	protected JMenuBar jmenuBarSri;
	
	protected JMenu jmenuSri;
	protected JMenu jmenuDatosSri;
	protected JMenu jmenuArchivoSri;
	protected JMenu jmenuAccionesSri;
	
	*/
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSri;	
	protected GridBagConstraints gridBagConstraintsSri;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SriDetalleFormJInternalFrame jInternalFrameDetalleFormSri;		
	
	/*
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSri;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSri;	
	*/
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TransaccionContaBeanSwingJInternalFrame transaccioncontaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionconta="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoRetencionIvaBeanSwingJInternalFrame tiporetencionivabienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivabien="";

	protected TipoRetencionIvaBeanSwingJInternalFrame tiporetencionivaservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivaservicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public SriSessionBean sriSessionBean;
		
	
	
	public AsientoContableSessionBean asientocontableSessionBean;
	public TransaccionContaSessionBean transaccioncontaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoRetencionIvaSessionBean tiporetencionivabienSessionBean;
	public TipoRetencionIvaSessionBean tiporetencionivaservicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Sri> sris;		
	public List<Sri> srisEliminados;	
	public List<Sri> srisAux;
	
	
	/*	
	protected OrderByJInternalFrame jInternalFrameOrderBySri;		
	protected JButton jButtonAbrirOrderBySri;
	
	
	//protected JPanel jPanelOrderBySri;
	//public JScrollPane jScrollPanelOrderBySri;	
	//protected JButton jButtonCerrarOrderBySri;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	*/
	
	public SriLogic sriLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSri;
	public JScrollPane jScrollPanelDatosEdicionSri;
	public JScrollPane jScrollPanelDatosGeneralSri;
    
	
	/*
	//public JScrollPane jScrollPanelDatosSriOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSri;
	//public JScrollPane jScrollPanelImportacionSri;
	*/
	
	
	protected JPanel jPanelAccionesSri;
	
    protected JPanel jPanelPaginacionSri;
    protected JPanel jPanelParametrosReportesSri;
	protected JPanel jPanelParametrosReportesAccionesSri;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralSri;
	protected Integer iXPanelCamposIniciogeneralSri=0;
	protected Integer iYPanelCamposIniciogeneralSri=0;

	protected JPanel jPanelCamposIniciogeneral2Sri;
	protected Integer iXPanelCamposIniciogeneral2Sri=0;
	protected Integer iYPanelCamposIniciogeneral2Sri=0;

	protected JPanel jPanelCamposIniciobienes_servicios_tarSri;
	protected Integer iXPanelCamposIniciobienes_servicios_tarSri=0;
	protected Integer iYPanelCamposIniciobienes_servicios_tarSri=0;

	protected JPanel jPanelCamposIniciobienes_servicios_retSri;
	protected Integer iXPanelCamposIniciobienes_servicios_retSri=0;
	protected Integer iYPanelCamposIniciobienes_servicios_retSri=0;;
	
	
	/*
	protected JPanel jPanelParametrosAuxiliar1Sri;
	protected JPanel jPanelParametrosAuxiliar2Sri;
	protected JPanel jPanelParametrosAuxiliar3Sri;
	protected JPanel jPanelParametrosAuxiliar4Sri;
	//protected JPanel jPanelParametrosAuxiliar5Sri;
	*/
	
	/*
	//protected JPanel jPanelReporteDinamicoSri;
	//protected JPanel jPanelImportacionSri;
	*/
	
	public JTable jTableDatosSri;
	
	
	/*
	//public JTable jTableDatosSriOrderBy;
	*/
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSri;
	protected JButton jButtonDuplicarSri;
	protected JButton jButtonCopiarSri;
	protected JButton jButtonVerFormSri;
	protected JButton jButtonNuevoRelacionesSri;
	protected JButton jButtonModificarSri;
	
    protected JButton jButtonGuardarCambiosTablaSri;
	protected JButton jButtonCerrarSri;
	
	/*
	protected JButton jButtonRecargarInformacionSri;
	protected JButton jButtonProcesarInformacionSri;
	*/
	
	protected JButton jButtonAnterioresSri;
	protected JButton jButtonSiguientesSri;
	protected JButton jButtonNuevoGuardarCambiosSri;
	
	/*
	
	//protected JButton jButtonGenerarReporteDinamicoSri;
	//protected JButton jButtonCerrarReporteDinamicoSri;
	//protected JButton jButtonGenerarExcelReporteDinamicoSri;	
	
	
	
	//protected JButton jButtonAbrirImportacionSri;
	//protected JButton jButtonGenerarImportacionSri;
	//protected JButton jButtonCerrarImportacionSri;
	//protected JFileChooser jFileChooserImportacionSri;
	//protected File fileImportacionSri;
	
	
	*/
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarSri;
	protected JButton jButtonDuplicarToolBarSri;
	protected JButton jButtonNuevoRelacionesToolBarSri;
	
	
	public JButton jButtonGuardarCambiosToolBarSri;
	protected JButton jButtonCopiarToolBarSri;
	protected JButton jButtonVerFormToolBarSri;
	public JButton jButtonGuardarCambiosTablaToolBarSri;
	protected JButton jButtonMostrarOcultarTablaToolBarSri;
	protected JButton jButtonCerrarToolBarSri;
	
	protected JButton jButtonRecargarInformacionToolBarSri;
	protected JButton jButtonProcesarInformacionToolBarSri;
	protected JButton jButtonAnterioresToolBarSri;
	protected JButton jButtonSiguientesToolBarSri;
	protected JButton jButtonNuevoGuardarCambiosToolBarSri;
	protected JButton jButtonAbrirOrderByToolBarSri;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoSri;
	protected JMenuItem jMenuItemDuplicarSri;
	protected JMenuItem jMenuItemNuevoRelacionesSri;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSri;
	protected JMenuItem jMenuItemCopiarSri;
	protected JMenuItem jMenuItemVerFormSri;
	protected JMenuItem jMenuItemGuardarCambiosTablaSri;
	protected JMenuItem jMenuItemCerrarSri;
	protected JMenuItem jMenuItemDetalleCerrarSri;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySri;
	protected JMenuItem jMenuItemDetalleMostarOcultarSri;
	
	protected JMenuItem jMenuItemRecargarInformacionSri;
	protected JMenuItem jMenuItemProcesarInformacionSri;
	protected JMenuItem jMenuItemAnterioresSri;
	protected JMenuItem jMenuItemSiguientesSri;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSri;
	protected JMenuItem jMenuItemAbrirOrderBySri;
	protected JMenuItem jMenuItemMostrarOcultarSri;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesSri;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSri;
	protected JCheckBox jCheckBoxSeleccionadosSri;
	
	/*
	protected JCheckBox jCheckBoxConAltoMaximoTablaSri;
	protected JCheckBox jCheckBoxConGraficoReporteSri;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSri;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSri;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSri;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSri;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSri;
	protected JTextField jTextFieldValorCampoGeneralSri;
	*/
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	/*
	
	//public JLabel jLabelColumnasSelectReporteSri;
	//public JList<Reporte> jListColumnasSelectReporteSri;
	//public JScrollPane jScrollColumnasSelectReporteSri;
	
	//public JLabel jLabelRelacionesSelectReporteSri;
	//public JList<Reporte> jListRelacionesSelectReporteSri;
	//public JScrollPane jScrollRelacionesSelectReporteSri;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSri;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSri;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSri;
	//public JLabel jLabelTiposArchivoReporteDinamicoSri;
	
		
	//public JLabel jLabelArchivoImportacionSri;	
	//public JLabel jLabelPathArchivoImportacionSri;
	//protected JTextField jTextFieldPathArchivoImportacionSri;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSri;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSri;
	
	//public JLabel jLabelColumnaCategoriaValorSri;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSri;
	
	//public JLabel jLabelColumnasValoresGraficoSri;
	//public JList<Reporte> jListColumnasValoresGraficoSri;
	//public JScrollPane jScrollColumnasValoresGraficoSri;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSri;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSri;	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	/*
	
	public JTabbedPane jTabbedPaneBusquedasSri;
	public JPanel jPanelFK_IdAsientoContableSri;
	public JButton jButtonFK_IdAsientoContableSri;
	public JPanel jPanelFK_IdClienteSri;
	public JButton jButtonFK_IdClienteSri;
	public JPanel jPanelFK_IdTipoComprobanteSri;
	public JButton jButtonFK_IdTipoComprobanteSri;
	public JPanel jPanelFK_IdTipoIvaSri;
	public JButton jButtonFK_IdTipoIvaSri;
	public JPanel jPanelFK_IdTipoMovimientoSri;
	public JButton jButtonFK_IdTipoMovimientoSri;
	public JPanel jPanelFK_IdTipoRetencionIvaBienSri;
	public JButton jButtonFK_IdTipoRetencionIvaBienSri;
	public JPanel jPanelFK_IdTipoRetencionIvaServicioSri;
	public JButton jButtonFK_IdTipoRetencionIvaServicioSri;
	public JPanel jPanelFK_IdTipoTributarioSri;
	public JButton jButtonFK_IdTipoTributarioSri;
	public JPanel jPanelFK_IdTransaccionContaSri;
	public JButton jButtonFK_IdTransaccionContaSri;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableSri;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableSri;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableSri= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableSriUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableSriBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableSri;
	
	public JPanel jPanelid_clienteFK_IdClienteSri;
	public JLabel jLabelid_clienteFK_IdClienteSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteSri;
	public JButton jButtonid_clienteFK_IdClienteSri= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteSriUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteSriBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteSri;
	
	public JPanel jPaneltipo_comprobanteFK_IdTipoComprobanteSri;
	public JLabel jLabeltipo_comprobanteFK_IdTipoComprobanteSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxtipo_comprobanteFK_IdTipoComprobanteSri;
	public JButton jButtontipo_comprobanteFK_IdTipoComprobanteSri= new JButtonMe();
	public JButton jButtontipo_comprobanteFK_IdTipoComprobanteSriUpdate= new JButtonMe();
	public JButton jButtontipo_comprobanteFK_IdTipoComprobanteSriBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_ivaFK_IdTipoIvaSri;
	public JLabel jLabelid_tipo_ivaFK_IdTipoIvaSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ivaFK_IdTipoIvaSri;
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaSri= new JButtonMe();
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaSriUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaSriBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoFK_IdTipoMovimientoSri;
	public JLabel jLabelid_tipo_movimientoFK_IdTipoMovimientoSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoFK_IdTipoMovimientoSri;
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoSri= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoSriUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoSriBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri;
	public JLabel jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri;
	public JButton jButtonid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSriUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSriBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri;
	public JLabel jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri;
	public JButton jButtonid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSriUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSriBusqueda= new JButtonMe();

	
	public JPanel jPaneltipo_tributarioFK_IdTipoTributarioSri;
	public JLabel jLabeltipo_tributarioFK_IdTipoTributarioSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxtipo_tributarioFK_IdTipoTributarioSri;
	public JButton jButtontipo_tributarioFK_IdTipoTributarioSri= new JButtonMe();
	public JButton jButtontipo_tributarioFK_IdTipoTributarioSriUpdate= new JButtonMe();
	public JButton jButtontipo_tributarioFK_IdTipoTributarioSriBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_contaFK_IdTransaccionContaSri;
	public JLabel jLabelid_transaccion_contaFK_IdTransaccionContaSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_contaFK_IdTransaccionContaSri;
	public JButton jButtonid_transaccion_contaFK_IdTransaccionContaSri= new JButtonMe();
	public JButton jButtonid_transaccion_contaFK_IdTransaccionContaSriUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_contaFK_IdTransaccionContaSriBusqueda= new JButtonMe();

	
	*/
	
	
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
	//public int iHeightFormulario=1012;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SriJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Sri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Sri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSri)	{
		this.jButtonRecargarInformacionSri = jButtonRecargarInformacionSri;
	}
	
	public JButton getjButtonProcesarInformacionSri() {
		return this.jButtonProcesarInformacionSri;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSri)	{
		this.jButtonProcesarInformacionSri = jButtonProcesarInformacionSri;
	}
	*/
	
	public JButton getjButtonRecargarInformacionSri() {
		return new JButton();
	}
	
	
	public List<Sri> getsris() {
		return this.sris;
	}

	public void setsris(List<Sri> sris) {
		this.sris = sris;
	}
	
	public List<Sri> getsrisAux() {
		return this.srisAux;
	}

	public void setsrisAux(List<Sri> srisAux) {
		this.srisAux = srisAux;
	}
	
	public List<Sri> getsrisEliminados() {
		return this.srisEliminados;
	}

	public void setSrisEliminados(List<Sri> srisEliminados) {
		this.srisEliminados = srisEliminados;
	}
	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSri() {
		return jComboBoxTiposSeleccionarSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSri(
			JComboBox jComboBoxTiposSeleccionarSri) {
		this.jComboBoxTiposSeleccionarSri = jComboBoxTiposSeleccionarSri;
	}
	
	public void setBorderResaltarTiposSeleccionarSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSri .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSri() {
		return jTextFieldValorCampoGeneralSri;
	}

	public void setjTextFieldValorCampoGeneralSri(
			JTextField jTextFieldValorCampoGeneralSri) {
		this.jTextFieldValorCampoGeneralSri = jTextFieldValorCampoGeneralSri;
	}

	public void setBorderResaltarValorCampoGeneralSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSri.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSri .setBorder(borderResaltar);		
	}		
	*/
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSri() {
		return this.jCheckBoxSeleccionarTodosSri;
	}

	public void setjCheckBoxSeleccionarTodosSri(
			JCheckBox jCheckBoxSeleccionarTodosSri) {
		this.jCheckBoxSeleccionarTodosSri = jCheckBoxSeleccionarTodosSri;
	}

	public void setBorderResaltarSeleccionarTodosSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarSri.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionarTodosSri .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSri() {
		return this.jCheckBoxSeleccionadosSri;
	}

	public void setjCheckBoxSeleccionadosSri(
			JCheckBox jCheckBoxSeleccionadosSri) {
		this.jCheckBoxSeleccionadosSri = jCheckBoxSeleccionadosSri;
	}
	
	public void setBorderResaltarSeleccionadosSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarSri.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionadosSri .setBorder(borderResaltar);		
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSri() {
		return this.jComboBoxTiposArchivosReportesSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSri(
			JComboBox jComboBoxTiposArchivosReportesSri) {
		this.jComboBoxTiposArchivosReportesSri = jComboBoxTiposArchivosReportesSri;
	}

	public void setBorderResaltarTiposArchivosReportesSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSri() {
		return this.jComboBoxTiposReportesSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSri(
			JComboBox jComboBoxTiposReportesSri) {
		this.jComboBoxTiposReportesSri = jComboBoxTiposReportesSri;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSri() {
	//	return jComboBoxTiposReportesDinamicoSri;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSri(
	//		JComboBox jComboBoxTiposReportesDinamicoSri) {
	//	this.jComboBoxTiposReportesDinamicoSri = jComboBoxTiposReportesDinamicoSri;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSri() {
	//	return jComboBoxTiposArchivosReportesDinamicoSri;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSri(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSri) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSri = jComboBoxTiposArchivosReportesDinamicoSri;
	//}
	
	public void setBorderResaltarTiposReportesSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSri() {
		return this.jComboBoxTiposGraficosReportesSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSri(
			JComboBox jComboBoxTiposGraficosReportesSri) {
		this.jComboBoxTiposGraficosReportesSri = jComboBoxTiposGraficosReportesSri;
	}
	
	public void setBorderResaltarTiposGraficosReportesSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSri() {
		return this.jComboBoxTiposPaginacionSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSri(
			JComboBox jComboBoxTiposPaginacionSri) {
		this.jComboBoxTiposPaginacionSri = jComboBoxTiposPaginacionSri;
	}
	
	public void setBorderResaltarTiposPaginacionSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSri() {
		return this.jComboBoxTiposRelacionesSri;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSri() {
		return this.jComboBoxTiposAccionesSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSri(
			JComboBox jComboBoxTiposRelacionesSri) {
		this.jComboBoxTiposRelacionesSri = jComboBoxTiposRelacionesSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSri(
			JComboBox jComboBoxTiposAccionesSri) {
		this.jComboBoxTiposAccionesSri = jComboBoxTiposAccionesSri;
	}
	
	public void setBorderResaltarTiposRelacionesSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSri .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSri .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSri() {
	//	return jCheckBoxConGraficoDinamicoSri;
	//}

	//public void setjCheckBoxConGraficoDinamicoSri(
	//		JCheckBox jCheckBoxConGraficoDinamicoSri) {
	//	this.jCheckBoxConGraficoDinamicoSri = jCheckBoxConGraficoDinamicoSri;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSri() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSri.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSri .setBorder(borderResaltar);		
	//}
	
	
	
	*/		
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.sriSessionBean=new SriSessionBean();
		
		this.sriSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sriSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sriSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SriJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SriJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri MANTENIMIENTO"));
		
		
		if(iWidth > 3250) {
			iWidth=3250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.sriSessionBean.getEsGuardarRelacionado()) {
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
		
		SriJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Sri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarSri= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSri,this.jTtoolBarSri,
							"nuevo","nuevo","Nuevo"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSri,this.jTtoolBarSri,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSri,this.jTtoolBarSri,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSri,this.jTtoolBarSri,
							"duplicar","duplicar","Duplicar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSri,this.jTtoolBarSri,
							"copiar","copiar","Copiar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSri,this.jTtoolBarSri,
							"ver_form","ver_form","Ver"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSri,this.jTtoolBarSri,
							"recargar","recargar","Recargar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSri,this.jTtoolBarSri,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSri,this.jTtoolBarSri,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSri,this.jTtoolBarSri,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSri,this.jTtoolBarSri,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSri,this.jTtoolBarSri,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSri,this.jTtoolBarSri,
							"cerrar","cerrar","Salir"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSri=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSri;
			
				this.jButtonProcesarInformacionToolBarSri=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSri;
				
		//protected JButton jButtonModificarToolBarSri;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	*/
	
	/*
	public void cargarMenus() {		
		this.jmenuBarSri=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSri=new JMenuMe("General");
		this.jmenuArchivoSri=new JMenuMe("Archivo");
		this.jmenuAccionesSri=new JMenuMe("Acciones");
		this.jmenuDatosSri=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSri= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSri.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSri,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSri= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSri.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSri,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSri= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSri.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSri,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSri= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSri.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSri,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSri= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSri.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSri,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSri= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSri.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSri,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSri= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSri.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSri,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSri= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSri.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSri,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSri= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSri.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSri,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSri= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSri.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSri,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSri= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSri.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSri,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSri= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSri.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSri,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySri= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySri.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySri,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSri,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySri= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySri.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySri,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSri,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSri, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSri= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSri.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSri,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSri.add(this.jMenuItemCerrarSri);
			
			this.jmenuAccionesSri.add(this.jMenuItemNuevoSri);
			this.jmenuAccionesSri.add(this.jMenuItemNuevoGuardarCambiosSri);
			this.jmenuAccionesSri.add(this.jMenuItemNuevoRelacionesSri);
			this.jmenuAccionesSri.add(this.jMenuItemGuardarCambiosTablaSri);		
			this.jmenuAccionesSri.add(this.jMenuItemDuplicarSri);		
			this.jmenuAccionesSri.add(this.jMenuItemCopiarSri);		
			this.jmenuAccionesSri.add(this.jMenuItemVerFormSri);		
			
			this.jmenuDatosSri.add(this.jMenuItemRecargarInformacionSri);				
			this.jmenuDatosSri.add(this.jMenuItemAnterioresSri);				
			this.jmenuDatosSri.add(this.jMenuItemSiguientesSri);				
			this.jmenuDatosSri.add(this.jMenuItemAbrirOrderBySri);				
			this.jmenuDatosSri.add(this.jMenuItemMostrarOcultarSri);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSri.add(this.jMenuItemGuardarCambiosSri);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSri, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSri, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSri, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSri.add(this.jmenuArchivoSri);		
			this.jmenuBarSri.add(this.jmenuAccionesSri);		
			this.jmenuBarSri.add(this.jmenuDatosSri);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSri);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	*/
	
	
	
	/*
	public void inicializarElementosBusquedasSri() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableSri.setToolTipText("Buscar Por Asiento C. ");
		this.jButtonFK_IdAsientoContableSri= new JButtonMe();
		this.jButtonFK_IdAsientoContableSri.setText("Buscar");
		this.jButtonFK_IdAsientoContableSri.setToolTipText("Buscar Por Asiento C. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableSri,"buscar_button","Buscar Por Asiento C. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableSri = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableSri.setText("Asiento C. :");
		jLabelid_asiento_contableFK_IdAsientoContableSri.setToolTipText("Asiento C.");
		jLabelid_asiento_contableFK_IdAsientoContableSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableSri= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableSri= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableSri.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableSri.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableSri.setFocusable(false);

		this.jPanelFK_IdClienteSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteSri.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteSri= new JButtonMe();
		this.jButtonFK_IdClienteSri.setText("Buscar");
		this.jButtonFK_IdClienteSri.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteSri,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteSri = new JLabelMe();
		jLabelid_clienteFK_IdClienteSri.setText("Cliente :");
		jLabelid_clienteFK_IdClienteSri.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteSri= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteSri= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteSri.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteSri.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteSri.setFocusable(false);

		this.jPanelFK_IdTipoComprobanteSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoComprobanteSri.setToolTipText("Buscar Por Tipo Comp. ");
		this.jButtonFK_IdTipoComprobanteSri= new JButtonMe();
		this.jButtonFK_IdTipoComprobanteSri.setText("Buscar");
		this.jButtonFK_IdTipoComprobanteSri.setToolTipText("Buscar Por Tipo Comp. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoComprobanteSri,"buscar_button","Buscar Por Tipo Comp. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoComprobanteSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabeltipo_comprobanteFK_IdTipoComprobanteSri = new JLabelMe();
		jLabeltipo_comprobanteFK_IdTipoComprobanteSri.setText("Tipo Comp. :");
		jLabeltipo_comprobanteFK_IdTipoComprobanteSri.setToolTipText("Tipo Comp.");
		jLabeltipo_comprobanteFK_IdTipoComprobanteSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltipo_comprobanteFK_IdTipoComprobanteSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltipo_comprobanteFK_IdTipoComprobanteSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeltipo_comprobanteFK_IdTipoComprobanteSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxtipo_comprobanteFK_IdTipoComprobanteSri= new JComboBoxMe();
		jComboBoxtipo_comprobanteFK_IdTipoComprobanteSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxtipo_comprobanteFK_IdTipoComprobanteSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxtipo_comprobanteFK_IdTipoComprobanteSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxtipo_comprobanteFK_IdTipoComprobanteSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoIvaSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIvaSri.setToolTipText("Buscar Por P Iva ");
		this.jButtonFK_IdTipoIvaSri= new JButtonMe();
		this.jButtonFK_IdTipoIvaSri.setText("Buscar");
		this.jButtonFK_IdTipoIvaSri.setToolTipText("Buscar Por P Iva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIvaSri,"buscar_button","Buscar Por P Iva ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIvaSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_ivaFK_IdTipoIvaSri = new JLabelMe();
		jLabelid_tipo_ivaFK_IdTipoIvaSri.setText("P Iva :");
		jLabelid_tipo_ivaFK_IdTipoIvaSri.setToolTipText("P Iva");
		jLabelid_tipo_ivaFK_IdTipoIvaSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_ivaFK_IdTipoIvaSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_ivaFK_IdTipoIvaSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ivaFK_IdTipoIvaSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_ivaFK_IdTipoIvaSri= new JComboBoxMe();
		jComboBoxid_tipo_ivaFK_IdTipoIvaSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaFK_IdTipoIvaSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaFK_IdTipoIvaSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ivaFK_IdTipoIvaSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoSri.setToolTipText("Buscar Por Tipo Movimiento ");
		this.jButtonFK_IdTipoMovimientoSri= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoSri.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoSri.setToolTipText("Buscar Por Tipo Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoSri,"buscar_button","Buscar Por Tipo Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimientoFK_IdTipoMovimientoSri = new JLabelMe();
		jLabelid_tipo_movimientoFK_IdTipoMovimientoSri.setText("Tipo Movimiento :");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoSri.setToolTipText("Tipo Movimiento");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoFK_IdTipoMovimientoSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoSri= new JComboBoxMe();
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionIvaBienSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionIvaBienSri.setToolTipText("Buscar Por P Ret. Iva Bien ");
		this.jButtonFK_IdTipoRetencionIvaBienSri= new JButtonMe();
		this.jButtonFK_IdTipoRetencionIvaBienSri.setText("Buscar");
		this.jButtonFK_IdTipoRetencionIvaBienSri.setToolTipText("Buscar Por P Ret. Iva Bien ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionIvaBienSri,"buscar_button","Buscar Por P Ret. Iva Bien ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionIvaBienSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri = new JLabelMe();
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri.setText("P Ret. Iva Bien :");
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri.setToolTipText("P Ret. Iva Bien");
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionIvaServicioSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionIvaServicioSri.setToolTipText("Buscar Por P. Ret. Iva Serv ");
		this.jButtonFK_IdTipoRetencionIvaServicioSri= new JButtonMe();
		this.jButtonFK_IdTipoRetencionIvaServicioSri.setText("Buscar");
		this.jButtonFK_IdTipoRetencionIvaServicioSri.setToolTipText("Buscar Por P. Ret. Iva Serv ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionIvaServicioSri,"buscar_button","Buscar Por P. Ret. Iva Serv ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionIvaServicioSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri = new JLabelMe();
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri.setText("P. Ret. Iva Serv :");
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri.setToolTipText("P. Ret. Iva Serv");
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTributarioSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTributarioSri.setToolTipText("Buscar Por Codigo Tribut ");
		this.jButtonFK_IdTipoTributarioSri= new JButtonMe();
		this.jButtonFK_IdTipoTributarioSri.setText("Buscar");
		this.jButtonFK_IdTipoTributarioSri.setToolTipText("Buscar Por Codigo Tribut ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTributarioSri,"buscar_button","Buscar Por Codigo Tribut ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTributarioSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabeltipo_tributarioFK_IdTipoTributarioSri = new JLabelMe();
		jLabeltipo_tributarioFK_IdTipoTributarioSri.setText("Codigo Tribut :");
		jLabeltipo_tributarioFK_IdTipoTributarioSri.setToolTipText("Codigo Tribut");
		jLabeltipo_tributarioFK_IdTipoTributarioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltipo_tributarioFK_IdTipoTributarioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltipo_tributarioFK_IdTipoTributarioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeltipo_tributarioFK_IdTipoTributarioSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxtipo_tributarioFK_IdTipoTributarioSri= new JComboBoxMe();
		jComboBoxtipo_tributarioFK_IdTipoTributarioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxtipo_tributarioFK_IdTipoTributarioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxtipo_tributarioFK_IdTipoTributarioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxtipo_tributarioFK_IdTipoTributarioSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionContaSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionContaSri.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionContaSri= new JButtonMe();
		this.jButtonFK_IdTransaccionContaSri.setText("Buscar");
		this.jButtonFK_IdTransaccionContaSri.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionContaSri,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionContaSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_contaFK_IdTransaccionContaSri = new JLabelMe();
		jLabelid_transaccion_contaFK_IdTransaccionContaSri.setText("Transaccion :");
		jLabelid_transaccion_contaFK_IdTransaccionContaSri.setToolTipText("Transaccion");
		jLabelid_transaccion_contaFK_IdTransaccionContaSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_contaFK_IdTransaccionContaSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_contaFK_IdTransaccionContaSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_contaFK_IdTransaccionContaSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_contaFK_IdTransaccionContaSri= new JComboBoxMe();
		jComboBoxid_transaccion_contaFK_IdTransaccionContaSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaFK_IdTransaccionContaSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaFK_IdTransaccionContaSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_contaFK_IdTransaccionContaSri,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSri=new JTabbedPane();


		this.jTabbedPaneBusquedasSri.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSri.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSri.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSri.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSri,STIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
	}
	*/
	
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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleSri = new SriDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sri DATOS");
			this.jInternalFrameDetalleFormSri = new SriDetalleFormJInternalFrame(jDesktopPane,this.sriSessionBean.getConGuardarRelaciones(),this.sriSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSri = null;//new SriDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutSri= new GridBagLayout();
		
		
		this.jTableDatosSri = new JTableMe();      
		
		String sToolTipSri="";
		sToolTipSri=SriConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSri+="(Contabilidad.Sri)";
		}
		
		if(!this.sriSessionBean.getEsGuardarRelacionado()) {
			sToolTipSri+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSri.setToolTipText(sToolTipSri);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSri);
		this.jTableDatosSri.setAutoCreateRowSorter(true);
		this.jTableDatosSri.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSri.setRowSelectionAllowed(true);
		this.jTableDatosSri.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSri,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSri = new JButtonMe();
		this.jButtonDuplicarSri = new JButtonMe();
		this.jButtonCopiarSri = new JButtonMe();
		this.jButtonVerFormSri = new JButtonMe();
		this.jButtonNuevoRelacionesSri = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSri = new JButtonMe();
		this.jButtonCerrarSri = new JButtonMe();
		
		this.jScrollPanelDatosSri = new JScrollPane();   
        this.jScrollPanelDatosGeneralSri = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneral2Sri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciobienes_servicios_tarSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciobienes_servicios_retSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Sri";
		
		if(!this.sriSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sris" + this.sPath));
		} else {
			this.jScrollPanelDatosSri.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSri.setToolTipText("Acciones");
        this.jPanelAccionesSri.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSri, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralSri.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralSri.setName("jPanelCamposFingeneralSri");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralSri, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciogeneral2Sri.setBorder(javax.swing.BorderFactory.createTitledBorder("General2"));
		this.jPanelCamposIniciogeneral2Sri.setName("jPanelCamposFingeneral2Sri");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneral2Sri, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciobienes_servicios_tarSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Bienes Servicios Tar"));
		this.jPanelCamposIniciobienes_servicios_tarSri.setName("jPanelCamposFinbienes_servicios_tarSri");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciobienes_servicios_tarSri, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciobienes_servicios_retSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Bienes Servicios Ret"));
		this.jPanelCamposIniciobienes_servicios_retSri.setName("jPanelCamposFinbienes_servicios_retSri");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciobienes_servicios_retSri, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			/*
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoSri=new ReporteDinamicoJInternalFrame(SriConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSri();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSri=new ImportacionJInternalFrame(SriConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSri();
			
			*/		
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		/*
		this.jButtonAbrirOrderBySri = new JButtonMe();
		
		this.jButtonAbrirOrderBySri.setText("Orden");
		this.jButtonAbrirOrderBySri.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySri,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySri, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySri=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySri,false,this);
			
			//this.cargarOrderBySri(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySri=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySri,true,this);
			
			//this.cargarOrderBySri(true);
		}				
		*/
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSri.setMinimumSize(new Dimension(400,50));//3230
		this.jTableDatosSri.setMaximumSize(new Dimension(400,50));//3230
		this.jTableDatosSri.setPreferredSize(new Dimension(400,50));//3230
		
		this.jScrollPanelDatosSri.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSri.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSri.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSri.setText("Nuevo");
		this.jButtonDuplicarSri.setText("Duplicar");
		this.jButtonCopiarSri.setText("Copiar");
		this.jButtonVerFormSri.setText("Ver");
		this.jButtonNuevoRelacionesSri.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSri.setText("Guardar");
		this.jButtonCerrarSri.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSri,"nuevo_button","Nuevo",this.sriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSri,"duplicar_button","Duplicar",this.sriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSri,"copiar_button","Copiar",this.sriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSri,"ver_form","Ver",this.sriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSri,"nuevorelaciones_button","Nuevo Rel",this.sriSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSri,"guardarcambiostabla_button","Guardar",this.sriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSri,"cerrar_button","Salir",this.sriSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSri, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSri.setToolTipText("Nuevo"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSri.setToolTipText("Duplicar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSri.setToolTipText("Copiar"+" "+SriConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSri.setToolTipText("Ver"+" "+SriConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSri.setToolTipText("Nuevo Rel"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSri.setToolTipText("Guardar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSri.setToolTipText("Salir"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSri";
		inputMap = this.jButtonNuevoSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSri"));
		
		//DUPLICAR
		sMapKey = "DuplicarSri";
		inputMap = this.jButtonDuplicarSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSri"));
		
		//COPIAR
		sMapKey = "CopiarSri";
		inputMap = this.jButtonCopiarSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSri"));
		
		//VEr FORM
		sMapKey = "VerFormSri";
		inputMap = this.jButtonVerFormSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSri"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSri";
		inputMap = this.jButtonNuevoRelacionesSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSri"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSri";
		inputMap = this.jButtonModificarSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSri"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSri";
		inputMap = this.jButtonCerrarSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSri"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSri";
		inputMap = this.jButtonGuardarCambiosTablaSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSri"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		/*
		this.jPanelParametrosAuxiliar1Sri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Sri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Sri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Sri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Sri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		*/
		
		this.jPanelParametrosReportesSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSri.setName("jPanelParametrosReportesSri"); 
		
		this.jPanelParametrosReportesAccionesSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSri.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSri.setName("jPanelParametrosReportesAccionesSri"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSri, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSri, STIPO_TAMANIO_GENERAL,false,false,this);
	
		/*
		this.jButtonRecargarInformacionSri = new JButtonMe();
		this.jButtonRecargarInformacionSri.setText("Recargar");
		this.jButtonRecargarInformacionSri.setToolTipText("Recargar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSri,"recargar_button","Recargar");		
		*/
		
		
		/*
		this.jButtonProcesarInformacionSri = new JButtonMe();
		this.jButtonProcesarInformacionSri.setText("Procesar");
		this.jButtonProcesarInformacionSri.setToolTipText("Procesar"+" "+SriConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSri.setVisible(false);
			
		this.jButtonProcesarInformacionSri.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSri.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSri.setPreferredSize(new Dimension(185,25));		
		*/
		
		
		
		
		
		/*	
		this.jComboBoxTiposArchivosReportesSri = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSri.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSri.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSri = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSri.setText("TIPO");       
		this.jComboBoxTiposReportesSri.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSri = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSri.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSri.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSri = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSri.setText("Paginacion");
		this.jComboBoxTiposPaginacionSri.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSri = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSri.setText("Accion");
		this.jComboBoxTiposRelacionesSri.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSri = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSri.setText("Accion");
		this.jComboBoxTiposAccionesSri.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSri = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSri.setText("Accion");
		this.jComboBoxTiposSeleccionarSri.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSri=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSri.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSri.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSri.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		*/

	
		this.jLabelAccionesSri = new JLabelMe();
		
		this.jLabelAccionesSri.setText("Acciones");		
		this.jLabelAccionesSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSri = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSri.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSri.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSri = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSri.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSri.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		/*
		this.jCheckBoxConAltoMaximoTablaSri = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSri.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSri.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSri = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSri.setText("Graf.");
		this.jCheckBoxConGraficoReporteSri.setToolTipText("Con Grafico");						
		*/
		
        this.jButtonAnterioresSri = new JButtonMe();
		//this.jButtonAnterioresSri.setText("<<");
        this.jButtonAnterioresSri.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSri,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSri = new JButtonMe();
		//this.jButtonSiguientesSri.setText(">>");
        this.jButtonSiguientesSri.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSri,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSri = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSri.setText("Nue");
        this.jButtonNuevoGuardarCambiosSri.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSri,"nuevoguardarcambios_button","Nue",this.sriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSri";
		inputMap = this.jButtonNuevoGuardarCambiosSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSri"));
		
		//RECARGAR		
		/*
		sMapKey = "RecargarInformacionSri";
		inputMap = this.jButtonRecargarInformacionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSri"));		
		*/
		
		//SIGUIENTES		
		sMapKey = "SiguientesSri";
		inputMap = this.jButtonSiguientesSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSri"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSri";
		inputMap = this.jButtonAnterioresSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSri"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			/*
			this.inicializarElementosBusquedasSri();			
			*/
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSri.setMinimumSize(new Dimension(this.getWidth(),SriBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSri.setMaximumSize(new Dimension(this.getWidth(),SriBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSri.setPreferredSize(new Dimension(this.getWidth(),SriBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSri = new GridBagLayout();

			this.jPanelPaginacionSri.setLayout(gridaBagLayoutPaginacionSri);						
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = 0;
			this.gridBagConstraintsSri.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSri.add(this.jButtonAnterioresSri, this.gridBagConstraintsSri);
					
						
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSri.gridy = 0;
			
			this.jPanelPaginacionSri.add(this.jButtonNuevoGuardarCambiosSri, this.gridBagConstraintsSri);
						
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSri.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSri.gridy = 0;
			this.jPanelPaginacionSri.add(this.jButtonSiguientesSri, this.gridBagConstraintsSri);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = 1;
			this.gridBagConstraintsSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSri.add(this.jButtonNuevoSri, this.gridBagConstraintsSri);
						
			
			
			if(!this.sriSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSri = new GridBagConstraints();
				this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSri.gridy = 1;
				this.gridBagConstraintsSri.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSri.add(this.jButtonGuardarCambiosTablaSri, this.gridBagConstraintsSri);
			}
			
			
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = 1;
			this.gridBagConstraintsSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSri.add(this.jButtonDuplicarSri, this.gridBagConstraintsSri);
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = 1;
			this.gridBagConstraintsSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSri.add(this.jButtonCopiarSri, this.gridBagConstraintsSri);
		
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = 1;
			this.gridBagConstraintsSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSri.add(this.jButtonVerFormSri, this.gridBagConstraintsSri);
		
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = 1;
			this.gridBagConstraintsSri.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSri.add(this.jButtonCerrarSri, this.gridBagConstraintsSri);
		
		
		/*
		this.jButtonRecargarInformacionSri.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSri.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSri.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSri, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		
				
		/*
		this.jComboBoxTiposArchivosReportesSri.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSri.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSri.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSri.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSri.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSri.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSri.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSri.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSri.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSri.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSri.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSri.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSri.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSri.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSri.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSri.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSri.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSri.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSri, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		this.jCheckBoxSeleccionarTodosSri.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSri.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSri.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSri.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSri.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSri.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSri = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSri = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Sri = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Sri = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Sri = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Sri = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSri.setLayout(gridaBagParametrosReportesSri);
			this.jPanelParametrosReportesAccionesSri.setLayout(gridaBagParametrosReportesAccionesSri);
			
			/*
			this.jPanelParametrosAuxiliar1Sri.setLayout(gridaBagParametrosAuxiliar1Sri);
			this.jPanelParametrosAuxiliar2Sri.setLayout(gridaBagParametrosAuxiliar2Sri);
			this.jPanelParametrosAuxiliar3Sri.setLayout(gridaBagParametrosAuxiliar3Sri);
			this.jPanelParametrosAuxiliar4Sri.setLayout(gridaBagParametrosAuxiliar4Sri);
			//this.jPanelParametrosAuxiliar5Sri.setLayout(gridaBagParametrosAuxiliar2Sri);			
			*/
			
			
			/*
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSri.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSri.add(this.jButtonRecargarInformacionSri, this.gridBagConstraintsSri);			
			*/
			

			
			/*
			//PAGINACION
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sri.add(this.jComboBoxTiposPaginacionSri, this.gridBagConstraintsSri);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sri.add(this.jCheckBoxConAltoMaximoTablaSri, this.gridBagConstraintsSri);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sri.add(this.jComboBoxTiposArchivosReportesSri, this.gridBagConstraintsSri);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSri.add(this.jPanelParametrosAuxiliar1Sri, this.gridBagConstraintsSri);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSri.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Sri.add(this.jComboBoxTiposReportesSri, this.gridBagConstraintsSri);																		
			*/
			
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSri.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Sri.add(this.jComboBoxTiposGraficosReportesSri, this.gridBagConstraintsSri);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			/*
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSri.add(this.jPanelParametrosAuxiliar4Sri, this.gridBagConstraintsSri);						
			*/
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSri.add(this.jComboBoxTiposReportesSri, this.gridBagConstraintsSri);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSri.add(this.jCheckBoxGenerarReporteSri, this.gridBagConstraintsSri);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			/*
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSri.add(this.jPanelParametrosAuxiliar2Sri, this.gridBagConstraintsSri);						
			*/
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSri.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSri.add(this.jLabelAccionesSri, this.gridBagConstraintsSri);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				/*
				this.gridBagConstraintsSri = new GridBagConstraints();
				this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSri.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSri.add(this.jButtonAbrirOrderBySri, this.gridBagConstraintsSri);						
				*/				
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			/*
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSri.add(this.jComboBoxTiposSeleccionarSri, this.gridBagConstraintsSri);			
			*/
			
			/*
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSri.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSri.add(this.jCheckBoxSeleccionarTodosSri, this.gridBagConstraintsSri);
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSri.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSri.add(this.jCheckBoxConGraficoReporteSri, this.gridBagConstraintsSri);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			/*
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSri.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Sri.add(this.jCheckBoxSeleccionarTodosSri, this.gridBagConstraintsSri);															
				
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSri.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Sri.add(this.jCheckBoxSeleccionadosSri, this.gridBagConstraintsSri);															
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSri.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Sri.add(this.jCheckBoxConGraficoReporteSri, this.gridBagConstraintsSri);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSri.add(this.jPanelParametrosAuxiliar3Sri, this.gridBagConstraintsSri);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSri.add(this.jComboBoxTiposAccionesSri, this.gridBagConstraintsSri);
	
				
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSri.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSri.add(this.jTextFieldValorCampoGeneralSri, this.gridBagConstraintsSri);			
			
			*/
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralSri= new GridBagLayout();
		this.jPanelCamposIniciogeneralSri.setLayout(gridaBagLayoutCamposIniciogeneralSri);

		GridBagLayout gridaBagLayoutCamposIniciogeneral2Sri= new GridBagLayout();
		this.jPanelCamposIniciogeneral2Sri.setLayout(gridaBagLayoutCamposIniciogeneral2Sri);

		GridBagLayout gridaBagLayoutCamposIniciobienes_servicios_tarSri= new GridBagLayout();
		this.jPanelCamposIniciobienes_servicios_tarSri.setLayout(gridaBagLayoutCamposIniciobienes_servicios_tarSri);

		GridBagLayout gridaBagLayoutCamposIniciobienes_servicios_retSri= new GridBagLayout();
		this.jPanelCamposIniciobienes_servicios_retSri.setLayout(gridaBagLayoutCamposIniciobienes_servicios_retSri);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSri = new GridBagLayout();

			this.jScrollPanelDatosSri.setLayout(gridaBagLayoutDatosSri);
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = 0;
			this.gridBagConstraintsSri.gridx = 0;
			
			this.jScrollPanelDatosSri.add(this.jTableDatosSri, this.gridBagConstraintsSri);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSri.setViewportView(this.jTableDatosSri);
		this.jTableDatosSri.setFillsViewportHeight(true);
		this.jTableDatosSri.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSri= new GridBagLayout();
		this.jPanelAccionesSri.setLayout(gridaBagLayoutAccionesSri);
		
		
		/*	
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 0;
			
		this.jPanelAccionesSri.add(this.jButtonNuevoSri, this.gridBagConstraintsSri);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			/*
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableSri= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableSri.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableSri.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableSri.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableSri.setLayout(gridaBagLayoutFK_IdAsientoContableSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 0;
		jPanelFK_IdAsientoContableSri.add(jLabelid_asiento_contableFK_IdAsientoContableSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 1;
		jPanelFK_IdAsientoContableSri.add(jComboBoxid_asiento_contableFK_IdAsientoContableSri, gridBagConstraintsSri);


		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.EAST;
		gridBagConstraintsSri.fill = GridBagConstraints.NONE;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 0;
		jPanelFK_IdAsientoContableSri.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 1;
		gridBagConstraintsSri.gridx =1;
		jPanelFK_IdAsientoContableSri.add(jButtonFK_IdAsientoContableSri, gridBagConstraintsSri);

		jTabbedPaneBusquedasSri.addTab("1.-Por Asiento C. ", jPanelFK_IdAsientoContableSri);
		jTabbedPaneBusquedasSri.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteSri= new GridBagLayout();
		gridaBagLayoutFK_IdClienteSri.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteSri.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteSri.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteSri.setLayout(gridaBagLayoutFK_IdClienteSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 0;
		jPanelFK_IdClienteSri.add(jLabelid_clienteFK_IdClienteSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 1;
		jPanelFK_IdClienteSri.add(jComboBoxid_clienteFK_IdClienteSri, gridBagConstraintsSri);


		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.EAST;
		gridBagConstraintsSri.fill = GridBagConstraints.NONE;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 0;
		jPanelFK_IdClienteSri.add(this.jButtonBuscarFK_IdClienteid_clienteSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 1;
		gridBagConstraintsSri.gridx =1;
		jPanelFK_IdClienteSri.add(jButtonFK_IdClienteSri, gridBagConstraintsSri);

		jTabbedPaneBusquedasSri.addTab("2.-Por Cliente ", jPanelFK_IdClienteSri);
		jTabbedPaneBusquedasSri.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoComprobanteSri= new GridBagLayout();
		gridaBagLayoutFK_IdTipoComprobanteSri.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteSri.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoComprobanteSri.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoComprobanteSri.setLayout(gridaBagLayoutFK_IdTipoComprobanteSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 0;
		jPanelFK_IdTipoComprobanteSri.add(jLabeltipo_comprobanteFK_IdTipoComprobanteSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 1;
		jPanelFK_IdTipoComprobanteSri.add(jComboBoxtipo_comprobanteFK_IdTipoComprobanteSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 1;
		gridBagConstraintsSri.gridx =1;
		jPanelFK_IdTipoComprobanteSri.add(jButtonFK_IdTipoComprobanteSri, gridBagConstraintsSri);

		jTabbedPaneBusquedasSri.addTab("3.-Por Tipo Comp. ", jPanelFK_IdTipoComprobanteSri);
		jTabbedPaneBusquedasSri.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoIvaSri= new GridBagLayout();
		gridaBagLayoutFK_IdTipoIvaSri.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoIvaSri.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoIvaSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoIvaSri.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoIvaSri.setLayout(gridaBagLayoutFK_IdTipoIvaSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 0;
		jPanelFK_IdTipoIvaSri.add(jLabelid_tipo_ivaFK_IdTipoIvaSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 1;
		jPanelFK_IdTipoIvaSri.add(jComboBoxid_tipo_ivaFK_IdTipoIvaSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 1;
		gridBagConstraintsSri.gridx =1;
		jPanelFK_IdTipoIvaSri.add(jButtonFK_IdTipoIvaSri, gridBagConstraintsSri);

		jTabbedPaneBusquedasSri.addTab("4.-Por P Iva ", jPanelFK_IdTipoIvaSri);
		jTabbedPaneBusquedasSri.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoMovimientoSri= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMovimientoSri.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoSri.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMovimientoSri.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMovimientoSri.setLayout(gridaBagLayoutFK_IdTipoMovimientoSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 0;
		jPanelFK_IdTipoMovimientoSri.add(jLabelid_tipo_movimientoFK_IdTipoMovimientoSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 1;
		jPanelFK_IdTipoMovimientoSri.add(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 1;
		gridBagConstraintsSri.gridx =1;
		jPanelFK_IdTipoMovimientoSri.add(jButtonFK_IdTipoMovimientoSri, gridBagConstraintsSri);

		jTabbedPaneBusquedasSri.addTab("5.-Por Tipo Movimiento ", jPanelFK_IdTipoMovimientoSri);
		jTabbedPaneBusquedasSri.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionIvaBienSri= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionIvaBienSri.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaBienSri.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaBienSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionIvaBienSri.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionIvaBienSri.setLayout(gridaBagLayoutFK_IdTipoRetencionIvaBienSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 0;
		jPanelFK_IdTipoRetencionIvaBienSri.add(jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 1;
		jPanelFK_IdTipoRetencionIvaBienSri.add(jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 1;
		gridBagConstraintsSri.gridx =1;
		jPanelFK_IdTipoRetencionIvaBienSri.add(jButtonFK_IdTipoRetencionIvaBienSri, gridBagConstraintsSri);

		jTabbedPaneBusquedasSri.addTab("6.-Por P Ret. Iva Bien ", jPanelFK_IdTipoRetencionIvaBienSri);
		jTabbedPaneBusquedasSri.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionIvaServicioSri= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionIvaServicioSri.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaServicioSri.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaServicioSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionIvaServicioSri.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionIvaServicioSri.setLayout(gridaBagLayoutFK_IdTipoRetencionIvaServicioSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 0;
		jPanelFK_IdTipoRetencionIvaServicioSri.add(jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 1;
		jPanelFK_IdTipoRetencionIvaServicioSri.add(jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 1;
		gridBagConstraintsSri.gridx =1;
		jPanelFK_IdTipoRetencionIvaServicioSri.add(jButtonFK_IdTipoRetencionIvaServicioSri, gridBagConstraintsSri);

		jTabbedPaneBusquedasSri.addTab("7.-Por P. Ret. Iva Serv ", jPanelFK_IdTipoRetencionIvaServicioSri);
		jTabbedPaneBusquedasSri.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoTributarioSri= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTributarioSri.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioSri.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTributarioSri.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTributarioSri.setLayout(gridaBagLayoutFK_IdTipoTributarioSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 0;
		jPanelFK_IdTipoTributarioSri.add(jLabeltipo_tributarioFK_IdTipoTributarioSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 1;
		jPanelFK_IdTipoTributarioSri.add(jComboBoxtipo_tributarioFK_IdTipoTributarioSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 1;
		gridBagConstraintsSri.gridx =1;
		jPanelFK_IdTipoTributarioSri.add(jButtonFK_IdTipoTributarioSri, gridBagConstraintsSri);

		jTabbedPaneBusquedasSri.addTab("8.-Por Codigo Tribut ", jPanelFK_IdTipoTributarioSri);
		jTabbedPaneBusquedasSri.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTransaccionContaSri= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionContaSri.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionContaSri.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionContaSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionContaSri.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionContaSri.setLayout(gridaBagLayoutFK_IdTransaccionContaSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 0;
		jPanelFK_IdTransaccionContaSri.add(jLabelid_transaccion_contaFK_IdTransaccionContaSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 0;
		gridBagConstraintsSri.gridx = 1;
		jPanelFK_IdTransaccionContaSri.add(jComboBoxid_transaccion_contaFK_IdTransaccionContaSri, gridBagConstraintsSri);

		gridBagConstraintsSri = new GridBagConstraints();
		gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSri.gridy = 1;
		gridBagConstraintsSri.gridx =1;
		jPanelFK_IdTransaccionContaSri.add(jButtonFK_IdTransaccionContaSri, gridBagConstraintsSri);

		jTabbedPaneBusquedasSri.addTab("9.-Por Transaccion ", jPanelFK_IdTransaccionContaSri);
		jTabbedPaneBusquedasSri.setMnemonicAt(8, KeyEvent.VK_9);

			*/		
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSri = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSri);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sriSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsSri = new GridBagConstraints();						
			this.gridBagConstraintsSri.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSri.gridx = 0;		
			//this.gridBagConstraintsSri.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSri.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSri, this.gridBagConstraintsSri);												
			*/
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSri.gridx = 0;		
		//this.gridBagConstraintsSri.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSri.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSri);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSri.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSri.gridx = 0;		
			this.gridBagConstraintsSri.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSri.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				/*
				this.jContentPane.add(this.jTabbedPaneBusquedasSri, this.gridBagConstraintsSri);				
				*/
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSri.gridx = 0;
		
		/*
		this.jContentPane.add(this.jPanelParametrosReportesSri, this.gridBagConstraintsSri);								
		*/
		
		/*
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSri.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSri, this.gridBagConstraintsSri);
		*/		
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSri.gridx =0;
		this.gridBagConstraintsSri.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSri.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSri, this.gridBagConstraintsSri);
				
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSri.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSri, this.gridBagConstraintsSri);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SriJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSri = new GridBagLayout();
			this.jPanelBusquedasParametrosSri.setLayout(gridaBagLayoutBusquedasParametrosSri);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSri=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSri, this.gridBagConstraintsSri);
			
			
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSri, this.gridBagConstraintsSri);
		
			
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSri.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSri, this.gridBagConstraintsSri);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSri;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSri() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSri = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSri.setName("jPanelReporteDinamicoSri"); 
		
		this.jPanelReporteDinamicoSri.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSri.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSri.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSri.setLayout(gridaBagLayoutReporteDinamicoSri);
		
		
		this.jInternalFrameReporteDinamicoSri= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSri = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSri= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSri.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSri.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSri.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSri.setResizable(true);
	    this.jInternalFrameReporteDinamicoSri.setClosable(true);
	    this.jInternalFrameReporteDinamicoSri.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSri.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSri.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSri.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sris"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSri = new JLabelMe();

		this.jLabelColumnasSelectReporteSri.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSri.add(this.jLabelColumnasSelectReporteSri, this.gridBagConstraintsSri);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSri = new JList<Reporte>();
		this.jListColumnasSelectReporteSri.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSri.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSri.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSri.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSri.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSri=new JScrollPane(this.jListColumnasSelectReporteSri);
			
			this.jScrollColumnasSelectReporteSri.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSri.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSri.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSri.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSri.add(this.jListColumnasSelectReporteSri, this.gridBagConstraintsSri);
		this.jPanelReporteDinamicoSri.add(this.jScrollColumnasSelectReporteSri, this.gridBagConstraintsSri);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSri = new JLabelMe();

		this.jLabelRelacionesSelectReporteSri.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSri = new JList<Reporte>();
		this.jListRelacionesSelectReporteSri.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSri.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSri.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSri.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSri.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSri=new JScrollPane(this.jListRelacionesSelectReporteSri);
			
			this.jScrollRelacionesSelectReporteSri.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSri.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSri.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSri.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSri = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSri = new JComboBoxMe();
		this.jListColumnasValoresGraficoSri = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSri = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSri.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSri.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSri.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSri.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSri = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSri.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSri.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSri.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSri.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSri = new JLabelMe();

		this.jLabelConGraficoDinamicoSri.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSri.add(this.jLabelConGraficoDinamicoSri, this.gridBagConstraintsSri);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSri = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSri.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSri.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSri.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSri.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSri.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSri.add(this.jCheckBoxConGraficoDinamicoSri, this.gridBagConstraintsSri);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSri = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSri.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSri.add(this.jLabelColumnaCategoriaGraficoSri, this.gridBagConstraintsSri);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSri = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSri.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSri.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSri.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSri.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSri.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSri.add(this.jComboBoxColumnaCategoriaGraficoSri, this.gridBagConstraintsSri);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSri = new JLabelMe();

		this.jLabelColumnaCategoriaValorSri.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSri.add(this.jLabelColumnaCategoriaValorSri, this.gridBagConstraintsSri);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSri = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSri.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSri.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSri.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSri.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSri.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSri.add(this.jComboBoxColumnaCategoriaValorSri, this.gridBagConstraintsSri);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSri = new JLabelMe();

		this.jLabelColumnasValoresGraficoSri.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSri.add(this.jLabelColumnasValoresGraficoSri, this.gridBagConstraintsSri);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSri = new JList<Reporte>();
		this.jListColumnasValoresGraficoSri.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSri.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSri.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSri.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSri.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSri=new JScrollPane(this.jListColumnasValoresGraficoSri);
			
			this.jScrollColumnasValoresGraficoSri.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSri.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSri.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSri.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSri.add(this.jListColumnasSelectReporteSri, this.gridBagConstraintsSri);
		this.jPanelReporteDinamicoSri.add(this.jScrollColumnasValoresGraficoSri, this.gridBagConstraintsSri);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSri = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSri.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSri.add(this.jLabelTiposGraficosReportesDinamicoSri, this.gridBagConstraintsSri);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSri = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSri.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSri.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSri.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSri.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSri.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSri.add(this.jComboBoxTiposGraficosReportesDinamicoSri, this.gridBagConstraintsSri);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSri = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSri.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSri.add(this.jLabelGenerarExcelReporteDinamicoSri, this.gridBagConstraintsSri);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSri = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSri.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSri,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSri.setToolTipText("Generar EXCEL"+" "+SriConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSri.add(this.jButtonGenerarExcelReporteDinamicoSri, this.gridBagConstraintsSri);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSri.add(this.jComboBoxTiposReportesDinamicoSri, this.gridBagConstraintsSri);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSri = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSri.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSri.add(this.jLabelTiposArchivoReporteDinamicoSri, this.gridBagConstraintsSri);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSri.add(this.jComboBoxTiposArchivosReportesDinamicoSri, this.gridBagConstraintsSri);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSri = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSri.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSri,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSri.setToolTipText("Generar"+" "+SriConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSri.add(this.jButtonGenerarReporteDinamicoSri, this.gridBagConstraintsSri);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSri = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSri.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSri,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSri.setToolTipText("Cancelar"+" "+SriConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSri.add(this.jButtonCerrarReporteDinamicoSri, this.gridBagConstraintsSri);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSri = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSri= new JScrollPane(jPanelReporteDinamicoSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSri.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSri.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSri.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sris"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSri.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSri.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSri.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSri.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSri);
		this.jInternalFrameReporteDinamicoSri.getContentPane().add(this.jScrollPanelReporteDinamicoSri, this.gridBagConstraintsSri);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSri() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSri = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSri.setName("jPanelImportacionSri"); 
		
		this.jPanelImportacionSri.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSri.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSri.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSri.setLayout(gridaBagLayoutImportacionSri);
		
		
		this.jInternalFrameImportacionSri= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSri= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSri = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSri= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSri.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSri.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSri.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSri.setResizable(true);
	    this.jInternalFrameImportacionSri.setClosable(true);
	    this.jInternalFrameImportacionSri.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSri.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSri.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSri.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSri.setResizable(true);
	    this.jInternalFrameImportacionSri.setClosable(true);
	    this.jInternalFrameImportacionSri.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSri.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSri.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSri.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sris"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSri = new JLabelMe();

		this.jLabelArchivoImportacionSri.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYImportacion;		
		this.gridBagConstraintsSri.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSri.add(this.jLabelArchivoImportacionSri, this.gridBagConstraintsSri);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSri = new JFileChooser();		
		this.jFileChooserImportacionSri.setToolTipText("ESCOGER ARCHIVO"+" "+SriConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSri = new JButtonMe();
		this.jButtonAbrirImportacionSri.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSri,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSri.setToolTipText("Generar"+" "+SriConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.gridy = iPosYImportacion;
		this.gridBagConstraintsSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSri.add(this.jButtonAbrirImportacionSri, this.gridBagConstraintsSri);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSri = new JLabelMe();

		this.jLabelPathArchivoImportacionSri.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = iPosYImportacion;		
		this.gridBagConstraintsSri.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSri.add(this.jLabelPathArchivoImportacionSri, this.gridBagConstraintsSri);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSri=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSri.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSri.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSri.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.gridy = iPosYImportacion;
		this.gridBagConstraintsSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSri.add(this.jTextFieldPathArchivoImportacionSri, this.gridBagConstraintsSri);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSri = new JButtonMe();
		this.jButtonGenerarImportacionSri.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSri,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSri.setToolTipText("Generar"+" "+SriConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.gridy = iPosYImportacion;
		this.gridBagConstraintsSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSri.add(this.jButtonGenerarImportacionSri, this.gridBagConstraintsSri);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSri = new JButtonMe();
		this.jButtonCerrarImportacionSri.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSri,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSri.setToolTipText("Cancelar"+" "+SriConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.gridy = iPosYImportacion;
		this.gridBagConstraintsSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSri.add(this.jButtonCerrarImportacionSri, this.gridBagConstraintsSri);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSri = new GridBagLayout();
		
		this.jScrollPanelImportacionSri= new JScrollPane(jPanelImportacionSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy =iPosYImportacion;
		this.gridBagConstraintsSri.gridx =iPosXImportacion;
		this.gridBagConstraintsSri.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSri.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSri.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSri);
		this.jInternalFrameImportacionSri.getContentPane().add(this.jScrollPanelImportacionSri, this.gridBagConstraintsSri);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySri(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySri = new JButtonMe();
			this.jButtonAbrirOrderBySri.setText("Orden");
			this.jButtonAbrirOrderBySri.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySri,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySri";
			inputMap = this.jButtonAbrirOrderBySri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySri"));
		
		
			GridBagLayout gridaBagLayoutOrderBySri = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySri.setName("jPanelOrderBySri"); 
			
			this.jPanelOrderBySri.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySri.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySri.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySri.setLayout(gridaBagLayoutOrderBySri);
			
			
			this.jTableDatosSriOrderBy = new JTableMe();        
			this.jTableDatosSriOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSriOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSriOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSriOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSriOrderBy.setViewportView(this.jTableDatosSriOrderBy);
			this.jTableDatosSriOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSriOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySri= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySri= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySri = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSri= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySri.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySri.setTitle("Orden");
			this.jInternalFrameOrderBySri.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySri.setResizable(true);
			this.jInternalFrameOrderBySri.setClosable(true);
			this.jInternalFrameOrderBySri.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySri.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySri.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySri.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sris"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSri.gridx =iPosXOrderBy;
			this.gridBagConstraintsSri.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSri.ipady =150;
				
			this.jPanelOrderBySri.add(jScrollPanelDatosSriOrderBy, this.gridBagConstraintsSri);//this.jTableDatosSriTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySri = new JButtonMe();
			this.jButtonCerrarOrderBySri.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySri,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySri.setToolTipText("Cancelar"+" "+SriConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSri.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySri.add(this.jButtonCerrarOrderBySri, this.gridBagConstraintsSri);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSri = new GridBagLayout();
			
			this.jScrollPanelOrderBySri= new JScrollPane(jPanelOrderBySri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.gridy =iPosYOrderBy;
			this.gridBagConstraintsSri.gridx =iPosXOrderBy;
			this.gridBagConstraintsSri.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySri.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySri.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSri);
			
			this.jInternalFrameOrderBySri.getContentPane().add(this.jScrollPanelOrderBySri, this.gridBagConstraintsSri);			
		
		} else {
			this.jButtonAbrirOrderBySri = new JButtonMe();
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
		int iWidthTableCalculado=0;//6430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.sriSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSri.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSri.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSri.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSri.getRowHeight();//SriConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.sriSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaSri.isSelected()) {
					iHeightTable=SriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < SriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaSri.isSelected()) {
					iHeightTable=SriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < SriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSri.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSri.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSri.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSri.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSri.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSri.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
		/*								
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySri!=null && this.jInternalFrameOrderBySri.getjTableDatosOrderBy()!=null) {
			//if(!this.sriSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySri.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySri.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySri.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySri.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySri.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySri.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySri.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		*/

		//ORDER BY
		
		//this.jScrollPanelDatosSri.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSri.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSri.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=sriLogic.getSris().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sris.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Sri> TraerSriBeans(List<Sri> sris,ArrayList<Classe> classes)throws Exception {
		try {
			for(Sri sri:sris) {
					
				if(!(SriConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SriConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					sri.setsDetalleGeneralEntityReporte(SriConstantesFunciones.getSriDescripcion(sri));
										
					sri.setes_rise_descripcion(SriConstantesFunciones.getes_riseDescripcion(sri));sri.setcon_devolucion_descripcion(SriConstantesFunciones.getcon_devolucionDescripcion(sri));	
					
						
					
				} else  {
							
					//sri.setsDetalleGeneralEntityReporte(sri.getsDetalleGeneralEntityReporte());
										
				}
				
				//sribeans.add(sribean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return sris;
    }
	//PARA REPORTES FIN
}
