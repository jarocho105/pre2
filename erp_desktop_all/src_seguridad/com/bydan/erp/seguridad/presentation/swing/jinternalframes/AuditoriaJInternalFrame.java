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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.AuditoriaConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class AuditoriaJInternalFrame extends AuditoriaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAuditoria;
	
	protected JMenuBar jmenuBarAuditoria;
	
	protected JMenu jmenuAuditoria;
	protected JMenu jmenuDatosAuditoria;
	protected JMenu jmenuArchivoAuditoria;
	protected JMenu jmenuAccionesAuditoria;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAuditoria;	
	protected GridBagConstraints gridBagConstraintsAuditoria;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AuditoriaDetalleFormJInternalFrame jInternalFrameDetalleFormAuditoria;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAuditoria;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAuditoria;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public AuditoriaSessionBean auditoriaSessionBean;
		
	
	
	public UsuarioSessionBean usuarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Auditoria> auditorias;		
	public List<Auditoria> auditoriasEliminados;	
	public List<Auditoria> auditoriasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAuditoria;		
	protected JButton jButtonAbrirOrderByAuditoria;
	
	
	//protected JPanel jPanelOrderByAuditoria;
	//public JScrollPane jScrollPanelOrderByAuditoria;	
	//protected JButton jButtonCerrarOrderByAuditoria;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AuditoriaLogic auditoriaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAuditoria;
	public JScrollPane jScrollPanelDatosEdicionAuditoria;
	public JScrollPane jScrollPanelDatosGeneralAuditoria;
    
	
	
	//public JScrollPane jScrollPanelDatosAuditoriaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAuditoria;
	//public JScrollPane jScrollPanelImportacionAuditoria;
	
	
	
	protected JPanel jPanelAccionesAuditoria;
	
    protected JPanel jPanelPaginacionAuditoria;
    protected JPanel jPanelParametrosReportesAuditoria;
	protected JPanel jPanelParametrosReportesAccionesAuditoria;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Auditoria;
	protected JPanel jPanelParametrosAuxiliar2Auditoria;
	protected JPanel jPanelParametrosAuxiliar3Auditoria;
	protected JPanel jPanelParametrosAuxiliar4Auditoria;
	//protected JPanel jPanelParametrosAuxiliar5Auditoria;
	
	
	
	//protected JPanel jPanelReporteDinamicoAuditoria;
	//protected JPanel jPanelImportacionAuditoria;
	
	
	public JTable jTableDatosAuditoria;
	
	
	
	//public JTable jTableDatosAuditoriaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAuditoria;
	protected JButton jButtonDuplicarAuditoria;
	protected JButton jButtonCopiarAuditoria;
	protected JButton jButtonVerFormAuditoria;
	protected JButton jButtonNuevoRelacionesAuditoria;
	protected JButton jButtonModificarAuditoria;
	
    protected JButton jButtonGuardarCambiosTablaAuditoria;
	protected JButton jButtonCerrarAuditoria;
	
	
	protected JButton jButtonRecargarInformacionAuditoria;
	protected JButton jButtonProcesarInformacionAuditoria;
	
	
	protected JButton jButtonAnterioresAuditoria;
	protected JButton jButtonSiguientesAuditoria;
	protected JButton jButtonNuevoGuardarCambiosAuditoria;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAuditoria;
	//protected JButton jButtonCerrarReporteDinamicoAuditoria;
	//protected JButton jButtonGenerarExcelReporteDinamicoAuditoria;	
	
	
	
	//protected JButton jButtonAbrirImportacionAuditoria;
	//protected JButton jButtonGenerarImportacionAuditoria;
	//protected JButton jButtonCerrarImportacionAuditoria;
	//protected JFileChooser jFileChooserImportacionAuditoria;
	//protected File fileImportacionAuditoria;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAuditoria;
	protected JButton jButtonDuplicarToolBarAuditoria;
	protected JButton jButtonNuevoRelacionesToolBarAuditoria;
	
	
	public JButton jButtonGuardarCambiosToolBarAuditoria;
	protected JButton jButtonCopiarToolBarAuditoria;
	protected JButton jButtonVerFormToolBarAuditoria;
	public JButton jButtonGuardarCambiosTablaToolBarAuditoria;
	protected JButton jButtonMostrarOcultarTablaToolBarAuditoria;
	protected JButton jButtonCerrarToolBarAuditoria;
	
	protected JButton jButtonRecargarInformacionToolBarAuditoria;
	protected JButton jButtonProcesarInformacionToolBarAuditoria;
	protected JButton jButtonAnterioresToolBarAuditoria;
	protected JButton jButtonSiguientesToolBarAuditoria;
	protected JButton jButtonNuevoGuardarCambiosToolBarAuditoria;
	protected JButton jButtonAbrirOrderByToolBarAuditoria;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAuditoria;
	protected JMenuItem jMenuItemDuplicarAuditoria;
	protected JMenuItem jMenuItemNuevoRelacionesAuditoria;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAuditoria;
	protected JMenuItem jMenuItemCopiarAuditoria;
	protected JMenuItem jMenuItemVerFormAuditoria;
	protected JMenuItem jMenuItemGuardarCambiosTablaAuditoria;
	protected JMenuItem jMenuItemCerrarAuditoria;
	protected JMenuItem jMenuItemDetalleCerrarAuditoria;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAuditoria;
	protected JMenuItem jMenuItemDetalleMostarOcultarAuditoria;
	
	protected JMenuItem jMenuItemRecargarInformacionAuditoria;
	protected JMenuItem jMenuItemProcesarInformacionAuditoria;
	protected JMenuItem jMenuItemAnterioresAuditoria;
	protected JMenuItem jMenuItemSiguientesAuditoria;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAuditoria;
	protected JMenuItem jMenuItemAbrirOrderByAuditoria;
	protected JMenuItem jMenuItemMostrarOcultarAuditoria;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAuditoria;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAuditoria;
	protected JCheckBox jCheckBoxSeleccionadosAuditoria;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAuditoria;
	protected JCheckBox jCheckBoxConGraficoReporteAuditoria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAuditoria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAuditoria;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAuditoria;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAuditoria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAuditoria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAuditoria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAuditoria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAuditoria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAuditoria;
	protected JTextField jTextFieldValorCampoGeneralAuditoria;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAuditoria;
	//public JList<Reporte> jListColumnasSelectReporteAuditoria;
	//public JScrollPane jScrollColumnasSelectReporteAuditoria;
	
	//public JLabel jLabelRelacionesSelectReporteAuditoria;
	//public JList<Reporte> jListRelacionesSelectReporteAuditoria;
	//public JScrollPane jScrollRelacionesSelectReporteAuditoria;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAuditoria;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAuditoria;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAuditoria;
	//public JLabel jLabelTiposArchivoReporteDinamicoAuditoria;
	
		
	//public JLabel jLabelArchivoImportacionAuditoria;	
	//public JLabel jLabelPathArchivoImportacionAuditoria;
	//protected JTextField jTextFieldPathArchivoImportacionAuditoria;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAuditoria;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAuditoria;
	
	//public JLabel jLabelColumnaCategoriaValorAuditoria;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAuditoria;
	
	//public JLabel jLabelColumnasValoresGraficoAuditoria;
	//public JList<Reporte> jListColumnasValoresGraficoAuditoria;
	//public JScrollPane jScrollColumnasValoresGraficoAuditoria;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAuditoria;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAuditoria;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAuditoria;
	public JPanel jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria;
	public JButton jButtonBusquedaPorIdUsuarioPorFechaHoraAuditoria;
	public JPanel jPanelBusquedaPorIPPCPorFechaHoraAuditoria;
	public JButton jButtonBusquedaPorIPPCPorFechaHoraAuditoria;
	public JPanel jPanelBusquedaPorNombrePCPorFechaHoraAuditoria;
	public JButton jButtonBusquedaPorNombrePCPorFechaHoraAuditoria;
	public JPanel jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria;
	public JButton jButtonBusquedaPorNombreTablaPorFechaHoraAuditoria;
	public JPanel jPanelBusquedaPorObservacionesPorFechaHoraAuditoria;
	public JButton jButtonBusquedaPorObservacionesPorFechaHoraAuditoria;
	public JPanel jPanelBusquedaPorProcesoPorFechaHoraAuditoria;
	public JButton jButtonBusquedaPorProcesoPorFechaHoraAuditoria;
	public JPanel jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria;
	public JButton jButtonBusquedaPorUsuarioPCPorFechaHoraAuditoria;
	public JPanel jPanelFK_IdAuditoriaAuditoria;
	public JButton jButtonFK_IdAuditoriaAuditoria;
	
	public JPanel jPanelid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria;
	public JLabel jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria;
	public JButton jButtonid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoriaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria;
	public JButton jButtonfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria;
	public JButton jButtonfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelip_pcBusquedaPorIPPCPorFechaHoraAuditoria;
	public JLabel jLabelip_pcBusquedaPorIPPCPorFechaHoraAuditoria;
	public JTextField jTextFieldip_pcBusquedaPorIPPCPorFechaHoraAuditoria;
	public JButton jButtonip_pcBusquedaPorIPPCPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria;
	public JButton jButtonfecha_horaBusquedaPorIPPCPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria;
	public JButton jButtonfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria;
	public JLabel jLabelnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria;
	public JTextField jTextFieldnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria;
	public JButton jButtonnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria;
	public JButton jButtonfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria;
	public JButton jButtonfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria;
	public JLabel jLabelnombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria;
	public JTextArea jTextAreanombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria;
	public JButton jButtonnombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria;
	public JButton jButtonfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria;
	public JButton jButtonfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria;
	public JButton jButtonfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria;
	public JButton jButtonfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelobservacionBusquedaPorObservacionesPorFechaHoraAuditoria;
	public JLabel jLabelobservacionBusquedaPorObservacionesPorFechaHoraAuditoria;
	public JTextArea jTextAreaobservacionBusquedaPorObservacionesPorFechaHoraAuditoria;
	public JButton jButtonobservacionBusquedaPorObservacionesPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelprocesoBusquedaPorProcesoPorFechaHoraAuditoria;
	public JLabel jLabelprocesoBusquedaPorProcesoPorFechaHoraAuditoria;
	public JTextArea jTextAreaprocesoBusquedaPorProcesoPorFechaHoraAuditoria;
	public JButton jButtonprocesoBusquedaPorProcesoPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria;
	public JButton jButtonfecha_horaBusquedaPorProcesoPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria;
	public JButton jButtonfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria;
	public JLabel jLabelusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria;
	public JTextField jTextFieldusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria;
	public JButton jButtonusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria;
	public JButton jButtonfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria;
	public JLabel jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria;
	public JButton jButtonfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_filaFK_IdAuditoriaAuditoria;
	public JLabel jLabelid_filaFK_IdAuditoriaAuditoria;
	public JTextField jTextFieldid_filaFK_IdAuditoriaAuditoria;
	public JButton jButtonid_filaFK_IdAuditoriaAuditoriaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1166;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AuditoriaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAuditoria)	{
		this.jButtonRecargarInformacionAuditoria = jButtonRecargarInformacionAuditoria;
	}
	
	public JButton getjButtonProcesarInformacionAuditoria() {
		return this.jButtonProcesarInformacionAuditoria;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAuditoria)	{
		this.jButtonProcesarInformacionAuditoria = jButtonProcesarInformacionAuditoria;
	}
	
	
	public JButton getjButtonRecargarInformacionAuditoria() {
		return this.jButtonRecargarInformacionAuditoria;
	}
	
	
	public List<Auditoria> getauditorias() {
		return this.auditorias;
	}

	public void setauditorias(List<Auditoria> auditorias) {
		this.auditorias = auditorias;
	}
	
	public List<Auditoria> getauditoriasAux() {
		return this.auditoriasAux;
	}

	public void setauditoriasAux(List<Auditoria> auditoriasAux) {
		this.auditoriasAux = auditoriasAux;
	}
	
	public List<Auditoria> getauditoriasEliminados() {
		return this.auditoriasEliminados;
	}

	public void setAuditoriasEliminados(List<Auditoria> auditoriasEliminados) {
		this.auditoriasEliminados = auditoriasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAuditoria() {
		return jComboBoxTiposSeleccionarAuditoria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAuditoria(
			JComboBox jComboBoxTiposSeleccionarAuditoria) {
		this.jComboBoxTiposSeleccionarAuditoria = jComboBoxTiposSeleccionarAuditoria;
	}
	
	public void setBorderResaltarTiposSeleccionarAuditoria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAuditoria .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAuditoria() {
		return jTextFieldValorCampoGeneralAuditoria;
	}

	public void setjTextFieldValorCampoGeneralAuditoria(
			JTextField jTextFieldValorCampoGeneralAuditoria) {
		this.jTextFieldValorCampoGeneralAuditoria = jTextFieldValorCampoGeneralAuditoria;
	}

	public void setBorderResaltarValorCampoGeneralAuditoria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAuditoria .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAuditoria() {
		return this.jCheckBoxSeleccionarTodosAuditoria;
	}

	public void setjCheckBoxSeleccionarTodosAuditoria(
			JCheckBox jCheckBoxSeleccionarTodosAuditoria) {
		this.jCheckBoxSeleccionarTodosAuditoria = jCheckBoxSeleccionarTodosAuditoria;
	}

	public void setBorderResaltarSeleccionarTodosAuditoria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAuditoria .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAuditoria() {
		return this.jCheckBoxSeleccionadosAuditoria;
	}

	public void setjCheckBoxSeleccionadosAuditoria(
			JCheckBox jCheckBoxSeleccionadosAuditoria) {
		this.jCheckBoxSeleccionadosAuditoria = jCheckBoxSeleccionadosAuditoria;
	}
	
	public void setBorderResaltarSeleccionadosAuditoria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAuditoria .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAuditoria() {
		return this.jComboBoxTiposArchivosReportesAuditoria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAuditoria(
			JComboBox jComboBoxTiposArchivosReportesAuditoria) {
		this.jComboBoxTiposArchivosReportesAuditoria = jComboBoxTiposArchivosReportesAuditoria;
	}

	public void setBorderResaltarTiposArchivosReportesAuditoria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAuditoria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAuditoria() {
		return this.jComboBoxTiposReportesAuditoria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAuditoria(
			JComboBox jComboBoxTiposReportesAuditoria) {
		this.jComboBoxTiposReportesAuditoria = jComboBoxTiposReportesAuditoria;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAuditoria() {
	//	return jComboBoxTiposReportesDinamicoAuditoria;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAuditoria(
	//		JComboBox jComboBoxTiposReportesDinamicoAuditoria) {
	//	this.jComboBoxTiposReportesDinamicoAuditoria = jComboBoxTiposReportesDinamicoAuditoria;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAuditoria() {
	//	return jComboBoxTiposArchivosReportesDinamicoAuditoria;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAuditoria(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAuditoria) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAuditoria = jComboBoxTiposArchivosReportesDinamicoAuditoria;
	//}
	
	public void setBorderResaltarTiposReportesAuditoria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAuditoria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAuditoria() {
		return this.jComboBoxTiposGraficosReportesAuditoria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAuditoria(
			JComboBox jComboBoxTiposGraficosReportesAuditoria) {
		this.jComboBoxTiposGraficosReportesAuditoria = jComboBoxTiposGraficosReportesAuditoria;
	}
	
	public void setBorderResaltarTiposGraficosReportesAuditoria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAuditoria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAuditoria() {
		return this.jComboBoxTiposPaginacionAuditoria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAuditoria(
			JComboBox jComboBoxTiposPaginacionAuditoria) {
		this.jComboBoxTiposPaginacionAuditoria = jComboBoxTiposPaginacionAuditoria;
	}
	
	public void setBorderResaltarTiposPaginacionAuditoria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAuditoria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAuditoria() {
		return this.jComboBoxTiposRelacionesAuditoria;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAuditoria() {
		return this.jComboBoxTiposAccionesAuditoria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAuditoria(
			JComboBox jComboBoxTiposRelacionesAuditoria) {
		this.jComboBoxTiposRelacionesAuditoria = jComboBoxTiposRelacionesAuditoria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAuditoria(
			JComboBox jComboBoxTiposAccionesAuditoria) {
		this.jComboBoxTiposAccionesAuditoria = jComboBoxTiposAccionesAuditoria;
	}
	
	public void setBorderResaltarTiposRelacionesAuditoria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAuditoria .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAuditoria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAuditoria .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAuditoria() {
	//	return jCheckBoxConGraficoDinamicoAuditoria;
	//}

	//public void setjCheckBoxConGraficoDinamicoAuditoria(
	//		JCheckBox jCheckBoxConGraficoDinamicoAuditoria) {
	//	this.jCheckBoxConGraficoDinamicoAuditoria = jCheckBoxConGraficoDinamicoAuditoria;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAuditoria() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAuditoria.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAuditoria .setBorder(borderResaltar);		
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
		this.auditoriaSessionBean=new AuditoriaSessionBean();
		
		this.auditoriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.auditoriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.auditoriaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AuditoriaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AuditoriaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AuditoriaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AuditoriaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AuditoriaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Auditoria MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
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
		
		AuditoriaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAuditoria= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAuditoria,this.jTtoolBarAuditoria,
							"nuevo","nuevo","Nuevo"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAuditoria,this.jTtoolBarAuditoria,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAuditoria,this.jTtoolBarAuditoria,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAuditoria,this.jTtoolBarAuditoria,
							"duplicar","duplicar","Duplicar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAuditoria,this.jTtoolBarAuditoria,
							"copiar","copiar","Copiar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAuditoria,this.jTtoolBarAuditoria,
							"ver_form","ver_form","Ver"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAuditoria,this.jTtoolBarAuditoria,
							"recargar","recargar","Recargar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAuditoria,this.jTtoolBarAuditoria,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAuditoria,this.jTtoolBarAuditoria,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAuditoria,this.jTtoolBarAuditoria,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAuditoria,this.jTtoolBarAuditoria,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAuditoria,this.jTtoolBarAuditoria,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAuditoria,this.jTtoolBarAuditoria,
							"cerrar","cerrar","Salir"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAuditoria=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAuditoria;
			
				this.jButtonProcesarInformacionToolBarAuditoria=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAuditoria;
				
		//protected JButton jButtonModificarToolBarAuditoria;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAuditoria=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAuditoria=new JMenuMe("General");
		this.jmenuArchivoAuditoria=new JMenuMe("Archivo");
		this.jmenuAccionesAuditoria=new JMenuMe("Acciones");
		this.jmenuDatosAuditoria=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAuditoria= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAuditoria.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAuditoria,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAuditoria= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAuditoria.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAuditoria,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAuditoria= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAuditoria.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAuditoria,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAuditoria= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAuditoria.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAuditoria,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAuditoria= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAuditoria.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAuditoria,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAuditoria= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAuditoria.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAuditoria,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAuditoria= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAuditoria.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAuditoria,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAuditoria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAuditoria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAuditoria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAuditoria= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAuditoria.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAuditoria,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAuditoria= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAuditoria.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAuditoria,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAuditoria= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAuditoria.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAuditoria,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAuditoria= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAuditoria.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAuditoria,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAuditoria= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAuditoria.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAuditoria,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAuditoria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAuditoria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAuditoria,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAuditoria= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAuditoria.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAuditoria,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAuditoria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAuditoria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAuditoria,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAuditoria= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAuditoria.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAuditoria,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAuditoria.add(this.jMenuItemCerrarAuditoria);
			
			this.jmenuAccionesAuditoria.add(this.jMenuItemNuevoAuditoria);
			this.jmenuAccionesAuditoria.add(this.jMenuItemNuevoGuardarCambiosAuditoria);
			this.jmenuAccionesAuditoria.add(this.jMenuItemNuevoRelacionesAuditoria);
			this.jmenuAccionesAuditoria.add(this.jMenuItemGuardarCambiosTablaAuditoria);		
			this.jmenuAccionesAuditoria.add(this.jMenuItemDuplicarAuditoria);		
			this.jmenuAccionesAuditoria.add(this.jMenuItemCopiarAuditoria);		
			this.jmenuAccionesAuditoria.add(this.jMenuItemVerFormAuditoria);		
			
			this.jmenuDatosAuditoria.add(this.jMenuItemRecargarInformacionAuditoria);				
			this.jmenuDatosAuditoria.add(this.jMenuItemAnterioresAuditoria);				
			this.jmenuDatosAuditoria.add(this.jMenuItemSiguientesAuditoria);				
			this.jmenuDatosAuditoria.add(this.jMenuItemAbrirOrderByAuditoria);				
			this.jmenuDatosAuditoria.add(this.jMenuItemMostrarOcultarAuditoria);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAuditoria.add(this.jMenuItemGuardarCambiosAuditoria);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAuditoria.add(this.jmenuArchivoAuditoria);		
			this.jmenuBarAuditoria.add(this.jmenuAccionesAuditoria);		
			this.jmenuBarAuditoria.add(this.jmenuDatosAuditoria);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAuditoria);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAuditoria() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria.setToolTipText("Buscar Por Usuario Por Fecha Y Hora ");
		this.jButtonBusquedaPorIdUsuarioPorFechaHoraAuditoria= new JButtonMe();
		this.jButtonBusquedaPorIdUsuarioPorFechaHoraAuditoria.setText("Buscar");
		this.jButtonBusquedaPorIdUsuarioPorFechaHoraAuditoria.setToolTipText("Buscar Por Usuario Por Fecha Y Hora ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdUsuarioPorFechaHoraAuditoria,"buscar_button","Buscar Por Usuario Por Fecha Y Hora ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdUsuarioPorFechaHoraAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria = new JLabelMe();
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setText("Usuario :");
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setToolTipText("Usuario");
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria= new JComboBoxMe();
		jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.setText("Fecha Y Hora :");
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.setText("Fecha Y Hora Final :");
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorIPPCPorFechaHoraAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIPPCPorFechaHoraAuditoria.setToolTipText("Buscar Por Ip Del Pc Por Fecha Y Hora ");
		this.jButtonBusquedaPorIPPCPorFechaHoraAuditoria= new JButtonMe();
		this.jButtonBusquedaPorIPPCPorFechaHoraAuditoria.setText("Buscar");
		this.jButtonBusquedaPorIPPCPorFechaHoraAuditoria.setToolTipText("Buscar Por Ip Del Pc Por Fecha Y Hora ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIPPCPorFechaHoraAuditoria,"buscar_button","Buscar Por Ip Del Pc Por Fecha Y Hora ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIPPCPorFechaHoraAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelip_pcBusquedaPorIPPCPorFechaHoraAuditoria = new JLabelMe();
		jLabelip_pcBusquedaPorIPPCPorFechaHoraAuditoria.setText("Ip Del Pc :");
		jLabelip_pcBusquedaPorIPPCPorFechaHoraAuditoria.setToolTipText("Ip Del Pc");
		jLabelip_pcBusquedaPorIPPCPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelip_pcBusquedaPorIPPCPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelip_pcBusquedaPorIPPCPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelip_pcBusquedaPorIPPCPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldip_pcBusquedaPorIPPCPorFechaHoraAuditoria= new JTextFieldMe();
		jTextFieldip_pcBusquedaPorIPPCPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldip_pcBusquedaPorIPPCPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldip_pcBusquedaPorIPPCPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldip_pcBusquedaPorIPPCPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.setText("Fecha Y Hora :");
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.setText("Fecha Y Hora Final :");
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorNombrePCPorFechaHoraAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombrePCPorFechaHoraAuditoria.setToolTipText("Buscar Por Nombre De Pc Por Fecha Y Hora ");
		this.jButtonBusquedaPorNombrePCPorFechaHoraAuditoria= new JButtonMe();
		this.jButtonBusquedaPorNombrePCPorFechaHoraAuditoria.setText("Buscar");
		this.jButtonBusquedaPorNombrePCPorFechaHoraAuditoria.setToolTipText("Buscar Por Nombre De Pc Por Fecha Y Hora ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombrePCPorFechaHoraAuditoria,"buscar_button","Buscar Por Nombre De Pc Por Fecha Y Hora ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombrePCPorFechaHoraAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria = new JLabelMe();
		jLabelnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria.setText("Nombre De Pc :");
		jLabelnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria.setToolTipText("Nombre De Pc");
		jLabelnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria= new JTextFieldMe();
		jTextFieldnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.setText("Fecha Y Hora :");
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.setText("Fecha Y Hora Final :");
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria.setToolTipText("Buscar Por Nombre De La Tabla Por Fecha Y Hora ");
		this.jButtonBusquedaPorNombreTablaPorFechaHoraAuditoria= new JButtonMe();
		this.jButtonBusquedaPorNombreTablaPorFechaHoraAuditoria.setText("Buscar");
		this.jButtonBusquedaPorNombreTablaPorFechaHoraAuditoria.setToolTipText("Buscar Por Nombre De La Tabla Por Fecha Y Hora ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTablaPorFechaHoraAuditoria,"buscar_button","Buscar Por Nombre De La Tabla Por Fecha Y Hora ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTablaPorFechaHoraAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria = new JLabelMe();
		jLabelnombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria.setText("Nombre De La Tabla :");
		jLabelnombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria.setToolTipText("Nombre De La Tabla");
		jLabelnombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria= new JTextAreaMe();
		jTextAreanombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.setText("Fecha Y Hora :");
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.setText("Fecha Y Hora Final :");
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorObservacionesPorFechaHoraAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorObservacionesPorFechaHoraAuditoria.setToolTipText("Buscar Por Fecha Y Hora Por Observacion ");
		this.jButtonBusquedaPorObservacionesPorFechaHoraAuditoria= new JButtonMe();
		this.jButtonBusquedaPorObservacionesPorFechaHoraAuditoria.setText("Buscar");
		this.jButtonBusquedaPorObservacionesPorFechaHoraAuditoria.setToolTipText("Buscar Por Fecha Y Hora Por Observacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorObservacionesPorFechaHoraAuditoria,"buscar_button","Buscar Por Fecha Y Hora Por Observacion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorObservacionesPorFechaHoraAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.setText("Fecha Y Hora :");
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.setText("Fecha Y Hora Final :");
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelobservacionBusquedaPorObservacionesPorFechaHoraAuditoria = new JLabelMe();
		jLabelobservacionBusquedaPorObservacionesPorFechaHoraAuditoria.setText("Observacion :");
		jLabelobservacionBusquedaPorObservacionesPorFechaHoraAuditoria.setToolTipText("Observacion");
		jLabelobservacionBusquedaPorObservacionesPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelobservacionBusquedaPorObservacionesPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelobservacionBusquedaPorObservacionesPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelobservacionBusquedaPorObservacionesPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreaobservacionBusquedaPorObservacionesPorFechaHoraAuditoria= new JTextAreaMe();
		jTextAreaobservacionBusquedaPorObservacionesPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionBusquedaPorObservacionesPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionBusquedaPorObservacionesPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionBusquedaPorObservacionesPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorProcesoPorFechaHoraAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorProcesoPorFechaHoraAuditoria.setToolTipText("Buscar Por Proceso Por Fecha Y Hora ");
		this.jButtonBusquedaPorProcesoPorFechaHoraAuditoria= new JButtonMe();
		this.jButtonBusquedaPorProcesoPorFechaHoraAuditoria.setText("Buscar");
		this.jButtonBusquedaPorProcesoPorFechaHoraAuditoria.setToolTipText("Buscar Por Proceso Por Fecha Y Hora ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorProcesoPorFechaHoraAuditoria,"buscar_button","Buscar Por Proceso Por Fecha Y Hora ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorProcesoPorFechaHoraAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelprocesoBusquedaPorProcesoPorFechaHoraAuditoria = new JLabelMe();
		jLabelprocesoBusquedaPorProcesoPorFechaHoraAuditoria.setText("Proceso :");
		jLabelprocesoBusquedaPorProcesoPorFechaHoraAuditoria.setToolTipText("Proceso");
		jLabelprocesoBusquedaPorProcesoPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelprocesoBusquedaPorProcesoPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelprocesoBusquedaPorProcesoPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelprocesoBusquedaPorProcesoPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreaprocesoBusquedaPorProcesoPorFechaHoraAuditoria= new JTextAreaMe();
		jTextAreaprocesoBusquedaPorProcesoPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocesoBusquedaPorProcesoPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocesoBusquedaPorProcesoPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreaprocesoBusquedaPorProcesoPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.setText("Fecha Y Hora :");
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.setText("Fecha Y Hora Final :");
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria.setToolTipText("Buscar Por Usuario Del Pc Por Fecha Y Hora ");
		this.jButtonBusquedaPorUsuarioPCPorFechaHoraAuditoria= new JButtonMe();
		this.jButtonBusquedaPorUsuarioPCPorFechaHoraAuditoria.setText("Buscar");
		this.jButtonBusquedaPorUsuarioPCPorFechaHoraAuditoria.setToolTipText("Buscar Por Usuario Del Pc Por Fecha Y Hora ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorUsuarioPCPorFechaHoraAuditoria,"buscar_button","Buscar Por Usuario Del Pc Por Fecha Y Hora ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorUsuarioPCPorFechaHoraAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria = new JLabelMe();
		jLabelusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria.setText("Usuario Del Pc :");
		jLabelusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria.setToolTipText("Usuario Del Pc");
		jLabelusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria= new JTextFieldMe();
		jTextFieldusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.setText("Fecha Y Hora :");
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria = new JLabelMe();
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.setText("Fecha Y Hora Final :");
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.setToolTipText("Fecha Y Hora");
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelFK_IdAuditoriaAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAuditoriaAuditoria.setToolTipText("Buscar Por Fila ");
		this.jButtonFK_IdAuditoriaAuditoria= new JButtonMe();
		this.jButtonFK_IdAuditoriaAuditoria.setText("Buscar");
		this.jButtonFK_IdAuditoriaAuditoria.setToolTipText("Buscar Por Fila ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAuditoriaAuditoria,"buscar_button","Buscar Por Fila ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAuditoriaAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_filaFK_IdAuditoriaAuditoria = new JLabelMe();
		jLabelid_filaFK_IdAuditoriaAuditoria.setText("Fila :");
		jLabelid_filaFK_IdAuditoriaAuditoria.setToolTipText("Fila");
		jLabelid_filaFK_IdAuditoriaAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_filaFK_IdAuditoriaAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_filaFK_IdAuditoriaAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_filaFK_IdAuditoriaAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldid_filaFK_IdAuditoriaAuditoria= new JTextFieldMe();
		jTextFieldid_filaFK_IdAuditoriaAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_filaFK_IdAuditoriaAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_filaFK_IdAuditoriaAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldid_filaFK_IdAuditoriaAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldid_filaFK_IdAuditoriaAuditoria.setText("0");




		this.jTabbedPaneBusquedasAuditoria=new JTabbedPane();


		this.jTabbedPaneBusquedasAuditoria.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAuditoria.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAuditoria.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAuditoria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAuditoria = new AuditoriaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Auditoria DATOS");
			this.jInternalFrameDetalleFormAuditoria = new AuditoriaDetalleFormJInternalFrame(jDesktopPane,this.auditoriaSessionBean.getConGuardarRelaciones(),this.auditoriaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAuditoria = null;//new AuditoriaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAuditoria= new GridBagLayout();
		
		
		this.jTableDatosAuditoria = new JTableMe();      
		
		String sToolTipAuditoria="";
		sToolTipAuditoria=AuditoriaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAuditoria+="(Seguridad.Auditoria)";
		}
		
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
			sToolTipAuditoria+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAuditoria.setToolTipText(sToolTipAuditoria);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAuditoria);
		this.jTableDatosAuditoria.setAutoCreateRowSorter(true);
		this.jTableDatosAuditoria.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAuditoria.setRowSelectionAllowed(true);
		this.jTableDatosAuditoria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAuditoria,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAuditoria = new JButtonMe();
		this.jButtonDuplicarAuditoria = new JButtonMe();
		this.jButtonCopiarAuditoria = new JButtonMe();
		this.jButtonVerFormAuditoria = new JButtonMe();
		this.jButtonNuevoRelacionesAuditoria = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAuditoria = new JButtonMe();
		this.jButtonCerrarAuditoria = new JButtonMe();
		
		this.jScrollPanelDatosAuditoria = new JScrollPane();   
        this.jScrollPanelDatosGeneralAuditoria = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Auditoria";
		
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditorias" + this.sPath));
		} else {
			this.jScrollPanelDatosAuditoria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAuditoria.setToolTipText("Acciones");
        this.jPanelAccionesAuditoria.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAuditoria=new ReporteDinamicoJInternalFrame(AuditoriaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAuditoria();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAuditoria=new ImportacionJInternalFrame(AuditoriaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAuditoria();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAuditoria = new JButtonMe();
		
		this.jButtonAbrirOrderByAuditoria.setText("Orden");
		this.jButtonAbrirOrderByAuditoria.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAuditoria,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAuditoria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAuditoria,false,this);
			
			//this.cargarOrderByAuditoria(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAuditoria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAuditoria,true,this);
			
			//this.cargarOrderByAuditoria(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAuditoria.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosAuditoria.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosAuditoria.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosAuditoria.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAuditoria.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAuditoria.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAuditoria.setText("Nuevo");
		this.jButtonDuplicarAuditoria.setText("Duplicar");
		this.jButtonCopiarAuditoria.setText("Copiar");
		this.jButtonVerFormAuditoria.setText("Ver");
		this.jButtonNuevoRelacionesAuditoria.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAuditoria.setText("Guardar");
		this.jButtonCerrarAuditoria.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAuditoria,"nuevo_button","Nuevo",this.auditoriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAuditoria,"duplicar_button","Duplicar",this.auditoriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAuditoria,"copiar_button","Copiar",this.auditoriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAuditoria,"ver_form","Ver",this.auditoriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAuditoria,"nuevorelaciones_button","Nuevo Rel",this.auditoriaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAuditoria,"guardarcambiostabla_button","Guardar",this.auditoriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAuditoria,"cerrar_button","Salir",this.auditoriaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAuditoria.setToolTipText("Nuevo"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAuditoria.setToolTipText("Duplicar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAuditoria.setToolTipText("Copiar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAuditoria.setToolTipText("Ver"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAuditoria.setToolTipText("Nuevo Rel"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAuditoria.setToolTipText("Guardar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAuditoria.setToolTipText("Salir"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAuditoria";
		inputMap = this.jButtonNuevoAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAuditoria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAuditoria"));
		
		//DUPLICAR
		sMapKey = "DuplicarAuditoria";
		inputMap = this.jButtonDuplicarAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAuditoria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAuditoria"));
		
		//COPIAR
		sMapKey = "CopiarAuditoria";
		inputMap = this.jButtonCopiarAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAuditoria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAuditoria"));
		
		//VEr FORM
		sMapKey = "VerFormAuditoria";
		inputMap = this.jButtonVerFormAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAuditoria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAuditoria"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAuditoria";
		inputMap = this.jButtonNuevoRelacionesAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAuditoria"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAuditoria";
		inputMap = this.jButtonModificarAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAuditoria"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAuditoria";
		inputMap = this.jButtonCerrarAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAuditoria"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAuditoria";
		inputMap = this.jButtonGuardarCambiosTablaAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAuditoria"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Auditoria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Auditoria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Auditoria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Auditoria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Auditoria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAuditoria.setName("jPanelParametrosReportesAuditoria"); 
		
		this.jPanelParametrosReportesAccionesAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAuditoria.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAuditoria.setName("jPanelParametrosReportesAccionesAuditoria"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAuditoria = new JButtonMe();
		this.jButtonRecargarInformacionAuditoria.setText("Recargar");
		this.jButtonRecargarInformacionAuditoria.setToolTipText("Recargar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAuditoria,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAuditoria = new JButtonMe();
		this.jButtonProcesarInformacionAuditoria.setText("Procesar");
		this.jButtonProcesarInformacionAuditoria.setToolTipText("Procesar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAuditoria.setVisible(false);
			
		this.jButtonProcesarInformacionAuditoria.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAuditoria.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAuditoria.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAuditoria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAuditoria.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAuditoria.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAuditoria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAuditoria.setText("TIPO");       
		this.jComboBoxTiposReportesAuditoria.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAuditoria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAuditoria.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAuditoria.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAuditoria = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAuditoria.setText("Paginacion");
		this.jComboBoxTiposPaginacionAuditoria.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAuditoria = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAuditoria.setText("Accion");
		this.jComboBoxTiposRelacionesAuditoria.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAuditoria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAuditoria.setText("Accion");
		this.jComboBoxTiposAccionesAuditoria.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAuditoria = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAuditoria.setText("Accion");
		this.jComboBoxTiposSeleccionarAuditoria.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAuditoria=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAuditoria.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAuditoria.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAuditoria.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAuditoria = new JLabelMe();
		
		this.jLabelAccionesAuditoria.setText("Acciones");		
		this.jLabelAccionesAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAuditoria = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAuditoria.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAuditoria.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAuditoria = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAuditoria.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAuditoria.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAuditoria = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAuditoria.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAuditoria.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAuditoria = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAuditoria.setText("Graf.");
		this.jCheckBoxConGraficoReporteAuditoria.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAuditoria = new JButtonMe();
		//this.jButtonAnterioresAuditoria.setText("<<");
        this.jButtonAnterioresAuditoria.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAuditoria,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAuditoria = new JButtonMe();
		//this.jButtonSiguientesAuditoria.setText(">>");
        this.jButtonSiguientesAuditoria.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAuditoria,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAuditoria = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAuditoria.setText("Nue");
        this.jButtonNuevoGuardarCambiosAuditoria.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAuditoria,"nuevoguardarcambios_button","Nue",this.auditoriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAuditoria";
		inputMap = this.jButtonNuevoGuardarCambiosAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAuditoria"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAuditoria";
		inputMap = this.jButtonRecargarInformacionAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAuditoria"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAuditoria";
		inputMap = this.jButtonSiguientesAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAuditoria"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAuditoria";
		inputMap = this.jButtonAnterioresAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAuditoria"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAuditoria();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAuditoria.setMinimumSize(new Dimension(this.getWidth(),AuditoriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AuditoriaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAuditoria.setMaximumSize(new Dimension(this.getWidth(),AuditoriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AuditoriaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAuditoria.setPreferredSize(new Dimension(this.getWidth(),AuditoriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AuditoriaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAuditoria = new GridBagLayout();

			this.jPanelPaginacionAuditoria.setLayout(gridaBagLayoutPaginacionAuditoria);						
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy = 0;
			this.gridBagConstraintsAuditoria.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAuditoria.add(this.jButtonAnterioresAuditoria, this.gridBagConstraintsAuditoria);
					
						
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAuditoria.gridy = 0;
			
			this.jPanelPaginacionAuditoria.add(this.jButtonNuevoGuardarCambiosAuditoria, this.gridBagConstraintsAuditoria);
						
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAuditoria.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAuditoria.gridy = 0;
			this.jPanelPaginacionAuditoria.add(this.jButtonSiguientesAuditoria, this.gridBagConstraintsAuditoria);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy = 1;
			this.gridBagConstraintsAuditoria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAuditoria.add(this.jButtonNuevoAuditoria, this.gridBagConstraintsAuditoria);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsAuditoria = new GridBagConstraints();
				this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAuditoria.gridy = 1;
				this.gridBagConstraintsAuditoria.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionAuditoria.add(this.jButtonNuevoRelacionesAuditoria, this.gridBagConstraintsAuditoria);
			}
			
			
			if(!this.auditoriaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAuditoria = new GridBagConstraints();
				this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAuditoria.gridy = 1;
				this.gridBagConstraintsAuditoria.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAuditoria.add(this.jButtonGuardarCambiosTablaAuditoria, this.gridBagConstraintsAuditoria);
			}
			
			
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy = 1;
			this.gridBagConstraintsAuditoria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAuditoria.add(this.jButtonDuplicarAuditoria, this.gridBagConstraintsAuditoria);
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy = 1;
			this.gridBagConstraintsAuditoria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAuditoria.add(this.jButtonCopiarAuditoria, this.gridBagConstraintsAuditoria);
		
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy = 1;
			this.gridBagConstraintsAuditoria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAuditoria.add(this.jButtonVerFormAuditoria, this.gridBagConstraintsAuditoria);
		
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy = 1;
			this.gridBagConstraintsAuditoria.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAuditoria.add(this.jButtonCerrarAuditoria, this.gridBagConstraintsAuditoria);
		
		
		
		this.jButtonRecargarInformacionAuditoria.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAuditoria.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAuditoria.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAuditoria.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAuditoria.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAuditoria.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAuditoria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAuditoria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAuditoria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAuditoria.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAuditoria.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAuditoria.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAuditoria.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAuditoria.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAuditoria.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAuditoria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAuditoria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAuditoria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAuditoria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAuditoria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAuditoria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAuditoria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAuditoria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAuditoria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAuditoria.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAuditoria.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAuditoria.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAuditoria.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAuditoria.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAuditoria.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAuditoria.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAuditoria.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAuditoria.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAuditoria.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAuditoria.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAuditoria.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAuditoria = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAuditoria = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Auditoria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Auditoria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Auditoria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Auditoria = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAuditoria.setLayout(gridaBagParametrosReportesAuditoria);
			this.jPanelParametrosReportesAccionesAuditoria.setLayout(gridaBagParametrosReportesAccionesAuditoria);
			
			
			this.jPanelParametrosAuxiliar1Auditoria.setLayout(gridaBagParametrosAuxiliar1Auditoria);
			this.jPanelParametrosAuxiliar2Auditoria.setLayout(gridaBagParametrosAuxiliar2Auditoria);
			this.jPanelParametrosAuxiliar3Auditoria.setLayout(gridaBagParametrosAuxiliar3Auditoria);
			this.jPanelParametrosAuxiliar4Auditoria.setLayout(gridaBagParametrosAuxiliar4Auditoria);
			//this.jPanelParametrosAuxiliar5Auditoria.setLayout(gridaBagParametrosAuxiliar2Auditoria);			
			
			
			
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAuditoria.add(this.jButtonRecargarInformacionAuditoria, this.gridBagConstraintsAuditoria);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Auditoria.add(this.jComboBoxTiposPaginacionAuditoria, this.gridBagConstraintsAuditoria);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Auditoria.add(this.jCheckBoxConAltoMaximoTablaAuditoria, this.gridBagConstraintsAuditoria);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Auditoria.add(this.jComboBoxTiposArchivosReportesAuditoria, this.gridBagConstraintsAuditoria);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAuditoria.add(this.jPanelParametrosAuxiliar1Auditoria, this.gridBagConstraintsAuditoria);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAuditoria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Auditoria.add(this.jComboBoxTiposReportesAuditoria, this.gridBagConstraintsAuditoria);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAuditoria.add(this.jPanelParametrosAuxiliar4Auditoria, this.gridBagConstraintsAuditoria);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAuditoria.add(this.jComboBoxTiposReportesAuditoria, this.gridBagConstraintsAuditoria);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAuditoria.add(this.jCheckBoxGenerarReporteAuditoria, this.gridBagConstraintsAuditoria);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAuditoria.add(this.jPanelParametrosAuxiliar2Auditoria, this.gridBagConstraintsAuditoria);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAuditoria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAuditoria.add(this.jLabelAccionesAuditoria, this.gridBagConstraintsAuditoria);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAuditoria = new GridBagConstraints();
				this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAuditoria.add(this.jButtonAbrirOrderByAuditoria, this.gridBagConstraintsAuditoria);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAuditoria.add(this.jComboBoxTiposSeleccionarAuditoria, this.gridBagConstraintsAuditoria);			
			
			
			/*
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAuditoria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAuditoria.add(this.jCheckBoxSeleccionarTodosAuditoria, this.gridBagConstraintsAuditoria);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAuditoria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Auditoria.add(this.jCheckBoxSeleccionarTodosAuditoria, this.gridBagConstraintsAuditoria);															
				
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAuditoria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Auditoria.add(this.jCheckBoxSeleccionadosAuditoria, this.gridBagConstraintsAuditoria);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAuditoria.add(this.jPanelParametrosAuxiliar3Auditoria, this.gridBagConstraintsAuditoria);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAuditoria.add(this.jComboBoxTiposRelacionesAuditoria, this.gridBagConstraintsAuditoria);
				
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAuditoria.add(this.jComboBoxTiposAccionesAuditoria, this.gridBagConstraintsAuditoria);
	
				
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAuditoria.add(this.jTextFieldValorCampoGeneralAuditoria, this.gridBagConstraintsAuditoria);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAuditoria = new GridBagLayout();

			this.jScrollPanelDatosAuditoria.setLayout(gridaBagLayoutDatosAuditoria);
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy = 0;
			this.gridBagConstraintsAuditoria.gridx = 0;
			
			this.jScrollPanelDatosAuditoria.add(this.jTableDatosAuditoria, this.gridBagConstraintsAuditoria);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAuditoria.setViewportView(this.jTableDatosAuditoria);
		this.jTableDatosAuditoria.setFillsViewportHeight(true);
		this.jTableDatosAuditoria.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAuditoria= new GridBagLayout();
		this.jPanelAccionesAuditoria.setLayout(gridaBagLayoutAccionesAuditoria);
		
		
		/*	
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 0;
			
		this.jPanelAccionesAuditoria.add(this.jButtonNuevoAuditoria, this.gridBagConstraintsAuditoria);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria.setLayout(gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria.add(jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria.add(jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 3;
		gridBagConstraintsAuditoria.gridx =1;
		jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria.add(jButtonBusquedaPorIdUsuarioPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		jTabbedPaneBusquedasAuditoria.addTab("1.-Por Usuario Por Fecha Y Hora Por Fecha Y Hora Final", jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria);
		jTabbedPaneBusquedasAuditoria.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIPPCPorFechaHoraAuditoria.setLayout(gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorIPPCPorFechaHoraAuditoria.add(jLabelip_pcBusquedaPorIPPCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorIPPCPorFechaHoraAuditoria.add(jTextFieldip_pcBusquedaPorIPPCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorIPPCPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorIPPCPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorIPPCPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorIPPCPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 3;
		gridBagConstraintsAuditoria.gridx =1;
		jPanelBusquedaPorIPPCPorFechaHoraAuditoria.add(jButtonBusquedaPorIPPCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		jTabbedPaneBusquedasAuditoria.addTab("2.-Por Ip Del Pc Por Fecha Y Hora Por Fecha Y Hora Final", jPanelBusquedaPorIPPCPorFechaHoraAuditoria);
		jTabbedPaneBusquedasAuditoria.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombrePCPorFechaHoraAuditoria.setLayout(gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorNombrePCPorFechaHoraAuditoria.add(jLabelnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorNombrePCPorFechaHoraAuditoria.add(jTextFieldnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorNombrePCPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorNombrePCPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorNombrePCPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorNombrePCPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 3;
		gridBagConstraintsAuditoria.gridx =1;
		jPanelBusquedaPorNombrePCPorFechaHoraAuditoria.add(jButtonBusquedaPorNombrePCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		jTabbedPaneBusquedasAuditoria.addTab("3.-Por Nombre De Pc Por Fecha Y Hora Por Fecha Y Hora Final", jPanelBusquedaPorNombrePCPorFechaHoraAuditoria);
		jTabbedPaneBusquedasAuditoria.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria.setLayout(gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria.add(jLabelnombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria.add(jTextAreanombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 3;
		gridBagConstraintsAuditoria.gridx =1;
		jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria.add(jButtonBusquedaPorNombreTablaPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		jTabbedPaneBusquedasAuditoria.addTab("4.-Por Nombre De La Tabla Por Fecha Y Hora Por Fecha Y Hora Final", jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria);
		jTabbedPaneBusquedasAuditoria.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorObservacionesPorFechaHoraAuditoria.setLayout(gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorObservacionesPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorObservacionesPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorObservacionesPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorObservacionesPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorObservacionesPorFechaHoraAuditoria.add(jLabelobservacionBusquedaPorObservacionesPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorObservacionesPorFechaHoraAuditoria.add(jTextAreaobservacionBusquedaPorObservacionesPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 3;
		gridBagConstraintsAuditoria.gridx =1;
		jPanelBusquedaPorObservacionesPorFechaHoraAuditoria.add(jButtonBusquedaPorObservacionesPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		jTabbedPaneBusquedasAuditoria.addTab("5.-Por Fecha Y Hora Por Fecha Y Hora FinalPor Observacion ", jPanelBusquedaPorObservacionesPorFechaHoraAuditoria);
		jTabbedPaneBusquedasAuditoria.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorProcesoPorFechaHoraAuditoria.setLayout(gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorProcesoPorFechaHoraAuditoria.add(jLabelprocesoBusquedaPorProcesoPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorProcesoPorFechaHoraAuditoria.add(jTextAreaprocesoBusquedaPorProcesoPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorProcesoPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorProcesoPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorProcesoPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorProcesoPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 3;
		gridBagConstraintsAuditoria.gridx =1;
		jPanelBusquedaPorProcesoPorFechaHoraAuditoria.add(jButtonBusquedaPorProcesoPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		jTabbedPaneBusquedasAuditoria.addTab("6.-Por Proceso Por Fecha Y Hora Por Fecha Y Hora Final", jPanelBusquedaPorProcesoPorFechaHoraAuditoria);
		jTabbedPaneBusquedasAuditoria.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria.setLayout(gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria.add(jLabelusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria.add(jTextFieldusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);


		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria.add(jLabelfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 2;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria.add(jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 3;
		gridBagConstraintsAuditoria.gridx =1;
		jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria.add(jButtonBusquedaPorUsuarioPCPorFechaHoraAuditoria, gridBagConstraintsAuditoria);

		jTabbedPaneBusquedasAuditoria.addTab("7.-Por Usuario Del Pc Por Fecha Y Hora Por Fecha Y Hora Final", jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria);
		jTabbedPaneBusquedasAuditoria.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdAuditoriaAuditoria= new GridBagLayout();
		gridaBagLayoutFK_IdAuditoriaAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAuditoriaAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAuditoriaAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAuditoriaAuditoria.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAuditoriaAuditoria.setLayout(gridaBagLayoutFK_IdAuditoriaAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 0;
		jPanelFK_IdAuditoriaAuditoria.add(jLabelid_filaFK_IdAuditoriaAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 0;
		gridBagConstraintsAuditoria.gridx = 1;
		jPanelFK_IdAuditoriaAuditoria.add(jTextFieldid_filaFK_IdAuditoriaAuditoria, gridBagConstraintsAuditoria);

		gridBagConstraintsAuditoria = new GridBagConstraints();
		gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoria.gridy = 1;
		gridBagConstraintsAuditoria.gridx =1;
		jPanelFK_IdAuditoriaAuditoria.add(jButtonFK_IdAuditoriaAuditoria, gridBagConstraintsAuditoria);

		jTabbedPaneBusquedasAuditoria.addTab("8.-Por Fila ", jPanelFK_IdAuditoriaAuditoria);
		jTabbedPaneBusquedasAuditoria.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAuditoria = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAuditoria);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAuditoria = new GridBagConstraints();						
			this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAuditoria.gridx = 0;		
			//this.gridBagConstraintsAuditoria.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAuditoria.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAuditoria, this.gridBagConstraintsAuditoria);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAuditoria.gridx = 0;		
		//this.gridBagConstraintsAuditoria.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAuditoria.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAuditoria);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAuditoria.gridx = 0;		
			this.gridBagConstraintsAuditoria.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAuditoria.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAuditoria, this.gridBagConstraintsAuditoria);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoria.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAuditoria, this.gridBagConstraintsAuditoria);								
		
		
		/*
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoria.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAuditoria, this.gridBagConstraintsAuditoria);
		*/		
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAuditoria.gridx =0;
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAuditoria.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAuditoria, this.gridBagConstraintsAuditoria);
				
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoria.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAuditoria, this.gridBagConstraintsAuditoria);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(AuditoriaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAuditoria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAuditoria = new GridBagLayout();
			this.jPanelBusquedasParametrosAuditoria.setLayout(gridaBagLayoutBusquedasParametrosAuditoria);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAuditoria=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAuditoria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAuditoria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAuditoria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAuditoria, this.gridBagConstraintsAuditoria);
			
			
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAuditoria, this.gridBagConstraintsAuditoria);
		
			
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAuditoria.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAuditoria, this.gridBagConstraintsAuditoria);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAuditoria;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAuditoria() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAuditoria = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAuditoria.setName("jPanelReporteDinamicoAuditoria"); 
		
		this.jPanelReporteDinamicoAuditoria.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAuditoria.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAuditoria.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAuditoria.setLayout(gridaBagLayoutReporteDinamicoAuditoria);
		
		
		this.jInternalFrameReporteDinamicoAuditoria= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAuditoria = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAuditoria= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAuditoria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAuditoria.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAuditoria.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAuditoria.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAuditoria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAuditoria.setResizable(true);
	    this.jInternalFrameReporteDinamicoAuditoria.setClosable(true);
	    this.jInternalFrameReporteDinamicoAuditoria.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAuditoria.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAuditoria.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAuditoria.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditorias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAuditoria = new JLabelMe();

		this.jLabelColumnasSelectReporteAuditoria.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAuditoria.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAuditoria.add(this.jLabelColumnasSelectReporteAuditoria, this.gridBagConstraintsAuditoria);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAuditoria = new JList<Reporte>();
		this.jListColumnasSelectReporteAuditoria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAuditoria.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAuditoria.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAuditoria.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAuditoria.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAuditoria=new JScrollPane(this.jListColumnasSelectReporteAuditoria);
			
			this.jScrollColumnasSelectReporteAuditoria.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAuditoria.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAuditoria.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAuditoria.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAuditoria.add(this.jListColumnasSelectReporteAuditoria, this.gridBagConstraintsAuditoria);
		this.jPanelReporteDinamicoAuditoria.add(this.jScrollColumnasSelectReporteAuditoria, this.gridBagConstraintsAuditoria);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAuditoria = new JLabelMe();

		this.jLabelRelacionesSelectReporteAuditoria.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAuditoria.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAuditoria.add(this.jLabelRelacionesSelectReporteAuditoria, this.gridBagConstraintsAuditoria);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAuditoria = new JList<Reporte>();
		this.jListRelacionesSelectReporteAuditoria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAuditoria.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAuditoria.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAuditoria.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAuditoria.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAuditoria=new JScrollPane(this.jListRelacionesSelectReporteAuditoria);
			
			this.jScrollRelacionesSelectReporteAuditoria.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAuditoria.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAuditoria.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAuditoria.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAuditoria.add(this.jListRelacionesSelectReporteAuditoria, this.gridBagConstraintsAuditoria);
		this.jPanelReporteDinamicoAuditoria.add(this.jScrollRelacionesSelectReporteAuditoria, this.gridBagConstraintsAuditoria);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoAuditoria = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAuditoria = new JComboBoxMe();
		this.jListColumnasValoresGraficoAuditoria = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAuditoria = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAuditoria.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAuditoria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAuditoria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAuditoria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAuditoria = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAuditoria.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAuditoria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAuditoria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAuditoria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAuditoria = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAuditoria.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAuditoria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAuditoria.add(this.jLabelGenerarExcelReporteDinamicoAuditoria, this.gridBagConstraintsAuditoria);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAuditoria = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAuditoria.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAuditoria,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAuditoria.setToolTipText("Generar EXCEL"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAuditoria.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAuditoria.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAuditoria.add(this.jButtonGenerarExcelReporteDinamicoAuditoria, this.gridBagConstraintsAuditoria);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAuditoria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAuditoria.add(this.jComboBoxTiposReportesDinamicoAuditoria, this.gridBagConstraintsAuditoria);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAuditoria = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAuditoria.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAuditoria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAuditoria.add(this.jLabelTiposArchivoReporteDinamicoAuditoria, this.gridBagConstraintsAuditoria);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAuditoria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAuditoria.add(this.jComboBoxTiposArchivosReportesDinamicoAuditoria, this.gridBagConstraintsAuditoria);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAuditoria = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAuditoria.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAuditoria,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAuditoria.setToolTipText("Generar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAuditoria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAuditoria.add(this.jButtonGenerarReporteDinamicoAuditoria, this.gridBagConstraintsAuditoria);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAuditoria = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAuditoria.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAuditoria,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAuditoria.setToolTipText("Cancelar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAuditoria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAuditoria.add(this.jButtonCerrarReporteDinamicoAuditoria, this.gridBagConstraintsAuditoria);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAuditoria = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAuditoria= new JScrollPane(jPanelReporteDinamicoAuditoria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAuditoria.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAuditoria.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAuditoria.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditorias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAuditoria.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAuditoria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAuditoria.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAuditoria);
		this.jInternalFrameReporteDinamicoAuditoria.getContentPane().add(this.jScrollPanelReporteDinamicoAuditoria, this.gridBagConstraintsAuditoria);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAuditoria() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAuditoria = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAuditoria.setName("jPanelImportacionAuditoria"); 
		
		this.jPanelImportacionAuditoria.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAuditoria.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAuditoria.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAuditoria.setLayout(gridaBagLayoutImportacionAuditoria);
		
		
		this.jInternalFrameImportacionAuditoria= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAuditoria= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAuditoria = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAuditoria= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAuditoria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAuditoria.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAuditoria.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAuditoria.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAuditoria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAuditoria.setResizable(true);
	    this.jInternalFrameImportacionAuditoria.setClosable(true);
	    this.jInternalFrameImportacionAuditoria.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAuditoria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAuditoria.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAuditoria.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAuditoria.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAuditoria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAuditoria.setResizable(true);
	    this.jInternalFrameImportacionAuditoria.setClosable(true);
	    this.jInternalFrameImportacionAuditoria.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAuditoria.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAuditoria.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAuditoria.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditorias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAuditoria = new JLabelMe();

		this.jLabelArchivoImportacionAuditoria.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYImportacion;		
		this.gridBagConstraintsAuditoria.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAuditoria.add(this.jLabelArchivoImportacionAuditoria, this.gridBagConstraintsAuditoria);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAuditoria = new JFileChooser();		
		this.jFileChooserImportacionAuditoria.setToolTipText("ESCOGER ARCHIVO"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAuditoria = new JButtonMe();
		this.jButtonAbrirImportacionAuditoria.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAuditoria,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAuditoria.setToolTipText("Generar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYImportacion;
		this.gridBagConstraintsAuditoria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAuditoria.add(this.jButtonAbrirImportacionAuditoria, this.gridBagConstraintsAuditoria);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAuditoria = new JLabelMe();

		this.jLabelPathArchivoImportacionAuditoria.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYImportacion;		
		this.gridBagConstraintsAuditoria.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAuditoria.add(this.jLabelPathArchivoImportacionAuditoria, this.gridBagConstraintsAuditoria);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAuditoria=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAuditoria.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAuditoria.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAuditoria.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYImportacion;
		this.gridBagConstraintsAuditoria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAuditoria.add(this.jTextFieldPathArchivoImportacionAuditoria, this.gridBagConstraintsAuditoria);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAuditoria = new JButtonMe();
		this.jButtonGenerarImportacionAuditoria.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAuditoria,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAuditoria.setToolTipText("Generar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYImportacion;
		this.gridBagConstraintsAuditoria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAuditoria.add(this.jButtonGenerarImportacionAuditoria, this.gridBagConstraintsAuditoria);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAuditoria = new JButtonMe();
		this.jButtonCerrarImportacionAuditoria.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAuditoria,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAuditoria.setToolTipText("Cancelar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.gridy = iPosYImportacion;
		this.gridBagConstraintsAuditoria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAuditoria.add(this.jButtonCerrarImportacionAuditoria, this.gridBagConstraintsAuditoria);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAuditoria = new GridBagLayout();
		
		this.jScrollPanelImportacionAuditoria= new JScrollPane(jPanelImportacionAuditoria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy =iPosYImportacion;
		this.gridBagConstraintsAuditoria.gridx =iPosXImportacion;
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAuditoria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAuditoria.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAuditoria);
		this.jInternalFrameImportacionAuditoria.getContentPane().add(this.jScrollPanelImportacionAuditoria, this.gridBagConstraintsAuditoria);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAuditoria(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAuditoria = new JButtonMe();
			this.jButtonAbrirOrderByAuditoria.setText("Orden");
			this.jButtonAbrirOrderByAuditoria.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAuditoria,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAuditoria";
			inputMap = this.jButtonAbrirOrderByAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAuditoria"));
		
		
			GridBagLayout gridaBagLayoutOrderByAuditoria = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAuditoria.setName("jPanelOrderByAuditoria"); 
			
			this.jPanelOrderByAuditoria.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAuditoria.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAuditoria.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAuditoria.setLayout(gridaBagLayoutOrderByAuditoria);
			
			
			this.jTableDatosAuditoriaOrderBy = new JTableMe();        
			this.jTableDatosAuditoriaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAuditoriaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAuditoriaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAuditoriaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAuditoriaOrderBy.setViewportView(this.jTableDatosAuditoriaOrderBy);
			this.jTableDatosAuditoriaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAuditoriaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAuditoria= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAuditoria= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAuditoria = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAuditoria= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAuditoria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAuditoria.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAuditoria.setTitle("Orden");
			this.jInternalFrameOrderByAuditoria.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAuditoria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAuditoria.setResizable(true);
			this.jInternalFrameOrderByAuditoria.setClosable(true);
			this.jInternalFrameOrderByAuditoria.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAuditoria.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAuditoria.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAuditoria.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditorias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAuditoria.gridx =iPosXOrderBy;
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAuditoria.ipady =150;
				
			this.jPanelOrderByAuditoria.add(jScrollPanelDatosAuditoriaOrderBy, this.gridBagConstraintsAuditoria);//this.jTableDatosAuditoriaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAuditoria = new JButtonMe();
			this.jButtonCerrarOrderByAuditoria.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAuditoria,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAuditoria.setToolTipText("Cancelar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAuditoria.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAuditoria.add(this.jButtonCerrarOrderByAuditoria, this.gridBagConstraintsAuditoria);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAuditoria = new GridBagLayout();
			
			this.jScrollPanelOrderByAuditoria= new JScrollPane(jPanelOrderByAuditoria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridy =iPosYOrderBy;
			this.gridBagConstraintsAuditoria.gridx =iPosXOrderBy;
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAuditoria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAuditoria.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAuditoria);
			
			this.jInternalFrameOrderByAuditoria.getContentPane().add(this.jScrollPanelOrderByAuditoria, this.gridBagConstraintsAuditoria);			
		
		} else {
			this.jButtonAbrirOrderByAuditoria = new JButtonMe();
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
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.auditoriaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAuditoria.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAuditoria.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAuditoria.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAuditoria.getRowHeight();//AuditoriaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AuditoriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAuditoria.isSelected()) {
					iHeightTable=AuditoriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AuditoriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AuditoriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AuditoriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAuditoria.isSelected()) {
					iHeightTable=AuditoriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AuditoriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AuditoriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAuditoria.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAuditoria.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAuditoria.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAuditoria.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAuditoria.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAuditoria.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAuditoria!=null && this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy()!=null) {
			//if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAuditoria.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAuditoria.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAuditoria.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAuditoria.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAuditoria.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAuditoria.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=auditoriaLogic.getAuditorias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=auditorias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Auditoria> TraerAuditoriaBeans(List<Auditoria> auditorias,ArrayList<Classe> classes)throws Exception {
		try {
			for(Auditoria auditoria:auditorias) {
					
				if(!(AuditoriaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AuditoriaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					auditoria.setsDetalleGeneralEntityReporte(AuditoriaConstantesFunciones.getAuditoriaDescripcion(auditoria));
										
						
					
					

					if(auditoria.getAuditoriaDetalles()!=null && Funciones.existeClass(classes,AuditoriaDetalle.class)) {
						try{auditoria.setauditoriadetallesDescripcionReporte(new JRBeanCollectionDataSource(AuditoriaDetalleJInternalFrame.TraerAuditoriaDetalleBeans(auditoria.getAuditoriaDetalles(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//auditoria.setsDetalleGeneralEntityReporte(auditoria.getsDetalleGeneralEntityReporte());
										
				}
				
				//auditoriabeans.add(auditoriabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return auditorias;
    }
	//PARA REPORTES FIN
}
