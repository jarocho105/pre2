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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.contabilidad.util.ImportarExportarConstantesFunciones;

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
public class ImportarExportarJInternalFrame extends ImportarExportarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	/*
	public JToolBar jTtoolBarImportarExportar;
	
	protected JMenuBar jmenuBarImportarExportar;
	
	protected JMenu jmenuImportarExportar;
	protected JMenu jmenuDatosImportarExportar;
	protected JMenu jmenuArchivoImportarExportar;
	protected JMenu jmenuAccionesImportarExportar;
	
	*/
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutImportarExportar;	
	protected GridBagConstraints gridBagConstraintsImportarExportar;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ImportarExportarDetalleFormJInternalFrame jInternalFrameDetalleFormImportarExportar;		
	
	/*
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoImportarExportar;	
	protected ImportacionJInternalFrame jInternalFrameImportacionImportarExportar;	
	*/
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected PeriodoImportExportBeanSwingJInternalFrame periodoimportexportBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodoimportexport="";

	protected TransaccionContaBeanSwingJInternalFrame transaccioncontaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionconta="";

	protected TipoImportacionBeanSwingJInternalFrame tipoimportacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoimportacion="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoIceBeanSwingJInternalFrame tipoiceBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoice="";

	protected TipoBancoBeanSwingJInternalFrame tipobancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipobanco="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobantebancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobantebanco="";
	
	public ImportarExportarSessionBean importarexportarSessionBean;
		
	
	
	public ModuloSessionBean moduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public PeriodoImportExportSessionBean periodoimportexportSessionBean;
	public TransaccionContaSessionBean transaccioncontaSessionBean;
	public TipoImportacionSessionBean tipoimportacionSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoIceSessionBean tipoiceSessionBean;
	public TipoBancoSessionBean tipobancoSessionBean;
	public TipoComprobanteSessionBean tipocomprobantebancoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ImportarExportar> importarexportars;		
	public List<ImportarExportar> importarexportarsEliminados;	
	public List<ImportarExportar> importarexportarsAux;
	
	
	/*	
	protected OrderByJInternalFrame jInternalFrameOrderByImportarExportar;		
	protected JButton jButtonAbrirOrderByImportarExportar;
	
	
	//protected JPanel jPanelOrderByImportarExportar;
	//public JScrollPane jScrollPanelOrderByImportarExportar;	
	//protected JButton jButtonCerrarOrderByImportarExportar;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	*/
	
	public ImportarExportarLogic importarexportarLogic;
	
	
	
	public JScrollPane jScrollPanelDatosImportarExportar;
	public JScrollPane jScrollPanelDatosEdicionImportarExportar;
	public JScrollPane jScrollPanelDatosGeneralImportarExportar;
    
	
	/*
	//public JScrollPane jScrollPanelDatosImportarExportarOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoImportarExportar;
	//public JScrollPane jScrollPanelImportacionImportarExportar;
	*/
	
	
	protected JPanel jPanelAccionesImportarExportar;
	
    protected JPanel jPanelPaginacionImportarExportar;
    protected JPanel jPanelParametrosReportesImportarExportar;
	protected JPanel jPanelParametrosReportesAccionesImportarExportar;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralImportarExportar;
	protected Integer iXPanelCamposIniciogeneralImportarExportar=0;
	protected Integer iYPanelCamposIniciogeneralImportarExportar=0;

	protected JPanel jPanelCamposIniciovaloresImportarExportar;
	protected Integer iXPanelCamposIniciovaloresImportarExportar=0;
	protected Integer iYPanelCamposIniciovaloresImportarExportar=0;

	protected JPanel jPanelCamposIniciobancoImportarExportar;
	protected Integer iXPanelCamposIniciobancoImportarExportar=0;
	protected Integer iYPanelCamposIniciobancoImportarExportar=0;

	protected JPanel jPanelCamposIniciocomprobanteImportarExportar;
	protected Integer iXPanelCamposIniciocomprobanteImportarExportar=0;
	protected Integer iYPanelCamposIniciocomprobanteImportarExportar=0;;
	
	
	/*
	protected JPanel jPanelParametrosAuxiliar1ImportarExportar;
	protected JPanel jPanelParametrosAuxiliar2ImportarExportar;
	protected JPanel jPanelParametrosAuxiliar3ImportarExportar;
	protected JPanel jPanelParametrosAuxiliar4ImportarExportar;
	//protected JPanel jPanelParametrosAuxiliar5ImportarExportar;
	*/
	
	/*
	//protected JPanel jPanelReporteDinamicoImportarExportar;
	//protected JPanel jPanelImportacionImportarExportar;
	*/
	
	public JTable jTableDatosImportarExportar;
	
	
	/*
	//public JTable jTableDatosImportarExportarOrderBy;
	*/
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoImportarExportar;
	protected JButton jButtonDuplicarImportarExportar;
	protected JButton jButtonCopiarImportarExportar;
	protected JButton jButtonVerFormImportarExportar;
	protected JButton jButtonNuevoRelacionesImportarExportar;
	protected JButton jButtonModificarImportarExportar;
	
    protected JButton jButtonGuardarCambiosTablaImportarExportar;
	protected JButton jButtonCerrarImportarExportar;
	
	/*
	protected JButton jButtonRecargarInformacionImportarExportar;
	protected JButton jButtonProcesarInformacionImportarExportar;
	*/
	
	protected JButton jButtonAnterioresImportarExportar;
	protected JButton jButtonSiguientesImportarExportar;
	protected JButton jButtonNuevoGuardarCambiosImportarExportar;
	
	/*
	
	//protected JButton jButtonGenerarReporteDinamicoImportarExportar;
	//protected JButton jButtonCerrarReporteDinamicoImportarExportar;
	//protected JButton jButtonGenerarExcelReporteDinamicoImportarExportar;	
	
	
	
	//protected JButton jButtonAbrirImportacionImportarExportar;
	//protected JButton jButtonGenerarImportacionImportarExportar;
	//protected JButton jButtonCerrarImportacionImportarExportar;
	//protected JFileChooser jFileChooserImportacionImportarExportar;
	//protected File fileImportacionImportarExportar;
	
	
	*/
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarImportarExportar;
	protected JButton jButtonDuplicarToolBarImportarExportar;
	protected JButton jButtonNuevoRelacionesToolBarImportarExportar;
	
	
	public JButton jButtonGuardarCambiosToolBarImportarExportar;
	protected JButton jButtonCopiarToolBarImportarExportar;
	protected JButton jButtonVerFormToolBarImportarExportar;
	public JButton jButtonGuardarCambiosTablaToolBarImportarExportar;
	protected JButton jButtonMostrarOcultarTablaToolBarImportarExportar;
	protected JButton jButtonCerrarToolBarImportarExportar;
	
	protected JButton jButtonRecargarInformacionToolBarImportarExportar;
	protected JButton jButtonProcesarInformacionToolBarImportarExportar;
	protected JButton jButtonAnterioresToolBarImportarExportar;
	protected JButton jButtonSiguientesToolBarImportarExportar;
	protected JButton jButtonNuevoGuardarCambiosToolBarImportarExportar;
	protected JButton jButtonAbrirOrderByToolBarImportarExportar;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoImportarExportar;
	protected JMenuItem jMenuItemDuplicarImportarExportar;
	protected JMenuItem jMenuItemNuevoRelacionesImportarExportar;
	
	
	protected JMenuItem jMenuItemGuardarCambiosImportarExportar;
	protected JMenuItem jMenuItemCopiarImportarExportar;
	protected JMenuItem jMenuItemVerFormImportarExportar;
	protected JMenuItem jMenuItemGuardarCambiosTablaImportarExportar;
	protected JMenuItem jMenuItemCerrarImportarExportar;
	protected JMenuItem jMenuItemDetalleCerrarImportarExportar;
	protected JMenuItem jMenuItemDetalleAbrirOrderByImportarExportar;
	protected JMenuItem jMenuItemDetalleMostarOcultarImportarExportar;
	
	protected JMenuItem jMenuItemRecargarInformacionImportarExportar;
	protected JMenuItem jMenuItemProcesarInformacionImportarExportar;
	protected JMenuItem jMenuItemAnterioresImportarExportar;
	protected JMenuItem jMenuItemSiguientesImportarExportar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosImportarExportar;
	protected JMenuItem jMenuItemAbrirOrderByImportarExportar;
	protected JMenuItem jMenuItemMostrarOcultarImportarExportar;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesImportarExportar;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosImportarExportar;
	protected JCheckBox jCheckBoxSeleccionadosImportarExportar;
	
	/*
	protected JCheckBox jCheckBoxConAltoMaximoTablaImportarExportar;
	protected JCheckBox jCheckBoxConGraficoReporteImportarExportar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesImportarExportar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesImportarExportar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoImportarExportar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoImportarExportar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesImportarExportar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionImportarExportar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesImportarExportar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesImportarExportar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarImportarExportar;
	protected JTextField jTextFieldValorCampoGeneralImportarExportar;
	*/
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	/*
	
	//public JLabel jLabelColumnasSelectReporteImportarExportar;
	//public JList<Reporte> jListColumnasSelectReporteImportarExportar;
	//public JScrollPane jScrollColumnasSelectReporteImportarExportar;
	
	//public JLabel jLabelRelacionesSelectReporteImportarExportar;
	//public JList<Reporte> jListRelacionesSelectReporteImportarExportar;
	//public JScrollPane jScrollRelacionesSelectReporteImportarExportar;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoImportarExportar;
	//protected JCheckBox jCheckBoxConGraficoDinamicoImportarExportar;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoImportarExportar;
	//public JLabel jLabelTiposArchivoReporteDinamicoImportarExportar;
	
		
	//public JLabel jLabelArchivoImportacionImportarExportar;	
	//public JLabel jLabelPathArchivoImportacionImportarExportar;
	//protected JTextField jTextFieldPathArchivoImportacionImportarExportar;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoImportarExportar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoImportarExportar;
	
	//public JLabel jLabelColumnaCategoriaValorImportarExportar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorImportarExportar;
	
	//public JLabel jLabelColumnasValoresGraficoImportarExportar;
	//public JList<Reporte> jListColumnasValoresGraficoImportarExportar;
	//public JScrollPane jScrollColumnasValoresGraficoImportarExportar;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoImportarExportar;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoImportarExportar;	
	
	
	
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
	
	public JTabbedPane jTabbedPaneBusquedasImportarExportar;
	public JPanel jPanelBusquedaPorNumeroComprobanteImportarExportar;
	public JButton jButtonBusquedaPorNumeroComprobanteImportarExportar;
	public JPanel jPanelBusquedaPorRucInformanteImportarExportar;
	public JButton jButtonBusquedaPorRucInformanteImportarExportar;
	public JPanel jPanelFK_IdAsientoContableImportarExportar;
	public JButton jButtonFK_IdAsientoContableImportarExportar;
	public JPanel jPanelFK_IdClienteImportarExportar;
	public JButton jButtonFK_IdClienteImportarExportar;
	public JPanel jPanelFK_IdPeriodoImportExportImportarExportar;
	public JButton jButtonFK_IdPeriodoImportExportImportarExportar;
	public JPanel jPanelFK_IdTipoBancoImportarExportar;
	public JButton jButtonFK_IdTipoBancoImportarExportar;
	public JPanel jPanelFK_IdTipoComprobanteImportarExportar;
	public JButton jButtonFK_IdTipoComprobanteImportarExportar;
	public JPanel jPanelFK_IdTipoComprobanteBancoImportarExportar;
	public JButton jButtonFK_IdTipoComprobanteBancoImportarExportar;
	public JPanel jPanelFK_IdTipoIceImportarExportar;
	public JButton jButtonFK_IdTipoIceImportarExportar;
	public JPanel jPanelFK_IdTipoImportacionImportarExportar;
	public JButton jButtonFK_IdTipoImportacionImportarExportar;
	public JPanel jPanelFK_IdTipoIvaImportarExportar;
	public JButton jButtonFK_IdTipoIvaImportarExportar;
	public JPanel jPanelFK_IdTipoTributarioImportarExportar;
	public JButton jButtonFK_IdTipoTributarioImportarExportar;
	public JPanel jPanelFK_IdTransaccionContaImportarExportar;
	public JButton jButtonFK_IdTransaccionContaImportarExportar;
	
	public JPanel jPanelnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar;
	public JLabel jLabelnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar;
	public JTextField jTextFieldnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar;
	public JButton jButtonnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportarBusqueda= new JButtonMe();

	
	public JPanel jPanelrucBusquedaPorRucInformanteImportarExportar;
	public JLabel jLabelrucBusquedaPorRucInformanteImportarExportar;
	public JTextField jTextFieldrucBusquedaPorRucInformanteImportarExportar;
	public JButton jButtonrucBusquedaPorRucInformanteImportarExportarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableImportarExportar;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableImportarExportar;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableImportarExportar= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableImportarExportarBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableImportarExportar;
	
	public JPanel jPanelid_clienteFK_IdClienteImportarExportar;
	public JLabel jLabelid_clienteFK_IdClienteImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteImportarExportar;
	public JButton jButtonid_clienteFK_IdClienteImportarExportar= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteImportarExportarBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteImportarExportar;
	
	public JPanel jPanelid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar;
	public JLabel jLabelid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar;
	public JButton jButtonid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar= new JButtonMe();
	public JButton jButtonid_periodo_import_exportFK_IdPeriodoImportExportImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_periodo_import_exportFK_IdPeriodoImportExportImportarExportarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_bancoFK_IdTipoBancoImportarExportar;
	public JLabel jLabelid_tipo_bancoFK_IdTipoBancoImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_bancoFK_IdTipoBancoImportarExportar;
	public JButton jButtonid_tipo_bancoFK_IdTipoBancoImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_bancoFK_IdTipoBancoImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_bancoFK_IdTipoBancoImportarExportarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar;
	public JLabel jLabelid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar;
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteImportarExportarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar;
	public JLabel jLabelid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar;
	public JButton jButtonid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_iceFK_IdTipoIceImportarExportar;
	public JLabel jLabelid_tipo_iceFK_IdTipoIceImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_iceFK_IdTipoIceImportarExportar;
	public JButton jButtonid_tipo_iceFK_IdTipoIceImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_iceFK_IdTipoIceImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_iceFK_IdTipoIceImportarExportarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_importacionFK_IdTipoImportacionImportarExportar;
	public JLabel jLabelid_tipo_importacionFK_IdTipoImportacionImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_importacionFK_IdTipoImportacionImportarExportar;
	public JButton jButtonid_tipo_importacionFK_IdTipoImportacionImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_importacionFK_IdTipoImportacionImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_importacionFK_IdTipoImportacionImportarExportarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_ivaFK_IdTipoIvaImportarExportar;
	public JLabel jLabelid_tipo_ivaFK_IdTipoIvaImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ivaFK_IdTipoIvaImportarExportar;
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaImportarExportarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_tributarioFK_IdTipoTributarioImportarExportar;
	public JLabel jLabelid_tipo_tributarioFK_IdTipoTributarioImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tributarioFK_IdTipoTributarioImportarExportar;
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioImportarExportarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_contaFK_IdTransaccionContaImportarExportar;
	public JLabel jLabelid_transaccion_contaFK_IdTransaccionContaImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_contaFK_IdTransaccionContaImportarExportar;
	public JButton jButtonid_transaccion_contaFK_IdTransaccionContaImportarExportar= new JButtonMe();
	public JButton jButtonid_transaccion_contaFK_IdTransaccionContaImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_contaFK_IdTransaccionContaImportarExportarBusqueda= new JButtonMe();

	
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
	//public int iHeightFormulario=1144;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ImportarExportarJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ImportarExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportarExportarJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImportarExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportarExportarJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImportarExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportarExportarJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ImportarExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionImportarExportar)	{
		this.jButtonRecargarInformacionImportarExportar = jButtonRecargarInformacionImportarExportar;
	}
	
	public JButton getjButtonProcesarInformacionImportarExportar() {
		return this.jButtonProcesarInformacionImportarExportar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionImportarExportar)	{
		this.jButtonProcesarInformacionImportarExportar = jButtonProcesarInformacionImportarExportar;
	}
	*/
	
	public JButton getjButtonRecargarInformacionImportarExportar() {
		return new JButton();
	}
	
	
	public List<ImportarExportar> getimportarexportars() {
		return this.importarexportars;
	}

	public void setimportarexportars(List<ImportarExportar> importarexportars) {
		this.importarexportars = importarexportars;
	}
	
	public List<ImportarExportar> getimportarexportarsAux() {
		return this.importarexportarsAux;
	}

	public void setimportarexportarsAux(List<ImportarExportar> importarexportarsAux) {
		this.importarexportarsAux = importarexportarsAux;
	}
	
	public List<ImportarExportar> getimportarexportarsEliminados() {
		return this.importarexportarsEliminados;
	}

	public void setImportarExportarsEliminados(List<ImportarExportar> importarexportarsEliminados) {
		this.importarexportarsEliminados = importarexportarsEliminados;
	}
	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarImportarExportar() {
		return jComboBoxTiposSeleccionarImportarExportar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarImportarExportar(
			JComboBox jComboBoxTiposSeleccionarImportarExportar) {
		this.jComboBoxTiposSeleccionarImportarExportar = jComboBoxTiposSeleccionarImportarExportar;
	}
	
	public void setBorderResaltarTiposSeleccionarImportarExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarImportarExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarImportarExportar .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralImportarExportar() {
		return jTextFieldValorCampoGeneralImportarExportar;
	}

	public void setjTextFieldValorCampoGeneralImportarExportar(
			JTextField jTextFieldValorCampoGeneralImportarExportar) {
		this.jTextFieldValorCampoGeneralImportarExportar = jTextFieldValorCampoGeneralImportarExportar;
	}

	public void setBorderResaltarValorCampoGeneralImportarExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportarExportar.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralImportarExportar .setBorder(borderResaltar);		
	}		
	*/
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosImportarExportar() {
		return this.jCheckBoxSeleccionarTodosImportarExportar;
	}

	public void setjCheckBoxSeleccionarTodosImportarExportar(
			JCheckBox jCheckBoxSeleccionarTodosImportarExportar) {
		this.jCheckBoxSeleccionarTodosImportarExportar = jCheckBoxSeleccionarTodosImportarExportar;
	}

	public void setBorderResaltarSeleccionarTodosImportarExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarImportarExportar.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionarTodosImportarExportar .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosImportarExportar() {
		return this.jCheckBoxSeleccionadosImportarExportar;
	}

	public void setjCheckBoxSeleccionadosImportarExportar(
			JCheckBox jCheckBoxSeleccionadosImportarExportar) {
		this.jCheckBoxSeleccionadosImportarExportar = jCheckBoxSeleccionadosImportarExportar;
	}
	
	public void setBorderResaltarSeleccionadosImportarExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarImportarExportar.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionadosImportarExportar .setBorder(borderResaltar);		
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesImportarExportar() {
		return this.jComboBoxTiposArchivosReportesImportarExportar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesImportarExportar(
			JComboBox jComboBoxTiposArchivosReportesImportarExportar) {
		this.jComboBoxTiposArchivosReportesImportarExportar = jComboBoxTiposArchivosReportesImportarExportar;
	}

	public void setBorderResaltarTiposArchivosReportesImportarExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportarExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesImportarExportar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesImportarExportar() {
		return this.jComboBoxTiposReportesImportarExportar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesImportarExportar(
			JComboBox jComboBoxTiposReportesImportarExportar) {
		this.jComboBoxTiposReportesImportarExportar = jComboBoxTiposReportesImportarExportar;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoImportarExportar() {
	//	return jComboBoxTiposReportesDinamicoImportarExportar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoImportarExportar(
	//		JComboBox jComboBoxTiposReportesDinamicoImportarExportar) {
	//	this.jComboBoxTiposReportesDinamicoImportarExportar = jComboBoxTiposReportesDinamicoImportarExportar;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoImportarExportar() {
	//	return jComboBoxTiposArchivosReportesDinamicoImportarExportar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoImportarExportar(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoImportarExportar) {
	//	this.jComboBoxTiposArchivosReportesDinamicoImportarExportar = jComboBoxTiposArchivosReportesDinamicoImportarExportar;
	//}
	
	public void setBorderResaltarTiposReportesImportarExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportarExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesImportarExportar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesImportarExportar() {
		return this.jComboBoxTiposGraficosReportesImportarExportar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesImportarExportar(
			JComboBox jComboBoxTiposGraficosReportesImportarExportar) {
		this.jComboBoxTiposGraficosReportesImportarExportar = jComboBoxTiposGraficosReportesImportarExportar;
	}
	
	public void setBorderResaltarTiposGraficosReportesImportarExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportarExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesImportarExportar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionImportarExportar() {
		return this.jComboBoxTiposPaginacionImportarExportar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionImportarExportar(
			JComboBox jComboBoxTiposPaginacionImportarExportar) {
		this.jComboBoxTiposPaginacionImportarExportar = jComboBoxTiposPaginacionImportarExportar;
	}
	
	public void setBorderResaltarTiposPaginacionImportarExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportarExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionImportarExportar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesImportarExportar() {
		return this.jComboBoxTiposRelacionesImportarExportar;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesImportarExportar() {
		return this.jComboBoxTiposAccionesImportarExportar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesImportarExportar(
			JComboBox jComboBoxTiposRelacionesImportarExportar) {
		this.jComboBoxTiposRelacionesImportarExportar = jComboBoxTiposRelacionesImportarExportar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesImportarExportar(
			JComboBox jComboBoxTiposAccionesImportarExportar) {
		this.jComboBoxTiposAccionesImportarExportar = jComboBoxTiposAccionesImportarExportar;
	}
	
	public void setBorderResaltarTiposRelacionesImportarExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportarExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesImportarExportar .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesImportarExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportarExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesImportarExportar .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoImportarExportar() {
	//	return jCheckBoxConGraficoDinamicoImportarExportar;
	//}

	//public void setjCheckBoxConGraficoDinamicoImportarExportar(
	//		JCheckBox jCheckBoxConGraficoDinamicoImportarExportar) {
	//	this.jCheckBoxConGraficoDinamicoImportarExportar = jCheckBoxConGraficoDinamicoImportarExportar;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoImportarExportar() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarImportarExportar.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoImportarExportar .setBorder(borderResaltar);		
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
		this.importarexportarSessionBean=new ImportarExportarSessionBean();
		
		this.importarexportarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.importarexportarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.importarexportarSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ImportarExportarJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ImportarExportarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ImportarExportarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ImportarExportarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ImportarExportarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Importar Exportar MANTENIMIENTO"));
		
		
		if(iWidth > 3250) {
			iWidth=3250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.importarexportarSessionBean.getEsGuardarRelacionado()) {
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
		
		ImportarExportarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ImportarExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarImportarExportar= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"nuevo","nuevo","Nuevo"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"duplicar","duplicar","Duplicar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"copiar","copiar","Copiar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"ver_form","ver_form","Ver"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"recargar","recargar","Recargar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarImportarExportar,this.jTtoolBarImportarExportar,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarImportarExportar,this.jTtoolBarImportarExportar,
							"cerrar","cerrar","Salir"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarImportarExportar=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarImportarExportar;
			
				this.jButtonProcesarInformacionToolBarImportarExportar=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarImportarExportar;
				
		//protected JButton jButtonModificarToolBarImportarExportar;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	*/
	
	/*
	public void cargarMenus() {		
		this.jmenuBarImportarExportar=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuImportarExportar=new JMenuMe("General");
		this.jmenuArchivoImportarExportar=new JMenuMe("Archivo");
		this.jmenuAccionesImportarExportar=new JMenuMe("Acciones");
		this.jmenuDatosImportarExportar=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoImportarExportar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoImportarExportar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoImportarExportar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarImportarExportar= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarImportarExportar.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarImportarExportar,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesImportarExportar= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesImportarExportar.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesImportarExportar,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosImportarExportar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosImportarExportar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosImportarExportar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarImportarExportar= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarImportarExportar.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarImportarExportar,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormImportarExportar= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormImportarExportar.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormImportarExportar,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaImportarExportar= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaImportarExportar.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaImportarExportar,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarImportarExportar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarImportarExportar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarImportarExportar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionImportarExportar= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionImportarExportar.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionImportarExportar,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionImportarExportar= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionImportarExportar.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionImportarExportar,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresImportarExportar= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresImportarExportar.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresImportarExportar,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesImportarExportar= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesImportarExportar.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesImportarExportar,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByImportarExportar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByImportarExportar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByImportarExportar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarImportarExportar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarImportarExportar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarImportarExportar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByImportarExportar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByImportarExportar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByImportarExportar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarImportarExportar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarImportarExportar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarImportarExportar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosImportarExportar= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosImportarExportar.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosImportarExportar,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoImportarExportar.add(this.jMenuItemCerrarImportarExportar);
			
			this.jmenuAccionesImportarExportar.add(this.jMenuItemNuevoImportarExportar);
			this.jmenuAccionesImportarExportar.add(this.jMenuItemNuevoGuardarCambiosImportarExportar);
			this.jmenuAccionesImportarExportar.add(this.jMenuItemNuevoRelacionesImportarExportar);
			this.jmenuAccionesImportarExportar.add(this.jMenuItemGuardarCambiosTablaImportarExportar);		
			this.jmenuAccionesImportarExportar.add(this.jMenuItemDuplicarImportarExportar);		
			this.jmenuAccionesImportarExportar.add(this.jMenuItemCopiarImportarExportar);		
			this.jmenuAccionesImportarExportar.add(this.jMenuItemVerFormImportarExportar);		
			
			this.jmenuDatosImportarExportar.add(this.jMenuItemRecargarInformacionImportarExportar);				
			this.jmenuDatosImportarExportar.add(this.jMenuItemAnterioresImportarExportar);				
			this.jmenuDatosImportarExportar.add(this.jMenuItemSiguientesImportarExportar);				
			this.jmenuDatosImportarExportar.add(this.jMenuItemAbrirOrderByImportarExportar);				
			this.jmenuDatosImportarExportar.add(this.jMenuItemMostrarOcultarImportarExportar);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesImportarExportar.add(this.jMenuItemGuardarCambiosImportarExportar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarImportarExportar.add(this.jmenuArchivoImportarExportar);		
			this.jmenuBarImportarExportar.add(this.jmenuAccionesImportarExportar);		
			this.jmenuBarImportarExportar.add(this.jmenuDatosImportarExportar);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarImportarExportar);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	*/
	
	
	
	/*
	public void inicializarElementosBusquedasImportarExportar() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNumeroComprobanteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNumeroComprobanteImportarExportar.setToolTipText("Buscar Por No Comp. PreImp ");
		this.jButtonBusquedaPorNumeroComprobanteImportarExportar= new JButtonMe();
		this.jButtonBusquedaPorNumeroComprobanteImportarExportar.setText("Buscar");
		this.jButtonBusquedaPorNumeroComprobanteImportarExportar.setToolTipText("Buscar Por No Comp. PreImp ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNumeroComprobanteImportarExportar,"buscar_button","Buscar Por No Comp. PreImp ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNumeroComprobanteImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar = new JLabelMe();
		jLabelnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar.setText("No Comp. PreImp :");
		jLabelnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar.setToolTipText("No Comp. PreImp");
		jLabelnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar= new JTextFieldMe();
		jTextFieldnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorRucInformanteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorRucInformanteImportarExportar.setToolTipText("Buscar Por Ruc Informa ");
		this.jButtonBusquedaPorRucInformanteImportarExportar= new JButtonMe();
		this.jButtonBusquedaPorRucInformanteImportarExportar.setText("Buscar");
		this.jButtonBusquedaPorRucInformanteImportarExportar.setToolTipText("Buscar Por Ruc Informa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorRucInformanteImportarExportar,"buscar_button","Buscar Por Ruc Informa ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorRucInformanteImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelrucBusquedaPorRucInformanteImportarExportar = new JLabelMe();
		jLabelrucBusquedaPorRucInformanteImportarExportar.setText("Ruc Informa :");
		jLabelrucBusquedaPorRucInformanteImportarExportar.setToolTipText("Ruc Informa");
		jLabelrucBusquedaPorRucInformanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucInformanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucInformanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelrucBusquedaPorRucInformanteImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldrucBusquedaPorRucInformanteImportarExportar= new JTextFieldMe();
		jTextFieldrucBusquedaPorRucInformanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucInformanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucInformanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucBusquedaPorRucInformanteImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdAsientoContableImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableImportarExportar.setToolTipText("Buscar Por Asiento C. ");
		this.jButtonFK_IdAsientoContableImportarExportar= new JButtonMe();
		this.jButtonFK_IdAsientoContableImportarExportar.setText("Buscar");
		this.jButtonFK_IdAsientoContableImportarExportar.setToolTipText("Buscar Por Asiento C. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableImportarExportar,"buscar_button","Buscar Por Asiento C. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableImportarExportar = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableImportarExportar.setText("Asiento C. :");
		jLabelid_asiento_contableFK_IdAsientoContableImportarExportar.setToolTipText("Asiento C.");
		jLabelid_asiento_contableFK_IdAsientoContableImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableImportarExportar= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableImportarExportar= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableImportarExportar.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableImportarExportar.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableImportarExportar.setFocusable(false);

		this.jPanelFK_IdClienteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteImportarExportar.setToolTipText("Buscar Por Proveedor ");
		this.jButtonFK_IdClienteImportarExportar= new JButtonMe();
		this.jButtonFK_IdClienteImportarExportar.setText("Buscar");
		this.jButtonFK_IdClienteImportarExportar.setToolTipText("Buscar Por Proveedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteImportarExportar,"buscar_button","Buscar Por Proveedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteImportarExportar = new JLabelMe();
		jLabelid_clienteFK_IdClienteImportarExportar.setText("Proveedor :");
		jLabelid_clienteFK_IdClienteImportarExportar.setToolTipText("Proveedor");
		jLabelid_clienteFK_IdClienteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteImportarExportar= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteImportarExportar= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteImportarExportar.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteImportarExportar.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteImportarExportar.setFocusable(false);

		this.jPanelFK_IdPeriodoImportExportImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPeriodoImportExportImportarExportar.setToolTipText("Buscar Por Periodo ");
		this.jButtonFK_IdPeriodoImportExportImportarExportar= new JButtonMe();
		this.jButtonFK_IdPeriodoImportExportImportarExportar.setText("Buscar");
		this.jButtonFK_IdPeriodoImportExportImportarExportar.setToolTipText("Buscar Por Periodo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPeriodoImportExportImportarExportar,"buscar_button","Buscar Por Periodo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPeriodoImportExportImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar = new JLabelMe();
		jLabelid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar.setText("Periodo :");
		jLabelid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar.setToolTipText("Periodo");
		jLabelid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar= new JComboBoxMe();
		jComboBoxid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoBancoImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoBancoImportarExportar.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdTipoBancoImportarExportar= new JButtonMe();
		this.jButtonFK_IdTipoBancoImportarExportar.setText("Buscar");
		this.jButtonFK_IdTipoBancoImportarExportar.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoBancoImportarExportar,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoBancoImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_bancoFK_IdTipoBancoImportarExportar = new JLabelMe();
		jLabelid_tipo_bancoFK_IdTipoBancoImportarExportar.setText("Banco :");
		jLabelid_tipo_bancoFK_IdTipoBancoImportarExportar.setToolTipText("Banco");
		jLabelid_tipo_bancoFK_IdTipoBancoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_bancoFK_IdTipoBancoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_bancoFK_IdTipoBancoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_bancoFK_IdTipoBancoImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_bancoFK_IdTipoBancoImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_bancoFK_IdTipoBancoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_bancoFK_IdTipoBancoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_bancoFK_IdTipoBancoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_bancoFK_IdTipoBancoImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoComprobanteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoComprobanteImportarExportar.setToolTipText("Buscar Por Tipo Comprobante ");
		this.jButtonFK_IdTipoComprobanteImportarExportar= new JButtonMe();
		this.jButtonFK_IdTipoComprobanteImportarExportar.setText("Buscar");
		this.jButtonFK_IdTipoComprobanteImportarExportar.setToolTipText("Buscar Por Tipo Comprobante ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoComprobanteImportarExportar,"buscar_button","Buscar Por Tipo Comprobante ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoComprobanteImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar = new JLabelMe();
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar.setText("Tipo Comprobante :");
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar.setToolTipText("Tipo Comprobante");
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoComprobanteBancoImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoComprobanteBancoImportarExportar.setToolTipText("Buscar Por T. Comprob ");
		this.jButtonFK_IdTipoComprobanteBancoImportarExportar= new JButtonMe();
		this.jButtonFK_IdTipoComprobanteBancoImportarExportar.setText("Buscar");
		this.jButtonFK_IdTipoComprobanteBancoImportarExportar.setToolTipText("Buscar Por T. Comprob ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoComprobanteBancoImportarExportar,"buscar_button","Buscar Por T. Comprob ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoComprobanteBancoImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar = new JLabelMe();
		jLabelid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar.setText("T. Comprob :");
		jLabelid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar.setToolTipText("T. Comprob");
		jLabelid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoIceImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIceImportarExportar.setToolTipText("Buscar Por Codigo Ice ");
		this.jButtonFK_IdTipoIceImportarExportar= new JButtonMe();
		this.jButtonFK_IdTipoIceImportarExportar.setText("Buscar");
		this.jButtonFK_IdTipoIceImportarExportar.setToolTipText("Buscar Por Codigo Ice ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIceImportarExportar,"buscar_button","Buscar Por Codigo Ice ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIceImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_iceFK_IdTipoIceImportarExportar = new JLabelMe();
		jLabelid_tipo_iceFK_IdTipoIceImportarExportar.setText("Codigo Ice :");
		jLabelid_tipo_iceFK_IdTipoIceImportarExportar.setToolTipText("Codigo Ice");
		jLabelid_tipo_iceFK_IdTipoIceImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_iceFK_IdTipoIceImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_iceFK_IdTipoIceImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_iceFK_IdTipoIceImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_iceFK_IdTipoIceImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_iceFK_IdTipoIceImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_iceFK_IdTipoIceImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_iceFK_IdTipoIceImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_iceFK_IdTipoIceImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoImportacionImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoImportacionImportarExportar.setToolTipText("Buscar Por Tipo Importacion ");
		this.jButtonFK_IdTipoImportacionImportarExportar= new JButtonMe();
		this.jButtonFK_IdTipoImportacionImportarExportar.setText("Buscar");
		this.jButtonFK_IdTipoImportacionImportarExportar.setToolTipText("Buscar Por Tipo Importacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoImportacionImportarExportar,"buscar_button","Buscar Por Tipo Importacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoImportacionImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_importacionFK_IdTipoImportacionImportarExportar = new JLabelMe();
		jLabelid_tipo_importacionFK_IdTipoImportacionImportarExportar.setText("Tipo Importacion :");
		jLabelid_tipo_importacionFK_IdTipoImportacionImportarExportar.setToolTipText("Tipo Importacion");
		jLabelid_tipo_importacionFK_IdTipoImportacionImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_importacionFK_IdTipoImportacionImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_importacionFK_IdTipoImportacionImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_importacionFK_IdTipoImportacionImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_importacionFK_IdTipoImportacionImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_importacionFK_IdTipoImportacionImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_importacionFK_IdTipoImportacionImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_importacionFK_IdTipoImportacionImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_importacionFK_IdTipoImportacionImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoIvaImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIvaImportarExportar.setToolTipText("Buscar Por % Iva ");
		this.jButtonFK_IdTipoIvaImportarExportar= new JButtonMe();
		this.jButtonFK_IdTipoIvaImportarExportar.setText("Buscar");
		this.jButtonFK_IdTipoIvaImportarExportar.setToolTipText("Buscar Por % Iva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIvaImportarExportar,"buscar_button","Buscar Por % Iva ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIvaImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_ivaFK_IdTipoIvaImportarExportar = new JLabelMe();
		jLabelid_tipo_ivaFK_IdTipoIvaImportarExportar.setText("% Iva :");
		jLabelid_tipo_ivaFK_IdTipoIvaImportarExportar.setToolTipText("% Iva");
		jLabelid_tipo_ivaFK_IdTipoIvaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_ivaFK_IdTipoIvaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_ivaFK_IdTipoIvaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ivaFK_IdTipoIvaImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_ivaFK_IdTipoIvaImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_ivaFK_IdTipoIvaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaFK_IdTipoIvaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaFK_IdTipoIvaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ivaFK_IdTipoIvaImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTributarioImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTributarioImportarExportar.setToolTipText("Buscar Por Sustento Tribut. ");
		this.jButtonFK_IdTipoTributarioImportarExportar= new JButtonMe();
		this.jButtonFK_IdTipoTributarioImportarExportar.setText("Buscar");
		this.jButtonFK_IdTipoTributarioImportarExportar.setToolTipText("Buscar Por Sustento Tribut. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTributarioImportarExportar,"buscar_button","Buscar Por Sustento Tribut. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTributarioImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_tributarioFK_IdTipoTributarioImportarExportar = new JLabelMe();
		jLabelid_tipo_tributarioFK_IdTipoTributarioImportarExportar.setText("Sustento Tribut. :");
		jLabelid_tipo_tributarioFK_IdTipoTributarioImportarExportar.setToolTipText("Sustento Tribut.");
		jLabelid_tipo_tributarioFK_IdTipoTributarioImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_tributarioFK_IdTipoTributarioImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_tributarioFK_IdTipoTributarioImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tributarioFK_IdTipoTributarioImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_tributarioFK_IdTipoTributarioImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tributarioFK_IdTipoTributarioImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionContaImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionContaImportarExportar.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionContaImportarExportar= new JButtonMe();
		this.jButtonFK_IdTransaccionContaImportarExportar.setText("Buscar");
		this.jButtonFK_IdTransaccionContaImportarExportar.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionContaImportarExportar,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionContaImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_contaFK_IdTransaccionContaImportarExportar = new JLabelMe();
		jLabelid_transaccion_contaFK_IdTransaccionContaImportarExportar.setText("Transaccion :");
		jLabelid_transaccion_contaFK_IdTransaccionContaImportarExportar.setToolTipText("Transaccion");
		jLabelid_transaccion_contaFK_IdTransaccionContaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_contaFK_IdTransaccionContaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_contaFK_IdTransaccionContaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_contaFK_IdTransaccionContaImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_contaFK_IdTransaccionContaImportarExportar= new JComboBoxMe();
		jComboBoxid_transaccion_contaFK_IdTransaccionContaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaFK_IdTransaccionContaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaFK_IdTransaccionContaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_contaFK_IdTransaccionContaImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasImportarExportar=new JTabbedPane();


		this.jTabbedPaneBusquedasImportarExportar.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasImportarExportar.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasImportarExportar.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasImportarExportar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleImportarExportar = new ImportarExportarDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Importar Exportar DATOS");
			this.jInternalFrameDetalleFormImportarExportar = new ImportarExportarDetalleFormJInternalFrame(jDesktopPane,this.importarexportarSessionBean.getConGuardarRelaciones(),this.importarexportarSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormImportarExportar = null;//new ImportarExportarDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutImportarExportar= new GridBagLayout();
		
		
		this.jTableDatosImportarExportar = new JTableMe();      
		
		String sToolTipImportarExportar="";
		sToolTipImportarExportar=ImportarExportarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipImportarExportar+="(Contabilidad.ImportarExportar)";
		}
		
		if(!this.importarexportarSessionBean.getEsGuardarRelacionado()) {
			sToolTipImportarExportar+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosImportarExportar.setToolTipText(sToolTipImportarExportar);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosImportarExportar);
		this.jTableDatosImportarExportar.setAutoCreateRowSorter(true);
		this.jTableDatosImportarExportar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosImportarExportar.setRowSelectionAllowed(true);
		this.jTableDatosImportarExportar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosImportarExportar,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoImportarExportar = new JButtonMe();
		this.jButtonDuplicarImportarExportar = new JButtonMe();
		this.jButtonCopiarImportarExportar = new JButtonMe();
		this.jButtonVerFormImportarExportar = new JButtonMe();
		this.jButtonNuevoRelacionesImportarExportar = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaImportarExportar = new JButtonMe();
		this.jButtonCerrarImportarExportar = new JButtonMe();
		
		this.jScrollPanelDatosImportarExportar = new JScrollPane();   
        this.jScrollPanelDatosGeneralImportarExportar = new JScrollPane();
		
				
		
		
		this.jPanelAccionesImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciobancoImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocomprobanteImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Importar Exportar";
		
		if(!this.importarexportarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importar Exportars" + this.sPath));
		} else {
			this.jScrollPanelDatosImportarExportar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesImportarExportar.setToolTipText("Acciones");
        this.jPanelAccionesImportarExportar.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralImportarExportar.setName("jPanelCamposFingeneralImportarExportar");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresImportarExportar.setName("jPanelCamposFinvaloresImportarExportar");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciobancoImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Banco"));
		this.jPanelCamposIniciobancoImportarExportar.setName("jPanelCamposFinbancoImportarExportar");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciobancoImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocomprobanteImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Comprobante"));
		this.jPanelCamposIniciocomprobanteImportarExportar.setName("jPanelCamposFincomprobanteImportarExportar");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocomprobanteImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			/*
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoImportarExportar=new ReporteDinamicoJInternalFrame(ImportarExportarConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoImportarExportar();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionImportarExportar=new ImportacionJInternalFrame(ImportarExportarConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionImportarExportar();
			
			*/		
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		/*
		this.jButtonAbrirOrderByImportarExportar = new JButtonMe();
		
		this.jButtonAbrirOrderByImportarExportar.setText("Orden");
		this.jButtonAbrirOrderByImportarExportar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByImportarExportar,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByImportarExportar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImportarExportar,false,this);
			
			//this.cargarOrderByImportarExportar(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByImportarExportar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImportarExportar,true,this);
			
			//this.cargarOrderByImportarExportar(true);
		}				
		*/
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosImportarExportar.setMinimumSize(new Dimension(400,50));//3230
		this.jTableDatosImportarExportar.setMaximumSize(new Dimension(400,50));//3230
		this.jTableDatosImportarExportar.setPreferredSize(new Dimension(400,50));//3230
		
		this.jScrollPanelDatosImportarExportar.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosImportarExportar.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosImportarExportar.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoImportarExportar.setText("Nuevo");
		this.jButtonDuplicarImportarExportar.setText("Duplicar");
		this.jButtonCopiarImportarExportar.setText("Copiar");
		this.jButtonVerFormImportarExportar.setText("Ver");
		this.jButtonNuevoRelacionesImportarExportar.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaImportarExportar.setText("Guardar");
		this.jButtonCerrarImportarExportar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoImportarExportar,"nuevo_button","Nuevo",this.importarexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarImportarExportar,"duplicar_button","Duplicar",this.importarexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarImportarExportar,"copiar_button","Copiar",this.importarexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormImportarExportar,"ver_form","Ver",this.importarexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesImportarExportar,"nuevorelaciones_button","Nuevo Rel",this.importarexportarSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaImportarExportar,"guardarcambiostabla_button","Guardar",this.importarexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportarExportar,"cerrar_button","Salir",this.importarexportarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoImportarExportar.setToolTipText("Nuevo"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarImportarExportar.setToolTipText("Duplicar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarImportarExportar.setToolTipText("Copiar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormImportarExportar.setToolTipText("Ver"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesImportarExportar.setToolTipText("Nuevo Rel"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaImportarExportar.setToolTipText("Guardar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarImportarExportar.setToolTipText("Salir"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoImportarExportar";
		inputMap = this.jButtonNuevoImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoImportarExportar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoImportarExportar"));
		
		//DUPLICAR
		sMapKey = "DuplicarImportarExportar";
		inputMap = this.jButtonDuplicarImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarImportarExportar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarImportarExportar"));
		
		//COPIAR
		sMapKey = "CopiarImportarExportar";
		inputMap = this.jButtonCopiarImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarImportarExportar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarImportarExportar"));
		
		//VEr FORM
		sMapKey = "VerFormImportarExportar";
		inputMap = this.jButtonVerFormImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormImportarExportar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormImportarExportar"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesImportarExportar";
		inputMap = this.jButtonNuevoRelacionesImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesImportarExportar"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarImportarExportar";
		inputMap = this.jButtonModificarImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarImportarExportar"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarImportarExportar";
		inputMap = this.jButtonCerrarImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarImportarExportar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaImportarExportar";
		inputMap = this.jButtonGuardarCambiosTablaImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaImportarExportar"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		/*
		this.jPanelParametrosAuxiliar1ImportarExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ImportarExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ImportarExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ImportarExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ImportarExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		*/
		
		this.jPanelParametrosReportesImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesImportarExportar.setName("jPanelParametrosReportesImportarExportar"); 
		
		this.jPanelParametrosReportesAccionesImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesImportarExportar.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesImportarExportar.setName("jPanelParametrosReportesAccionesImportarExportar"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
	
		/*
		this.jButtonRecargarInformacionImportarExportar = new JButtonMe();
		this.jButtonRecargarInformacionImportarExportar.setText("Recargar");
		this.jButtonRecargarInformacionImportarExportar.setToolTipText("Recargar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionImportarExportar,"recargar_button","Recargar");		
		*/
		
		
		/*
		this.jButtonProcesarInformacionImportarExportar = new JButtonMe();
		this.jButtonProcesarInformacionImportarExportar.setText("Procesar");
		this.jButtonProcesarInformacionImportarExportar.setToolTipText("Procesar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionImportarExportar.setVisible(false);
			
		this.jButtonProcesarInformacionImportarExportar.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionImportarExportar.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionImportarExportar.setPreferredSize(new Dimension(185,25));		
		*/
		
		
		
		
		
		/*	
		this.jComboBoxTiposArchivosReportesImportarExportar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImportarExportar.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesImportarExportar.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesImportarExportar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImportarExportar.setText("TIPO");       
		this.jComboBoxTiposReportesImportarExportar.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesImportarExportar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImportarExportar.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesImportarExportar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionImportarExportar = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionImportarExportar.setText("Paginacion");
		this.jComboBoxTiposPaginacionImportarExportar.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesImportarExportar = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesImportarExportar.setText("Accion");
		this.jComboBoxTiposRelacionesImportarExportar.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesImportarExportar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesImportarExportar.setText("Accion");
		this.jComboBoxTiposAccionesImportarExportar.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarImportarExportar = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarImportarExportar.setText("Accion");
		this.jComboBoxTiposSeleccionarImportarExportar.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralImportarExportar=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralImportarExportar.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralImportarExportar.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralImportarExportar.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		*/

	
		this.jLabelAccionesImportarExportar = new JLabelMe();
		
		this.jLabelAccionesImportarExportar.setText("Acciones");		
		this.jLabelAccionesImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosImportarExportar = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosImportarExportar.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosImportarExportar.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosImportarExportar = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosImportarExportar.setText("Seleccionados");
		this.jCheckBoxSeleccionadosImportarExportar.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		/*
		this.jCheckBoxConAltoMaximoTablaImportarExportar = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaImportarExportar.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaImportarExportar.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteImportarExportar = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteImportarExportar.setText("Graf.");
		this.jCheckBoxConGraficoReporteImportarExportar.setToolTipText("Con Grafico");						
		*/
		
        this.jButtonAnterioresImportarExportar = new JButtonMe();
		//this.jButtonAnterioresImportarExportar.setText("<<");
        this.jButtonAnterioresImportarExportar.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresImportarExportar,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesImportarExportar = new JButtonMe();
		//this.jButtonSiguientesImportarExportar.setText(">>");
        this.jButtonSiguientesImportarExportar.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesImportarExportar,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosImportarExportar = new JButtonMe();
		this.jButtonNuevoGuardarCambiosImportarExportar.setText("Nue");
        this.jButtonNuevoGuardarCambiosImportarExportar.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosImportarExportar,"nuevoguardarcambios_button","Nue",this.importarexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosImportarExportar";
		inputMap = this.jButtonNuevoGuardarCambiosImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosImportarExportar"));
		
		//RECARGAR		
		/*
		sMapKey = "RecargarInformacionImportarExportar";
		inputMap = this.jButtonRecargarInformacionImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionImportarExportar"));		
		*/
		
		//SIGUIENTES		
		sMapKey = "SiguientesImportarExportar";
		inputMap = this.jButtonSiguientesImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesImportarExportar"));
		
		//ANTERIORES		
		sMapKey = "AnterioresImportarExportar";
		inputMap = this.jButtonAnterioresImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresImportarExportar"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			/*
			this.inicializarElementosBusquedasImportarExportar();			
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
		this.jTabbedPaneRelacionesImportarExportar.setMinimumSize(new Dimension(this.getWidth(),ImportarExportarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImportarExportarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesImportarExportar.setMaximumSize(new Dimension(this.getWidth(),ImportarExportarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImportarExportarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesImportarExportar.setPreferredSize(new Dimension(this.getWidth(),ImportarExportarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImportarExportarBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionImportarExportar = new GridBagLayout();

			this.jPanelPaginacionImportarExportar.setLayout(gridaBagLayoutPaginacionImportarExportar);						
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = 0;
			this.gridBagConstraintsImportarExportar.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionImportarExportar.add(this.jButtonAnterioresImportarExportar, this.gridBagConstraintsImportarExportar);
					
						
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsImportarExportar.gridy = 0;
			
			this.jPanelPaginacionImportarExportar.add(this.jButtonNuevoGuardarCambiosImportarExportar, this.gridBagConstraintsImportarExportar);
						
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsImportarExportar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsImportarExportar.gridy = 0;
			this.jPanelPaginacionImportarExportar.add(this.jButtonSiguientesImportarExportar, this.gridBagConstraintsImportarExportar);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = 1;
			this.gridBagConstraintsImportarExportar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImportarExportar.add(this.jButtonNuevoImportarExportar, this.gridBagConstraintsImportarExportar);
						
			
			
			if(!this.importarexportarSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsImportarExportar = new GridBagConstraints();
				this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsImportarExportar.gridy = 1;
				this.gridBagConstraintsImportarExportar.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionImportarExportar.add(this.jButtonGuardarCambiosTablaImportarExportar, this.gridBagConstraintsImportarExportar);
			}
			
			
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = 1;
			this.gridBagConstraintsImportarExportar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImportarExportar.add(this.jButtonDuplicarImportarExportar, this.gridBagConstraintsImportarExportar);
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = 1;
			this.gridBagConstraintsImportarExportar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImportarExportar.add(this.jButtonCopiarImportarExportar, this.gridBagConstraintsImportarExportar);
		
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = 1;
			this.gridBagConstraintsImportarExportar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImportarExportar.add(this.jButtonVerFormImportarExportar, this.gridBagConstraintsImportarExportar);
		
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = 1;
			this.gridBagConstraintsImportarExportar.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionImportarExportar.add(this.jButtonCerrarImportarExportar, this.gridBagConstraintsImportarExportar);
		
		
		/*
		this.jButtonRecargarInformacionImportarExportar.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionImportarExportar.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionImportarExportar.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		
				
		/*
		this.jComboBoxTiposArchivosReportesImportarExportar.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesImportarExportar.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesImportarExportar.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesImportarExportar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesImportarExportar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesImportarExportar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesImportarExportar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesImportarExportar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesImportarExportar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionImportarExportar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionImportarExportar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionImportarExportar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesImportarExportar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesImportarExportar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesImportarExportar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesImportarExportar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImportarExportar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImportarExportar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarImportarExportar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarImportarExportar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarImportarExportar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaImportarExportar.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaImportarExportar.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaImportarExportar.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteImportarExportar.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteImportarExportar.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteImportarExportar.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		this.jCheckBoxSeleccionarTodosImportarExportar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosImportarExportar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosImportarExportar.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosImportarExportar.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosImportarExportar.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosImportarExportar.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesImportarExportar = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesImportarExportar = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ImportarExportar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ImportarExportar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ImportarExportar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ImportarExportar = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesImportarExportar.setLayout(gridaBagParametrosReportesImportarExportar);
			this.jPanelParametrosReportesAccionesImportarExportar.setLayout(gridaBagParametrosReportesAccionesImportarExportar);
			
			/*
			this.jPanelParametrosAuxiliar1ImportarExportar.setLayout(gridaBagParametrosAuxiliar1ImportarExportar);
			this.jPanelParametrosAuxiliar2ImportarExportar.setLayout(gridaBagParametrosAuxiliar2ImportarExportar);
			this.jPanelParametrosAuxiliar3ImportarExportar.setLayout(gridaBagParametrosAuxiliar3ImportarExportar);
			this.jPanelParametrosAuxiliar4ImportarExportar.setLayout(gridaBagParametrosAuxiliar4ImportarExportar);
			//this.jPanelParametrosAuxiliar5ImportarExportar.setLayout(gridaBagParametrosAuxiliar2ImportarExportar);			
			*/
			
			
			/*
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImportarExportar.add(this.jButtonRecargarInformacionImportarExportar, this.gridBagConstraintsImportarExportar);			
			*/
			

			
			/*
			//PAGINACION
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ImportarExportar.add(this.jComboBoxTiposPaginacionImportarExportar, this.gridBagConstraintsImportarExportar);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ImportarExportar.add(this.jCheckBoxConAltoMaximoTablaImportarExportar, this.gridBagConstraintsImportarExportar);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ImportarExportar.add(this.jComboBoxTiposArchivosReportesImportarExportar, this.gridBagConstraintsImportarExportar);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImportarExportar.add(this.jPanelParametrosAuxiliar1ImportarExportar, this.gridBagConstraintsImportarExportar);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImportarExportar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ImportarExportar.add(this.jComboBoxTiposReportesImportarExportar, this.gridBagConstraintsImportarExportar);																		
			*/
			
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImportarExportar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ImportarExportar.add(this.jComboBoxTiposGraficosReportesImportarExportar, this.gridBagConstraintsImportarExportar);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			/*
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImportarExportar.add(this.jPanelParametrosAuxiliar4ImportarExportar, this.gridBagConstraintsImportarExportar);						
			*/
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImportarExportar.add(this.jComboBoxTiposReportesImportarExportar, this.gridBagConstraintsImportarExportar);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImportarExportar.add(this.jCheckBoxGenerarReporteImportarExportar, this.gridBagConstraintsImportarExportar);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			/*
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImportarExportar.add(this.jPanelParametrosAuxiliar2ImportarExportar, this.gridBagConstraintsImportarExportar);						
			*/
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImportarExportar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImportarExportar.add(this.jLabelAccionesImportarExportar, this.gridBagConstraintsImportarExportar);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				/*
				this.gridBagConstraintsImportarExportar = new GridBagConstraints();
				this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesImportarExportar.add(this.jButtonAbrirOrderByImportarExportar, this.gridBagConstraintsImportarExportar);						
				*/				
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			/*
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImportarExportar.add(this.jComboBoxTiposSeleccionarImportarExportar, this.gridBagConstraintsImportarExportar);			
			*/
			
			/*
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImportarExportar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImportarExportar.add(this.jCheckBoxSeleccionarTodosImportarExportar, this.gridBagConstraintsImportarExportar);
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImportarExportar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImportarExportar.add(this.jCheckBoxConGraficoReporteImportarExportar, this.gridBagConstraintsImportarExportar);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			/*
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImportarExportar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ImportarExportar.add(this.jCheckBoxSeleccionarTodosImportarExportar, this.gridBagConstraintsImportarExportar);															
				
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImportarExportar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ImportarExportar.add(this.jCheckBoxSeleccionadosImportarExportar, this.gridBagConstraintsImportarExportar);															
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImportarExportar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ImportarExportar.add(this.jCheckBoxConGraficoReporteImportarExportar, this.gridBagConstraintsImportarExportar);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImportarExportar.add(this.jPanelParametrosAuxiliar3ImportarExportar, this.gridBagConstraintsImportarExportar);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImportarExportar.add(this.jComboBoxTiposAccionesImportarExportar, this.gridBagConstraintsImportarExportar);
	
				
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportarExportar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImportarExportar.add(this.jTextFieldValorCampoGeneralImportarExportar, this.gridBagConstraintsImportarExportar);			
			
			*/
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralImportarExportar= new GridBagLayout();
		this.jPanelCamposIniciogeneralImportarExportar.setLayout(gridaBagLayoutCamposIniciogeneralImportarExportar);

		GridBagLayout gridaBagLayoutCamposIniciovaloresImportarExportar= new GridBagLayout();
		this.jPanelCamposIniciovaloresImportarExportar.setLayout(gridaBagLayoutCamposIniciovaloresImportarExportar);

		GridBagLayout gridaBagLayoutCamposIniciobancoImportarExportar= new GridBagLayout();
		this.jPanelCamposIniciobancoImportarExportar.setLayout(gridaBagLayoutCamposIniciobancoImportarExportar);

		GridBagLayout gridaBagLayoutCamposIniciocomprobanteImportarExportar= new GridBagLayout();
		this.jPanelCamposIniciocomprobanteImportarExportar.setLayout(gridaBagLayoutCamposIniciocomprobanteImportarExportar);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosImportarExportar = new GridBagLayout();

			this.jScrollPanelDatosImportarExportar.setLayout(gridaBagLayoutDatosImportarExportar);
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = 0;
			this.gridBagConstraintsImportarExportar.gridx = 0;
			
			this.jScrollPanelDatosImportarExportar.add(this.jTableDatosImportarExportar, this.gridBagConstraintsImportarExportar);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosImportarExportar.setViewportView(this.jTableDatosImportarExportar);
		this.jTableDatosImportarExportar.setFillsViewportHeight(true);
		this.jTableDatosImportarExportar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesImportarExportar= new GridBagLayout();
		this.jPanelAccionesImportarExportar.setLayout(gridaBagLayoutAccionesImportarExportar);
		
		
		/*	
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 0;
			
		this.jPanelAccionesImportarExportar.add(this.jButtonNuevoImportarExportar, this.gridBagConstraintsImportarExportar);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			/*
			
		GridBagLayout gridaBagLayoutBusquedaPorNumeroComprobanteImportarExportar= new GridBagLayout();
		gridaBagLayoutBusquedaPorNumeroComprobanteImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroComprobanteImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroComprobanteImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNumeroComprobanteImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNumeroComprobanteImportarExportar.setLayout(gridaBagLayoutBusquedaPorNumeroComprobanteImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelBusquedaPorNumeroComprobanteImportarExportar.add(jLabelnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelBusquedaPorNumeroComprobanteImportarExportar.add(jTextFieldnumero_comprobanteBusquedaPorNumeroComprobanteImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelBusquedaPorNumeroComprobanteImportarExportar.add(jButtonBusquedaPorNumeroComprobanteImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("1.-Por No Comp. PreImp ", jPanelBusquedaPorNumeroComprobanteImportarExportar);
		jTabbedPaneBusquedasImportarExportar.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorRucInformanteImportarExportar= new GridBagLayout();
		gridaBagLayoutBusquedaPorRucInformanteImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorRucInformanteImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorRucInformanteImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorRucInformanteImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorRucInformanteImportarExportar.setLayout(gridaBagLayoutBusquedaPorRucInformanteImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelBusquedaPorRucInformanteImportarExportar.add(jLabelrucBusquedaPorRucInformanteImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelBusquedaPorRucInformanteImportarExportar.add(jTextFieldrucBusquedaPorRucInformanteImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelBusquedaPorRucInformanteImportarExportar.add(jButtonBusquedaPorRucInformanteImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("2.-Por Ruc Informa ", jPanelBusquedaPorRucInformanteImportarExportar);
		jTabbedPaneBusquedasImportarExportar.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdAsientoContableImportarExportar= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableImportarExportar.setLayout(gridaBagLayoutFK_IdAsientoContableImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdAsientoContableImportarExportar.add(jLabelid_asiento_contableFK_IdAsientoContableImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelFK_IdAsientoContableImportarExportar.add(jComboBoxid_asiento_contableFK_IdAsientoContableImportarExportar, gridBagConstraintsImportarExportar);


		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.EAST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdAsientoContableImportarExportar.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelFK_IdAsientoContableImportarExportar.add(jButtonFK_IdAsientoContableImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("3.-Por Asiento C. ", jPanelFK_IdAsientoContableImportarExportar);
		jTabbedPaneBusquedasImportarExportar.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdClienteImportarExportar= new GridBagLayout();
		gridaBagLayoutFK_IdClienteImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteImportarExportar.setLayout(gridaBagLayoutFK_IdClienteImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdClienteImportarExportar.add(jLabelid_clienteFK_IdClienteImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelFK_IdClienteImportarExportar.add(jComboBoxid_clienteFK_IdClienteImportarExportar, gridBagConstraintsImportarExportar);


		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.EAST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdClienteImportarExportar.add(this.jButtonBuscarFK_IdClienteid_clienteImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelFK_IdClienteImportarExportar.add(jButtonFK_IdClienteImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("4.-Por Proveedor ", jPanelFK_IdClienteImportarExportar);
		jTabbedPaneBusquedasImportarExportar.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdPeriodoImportExportImportarExportar= new GridBagLayout();
		gridaBagLayoutFK_IdPeriodoImportExportImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPeriodoImportExportImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPeriodoImportExportImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPeriodoImportExportImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPeriodoImportExportImportarExportar.setLayout(gridaBagLayoutFK_IdPeriodoImportExportImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdPeriodoImportExportImportarExportar.add(jLabelid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelFK_IdPeriodoImportExportImportarExportar.add(jComboBoxid_periodo_import_exportFK_IdPeriodoImportExportImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelFK_IdPeriodoImportExportImportarExportar.add(jButtonFK_IdPeriodoImportExportImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("5.-Por Periodo ", jPanelFK_IdPeriodoImportExportImportarExportar);
		jTabbedPaneBusquedasImportarExportar.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoBancoImportarExportar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoBancoImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoBancoImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoBancoImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoBancoImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoBancoImportarExportar.setLayout(gridaBagLayoutFK_IdTipoBancoImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdTipoBancoImportarExportar.add(jLabelid_tipo_bancoFK_IdTipoBancoImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelFK_IdTipoBancoImportarExportar.add(jComboBoxid_tipo_bancoFK_IdTipoBancoImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelFK_IdTipoBancoImportarExportar.add(jButtonFK_IdTipoBancoImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("6.-Por Banco ", jPanelFK_IdTipoBancoImportarExportar);
		jTabbedPaneBusquedasImportarExportar.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoComprobanteImportarExportar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoComprobanteImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoComprobanteImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoComprobanteImportarExportar.setLayout(gridaBagLayoutFK_IdTipoComprobanteImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdTipoComprobanteImportarExportar.add(jLabelid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelFK_IdTipoComprobanteImportarExportar.add(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelFK_IdTipoComprobanteImportarExportar.add(jButtonFK_IdTipoComprobanteImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("7.-Por Tipo Comprobante ", jPanelFK_IdTipoComprobanteImportarExportar);
		jTabbedPaneBusquedasImportarExportar.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoComprobanteBancoImportarExportar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoComprobanteBancoImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteBancoImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteBancoImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoComprobanteBancoImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoComprobanteBancoImportarExportar.setLayout(gridaBagLayoutFK_IdTipoComprobanteBancoImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdTipoComprobanteBancoImportarExportar.add(jLabelid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelFK_IdTipoComprobanteBancoImportarExportar.add(jComboBoxid_tipo_comprobante_bancoFK_IdTipoComprobanteBancoImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelFK_IdTipoComprobanteBancoImportarExportar.add(jButtonFK_IdTipoComprobanteBancoImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("8.-Por T. Comprob ", jPanelFK_IdTipoComprobanteBancoImportarExportar);
		jTabbedPaneBusquedasImportarExportar.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoIceImportarExportar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoIceImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoIceImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoIceImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoIceImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoIceImportarExportar.setLayout(gridaBagLayoutFK_IdTipoIceImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdTipoIceImportarExportar.add(jLabelid_tipo_iceFK_IdTipoIceImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelFK_IdTipoIceImportarExportar.add(jComboBoxid_tipo_iceFK_IdTipoIceImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelFK_IdTipoIceImportarExportar.add(jButtonFK_IdTipoIceImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("9.-Por Codigo Ice ", jPanelFK_IdTipoIceImportarExportar);
		jTabbedPaneBusquedasImportarExportar.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoImportacionImportarExportar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoImportacionImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoImportacionImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoImportacionImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoImportacionImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoImportacionImportarExportar.setLayout(gridaBagLayoutFK_IdTipoImportacionImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdTipoImportacionImportarExportar.add(jLabelid_tipo_importacionFK_IdTipoImportacionImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelFK_IdTipoImportacionImportarExportar.add(jComboBoxid_tipo_importacionFK_IdTipoImportacionImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelFK_IdTipoImportacionImportarExportar.add(jButtonFK_IdTipoImportacionImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("10.-Por Tipo Importacion ", jPanelFK_IdTipoImportacionImportarExportar);

		GridBagLayout gridaBagLayoutFK_IdTipoIvaImportarExportar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoIvaImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoIvaImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoIvaImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoIvaImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoIvaImportarExportar.setLayout(gridaBagLayoutFK_IdTipoIvaImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdTipoIvaImportarExportar.add(jLabelid_tipo_ivaFK_IdTipoIvaImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelFK_IdTipoIvaImportarExportar.add(jComboBoxid_tipo_ivaFK_IdTipoIvaImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelFK_IdTipoIvaImportarExportar.add(jButtonFK_IdTipoIvaImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("11.-Por % Iva ", jPanelFK_IdTipoIvaImportarExportar);

		GridBagLayout gridaBagLayoutFK_IdTipoTributarioImportarExportar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTributarioImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTributarioImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTributarioImportarExportar.setLayout(gridaBagLayoutFK_IdTipoTributarioImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdTipoTributarioImportarExportar.add(jLabelid_tipo_tributarioFK_IdTipoTributarioImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelFK_IdTipoTributarioImportarExportar.add(jComboBoxid_tipo_tributarioFK_IdTipoTributarioImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelFK_IdTipoTributarioImportarExportar.add(jButtonFK_IdTipoTributarioImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("12.-Por Sustento Tribut. ", jPanelFK_IdTipoTributarioImportarExportar);

		GridBagLayout gridaBagLayoutFK_IdTransaccionContaImportarExportar= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionContaImportarExportar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionContaImportarExportar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionContaImportarExportar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionContaImportarExportar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionContaImportarExportar.setLayout(gridaBagLayoutFK_IdTransaccionContaImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 0;
		jPanelFK_IdTransaccionContaImportarExportar.add(jLabelid_transaccion_contaFK_IdTransaccionContaImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 0;
		gridBagConstraintsImportarExportar.gridx = 1;
		jPanelFK_IdTransaccionContaImportarExportar.add(jComboBoxid_transaccion_contaFK_IdTransaccionContaImportarExportar, gridBagConstraintsImportarExportar);

		gridBagConstraintsImportarExportar = new GridBagConstraints();
		gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImportarExportar.gridy = 1;
		gridBagConstraintsImportarExportar.gridx =1;
		jPanelFK_IdTransaccionContaImportarExportar.add(jButtonFK_IdTransaccionContaImportarExportar, gridBagConstraintsImportarExportar);

		jTabbedPaneBusquedasImportarExportar.addTab("13.-Por Transaccion ", jPanelFK_IdTransaccionContaImportarExportar);

			*/		
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutImportarExportar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutImportarExportar);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.importarexportarSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();						
			this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsImportarExportar.gridx = 0;		
			//this.gridBagConstraintsImportarExportar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsImportarExportar.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarImportarExportar, this.gridBagConstraintsImportarExportar);												
			*/
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;
		this.gridBagConstraintsImportarExportar.gridx = 0;		
		//this.gridBagConstraintsImportarExportar.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsImportarExportar.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsImportarExportar);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsImportarExportar.gridx = 0;		
			this.gridBagConstraintsImportarExportar.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsImportarExportar.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				/*
				this.jContentPane.add(this.jTabbedPaneBusquedasImportarExportar, this.gridBagConstraintsImportarExportar);				
				*/
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportarExportar.gridx = 0;
		
		/*
		this.jContentPane.add(this.jPanelParametrosReportesImportarExportar, this.gridBagConstraintsImportarExportar);								
		*/
		
		/*
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportarExportar.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesImportarExportar, this.gridBagConstraintsImportarExportar);
		*/		
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsImportarExportar.gridx =0;
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsImportarExportar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosImportarExportar, this.gridBagConstraintsImportarExportar);
				
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportarExportar.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionImportarExportar, this.gridBagConstraintsImportarExportar);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ImportarExportarJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosImportarExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosImportarExportar = new GridBagLayout();
			this.jPanelBusquedasParametrosImportarExportar.setLayout(gridaBagLayoutBusquedasParametrosImportarExportar);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralImportarExportar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralImportarExportar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImportarExportar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImportarExportar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportarExportar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposImportarExportar, this.gridBagConstraintsImportarExportar);
			
			
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportarExportar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosImportarExportar, this.gridBagConstraintsImportarExportar);
		
			
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsImportarExportar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesImportarExportar, this.gridBagConstraintsImportarExportar);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralImportarExportar;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoImportarExportar() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoImportarExportar = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoImportarExportar.setName("jPanelReporteDinamicoImportarExportar"); 
		
		this.jPanelReporteDinamicoImportarExportar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoImportarExportar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoImportarExportar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoImportarExportar.setLayout(gridaBagLayoutReporteDinamicoImportarExportar);
		
		
		this.jInternalFrameReporteDinamicoImportarExportar= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoImportarExportar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteImportarExportar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoImportarExportar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoImportarExportar.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoImportarExportar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoImportarExportar.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoImportarExportar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoImportarExportar.setResizable(true);
	    this.jInternalFrameReporteDinamicoImportarExportar.setClosable(true);
	    this.jInternalFrameReporteDinamicoImportarExportar.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoImportarExportar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoImportarExportar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoImportarExportar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importar Exportars"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteImportarExportar = new JLabelMe();

		this.jLabelColumnasSelectReporteImportarExportar.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoImportarExportar.add(this.jLabelColumnasSelectReporteImportarExportar, this.gridBagConstraintsImportarExportar);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteImportarExportar = new JList<Reporte>();
		this.jListColumnasSelectReporteImportarExportar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteImportarExportar.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteImportarExportar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteImportarExportar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteImportarExportar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteImportarExportar=new JScrollPane(this.jListColumnasSelectReporteImportarExportar);
			
			this.jScrollColumnasSelectReporteImportarExportar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteImportarExportar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteImportarExportar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoImportarExportar.add(this.jListColumnasSelectReporteImportarExportar, this.gridBagConstraintsImportarExportar);
		this.jPanelReporteDinamicoImportarExportar.add(this.jScrollColumnasSelectReporteImportarExportar, this.gridBagConstraintsImportarExportar);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteImportarExportar = new JLabelMe();

		this.jLabelRelacionesSelectReporteImportarExportar.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteImportarExportar = new JList<Reporte>();
		this.jListRelacionesSelectReporteImportarExportar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteImportarExportar.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteImportarExportar.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteImportarExportar.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteImportarExportar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteImportarExportar=new JScrollPane(this.jListRelacionesSelectReporteImportarExportar);
			
			this.jScrollRelacionesSelectReporteImportarExportar.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteImportarExportar.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteImportarExportar.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoImportarExportar = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoImportarExportar = new JComboBoxMe();
		this.jListColumnasValoresGraficoImportarExportar = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoImportarExportar = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoImportarExportar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoImportarExportar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoImportarExportar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoImportarExportar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoImportarExportar = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoImportarExportar.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoImportarExportar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoImportarExportar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoImportarExportar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoImportarExportar = new JLabelMe();

		this.jLabelConGraficoDinamicoImportarExportar.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoImportarExportar.add(this.jLabelConGraficoDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoImportarExportar = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoImportarExportar.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoImportarExportar.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoImportarExportar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoImportarExportar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoImportarExportar.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImportarExportar.add(this.jCheckBoxConGraficoDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoImportarExportar = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoImportarExportar.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoImportarExportar.add(this.jLabelColumnaCategoriaGraficoImportarExportar, this.gridBagConstraintsImportarExportar);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoImportarExportar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoImportarExportar.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoImportarExportar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoImportarExportar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoImportarExportar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoImportarExportar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoImportarExportar.add(this.jComboBoxColumnaCategoriaGraficoImportarExportar, this.gridBagConstraintsImportarExportar);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorImportarExportar = new JLabelMe();

		this.jLabelColumnaCategoriaValorImportarExportar.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImportarExportar.add(this.jLabelColumnaCategoriaValorImportarExportar, this.gridBagConstraintsImportarExportar);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorImportarExportar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorImportarExportar.setText("Accion");
        this.jComboBoxColumnaCategoriaValorImportarExportar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorImportarExportar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorImportarExportar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorImportarExportar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoImportarExportar.add(this.jComboBoxColumnaCategoriaValorImportarExportar, this.gridBagConstraintsImportarExportar);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoImportarExportar = new JLabelMe();

		this.jLabelColumnasValoresGraficoImportarExportar.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImportarExportar.add(this.jLabelColumnasValoresGraficoImportarExportar, this.gridBagConstraintsImportarExportar);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoImportarExportar = new JList<Reporte>();
		this.jListColumnasValoresGraficoImportarExportar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoImportarExportar.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoImportarExportar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoImportarExportar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoImportarExportar.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoImportarExportar=new JScrollPane(this.jListColumnasValoresGraficoImportarExportar);
			
			this.jScrollColumnasValoresGraficoImportarExportar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoImportarExportar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoImportarExportar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoImportarExportar.add(this.jListColumnasSelectReporteImportarExportar, this.gridBagConstraintsImportarExportar);
		this.jPanelReporteDinamicoImportarExportar.add(this.jScrollColumnasValoresGraficoImportarExportar, this.gridBagConstraintsImportarExportar);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoImportarExportar = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoImportarExportar.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImportarExportar.add(this.jLabelTiposGraficosReportesDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoImportarExportar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoImportarExportar.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoImportarExportar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoImportarExportar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoImportarExportar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoImportarExportar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImportarExportar.add(this.jComboBoxTiposGraficosReportesDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoImportarExportar = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoImportarExportar.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImportarExportar.add(this.jLabelGenerarExcelReporteDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoImportarExportar = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoImportarExportar.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoImportarExportar,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoImportarExportar.setToolTipText("Generar EXCEL"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoImportarExportar.add(this.jButtonGenerarExcelReporteDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImportarExportar.add(this.jComboBoxTiposReportesDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoImportarExportar = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoImportarExportar.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImportarExportar.add(this.jLabelTiposArchivoReporteDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImportarExportar.add(this.jComboBoxTiposArchivosReportesDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoImportarExportar = new JButtonMe();
		this.jButtonGenerarReporteDinamicoImportarExportar.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoImportarExportar,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoImportarExportar.setToolTipText("Generar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImportarExportar.add(this.jButtonGenerarReporteDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoImportarExportar = new JButtonMe();
		this.jButtonCerrarReporteDinamicoImportarExportar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoImportarExportar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoImportarExportar.setToolTipText("Cancelar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImportarExportar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImportarExportar.add(this.jButtonCerrarReporteDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalImportarExportar = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoImportarExportar= new JScrollPane(jPanelReporteDinamicoImportarExportar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoImportarExportar.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoImportarExportar.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoImportarExportar.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importar Exportars"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsImportarExportar.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoImportarExportar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoImportarExportar.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalImportarExportar);
		this.jInternalFrameReporteDinamicoImportarExportar.getContentPane().add(this.jScrollPanelReporteDinamicoImportarExportar, this.gridBagConstraintsImportarExportar);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionImportarExportar() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionImportarExportar = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionImportarExportar.setName("jPanelImportacionImportarExportar"); 
		
		this.jPanelImportacionImportarExportar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionImportarExportar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionImportarExportar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionImportarExportar.setLayout(gridaBagLayoutImportacionImportarExportar);
		
		
		this.jInternalFrameImportacionImportarExportar= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionImportarExportar= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionImportarExportar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteImportarExportar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionImportarExportar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionImportarExportar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionImportarExportar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionImportarExportar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionImportarExportar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionImportarExportar.setResizable(true);
	    this.jInternalFrameImportacionImportarExportar.setClosable(true);
	    this.jInternalFrameImportacionImportarExportar.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionImportarExportar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionImportarExportar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionImportarExportar.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionImportarExportar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionImportarExportar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionImportarExportar.setResizable(true);
	    this.jInternalFrameImportacionImportarExportar.setClosable(true);
	    this.jInternalFrameImportacionImportarExportar.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionImportarExportar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionImportarExportar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionImportarExportar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importar Exportars"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionImportarExportar = new JLabelMe();

		this.jLabelArchivoImportacionImportarExportar.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYImportacion;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionImportarExportar.add(this.jLabelArchivoImportacionImportarExportar, this.gridBagConstraintsImportarExportar);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionImportarExportar = new JFileChooser();		
		this.jFileChooserImportacionImportarExportar.setToolTipText("ESCOGER ARCHIVO"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionImportarExportar = new JButtonMe();
		this.jButtonAbrirImportacionImportarExportar.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionImportarExportar,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionImportarExportar.setToolTipText("Generar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYImportacion;
		this.gridBagConstraintsImportarExportar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImportarExportar.add(this.jButtonAbrirImportacionImportarExportar, this.gridBagConstraintsImportarExportar);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionImportarExportar = new JLabelMe();

		this.jLabelPathArchivoImportacionImportarExportar.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYImportacion;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionImportarExportar.add(this.jLabelPathArchivoImportacionImportarExportar, this.gridBagConstraintsImportarExportar);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionImportarExportar=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionImportarExportar.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionImportarExportar.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionImportarExportar.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYImportacion;
		this.gridBagConstraintsImportarExportar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImportarExportar.add(this.jTextFieldPathArchivoImportacionImportarExportar, this.gridBagConstraintsImportarExportar);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionImportarExportar = new JButtonMe();
		this.jButtonGenerarImportacionImportarExportar.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionImportarExportar,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionImportarExportar.setToolTipText("Generar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYImportacion;
		this.gridBagConstraintsImportarExportar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImportarExportar.add(this.jButtonGenerarImportacionImportarExportar, this.gridBagConstraintsImportarExportar);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionImportarExportar = new JButtonMe();
		this.jButtonCerrarImportacionImportarExportar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionImportarExportar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionImportarExportar.setToolTipText("Cancelar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.gridy = iPosYImportacion;
		this.gridBagConstraintsImportarExportar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImportarExportar.add(this.jButtonCerrarImportacionImportarExportar, this.gridBagConstraintsImportarExportar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalImportarExportar = new GridBagLayout();
		
		this.jScrollPanelImportacionImportarExportar= new JScrollPane(jPanelImportacionImportarExportar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy =iPosYImportacion;
		this.gridBagConstraintsImportarExportar.gridx =iPosXImportacion;
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionImportarExportar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionImportarExportar.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalImportarExportar);
		this.jInternalFrameImportacionImportarExportar.getContentPane().add(this.jScrollPanelImportacionImportarExportar, this.gridBagConstraintsImportarExportar);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByImportarExportar(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByImportarExportar = new JButtonMe();
			this.jButtonAbrirOrderByImportarExportar.setText("Orden");
			this.jButtonAbrirOrderByImportarExportar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByImportarExportar,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByImportarExportar";
			inputMap = this.jButtonAbrirOrderByImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByImportarExportar"));
		
		
			GridBagLayout gridaBagLayoutOrderByImportarExportar = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByImportarExportar.setName("jPanelOrderByImportarExportar"); 
			
			this.jPanelOrderByImportarExportar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByImportarExportar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByImportarExportar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByImportarExportar.setLayout(gridaBagLayoutOrderByImportarExportar);
			
			
			this.jTableDatosImportarExportarOrderBy = new JTableMe();        
			this.jTableDatosImportarExportarOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosImportarExportarOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosImportarExportarOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosImportarExportarOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosImportarExportarOrderBy.setViewportView(this.jTableDatosImportarExportarOrderBy);
			this.jTableDatosImportarExportarOrderBy.setFillsViewportHeight(true);
			this.jTableDatosImportarExportarOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByImportarExportar= new OrderByJInternalFrame();
			this.jInternalFrameOrderByImportarExportar= new OrderByJInternalFrame();
			this.jScrollPanelOrderByImportarExportar = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteImportarExportar= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByImportarExportar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByImportarExportar.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByImportarExportar.setTitle("Orden");
			this.jInternalFrameOrderByImportarExportar.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByImportarExportar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByImportarExportar.setResizable(true);
			this.jInternalFrameOrderByImportarExportar.setClosable(true);
			this.jInternalFrameOrderByImportarExportar.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByImportarExportar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByImportarExportar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByImportarExportar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importar Exportars"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.gridy =iPosYOrderBy++;
			this.gridBagConstraintsImportarExportar.gridx =iPosXOrderBy;
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsImportarExportar.ipady =150;
				
			this.jPanelOrderByImportarExportar.add(jScrollPanelDatosImportarExportarOrderBy, this.gridBagConstraintsImportarExportar);//this.jTableDatosImportarExportarTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByImportarExportar = new JButtonMe();
			this.jButtonCerrarOrderByImportarExportar.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByImportarExportar,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByImportarExportar.setToolTipText("Cancelar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.gridy = iPosYOrderBy++;
			this.gridBagConstraintsImportarExportar.gridx = iPosXOrderBy;
									
			this.jPanelOrderByImportarExportar.add(this.jButtonCerrarOrderByImportarExportar, this.gridBagConstraintsImportarExportar);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalImportarExportar = new GridBagLayout();
			
			this.jScrollPanelOrderByImportarExportar= new JScrollPane(jPanelOrderByImportarExportar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.gridy =iPosYOrderBy;
			this.gridBagConstraintsImportarExportar.gridx =iPosXOrderBy;
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByImportarExportar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByImportarExportar.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalImportarExportar);
			
			this.jInternalFrameOrderByImportarExportar.getContentPane().add(this.jScrollPanelOrderByImportarExportar, this.gridBagConstraintsImportarExportar);			
		
		} else {
			this.jButtonAbrirOrderByImportarExportar = new JButtonMe();
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
			&& this.importarexportarSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosImportarExportar.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosImportarExportar.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosImportarExportar.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosImportarExportar.getRowHeight();//ImportarExportarConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.importarexportarSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ImportarExportarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaImportarExportar.isSelected()) {
					iHeightTable=ImportarExportarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < ImportarExportarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ImportarExportarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ImportarExportarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaImportarExportar.isSelected()) {
					iHeightTable=ImportarExportarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < ImportarExportarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ImportarExportarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosImportarExportar.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosImportarExportar.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosImportarExportar.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosImportarExportar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosImportarExportar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosImportarExportar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
		/*								
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByImportarExportar!=null && this.jInternalFrameOrderByImportarExportar.getjTableDatosOrderBy()!=null) {
			//if(!this.importarexportarSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByImportarExportar.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByImportarExportar.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByImportarExportar.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByImportarExportar.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByImportarExportar.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByImportarExportar.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByImportarExportar.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		*/

		//ORDER BY
		
		//this.jScrollPanelDatosImportarExportar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosImportarExportar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosImportarExportar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=importarexportarLogic.getImportarExportars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=importarexportars.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ImportarExportar> TraerImportarExportarBeans(List<ImportarExportar> importarexportars,ArrayList<Classe> classes)throws Exception {
		try {
			for(ImportarExportar importarexportar:importarexportars) {
					
				if(!(ImportarExportarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ImportarExportarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					importarexportar.setsDetalleGeneralEntityReporte(ImportarExportarConstantesFunciones.getImportarExportarDescripcion(importarexportar));
										
					importarexportar.setes_juridico_descripcion(ImportarExportarConstantesFunciones.getes_juridicoDescripcion(importarexportar));importarexportar.setcon_convenio_descripcion(ImportarExportarConstantesFunciones.getcon_convenioDescripcion(importarexportar));importarexportar.setcon_devolucion_descripcion(ImportarExportarConstantesFunciones.getcon_devolucionDescripcion(importarexportar));	
					
						
					
				} else  {
							
					//importarexportar.setsDetalleGeneralEntityReporte(importarexportar.getsDetalleGeneralEntityReporte());
										
				}
				
				//importarexportarbeans.add(importarexportarbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return importarexportars;
    }
	//PARA REPORTES FIN
}
