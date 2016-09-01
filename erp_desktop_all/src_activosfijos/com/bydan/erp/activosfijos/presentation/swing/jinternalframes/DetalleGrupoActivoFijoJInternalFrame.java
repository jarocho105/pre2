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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.DetalleGrupoActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class DetalleGrupoActivoFijoJInternalFrame extends DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleGrupoActivoFijo;
	
	protected JMenuBar jmenuBarDetalleGrupoActivoFijo;
	
	protected JMenu jmenuDetalleGrupoActivoFijo;
	protected JMenu jmenuDatosDetalleGrupoActivoFijo;
	protected JMenu jmenuArchivoDetalleGrupoActivoFijo;
	protected JMenu jmenuAccionesDetalleGrupoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleGrupoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsDetalleGrupoActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleGrupoActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleGrupoActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleGrupoActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleGrupoActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostooriginalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostooriginal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledeprenormalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledeprenormal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledepregastonormalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledepregastonormal="";
	
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontablecostooriginalSessionBean;
	public CuentaContableSessionBean cuentacontabledeprenormalSessionBean;
	public CuentaContableSessionBean cuentacontabledepregastonormalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleGrupoActivoFijo> detallegrupoactivofijos;		
	public List<DetalleGrupoActivoFijo> detallegrupoactivofijosEliminados;	
	public List<DetalleGrupoActivoFijo> detallegrupoactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleGrupoActivoFijo;		
	protected JButton jButtonAbrirOrderByDetalleGrupoActivoFijo;
	
	
	//protected JPanel jPanelOrderByDetalleGrupoActivoFijo;
	//public JScrollPane jScrollPanelOrderByDetalleGrupoActivoFijo;	
	//protected JButton jButtonCerrarOrderByDetalleGrupoActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionDetalleGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralDetalleGrupoActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleGrupoActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleGrupoActivoFijo;
	//public JScrollPane jScrollPanelImportacionDetalleGrupoActivoFijo;
	
	
	
	protected JPanel jPanelAccionesDetalleGrupoActivoFijo;
	
    protected JPanel jPanelPaginacionDetalleGrupoActivoFijo;
    protected JPanel jPanelParametrosReportesDetalleGrupoActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesDetalleGrupoActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleGrupoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2DetalleGrupoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3DetalleGrupoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4DetalleGrupoActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5DetalleGrupoActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleGrupoActivoFijo;
	//protected JPanel jPanelImportacionDetalleGrupoActivoFijo;
	
	
	public JTable jTableDatosDetalleGrupoActivoFijo;
	
	
	
	//public JTable jTableDatosDetalleGrupoActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleGrupoActivoFijo;
	protected JButton jButtonDuplicarDetalleGrupoActivoFijo;
	protected JButton jButtonCopiarDetalleGrupoActivoFijo;
	protected JButton jButtonVerFormDetalleGrupoActivoFijo;
	protected JButton jButtonNuevoRelacionesDetalleGrupoActivoFijo;
	protected JButton jButtonModificarDetalleGrupoActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaDetalleGrupoActivoFijo;
	protected JButton jButtonCerrarDetalleGrupoActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionDetalleGrupoActivoFijo;
	protected JButton jButtonProcesarInformacionDetalleGrupoActivoFijo;
	
	
	protected JButton jButtonAnterioresDetalleGrupoActivoFijo;
	protected JButton jButtonSiguientesDetalleGrupoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleGrupoActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoDetalleGrupoActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleGrupoActivoFijo;
	//protected JButton jButtonGenerarImportacionDetalleGrupoActivoFijo;
	//protected JButton jButtonCerrarImportacionDetalleGrupoActivoFijo;
	//protected JFileChooser jFileChooserImportacionDetalleGrupoActivoFijo;
	//protected File fileImportacionDetalleGrupoActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonDuplicarToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarDetalleGrupoActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonCopiarToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonVerFormToolBarDetalleGrupoActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonCerrarToolBarDetalleGrupoActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonAnterioresToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonSiguientesToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarDetalleGrupoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemDuplicarDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleGrupoActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemCopiarDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemVerFormDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemCerrarDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemAnterioresDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemSiguientesDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarDetalleGrupoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleGrupoActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosDetalleGrupoActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleGrupoActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleGrupoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleGrupoActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralDetalleGrupoActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleGrupoActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteDetalleGrupoActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteDetalleGrupoActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleGrupoActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleGrupoActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleGrupoActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleGrupoActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleGrupoActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleGrupoActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleGrupoActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionDetalleGrupoActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionDetalleGrupoActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleGrupoActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleGrupoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleGrupoActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleGrupoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleGrupoActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleGrupoActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleGrupoActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleGrupoActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleGrupoActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleGrupoActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleGrupoActivoFijo;
	public JPanel jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo;
	public JButton jButtonFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo;
	public JPanel jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo;
	public JButton jButtonFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo;
	public JPanel jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo;
	public JButton jButtonFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo;
	
	public JPanel jPanelid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo;
	public JLabel jLabelid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo;
	public JButton jButtonid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableCostoOriginalid_cuenta_contable_costo_originalDetalleGrupoActivoFijo;
	
	public JPanel jPanelid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo;
	public JLabel jLabelid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo;
	public JButton jButtonid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableDepreGastoNormalid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo;
	
	public JPanel jPanelid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo;
	public JLabel jLabelid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo;
	public JButton jButtonid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableDepreNormalid_cuenta_contable_depre_normalDetalleGrupoActivoFijo;
	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleGrupoActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGrupoActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGrupoActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGrupoActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleGrupoActivoFijo)	{
		this.jButtonRecargarInformacionDetalleGrupoActivoFijo = jButtonRecargarInformacionDetalleGrupoActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionDetalleGrupoActivoFijo() {
		return this.jButtonProcesarInformacionDetalleGrupoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleGrupoActivoFijo)	{
		this.jButtonProcesarInformacionDetalleGrupoActivoFijo = jButtonProcesarInformacionDetalleGrupoActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleGrupoActivoFijo() {
		return this.jButtonRecargarInformacionDetalleGrupoActivoFijo;
	}
	
	
	public List<DetalleGrupoActivoFijo> getdetallegrupoactivofijos() {
		return this.detallegrupoactivofijos;
	}

	public void setdetallegrupoactivofijos(List<DetalleGrupoActivoFijo> detallegrupoactivofijos) {
		this.detallegrupoactivofijos = detallegrupoactivofijos;
	}
	
	public List<DetalleGrupoActivoFijo> getdetallegrupoactivofijosAux() {
		return this.detallegrupoactivofijosAux;
	}

	public void setdetallegrupoactivofijosAux(List<DetalleGrupoActivoFijo> detallegrupoactivofijosAux) {
		this.detallegrupoactivofijosAux = detallegrupoactivofijosAux;
	}
	
	public List<DetalleGrupoActivoFijo> getdetallegrupoactivofijosEliminados() {
		return this.detallegrupoactivofijosEliminados;
	}

	public void setDetalleGrupoActivoFijosEliminados(List<DetalleGrupoActivoFijo> detallegrupoactivofijosEliminados) {
		this.detallegrupoactivofijosEliminados = detallegrupoactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleGrupoActivoFijo() {
		return jComboBoxTiposSeleccionarDetalleGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleGrupoActivoFijo(
			JComboBox jComboBoxTiposSeleccionarDetalleGrupoActivoFijo) {
		this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo = jComboBoxTiposSeleccionarDetalleGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleGrupoActivoFijo() {
		return jTextFieldValorCampoGeneralDetalleGrupoActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralDetalleGrupoActivoFijo(
			JTextField jTextFieldValorCampoGeneralDetalleGrupoActivoFijo) {
		this.jTextFieldValorCampoGeneralDetalleGrupoActivoFijo = jTextFieldValorCampoGeneralDetalleGrupoActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralDetalleGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleGrupoActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleGrupoActivoFijo() {
		return this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosDetalleGrupoActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo) {
		this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo = jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosDetalleGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleGrupoActivoFijo() {
		return this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo;
	}

	public void setjCheckBoxSeleccionadosDetalleGrupoActivoFijo(
			JCheckBox jCheckBoxSeleccionadosDetalleGrupoActivoFijo) {
		this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo = jCheckBoxSeleccionadosDetalleGrupoActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosDetalleGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleGrupoActivoFijo() {
		return this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleGrupoActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo) {
		this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo = jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleGrupoActivoFijo() {
		return this.jComboBoxTiposReportesDetalleGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleGrupoActivoFijo(
			JComboBox jComboBoxTiposReportesDetalleGrupoActivoFijo) {
		this.jComboBoxTiposReportesDetalleGrupoActivoFijo = jComboBoxTiposReportesDetalleGrupoActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo = jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo = jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesDetalleGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleGrupoActivoFijo() {
		return this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleGrupoActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo) {
		this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo = jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleGrupoActivoFijo() {
		return this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleGrupoActivoFijo(
			JComboBox jComboBoxTiposPaginacionDetalleGrupoActivoFijo) {
		this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo = jComboBoxTiposPaginacionDetalleGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleGrupoActivoFijo() {
		return this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleGrupoActivoFijo() {
		return this.jComboBoxTiposAccionesDetalleGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleGrupoActivoFijo(
			JComboBox jComboBoxTiposRelacionesDetalleGrupoActivoFijo) {
		this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo = jComboBoxTiposRelacionesDetalleGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleGrupoActivoFijo(
			JComboBox jComboBoxTiposAccionesDetalleGrupoActivoFijo) {
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo = jComboBoxTiposAccionesDetalleGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleGrupoActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoDetalleGrupoActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleGrupoActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleGrupoActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoDetalleGrupoActivoFijo = jCheckBoxConGraficoDinamicoDetalleGrupoActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleGrupoActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleGrupoActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleGrupoActivoFijo .setBorder(borderResaltar);		
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
		this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
		
		this.detallegrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallegrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleGrupoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Grupo Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleGrupoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGrupoActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"copiar","copiar","Copiar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"ver_form","ver_form","Ver"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"recargar","recargar","Recargar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,
							"cerrar","cerrar","Salir"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleGrupoActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleGrupoActivoFijo;
			
				this.jButtonProcesarInformacionToolBarDetalleGrupoActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleGrupoActivoFijo;
				
		//protected JButton jButtonModificarToolBarDetalleGrupoActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleGrupoActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleGrupoActivoFijo=new JMenuMe("General");
		this.jmenuArchivoDetalleGrupoActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleGrupoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosDetalleGrupoActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleGrupoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleGrupoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleGrupoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleGrupoActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleGrupoActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleGrupoActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleGrupoActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleGrupoActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleGrupoActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleGrupoActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleGrupoActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleGrupoActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleGrupoActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleGrupoActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleGrupoActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleGrupoActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleGrupoActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleGrupoActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleGrupoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleGrupoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleGrupoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleGrupoActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleGrupoActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleGrupoActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleGrupoActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleGrupoActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleGrupoActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleGrupoActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleGrupoActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleGrupoActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleGrupoActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleGrupoActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleGrupoActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleGrupoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleGrupoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleGrupoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleGrupoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleGrupoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleGrupoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleGrupoActivoFijo.add(this.jMenuItemCerrarDetalleGrupoActivoFijo);
			
			this.jmenuAccionesDetalleGrupoActivoFijo.add(this.jMenuItemNuevoDetalleGrupoActivoFijo);
			this.jmenuAccionesDetalleGrupoActivoFijo.add(this.jMenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo);
			this.jmenuAccionesDetalleGrupoActivoFijo.add(this.jMenuItemNuevoRelacionesDetalleGrupoActivoFijo);
			this.jmenuAccionesDetalleGrupoActivoFijo.add(this.jMenuItemGuardarCambiosTablaDetalleGrupoActivoFijo);		
			this.jmenuAccionesDetalleGrupoActivoFijo.add(this.jMenuItemDuplicarDetalleGrupoActivoFijo);		
			this.jmenuAccionesDetalleGrupoActivoFijo.add(this.jMenuItemCopiarDetalleGrupoActivoFijo);		
			this.jmenuAccionesDetalleGrupoActivoFijo.add(this.jMenuItemVerFormDetalleGrupoActivoFijo);		
			
			this.jmenuDatosDetalleGrupoActivoFijo.add(this.jMenuItemRecargarInformacionDetalleGrupoActivoFijo);				
			this.jmenuDatosDetalleGrupoActivoFijo.add(this.jMenuItemAnterioresDetalleGrupoActivoFijo);				
			this.jmenuDatosDetalleGrupoActivoFijo.add(this.jMenuItemSiguientesDetalleGrupoActivoFijo);				
			this.jmenuDatosDetalleGrupoActivoFijo.add(this.jMenuItemAbrirOrderByDetalleGrupoActivoFijo);				
			this.jmenuDatosDetalleGrupoActivoFijo.add(this.jMenuItemMostrarOcultarDetalleGrupoActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleGrupoActivoFijo.add(this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleGrupoActivoFijo.add(this.jmenuArchivoDetalleGrupoActivoFijo);		
			this.jmenuBarDetalleGrupoActivoFijo.add(this.jmenuAccionesDetalleGrupoActivoFijo);		
			this.jmenuBarDetalleGrupoActivoFijo.add(this.jmenuDatosDetalleGrupoActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleGrupoActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleGrupoActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setToolTipText("Buscar Por Cuenta Contable Costo Original ");
		this.jButtonFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo= new JButtonMe();
		this.jButtonFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setText("Buscar");
		this.jButtonFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setToolTipText("Buscar Por Cuenta Contable Costo Original ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo,"buscar_button","Buscar Por Cuenta Contable Costo Original ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo = new JLabelMe();
		jLabelid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setText("Cuenta Contable Costo Original :");
		jLabelid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setToolTipText("Cuenta Contable Costo Original");
		jLabelid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableCostoOriginalid_cuenta_contable_costo_originalDetalleGrupoActivoFijo= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableCostoOriginalid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCostoOriginalid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCostoOriginalid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableCostoOriginalid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCostoOriginalid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCostoOriginalid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setFocusable(false);

		this.jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setToolTipText("Buscar Por Cuenta Contable Depre Gasto Normal ");
		this.jButtonFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo= new JButtonMe();
		this.jButtonFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setText("Buscar");
		this.jButtonFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setToolTipText("Buscar Por Cuenta Contable Depre Gasto Normal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo,"buscar_button","Buscar Por Cuenta Contable Depre Gasto Normal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo = new JLabelMe();
		jLabelid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setText("Cuenta Contable Depre Gasto Normal :");
		jLabelid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setToolTipText("Cuenta Contable Depre Gasto Normal");
		jLabelid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo= new JComboBoxMe();
		jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableDepreGastoNormalid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableDepreGastoNormalid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDepreGastoNormalid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDepreGastoNormalid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableDepreGastoNormalid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDepreGastoNormalid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDepreGastoNormalid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setFocusable(false);

		this.jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setToolTipText("Buscar Por Cuenta Contable Depre Normal ");
		this.jButtonFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo= new JButtonMe();
		this.jButtonFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setText("Buscar");
		this.jButtonFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setToolTipText("Buscar Por Cuenta Contable Depre Normal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo,"buscar_button","Buscar Por Cuenta Contable Depre Normal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo = new JLabelMe();
		jLabelid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setText("Cuenta Contable Depre Normal :");
		jLabelid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setToolTipText("Cuenta Contable Depre Normal");
		jLabelid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo= new JComboBoxMe();
		jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableDepreNormalid_cuenta_contable_depre_normalDetalleGrupoActivoFijo= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableDepreNormalid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDepreNormalid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDepreNormalid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableDepreNormalid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDepreNormalid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDepreNormalid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setFocusable(false);


		this.jTabbedPaneBusquedasDetalleGrupoActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleGrupoActivoFijo = new DetalleGrupoActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Grupo Activo Fijo DATOS");
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo = new DetalleGrupoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones(),this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo = null;//new DetalleGrupoActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleGrupoActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosDetalleGrupoActivoFijo = new JTableMe();      
		
		String sToolTipDetalleGrupoActivoFijo="";
		sToolTipDetalleGrupoActivoFijo=DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleGrupoActivoFijo+="(ActivosFijos.DetalleGrupoActivoFijo)";
		}
		
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleGrupoActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleGrupoActivoFijo.setToolTipText(sToolTipDetalleGrupoActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleGrupoActivoFijo);
		this.jTableDatosDetalleGrupoActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleGrupoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleGrupoActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosDetalleGrupoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonDuplicarDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonCopiarDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonVerFormDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleGrupoActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarDetalleGrupoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosDetalleGrupoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Grupo Activo Fijo";
		
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Grupo Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleGrupoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesDetalleGrupoActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo=new ReporteDinamicoJInternalFrame(DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleGrupoActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleGrupoActivoFijo=new ImportacionJInternalFrame(DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleGrupoActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleGrupoActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleGrupoActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByDetalleGrupoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleGrupoActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleGrupoActivoFijo,false,this);
			
			//this.cargarOrderByDetalleGrupoActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleGrupoActivoFijo,true,this);
			
			//this.cargarOrderByDetalleGrupoActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleGrupoActivoFijo.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleGrupoActivoFijo.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleGrupoActivoFijo.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosDetalleGrupoActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleGrupoActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleGrupoActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleGrupoActivoFijo.setText("Nuevo");
		this.jButtonDuplicarDetalleGrupoActivoFijo.setText("Duplicar");
		this.jButtonCopiarDetalleGrupoActivoFijo.setText("Copiar");
		this.jButtonVerFormDetalleGrupoActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.setText("Guardar");
		this.jButtonCerrarDetalleGrupoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleGrupoActivoFijo,"nuevo_button","Nuevo",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleGrupoActivoFijo,"duplicar_button","Duplicar",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleGrupoActivoFijo,"copiar_button","Copiar",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleGrupoActivoFijo,"ver_form","Ver",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleGrupoActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo,"guardarcambiostabla_button","Guardar",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleGrupoActivoFijo,"cerrar_button","Salir",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleGrupoActivoFijo.setToolTipText("Nuevo"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleGrupoActivoFijo.setToolTipText("Duplicar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleGrupoActivoFijo.setToolTipText("Copiar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleGrupoActivoFijo.setToolTipText("Ver"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.setToolTipText("Nuevo Rel"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.setToolTipText("Guardar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleGrupoActivoFijo.setToolTipText("Salir"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleGrupoActivoFijo";
		inputMap = this.jButtonNuevoDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleGrupoActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleGrupoActivoFijo";
		inputMap = this.jButtonDuplicarDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleGrupoActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarDetalleGrupoActivoFijo";
		inputMap = this.jButtonCopiarDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleGrupoActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleGrupoActivoFijo";
		inputMap = this.jButtonVerFormDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleGrupoActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleGrupoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleGrupoActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleGrupoActivoFijo";
		inputMap = this.jButtonModificarDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleGrupoActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleGrupoActivoFijo";
		inputMap = this.jButtonCerrarDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleGrupoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleGrupoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleGrupoActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleGrupoActivoFijo.setName("jPanelParametrosReportesDetalleGrupoActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleGrupoActivoFijo.setName("jPanelParametrosReportesAccionesDetalleGrupoActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionDetalleGrupoActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionDetalleGrupoActivoFijo.setToolTipText("Recargar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleGrupoActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionDetalleGrupoActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionDetalleGrupoActivoFijo.setToolTipText("Procesar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleGrupoActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleGrupoActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleGrupoActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleGrupoActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleGrupoActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleGrupoActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleGrupoActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleGrupoActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleGrupoActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleGrupoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesDetalleGrupoActivoFijo.setText("Acciones");		
		this.jLabelAccionesDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleGrupoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleGrupoActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleGrupoActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleGrupoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleGrupoActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleGrupoActivoFijo = new JButtonMe();
		//this.jButtonAnterioresDetalleGrupoActivoFijo.setText("<<");
        this.jButtonAnterioresDetalleGrupoActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleGrupoActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleGrupoActivoFijo = new JButtonMe();
		//this.jButtonSiguientesDetalleGrupoActivoFijo.setText(">>");
        this.jButtonSiguientesDetalleGrupoActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleGrupoActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo,"nuevoguardarcambios_button","Nue",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleGrupoActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleGrupoActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleGrupoActivoFijo";
		inputMap = this.jButtonRecargarInformacionDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleGrupoActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleGrupoActivoFijo";
		inputMap = this.jButtonSiguientesDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleGrupoActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleGrupoActivoFijo";
		inputMap = this.jButtonAnterioresDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleGrupoActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleGrupoActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),DetalleGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),DetalleGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),DetalleGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleGrupoActivoFijo = new GridBagLayout();

			this.jPanelPaginacionDetalleGrupoActivoFijo.setLayout(gridaBagLayoutPaginacionDetalleGrupoActivoFijo);						
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleGrupoActivoFijo.add(this.jButtonAnterioresDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
					
						
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
			
			this.jPanelPaginacionDetalleGrupoActivoFijo.add(this.jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
						
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
			this.jPanelPaginacionDetalleGrupoActivoFijo.add(this.jButtonSiguientesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleGrupoActivoFijo.add(this.jButtonNuevoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 1;
				this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionDetalleGrupoActivoFijo.add(this.jButtonNuevoRelacionesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			}
			
			
			if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 1;
				this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleGrupoActivoFijo.add(this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			}
			
			
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleGrupoActivoFijo.add(this.jButtonDuplicarDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleGrupoActivoFijo.add(this.jButtonCopiarDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleGrupoActivoFijo.add(this.jButtonVerFormDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleGrupoActivoFijo.add(this.jButtonCerrarDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		
		
		
		this.jButtonRecargarInformacionDetalleGrupoActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleGrupoActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleGrupoActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleGrupoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleGrupoActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleGrupoActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleGrupoActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleGrupoActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleGrupoActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleGrupoActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleGrupoActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleGrupoActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.setLayout(gridaBagParametrosReportesDetalleGrupoActivoFijo);
			this.jPanelParametrosReportesAccionesDetalleGrupoActivoFijo.setLayout(gridaBagParametrosReportesAccionesDetalleGrupoActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1DetalleGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar1DetalleGrupoActivoFijo);
			this.jPanelParametrosAuxiliar2DetalleGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar2DetalleGrupoActivoFijo);
			this.jPanelParametrosAuxiliar3DetalleGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar3DetalleGrupoActivoFijo);
			this.jPanelParametrosAuxiliar4DetalleGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar4DetalleGrupoActivoFijo);
			//this.jPanelParametrosAuxiliar5DetalleGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar2DetalleGrupoActivoFijo);			
			
			
			
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jButtonRecargarInformacionDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleGrupoActivoFijo.add(this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleGrupoActivoFijo.add(this.jCheckBoxConAltoMaximoTablaDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleGrupoActivoFijo.add(this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jPanelParametrosAuxiliar1DetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleGrupoActivoFijo.add(this.jComboBoxTiposReportesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jPanelParametrosAuxiliar4DetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jComboBoxTiposReportesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jCheckBoxGenerarReporteDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jPanelParametrosAuxiliar2DetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jLabelAccionesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jButtonAbrirOrderByDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);			
			
			
			/*
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleGrupoActivoFijo.add(this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);															
				
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleGrupoActivoFijo.add(this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jPanelParametrosAuxiliar3DetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
				
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jComboBoxTiposAccionesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
	
				
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.add(this.jTextFieldValorCampoGeneralDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleGrupoActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosDetalleGrupoActivoFijo.setLayout(gridaBagLayoutDatosDetalleGrupoActivoFijo);
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosDetalleGrupoActivoFijo.add(this.jTableDatosDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleGrupoActivoFijo.setViewportView(this.jTableDatosDetalleGrupoActivoFijo);
		this.jTableDatosDetalleGrupoActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosDetalleGrupoActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleGrupoActivoFijo= new GridBagLayout();
		this.jPanelAccionesDetalleGrupoActivoFijo.setLayout(gridaBagLayoutAccionesDetalleGrupoActivoFijo);
		
		
		/*	
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
			
		this.jPanelAccionesDetalleGrupoActivoFijo.add(this.jButtonNuevoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setLayout(gridaBagLayoutFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);

		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
		jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.add(jLabelid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);

		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx = 1;
		jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.add(jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);


		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
		jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.add(this.jButtonBuscarFK_IdCuentaContableCostoOriginalid_cuenta_contable_costo_originalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);

		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 1;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx =1;
		jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.add(jButtonFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);

		jTabbedPaneBusquedasDetalleGrupoActivoFijo.addTab("1.-Por Cuenta Contable Costo Original ", jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);
		jTabbedPaneBusquedasDetalleGrupoActivoFijo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setLayout(gridaBagLayoutFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);

		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
		jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.add(jLabelid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);

		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx = 1;
		jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.add(jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);


		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
		jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.add(this.jButtonBuscarFK_IdCuentaContableDepreGastoNormalid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);

		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 1;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx =1;
		jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.add(jButtonFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);

		jTabbedPaneBusquedasDetalleGrupoActivoFijo.addTab("2.-Por Cuenta Contable Depre Gasto Normal ", jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);
		jTabbedPaneBusquedasDetalleGrupoActivoFijo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setLayout(gridaBagLayoutFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);

		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
		jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.add(jLabelid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);

		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx = 1;
		jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.add(jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);


		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
		jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.add(this.jButtonBuscarFK_IdCuentaContableDepreNormalid_cuenta_contable_depre_normalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);

		gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGrupoActivoFijo.gridy = 1;
		gridBagConstraintsDetalleGrupoActivoFijo.gridx =1;
		jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.add(jButtonFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);

		jTabbedPaneBusquedasDetalleGrupoActivoFijo.addTab("3.-Por Cuenta Contable Depre Normal ", jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);
		jTabbedPaneBusquedasDetalleGrupoActivoFijo.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleGrupoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleGrupoActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsDetalleGrupoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;		
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleGrupoActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);								
		
		
		/*
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		*/		
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleGrupoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
				
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(DetalleGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleGrupoActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleGrupoActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosDetalleGrupoActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			
			
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		
			
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleGrupoActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleGrupoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.setName("jPanelReporteDinamicoDetalleGrupoActivoFijo"); 
		
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.setLayout(gridaBagLayoutReporteDinamicoDetalleGrupoActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleGrupoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleGrupoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Grupo Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleGrupoActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleGrupoActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jLabelColumnasSelectReporteDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleGrupoActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleGrupoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleGrupoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleGrupoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleGrupoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleGrupoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleGrupoActivoFijo=new JScrollPane(this.jListColumnasSelectReporteDetalleGrupoActivoFijo);
			
			this.jScrollColumnasSelectReporteDetalleGrupoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleGrupoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleGrupoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jListColumnasSelectReporteDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jScrollColumnasSelectReporteDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleGrupoActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleGrupoActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jLabelRelacionesSelectReporteDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleGrupoActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleGrupoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleGrupoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleGrupoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleGrupoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleGrupoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleGrupoActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteDetalleGrupoActivoFijo);
			
			this.jScrollRelacionesSelectReporteDetalleGrupoActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleGrupoActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleGrupoActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jListRelacionesSelectReporteDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jScrollRelacionesSelectReporteDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoDetalleGrupoActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleGrupoActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleGrupoActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleGrupoActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleGrupoActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijo.setToolTipText("Generar EXCEL"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jComboBoxTiposReportesDinamicoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleGrupoActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleGrupoActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleGrupoActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleGrupoActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleGrupoActivoFijo.setToolTipText("Generar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jButtonGenerarReporteDinamicoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleGrupoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleGrupoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleGrupoActivoFijo.setToolTipText("Cancelar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleGrupoActivoFijo.add(this.jButtonCerrarReporteDinamicoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleGrupoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleGrupoActivoFijo= new JScrollPane(jPanelReporteDinamicoDetalleGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Grupo Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleGrupoActivoFijo);
		this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleGrupoActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleGrupoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleGrupoActivoFijo.setName("jPanelImportacionDetalleGrupoActivoFijo"); 
		
		this.jPanelImportacionDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleGrupoActivoFijo.setLayout(gridaBagLayoutImportacionDetalleGrupoActivoFijo);
		
		
		this.jInternalFrameImportacionDetalleGrupoActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleGrupoActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleGrupoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleGrupoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleGrupoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleGrupoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleGrupoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleGrupoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionDetalleGrupoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionDetalleGrupoActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleGrupoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleGrupoActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleGrupoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleGrupoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionDetalleGrupoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionDetalleGrupoActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Grupo Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleGrupoActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionDetalleGrupoActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleGrupoActivoFijo.add(this.jLabelArchivoImportacionDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleGrupoActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionDetalleGrupoActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionDetalleGrupoActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleGrupoActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleGrupoActivoFijo.setToolTipText("Generar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleGrupoActivoFijo.add(this.jButtonAbrirImportacionDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleGrupoActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleGrupoActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleGrupoActivoFijo.add(this.jLabelPathArchivoImportacionDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleGrupoActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleGrupoActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleGrupoActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleGrupoActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleGrupoActivoFijo.add(this.jTextFieldPathArchivoImportacionDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionDetalleGrupoActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleGrupoActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleGrupoActivoFijo.setToolTipText("Generar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleGrupoActivoFijo.add(this.jButtonGenerarImportacionDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionDetalleGrupoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleGrupoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleGrupoActivoFijo.setToolTipText("Cancelar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleGrupoActivoFijo.add(this.jButtonCerrarImportacionDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleGrupoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleGrupoActivoFijo= new JScrollPane(jPanelImportacionDetalleGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleGrupoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleGrupoActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleGrupoActivoFijo);
		this.jInternalFrameImportacionDetalleGrupoActivoFijo.getContentPane().add(this.jScrollPanelImportacionDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleGrupoActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleGrupoActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByDetalleGrupoActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByDetalleGrupoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleGrupoActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleGrupoActivoFijo";
			inputMap = this.jButtonAbrirOrderByDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleGrupoActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleGrupoActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleGrupoActivoFijo.setName("jPanelOrderByDetalleGrupoActivoFijo"); 
			
			this.jPanelOrderByDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleGrupoActivoFijo.setLayout(gridaBagLayoutOrderByDetalleGrupoActivoFijo);
			
			
			this.jTableDatosDetalleGrupoActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosDetalleGrupoActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleGrupoActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleGrupoActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleGrupoActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleGrupoActivoFijoOrderBy.setViewportView(this.jTableDatosDetalleGrupoActivoFijoOrderBy);
			this.jTableDatosDetalleGrupoActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleGrupoActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleGrupoActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleGrupoActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleGrupoActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleGrupoActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.setResizable(true);
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.setClosable(true);
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Grupo Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleGrupoActivoFijo.ipady =150;
				
			this.jPanelOrderByDetalleGrupoActivoFijo.add(jScrollPanelDatosDetalleGrupoActivoFijoOrderBy, this.gridBagConstraintsDetalleGrupoActivoFijo);//this.jTableDatosDetalleGrupoActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleGrupoActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByDetalleGrupoActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleGrupoActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleGrupoActivoFijo.setToolTipText("Cancelar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleGrupoActivoFijo.add(this.jButtonCerrarOrderByDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleGrupoActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleGrupoActivoFijo= new JScrollPane(jPanelOrderByDetalleGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleGrupoActivoFijo);
			
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.getContentPane().add(this.jScrollPanelOrderByDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByDetalleGrupoActivoFijo = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleGrupoActivoFijo.getRowHeight();//DetalleGrupoActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleGrupoActivoFijo.isSelected()) {
					iHeightTable=DetalleGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleGrupoActivoFijo.isSelected()) {
					iHeightTable=DetalleGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleGrupoActivoFijo!=null && this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallegrupoactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleGrupoActivoFijo> TraerDetalleGrupoActivoFijoBeans(List<DetalleGrupoActivoFijo> detallegrupoactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleGrupoActivoFijo detallegrupoactivofijo:detallegrupoactivofijos) {
					
				if(!(DetalleGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallegrupoactivofijo.setsDetalleGeneralEntityReporte(DetalleGrupoActivoFijoConstantesFunciones.getDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijo));
										
						
					
					

					if(detallegrupoactivofijo.getDetalleActivoFijos()!=null && Funciones.existeClass(classes,DetalleActivoFijo.class)) {
						try{detallegrupoactivofijo.setdetalleactivofijosDescripcionReporte(new JRBeanCollectionDataSource(DetalleActivoFijoJInternalFrame.TraerDetalleActivoFijoBeans(detallegrupoactivofijo.getDetalleActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detallegrupoactivofijo.getCuentaContaDetaGrupoActis()!=null && Funciones.existeClass(classes,CuentaContaDetaGrupoActi.class)) {
						try{detallegrupoactivofijo.setcuentacontadetagrupoactisDescripcionReporte(new JRBeanCollectionDataSource(CuentaContaDetaGrupoActiJInternalFrame.TraerCuentaContaDetaGrupoActiBeans(detallegrupoactivofijo.getCuentaContaDetaGrupoActis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detallegrupoactivofijo.getSubGrupoActivoFijos()!=null && Funciones.existeClass(classes,SubGrupoActivoFijo.class)) {
						try{detallegrupoactivofijo.setsubgrupoactivofijosDescripcionReporte(new JRBeanCollectionDataSource(SubGrupoActivoFijoJInternalFrame.TraerSubGrupoActivoFijoBeans(detallegrupoactivofijo.getSubGrupoActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detallegrupoactivofijo.getGastoDepreciacions()!=null && Funciones.existeClass(classes,GastoDepreciacion.class)) {
						try{detallegrupoactivofijo.setgastodepreciacionsDescripcionReporte(new JRBeanCollectionDataSource(GastoDepreciacionJInternalFrame.TraerGastoDepreciacionBeans(detallegrupoactivofijo.getGastoDepreciacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//detallegrupoactivofijo.setsDetalleGeneralEntityReporte(detallegrupoactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallegrupoactivofijobeans.add(detallegrupoactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallegrupoactivofijos;
    }
	//PARA REPORTES FIN
}
