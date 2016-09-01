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

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.activosfijos.util.MovimientoActivoFijoConstantesFunciones;

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
public class MovimientoActivoFijoJInternalFrame extends MovimientoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMovimientoActivoFijo;
	
	protected JMenuBar jmenuBarMovimientoActivoFijo;
	
	protected JMenu jmenuMovimientoActivoFijo;
	protected JMenu jmenuDatosMovimientoActivoFijo;
	protected JMenu jmenuArchivoMovimientoActivoFijo;
	protected JMenu jmenuAccionesMovimientoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMovimientoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsMovimientoActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MovimientoActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormMovimientoActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMovimientoActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMovimientoActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected EmpresaBeanSwingJInternalFrame empresaorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresaorigen="";

	protected SucursalBeanSwingJInternalFrame sucursalorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursalorigen="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijoorigen="";

	protected EmpresaBeanSwingJInternalFrame empresadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresadestino="";

	protected SucursalBeanSwingJInternalFrame sucursaldestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursaldestino="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijodestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijodestino="";
	
	public MovimientoActivoFijoSessionBean movimientoactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public EmpresaSessionBean empresaorigenSessionBean;
	public SucursalSessionBean sucursalorigenSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoorigenSessionBean;
	public EmpresaSessionBean empresadestinoSessionBean;
	public SucursalSessionBean sucursaldestinoSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijodestinoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MovimientoActivoFijo> movimientoactivofijos;		
	public List<MovimientoActivoFijo> movimientoactivofijosEliminados;	
	public List<MovimientoActivoFijo> movimientoactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMovimientoActivoFijo;		
	protected JButton jButtonAbrirOrderByMovimientoActivoFijo;
	
	
	//protected JPanel jPanelOrderByMovimientoActivoFijo;
	//public JScrollPane jScrollPanelOrderByMovimientoActivoFijo;	
	//protected JButton jButtonCerrarOrderByMovimientoActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MovimientoActivoFijoLogic movimientoactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMovimientoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionMovimientoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralMovimientoActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosMovimientoActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMovimientoActivoFijo;
	//public JScrollPane jScrollPanelImportacionMovimientoActivoFijo;
	
	
	
	protected JPanel jPanelAccionesMovimientoActivoFijo;
	
    protected JPanel jPanelPaginacionMovimientoActivoFijo;
    protected JPanel jPanelParametrosReportesMovimientoActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesMovimientoActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MovimientoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2MovimientoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3MovimientoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4MovimientoActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5MovimientoActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoMovimientoActivoFijo;
	//protected JPanel jPanelImportacionMovimientoActivoFijo;
	
	
	public JTable jTableDatosMovimientoActivoFijo;
	
	
	
	//public JTable jTableDatosMovimientoActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMovimientoActivoFijo;
	protected JButton jButtonDuplicarMovimientoActivoFijo;
	protected JButton jButtonCopiarMovimientoActivoFijo;
	protected JButton jButtonVerFormMovimientoActivoFijo;
	protected JButton jButtonNuevoRelacionesMovimientoActivoFijo;
	protected JButton jButtonModificarMovimientoActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaMovimientoActivoFijo;
	protected JButton jButtonCerrarMovimientoActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionMovimientoActivoFijo;
	protected JButton jButtonProcesarInformacionMovimientoActivoFijo;
	
	
	protected JButton jButtonAnterioresMovimientoActivoFijo;
	protected JButton jButtonSiguientesMovimientoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosMovimientoActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMovimientoActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoMovimientoActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoMovimientoActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionMovimientoActivoFijo;
	//protected JButton jButtonGenerarImportacionMovimientoActivoFijo;
	//protected JButton jButtonCerrarImportacionMovimientoActivoFijo;
	//protected JFileChooser jFileChooserImportacionMovimientoActivoFijo;
	//protected File fileImportacionMovimientoActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMovimientoActivoFijo;
	protected JButton jButtonDuplicarToolBarMovimientoActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarMovimientoActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarMovimientoActivoFijo;
	protected JButton jButtonCopiarToolBarMovimientoActivoFijo;
	protected JButton jButtonVerFormToolBarMovimientoActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarMovimientoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarMovimientoActivoFijo;
	protected JButton jButtonCerrarToolBarMovimientoActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarMovimientoActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarMovimientoActivoFijo;
	protected JButton jButtonAnterioresToolBarMovimientoActivoFijo;
	protected JButton jButtonSiguientesToolBarMovimientoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarMovimientoActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarMovimientoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMovimientoActivoFijo;
	protected JMenuItem jMenuItemDuplicarMovimientoActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesMovimientoActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMovimientoActivoFijo;
	protected JMenuItem jMenuItemCopiarMovimientoActivoFijo;
	protected JMenuItem jMenuItemVerFormMovimientoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaMovimientoActivoFijo;
	protected JMenuItem jMenuItemCerrarMovimientoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarMovimientoActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMovimientoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarMovimientoActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionMovimientoActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionMovimientoActivoFijo;
	protected JMenuItem jMenuItemAnterioresMovimientoActivoFijo;
	protected JMenuItem jMenuItemSiguientesMovimientoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMovimientoActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByMovimientoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarMovimientoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMovimientoActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMovimientoActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosMovimientoActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMovimientoActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMovimientoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMovimientoActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralMovimientoActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMovimientoActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteMovimientoActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteMovimientoActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteMovimientoActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteMovimientoActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteMovimientoActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMovimientoActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMovimientoActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMovimientoActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoMovimientoActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionMovimientoActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionMovimientoActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionMovimientoActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMovimientoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMovimientoActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorMovimientoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMovimientoActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoMovimientoActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoMovimientoActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoMovimientoActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMovimientoActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMovimientoActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMovimientoActivoFijo;
	public JPanel jPanelFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo;
	public JButton jButtonFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo;
	public JPanel jPanelFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo;
	public JButton jButtonFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo;
	public JPanel jPanelFK_IdEmpresaDestinoMovimientoActivoFijo;
	public JButton jButtonFK_IdEmpresaDestinoMovimientoActivoFijo;
	public JPanel jPanelFK_IdEmpresaOrigenMovimientoActivoFijo;
	public JButton jButtonFK_IdEmpresaOrigenMovimientoActivoFijo;
	public JPanel jPanelFK_IdSucursalDestinoMovimientoActivoFijo;
	public JButton jButtonFK_IdSucursalDestinoMovimientoActivoFijo;
	public JPanel jPanelFK_IdSucursalOrigenMovimientoActivoFijo;
	public JButton jButtonFK_IdSucursalOrigenMovimientoActivoFijo;
	
	public JPanel jPanelid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo;
	public JLabel jLabelid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo;
	public JButton jButtonid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo;
	public JLabel jLabelid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo;
	public JButton jButtonid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo;
	public JLabel jLabelid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo;
	public JButton jButtonid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo;
	public JLabel jLabelid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo;
	public JButton jButtonid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo;
	public JLabel jLabelid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo;
	public JButton jButtonid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo;
	public JLabel jLabelid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo;
	public JButton jButtonid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijoBusqueda= new JButtonMe();

	
	
	
	
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
	public MovimientoActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MovimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MovimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMovimientoActivoFijo)	{
		this.jButtonRecargarInformacionMovimientoActivoFijo = jButtonRecargarInformacionMovimientoActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionMovimientoActivoFijo() {
		return this.jButtonProcesarInformacionMovimientoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMovimientoActivoFijo)	{
		this.jButtonProcesarInformacionMovimientoActivoFijo = jButtonProcesarInformacionMovimientoActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionMovimientoActivoFijo() {
		return this.jButtonRecargarInformacionMovimientoActivoFijo;
	}
	
	
	public List<MovimientoActivoFijo> getmovimientoactivofijos() {
		return this.movimientoactivofijos;
	}

	public void setmovimientoactivofijos(List<MovimientoActivoFijo> movimientoactivofijos) {
		this.movimientoactivofijos = movimientoactivofijos;
	}
	
	public List<MovimientoActivoFijo> getmovimientoactivofijosAux() {
		return this.movimientoactivofijosAux;
	}

	public void setmovimientoactivofijosAux(List<MovimientoActivoFijo> movimientoactivofijosAux) {
		this.movimientoactivofijosAux = movimientoactivofijosAux;
	}
	
	public List<MovimientoActivoFijo> getmovimientoactivofijosEliminados() {
		return this.movimientoactivofijosEliminados;
	}

	public void setMovimientoActivoFijosEliminados(List<MovimientoActivoFijo> movimientoactivofijosEliminados) {
		this.movimientoactivofijosEliminados = movimientoactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMovimientoActivoFijo() {
		return jComboBoxTiposSeleccionarMovimientoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMovimientoActivoFijo(
			JComboBox jComboBoxTiposSeleccionarMovimientoActivoFijo) {
		this.jComboBoxTiposSeleccionarMovimientoActivoFijo = jComboBoxTiposSeleccionarMovimientoActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarMovimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMovimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMovimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMovimientoActivoFijo() {
		return jTextFieldValorCampoGeneralMovimientoActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralMovimientoActivoFijo(
			JTextField jTextFieldValorCampoGeneralMovimientoActivoFijo) {
		this.jTextFieldValorCampoGeneralMovimientoActivoFijo = jTextFieldValorCampoGeneralMovimientoActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralMovimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMovimientoActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMovimientoActivoFijo() {
		return this.jCheckBoxSeleccionarTodosMovimientoActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosMovimientoActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosMovimientoActivoFijo) {
		this.jCheckBoxSeleccionarTodosMovimientoActivoFijo = jCheckBoxSeleccionarTodosMovimientoActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosMovimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMovimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMovimientoActivoFijo() {
		return this.jCheckBoxSeleccionadosMovimientoActivoFijo;
	}

	public void setjCheckBoxSeleccionadosMovimientoActivoFijo(
			JCheckBox jCheckBoxSeleccionadosMovimientoActivoFijo) {
		this.jCheckBoxSeleccionadosMovimientoActivoFijo = jCheckBoxSeleccionadosMovimientoActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosMovimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMovimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMovimientoActivoFijo() {
		return this.jComboBoxTiposArchivosReportesMovimientoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMovimientoActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesMovimientoActivoFijo) {
		this.jComboBoxTiposArchivosReportesMovimientoActivoFijo = jComboBoxTiposArchivosReportesMovimientoActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesMovimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMovimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMovimientoActivoFijo() {
		return this.jComboBoxTiposReportesMovimientoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMovimientoActivoFijo(
			JComboBox jComboBoxTiposReportesMovimientoActivoFijo) {
		this.jComboBoxTiposReportesMovimientoActivoFijo = jComboBoxTiposReportesMovimientoActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMovimientoActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoMovimientoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMovimientoActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoMovimientoActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoMovimientoActivoFijo = jComboBoxTiposReportesDinamicoMovimientoActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo = jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesMovimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMovimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMovimientoActivoFijo() {
		return this.jComboBoxTiposGraficosReportesMovimientoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMovimientoActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesMovimientoActivoFijo) {
		this.jComboBoxTiposGraficosReportesMovimientoActivoFijo = jComboBoxTiposGraficosReportesMovimientoActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesMovimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMovimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMovimientoActivoFijo() {
		return this.jComboBoxTiposPaginacionMovimientoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMovimientoActivoFijo(
			JComboBox jComboBoxTiposPaginacionMovimientoActivoFijo) {
		this.jComboBoxTiposPaginacionMovimientoActivoFijo = jComboBoxTiposPaginacionMovimientoActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionMovimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMovimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMovimientoActivoFijo() {
		return this.jComboBoxTiposRelacionesMovimientoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMovimientoActivoFijo() {
		return this.jComboBoxTiposAccionesMovimientoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMovimientoActivoFijo(
			JComboBox jComboBoxTiposRelacionesMovimientoActivoFijo) {
		this.jComboBoxTiposRelacionesMovimientoActivoFijo = jComboBoxTiposRelacionesMovimientoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMovimientoActivoFijo(
			JComboBox jComboBoxTiposAccionesMovimientoActivoFijo) {
		this.jComboBoxTiposAccionesMovimientoActivoFijo = jComboBoxTiposAccionesMovimientoActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesMovimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMovimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMovimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMovimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMovimientoActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoMovimientoActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoMovimientoActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoMovimientoActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoMovimientoActivoFijo = jCheckBoxConGraficoDinamicoMovimientoActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMovimientoActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMovimientoActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMovimientoActivoFijo .setBorder(borderResaltar);		
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
		this.movimientoactivofijoSessionBean=new MovimientoActivoFijoSessionBean();
		
		this.movimientoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.movimientoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.movimientoactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MovimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MovimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MovimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MovimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MovimientoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Movimiento Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		MovimientoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MovimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMovimientoActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"copiar","copiar","Copiar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"ver_form","ver_form","Ver"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"recargar","recargar","Recargar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMovimientoActivoFijo,this.jTtoolBarMovimientoActivoFijo,
							"cerrar","cerrar","Salir"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMovimientoActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMovimientoActivoFijo;
			
				this.jButtonProcesarInformacionToolBarMovimientoActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMovimientoActivoFijo;
				
		//protected JButton jButtonModificarToolBarMovimientoActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMovimientoActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMovimientoActivoFijo=new JMenuMe("General");
		this.jmenuArchivoMovimientoActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesMovimientoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosMovimientoActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMovimientoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMovimientoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMovimientoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMovimientoActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMovimientoActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMovimientoActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMovimientoActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMovimientoActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMovimientoActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMovimientoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMovimientoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMovimientoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMovimientoActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMovimientoActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMovimientoActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMovimientoActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMovimientoActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMovimientoActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMovimientoActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMovimientoActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMovimientoActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMovimientoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMovimientoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMovimientoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMovimientoActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMovimientoActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMovimientoActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMovimientoActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMovimientoActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMovimientoActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMovimientoActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMovimientoActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMovimientoActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMovimientoActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMovimientoActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMovimientoActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMovimientoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMovimientoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMovimientoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMovimientoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMovimientoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMovimientoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMovimientoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMovimientoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMovimientoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMovimientoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMovimientoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMovimientoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMovimientoActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMovimientoActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMovimientoActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMovimientoActivoFijo.add(this.jMenuItemCerrarMovimientoActivoFijo);
			
			this.jmenuAccionesMovimientoActivoFijo.add(this.jMenuItemNuevoMovimientoActivoFijo);
			this.jmenuAccionesMovimientoActivoFijo.add(this.jMenuItemNuevoGuardarCambiosMovimientoActivoFijo);
			this.jmenuAccionesMovimientoActivoFijo.add(this.jMenuItemNuevoRelacionesMovimientoActivoFijo);
			this.jmenuAccionesMovimientoActivoFijo.add(this.jMenuItemGuardarCambiosTablaMovimientoActivoFijo);		
			this.jmenuAccionesMovimientoActivoFijo.add(this.jMenuItemDuplicarMovimientoActivoFijo);		
			this.jmenuAccionesMovimientoActivoFijo.add(this.jMenuItemCopiarMovimientoActivoFijo);		
			this.jmenuAccionesMovimientoActivoFijo.add(this.jMenuItemVerFormMovimientoActivoFijo);		
			
			this.jmenuDatosMovimientoActivoFijo.add(this.jMenuItemRecargarInformacionMovimientoActivoFijo);				
			this.jmenuDatosMovimientoActivoFijo.add(this.jMenuItemAnterioresMovimientoActivoFijo);				
			this.jmenuDatosMovimientoActivoFijo.add(this.jMenuItemSiguientesMovimientoActivoFijo);				
			this.jmenuDatosMovimientoActivoFijo.add(this.jMenuItemAbrirOrderByMovimientoActivoFijo);				
			this.jmenuDatosMovimientoActivoFijo.add(this.jMenuItemMostrarOcultarMovimientoActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMovimientoActivoFijo.add(this.jMenuItemGuardarCambiosMovimientoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMovimientoActivoFijo.add(this.jmenuArchivoMovimientoActivoFijo);		
			this.jmenuBarMovimientoActivoFijo.add(this.jmenuAccionesMovimientoActivoFijo);		
			this.jmenuBarMovimientoActivoFijo.add(this.jmenuDatosMovimientoActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMovimientoActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMovimientoActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo Destino ");
		this.jButtonFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo= new JButtonMe();
		this.jButtonFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setText("Buscar");
		this.jButtonFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo,"buscar_button","Buscar Por Detalle Activo Fijo Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo = new JLabelMe();
		jLabelid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setText("Detalle Activo Fijo Destino :");
		jLabelid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setToolTipText("Detalle Activo Fijo Destino");
		jLabelid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo Origen ");
		this.jButtonFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo= new JButtonMe();
		this.jButtonFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setText("Buscar");
		this.jButtonFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo,"buscar_button","Buscar Por Detalle Activo Fijo Origen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo = new JLabelMe();
		jLabelid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setText("Detalle Activo Fijo Origen :");
		jLabelid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setToolTipText("Detalle Activo Fijo Origen");
		jLabelid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpresaDestinoMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpresaDestinoMovimientoActivoFijo.setToolTipText("Buscar Por Empresa Destino ");
		this.jButtonFK_IdEmpresaDestinoMovimientoActivoFijo= new JButtonMe();
		this.jButtonFK_IdEmpresaDestinoMovimientoActivoFijo.setText("Buscar");
		this.jButtonFK_IdEmpresaDestinoMovimientoActivoFijo.setToolTipText("Buscar Por Empresa Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpresaDestinoMovimientoActivoFijo,"buscar_button","Buscar Por Empresa Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpresaDestinoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo = new JLabelMe();
		jLabelid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo.setText("Empresa Destino :");
		jLabelid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo.setToolTipText("Empresa Destino");
		jLabelid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpresaOrigenMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpresaOrigenMovimientoActivoFijo.setToolTipText("Buscar Por Empresa Origen ");
		this.jButtonFK_IdEmpresaOrigenMovimientoActivoFijo= new JButtonMe();
		this.jButtonFK_IdEmpresaOrigenMovimientoActivoFijo.setText("Buscar");
		this.jButtonFK_IdEmpresaOrigenMovimientoActivoFijo.setToolTipText("Buscar Por Empresa Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpresaOrigenMovimientoActivoFijo,"buscar_button","Buscar Por Empresa Origen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpresaOrigenMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo = new JLabelMe();
		jLabelid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo.setText("Empresa Origen :");
		jLabelid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo.setToolTipText("Empresa Origen");
		jLabelid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSucursalDestinoMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSucursalDestinoMovimientoActivoFijo.setToolTipText("Buscar Por Sucursal Destino ");
		this.jButtonFK_IdSucursalDestinoMovimientoActivoFijo= new JButtonMe();
		this.jButtonFK_IdSucursalDestinoMovimientoActivoFijo.setText("Buscar");
		this.jButtonFK_IdSucursalDestinoMovimientoActivoFijo.setToolTipText("Buscar Por Sucursal Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSucursalDestinoMovimientoActivoFijo,"buscar_button","Buscar Por Sucursal Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSucursalDestinoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo = new JLabelMe();
		jLabelid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo.setText("Sucursal Destino :");
		jLabelid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo.setToolTipText("Sucursal Destino");
		jLabelid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSucursalOrigenMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSucursalOrigenMovimientoActivoFijo.setToolTipText("Buscar Por Sucursal Origen ");
		this.jButtonFK_IdSucursalOrigenMovimientoActivoFijo= new JButtonMe();
		this.jButtonFK_IdSucursalOrigenMovimientoActivoFijo.setText("Buscar");
		this.jButtonFK_IdSucursalOrigenMovimientoActivoFijo.setToolTipText("Buscar Por Sucursal Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSucursalOrigenMovimientoActivoFijo,"buscar_button","Buscar Por Sucursal Origen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSucursalOrigenMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo = new JLabelMe();
		jLabelid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo.setText("Sucursal Origen :");
		jLabelid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo.setToolTipText("Sucursal Origen");
		jLabelid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasMovimientoActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasMovimientoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasMovimientoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasMovimientoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMovimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMovimientoActivoFijo = new MovimientoActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Movimiento Activo Fijo DATOS");
			this.jInternalFrameDetalleFormMovimientoActivoFijo = new MovimientoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.movimientoactivofijoSessionBean.getConGuardarRelaciones(),this.movimientoactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMovimientoActivoFijo = null;//new MovimientoActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMovimientoActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosMovimientoActivoFijo = new JTableMe();      
		
		String sToolTipMovimientoActivoFijo="";
		sToolTipMovimientoActivoFijo=MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMovimientoActivoFijo+="(ActivosFijos.MovimientoActivoFijo)";
		}
		
		if(!this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipMovimientoActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMovimientoActivoFijo.setToolTipText(sToolTipMovimientoActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMovimientoActivoFijo);
		this.jTableDatosMovimientoActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosMovimientoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMovimientoActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosMovimientoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMovimientoActivoFijo = new JButtonMe();
		this.jButtonDuplicarMovimientoActivoFijo = new JButtonMe();
		this.jButtonCopiarMovimientoActivoFijo = new JButtonMe();
		this.jButtonVerFormMovimientoActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesMovimientoActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMovimientoActivoFijo = new JButtonMe();
		this.jButtonCerrarMovimientoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosMovimientoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralMovimientoActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Movimiento Activo Fijo";
		
		if(!this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosMovimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMovimientoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesMovimientoActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMovimientoActivoFijo=new ReporteDinamicoJInternalFrame(MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMovimientoActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMovimientoActivoFijo=new ImportacionJInternalFrame(MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMovimientoActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMovimientoActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByMovimientoActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByMovimientoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMovimientoActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMovimientoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientoActivoFijo,false,this);
			
			//this.cargarOrderByMovimientoActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMovimientoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientoActivoFijo,true,this);
			
			//this.cargarOrderByMovimientoActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMovimientoActivoFijo.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosMovimientoActivoFijo.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosMovimientoActivoFijo.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosMovimientoActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMovimientoActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMovimientoActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMovimientoActivoFijo.setText("Nuevo");
		this.jButtonDuplicarMovimientoActivoFijo.setText("Duplicar");
		this.jButtonCopiarMovimientoActivoFijo.setText("Copiar");
		this.jButtonVerFormMovimientoActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesMovimientoActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMovimientoActivoFijo.setText("Guardar");
		this.jButtonCerrarMovimientoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMovimientoActivoFijo,"nuevo_button","Nuevo",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMovimientoActivoFijo,"duplicar_button","Duplicar",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMovimientoActivoFijo,"copiar_button","Copiar",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMovimientoActivoFijo,"ver_form","Ver",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMovimientoActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMovimientoActivoFijo,"guardarcambiostabla_button","Guardar",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMovimientoActivoFijo,"cerrar_button","Salir",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMovimientoActivoFijo.setToolTipText("Nuevo"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMovimientoActivoFijo.setToolTipText("Duplicar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMovimientoActivoFijo.setToolTipText("Copiar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMovimientoActivoFijo.setToolTipText("Ver"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMovimientoActivoFijo.setToolTipText("Nuevo Rel"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMovimientoActivoFijo.setToolTipText("Guardar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMovimientoActivoFijo.setToolTipText("Salir"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMovimientoActivoFijo";
		inputMap = this.jButtonNuevoMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMovimientoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMovimientoActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarMovimientoActivoFijo";
		inputMap = this.jButtonDuplicarMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMovimientoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMovimientoActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarMovimientoActivoFijo";
		inputMap = this.jButtonCopiarMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMovimientoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMovimientoActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormMovimientoActivoFijo";
		inputMap = this.jButtonVerFormMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMovimientoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMovimientoActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMovimientoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMovimientoActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMovimientoActivoFijo";
		inputMap = this.jButtonModificarMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMovimientoActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMovimientoActivoFijo";
		inputMap = this.jButtonCerrarMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMovimientoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMovimientoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMovimientoActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MovimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MovimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MovimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MovimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MovimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMovimientoActivoFijo.setName("jPanelParametrosReportesMovimientoActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMovimientoActivoFijo.setName("jPanelParametrosReportesAccionesMovimientoActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMovimientoActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionMovimientoActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionMovimientoActivoFijo.setToolTipText("Recargar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMovimientoActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMovimientoActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionMovimientoActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionMovimientoActivoFijo.setToolTipText("Procesar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMovimientoActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionMovimientoActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMovimientoActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMovimientoActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMovimientoActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesMovimientoActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMovimientoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMovimientoActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionMovimientoActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMovimientoActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesMovimientoActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMovimientoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesMovimientoActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMovimientoActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarMovimientoActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMovimientoActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMovimientoActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMovimientoActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMovimientoActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMovimientoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesMovimientoActivoFijo.setText("Acciones");		
		this.jLabelAccionesMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMovimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMovimientoActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMovimientoActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMovimientoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMovimientoActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMovimientoActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMovimientoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMovimientoActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMovimientoActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMovimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMovimientoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteMovimientoActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMovimientoActivoFijo = new JButtonMe();
		//this.jButtonAnterioresMovimientoActivoFijo.setText("<<");
        this.jButtonAnterioresMovimientoActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMovimientoActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMovimientoActivoFijo = new JButtonMe();
		//this.jButtonSiguientesMovimientoActivoFijo.setText(">>");
        this.jButtonSiguientesMovimientoActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMovimientoActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMovimientoActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMovimientoActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosMovimientoActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMovimientoActivoFijo,"nuevoguardarcambios_button","Nue",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMovimientoActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMovimientoActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMovimientoActivoFijo";
		inputMap = this.jButtonRecargarInformacionMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMovimientoActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMovimientoActivoFijo";
		inputMap = this.jButtonSiguientesMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMovimientoActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMovimientoActivoFijo";
		inputMap = this.jButtonAnterioresMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMovimientoActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMovimientoActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMovimientoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),MovimientoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMovimientoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),MovimientoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMovimientoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),MovimientoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMovimientoActivoFijo = new GridBagLayout();

			this.jPanelPaginacionMovimientoActivoFijo.setLayout(gridaBagLayoutPaginacionMovimientoActivoFijo);						
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMovimientoActivoFijo.add(this.jButtonAnterioresMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
					
						
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
			
			this.jPanelPaginacionMovimientoActivoFijo.add(this.jButtonNuevoGuardarCambiosMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
						
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
			this.jPanelPaginacionMovimientoActivoFijo.add(this.jButtonSiguientesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = 1;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientoActivoFijo.add(this.jButtonNuevoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
						
			
			
			if(!this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMovimientoActivoFijo.gridy = 1;
				this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMovimientoActivoFijo.add(this.jButtonGuardarCambiosTablaMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			}
			
			
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = 1;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientoActivoFijo.add(this.jButtonDuplicarMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = 1;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientoActivoFijo.add(this.jButtonCopiarMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = 1;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientoActivoFijo.add(this.jButtonVerFormMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = 1;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMovimientoActivoFijo.add(this.jButtonCerrarMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
		
		
		this.jButtonRecargarInformacionMovimientoActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMovimientoActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMovimientoActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMovimientoActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMovimientoActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMovimientoActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMovimientoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMovimientoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMovimientoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMovimientoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMovimientoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMovimientoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMovimientoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMovimientoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMovimientoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMovimientoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMovimientoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMovimientoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMovimientoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMovimientoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMovimientoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMovimientoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMovimientoActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMovimientoActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMovimientoActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMovimientoActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMovimientoActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMovimientoActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMovimientoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMovimientoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMovimientoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMovimientoActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMovimientoActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMovimientoActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMovimientoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMovimientoActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MovimientoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MovimientoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MovimientoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MovimientoActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMovimientoActivoFijo.setLayout(gridaBagParametrosReportesMovimientoActivoFijo);
			this.jPanelParametrosReportesAccionesMovimientoActivoFijo.setLayout(gridaBagParametrosReportesAccionesMovimientoActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1MovimientoActivoFijo.setLayout(gridaBagParametrosAuxiliar1MovimientoActivoFijo);
			this.jPanelParametrosAuxiliar2MovimientoActivoFijo.setLayout(gridaBagParametrosAuxiliar2MovimientoActivoFijo);
			this.jPanelParametrosAuxiliar3MovimientoActivoFijo.setLayout(gridaBagParametrosAuxiliar3MovimientoActivoFijo);
			this.jPanelParametrosAuxiliar4MovimientoActivoFijo.setLayout(gridaBagParametrosAuxiliar4MovimientoActivoFijo);
			//this.jPanelParametrosAuxiliar5MovimientoActivoFijo.setLayout(gridaBagParametrosAuxiliar2MovimientoActivoFijo);			
			
			
			
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jButtonRecargarInformacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientoActivoFijo.add(this.jComboBoxTiposPaginacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientoActivoFijo.add(this.jCheckBoxConAltoMaximoTablaMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientoActivoFijo.add(this.jComboBoxTiposArchivosReportesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jPanelParametrosAuxiliar1MovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MovimientoActivoFijo.add(this.jComboBoxTiposReportesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);																		
			
			
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4MovimientoActivoFijo.add(this.jComboBoxTiposGraficosReportesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jPanelParametrosAuxiliar4MovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jComboBoxTiposReportesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jCheckBoxGenerarReporteMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jPanelParametrosAuxiliar2MovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jLabelAccionesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jButtonAbrirOrderByMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jComboBoxTiposSeleccionarMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);			
			
			
			/*
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jCheckBoxSeleccionarTodosMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jCheckBoxConGraficoReporteMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientoActivoFijo.add(this.jCheckBoxSeleccionarTodosMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);															
				
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientoActivoFijo.add(this.jCheckBoxSeleccionadosMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);															
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientoActivoFijo.add(this.jCheckBoxConGraficoReporteMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jPanelParametrosAuxiliar3MovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jComboBoxTiposAccionesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
	
				
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientoActivoFijo.add(this.jTextFieldValorCampoGeneralMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMovimientoActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosMovimientoActivoFijo.setLayout(gridaBagLayoutDatosMovimientoActivoFijo);
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosMovimientoActivoFijo.add(this.jTableDatosMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMovimientoActivoFijo.setViewportView(this.jTableDatosMovimientoActivoFijo);
		this.jTableDatosMovimientoActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosMovimientoActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMovimientoActivoFijo= new GridBagLayout();
		this.jPanelAccionesMovimientoActivoFijo.setLayout(gridaBagLayoutAccionesMovimientoActivoFijo);
		
		
		/*	
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
			
		this.jPanelAccionesMovimientoActivoFijo.add(this.jButtonNuevoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.setLayout(gridaBagLayoutFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 0;
		jPanelFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.add(jLabelid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 1;
		jPanelFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.add(jComboBoxid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 1;
		gridBagConstraintsMovimientoActivoFijo.gridx =1;
		jPanelFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo.add(jButtonFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		jTabbedPaneBusquedasMovimientoActivoFijo.addTab("1.-Por Detalle Activo Fijo Destino ", jPanelFK_IdDetalleActivoFijoDestinoMovimientoActivoFijo);
		jTabbedPaneBusquedasMovimientoActivoFijo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.setLayout(gridaBagLayoutFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 0;
		jPanelFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.add(jLabelid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 1;
		jPanelFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.add(jComboBoxid_detalle_activo_fijo_origenFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 1;
		gridBagConstraintsMovimientoActivoFijo.gridx =1;
		jPanelFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo.add(jButtonFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		jTabbedPaneBusquedasMovimientoActivoFijo.addTab("2.-Por Detalle Activo Fijo Origen ", jPanelFK_IdDetalleActivoFijoOrigenMovimientoActivoFijo);
		jTabbedPaneBusquedasMovimientoActivoFijo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpresaDestinoMovimientoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdEmpresaDestinoMovimientoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpresaDestinoMovimientoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpresaDestinoMovimientoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpresaDestinoMovimientoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpresaDestinoMovimientoActivoFijo.setLayout(gridaBagLayoutFK_IdEmpresaDestinoMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 0;
		jPanelFK_IdEmpresaDestinoMovimientoActivoFijo.add(jLabelid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 1;
		jPanelFK_IdEmpresaDestinoMovimientoActivoFijo.add(jComboBoxid_empresa_destinoFK_IdEmpresaDestinoMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 1;
		gridBagConstraintsMovimientoActivoFijo.gridx =1;
		jPanelFK_IdEmpresaDestinoMovimientoActivoFijo.add(jButtonFK_IdEmpresaDestinoMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		jTabbedPaneBusquedasMovimientoActivoFijo.addTab("3.-Por Empresa Destino ", jPanelFK_IdEmpresaDestinoMovimientoActivoFijo);
		jTabbedPaneBusquedasMovimientoActivoFijo.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEmpresaOrigenMovimientoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdEmpresaOrigenMovimientoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpresaOrigenMovimientoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpresaOrigenMovimientoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpresaOrigenMovimientoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpresaOrigenMovimientoActivoFijo.setLayout(gridaBagLayoutFK_IdEmpresaOrigenMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 0;
		jPanelFK_IdEmpresaOrigenMovimientoActivoFijo.add(jLabelid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 1;
		jPanelFK_IdEmpresaOrigenMovimientoActivoFijo.add(jComboBoxid_empresa_origenFK_IdEmpresaOrigenMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 1;
		gridBagConstraintsMovimientoActivoFijo.gridx =1;
		jPanelFK_IdEmpresaOrigenMovimientoActivoFijo.add(jButtonFK_IdEmpresaOrigenMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		jTabbedPaneBusquedasMovimientoActivoFijo.addTab("4.-Por Empresa Origen ", jPanelFK_IdEmpresaOrigenMovimientoActivoFijo);
		jTabbedPaneBusquedasMovimientoActivoFijo.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdSucursalDestinoMovimientoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdSucursalDestinoMovimientoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSucursalDestinoMovimientoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSucursalDestinoMovimientoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSucursalDestinoMovimientoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSucursalDestinoMovimientoActivoFijo.setLayout(gridaBagLayoutFK_IdSucursalDestinoMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 0;
		jPanelFK_IdSucursalDestinoMovimientoActivoFijo.add(jLabelid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 1;
		jPanelFK_IdSucursalDestinoMovimientoActivoFijo.add(jComboBoxid_sucursal_destinoFK_IdSucursalDestinoMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 1;
		gridBagConstraintsMovimientoActivoFijo.gridx =1;
		jPanelFK_IdSucursalDestinoMovimientoActivoFijo.add(jButtonFK_IdSucursalDestinoMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		jTabbedPaneBusquedasMovimientoActivoFijo.addTab("5.-Por Sucursal Destino ", jPanelFK_IdSucursalDestinoMovimientoActivoFijo);
		jTabbedPaneBusquedasMovimientoActivoFijo.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdSucursalOrigenMovimientoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdSucursalOrigenMovimientoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSucursalOrigenMovimientoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSucursalOrigenMovimientoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSucursalOrigenMovimientoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSucursalOrigenMovimientoActivoFijo.setLayout(gridaBagLayoutFK_IdSucursalOrigenMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 0;
		jPanelFK_IdSucursalOrigenMovimientoActivoFijo.add(jLabelid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		gridBagConstraintsMovimientoActivoFijo.gridx = 1;
		jPanelFK_IdSucursalOrigenMovimientoActivoFijo.add(jComboBoxid_sucursal_origenFK_IdSucursalOrigenMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoActivoFijo.gridy = 1;
		gridBagConstraintsMovimientoActivoFijo.gridx =1;
		jPanelFK_IdSucursalOrigenMovimientoActivoFijo.add(jButtonFK_IdSucursalOrigenMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);

		jTabbedPaneBusquedasMovimientoActivoFijo.addTab("6.-Por Sucursal Origen ", jPanelFK_IdSucursalOrigenMovimientoActivoFijo);
		jTabbedPaneBusquedasMovimientoActivoFijo.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMovimientoActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsMovimientoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMovimientoActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;		
		//this.gridBagConstraintsMovimientoActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMovimientoActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;		
			this.gridBagConstraintsMovimientoActivoFijo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMovimientoActivoFijo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);								
		
		
		/*
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		*/		
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMovimientoActivoFijo.gridx =0;
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMovimientoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
				
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MovimientoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMovimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMovimientoActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosMovimientoActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosMovimientoActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMovimientoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			
			
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
			
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMovimientoActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMovimientoActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMovimientoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMovimientoActivoFijo.setName("jPanelReporteDinamicoMovimientoActivoFijo"); 
		
		this.jPanelReporteDinamicoMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMovimientoActivoFijo.setLayout(gridaBagLayoutReporteDinamicoMovimientoActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoMovimientoActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMovimientoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMovimientoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMovimientoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMovimientoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMovimientoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMovimientoActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMovimientoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMovimientoActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoMovimientoActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoMovimientoActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMovimientoActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteMovimientoActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jLabelColumnasSelectReporteMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMovimientoActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteMovimientoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMovimientoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMovimientoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMovimientoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMovimientoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMovimientoActivoFijo=new JScrollPane(this.jListColumnasSelectReporteMovimientoActivoFijo);
			
			this.jScrollColumnasSelectReporteMovimientoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMovimientoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMovimientoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jListColumnasSelectReporteMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jScrollColumnasSelectReporteMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMovimientoActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteMovimientoActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMovimientoActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteMovimientoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMovimientoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMovimientoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMovimientoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMovimientoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMovimientoActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteMovimientoActivoFijo);
			
			this.jScrollRelacionesSelectReporteMovimientoActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMovimientoActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMovimientoActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMovimientoActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMovimientoActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoMovimientoActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMovimientoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMovimientoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMovimientoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMovimientoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMovimientoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoMovimientoActivoFijo = new JLabelMe();

		this.jLabelConGraficoDinamicoMovimientoActivoFijo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jLabelConGraficoDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoMovimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoMovimientoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoMovimientoActivoFijo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoMovimientoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMovimientoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMovimientoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jCheckBoxConGraficoDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoMovimientoActivoFijo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoMovimientoActivoFijo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jLabelColumnaCategoriaGraficoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMovimientoActivoFijo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoMovimientoActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoMovimientoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMovimientoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMovimientoActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jComboBoxColumnaCategoriaGraficoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorMovimientoActivoFijo = new JLabelMe();

		this.jLabelColumnaCategoriaValorMovimientoActivoFijo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jLabelColumnaCategoriaValorMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorMovimientoActivoFijo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorMovimientoActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorMovimientoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMovimientoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMovimientoActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jComboBoxColumnaCategoriaValorMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoMovimientoActivoFijo = new JLabelMe();

		this.jLabelColumnasValoresGraficoMovimientoActivoFijo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jLabelColumnasValoresGraficoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoMovimientoActivoFijo = new JList<Reporte>();
		this.jListColumnasValoresGraficoMovimientoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoMovimientoActivoFijo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoMovimientoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMovimientoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMovimientoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoMovimientoActivoFijo=new JScrollPane(this.jListColumnasValoresGraficoMovimientoActivoFijo);
			
			this.jScrollColumnasValoresGraficoMovimientoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMovimientoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMovimientoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jListColumnasSelectReporteMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jScrollColumnasValoresGraficoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoMovimientoActivoFijo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoMovimientoActivoFijo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jLabelTiposGraficosReportesDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMovimientoActivoFijo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoMovimientoActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoMovimientoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMovimientoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMovimientoActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jComboBoxTiposGraficosReportesDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMovimientoActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMovimientoActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMovimientoActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMovimientoActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMovimientoActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMovimientoActivoFijo.setToolTipText("Generar EXCEL"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jComboBoxTiposReportesDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMovimientoActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMovimientoActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMovimientoActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMovimientoActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMovimientoActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMovimientoActivoFijo.setToolTipText("Generar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jButtonGenerarReporteDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMovimientoActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMovimientoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMovimientoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMovimientoActivoFijo.setToolTipText("Cancelar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientoActivoFijo.add(this.jButtonCerrarReporteDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMovimientoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMovimientoActivoFijo= new JScrollPane(jPanelReporteDinamicoMovimientoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMovimientoActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMovimientoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMovimientoActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMovimientoActivoFijo);
		this.jInternalFrameReporteDinamicoMovimientoActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMovimientoActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMovimientoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMovimientoActivoFijo.setName("jPanelImportacionMovimientoActivoFijo"); 
		
		this.jPanelImportacionMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMovimientoActivoFijo.setLayout(gridaBagLayoutImportacionMovimientoActivoFijo);
		
		
		this.jInternalFrameImportacionMovimientoActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMovimientoActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMovimientoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMovimientoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMovimientoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMovimientoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMovimientoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMovimientoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMovimientoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMovimientoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionMovimientoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionMovimientoActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMovimientoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMovimientoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMovimientoActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMovimientoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMovimientoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMovimientoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionMovimientoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionMovimientoActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMovimientoActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionMovimientoActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMovimientoActivoFijo.add(this.jLabelArchivoImportacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMovimientoActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionMovimientoActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMovimientoActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionMovimientoActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMovimientoActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMovimientoActivoFijo.setToolTipText("Generar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientoActivoFijo.add(this.jButtonAbrirImportacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMovimientoActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionMovimientoActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMovimientoActivoFijo.add(this.jLabelPathArchivoImportacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMovimientoActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMovimientoActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMovimientoActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMovimientoActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientoActivoFijo.add(this.jTextFieldPathArchivoImportacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMovimientoActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionMovimientoActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMovimientoActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMovimientoActivoFijo.setToolTipText("Generar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientoActivoFijo.add(this.jButtonGenerarImportacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMovimientoActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionMovimientoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMovimientoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMovimientoActivoFijo.setToolTipText("Cancelar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientoActivoFijo.add(this.jButtonCerrarImportacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMovimientoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionMovimientoActivoFijo= new JScrollPane(jPanelImportacionMovimientoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsMovimientoActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMovimientoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMovimientoActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMovimientoActivoFijo);
		this.jInternalFrameImportacionMovimientoActivoFijo.getContentPane().add(this.jScrollPanelImportacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMovimientoActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMovimientoActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByMovimientoActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByMovimientoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMovimientoActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMovimientoActivoFijo";
			inputMap = this.jButtonAbrirOrderByMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMovimientoActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByMovimientoActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMovimientoActivoFijo.setName("jPanelOrderByMovimientoActivoFijo"); 
			
			this.jPanelOrderByMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMovimientoActivoFijo.setLayout(gridaBagLayoutOrderByMovimientoActivoFijo);
			
			
			this.jTableDatosMovimientoActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosMovimientoActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMovimientoActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMovimientoActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMovimientoActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMovimientoActivoFijoOrderBy.setViewportView(this.jTableDatosMovimientoActivoFijoOrderBy);
			this.jTableDatosMovimientoActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMovimientoActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMovimientoActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMovimientoActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMovimientoActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMovimientoActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMovimientoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMovimientoActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMovimientoActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByMovimientoActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMovimientoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMovimientoActivoFijo.setResizable(true);
			this.jInternalFrameOrderByMovimientoActivoFijo.setClosable(true);
			this.jInternalFrameOrderByMovimientoActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMovimientoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMovimientoActivoFijo.ipady =150;
				
			this.jPanelOrderByMovimientoActivoFijo.add(jScrollPanelDatosMovimientoActivoFijoOrderBy, this.gridBagConstraintsMovimientoActivoFijo);//this.jTableDatosMovimientoActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMovimientoActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByMovimientoActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMovimientoActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMovimientoActivoFijo.setToolTipText("Cancelar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMovimientoActivoFijo.add(this.jButtonCerrarOrderByMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMovimientoActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByMovimientoActivoFijo= new JScrollPane(jPanelOrderByMovimientoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsMovimientoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMovimientoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMovimientoActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMovimientoActivoFijo);
			
			this.jInternalFrameOrderByMovimientoActivoFijo.getContentPane().add(this.jScrollPanelOrderByMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByMovimientoActivoFijo = new JButtonMe();
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
		int iWidthTableCalculado=0;//3630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.movimientoactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMovimientoActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMovimientoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMovimientoActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMovimientoActivoFijo.getRowHeight();//MovimientoActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MovimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMovimientoActivoFijo.isSelected()) {
					iHeightTable=MovimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MovimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MovimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MovimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMovimientoActivoFijo.isSelected()) {
					iHeightTable=MovimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MovimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MovimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMovimientoActivoFijo!=null && this.jInternalFrameOrderByMovimientoActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMovimientoActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMovimientoActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMovimientoActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMovimientoActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMovimientoActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMovimientoActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMovimientoActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=movimientoactivofijoLogic.getMovimientoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=movimientoactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MovimientoActivoFijo> TraerMovimientoActivoFijoBeans(List<MovimientoActivoFijo> movimientoactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(MovimientoActivoFijo movimientoactivofijo:movimientoactivofijos) {
					
				if(!(MovimientoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MovimientoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					movimientoactivofijo.setsDetalleGeneralEntityReporte(MovimientoActivoFijoConstantesFunciones.getMovimientoActivoFijoDescripcion(movimientoactivofijo));
										
						
					
						
					
				} else  {
							
					//movimientoactivofijo.setsDetalleGeneralEntityReporte(movimientoactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//movimientoactivofijobeans.add(movimientoactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return movimientoactivofijos;
    }
	//PARA REPORTES FIN
}
