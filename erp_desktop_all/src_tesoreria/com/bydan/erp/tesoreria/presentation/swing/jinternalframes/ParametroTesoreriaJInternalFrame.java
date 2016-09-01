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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.ParametroTesoreriaConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class ParametroTesoreriaJInternalFrame extends ParametroTesoreriaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroTesoreria;
	
	protected JMenuBar jmenuBarParametroTesoreria;
	
	protected JMenu jmenuParametroTesoreria;
	protected JMenu jmenuDatosParametroTesoreria;
	protected JMenu jmenuArchivoParametroTesoreria;
	protected JMenu jmenuAccionesParametroTesoreria;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroTesoreria;	
	protected GridBagConstraints gridBagConstraintsParametroTesoreria;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroTesoreriaDetalleFormJInternalFrame jInternalFrameDetalleFormParametroTesoreria;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroTesoreria;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroTesoreria;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TransaccionBeanSwingJInternalFrame transaccioncobrarpagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncobrarpago="";

	protected TransaccionBeanSwingJInternalFrame transaccioncobrardebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncobrardebito="";

	protected TransaccionBeanSwingJInternalFrame transaccioncobrarcreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncobrarcredito="";

	protected TransaccionBeanSwingJInternalFrame transaccionpagarpagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionpagarpago="";

	protected TransaccionBeanSwingJInternalFrame transaccionpagardebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionpagardebito="";

	protected TransaccionBeanSwingJInternalFrame transaccionpagarcreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionpagarcredito="";
	
	public ParametroTesoreriaSessionBean parametrotesoreriaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccioncobrarpagoSessionBean;
	public TransaccionSessionBean transaccioncobrardebitoSessionBean;
	public TransaccionSessionBean transaccioncobrarcreditoSessionBean;
	public TransaccionSessionBean transaccionpagarpagoSessionBean;
	public TransaccionSessionBean transaccionpagardebitoSessionBean;
	public TransaccionSessionBean transaccionpagarcreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroTesoreria> parametrotesorerias;		
	public List<ParametroTesoreria> parametrotesoreriasEliminados;	
	public List<ParametroTesoreria> parametrotesoreriasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroTesoreria;		
	protected JButton jButtonAbrirOrderByParametroTesoreria;
	
	
	//protected JPanel jPanelOrderByParametroTesoreria;
	//public JScrollPane jScrollPanelOrderByParametroTesoreria;	
	//protected JButton jButtonCerrarOrderByParametroTesoreria;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroTesoreriaLogic parametrotesoreriaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroTesoreria;
	public JScrollPane jScrollPanelDatosEdicionParametroTesoreria;
	public JScrollPane jScrollPanelDatosGeneralParametroTesoreria;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroTesoreriaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroTesoreria;
	//public JScrollPane jScrollPanelImportacionParametroTesoreria;
	
	
	
	protected JPanel jPanelAccionesParametroTesoreria;
	
    protected JPanel jPanelPaginacionParametroTesoreria;
    protected JPanel jPanelParametrosReportesParametroTesoreria;
	protected JPanel jPanelParametrosReportesAccionesParametroTesoreria;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralParametroTesoreria;
	protected Integer iXPanelCamposIniciogeneralParametroTesoreria=0;
	protected Integer iYPanelCamposIniciogeneralParametroTesoreria=0;

	protected JPanel jPanelCamposIniciocuentas_por_cobrarParametroTesoreria;
	protected Integer iXPanelCamposIniciocuentas_por_cobrarParametroTesoreria=0;
	protected Integer iYPanelCamposIniciocuentas_por_cobrarParametroTesoreria=0;

	protected JPanel jPanelCamposIniciocuentas_por_pagarParametroTesoreria;
	protected Integer iXPanelCamposIniciocuentas_por_pagarParametroTesoreria=0;
	protected Integer iYPanelCamposIniciocuentas_por_pagarParametroTesoreria=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroTesoreria;
	protected JPanel jPanelParametrosAuxiliar2ParametroTesoreria;
	protected JPanel jPanelParametrosAuxiliar3ParametroTesoreria;
	protected JPanel jPanelParametrosAuxiliar4ParametroTesoreria;
	//protected JPanel jPanelParametrosAuxiliar5ParametroTesoreria;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroTesoreria;
	//protected JPanel jPanelImportacionParametroTesoreria;
	
	
	public JTable jTableDatosParametroTesoreria;
	
	
	
	//public JTable jTableDatosParametroTesoreriaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroTesoreria;
	protected JButton jButtonDuplicarParametroTesoreria;
	protected JButton jButtonCopiarParametroTesoreria;
	protected JButton jButtonVerFormParametroTesoreria;
	protected JButton jButtonNuevoRelacionesParametroTesoreria;
	protected JButton jButtonModificarParametroTesoreria;
	
    protected JButton jButtonGuardarCambiosTablaParametroTesoreria;
	protected JButton jButtonCerrarParametroTesoreria;
	
	
	protected JButton jButtonRecargarInformacionParametroTesoreria;
	protected JButton jButtonProcesarInformacionParametroTesoreria;
	
	
	protected JButton jButtonAnterioresParametroTesoreria;
	protected JButton jButtonSiguientesParametroTesoreria;
	protected JButton jButtonNuevoGuardarCambiosParametroTesoreria;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroTesoreria;
	//protected JButton jButtonCerrarReporteDinamicoParametroTesoreria;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroTesoreria;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroTesoreria;
	//protected JButton jButtonGenerarImportacionParametroTesoreria;
	//protected JButton jButtonCerrarImportacionParametroTesoreria;
	//protected JFileChooser jFileChooserImportacionParametroTesoreria;
	//protected File fileImportacionParametroTesoreria;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroTesoreria;
	protected JButton jButtonDuplicarToolBarParametroTesoreria;
	protected JButton jButtonNuevoRelacionesToolBarParametroTesoreria;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroTesoreria;
	protected JButton jButtonCopiarToolBarParametroTesoreria;
	protected JButton jButtonVerFormToolBarParametroTesoreria;
	public JButton jButtonGuardarCambiosTablaToolBarParametroTesoreria;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroTesoreria;
	protected JButton jButtonCerrarToolBarParametroTesoreria;
	
	protected JButton jButtonRecargarInformacionToolBarParametroTesoreria;
	protected JButton jButtonProcesarInformacionToolBarParametroTesoreria;
	protected JButton jButtonAnterioresToolBarParametroTesoreria;
	protected JButton jButtonSiguientesToolBarParametroTesoreria;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroTesoreria;
	protected JButton jButtonAbrirOrderByToolBarParametroTesoreria;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroTesoreria;
	protected JMenuItem jMenuItemDuplicarParametroTesoreria;
	protected JMenuItem jMenuItemNuevoRelacionesParametroTesoreria;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroTesoreria;
	protected JMenuItem jMenuItemCopiarParametroTesoreria;
	protected JMenuItem jMenuItemVerFormParametroTesoreria;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroTesoreria;
	protected JMenuItem jMenuItemCerrarParametroTesoreria;
	protected JMenuItem jMenuItemDetalleCerrarParametroTesoreria;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroTesoreria;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroTesoreria;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroTesoreria;
	protected JMenuItem jMenuItemProcesarInformacionParametroTesoreria;
	protected JMenuItem jMenuItemAnterioresParametroTesoreria;
	protected JMenuItem jMenuItemSiguientesParametroTesoreria;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroTesoreria;
	protected JMenuItem jMenuItemAbrirOrderByParametroTesoreria;
	protected JMenuItem jMenuItemMostrarOcultarParametroTesoreria;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroTesoreria;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroTesoreria;
	protected JCheckBox jCheckBoxSeleccionadosParametroTesoreria;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroTesoreria;
	protected JCheckBox jCheckBoxConGraficoReporteParametroTesoreria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroTesoreria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroTesoreria;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroTesoreria;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroTesoreria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroTesoreria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroTesoreria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroTesoreria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroTesoreria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroTesoreria;
	protected JTextField jTextFieldValorCampoGeneralParametroTesoreria;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroTesoreria;
	//public JList<Reporte> jListColumnasSelectReporteParametroTesoreria;
	//public JScrollPane jScrollColumnasSelectReporteParametroTesoreria;
	
	//public JLabel jLabelRelacionesSelectReporteParametroTesoreria;
	//public JList<Reporte> jListRelacionesSelectReporteParametroTesoreria;
	//public JScrollPane jScrollRelacionesSelectReporteParametroTesoreria;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroTesoreria;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroTesoreria;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroTesoreria;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroTesoreria;
	
		
	//public JLabel jLabelArchivoImportacionParametroTesoreria;	
	//public JLabel jLabelPathArchivoImportacionParametroTesoreria;
	//protected JTextField jTextFieldPathArchivoImportacionParametroTesoreria;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroTesoreria;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroTesoreria;
	
	//public JLabel jLabelColumnaCategoriaValorParametroTesoreria;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroTesoreria;
	
	//public JLabel jLabelColumnasValoresGraficoParametroTesoreria;
	//public JList<Reporte> jListColumnasValoresGraficoParametroTesoreria;
	//public JScrollPane jScrollColumnasValoresGraficoParametroTesoreria;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroTesoreria;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroTesoreria;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroTesoreria;
	public JPanel jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria;
	public JButton jButtonFK_IdTransaccionCobrarCreditoParametroTesoreria;
	public JPanel jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria;
	public JButton jButtonFK_IdTransaccionCobrarDebitoParametroTesoreria;
	public JPanel jPanelFK_IdTransaccionCobrarPagoParametroTesoreria;
	public JButton jButtonFK_IdTransaccionCobrarPagoParametroTesoreria;
	public JPanel jPanelFK_IdTransaccionPagarCreditoParametroTesoreria;
	public JButton jButtonFK_IdTransaccionPagarCreditoParametroTesoreria;
	public JPanel jPanelFK_IdTransaccionPagarDebitoParametroTesoreria;
	public JButton jButtonFK_IdTransaccionPagarDebitoParametroTesoreria;
	public JPanel jPanelFK_IdTransaccionPagarPagoParametroTesoreria;
	public JButton jButtonFK_IdTransaccionPagarPagoParametroTesoreria;
	
	public JPanel jPanelid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria;
	public JLabel jLabelid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria;
	public JButton jButtonid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreriaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria;
	public JLabel jLabelid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria;
	public JButton jButtonid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreriaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria;
	public JLabel jLabelid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria;
	public JButton jButtonid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreriaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria;
	public JLabel jLabelid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria;
	public JButton jButtonid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreriaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria;
	public JLabel jLabelid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria;
	public JButton jButtonid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreriaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria;
	public JLabel jLabelid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria;
	public JButton jButtonid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreriaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroTesoreriaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroTesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroTesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroTesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroTesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroTesoreria)	{
		this.jButtonRecargarInformacionParametroTesoreria = jButtonRecargarInformacionParametroTesoreria;
	}
	
	public JButton getjButtonProcesarInformacionParametroTesoreria() {
		return this.jButtonProcesarInformacionParametroTesoreria;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroTesoreria)	{
		this.jButtonProcesarInformacionParametroTesoreria = jButtonProcesarInformacionParametroTesoreria;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroTesoreria() {
		return this.jButtonRecargarInformacionParametroTesoreria;
	}
	
	
	public List<ParametroTesoreria> getparametrotesorerias() {
		return this.parametrotesorerias;
	}

	public void setparametrotesorerias(List<ParametroTesoreria> parametrotesorerias) {
		this.parametrotesorerias = parametrotesorerias;
	}
	
	public List<ParametroTesoreria> getparametrotesoreriasAux() {
		return this.parametrotesoreriasAux;
	}

	public void setparametrotesoreriasAux(List<ParametroTesoreria> parametrotesoreriasAux) {
		this.parametrotesoreriasAux = parametrotesoreriasAux;
	}
	
	public List<ParametroTesoreria> getparametrotesoreriasEliminados() {
		return this.parametrotesoreriasEliminados;
	}

	public void setParametroTesoreriasEliminados(List<ParametroTesoreria> parametrotesoreriasEliminados) {
		this.parametrotesoreriasEliminados = parametrotesoreriasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroTesoreria() {
		return jComboBoxTiposSeleccionarParametroTesoreria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroTesoreria(
			JComboBox jComboBoxTiposSeleccionarParametroTesoreria) {
		this.jComboBoxTiposSeleccionarParametroTesoreria = jComboBoxTiposSeleccionarParametroTesoreria;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroTesoreria .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroTesoreria() {
		return jTextFieldValorCampoGeneralParametroTesoreria;
	}

	public void setjTextFieldValorCampoGeneralParametroTesoreria(
			JTextField jTextFieldValorCampoGeneralParametroTesoreria) {
		this.jTextFieldValorCampoGeneralParametroTesoreria = jTextFieldValorCampoGeneralParametroTesoreria;
	}

	public void setBorderResaltarValorCampoGeneralParametroTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreria.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroTesoreria .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroTesoreria() {
		return this.jCheckBoxSeleccionarTodosParametroTesoreria;
	}

	public void setjCheckBoxSeleccionarTodosParametroTesoreria(
			JCheckBox jCheckBoxSeleccionarTodosParametroTesoreria) {
		this.jCheckBoxSeleccionarTodosParametroTesoreria = jCheckBoxSeleccionarTodosParametroTesoreria;
	}

	public void setBorderResaltarSeleccionarTodosParametroTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreria.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroTesoreria .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroTesoreria() {
		return this.jCheckBoxSeleccionadosParametroTesoreria;
	}

	public void setjCheckBoxSeleccionadosParametroTesoreria(
			JCheckBox jCheckBoxSeleccionadosParametroTesoreria) {
		this.jCheckBoxSeleccionadosParametroTesoreria = jCheckBoxSeleccionadosParametroTesoreria;
	}
	
	public void setBorderResaltarSeleccionadosParametroTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreria.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroTesoreria .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroTesoreria() {
		return this.jComboBoxTiposArchivosReportesParametroTesoreria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroTesoreria(
			JComboBox jComboBoxTiposArchivosReportesParametroTesoreria) {
		this.jComboBoxTiposArchivosReportesParametroTesoreria = jComboBoxTiposArchivosReportesParametroTesoreria;
	}

	public void setBorderResaltarTiposArchivosReportesParametroTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroTesoreria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroTesoreria() {
		return this.jComboBoxTiposReportesParametroTesoreria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroTesoreria(
			JComboBox jComboBoxTiposReportesParametroTesoreria) {
		this.jComboBoxTiposReportesParametroTesoreria = jComboBoxTiposReportesParametroTesoreria;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroTesoreria() {
	//	return jComboBoxTiposReportesDinamicoParametroTesoreria;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroTesoreria(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroTesoreria) {
	//	this.jComboBoxTiposReportesDinamicoParametroTesoreria = jComboBoxTiposReportesDinamicoParametroTesoreria;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroTesoreria() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroTesoreria;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroTesoreria(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroTesoreria) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreria = jComboBoxTiposArchivosReportesDinamicoParametroTesoreria;
	//}
	
	public void setBorderResaltarTiposReportesParametroTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroTesoreria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroTesoreria() {
		return this.jComboBoxTiposGraficosReportesParametroTesoreria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroTesoreria(
			JComboBox jComboBoxTiposGraficosReportesParametroTesoreria) {
		this.jComboBoxTiposGraficosReportesParametroTesoreria = jComboBoxTiposGraficosReportesParametroTesoreria;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroTesoreria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroTesoreria() {
		return this.jComboBoxTiposPaginacionParametroTesoreria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroTesoreria(
			JComboBox jComboBoxTiposPaginacionParametroTesoreria) {
		this.jComboBoxTiposPaginacionParametroTesoreria = jComboBoxTiposPaginacionParametroTesoreria;
	}
	
	public void setBorderResaltarTiposPaginacionParametroTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroTesoreria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroTesoreria() {
		return this.jComboBoxTiposRelacionesParametroTesoreria;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroTesoreria() {
		return this.jComboBoxTiposAccionesParametroTesoreria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroTesoreria(
			JComboBox jComboBoxTiposRelacionesParametroTesoreria) {
		this.jComboBoxTiposRelacionesParametroTesoreria = jComboBoxTiposRelacionesParametroTesoreria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroTesoreria(
			JComboBox jComboBoxTiposAccionesParametroTesoreria) {
		this.jComboBoxTiposAccionesParametroTesoreria = jComboBoxTiposAccionesParametroTesoreria;
	}
	
	public void setBorderResaltarTiposRelacionesParametroTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroTesoreria .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroTesoreria .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroTesoreria() {
	//	return jCheckBoxConGraficoDinamicoParametroTesoreria;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroTesoreria(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroTesoreria) {
	//	this.jCheckBoxConGraficoDinamicoParametroTesoreria = jCheckBoxConGraficoDinamicoParametroTesoreria;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroTesoreria() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroTesoreria.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroTesoreria .setBorder(borderResaltar);		
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
		this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
		
		this.parametrotesoreriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrotesoreriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrotesoreriaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroTesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroTesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroTesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroTesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroTesoreriaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Tesoreria MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroTesoreriaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroTesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroTesoreria= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"nuevo","nuevo","Nuevo"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"duplicar","duplicar","Duplicar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"copiar","copiar","Copiar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"ver_form","ver_form","Ver"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"recargar","recargar","Recargar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroTesoreria,this.jTtoolBarParametroTesoreria,
							"cerrar","cerrar","Salir"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroTesoreria=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroTesoreria;
			
				this.jButtonProcesarInformacionToolBarParametroTesoreria=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroTesoreria;
				
		//protected JButton jButtonModificarToolBarParametroTesoreria;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroTesoreria=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroTesoreria=new JMenuMe("General");
		this.jmenuArchivoParametroTesoreria=new JMenuMe("Archivo");
		this.jmenuAccionesParametroTesoreria=new JMenuMe("Acciones");
		this.jmenuDatosParametroTesoreria=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroTesoreria= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroTesoreria.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroTesoreria,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroTesoreria= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroTesoreria.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroTesoreria,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroTesoreria= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroTesoreria.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroTesoreria,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroTesoreria= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroTesoreria.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroTesoreria,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroTesoreria= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroTesoreria.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroTesoreria,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroTesoreria= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroTesoreria.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroTesoreria,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroTesoreria= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroTesoreria.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroTesoreria,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroTesoreria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroTesoreria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroTesoreria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroTesoreria= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroTesoreria.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroTesoreria,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroTesoreria= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroTesoreria.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroTesoreria,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroTesoreria= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroTesoreria.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroTesoreria,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroTesoreria= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroTesoreria.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroTesoreria,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroTesoreria= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroTesoreria.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroTesoreria,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroTesoreria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroTesoreria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroTesoreria,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroTesoreria= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroTesoreria.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroTesoreria,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroTesoreria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroTesoreria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroTesoreria,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroTesoreria= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroTesoreria.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroTesoreria,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroTesoreria.add(this.jMenuItemCerrarParametroTesoreria);
			
			this.jmenuAccionesParametroTesoreria.add(this.jMenuItemNuevoParametroTesoreria);
			this.jmenuAccionesParametroTesoreria.add(this.jMenuItemNuevoGuardarCambiosParametroTesoreria);
			this.jmenuAccionesParametroTesoreria.add(this.jMenuItemNuevoRelacionesParametroTesoreria);
			this.jmenuAccionesParametroTesoreria.add(this.jMenuItemGuardarCambiosTablaParametroTesoreria);		
			this.jmenuAccionesParametroTesoreria.add(this.jMenuItemDuplicarParametroTesoreria);		
			this.jmenuAccionesParametroTesoreria.add(this.jMenuItemCopiarParametroTesoreria);		
			this.jmenuAccionesParametroTesoreria.add(this.jMenuItemVerFormParametroTesoreria);		
			
			this.jmenuDatosParametroTesoreria.add(this.jMenuItemRecargarInformacionParametroTesoreria);				
			this.jmenuDatosParametroTesoreria.add(this.jMenuItemAnterioresParametroTesoreria);				
			this.jmenuDatosParametroTesoreria.add(this.jMenuItemSiguientesParametroTesoreria);				
			this.jmenuDatosParametroTesoreria.add(this.jMenuItemAbrirOrderByParametroTesoreria);				
			this.jmenuDatosParametroTesoreria.add(this.jMenuItemMostrarOcultarParametroTesoreria);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroTesoreria.add(this.jMenuItemGuardarCambiosParametroTesoreria);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroTesoreria.add(this.jmenuArchivoParametroTesoreria);		
			this.jmenuBarParametroTesoreria.add(this.jmenuAccionesParametroTesoreria);		
			this.jmenuBarParametroTesoreria.add(this.jmenuDatosParametroTesoreria);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroTesoreria);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroTesoreria() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria.setToolTipText("Buscar Por Transaccion Credito ");
		this.jButtonFK_IdTransaccionCobrarCreditoParametroTesoreria= new JButtonMe();
		this.jButtonFK_IdTransaccionCobrarCreditoParametroTesoreria.setText("Buscar");
		this.jButtonFK_IdTransaccionCobrarCreditoParametroTesoreria.setToolTipText("Buscar Por Transaccion Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCobrarCreditoParametroTesoreria,"buscar_button","Buscar Por Transaccion Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCobrarCreditoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria = new JLabelMe();
		jLabelid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setText("Transaccion Credito :");
		jLabelid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setToolTipText("Transaccion Credito");
		jLabelid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria.setToolTipText("Buscar Por Transaccion Debito ");
		this.jButtonFK_IdTransaccionCobrarDebitoParametroTesoreria= new JButtonMe();
		this.jButtonFK_IdTransaccionCobrarDebitoParametroTesoreria.setText("Buscar");
		this.jButtonFK_IdTransaccionCobrarDebitoParametroTesoreria.setToolTipText("Buscar Por Transaccion Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCobrarDebitoParametroTesoreria,"buscar_button","Buscar Por Transaccion Debito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCobrarDebitoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria = new JLabelMe();
		jLabelid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setText("Transaccion Debito :");
		jLabelid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setToolTipText("Transaccion Debito");
		jLabelid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionCobrarPagoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCobrarPagoParametroTesoreria.setToolTipText("Buscar Por Transaccion Pago ");
		this.jButtonFK_IdTransaccionCobrarPagoParametroTesoreria= new JButtonMe();
		this.jButtonFK_IdTransaccionCobrarPagoParametroTesoreria.setText("Buscar");
		this.jButtonFK_IdTransaccionCobrarPagoParametroTesoreria.setToolTipText("Buscar Por Transaccion Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCobrarPagoParametroTesoreria,"buscar_button","Buscar Por Transaccion Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCobrarPagoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria = new JLabelMe();
		jLabelid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setText("Transaccion Pago :");
		jLabelid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setToolTipText("Transaccion Pago");
		jLabelid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionPagarCreditoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionPagarCreditoParametroTesoreria.setToolTipText("Buscar Por Transaccion Credito. ");
		this.jButtonFK_IdTransaccionPagarCreditoParametroTesoreria= new JButtonMe();
		this.jButtonFK_IdTransaccionPagarCreditoParametroTesoreria.setText("Buscar");
		this.jButtonFK_IdTransaccionPagarCreditoParametroTesoreria.setToolTipText("Buscar Por Transaccion Credito. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionPagarCreditoParametroTesoreria,"buscar_button","Buscar Por Transaccion Credito. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionPagarCreditoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria = new JLabelMe();
		jLabelid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setText("Transaccion Credito. :");
		jLabelid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setToolTipText("Transaccion Credito.");
		jLabelid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionPagarDebitoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionPagarDebitoParametroTesoreria.setToolTipText("Buscar Por Transaccion Debito. ");
		this.jButtonFK_IdTransaccionPagarDebitoParametroTesoreria= new JButtonMe();
		this.jButtonFK_IdTransaccionPagarDebitoParametroTesoreria.setText("Buscar");
		this.jButtonFK_IdTransaccionPagarDebitoParametroTesoreria.setToolTipText("Buscar Por Transaccion Debito. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionPagarDebitoParametroTesoreria,"buscar_button","Buscar Por Transaccion Debito. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionPagarDebitoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria = new JLabelMe();
		jLabelid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setText("Transaccion Debito. :");
		jLabelid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setToolTipText("Transaccion Debito.");
		jLabelid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionPagarPagoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionPagarPagoParametroTesoreria.setToolTipText("Buscar Por Transaccion Pago. ");
		this.jButtonFK_IdTransaccionPagarPagoParametroTesoreria= new JButtonMe();
		this.jButtonFK_IdTransaccionPagarPagoParametroTesoreria.setText("Buscar");
		this.jButtonFK_IdTransaccionPagarPagoParametroTesoreria.setToolTipText("Buscar Por Transaccion Pago. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionPagarPagoParametroTesoreria,"buscar_button","Buscar Por Transaccion Pago. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionPagarPagoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria = new JLabelMe();
		jLabelid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setText("Transaccion Pago. :");
		jLabelid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setToolTipText("Transaccion Pago.");
		jLabelid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroTesoreria=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroTesoreria.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroTesoreria.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroTesoreria.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroTesoreria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroTesoreria = new ParametroTesoreriaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Tesoreria DATOS");
			this.jInternalFrameDetalleFormParametroTesoreria = new ParametroTesoreriaDetalleFormJInternalFrame(jDesktopPane,this.parametrotesoreriaSessionBean.getConGuardarRelaciones(),this.parametrotesoreriaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroTesoreria = null;//new ParametroTesoreriaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroTesoreria= new GridBagLayout();
		
		
		this.jTableDatosParametroTesoreria = new JTableMe();      
		
		String sToolTipParametroTesoreria="";
		sToolTipParametroTesoreria=ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroTesoreria+="(Tesoreria.ParametroTesoreria)";
		}
		
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroTesoreria+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroTesoreria.setToolTipText(sToolTipParametroTesoreria);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroTesoreria);
		this.jTableDatosParametroTesoreria.setAutoCreateRowSorter(true);
		this.jTableDatosParametroTesoreria.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroTesoreria.setRowSelectionAllowed(true);
		this.jTableDatosParametroTesoreria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroTesoreria = new JButtonMe();
		this.jButtonDuplicarParametroTesoreria = new JButtonMe();
		this.jButtonCopiarParametroTesoreria = new JButtonMe();
		this.jButtonVerFormParametroTesoreria = new JButtonMe();
		this.jButtonNuevoRelacionesParametroTesoreria = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroTesoreria = new JButtonMe();
		this.jButtonCerrarParametroTesoreria = new JButtonMe();
		
		this.jScrollPanelDatosParametroTesoreria = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroTesoreria = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Parametro Tesoreria";
		
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesorerias" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroTesoreria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroTesoreria.setToolTipText("Acciones");
        this.jPanelAccionesParametroTesoreria.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroTesoreria.setName("jPanelCamposFingeneralParametroTesoreria");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Por Cobrar"));
		this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria.setName("jPanelCamposFincuentas_por_cobrarParametroTesoreria");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Por Pagar"));
		this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria.setName("jPanelCamposFincuentas_por_pagarParametroTesoreria");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroTesoreria=new ReporteDinamicoJInternalFrame(ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroTesoreria();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroTesoreria=new ImportacionJInternalFrame(ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroTesoreria();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroTesoreria = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroTesoreria.setText("Orden");
		this.jButtonAbrirOrderByParametroTesoreria.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroTesoreria,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroTesoreria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroTesoreria,false,this);
			
			//this.cargarOrderByParametroTesoreria(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroTesoreria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroTesoreria,true,this);
			
			//this.cargarOrderByParametroTesoreria(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroTesoreria.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosParametroTesoreria.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosParametroTesoreria.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosParametroTesoreria.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroTesoreria.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroTesoreria.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroTesoreria.setText("Nuevo");
		this.jButtonDuplicarParametroTesoreria.setText("Duplicar");
		this.jButtonCopiarParametroTesoreria.setText("Copiar");
		this.jButtonVerFormParametroTesoreria.setText("Ver");
		this.jButtonNuevoRelacionesParametroTesoreria.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroTesoreria.setText("Guardar");
		this.jButtonCerrarParametroTesoreria.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroTesoreria,"nuevo_button","Nuevo",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroTesoreria,"duplicar_button","Duplicar",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroTesoreria,"copiar_button","Copiar",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroTesoreria,"ver_form","Ver",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroTesoreria,"nuevorelaciones_button","Nuevo Rel",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroTesoreria,"guardarcambiostabla_button","Guardar",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroTesoreria,"cerrar_button","Salir",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroTesoreria.setToolTipText("Nuevo"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroTesoreria.setToolTipText("Duplicar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroTesoreria.setToolTipText("Copiar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroTesoreria.setToolTipText("Ver"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroTesoreria.setToolTipText("Nuevo Rel"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroTesoreria.setToolTipText("Guardar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroTesoreria.setToolTipText("Salir"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroTesoreria";
		inputMap = this.jButtonNuevoParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroTesoreria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroTesoreria"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroTesoreria";
		inputMap = this.jButtonDuplicarParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroTesoreria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroTesoreria"));
		
		//COPIAR
		sMapKey = "CopiarParametroTesoreria";
		inputMap = this.jButtonCopiarParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroTesoreria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroTesoreria"));
		
		//VEr FORM
		sMapKey = "VerFormParametroTesoreria";
		inputMap = this.jButtonVerFormParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroTesoreria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroTesoreria"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroTesoreria";
		inputMap = this.jButtonNuevoRelacionesParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroTesoreria"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroTesoreria";
		inputMap = this.jButtonModificarParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroTesoreria"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroTesoreria";
		inputMap = this.jButtonCerrarParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroTesoreria"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroTesoreria";
		inputMap = this.jButtonGuardarCambiosTablaParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroTesoreria"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroTesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroTesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroTesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroTesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroTesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroTesoreria.setName("jPanelParametrosReportesParametroTesoreria"); 
		
		this.jPanelParametrosReportesAccionesParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroTesoreria.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroTesoreria.setName("jPanelParametrosReportesAccionesParametroTesoreria"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroTesoreria = new JButtonMe();
		this.jButtonRecargarInformacionParametroTesoreria.setText("Recargar");
		this.jButtonRecargarInformacionParametroTesoreria.setToolTipText("Recargar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroTesoreria,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroTesoreria = new JButtonMe();
		this.jButtonProcesarInformacionParametroTesoreria.setText("Procesar");
		this.jButtonProcesarInformacionParametroTesoreria.setToolTipText("Procesar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroTesoreria.setVisible(false);
			
		this.jButtonProcesarInformacionParametroTesoreria.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroTesoreria.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroTesoreria.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroTesoreria.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroTesoreria.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroTesoreria.setText("TIPO");       
		this.jComboBoxTiposReportesParametroTesoreria.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroTesoreria.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroTesoreria.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroTesoreria.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroTesoreria.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroTesoreria.setText("Accion");
		this.jComboBoxTiposRelacionesParametroTesoreria.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroTesoreria.setText("Accion");
		this.jComboBoxTiposAccionesParametroTesoreria.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroTesoreria.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroTesoreria.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroTesoreria=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroTesoreria.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroTesoreria.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroTesoreria.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroTesoreria = new JLabelMe();
		
		this.jLabelAccionesParametroTesoreria.setText("Acciones");		
		this.jLabelAccionesParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroTesoreria = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroTesoreria.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroTesoreria.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroTesoreria = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroTesoreria.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroTesoreria.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroTesoreria = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroTesoreria.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroTesoreria.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroTesoreria = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroTesoreria.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroTesoreria.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroTesoreria = new JButtonMe();
		//this.jButtonAnterioresParametroTesoreria.setText("<<");
        this.jButtonAnterioresParametroTesoreria.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroTesoreria,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroTesoreria = new JButtonMe();
		//this.jButtonSiguientesParametroTesoreria.setText(">>");
        this.jButtonSiguientesParametroTesoreria.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroTesoreria,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroTesoreria = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroTesoreria.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroTesoreria.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroTesoreria,"nuevoguardarcambios_button","Nue",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroTesoreria";
		inputMap = this.jButtonNuevoGuardarCambiosParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroTesoreria"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroTesoreria";
		inputMap = this.jButtonRecargarInformacionParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroTesoreria"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroTesoreria";
		inputMap = this.jButtonSiguientesParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroTesoreria"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroTesoreria";
		inputMap = this.jButtonAnterioresParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroTesoreria"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroTesoreria();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroTesoreria.setMinimumSize(new Dimension(this.getWidth(),ParametroTesoreriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroTesoreriaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroTesoreria.setMaximumSize(new Dimension(this.getWidth(),ParametroTesoreriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroTesoreriaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroTesoreria.setPreferredSize(new Dimension(this.getWidth(),ParametroTesoreriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroTesoreriaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroTesoreria = new GridBagLayout();

			this.jPanelPaginacionParametroTesoreria.setLayout(gridaBagLayoutPaginacionParametroTesoreria);						
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy = 0;
			this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroTesoreria.add(this.jButtonAnterioresParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
					
						
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroTesoreria.gridy = 0;
			
			this.jPanelPaginacionParametroTesoreria.add(this.jButtonNuevoGuardarCambiosParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
						
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroTesoreria.gridy = 0;
			this.jPanelPaginacionParametroTesoreria.add(this.jButtonSiguientesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy = 1;
			this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroTesoreria.add(this.jButtonNuevoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
						
			
			
			if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
				this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroTesoreria.gridy = 1;
				this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroTesoreria.add(this.jButtonGuardarCambiosTablaParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			}
			
			
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy = 1;
			this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroTesoreria.add(this.jButtonDuplicarParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy = 1;
			this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroTesoreria.add(this.jButtonCopiarParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy = 1;
			this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroTesoreria.add(this.jButtonVerFormParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy = 1;
			this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroTesoreria.add(this.jButtonCerrarParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		
		
		
		this.jButtonRecargarInformacionParametroTesoreria.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroTesoreria.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroTesoreria.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroTesoreria.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroTesoreria.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroTesoreria.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroTesoreria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroTesoreria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroTesoreria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroTesoreria.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroTesoreria.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroTesoreria.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroTesoreria.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroTesoreria.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroTesoreria.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroTesoreria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroTesoreria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroTesoreria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroTesoreria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroTesoreria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroTesoreria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroTesoreria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroTesoreria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroTesoreria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroTesoreria.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroTesoreria.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroTesoreria.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroTesoreria.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroTesoreria.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroTesoreria.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroTesoreria.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroTesoreria.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroTesoreria.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroTesoreria.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroTesoreria.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroTesoreria.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroTesoreria = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroTesoreria = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroTesoreria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroTesoreria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroTesoreria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroTesoreria = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroTesoreria.setLayout(gridaBagParametrosReportesParametroTesoreria);
			this.jPanelParametrosReportesAccionesParametroTesoreria.setLayout(gridaBagParametrosReportesAccionesParametroTesoreria);
			
			
			this.jPanelParametrosAuxiliar1ParametroTesoreria.setLayout(gridaBagParametrosAuxiliar1ParametroTesoreria);
			this.jPanelParametrosAuxiliar2ParametroTesoreria.setLayout(gridaBagParametrosAuxiliar2ParametroTesoreria);
			this.jPanelParametrosAuxiliar3ParametroTesoreria.setLayout(gridaBagParametrosAuxiliar3ParametroTesoreria);
			this.jPanelParametrosAuxiliar4ParametroTesoreria.setLayout(gridaBagParametrosAuxiliar4ParametroTesoreria);
			//this.jPanelParametrosAuxiliar5ParametroTesoreria.setLayout(gridaBagParametrosAuxiliar2ParametroTesoreria);			
			
			
			
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroTesoreria.add(this.jButtonRecargarInformacionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroTesoreria.add(this.jComboBoxTiposPaginacionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroTesoreria.add(this.jCheckBoxConAltoMaximoTablaParametroTesoreria, this.gridBagConstraintsParametroTesoreria);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroTesoreria.add(this.jComboBoxTiposArchivosReportesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroTesoreria.add(this.jPanelParametrosAuxiliar1ParametroTesoreria, this.gridBagConstraintsParametroTesoreria);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroTesoreria.add(this.jComboBoxTiposReportesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroTesoreria.add(this.jPanelParametrosAuxiliar4ParametroTesoreria, this.gridBagConstraintsParametroTesoreria);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroTesoreria.add(this.jComboBoxTiposReportesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroTesoreria.add(this.jCheckBoxGenerarReporteParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroTesoreria.add(this.jPanelParametrosAuxiliar2ParametroTesoreria, this.gridBagConstraintsParametroTesoreria);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroTesoreria.add(this.jLabelAccionesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
				this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroTesoreria.add(this.jButtonAbrirOrderByParametroTesoreria, this.gridBagConstraintsParametroTesoreria);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroTesoreria.add(this.jComboBoxTiposSeleccionarParametroTesoreria, this.gridBagConstraintsParametroTesoreria);			
			
			
			/*
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroTesoreria.add(this.jCheckBoxSeleccionarTodosParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroTesoreria.add(this.jCheckBoxSeleccionarTodosParametroTesoreria, this.gridBagConstraintsParametroTesoreria);															
				
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroTesoreria.add(this.jCheckBoxSeleccionadosParametroTesoreria, this.gridBagConstraintsParametroTesoreria);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroTesoreria.add(this.jPanelParametrosAuxiliar3ParametroTesoreria, this.gridBagConstraintsParametroTesoreria);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroTesoreria.add(this.jComboBoxTiposAccionesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
	
				
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroTesoreria.add(this.jTextFieldValorCampoGeneralParametroTesoreria, this.gridBagConstraintsParametroTesoreria);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroTesoreria= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroTesoreria.setLayout(gridaBagLayoutCamposIniciogeneralParametroTesoreria);

		GridBagLayout gridaBagLayoutCamposIniciocuentas_por_cobrarParametroTesoreria= new GridBagLayout();
		this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria.setLayout(gridaBagLayoutCamposIniciocuentas_por_cobrarParametroTesoreria);

		GridBagLayout gridaBagLayoutCamposIniciocuentas_por_pagarParametroTesoreria= new GridBagLayout();
		this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria.setLayout(gridaBagLayoutCamposIniciocuentas_por_pagarParametroTesoreria);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroTesoreria = new GridBagLayout();

			this.jScrollPanelDatosParametroTesoreria.setLayout(gridaBagLayoutDatosParametroTesoreria);
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy = 0;
			this.gridBagConstraintsParametroTesoreria.gridx = 0;
			
			this.jScrollPanelDatosParametroTesoreria.add(this.jTableDatosParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroTesoreria.setViewportView(this.jTableDatosParametroTesoreria);
		this.jTableDatosParametroTesoreria.setFillsViewportHeight(true);
		this.jTableDatosParametroTesoreria.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroTesoreria= new GridBagLayout();
		this.jPanelAccionesParametroTesoreria.setLayout(gridaBagLayoutAccionesParametroTesoreria);
		
		
		/*	
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 0;
			
		this.jPanelAccionesParametroTesoreria.add(this.jButtonNuevoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroTesoreria = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroTesoreria);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();						
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroTesoreria.gridx = 0;		
			//this.gridBagConstraintsParametroTesoreria.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroTesoreria.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroTesoreria, this.gridBagConstraintsParametroTesoreria);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroTesoreria.gridx = 0;		
		//this.gridBagConstraintsParametroTesoreria.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroTesoreria.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroTesoreria);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreria.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);								
		
		
		/*
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreria.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		*/		
		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroTesoreria.gridx =0;
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroTesoreria.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
				
		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreria.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroTesoreriaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroTesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroTesoreria = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroTesoreria.setLayout(gridaBagLayoutBusquedasParametrosParametroTesoreria);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroTesoreria=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroTesoreria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroTesoreria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroTesoreria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			
			
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		
			
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreria.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroTesoreria;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroTesoreria() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroTesoreria = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroTesoreria.setName("jPanelReporteDinamicoParametroTesoreria"); 
		
		this.jPanelReporteDinamicoParametroTesoreria.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroTesoreria.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroTesoreria.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroTesoreria.setLayout(gridaBagLayoutReporteDinamicoParametroTesoreria);
		
		
		this.jInternalFrameReporteDinamicoParametroTesoreria= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroTesoreria = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroTesoreria= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroTesoreria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroTesoreria.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroTesoreria.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroTesoreria.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroTesoreria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroTesoreria.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroTesoreria.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroTesoreria.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroTesoreria.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroTesoreria.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroTesoreria.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesorerias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroTesoreria = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroTesoreria.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroTesoreria.add(this.jLabelColumnasSelectReporteParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroTesoreria = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroTesoreria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroTesoreria.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroTesoreria.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroTesoreria.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroTesoreria.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroTesoreria=new JScrollPane(this.jListColumnasSelectReporteParametroTesoreria);
			
			this.jScrollColumnasSelectReporteParametroTesoreria.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroTesoreria.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroTesoreria.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroTesoreria.add(this.jListColumnasSelectReporteParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		this.jPanelReporteDinamicoParametroTesoreria.add(this.jScrollColumnasSelectReporteParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroTesoreria = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroTesoreria.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroTesoreria = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroTesoreria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroTesoreria.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroTesoreria.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroTesoreria.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroTesoreria.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroTesoreria=new JScrollPane(this.jListRelacionesSelectReporteParametroTesoreria);
			
			this.jScrollRelacionesSelectReporteParametroTesoreria.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroTesoreria.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroTesoreria.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroTesoreria = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroTesoreria = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroTesoreria = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroTesoreria = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroTesoreria.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroTesoreria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroTesoreria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroTesoreria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreria = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreria.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroTesoreria = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroTesoreria.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroTesoreria.add(this.jLabelGenerarExcelReporteDinamicoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroTesoreria = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroTesoreria.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroTesoreria,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroTesoreria.setToolTipText("Generar EXCEL"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroTesoreria.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroTesoreria.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroTesoreria.add(this.jButtonGenerarExcelReporteDinamicoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroTesoreria.add(this.jComboBoxTiposReportesDinamicoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroTesoreria = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroTesoreria.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroTesoreria.add(this.jLabelTiposArchivoReporteDinamicoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroTesoreria.add(this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroTesoreria = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroTesoreria.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroTesoreria,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroTesoreria.setToolTipText("Generar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroTesoreria.add(this.jButtonGenerarReporteDinamicoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroTesoreria = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroTesoreria.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroTesoreria,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroTesoreria.setToolTipText("Cancelar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroTesoreria.add(this.jButtonCerrarReporteDinamicoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroTesoreria = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroTesoreria= new JScrollPane(jPanelReporteDinamicoParametroTesoreria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroTesoreria.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroTesoreria.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroTesoreria.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesorerias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroTesoreria.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroTesoreria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroTesoreria.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroTesoreria);
		this.jInternalFrameReporteDinamicoParametroTesoreria.getContentPane().add(this.jScrollPanelReporteDinamicoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroTesoreria() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroTesoreria = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroTesoreria.setName("jPanelImportacionParametroTesoreria"); 
		
		this.jPanelImportacionParametroTesoreria.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroTesoreria.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroTesoreria.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroTesoreria.setLayout(gridaBagLayoutImportacionParametroTesoreria);
		
		
		this.jInternalFrameImportacionParametroTesoreria= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroTesoreria= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroTesoreria = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroTesoreria= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroTesoreria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroTesoreria.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroTesoreria.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroTesoreria.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroTesoreria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroTesoreria.setResizable(true);
	    this.jInternalFrameImportacionParametroTesoreria.setClosable(true);
	    this.jInternalFrameImportacionParametroTesoreria.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroTesoreria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroTesoreria.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroTesoreria.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroTesoreria.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroTesoreria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroTesoreria.setResizable(true);
	    this.jInternalFrameImportacionParametroTesoreria.setClosable(true);
	    this.jInternalFrameImportacionParametroTesoreria.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroTesoreria.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroTesoreria.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroTesoreria.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesorerias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroTesoreria = new JLabelMe();

		this.jLabelArchivoImportacionParametroTesoreria.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroTesoreria.add(this.jLabelArchivoImportacionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroTesoreria = new JFileChooser();		
		this.jFileChooserImportacionParametroTesoreria.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroTesoreria = new JButtonMe();
		this.jButtonAbrirImportacionParametroTesoreria.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroTesoreria,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroTesoreria.setToolTipText("Generar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroTesoreria.add(this.jButtonAbrirImportacionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroTesoreria = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroTesoreria.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroTesoreria.add(this.jLabelPathArchivoImportacionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroTesoreria=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroTesoreria.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroTesoreria.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroTesoreria.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroTesoreria.add(this.jTextFieldPathArchivoImportacionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroTesoreria = new JButtonMe();
		this.jButtonGenerarImportacionParametroTesoreria.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroTesoreria,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroTesoreria.setToolTipText("Generar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroTesoreria.add(this.jButtonGenerarImportacionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroTesoreria = new JButtonMe();
		this.jButtonCerrarImportacionParametroTesoreria.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroTesoreria,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroTesoreria.setToolTipText("Cancelar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroTesoreria.add(this.jButtonCerrarImportacionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroTesoreria = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroTesoreria= new JScrollPane(jPanelImportacionParametroTesoreria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroTesoreria.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroTesoreria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroTesoreria.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroTesoreria);
		this.jInternalFrameImportacionParametroTesoreria.getContentPane().add(this.jScrollPanelImportacionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroTesoreria(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroTesoreria = new JButtonMe();
			this.jButtonAbrirOrderByParametroTesoreria.setText("Orden");
			this.jButtonAbrirOrderByParametroTesoreria.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroTesoreria,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroTesoreria";
			inputMap = this.jButtonAbrirOrderByParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroTesoreria"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroTesoreria = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroTesoreria.setName("jPanelOrderByParametroTesoreria"); 
			
			this.jPanelOrderByParametroTesoreria.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroTesoreria.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroTesoreria.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroTesoreria.setLayout(gridaBagLayoutOrderByParametroTesoreria);
			
			
			this.jTableDatosParametroTesoreriaOrderBy = new JTableMe();        
			this.jTableDatosParametroTesoreriaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroTesoreriaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroTesoreriaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroTesoreriaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroTesoreriaOrderBy.setViewportView(this.jTableDatosParametroTesoreriaOrderBy);
			this.jTableDatosParametroTesoreriaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroTesoreriaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroTesoreria= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroTesoreria= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroTesoreria = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroTesoreria= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroTesoreria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroTesoreria.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroTesoreria.setTitle("Orden");
			this.jInternalFrameOrderByParametroTesoreria.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroTesoreria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroTesoreria.setResizable(true);
			this.jInternalFrameOrderByParametroTesoreria.setClosable(true);
			this.jInternalFrameOrderByParametroTesoreria.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroTesoreria.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroTesoreria.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroTesoreria.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesorerias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroTesoreria.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroTesoreria.ipady =150;
				
			this.jPanelOrderByParametroTesoreria.add(jScrollPanelDatosParametroTesoreriaOrderBy, this.gridBagConstraintsParametroTesoreria);//this.jTableDatosParametroTesoreriaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroTesoreria = new JButtonMe();
			this.jButtonCerrarOrderByParametroTesoreria.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroTesoreria,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroTesoreria.setToolTipText("Cancelar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroTesoreria.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroTesoreria.add(this.jButtonCerrarOrderByParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroTesoreria = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroTesoreria= new JScrollPane(jPanelOrderByParametroTesoreria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroTesoreria.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroTesoreria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroTesoreria.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroTesoreria);
			
			this.jInternalFrameOrderByParametroTesoreria.getContentPane().add(this.jScrollPanelOrderByParametroTesoreria, this.gridBagConstraintsParametroTesoreria);			
		
		} else {
			this.jButtonAbrirOrderByParametroTesoreria = new JButtonMe();
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
		int iWidthTableCalculado=0;//2230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrotesoreriaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroTesoreria.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroTesoreria.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroTesoreria.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroTesoreria.getRowHeight();//ParametroTesoreriaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroTesoreriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroTesoreria.isSelected()) {
					iHeightTable=ParametroTesoreriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroTesoreriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroTesoreriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroTesoreriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroTesoreria.isSelected()) {
					iHeightTable=ParametroTesoreriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroTesoreriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroTesoreriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroTesoreria.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroTesoreria.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroTesoreria.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroTesoreria.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroTesoreria.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroTesoreria.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroTesoreria!=null && this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroTesoreria.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroTesoreria.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroTesoreria.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroTesoreria.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroTesoreria.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroTesoreria.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrotesoreriaLogic.getParametroTesorerias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrotesorerias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroTesoreria> TraerParametroTesoreriaBeans(List<ParametroTesoreria> parametrotesorerias,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroTesoreria parametrotesoreria:parametrotesorerias) {
					
				if(!(ParametroTesoreriaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroTesoreriaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrotesoreria.setsDetalleGeneralEntityReporte(ParametroTesoreriaConstantesFunciones.getParametroTesoreriaDescripcion(parametrotesoreria));
										
					parametrotesoreria.setcon_anticipo_orden_compra_descripcion(ParametroTesoreriaConstantesFunciones.getcon_anticipo_orden_compraDescripcion(parametrotesoreria));parametrotesoreria.setpor_lotes_descripcion(ParametroTesoreriaConstantesFunciones.getpor_lotesDescripcion(parametrotesoreria));	
					
						
					
				} else  {
							
					//parametrotesoreria.setsDetalleGeneralEntityReporte(parametrotesoreria.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrotesoreriabeans.add(parametrotesoreriabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrotesorerias;
    }
	//PARA REPORTES FIN
}
