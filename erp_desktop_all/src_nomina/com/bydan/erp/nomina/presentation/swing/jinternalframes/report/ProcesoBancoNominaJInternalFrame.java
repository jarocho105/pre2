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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoBancoNominaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoBancoNominaJInternalFrame extends ProcesoBancoNominaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoBancoNomina;
	
	protected JMenuBar jmenuBarProcesoBancoNomina;
	
	protected JMenu jmenuProcesoBancoNomina;
	protected JMenu jmenuDatosProcesoBancoNomina;
	protected JMenu jmenuArchivoProcesoBancoNomina;
	protected JMenu jmenuAccionesProcesoBancoNomina;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoBancoNomina;	
	protected GridBagConstraints gridBagConstraintsProcesoBancoNomina;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoBancoNominaDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoBancoNomina;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoBancoNomina;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoBancoNomina;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabanco="";

	protected TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocontrato="";

	protected TipoBancoDiscoBeanSwingJInternalFrame tipobancodiscoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipobancodisco="";
	
	public ProcesoBancoNominaSessionBean procesobanconominaSessionBean;
		
	
	
	public BancoSessionBean bancoSessionBean;
	public CuentaBancoSessionBean cuentabancoSessionBean;
	public TipoContratoSessionBean tipocontratoSessionBean;
	public TipoBancoDiscoSessionBean tipobancodiscoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoBancoNomina> procesobanconominas;		
	public List<ProcesoBancoNomina> procesobanconominasEliminados;	
	public List<ProcesoBancoNomina> procesobanconominasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoBancoNomina;		
	protected JButton jButtonAbrirOrderByProcesoBancoNomina;
	
	
	//protected JPanel jPanelOrderByProcesoBancoNomina;
	//public JScrollPane jScrollPanelOrderByProcesoBancoNomina;	
	//protected JButton jButtonCerrarOrderByProcesoBancoNomina;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoBancoNominaLogic procesobanconominaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoBancoNomina;
	public JScrollPane jScrollPanelDatosEdicionProcesoBancoNomina;
	public JScrollPane jScrollPanelDatosGeneralProcesoBancoNomina;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoBancoNominaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoBancoNomina;
	//public JScrollPane jScrollPanelImportacionProcesoBancoNomina;
	
	
	
	protected JPanel jPanelAccionesProcesoBancoNomina;
	
    protected JPanel jPanelPaginacionProcesoBancoNomina;
    protected JPanel jPanelParametrosReportesProcesoBancoNomina;
	protected JPanel jPanelParametrosReportesAccionesProcesoBancoNomina;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoBancoNomina;
	protected JPanel jPanelParametrosAuxiliar2ProcesoBancoNomina;
	protected JPanel jPanelParametrosAuxiliar3ProcesoBancoNomina;
	protected JPanel jPanelParametrosAuxiliar4ProcesoBancoNomina;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoBancoNomina;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoBancoNomina;
	//protected JPanel jPanelImportacionProcesoBancoNomina;
	
	
	public JTable jTableDatosProcesoBancoNomina;
	
	
	
	//public JTable jTableDatosProcesoBancoNominaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoBancoNomina;
	protected JButton jButtonDuplicarProcesoBancoNomina;
	protected JButton jButtonCopiarProcesoBancoNomina;
	protected JButton jButtonVerFormProcesoBancoNomina;
	protected JButton jButtonNuevoRelacionesProcesoBancoNomina;
	protected JButton jButtonModificarProcesoBancoNomina;
	
    protected JButton jButtonGuardarCambiosTablaProcesoBancoNomina;
	protected JButton jButtonCerrarProcesoBancoNomina;
	
	
	protected JButton jButtonRecargarInformacionProcesoBancoNomina;
	protected JButton jButtonProcesarInformacionProcesoBancoNomina;
	
	
	protected JButton jButtonAnterioresProcesoBancoNomina;
	protected JButton jButtonSiguientesProcesoBancoNomina;
	protected JButton jButtonNuevoGuardarCambiosProcesoBancoNomina;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoBancoNomina;
	//protected JButton jButtonCerrarReporteDinamicoProcesoBancoNomina;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoBancoNomina;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoBancoNomina;
	//protected JButton jButtonGenerarImportacionProcesoBancoNomina;
	//protected JButton jButtonCerrarImportacionProcesoBancoNomina;
	//protected JFileChooser jFileChooserImportacionProcesoBancoNomina;
	//protected File fileImportacionProcesoBancoNomina;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoBancoNomina;
	protected JButton jButtonDuplicarToolBarProcesoBancoNomina;
	protected JButton jButtonNuevoRelacionesToolBarProcesoBancoNomina;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoBancoNomina;
	protected JButton jButtonCopiarToolBarProcesoBancoNomina;
	protected JButton jButtonVerFormToolBarProcesoBancoNomina;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoBancoNomina;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoBancoNomina;
	protected JButton jButtonCerrarToolBarProcesoBancoNomina;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoBancoNomina;
	protected JButton jButtonProcesarInformacionToolBarProcesoBancoNomina;
	protected JButton jButtonAnterioresToolBarProcesoBancoNomina;
	protected JButton jButtonSiguientesToolBarProcesoBancoNomina;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoBancoNomina;
	protected JButton jButtonAbrirOrderByToolBarProcesoBancoNomina;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoBancoNomina;
	protected JMenuItem jMenuItemDuplicarProcesoBancoNomina;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoBancoNomina;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoBancoNomina;
	protected JMenuItem jMenuItemCopiarProcesoBancoNomina;
	protected JMenuItem jMenuItemVerFormProcesoBancoNomina;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoBancoNomina;
	protected JMenuItem jMenuItemCerrarProcesoBancoNomina;
	protected JMenuItem jMenuItemDetalleCerrarProcesoBancoNomina;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoBancoNomina;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoBancoNomina;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoBancoNomina;
	protected JMenuItem jMenuItemProcesarInformacionProcesoBancoNomina;
	protected JMenuItem jMenuItemAnterioresProcesoBancoNomina;
	protected JMenuItem jMenuItemSiguientesProcesoBancoNomina;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoBancoNomina;
	protected JMenuItem jMenuItemAbrirOrderByProcesoBancoNomina;
	protected JMenuItem jMenuItemMostrarOcultarProcesoBancoNomina;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoBancoNomina;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoBancoNomina;
	protected JCheckBox jCheckBoxSeleccionadosProcesoBancoNomina;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoBancoNomina;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoBancoNomina;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoBancoNomina;
	protected JTextField jTextFieldValorCampoGeneralProcesoBancoNomina;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoBancoNomina;
	//public JList<Reporte> jListColumnasSelectReporteProcesoBancoNomina;
	//public JScrollPane jScrollColumnasSelectReporteProcesoBancoNomina;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoBancoNomina;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoBancoNomina;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoBancoNomina;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoBancoNomina;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoBancoNomina;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoBancoNomina;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoBancoNomina;
	
		
	//public JLabel jLabelArchivoImportacionProcesoBancoNomina;	
	//public JLabel jLabelPathArchivoImportacionProcesoBancoNomina;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoBancoNomina;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoBancoNomina;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoBancoNomina;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoBancoNomina;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoBancoNomina;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoBancoNomina;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoBancoNomina;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoBancoNomina;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoBancoNomina;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoBancoNomina;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoBancoNomina;
	public JPanel jPanelBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JButton jButtonBusquedaProcesoBancoNominaProcesoBancoNomina;
	
	public JPanel jPanelid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JLabel jLabelid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JButton jButtonid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina= new JButtonMe();
	public JButton jButtonid_bancoBusquedaProcesoBancoNominaProcesoBancoNominaUpdate= new JButtonMe();
	public JButton jButtonid_bancoBusquedaProcesoBancoNominaProcesoBancoNominaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JLabel jLabelid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JButton jButtonid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina= new JButtonMe();
	public JButton jButtonid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNominaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNominaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JLabel jLabelid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JButton jButtonid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina= new JButtonMe();
	public JButton jButtonid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNominaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNominaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JLabel jLabelid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JButton jButtonid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina= new JButtonMe();
	public JButton jButtonid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNominaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNominaBusqueda= new JButtonMe();

	
	public JPanel jPanelcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JLabel jLabelcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JCheckBox jCheckBoxcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JButton jButtoncon_otrosBusquedaProcesoBancoNominaProcesoBancoNominaBusqueda= new JButtonMe();

	
	public JPanel jPanelcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JLabel jLabelcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JCheckBox jCheckBoxcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JButton jButtoncon_internetBusquedaProcesoBancoNominaProcesoBancoNominaBusqueda= new JButtonMe();

	
	public JPanel jPanelfechaBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JLabel jLabelfechaBusquedaProcesoBancoNominaProcesoBancoNomina;
	//public JFormattedTextField jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina;

	public JDateChooser jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JButton jButtonfechaBusquedaProcesoBancoNominaProcesoBancoNominaBusqueda= new JButtonMe();

	
	public JPanel jPanelnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JLabel jLabelnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JTextField jTextFieldnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JButton jButtonnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNominaBusqueda= new JButtonMe();

	
	public JPanel jPanelgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JLabel jLabelgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JCheckBox jCheckBoxgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JButton jButtongenera_textoBusquedaProcesoBancoNominaProcesoBancoNominaBusqueda= new JButtonMe();

	
	public JPanel jPanelgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JLabel jLabelgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JCheckBox jCheckBoxgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina;
	public JButton jButtongenera_excelBusquedaProcesoBancoNominaProcesoBancoNominaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoBancoNominaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoBancoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoBancoNominaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoBancoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoBancoNominaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoBancoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoBancoNominaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoBancoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoBancoNomina)	{
		this.jButtonRecargarInformacionProcesoBancoNomina = jButtonRecargarInformacionProcesoBancoNomina;
	}
	
	public JButton getjButtonProcesarInformacionProcesoBancoNomina() {
		return this.jButtonProcesarInformacionProcesoBancoNomina;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoBancoNomina)	{
		this.jButtonProcesarInformacionProcesoBancoNomina = jButtonProcesarInformacionProcesoBancoNomina;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoBancoNomina() {
		return this.jButtonRecargarInformacionProcesoBancoNomina;
	}
	
	
	public List<ProcesoBancoNomina> getprocesobanconominas() {
		return this.procesobanconominas;
	}

	public void setprocesobanconominas(List<ProcesoBancoNomina> procesobanconominas) {
		this.procesobanconominas = procesobanconominas;
	}
	
	public List<ProcesoBancoNomina> getprocesobanconominasAux() {
		return this.procesobanconominasAux;
	}

	public void setprocesobanconominasAux(List<ProcesoBancoNomina> procesobanconominasAux) {
		this.procesobanconominasAux = procesobanconominasAux;
	}
	
	public List<ProcesoBancoNomina> getprocesobanconominasEliminados() {
		return this.procesobanconominasEliminados;
	}

	public void setProcesoBancoNominasEliminados(List<ProcesoBancoNomina> procesobanconominasEliminados) {
		this.procesobanconominasEliminados = procesobanconominasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoBancoNomina() {
		return jComboBoxTiposSeleccionarProcesoBancoNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoBancoNomina(
			JComboBox jComboBoxTiposSeleccionarProcesoBancoNomina) {
		this.jComboBoxTiposSeleccionarProcesoBancoNomina = jComboBoxTiposSeleccionarProcesoBancoNomina;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoBancoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoBancoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoBancoNomina .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoBancoNomina() {
		return jTextFieldValorCampoGeneralProcesoBancoNomina;
	}

	public void setjTextFieldValorCampoGeneralProcesoBancoNomina(
			JTextField jTextFieldValorCampoGeneralProcesoBancoNomina) {
		this.jTextFieldValorCampoGeneralProcesoBancoNomina = jTextFieldValorCampoGeneralProcesoBancoNomina;
	}

	public void setBorderResaltarValorCampoGeneralProcesoBancoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoBancoNomina.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoBancoNomina .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoBancoNomina() {
		return this.jCheckBoxSeleccionarTodosProcesoBancoNomina;
	}

	public void setjCheckBoxSeleccionarTodosProcesoBancoNomina(
			JCheckBox jCheckBoxSeleccionarTodosProcesoBancoNomina) {
		this.jCheckBoxSeleccionarTodosProcesoBancoNomina = jCheckBoxSeleccionarTodosProcesoBancoNomina;
	}

	public void setBorderResaltarSeleccionarTodosProcesoBancoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoBancoNomina.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoBancoNomina .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoBancoNomina() {
		return this.jCheckBoxSeleccionadosProcesoBancoNomina;
	}

	public void setjCheckBoxSeleccionadosProcesoBancoNomina(
			JCheckBox jCheckBoxSeleccionadosProcesoBancoNomina) {
		this.jCheckBoxSeleccionadosProcesoBancoNomina = jCheckBoxSeleccionadosProcesoBancoNomina;
	}
	
	public void setBorderResaltarSeleccionadosProcesoBancoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoBancoNomina.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoBancoNomina .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoBancoNomina() {
		return this.jComboBoxTiposArchivosReportesProcesoBancoNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoBancoNomina(
			JComboBox jComboBoxTiposArchivosReportesProcesoBancoNomina) {
		this.jComboBoxTiposArchivosReportesProcesoBancoNomina = jComboBoxTiposArchivosReportesProcesoBancoNomina;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoBancoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoBancoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoBancoNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoBancoNomina() {
		return this.jComboBoxTiposReportesProcesoBancoNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoBancoNomina(
			JComboBox jComboBoxTiposReportesProcesoBancoNomina) {
		this.jComboBoxTiposReportesProcesoBancoNomina = jComboBoxTiposReportesProcesoBancoNomina;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoBancoNomina() {
	//	return jComboBoxTiposReportesDinamicoProcesoBancoNomina;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoBancoNomina(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoBancoNomina) {
	//	this.jComboBoxTiposReportesDinamicoProcesoBancoNomina = jComboBoxTiposReportesDinamicoProcesoBancoNomina;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina = jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina;
	//}
	
	public void setBorderResaltarTiposReportesProcesoBancoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoBancoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoBancoNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoBancoNomina() {
		return this.jComboBoxTiposGraficosReportesProcesoBancoNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoBancoNomina(
			JComboBox jComboBoxTiposGraficosReportesProcesoBancoNomina) {
		this.jComboBoxTiposGraficosReportesProcesoBancoNomina = jComboBoxTiposGraficosReportesProcesoBancoNomina;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoBancoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoBancoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoBancoNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoBancoNomina() {
		return this.jComboBoxTiposPaginacionProcesoBancoNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoBancoNomina(
			JComboBox jComboBoxTiposPaginacionProcesoBancoNomina) {
		this.jComboBoxTiposPaginacionProcesoBancoNomina = jComboBoxTiposPaginacionProcesoBancoNomina;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoBancoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoBancoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoBancoNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoBancoNomina() {
		return this.jComboBoxTiposRelacionesProcesoBancoNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoBancoNomina() {
		return this.jComboBoxTiposAccionesProcesoBancoNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoBancoNomina(
			JComboBox jComboBoxTiposRelacionesProcesoBancoNomina) {
		this.jComboBoxTiposRelacionesProcesoBancoNomina = jComboBoxTiposRelacionesProcesoBancoNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoBancoNomina(
			JComboBox jComboBoxTiposAccionesProcesoBancoNomina) {
		this.jComboBoxTiposAccionesProcesoBancoNomina = jComboBoxTiposAccionesProcesoBancoNomina;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoBancoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoBancoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoBancoNomina .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoBancoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoBancoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoBancoNomina .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoBancoNomina() {
	//	return jCheckBoxConGraficoDinamicoProcesoBancoNomina;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoBancoNomina(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoBancoNomina) {
	//	this.jCheckBoxConGraficoDinamicoProcesoBancoNomina = jCheckBoxConGraficoDinamicoProcesoBancoNomina;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoBancoNomina() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoBancoNomina.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoBancoNomina .setBorder(borderResaltar);		
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
		this.procesobanconominaSessionBean=new ProcesoBancoNominaSessionBean();
		
		this.procesobanconominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesobanconominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesobanconominaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoBancoNominaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoBancoNominaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoBancoNominaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoBancoNominaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoBancoNominaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Banco Nomina MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoBancoNominaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoBancoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoBancoNomina= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"nuevo","nuevo","Nuevo"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"duplicar","duplicar","Duplicar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"copiar","copiar","Copiar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"ver_form","ver_form","Ver"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"recargar","recargar","Procesar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,
							"cerrar","cerrar","Salir"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoBancoNomina=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoBancoNomina;
			
				this.jButtonProcesarInformacionToolBarProcesoBancoNomina=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoBancoNomina;
				
		//protected JButton jButtonModificarToolBarProcesoBancoNomina;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoBancoNomina=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoBancoNomina=new JMenuMe("General");
		this.jmenuArchivoProcesoBancoNomina=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoBancoNomina=new JMenuMe("Acciones");
		this.jmenuDatosProcesoBancoNomina=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoBancoNomina= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoBancoNomina.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoBancoNomina,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoBancoNomina= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoBancoNomina.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoBancoNomina,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoBancoNomina= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoBancoNomina.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoBancoNomina,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoBancoNomina= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoBancoNomina.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoBancoNomina,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoBancoNomina= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoBancoNomina.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoBancoNomina,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoBancoNomina= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoBancoNomina.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoBancoNomina,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoBancoNomina= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoBancoNomina.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoBancoNomina,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoBancoNomina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoBancoNomina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoBancoNomina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoBancoNomina= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoBancoNomina.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoBancoNomina,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoBancoNomina= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoBancoNomina.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoBancoNomina,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoBancoNomina= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoBancoNomina.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoBancoNomina,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoBancoNomina= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoBancoNomina.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoBancoNomina,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoBancoNomina= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoBancoNomina.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoBancoNomina,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoBancoNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoBancoNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoBancoNomina,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoBancoNomina= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoBancoNomina.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoBancoNomina,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoBancoNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoBancoNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoBancoNomina,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoBancoNomina= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoBancoNomina.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoBancoNomina,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoBancoNomina.add(this.jMenuItemCerrarProcesoBancoNomina);
			
			this.jmenuAccionesProcesoBancoNomina.add(this.jMenuItemNuevoProcesoBancoNomina);
			this.jmenuAccionesProcesoBancoNomina.add(this.jMenuItemNuevoGuardarCambiosProcesoBancoNomina);
			this.jmenuAccionesProcesoBancoNomina.add(this.jMenuItemNuevoRelacionesProcesoBancoNomina);
			this.jmenuAccionesProcesoBancoNomina.add(this.jMenuItemGuardarCambiosTablaProcesoBancoNomina);		
			this.jmenuAccionesProcesoBancoNomina.add(this.jMenuItemDuplicarProcesoBancoNomina);		
			this.jmenuAccionesProcesoBancoNomina.add(this.jMenuItemCopiarProcesoBancoNomina);		
			this.jmenuAccionesProcesoBancoNomina.add(this.jMenuItemVerFormProcesoBancoNomina);		
			
			this.jmenuDatosProcesoBancoNomina.add(this.jMenuItemRecargarInformacionProcesoBancoNomina);				
			this.jmenuDatosProcesoBancoNomina.add(this.jMenuItemAnterioresProcesoBancoNomina);				
			this.jmenuDatosProcesoBancoNomina.add(this.jMenuItemSiguientesProcesoBancoNomina);				
			this.jmenuDatosProcesoBancoNomina.add(this.jMenuItemAbrirOrderByProcesoBancoNomina);				
			this.jmenuDatosProcesoBancoNomina.add(this.jMenuItemMostrarOcultarProcesoBancoNomina);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoBancoNomina.add(this.jMenuItemGuardarCambiosProcesoBancoNomina);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoBancoNomina.add(this.jmenuArchivoProcesoBancoNomina);		
			this.jmenuBarProcesoBancoNomina.add(this.jmenuAccionesProcesoBancoNomina);		
			this.jmenuBarProcesoBancoNomina.add(this.jmenuDatosProcesoBancoNomina);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoBancoNomina);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoBancoNomina() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoBancoNominaProcesoBancoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Procesar Proceso Banco Nomina");
		this.jButtonBusquedaProcesoBancoNominaProcesoBancoNomina= new JButtonMe();
		this.jButtonBusquedaProcesoBancoNominaProcesoBancoNomina.setText("Procesar");
		this.jButtonBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Procesar Proceso Banco Nomina");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoBancoNominaProcesoBancoNomina,"buscar_button","Procesar Proceso Banco Nomina");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoBancoNominaProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina = new JLabelMe();
		jLabelid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setText("Banco :");
		jLabelid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Banco");
		jLabelid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina= new JComboBoxMe();
		jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina = new JLabelMe();
		jLabelid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setText("Cuenta Banco :");
		jLabelid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Cuenta Banco");
		jLabelid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina= new JComboBoxMe();
		jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina = new JLabelMe();
		jLabelid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setText("Tipo Contrato :");
		jLabelid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Tipo Contrato");
		jLabelid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina= new JComboBoxMe();
		jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina = new JLabelMe();
		jLabelid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setText("Tipo Banco Disco :");
		jLabelid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Tipo Banco Disco");
		jLabelid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina= new JComboBoxMe();
		jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina = new JLabelMe();
		jLabelcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina.setText("Con Otros :");
		jLabelcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Con Otros");
		jLabelcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina= new JCheckBoxMe();
		jCheckBoxcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina = new JLabelMe();
		jLabelcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina.setText("Con Internet :");
		jLabelcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Con Internet");
		jLabelcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina= new JCheckBoxMe();
		jCheckBoxcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfechaBusquedaProcesoBancoNominaProcesoBancoNomina = new JLabelMe();
		jLabelfechaBusquedaProcesoBancoNominaProcesoBancoNomina.setText("Fecha :");
		jLabelfechaBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Fecha");
		jLabelfechaBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfechaBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina= new JDateChooser();
		jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina.setDate(new Date());
		jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina = new JLabelMe();
		jLabelnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina.setText("Numero Secuenciales :");
		jLabelnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Numero Secuenciales");
		jLabelnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina= new JTextFieldMe();
		jTextFieldnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina.setText("0");



	
		jLabelgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina = new JLabelMe();
		jLabelgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina.setText("Genera Texto :");
		jLabelgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Genera Texto");
		jLabelgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina= new JCheckBoxMe();
		jCheckBoxgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina = new JLabelMe();
		jLabelgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina.setText("Genera Excel :");
		jLabelgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina.setToolTipText("Genera Excel");
		jLabelgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina= new JCheckBoxMe();
		jCheckBoxgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoBancoNomina=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoBancoNomina.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,225)));
		this.jTabbedPaneBusquedasProcesoBancoNomina.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,225)));
		this.jTabbedPaneBusquedasProcesoBancoNomina.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,225)));

		//this.jTabbedPaneBusquedasProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Banco Nomina"));
		this.jTabbedPaneBusquedasProcesoBancoNomina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoBancoNomina = new ProcesoBancoNominaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Banco Nomina DATOS");
			this.jInternalFrameDetalleFormProcesoBancoNomina = new ProcesoBancoNominaDetalleFormJInternalFrame(jDesktopPane,this.procesobanconominaSessionBean.getConGuardarRelaciones(),this.procesobanconominaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoBancoNomina = null;//new ProcesoBancoNominaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoBancoNomina= new GridBagLayout();
		
		
		this.jTableDatosProcesoBancoNomina = new JTableMe();      
		
		String sToolTipProcesoBancoNomina="";
		sToolTipProcesoBancoNomina=ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoBancoNomina+="(Nomina.ProcesoBancoNomina)";
		}
		
		if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoBancoNomina+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoBancoNomina.setToolTipText(sToolTipProcesoBancoNomina);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoBancoNomina);
		this.jTableDatosProcesoBancoNomina.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoBancoNomina.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoBancoNomina.setRowSelectionAllowed(true);
		this.jTableDatosProcesoBancoNomina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoBancoNomina = new JButtonMe();
		this.jButtonDuplicarProcesoBancoNomina = new JButtonMe();
		this.jButtonCopiarProcesoBancoNomina = new JButtonMe();
		this.jButtonVerFormProcesoBancoNomina = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoBancoNomina = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoBancoNomina = new JButtonMe();
		this.jButtonCerrarProcesoBancoNomina = new JButtonMe();
		
		this.jScrollPanelDatosProcesoBancoNomina = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoBancoNomina = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Banco Nomina";
		
		if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Banco Nominas" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoBancoNomina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoBancoNomina.setToolTipText("Acciones");
        this.jPanelAccionesProcesoBancoNomina.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoBancoNomina=new ReporteDinamicoJInternalFrame(ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoBancoNomina();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoBancoNomina=new ImportacionJInternalFrame(ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoBancoNomina();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoBancoNomina = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoBancoNomina.setText("Orden");
		this.jButtonAbrirOrderByProcesoBancoNomina.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoBancoNomina,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoBancoNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoBancoNomina,false,this);
			
			//this.cargarOrderByProcesoBancoNomina(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoBancoNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoBancoNomina,true,this);
			
			//this.cargarOrderByProcesoBancoNomina(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoBancoNomina.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosProcesoBancoNomina.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosProcesoBancoNomina.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosProcesoBancoNomina.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoBancoNomina.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoBancoNomina.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoBancoNomina.setText("Nuevo");
		this.jButtonDuplicarProcesoBancoNomina.setText("Duplicar");
		this.jButtonCopiarProcesoBancoNomina.setText("Copiar");
		this.jButtonVerFormProcesoBancoNomina.setText("Ver");
		this.jButtonNuevoRelacionesProcesoBancoNomina.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoBancoNomina.setText("Guardar");
		this.jButtonCerrarProcesoBancoNomina.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoBancoNomina,"nuevo_button","Nuevo",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoBancoNomina,"duplicar_button","Duplicar",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoBancoNomina,"copiar_button","Copiar",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoBancoNomina,"ver_form","Ver",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoBancoNomina,"nuevorelaciones_button","Nuevo Rel",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoBancoNomina,"guardarcambiostabla_button","Guardar",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoBancoNomina,"cerrar_button","Salir",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoBancoNomina.setToolTipText("Nuevo"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoBancoNomina.setToolTipText("Duplicar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoBancoNomina.setToolTipText("Copiar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoBancoNomina.setToolTipText("Ver"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoBancoNomina.setToolTipText("Nuevo Rel"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoBancoNomina.setToolTipText("Guardar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoBancoNomina.setToolTipText("Salir"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoBancoNomina";
		inputMap = this.jButtonNuevoProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoBancoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoBancoNomina"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoBancoNomina";
		inputMap = this.jButtonDuplicarProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoBancoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoBancoNomina"));
		
		//COPIAR
		sMapKey = "CopiarProcesoBancoNomina";
		inputMap = this.jButtonCopiarProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoBancoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoBancoNomina"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoBancoNomina";
		inputMap = this.jButtonVerFormProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoBancoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoBancoNomina"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoBancoNomina";
		inputMap = this.jButtonNuevoRelacionesProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoBancoNomina"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoBancoNomina";
		inputMap = this.jButtonModificarProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoBancoNomina"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoBancoNomina";
		inputMap = this.jButtonCerrarProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoBancoNomina"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoBancoNomina";
		inputMap = this.jButtonGuardarCambiosTablaProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoBancoNomina"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoBancoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoBancoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoBancoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoBancoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoBancoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoBancoNomina.setName("jPanelParametrosReportesProcesoBancoNomina"); 
		
		this.jPanelParametrosReportesAccionesProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoBancoNomina.setName("jPanelParametrosReportesAccionesProcesoBancoNomina"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoBancoNomina = new JButtonMe();
		this.jButtonRecargarInformacionProcesoBancoNomina.setText("Procesar");
		this.jButtonRecargarInformacionProcesoBancoNomina.setToolTipText("Procesar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoBancoNomina,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoBancoNomina.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoBancoNomina = new JButtonMe();
		this.jButtonProcesarInformacionProcesoBancoNomina.setText("Procesar");
		this.jButtonProcesarInformacionProcesoBancoNomina.setToolTipText("Procesar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoBancoNomina.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoBancoNomina.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoBancoNomina.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoBancoNomina.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoBancoNomina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoBancoNomina.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoBancoNomina.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoBancoNomina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoBancoNomina.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoBancoNomina.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoBancoNomina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoBancoNomina.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoBancoNomina.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoBancoNomina = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoBancoNomina.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoBancoNomina.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoBancoNomina = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoBancoNomina.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoBancoNomina.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoBancoNomina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoBancoNomina.setText("Accion");
		this.jComboBoxTiposAccionesProcesoBancoNomina.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoBancoNomina = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoBancoNomina.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoBancoNomina.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoBancoNomina=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoBancoNomina.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoBancoNomina.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoBancoNomina.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoBancoNomina = new JLabelMe();
		
		this.jLabelAccionesProcesoBancoNomina.setText("Acciones");		
		this.jLabelAccionesProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoBancoNomina = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoBancoNomina.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoBancoNomina.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoBancoNomina = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoBancoNomina.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoBancoNomina.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoBancoNomina = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoBancoNomina.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoBancoNomina.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoBancoNomina = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoBancoNomina.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoBancoNomina.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoBancoNomina = new JButtonMe();
		//this.jButtonAnterioresProcesoBancoNomina.setText("<<");
        this.jButtonAnterioresProcesoBancoNomina.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoBancoNomina,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoBancoNomina = new JButtonMe();
		//this.jButtonSiguientesProcesoBancoNomina.setText(">>");
        this.jButtonSiguientesProcesoBancoNomina.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoBancoNomina,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoBancoNomina = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoBancoNomina.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoBancoNomina.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoBancoNomina,"nuevoguardarcambios_button","Nue",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoBancoNomina";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoBancoNomina"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoBancoNomina";
		inputMap = this.jButtonRecargarInformacionProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoBancoNomina"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoBancoNomina";
		inputMap = this.jButtonSiguientesProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoBancoNomina"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoBancoNomina";
		inputMap = this.jButtonAnterioresProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoBancoNomina"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoBancoNomina();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoBancoNomina.setMinimumSize(new Dimension(this.getWidth(),ProcesoBancoNominaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoBancoNominaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoBancoNomina.setMaximumSize(new Dimension(this.getWidth(),ProcesoBancoNominaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoBancoNominaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoBancoNomina.setPreferredSize(new Dimension(this.getWidth(),ProcesoBancoNominaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoBancoNominaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoBancoNomina = new GridBagLayout();

			this.jPanelPaginacionProcesoBancoNomina.setLayout(gridaBagLayoutPaginacionProcesoBancoNomina);						
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
			this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoBancoNomina.add(this.jButtonAnterioresProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
					
						
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
			
			this.jPanelPaginacionProcesoBancoNomina.add(this.jButtonNuevoGuardarCambiosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
						
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
			this.jPanelPaginacionProcesoBancoNomina.add(this.jButtonSiguientesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = 1;
			this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoBancoNomina.add(this.jButtonNuevoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
						
			
			
			if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
				this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoBancoNomina.gridy = 1;
				this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoBancoNomina.add(this.jButtonGuardarCambiosTablaProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			}
			
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = 1;
			this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoBancoNomina.add(this.jButtonProcesarInformacionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = 1;
			this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoBancoNomina.add(this.jButtonDuplicarProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = 1;
			this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoBancoNomina.add(this.jButtonCopiarProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = 1;
			this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoBancoNomina.add(this.jButtonVerFormProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = 1;
			this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoBancoNomina.add(this.jButtonCerrarProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		
		
		
		this.jButtonRecargarInformacionProcesoBancoNomina.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoBancoNomina.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoBancoNomina.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoBancoNomina.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoBancoNomina.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoBancoNomina.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoBancoNomina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoBancoNomina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoBancoNomina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoBancoNomina.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoBancoNomina.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoBancoNomina.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoBancoNomina.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoBancoNomina.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoBancoNomina.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoBancoNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoBancoNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoBancoNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoBancoNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoBancoNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoBancoNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoBancoNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoBancoNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoBancoNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoBancoNomina.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoBancoNomina.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoBancoNomina.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoBancoNomina.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoBancoNomina.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoBancoNomina.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoBancoNomina.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoBancoNomina.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoBancoNomina.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoBancoNomina.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoBancoNomina.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoBancoNomina.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoBancoNomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoBancoNomina = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoBancoNomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoBancoNomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoBancoNomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoBancoNomina = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoBancoNomina.setLayout(gridaBagParametrosReportesProcesoBancoNomina);
			this.jPanelParametrosReportesAccionesProcesoBancoNomina.setLayout(gridaBagParametrosReportesAccionesProcesoBancoNomina);
			
			
			this.jPanelParametrosAuxiliar1ProcesoBancoNomina.setLayout(gridaBagParametrosAuxiliar1ProcesoBancoNomina);
			this.jPanelParametrosAuxiliar2ProcesoBancoNomina.setLayout(gridaBagParametrosAuxiliar2ProcesoBancoNomina);
			this.jPanelParametrosAuxiliar3ProcesoBancoNomina.setLayout(gridaBagParametrosAuxiliar3ProcesoBancoNomina);
			this.jPanelParametrosAuxiliar4ProcesoBancoNomina.setLayout(gridaBagParametrosAuxiliar4ProcesoBancoNomina);
			//this.jPanelParametrosAuxiliar5ProcesoBancoNomina.setLayout(gridaBagParametrosAuxiliar2ProcesoBancoNomina);			
			
			
			
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoBancoNomina.add(this.jButtonRecargarInformacionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoBancoNomina.add(this.jComboBoxTiposPaginacionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoBancoNomina.add(this.jCheckBoxConAltoMaximoTablaProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoBancoNomina.add(this.jComboBoxTiposArchivosReportesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoBancoNomina.add(this.jPanelParametrosAuxiliar1ProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoBancoNomina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoBancoNomina.add(this.jComboBoxTiposReportesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoBancoNomina.add(this.jPanelParametrosAuxiliar4ProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoBancoNomina.add(this.jComboBoxTiposReportesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoBancoNomina.add(this.jCheckBoxGenerarReporteProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoBancoNomina.add(this.jPanelParametrosAuxiliar2ProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoBancoNomina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoBancoNomina.add(this.jLabelAccionesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoBancoNomina.add(this.jComboBoxTiposSeleccionarProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);			
			
			
			/*
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoBancoNomina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoBancoNomina.add(this.jCheckBoxSeleccionarTodosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoBancoNomina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoBancoNomina.add(this.jCheckBoxSeleccionarTodosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);															
				
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoBancoNomina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoBancoNomina.add(this.jCheckBoxSeleccionadosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoBancoNomina.add(this.jPanelParametrosAuxiliar3ProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoBancoNomina.add(this.jComboBoxTiposAccionesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoBancoNomina = new GridBagLayout();

			this.jScrollPanelDatosProcesoBancoNomina.setLayout(gridaBagLayoutDatosProcesoBancoNomina);
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
			this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
			
			this.jScrollPanelDatosProcesoBancoNomina.add(this.jTableDatosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoBancoNomina.setViewportView(this.jTableDatosProcesoBancoNomina);
		this.jTableDatosProcesoBancoNomina.setFillsViewportHeight(true);
		this.jTableDatosProcesoBancoNomina.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoBancoNomina= new GridBagLayout();
		this.jPanelAccionesProcesoBancoNomina.setLayout(gridaBagLayoutAccionesProcesoBancoNomina);
		
		
		/*	
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
			
		this.jPanelAccionesProcesoBancoNomina.add(this.jButtonNuevoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoBancoNominaProcesoBancoNomina= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoBancoNominaProcesoBancoNomina.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoBancoNominaProcesoBancoNomina.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoBancoNominaProcesoBancoNomina.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoBancoNominaProcesoBancoNomina.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.setLayout(gridaBagLayoutBusquedaProcesoBancoNominaProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 0;
		gridBagConstraintsProcesoBancoNomina.gridx = 0;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jLabelid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 0;
		gridBagConstraintsProcesoBancoNomina.gridx = 1;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);


		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 1;
		gridBagConstraintsProcesoBancoNomina.gridx = 0;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jLabelid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 1;
		gridBagConstraintsProcesoBancoNomina.gridx = 1;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);


		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 2;
		gridBagConstraintsProcesoBancoNomina.gridx = 0;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jLabelid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 2;
		gridBagConstraintsProcesoBancoNomina.gridx = 1;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);


		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 3;
		gridBagConstraintsProcesoBancoNomina.gridx = 0;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jLabelid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 3;
		gridBagConstraintsProcesoBancoNomina.gridx = 1;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);


		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 4;
		gridBagConstraintsProcesoBancoNomina.gridx = 0;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jLabelcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 4;
		gridBagConstraintsProcesoBancoNomina.gridx = 1;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jCheckBoxcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);


		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 5;
		gridBagConstraintsProcesoBancoNomina.gridx = 0;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jLabelcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 5;
		gridBagConstraintsProcesoBancoNomina.gridx = 1;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jCheckBoxcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);


		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 6;
		gridBagConstraintsProcesoBancoNomina.gridx = 0;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jLabelfechaBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 6;
		gridBagConstraintsProcesoBancoNomina.gridx = 1;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);


		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 7;
		gridBagConstraintsProcesoBancoNomina.gridx = 0;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jLabelnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 7;
		gridBagConstraintsProcesoBancoNomina.gridx = 1;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jTextFieldnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);


		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 8;
		gridBagConstraintsProcesoBancoNomina.gridx = 0;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jLabelgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 8;
		gridBagConstraintsProcesoBancoNomina.gridx = 1;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jCheckBoxgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);


		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 9;
		gridBagConstraintsProcesoBancoNomina.gridx = 0;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jLabelgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 9;
		gridBagConstraintsProcesoBancoNomina.gridx = 1;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jCheckBoxgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoBancoNomina.gridy = 10;
		gridBagConstraintsProcesoBancoNomina.gridx =1;
		jPanelBusquedaProcesoBancoNominaProcesoBancoNomina.add(jButtonBusquedaProcesoBancoNominaProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);

		jTabbedPaneBusquedasProcesoBancoNomina.addTab("1.-Por Banco Por Cuenta Banco Por Tipo Contrato Por Tipo Banco Disco Por Con Otros Por Con Internet Por Fecha Por Numero Secuenciales Por Genera Texto Por Genera Excel ", jPanelBusquedaProcesoBancoNominaProcesoBancoNomina);
		jTabbedPaneBusquedasProcesoBancoNomina.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoBancoNomina);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();						
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoBancoNomina.gridx = 0;		
			//this.gridBagConstraintsProcesoBancoNomina.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoBancoNomina.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 0;		
		//this.gridBagConstraintsProcesoBancoNomina.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoBancoNomina);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoBancoNomina.gridx = 0;		
			this.gridBagConstraintsProcesoBancoNomina.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoBancoNomina.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);								
		
		
		/*
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		*/		
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoBancoNomina.gridx =0;
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoBancoNomina.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
				
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoBancoNominaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoBancoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoBancoNomina = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoBancoNomina.setLayout(gridaBagLayoutBusquedasParametrosProcesoBancoNomina);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoBancoNomina=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoBancoNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoBancoNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoBancoNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			
			
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		
			
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoBancoNomina.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoBancoNomina.setVisible(false);
		this.jButtonAnterioresProcesoBancoNomina.setVisible(false);
		this.jButtonSiguientesProcesoBancoNomina.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoBancoNomina.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoBancoNomina.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoBancoNomina.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoBancoNomina.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoBancoNomina.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoBancoNomina.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoBancoNomina.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoBancoNomina.setVisible(false);
		this.jComboBoxTiposReportesProcesoBancoNomina.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoBancoNomina.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoBancoNomina.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoBancoNomina.setVisible(false);
		this.jComboBoxTiposAccionesProcesoBancoNomina.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoBancoNomina.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoBancoNomina.setVisible(false);
		
		this.jPanelParametrosReportesProcesoBancoNomina.setVisible(false);
		
		
		this.jTtoolBarProcesoBancoNomina.setVisible(false);
			
		this.jMenuItemAnterioresProcesoBancoNomina.setVisible(false);
		this.jMenuItemSiguientesProcesoBancoNomina.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoBancoNomina.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoBancoNomina.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoBancoNomina.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoBancoNomina.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoBancoNomina.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoBancoNomina.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoBancoNomina.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoBancoNomina.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoBancoNomina.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoBancoNomina.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoBancoNomina;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoBancoNomina() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoBancoNomina = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoBancoNomina.setName("jPanelReporteDinamicoProcesoBancoNomina"); 
		
		this.jPanelReporteDinamicoProcesoBancoNomina.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoBancoNomina.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoBancoNomina.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoBancoNomina.setLayout(gridaBagLayoutReporteDinamicoProcesoBancoNomina);
		
		
		this.jInternalFrameReporteDinamicoProcesoBancoNomina= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoBancoNomina = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoBancoNomina= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoBancoNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoBancoNomina.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoBancoNomina.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoBancoNomina.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoBancoNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoBancoNomina.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoBancoNomina.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoBancoNomina.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoBancoNomina.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoBancoNomina.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoBancoNomina.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Banco Nominas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoBancoNomina = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoBancoNomina.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoBancoNomina.add(this.jLabelColumnasSelectReporteProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoBancoNomina = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoBancoNomina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoBancoNomina.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoBancoNomina.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoBancoNomina.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoBancoNomina.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoBancoNomina=new JScrollPane(this.jListColumnasSelectReporteProcesoBancoNomina);
			
			this.jScrollColumnasSelectReporteProcesoBancoNomina.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoBancoNomina.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoBancoNomina.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoBancoNomina.add(this.jListColumnasSelectReporteProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		this.jPanelReporteDinamicoProcesoBancoNomina.add(this.jScrollColumnasSelectReporteProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoBancoNomina = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoBancoNomina.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoBancoNomina = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoBancoNomina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoBancoNomina.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoBancoNomina.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoBancoNomina.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoBancoNomina.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoBancoNomina=new JScrollPane(this.jListRelacionesSelectReporteProcesoBancoNomina);
			
			this.jScrollRelacionesSelectReporteProcesoBancoNomina.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoBancoNomina.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoBancoNomina.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoBancoNomina = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoBancoNomina = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoBancoNomina = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoBancoNomina = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoBancoNomina.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoBancoNomina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoBancoNomina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoBancoNomina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoBancoNomina = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoBancoNomina.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoBancoNomina.add(this.jLabelGenerarExcelReporteDinamicoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoBancoNomina = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoBancoNomina.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoBancoNomina,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoBancoNomina.setToolTipText("Generar EXCEL"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoBancoNomina.add(this.jButtonGenerarExcelReporteDinamicoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoBancoNomina.add(this.jComboBoxTiposReportesDinamicoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoBancoNomina = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoBancoNomina.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoBancoNomina.add(this.jLabelTiposArchivoReporteDinamicoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoBancoNomina.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoBancoNomina = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoBancoNomina.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoBancoNomina,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoBancoNomina.setToolTipText("Generar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoBancoNomina.add(this.jButtonGenerarReporteDinamicoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoBancoNomina = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoBancoNomina.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoBancoNomina,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoBancoNomina.setToolTipText("Cancelar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoBancoNomina.add(this.jButtonCerrarReporteDinamicoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoBancoNomina = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoBancoNomina= new JScrollPane(jPanelReporteDinamicoProcesoBancoNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoBancoNomina.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoBancoNomina.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoBancoNomina.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Banco Nominas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoBancoNomina.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoBancoNomina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoBancoNomina.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoBancoNomina);
		this.jInternalFrameReporteDinamicoProcesoBancoNomina.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoBancoNomina() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoBancoNomina = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoBancoNomina.setName("jPanelImportacionProcesoBancoNomina"); 
		
		this.jPanelImportacionProcesoBancoNomina.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoBancoNomina.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoBancoNomina.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoBancoNomina.setLayout(gridaBagLayoutImportacionProcesoBancoNomina);
		
		
		this.jInternalFrameImportacionProcesoBancoNomina= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoBancoNomina= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoBancoNomina = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoBancoNomina= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoBancoNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoBancoNomina.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoBancoNomina.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoBancoNomina.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoBancoNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoBancoNomina.setResizable(true);
	    this.jInternalFrameImportacionProcesoBancoNomina.setClosable(true);
	    this.jInternalFrameImportacionProcesoBancoNomina.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoBancoNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoBancoNomina.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoBancoNomina.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoBancoNomina.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoBancoNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoBancoNomina.setResizable(true);
	    this.jInternalFrameImportacionProcesoBancoNomina.setClosable(true);
	    this.jInternalFrameImportacionProcesoBancoNomina.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoBancoNomina.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoBancoNomina.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoBancoNomina.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Banco Nominas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoBancoNomina = new JLabelMe();

		this.jLabelArchivoImportacionProcesoBancoNomina.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoBancoNomina.add(this.jLabelArchivoImportacionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoBancoNomina = new JFileChooser();		
		this.jFileChooserImportacionProcesoBancoNomina.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoBancoNomina = new JButtonMe();
		this.jButtonAbrirImportacionProcesoBancoNomina.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoBancoNomina,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoBancoNomina.setToolTipText("Generar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoBancoNomina.add(this.jButtonAbrirImportacionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoBancoNomina = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoBancoNomina.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoBancoNomina.add(this.jLabelPathArchivoImportacionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoBancoNomina=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoBancoNomina.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoBancoNomina.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoBancoNomina.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoBancoNomina.add(this.jTextFieldPathArchivoImportacionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoBancoNomina = new JButtonMe();
		this.jButtonGenerarImportacionProcesoBancoNomina.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoBancoNomina,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoBancoNomina.setToolTipText("Generar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoBancoNomina.add(this.jButtonGenerarImportacionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoBancoNomina = new JButtonMe();
		this.jButtonCerrarImportacionProcesoBancoNomina.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoBancoNomina,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoBancoNomina.setToolTipText("Cancelar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoBancoNomina.add(this.jButtonCerrarImportacionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoBancoNomina = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoBancoNomina= new JScrollPane(jPanelImportacionProcesoBancoNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoBancoNomina.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoBancoNomina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoBancoNomina.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoBancoNomina);
		this.jInternalFrameImportacionProcesoBancoNomina.getContentPane().add(this.jScrollPanelImportacionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoBancoNomina(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoBancoNomina = new JButtonMe();
			this.jButtonAbrirOrderByProcesoBancoNomina.setText("Orden");
			this.jButtonAbrirOrderByProcesoBancoNomina.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoBancoNomina,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoBancoNomina";
			inputMap = this.jButtonAbrirOrderByProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoBancoNomina"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoBancoNomina = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoBancoNomina.setName("jPanelOrderByProcesoBancoNomina"); 
			
			this.jPanelOrderByProcesoBancoNomina.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoBancoNomina.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoBancoNomina.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoBancoNomina.setLayout(gridaBagLayoutOrderByProcesoBancoNomina);
			
			
			this.jTableDatosProcesoBancoNominaOrderBy = new JTableMe();        
			this.jTableDatosProcesoBancoNominaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoBancoNominaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoBancoNominaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoBancoNominaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoBancoNominaOrderBy.setViewportView(this.jTableDatosProcesoBancoNominaOrderBy);
			this.jTableDatosProcesoBancoNominaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoBancoNominaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoBancoNomina= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoBancoNomina= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoBancoNomina = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoBancoNomina= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoBancoNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoBancoNomina.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoBancoNomina.setTitle("Orden");
			this.jInternalFrameOrderByProcesoBancoNomina.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoBancoNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoBancoNomina.setResizable(true);
			this.jInternalFrameOrderByProcesoBancoNomina.setClosable(true);
			this.jInternalFrameOrderByProcesoBancoNomina.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoBancoNomina.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoBancoNomina.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoBancoNomina.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Banco Nominas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoBancoNomina.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoBancoNomina.ipady =150;
				
			this.jPanelOrderByProcesoBancoNomina.add(jScrollPanelDatosProcesoBancoNominaOrderBy, this.gridBagConstraintsProcesoBancoNomina);//this.jTableDatosProcesoBancoNominaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoBancoNomina = new JButtonMe();
			this.jButtonCerrarOrderByProcesoBancoNomina.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoBancoNomina,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoBancoNomina.setToolTipText("Cancelar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoBancoNomina.add(this.jButtonCerrarOrderByProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoBancoNomina = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoBancoNomina= new JScrollPane(jPanelOrderByProcesoBancoNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoBancoNomina.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoBancoNomina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoBancoNomina.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoBancoNomina);
			
			this.jInternalFrameOrderByProcesoBancoNomina.getContentPane().add(this.jScrollPanelOrderByProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);			
		
		} else {
			this.jButtonAbrirOrderByProcesoBancoNomina = new JButtonMe();
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
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesobanconominaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoBancoNomina.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoBancoNomina.getRowHeight();//ProcesoBancoNominaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoBancoNominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoBancoNomina.isSelected()) {
					iHeightTable=ProcesoBancoNominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoBancoNominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoBancoNominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoBancoNominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoBancoNomina.isSelected()) {
					iHeightTable=ProcesoBancoNominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoBancoNominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoBancoNominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoBancoNomina.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoBancoNomina.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoBancoNomina.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoBancoNomina.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoBancoNomina.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoBancoNomina.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoBancoNomina!=null && this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy()!=null) {
			//if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoBancoNomina.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoBancoNomina.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoBancoNomina.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoBancoNomina.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoBancoNomina.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoBancoNomina.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesobanconominaLogic.getProcesoBancoNominas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesobanconominas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoBancoNomina> TraerProcesoBancoNominaBeans(List<ProcesoBancoNomina> procesobanconominas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoBancoNomina procesobanconomina:procesobanconominas) {
					
				if(!(ProcesoBancoNominaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoBancoNominaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesobanconomina.setsDetalleGeneralEntityReporte(ProcesoBancoNominaConstantesFunciones.getProcesoBancoNominaDescripcion(procesobanconomina));
										
					procesobanconomina.setcon_otros_descripcion(ProcesoBancoNominaConstantesFunciones.getcon_otrosDescripcion(procesobanconomina));procesobanconomina.setcon_internet_descripcion(ProcesoBancoNominaConstantesFunciones.getcon_internetDescripcion(procesobanconomina));procesobanconomina.setgenera_texto_descripcion(ProcesoBancoNominaConstantesFunciones.getgenera_textoDescripcion(procesobanconomina));procesobanconomina.setgenera_excel_descripcion(ProcesoBancoNominaConstantesFunciones.getgenera_excelDescripcion(procesobanconomina));	
					
						
					
				} else  {
							
					//procesobanconomina.setsDetalleGeneralEntityReporte(procesobanconomina.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesobanconominabeans.add(procesobanconominabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesobanconominas;
    }
	//PARA REPORTES FIN
}
