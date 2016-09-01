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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.seguridad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.report.*;
import com.bydan.erp.seguridad.util.report.ProcesoCambiarParametroGeneralConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.report.*;
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
public class ProcesoCambiarParametroGeneralJInternalFrame extends ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoCambiarParametroGeneral;
	
	protected JMenuBar jmenuBarProcesoCambiarParametroGeneral;
	
	protected JMenu jmenuProcesoCambiarParametroGeneral;
	protected JMenu jmenuDatosProcesoCambiarParametroGeneral;
	protected JMenu jmenuArchivoProcesoCambiarParametroGeneral;
	protected JMenu jmenuAccionesProcesoCambiarParametroGeneral;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCambiarParametroGeneral;	
	protected GridBagConstraints gridBagConstraintsProcesoCambiarParametroGeneral;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoCambiarParametroGeneralDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoCambiarParametroGeneral;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoCambiarParametroGeneral;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoVisualBeanSwingJInternalFrame tipovisualBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovisual="";

	protected TipoFondoBeanSwingJInternalFrame tipofondoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondo="";

	protected TipoFondoBeanSwingJInternalFrame tipofondobordeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondoborde="";

	protected TipoFondoControlBeanSwingJInternalFrame tipofondocontrolBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondocontrol="";

	protected TipoTamanioControlBeanSwingJInternalFrame tipotamaniocontrolBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotamaniocontrol="";

	protected TipoExportarBeanSwingJInternalFrame tipoexportarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoexportar="";

	protected TipoDelimiterBeanSwingJInternalFrame tipodelimiterBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodelimiter="";
	
	public ProcesoCambiarParametroGeneralSessionBean procesocambiarparametrogeneralSessionBean;
		
	
	
	public TipoVisualSessionBean tipovisualSessionBean;
	public TipoFondoSessionBean tipofondoSessionBean;
	public TipoFondoSessionBean tipofondobordeSessionBean;
	public TipoFondoControlSessionBean tipofondocontrolSessionBean;
	public TipoTamanioControlSessionBean tipotamaniocontrolSessionBean;
	public TipoExportarSessionBean tipoexportarSessionBean;
	public TipoDelimiterSessionBean tipodelimiterSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoCambiarParametroGeneral> procesocambiarparametrogenerals;		
	public List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsEliminados;	
	public List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoCambiarParametroGeneral;		
	protected JButton jButtonAbrirOrderByProcesoCambiarParametroGeneral;
	
	
	//protected JPanel jPanelOrderByProcesoCambiarParametroGeneral;
	//public JScrollPane jScrollPanelOrderByProcesoCambiarParametroGeneral;	
	//protected JButton jButtonCerrarOrderByProcesoCambiarParametroGeneral;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoCambiarParametroGeneralLogic procesocambiarparametrogeneralLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoCambiarParametroGeneral;
	public JScrollPane jScrollPanelDatosEdicionProcesoCambiarParametroGeneral;
	public JScrollPane jScrollPanelDatosGeneralProcesoCambiarParametroGeneral;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoCambiarParametroGeneralOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral;
	//public JScrollPane jScrollPanelImportacionProcesoCambiarParametroGeneral;
	
	
	
	protected JPanel jPanelAccionesProcesoCambiarParametroGeneral;
	
    protected JPanel jPanelPaginacionProcesoCambiarParametroGeneral;
    protected JPanel jPanelParametrosReportesProcesoCambiarParametroGeneral;
	protected JPanel jPanelParametrosReportesAccionesProcesoCambiarParametroGeneral;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoCambiarParametroGeneral;
	protected JPanel jPanelParametrosAuxiliar2ProcesoCambiarParametroGeneral;
	protected JPanel jPanelParametrosAuxiliar3ProcesoCambiarParametroGeneral;
	protected JPanel jPanelParametrosAuxiliar4ProcesoCambiarParametroGeneral;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoCambiarParametroGeneral;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoCambiarParametroGeneral;
	//protected JPanel jPanelImportacionProcesoCambiarParametroGeneral;
	
	
	public JTable jTableDatosProcesoCambiarParametroGeneral;
	
	
	
	//public JTable jTableDatosProcesoCambiarParametroGeneralOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoCambiarParametroGeneral;
	protected JButton jButtonDuplicarProcesoCambiarParametroGeneral;
	protected JButton jButtonCopiarProcesoCambiarParametroGeneral;
	protected JButton jButtonVerFormProcesoCambiarParametroGeneral;
	protected JButton jButtonNuevoRelacionesProcesoCambiarParametroGeneral;
	protected JButton jButtonModificarProcesoCambiarParametroGeneral;
	
    protected JButton jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral;
	protected JButton jButtonCerrarProcesoCambiarParametroGeneral;
	
	
	protected JButton jButtonRecargarInformacionProcesoCambiarParametroGeneral;
	protected JButton jButtonProcesarInformacionProcesoCambiarParametroGeneral;
	
	
	protected JButton jButtonAnterioresProcesoCambiarParametroGeneral;
	protected JButton jButtonSiguientesProcesoCambiarParametroGeneral;
	protected JButton jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoCambiarParametroGeneral;
	//protected JButton jButtonCerrarReporteDinamicoProcesoCambiarParametroGeneral;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoCambiarParametroGeneral;
	//protected JButton jButtonGenerarImportacionProcesoCambiarParametroGeneral;
	//protected JButton jButtonCerrarImportacionProcesoCambiarParametroGeneral;
	//protected JFileChooser jFileChooserImportacionProcesoCambiarParametroGeneral;
	//protected File fileImportacionProcesoCambiarParametroGeneral;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonDuplicarToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonNuevoRelacionesToolBarProcesoCambiarParametroGeneral;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonCopiarToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonVerFormToolBarProcesoCambiarParametroGeneral;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonCerrarToolBarProcesoCambiarParametroGeneral;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonProcesarInformacionToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonAnterioresToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonSiguientesToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonAbrirOrderByToolBarProcesoCambiarParametroGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemDuplicarProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoCambiarParametroGeneral;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemCopiarProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemVerFormProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemCerrarProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemProcesarInformacionProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemAnterioresProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemSiguientesProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemAbrirOrderByProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCambiarParametroGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCambiarParametroGeneral;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral;
	protected JCheckBox jCheckBoxSeleccionadosProcesoCambiarParametroGeneral;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoCambiarParametroGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral;
	protected JTextField jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoCambiarParametroGeneral;
	//public JList<Reporte> jListColumnasSelectReporteProcesoCambiarParametroGeneral;
	//public JScrollPane jScrollColumnasSelectReporteProcesoCambiarParametroGeneral;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoCambiarParametroGeneral;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoCambiarParametroGeneral;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoCambiarParametroGeneral;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoCambiarParametroGeneral;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoCambiarParametroGeneral;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoCambiarParametroGeneral;
	
		
	//public JLabel jLabelArchivoImportacionProcesoCambiarParametroGeneral;	
	//public JLabel jLabelPathArchivoImportacionProcesoCambiarParametroGeneral;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoCambiarParametroGeneral;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoCambiarParametroGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoCambiarParametroGeneral;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoCambiarParametroGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoCambiarParametroGeneral;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoCambiarParametroGeneral;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoCambiarParametroGeneral;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoCambiarParametroGeneral;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoCambiarParametroGeneral;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoCambiarParametroGeneral;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoCambiarParametroGeneral;
	public JPanel jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtonBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	
	public JPanel jPanelid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JLabel jLabelcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JCheckBox jCheckBoxcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtoncon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JLabel jLabelcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JCheckBox jCheckBoxcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtoncon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JLabel jLabelcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JCheckBox jCheckBoxcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtoncon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelpath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JLabel jLabelpath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JTextArea jTextAreapath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral;
	public JButton jButtonpath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public ProcesoCambiarParametroGeneralJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoCambiarParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarParametroGeneralJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarParametroGeneralJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarParametroGeneralJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCambiarParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoCambiarParametroGeneral)	{
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral = jButtonRecargarInformacionProcesoCambiarParametroGeneral;
	}
	
	public JButton getjButtonProcesarInformacionProcesoCambiarParametroGeneral() {
		return this.jButtonProcesarInformacionProcesoCambiarParametroGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCambiarParametroGeneral)	{
		this.jButtonProcesarInformacionProcesoCambiarParametroGeneral = jButtonProcesarInformacionProcesoCambiarParametroGeneral;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoCambiarParametroGeneral() {
		return this.jButtonRecargarInformacionProcesoCambiarParametroGeneral;
	}
	
	
	public List<ProcesoCambiarParametroGeneral> getprocesocambiarparametrogenerals() {
		return this.procesocambiarparametrogenerals;
	}

	public void setprocesocambiarparametrogenerals(List<ProcesoCambiarParametroGeneral> procesocambiarparametrogenerals) {
		this.procesocambiarparametrogenerals = procesocambiarparametrogenerals;
	}
	
	public List<ProcesoCambiarParametroGeneral> getprocesocambiarparametrogeneralsAux() {
		return this.procesocambiarparametrogeneralsAux;
	}

	public void setprocesocambiarparametrogeneralsAux(List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsAux) {
		this.procesocambiarparametrogeneralsAux = procesocambiarparametrogeneralsAux;
	}
	
	public List<ProcesoCambiarParametroGeneral> getprocesocambiarparametrogeneralsEliminados() {
		return this.procesocambiarparametrogeneralsEliminados;
	}

	public void setProcesoCambiarParametroGeneralsEliminados(List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsEliminados) {
		this.procesocambiarparametrogeneralsEliminados = procesocambiarparametrogeneralsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoCambiarParametroGeneral() {
		return jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoCambiarParametroGeneral(
			JComboBox jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral) {
		this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral = jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoCambiarParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoCambiarParametroGeneral() {
		return jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral;
	}

	public void setjTextFieldValorCampoGeneralProcesoCambiarParametroGeneral(
			JTextField jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral) {
		this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral = jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral;
	}

	public void setBorderResaltarValorCampoGeneralProcesoCambiarParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral() {
		return this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral;
	}

	public void setjCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral(
			JCheckBox jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral) {
		this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral = jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral;
	}

	public void setBorderResaltarSeleccionarTodosProcesoCambiarParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoCambiarParametroGeneral() {
		return this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral;
	}

	public void setjCheckBoxSeleccionadosProcesoCambiarParametroGeneral(
			JCheckBox jCheckBoxSeleccionadosProcesoCambiarParametroGeneral) {
		this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral = jCheckBoxSeleccionadosProcesoCambiarParametroGeneral;
	}
	
	public void setBorderResaltarSeleccionadosProcesoCambiarParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral() {
		return this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral(
			JComboBox jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral) {
		this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral = jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoCambiarParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoCambiarParametroGeneral() {
		return this.jComboBoxTiposReportesProcesoCambiarParametroGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoCambiarParametroGeneral(
			JComboBox jComboBoxTiposReportesProcesoCambiarParametroGeneral) {
		this.jComboBoxTiposReportesProcesoCambiarParametroGeneral = jComboBoxTiposReportesProcesoCambiarParametroGeneral;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral() {
	//	return jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral) {
	//	this.jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral = jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral = jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral;
	//}
	
	public void setBorderResaltarTiposReportesProcesoCambiarParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoCambiarParametroGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral() {
		return this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral(
			JComboBox jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral) {
		this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral = jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoCambiarParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoCambiarParametroGeneral() {
		return this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoCambiarParametroGeneral(
			JComboBox jComboBoxTiposPaginacionProcesoCambiarParametroGeneral) {
		this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral = jComboBoxTiposPaginacionProcesoCambiarParametroGeneral;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoCambiarParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoCambiarParametroGeneral() {
		return this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCambiarParametroGeneral() {
		return this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCambiarParametroGeneral(
			JComboBox jComboBoxTiposRelacionesProcesoCambiarParametroGeneral) {
		this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral = jComboBoxTiposRelacionesProcesoCambiarParametroGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCambiarParametroGeneral(
			JComboBox jComboBoxTiposAccionesProcesoCambiarParametroGeneral) {
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral = jComboBoxTiposAccionesProcesoCambiarParametroGeneral;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoCambiarParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoCambiarParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoCambiarParametroGeneral() {
	//	return jCheckBoxConGraficoDinamicoProcesoCambiarParametroGeneral;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoCambiarParametroGeneral(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoCambiarParametroGeneral) {
	//	this.jCheckBoxConGraficoDinamicoProcesoCambiarParametroGeneral = jCheckBoxConGraficoDinamicoProcesoCambiarParametroGeneral;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoCambiarParametroGeneral() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoCambiarParametroGeneral .setBorder(borderResaltar);		
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
		this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
		
		this.procesocambiarparametrogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocambiarparametrogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoCambiarParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoCambiarParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCambiarParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCambiarParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCambiarParametroGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cambiar Parametro General MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoCambiarParametroGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoCambiarParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoCambiarParametroGeneral= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"nuevo","nuevo","Nuevo"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"duplicar","duplicar","Duplicar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"copiar","copiar","Copiar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"ver_form","ver_form","Ver"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"recargar","recargar","Procesar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,
							"cerrar","cerrar","Salir"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoCambiarParametroGeneral=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoCambiarParametroGeneral;
			
				this.jButtonProcesarInformacionToolBarProcesoCambiarParametroGeneral=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoCambiarParametroGeneral;
				
		//protected JButton jButtonModificarToolBarProcesoCambiarParametroGeneral;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoCambiarParametroGeneral=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoCambiarParametroGeneral=new JMenuMe("General");
		this.jmenuArchivoProcesoCambiarParametroGeneral=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoCambiarParametroGeneral=new JMenuMe("Acciones");
		this.jmenuDatosProcesoCambiarParametroGeneral=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCambiarParametroGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCambiarParametroGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCambiarParametroGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoCambiarParametroGeneral= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoCambiarParametroGeneral.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoCambiarParametroGeneral,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoCambiarParametroGeneral= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoCambiarParametroGeneral.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoCambiarParametroGeneral,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoCambiarParametroGeneral= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoCambiarParametroGeneral.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoCambiarParametroGeneral,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoCambiarParametroGeneral= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoCambiarParametroGeneral.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoCambiarParametroGeneral,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCambiarParametroGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCambiarParametroGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCambiarParametroGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoCambiarParametroGeneral= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoCambiarParametroGeneral.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoCambiarParametroGeneral,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoCambiarParametroGeneral= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoCambiarParametroGeneral.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoCambiarParametroGeneral,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoCambiarParametroGeneral= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoCambiarParametroGeneral.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoCambiarParametroGeneral,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoCambiarParametroGeneral= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoCambiarParametroGeneral.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoCambiarParametroGeneral,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoCambiarParametroGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoCambiarParametroGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoCambiarParametroGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarParametroGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarParametroGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoCambiarParametroGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoCambiarParametroGeneral.add(this.jMenuItemCerrarProcesoCambiarParametroGeneral);
			
			this.jmenuAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemNuevoProcesoCambiarParametroGeneral);
			this.jmenuAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral);
			this.jmenuAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemNuevoRelacionesProcesoCambiarParametroGeneral);
			this.jmenuAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral);		
			this.jmenuAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemDuplicarProcesoCambiarParametroGeneral);		
			this.jmenuAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemCopiarProcesoCambiarParametroGeneral);		
			this.jmenuAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemVerFormProcesoCambiarParametroGeneral);		
			
			this.jmenuDatosProcesoCambiarParametroGeneral.add(this.jMenuItemRecargarInformacionProcesoCambiarParametroGeneral);				
			this.jmenuDatosProcesoCambiarParametroGeneral.add(this.jMenuItemAnterioresProcesoCambiarParametroGeneral);				
			this.jmenuDatosProcesoCambiarParametroGeneral.add(this.jMenuItemSiguientesProcesoCambiarParametroGeneral);				
			this.jmenuDatosProcesoCambiarParametroGeneral.add(this.jMenuItemAbrirOrderByProcesoCambiarParametroGeneral);				
			this.jmenuDatosProcesoCambiarParametroGeneral.add(this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoCambiarParametroGeneral.add(this.jmenuArchivoProcesoCambiarParametroGeneral);		
			this.jmenuBarProcesoCambiarParametroGeneral.add(this.jmenuAccionesProcesoCambiarParametroGeneral);		
			this.jmenuBarProcesoCambiarParametroGeneral.add(this.jmenuDatosProcesoCambiarParametroGeneral);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoCambiarParametroGeneral);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoCambiarParametroGeneral() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Procesar Proceso Cambiar Parametro General");
		this.jButtonBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JButtonMe();
		this.jButtonBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Procesar");
		this.jButtonBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Procesar Proceso Cambiar Parametro General");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,"buscar_button","Procesar Proceso Cambiar Parametro General");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Tipo Visual :");
		jLabelid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Tipo Visual");
		jLabelid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Con Mensaje Confirmacion :");
		jLabelcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Con Mensaje Confirmacion");
		jLabelcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JCheckBoxMe();
		jCheckBoxcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Con Botones Tool Bar :");
		jLabelcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Con Botones Tool Bar");
		jLabelcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JCheckBoxMe();
		jCheckBoxcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Tipo Fondo :");
		jLabelid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Tipo Fondo");
		jLabelid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Tipo Fondo Borde :");
		jLabelid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Tipo Fondo Borde");
		jLabelid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Tipo Fondo Control :");
		jLabelid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Tipo Fondo Control");
		jLabelid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Tipo Tamanio Control :");
		jLabelid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Tipo Tamanio Control");
		jLabelid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Tipo Exportar :");
		jLabelid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Tipo Exportar");
		jLabelid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Tipo Delimiter :");
		jLabelid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Tipo Delimiter");
		jLabelid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Con Exportar Cabecera :");
		jLabelcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Con Exportar Cabecera");
		jLabelcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JCheckBoxMe();
		jCheckBoxcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelpath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelpath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText("Path Exportar :");
		jLabelpath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setToolTipText("Path Exportar");
		jLabelpath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelpath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelpath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelpath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreapath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new JTextAreaMe();
		jTextAreapath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreapath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,250)));
		this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,250)));
		this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,250)));

		//this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Cambiar Parametro General"));
		this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoCambiarParametroGeneral = new ProcesoCambiarParametroGeneralDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Cambiar Parametro General DATOS");
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral = new ProcesoCambiarParametroGeneralDetalleFormJInternalFrame(jDesktopPane,this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones(),this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral = null;//new ProcesoCambiarParametroGeneralDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCambiarParametroGeneral= new GridBagLayout();
		
		
		this.jTableDatosProcesoCambiarParametroGeneral = new JTableMe();      
		
		String sToolTipProcesoCambiarParametroGeneral="";
		sToolTipProcesoCambiarParametroGeneral=ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCambiarParametroGeneral+="(Seguridad.ProcesoCambiarParametroGeneral)";
		}
		
		if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCambiarParametroGeneral+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoCambiarParametroGeneral.setToolTipText(sToolTipProcesoCambiarParametroGeneral);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoCambiarParametroGeneral);
		this.jTableDatosProcesoCambiarParametroGeneral.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoCambiarParametroGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionAllowed(true);
		this.jTableDatosProcesoCambiarParametroGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonDuplicarProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonCopiarProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonVerFormProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonCerrarProcesoCambiarParametroGeneral = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCambiarParametroGeneral = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cambiar Parametro General";
		
		if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Parametro Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCambiarParametroGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCambiarParametroGeneral.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCambiarParametroGeneral.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral=new ReporteDinamicoJInternalFrame(ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoCambiarParametroGeneral();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoCambiarParametroGeneral=new ImportacionJInternalFrame(ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoCambiarParametroGeneral();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoCambiarParametroGeneral = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.setText("Orden");
		this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCambiarParametroGeneral,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCambiarParametroGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarParametroGeneral,false,this);
			
			//this.cargarOrderByProcesoCambiarParametroGeneral(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCambiarParametroGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarParametroGeneral,true,this);
			
			//this.cargarOrderByProcesoCambiarParametroGeneral(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoCambiarParametroGeneral.setText("Nuevo");
		this.jButtonDuplicarProcesoCambiarParametroGeneral.setText("Duplicar");
		this.jButtonCopiarProcesoCambiarParametroGeneral.setText("Copiar");
		this.jButtonVerFormProcesoCambiarParametroGeneral.setText("Ver");
		this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.setText("Guardar");
		this.jButtonCerrarProcesoCambiarParametroGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCambiarParametroGeneral,"nuevo_button","Nuevo",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoCambiarParametroGeneral,"duplicar_button","Duplicar",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoCambiarParametroGeneral,"copiar_button","Copiar",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoCambiarParametroGeneral,"ver_form","Ver",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral,"nuevorelaciones_button","Nuevo Rel",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral,"guardarcambiostabla_button","Guardar",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCambiarParametroGeneral,"cerrar_button","Salir",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoCambiarParametroGeneral.setToolTipText("Nuevo"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoCambiarParametroGeneral.setToolTipText("Duplicar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoCambiarParametroGeneral.setToolTipText("Copiar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoCambiarParametroGeneral.setToolTipText("Ver"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.setToolTipText("Nuevo Rel"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.setToolTipText("Guardar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCambiarParametroGeneral.setToolTipText("Salir"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCambiarParametroGeneral";
		inputMap = this.jButtonNuevoProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCambiarParametroGeneral"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonDuplicarProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoCambiarParametroGeneral"));
		
		//COPIAR
		sMapKey = "CopiarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonCopiarProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoCambiarParametroGeneral"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoCambiarParametroGeneral";
		inputMap = this.jButtonVerFormProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoCambiarParametroGeneral"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoCambiarParametroGeneral";
		inputMap = this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoCambiarParametroGeneral"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonModificarProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoCambiarParametroGeneral"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonCerrarProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCambiarParametroGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCambiarParametroGeneral";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCambiarParametroGeneral"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoCambiarParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoCambiarParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoCambiarParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoCambiarParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoCambiarParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setName("jPanelParametrosReportesProcesoCambiarParametroGeneral"); 
		
		this.jPanelParametrosReportesAccionesProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoCambiarParametroGeneral.setName("jPanelParametrosReportesAccionesProcesoCambiarParametroGeneral"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.setText("Procesar");
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.setToolTipText("Procesar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoCambiarParametroGeneral,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonProcesarInformacionProcesoCambiarParametroGeneral.setText("Procesar");
		this.jButtonProcesarInformacionProcesoCambiarParametroGeneral.setToolTipText("Procesar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoCambiarParametroGeneral.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoCambiarParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoCambiarParametroGeneral.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoCambiarParametroGeneral = new JLabelMe();
		
		this.jLabelAccionesProcesoCambiarParametroGeneral.setText("Acciones");		
		this.jLabelAccionesProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoCambiarParametroGeneral = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoCambiarParametroGeneral.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoCambiarParametroGeneral.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoCambiarParametroGeneral = new JButtonMe();
		//this.jButtonAnterioresProcesoCambiarParametroGeneral.setText("<<");
        this.jButtonAnterioresProcesoCambiarParametroGeneral.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoCambiarParametroGeneral,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoCambiarParametroGeneral = new JButtonMe();
		//this.jButtonSiguientesProcesoCambiarParametroGeneral.setText(">>");
        this.jButtonSiguientesProcesoCambiarParametroGeneral.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoCambiarParametroGeneral,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral,"nuevoguardarcambios_button","Nue",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoCambiarParametroGeneral";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoCambiarParametroGeneral"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoCambiarParametroGeneral";
		inputMap = this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoCambiarParametroGeneral"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoCambiarParametroGeneral";
		inputMap = this.jButtonSiguientesProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoCambiarParametroGeneral"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoCambiarParametroGeneral";
		inputMap = this.jButtonAnterioresProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoCambiarParametroGeneral"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoCambiarParametroGeneral();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(this.getWidth(),ProcesoCambiarParametroGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCambiarParametroGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(this.getWidth(),ProcesoCambiarParametroGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCambiarParametroGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(this.getWidth(),ProcesoCambiarParametroGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCambiarParametroGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoCambiarParametroGeneral = new GridBagLayout();

			this.jPanelPaginacionProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutPaginacionProcesoCambiarParametroGeneral);						
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCambiarParametroGeneral.add(this.jButtonAnterioresProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
					
						
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
			
			this.jPanelPaginacionProcesoCambiarParametroGeneral.add(this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
						
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
			this.jPanelPaginacionProcesoCambiarParametroGeneral.add(this.jButtonSiguientesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 1;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarParametroGeneral.add(this.jButtonNuevoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
						
			
			
			if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
				this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 1;
				this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoCambiarParametroGeneral.add(this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			}
			
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 1;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCambiarParametroGeneral.add(this.jButtonProcesarInformacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 1;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarParametroGeneral.add(this.jButtonDuplicarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 1;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarParametroGeneral.add(this.jButtonCopiarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 1;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarParametroGeneral.add(this.jButtonVerFormProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 1;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoCambiarParametroGeneral.add(this.jButtonCerrarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		
		
		
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoCambiarParametroGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoCambiarParametroGeneral = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoCambiarParametroGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoCambiarParametroGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoCambiarParametroGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoCambiarParametroGeneral = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setLayout(gridaBagParametrosReportesProcesoCambiarParametroGeneral);
			this.jPanelParametrosReportesAccionesProcesoCambiarParametroGeneral.setLayout(gridaBagParametrosReportesAccionesProcesoCambiarParametroGeneral);
			
			
			this.jPanelParametrosAuxiliar1ProcesoCambiarParametroGeneral.setLayout(gridaBagParametrosAuxiliar1ProcesoCambiarParametroGeneral);
			this.jPanelParametrosAuxiliar2ProcesoCambiarParametroGeneral.setLayout(gridaBagParametrosAuxiliar2ProcesoCambiarParametroGeneral);
			this.jPanelParametrosAuxiliar3ProcesoCambiarParametroGeneral.setLayout(gridaBagParametrosAuxiliar3ProcesoCambiarParametroGeneral);
			this.jPanelParametrosAuxiliar4ProcesoCambiarParametroGeneral.setLayout(gridaBagParametrosAuxiliar4ProcesoCambiarParametroGeneral);
			//this.jPanelParametrosAuxiliar5ProcesoCambiarParametroGeneral.setLayout(gridaBagParametrosAuxiliar2ProcesoCambiarParametroGeneral);			
			
			
			
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.add(this.jButtonRecargarInformacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCambiarParametroGeneral.add(this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCambiarParametroGeneral.add(this.jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCambiarParametroGeneral.add(this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.add(this.jPanelParametrosAuxiliar1ProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoCambiarParametroGeneral.add(this.jComboBoxTiposReportesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.add(this.jPanelParametrosAuxiliar4ProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.add(this.jComboBoxTiposReportesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.add(this.jCheckBoxGenerarReporteProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.add(this.jPanelParametrosAuxiliar2ProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.add(this.jLabelAccionesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.add(this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);			
			
			
			/*
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.add(this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCambiarParametroGeneral.add(this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);															
				
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCambiarParametroGeneral.add(this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.add(this.jPanelParametrosAuxiliar3ProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.add(this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoCambiarParametroGeneral = new GridBagLayout();

			this.jScrollPanelDatosProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutDatosProcesoCambiarParametroGeneral);
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
			
			this.jScrollPanelDatosProcesoCambiarParametroGeneral.add(this.jTableDatosProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoCambiarParametroGeneral.setViewportView(this.jTableDatosProcesoCambiarParametroGeneral);
		this.jTableDatosProcesoCambiarParametroGeneral.setFillsViewportHeight(true);
		this.jTableDatosProcesoCambiarParametroGeneral.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCambiarParametroGeneral= new GridBagLayout();
		this.jPanelAccionesProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutAccionesProcesoCambiarParametroGeneral);
		
		
		/*	
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
			
		this.jPanelAccionesProcesoCambiarParametroGeneral.add(this.jButtonNuevoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jLabelid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);


		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 1;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jLabelcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 1;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jCheckBoxcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);


		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 2;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jLabelcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 2;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jCheckBoxcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);


		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 3;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jLabelid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 3;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);


		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 4;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jLabelid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 4;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);


		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 5;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jLabelid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 5;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);


		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 6;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jLabelid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 6;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);


		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 7;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jLabelid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 7;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);


		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 8;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jLabelid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 8;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);


		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 9;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jLabelcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 9;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jCheckBoxcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);


		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 10;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jLabelpath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 10;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jTextAreapath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 11;
		gridBagConstraintsProcesoCambiarParametroGeneral.gridx =1;
		jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.add(jButtonBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);

		jTabbedPaneBusquedasProcesoCambiarParametroGeneral.addTab("1.-Por Tipo Visual Por Con Mensaje Confirmacion Por Con Botones Tool Bar Por Tipo Fondo Por Tipo Fondo Borde Por Tipo Fondo Control Por Tipo Tamanio Control Por Tipo Exportar Por Tipo Delimiter Por Con Exportar Cabecera Por Path Exportar ", jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);
		jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCambiarParametroGeneral);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;		
			//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;		
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);								
		
		
		/*
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		*/		
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
				
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoCambiarParametroGeneralJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoCambiarParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCambiarParametroGeneral = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutBusquedasParametrosProcesoCambiarParametroGeneral);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			
			
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		
			
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoCambiarParametroGeneral.setVisible(false);
		this.jButtonAnterioresProcesoCambiarParametroGeneral.setVisible(false);
		this.jButtonSiguientesProcesoCambiarParametroGeneral.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoCambiarParametroGeneral.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoCambiarParametroGeneral.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral.setVisible(false);
		this.jComboBoxTiposReportesProcesoCambiarParametroGeneral.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral.setVisible(false);
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral.setVisible(false);
		
		this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setVisible(false);
		
		
		this.jTtoolBarProcesoCambiarParametroGeneral.setVisible(false);
			
		this.jMenuItemAnterioresProcesoCambiarParametroGeneral.setVisible(false);
		this.jMenuItemSiguientesProcesoCambiarParametroGeneral.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoCambiarParametroGeneral.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarParametroGeneral.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarParametroGeneral.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoCambiarParametroGeneral.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoCambiarParametroGeneral.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoCambiarParametroGeneral() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoCambiarParametroGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.setName("jPanelReporteDinamicoProcesoCambiarParametroGeneral"); 
		
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutReporteDinamicoProcesoCambiarParametroGeneral);
		
		
		this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCambiarParametroGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Parametro Generales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoCambiarParametroGeneral = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoCambiarParametroGeneral.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.add(this.jLabelColumnasSelectReporteProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoCambiarParametroGeneral = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoCambiarParametroGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoCambiarParametroGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoCambiarParametroGeneral=new JScrollPane(this.jListColumnasSelectReporteProcesoCambiarParametroGeneral);
			
			this.jScrollColumnasSelectReporteProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.add(this.jListColumnasSelectReporteProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.add(this.jScrollColumnasSelectReporteProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoCambiarParametroGeneral = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoCambiarParametroGeneral.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoCambiarParametroGeneral = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoCambiarParametroGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoCambiarParametroGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoCambiarParametroGeneral=new JScrollPane(this.jListRelacionesSelectReporteProcesoCambiarParametroGeneral);
			
			this.jScrollRelacionesSelectReporteProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoCambiarParametroGeneral = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoCambiarParametroGeneral = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoCambiarParametroGeneral = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.add(this.jLabelGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral.setToolTipText("Generar EXCEL"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.add(this.jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.add(this.jComboBoxTiposReportesDinamicoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarParametroGeneral = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarParametroGeneral.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.add(this.jLabelTiposArchivoReporteDinamicoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoCambiarParametroGeneral.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoCambiarParametroGeneral,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoCambiarParametroGeneral.setToolTipText("Generar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.add(this.jButtonGenerarReporteDinamicoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoCambiarParametroGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoCambiarParametroGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoCambiarParametroGeneral.setToolTipText("Cancelar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarParametroGeneral.add(this.jButtonCerrarReporteDinamicoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoCambiarParametroGeneral = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral= new JScrollPane(jPanelReporteDinamicoProcesoCambiarParametroGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Parametro Generales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoCambiarParametroGeneral);
		this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoCambiarParametroGeneral() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoCambiarParametroGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoCambiarParametroGeneral.setName("jPanelImportacionProcesoCambiarParametroGeneral"); 
		
		this.jPanelImportacionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutImportacionProcesoCambiarParametroGeneral);
		
		
		this.jInternalFrameImportacionProcesoCambiarParametroGeneral= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoCambiarParametroGeneral= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoCambiarParametroGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCambiarParametroGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setResizable(true);
	    this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setClosable(true);
	    this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setResizable(true);
	    this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setClosable(true);
	    this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Parametro Generales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoCambiarParametroGeneral = new JLabelMe();

		this.jLabelArchivoImportacionProcesoCambiarParametroGeneral.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCambiarParametroGeneral.add(this.jLabelArchivoImportacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoCambiarParametroGeneral = new JFileChooser();		
		this.jFileChooserImportacionProcesoCambiarParametroGeneral.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonAbrirImportacionProcesoCambiarParametroGeneral.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoCambiarParametroGeneral,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoCambiarParametroGeneral.setToolTipText("Generar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarParametroGeneral.add(this.jButtonAbrirImportacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoCambiarParametroGeneral = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoCambiarParametroGeneral.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCambiarParametroGeneral.add(this.jLabelPathArchivoImportacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoCambiarParametroGeneral=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarParametroGeneral.add(this.jTextFieldPathArchivoImportacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonGenerarImportacionProcesoCambiarParametroGeneral.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoCambiarParametroGeneral,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoCambiarParametroGeneral.setToolTipText("Generar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarParametroGeneral.add(this.jButtonGenerarImportacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonCerrarImportacionProcesoCambiarParametroGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoCambiarParametroGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoCambiarParametroGeneral.setToolTipText("Cancelar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarParametroGeneral.add(this.jButtonCerrarImportacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoCambiarParametroGeneral = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoCambiarParametroGeneral= new JScrollPane(jPanelImportacionProcesoCambiarParametroGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoCambiarParametroGeneral);
		this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getContentPane().add(this.jScrollPanelImportacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoCambiarParametroGeneral(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoCambiarParametroGeneral = new JButtonMe();
			this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.setText("Orden");
			this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCambiarParametroGeneral,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoCambiarParametroGeneral";
			inputMap = this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoCambiarParametroGeneral"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoCambiarParametroGeneral = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoCambiarParametroGeneral.setName("jPanelOrderByProcesoCambiarParametroGeneral"); 
			
			this.jPanelOrderByProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutOrderByProcesoCambiarParametroGeneral);
			
			
			this.jTableDatosProcesoCambiarParametroGeneralOrderBy = new JTableMe();        
			this.jTableDatosProcesoCambiarParametroGeneralOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoCambiarParametroGeneralOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoCambiarParametroGeneralOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoCambiarParametroGeneralOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoCambiarParametroGeneralOrderBy.setViewportView(this.jTableDatosProcesoCambiarParametroGeneralOrderBy);
			this.jTableDatosProcesoCambiarParametroGeneralOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoCambiarParametroGeneralOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoCambiarParametroGeneral = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoCambiarParametroGeneral= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setTitle("Orden");
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setResizable(true);
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setClosable(true);
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Parametro Generales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoCambiarParametroGeneral.ipady =150;
				
			this.jPanelOrderByProcesoCambiarParametroGeneral.add(jScrollPanelDatosProcesoCambiarParametroGeneralOrderBy, this.gridBagConstraintsProcesoCambiarParametroGeneral);//this.jTableDatosProcesoCambiarParametroGeneralTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoCambiarParametroGeneral = new JButtonMe();
			this.jButtonCerrarOrderByProcesoCambiarParametroGeneral.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoCambiarParametroGeneral,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoCambiarParametroGeneral.setToolTipText("Cancelar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoCambiarParametroGeneral.add(this.jButtonCerrarOrderByProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoCambiarParametroGeneral = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoCambiarParametroGeneral= new JScrollPane(jPanelOrderByProcesoCambiarParametroGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoCambiarParametroGeneral);
			
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getContentPane().add(this.jScrollPanelOrderByProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);			
		
		} else {
			this.jButtonAbrirOrderByProcesoCambiarParametroGeneral = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoCambiarParametroGeneral.getRowHeight();//ProcesoCambiarParametroGeneralConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoCambiarParametroGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral.isSelected()) {
					iHeightTable=ProcesoCambiarParametroGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCambiarParametroGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCambiarParametroGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoCambiarParametroGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCambiarParametroGeneral.isSelected()) {
					iHeightTable=ProcesoCambiarParametroGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCambiarParametroGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCambiarParametroGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoCambiarParametroGeneral!=null && this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy()!=null) {
			//if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocambiarparametrogenerals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoCambiarParametroGeneral> TraerProcesoCambiarParametroGeneralBeans(List<ProcesoCambiarParametroGeneral> procesocambiarparametrogenerals,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogenerals) {
					
				if(!(ProcesoCambiarParametroGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoCambiarParametroGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesocambiarparametrogeneral.setsDetalleGeneralEntityReporte(ProcesoCambiarParametroGeneralConstantesFunciones.getProcesoCambiarParametroGeneralDescripcion(procesocambiarparametrogeneral));
										
					procesocambiarparametrogeneral.setcon_mensaje_confirmacion_descripcion(ProcesoCambiarParametroGeneralConstantesFunciones.getcon_mensaje_confirmacionDescripcion(procesocambiarparametrogeneral));procesocambiarparametrogeneral.setcon_botones_tool_bar_descripcion(ProcesoCambiarParametroGeneralConstantesFunciones.getcon_botones_tool_barDescripcion(procesocambiarparametrogeneral));procesocambiarparametrogeneral.setcon_exportar_cabecera_descripcion(ProcesoCambiarParametroGeneralConstantesFunciones.getcon_exportar_cabeceraDescripcion(procesocambiarparametrogeneral));	
					
						
					
				} else  {
							
					//procesocambiarparametrogeneral.setsDetalleGeneralEntityReporte(procesocambiarparametrogeneral.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesocambiarparametrogeneralbeans.add(procesocambiarparametrogeneralbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesocambiarparametrogenerals;
    }
	//PARA REPORTES FIN
}
