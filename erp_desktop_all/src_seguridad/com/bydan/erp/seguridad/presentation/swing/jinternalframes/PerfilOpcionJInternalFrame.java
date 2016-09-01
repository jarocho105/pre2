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
import com.bydan.erp.seguridad.util.PerfilOpcionConstantesFunciones;

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
public class PerfilOpcionJInternalFrame extends PerfilOpcionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPerfilOpcion;
	
	protected JMenuBar jmenuBarPerfilOpcion;
	
	protected JMenu jmenuPerfilOpcion;
	protected JMenu jmenuDatosPerfilOpcion;
	protected JMenu jmenuArchivoPerfilOpcion;
	protected JMenu jmenuAccionesPerfilOpcion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPerfilOpcion;	
	protected GridBagConstraints gridBagConstraintsPerfilOpcion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PerfilOpcionDetalleFormJInternalFrame jInternalFrameDetalleFormPerfilOpcion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPerfilOpcion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPerfilOpcion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected GrupoOpcionBeanSwingJInternalFrame grupoopcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupoopcion="";

	protected PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_perfil="";

	protected OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_opcion="";
	
	public PerfilOpcionSessionBean perfilopcionSessionBean;
		
	
	
	public SistemaSessionBean sistemaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public GrupoOpcionSessionBean grupoopcionSessionBean;
	public PerfilSessionBean perfilSessionBean;
	public OpcionSessionBean opcionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PerfilOpcion> perfilopcions;		
	public List<PerfilOpcion> perfilopcionsEliminados;	
	public List<PerfilOpcion> perfilopcionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPerfilOpcion;		
	protected JButton jButtonAbrirOrderByPerfilOpcion;
	
	
	//protected JPanel jPanelOrderByPerfilOpcion;
	//public JScrollPane jScrollPanelOrderByPerfilOpcion;	
	//protected JButton jButtonCerrarOrderByPerfilOpcion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PerfilOpcionLogic perfilopcionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPerfilOpcion;
	public JScrollPane jScrollPanelDatosEdicionPerfilOpcion;
	public JScrollPane jScrollPanelDatosGeneralPerfilOpcion;
    
	
	
	//public JScrollPane jScrollPanelDatosPerfilOpcionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPerfilOpcion;
	//public JScrollPane jScrollPanelImportacionPerfilOpcion;
	
	
	
	protected JPanel jPanelAccionesPerfilOpcion;
	
    protected JPanel jPanelPaginacionPerfilOpcion;
    protected JPanel jPanelParametrosReportesPerfilOpcion;
	protected JPanel jPanelParametrosReportesAccionesPerfilOpcion;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralPerfilOpcion;
	protected Integer iXPanelCamposIniciogeneralPerfilOpcion=0;
	protected Integer iYPanelCamposIniciogeneralPerfilOpcion=0;

	protected JPanel jPanelCamposIniciopermisoPerfilOpcion;
	protected Integer iXPanelCamposIniciopermisoPerfilOpcion=0;
	protected Integer iYPanelCamposIniciopermisoPerfilOpcion=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PerfilOpcion;
	protected JPanel jPanelParametrosAuxiliar2PerfilOpcion;
	protected JPanel jPanelParametrosAuxiliar3PerfilOpcion;
	protected JPanel jPanelParametrosAuxiliar4PerfilOpcion;
	//protected JPanel jPanelParametrosAuxiliar5PerfilOpcion;
	
	
	
	//protected JPanel jPanelReporteDinamicoPerfilOpcion;
	//protected JPanel jPanelImportacionPerfilOpcion;
	
	
	public JTable jTableDatosPerfilOpcion;
	
	
	
	//public JTable jTableDatosPerfilOpcionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPerfilOpcion;
	protected JButton jButtonDuplicarPerfilOpcion;
	protected JButton jButtonCopiarPerfilOpcion;
	protected JButton jButtonVerFormPerfilOpcion;
	protected JButton jButtonNuevoRelacionesPerfilOpcion;
	protected JButton jButtonModificarPerfilOpcion;
	
    protected JButton jButtonGuardarCambiosTablaPerfilOpcion;
	protected JButton jButtonCerrarPerfilOpcion;
	
	
	protected JButton jButtonRecargarInformacionPerfilOpcion;
	protected JButton jButtonProcesarInformacionPerfilOpcion;
	
	
	protected JButton jButtonAnterioresPerfilOpcion;
	protected JButton jButtonSiguientesPerfilOpcion;
	protected JButton jButtonNuevoGuardarCambiosPerfilOpcion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPerfilOpcion;
	//protected JButton jButtonCerrarReporteDinamicoPerfilOpcion;
	//protected JButton jButtonGenerarExcelReporteDinamicoPerfilOpcion;	
	
	
	
	//protected JButton jButtonAbrirImportacionPerfilOpcion;
	//protected JButton jButtonGenerarImportacionPerfilOpcion;
	//protected JButton jButtonCerrarImportacionPerfilOpcion;
	//protected JFileChooser jFileChooserImportacionPerfilOpcion;
	//protected File fileImportacionPerfilOpcion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPerfilOpcion;
	protected JButton jButtonDuplicarToolBarPerfilOpcion;
	protected JButton jButtonNuevoRelacionesToolBarPerfilOpcion;
	
	
	public JButton jButtonGuardarCambiosToolBarPerfilOpcion;
	protected JButton jButtonCopiarToolBarPerfilOpcion;
	protected JButton jButtonVerFormToolBarPerfilOpcion;
	public JButton jButtonGuardarCambiosTablaToolBarPerfilOpcion;
	protected JButton jButtonMostrarOcultarTablaToolBarPerfilOpcion;
	protected JButton jButtonCerrarToolBarPerfilOpcion;
	
	protected JButton jButtonRecargarInformacionToolBarPerfilOpcion;
	protected JButton jButtonProcesarInformacionToolBarPerfilOpcion;
	protected JButton jButtonAnterioresToolBarPerfilOpcion;
	protected JButton jButtonSiguientesToolBarPerfilOpcion;
	protected JButton jButtonNuevoGuardarCambiosToolBarPerfilOpcion;
	protected JButton jButtonAbrirOrderByToolBarPerfilOpcion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPerfilOpcion;
	protected JMenuItem jMenuItemDuplicarPerfilOpcion;
	protected JMenuItem jMenuItemNuevoRelacionesPerfilOpcion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPerfilOpcion;
	protected JMenuItem jMenuItemCopiarPerfilOpcion;
	protected JMenuItem jMenuItemVerFormPerfilOpcion;
	protected JMenuItem jMenuItemGuardarCambiosTablaPerfilOpcion;
	protected JMenuItem jMenuItemCerrarPerfilOpcion;
	protected JMenuItem jMenuItemDetalleCerrarPerfilOpcion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPerfilOpcion;
	protected JMenuItem jMenuItemDetalleMostarOcultarPerfilOpcion;
	
	protected JMenuItem jMenuItemRecargarInformacionPerfilOpcion;
	protected JMenuItem jMenuItemProcesarInformacionPerfilOpcion;
	protected JMenuItem jMenuItemAnterioresPerfilOpcion;
	protected JMenuItem jMenuItemSiguientesPerfilOpcion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPerfilOpcion;
	protected JMenuItem jMenuItemAbrirOrderByPerfilOpcion;
	protected JMenuItem jMenuItemMostrarOcultarPerfilOpcion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPerfilOpcion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPerfilOpcion;
	protected JCheckBox jCheckBoxSeleccionadosPerfilOpcion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPerfilOpcion;
	protected JCheckBox jCheckBoxConGraficoReportePerfilOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPerfilOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPerfilOpcion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPerfilOpcion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPerfilOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPerfilOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPerfilOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPerfilOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPerfilOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPerfilOpcion;
	protected JTextField jTextFieldValorCampoGeneralPerfilOpcion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePerfilOpcion;
	//public JList<Reporte> jListColumnasSelectReportePerfilOpcion;
	//public JScrollPane jScrollColumnasSelectReportePerfilOpcion;
	
	//public JLabel jLabelRelacionesSelectReportePerfilOpcion;
	//public JList<Reporte> jListRelacionesSelectReportePerfilOpcion;
	//public JScrollPane jScrollRelacionesSelectReportePerfilOpcion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPerfilOpcion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPerfilOpcion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPerfilOpcion;
	//public JLabel jLabelTiposArchivoReporteDinamicoPerfilOpcion;
	
		
	//public JLabel jLabelArchivoImportacionPerfilOpcion;	
	//public JLabel jLabelPathArchivoImportacionPerfilOpcion;
	//protected JTextField jTextFieldPathArchivoImportacionPerfilOpcion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPerfilOpcion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPerfilOpcion;
	
	//public JLabel jLabelColumnaCategoriaValorPerfilOpcion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPerfilOpcion;
	
	//public JLabel jLabelColumnasValoresGraficoPerfilOpcion;
	//public JList<Reporte> jListColumnasValoresGraficoPerfilOpcion;
	//public JScrollPane jScrollColumnasValoresGraficoPerfilOpcion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPerfilOpcion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPerfilOpcion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPerfilOpcion;
	public JPanel jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JButton jButtonBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JPanel jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	public JButton jButtonBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	public JPanel jPanelFK_IdGrupoOpcionPerfilOpcion;
	public JButton jButtonFK_IdGrupoOpcionPerfilOpcion;
	
	public JPanel jPanelid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JLabel jLabelid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JButton jButtonid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JLabel jLabelid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JButton jButtonid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JLabel jLabelid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JButton jButtonid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new JButtonMe();
	public JButton jButtonid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JLabel jLabelid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JButton jButtonid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new JButtonMe();
	public JButton jButtonid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JLabel jLabelid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion;
	public JButton jButtonid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new JButtonMe();
	public JButton jButtonid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcionBusqueda= new JButtonMe();
	public JButton jButtonid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcionArbol= new JButtonMe();

	public JButton jButtonBuscarBusquedaPorIdPerfilPorIdOpcionid_opcionPerfilOpcion;
	
	public JPanel jPanelid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	public JLabel jLabelid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	public JButton jButtonid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	public JLabel jLabelid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	public JButton jButtonid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	public JLabel jLabelid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	public JButton jButtonid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion= new JButtonMe();
	public JButton jButtonid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	public JLabel jLabelid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion;
	public JButton jButtonid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion= new JButtonMe();
	public JButton jButtonid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion;
	public JLabel jLabelid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion;
	public JButton jButtonid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion= new JButtonMe();
	public JButton jButtonid_grupo_opcionFK_IdGrupoOpcionPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_grupo_opcionFK_IdGrupoOpcionPerfilOpcionBusqueda= new JButtonMe();

	
	
	
	
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
	public PerfilOpcionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilOpcionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilOpcionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilOpcionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPerfilOpcion)	{
		this.jButtonRecargarInformacionPerfilOpcion = jButtonRecargarInformacionPerfilOpcion;
	}
	
	public JButton getjButtonProcesarInformacionPerfilOpcion() {
		return this.jButtonProcesarInformacionPerfilOpcion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPerfilOpcion)	{
		this.jButtonProcesarInformacionPerfilOpcion = jButtonProcesarInformacionPerfilOpcion;
	}
	
	
	public JButton getjButtonRecargarInformacionPerfilOpcion() {
		return this.jButtonRecargarInformacionPerfilOpcion;
	}
	
	
	public List<PerfilOpcion> getperfilopcions() {
		return this.perfilopcions;
	}

	public void setperfilopcions(List<PerfilOpcion> perfilopcions) {
		this.perfilopcions = perfilopcions;
	}
	
	public List<PerfilOpcion> getperfilopcionsAux() {
		return this.perfilopcionsAux;
	}

	public void setperfilopcionsAux(List<PerfilOpcion> perfilopcionsAux) {
		this.perfilopcionsAux = perfilopcionsAux;
	}
	
	public List<PerfilOpcion> getperfilopcionsEliminados() {
		return this.perfilopcionsEliminados;
	}

	public void setPerfilOpcionsEliminados(List<PerfilOpcion> perfilopcionsEliminados) {
		this.perfilopcionsEliminados = perfilopcionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPerfilOpcion() {
		return jComboBoxTiposSeleccionarPerfilOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPerfilOpcion(
			JComboBox jComboBoxTiposSeleccionarPerfilOpcion) {
		this.jComboBoxTiposSeleccionarPerfilOpcion = jComboBoxTiposSeleccionarPerfilOpcion;
	}
	
	public void setBorderResaltarTiposSeleccionarPerfilOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPerfilOpcion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPerfilOpcion() {
		return jTextFieldValorCampoGeneralPerfilOpcion;
	}

	public void setjTextFieldValorCampoGeneralPerfilOpcion(
			JTextField jTextFieldValorCampoGeneralPerfilOpcion) {
		this.jTextFieldValorCampoGeneralPerfilOpcion = jTextFieldValorCampoGeneralPerfilOpcion;
	}

	public void setBorderResaltarValorCampoGeneralPerfilOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPerfilOpcion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPerfilOpcion() {
		return this.jCheckBoxSeleccionarTodosPerfilOpcion;
	}

	public void setjCheckBoxSeleccionarTodosPerfilOpcion(
			JCheckBox jCheckBoxSeleccionarTodosPerfilOpcion) {
		this.jCheckBoxSeleccionarTodosPerfilOpcion = jCheckBoxSeleccionarTodosPerfilOpcion;
	}

	public void setBorderResaltarSeleccionarTodosPerfilOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPerfilOpcion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPerfilOpcion() {
		return this.jCheckBoxSeleccionadosPerfilOpcion;
	}

	public void setjCheckBoxSeleccionadosPerfilOpcion(
			JCheckBox jCheckBoxSeleccionadosPerfilOpcion) {
		this.jCheckBoxSeleccionadosPerfilOpcion = jCheckBoxSeleccionadosPerfilOpcion;
	}
	
	public void setBorderResaltarSeleccionadosPerfilOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPerfilOpcion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPerfilOpcion() {
		return this.jComboBoxTiposArchivosReportesPerfilOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPerfilOpcion(
			JComboBox jComboBoxTiposArchivosReportesPerfilOpcion) {
		this.jComboBoxTiposArchivosReportesPerfilOpcion = jComboBoxTiposArchivosReportesPerfilOpcion;
	}

	public void setBorderResaltarTiposArchivosReportesPerfilOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPerfilOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPerfilOpcion() {
		return this.jComboBoxTiposReportesPerfilOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPerfilOpcion(
			JComboBox jComboBoxTiposReportesPerfilOpcion) {
		this.jComboBoxTiposReportesPerfilOpcion = jComboBoxTiposReportesPerfilOpcion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPerfilOpcion() {
	//	return jComboBoxTiposReportesDinamicoPerfilOpcion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPerfilOpcion(
	//		JComboBox jComboBoxTiposReportesDinamicoPerfilOpcion) {
	//	this.jComboBoxTiposReportesDinamicoPerfilOpcion = jComboBoxTiposReportesDinamicoPerfilOpcion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPerfilOpcion() {
	//	return jComboBoxTiposArchivosReportesDinamicoPerfilOpcion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPerfilOpcion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPerfilOpcion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPerfilOpcion = jComboBoxTiposArchivosReportesDinamicoPerfilOpcion;
	//}
	
	public void setBorderResaltarTiposReportesPerfilOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPerfilOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPerfilOpcion() {
		return this.jComboBoxTiposGraficosReportesPerfilOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPerfilOpcion(
			JComboBox jComboBoxTiposGraficosReportesPerfilOpcion) {
		this.jComboBoxTiposGraficosReportesPerfilOpcion = jComboBoxTiposGraficosReportesPerfilOpcion;
	}
	
	public void setBorderResaltarTiposGraficosReportesPerfilOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPerfilOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPerfilOpcion() {
		return this.jComboBoxTiposPaginacionPerfilOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPerfilOpcion(
			JComboBox jComboBoxTiposPaginacionPerfilOpcion) {
		this.jComboBoxTiposPaginacionPerfilOpcion = jComboBoxTiposPaginacionPerfilOpcion;
	}
	
	public void setBorderResaltarTiposPaginacionPerfilOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPerfilOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPerfilOpcion() {
		return this.jComboBoxTiposRelacionesPerfilOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPerfilOpcion() {
		return this.jComboBoxTiposAccionesPerfilOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPerfilOpcion(
			JComboBox jComboBoxTiposRelacionesPerfilOpcion) {
		this.jComboBoxTiposRelacionesPerfilOpcion = jComboBoxTiposRelacionesPerfilOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPerfilOpcion(
			JComboBox jComboBoxTiposAccionesPerfilOpcion) {
		this.jComboBoxTiposAccionesPerfilOpcion = jComboBoxTiposAccionesPerfilOpcion;
	}
	
	public void setBorderResaltarTiposRelacionesPerfilOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPerfilOpcion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPerfilOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPerfilOpcion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPerfilOpcion() {
	//	return jCheckBoxConGraficoDinamicoPerfilOpcion;
	//}

	//public void setjCheckBoxConGraficoDinamicoPerfilOpcion(
	//		JCheckBox jCheckBoxConGraficoDinamicoPerfilOpcion) {
	//	this.jCheckBoxConGraficoDinamicoPerfilOpcion = jCheckBoxConGraficoDinamicoPerfilOpcion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPerfilOpcion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPerfilOpcion .setBorder(borderResaltar);		
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
		this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
		
		this.perfilopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfilopcionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PerfilOpcionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Perfil Opcion MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
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
		
		PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPerfilOpcion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"nuevo","nuevo","Nuevo"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"duplicar","duplicar","Duplicar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"copiar","copiar","Copiar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"ver_form","ver_form","Ver"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"recargar","recargar","Recargar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPerfilOpcion,this.jTtoolBarPerfilOpcion,
							"cerrar","cerrar","Salir"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPerfilOpcion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPerfilOpcion;
			
				this.jButtonProcesarInformacionToolBarPerfilOpcion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPerfilOpcion;
				
		//protected JButton jButtonModificarToolBarPerfilOpcion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPerfilOpcion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPerfilOpcion=new JMenuMe("General");
		this.jmenuArchivoPerfilOpcion=new JMenuMe("Archivo");
		this.jmenuAccionesPerfilOpcion=new JMenuMe("Acciones");
		this.jmenuDatosPerfilOpcion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPerfilOpcion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPerfilOpcion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPerfilOpcion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPerfilOpcion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPerfilOpcion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPerfilOpcion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPerfilOpcion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPerfilOpcion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPerfilOpcion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPerfilOpcion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPerfilOpcion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPerfilOpcion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPerfilOpcion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPerfilOpcion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPerfilOpcion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPerfilOpcion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPerfilOpcion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPerfilOpcion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPerfilOpcion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPerfilOpcion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPerfilOpcion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPerfilOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPerfilOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPerfilOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPerfilOpcion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPerfilOpcion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPerfilOpcion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPerfilOpcion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPerfilOpcion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPerfilOpcion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPerfilOpcion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPerfilOpcion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPerfilOpcion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPerfilOpcion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPerfilOpcion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPerfilOpcion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPerfilOpcion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPerfilOpcion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPerfilOpcion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPerfilOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPerfilOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPerfilOpcion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPerfilOpcion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPerfilOpcion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPerfilOpcion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPerfilOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPerfilOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPerfilOpcion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPerfilOpcion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPerfilOpcion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPerfilOpcion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPerfilOpcion.add(this.jMenuItemCerrarPerfilOpcion);
			
			this.jmenuAccionesPerfilOpcion.add(this.jMenuItemNuevoPerfilOpcion);
			this.jmenuAccionesPerfilOpcion.add(this.jMenuItemNuevoGuardarCambiosPerfilOpcion);
			this.jmenuAccionesPerfilOpcion.add(this.jMenuItemNuevoRelacionesPerfilOpcion);
			this.jmenuAccionesPerfilOpcion.add(this.jMenuItemGuardarCambiosTablaPerfilOpcion);		
			this.jmenuAccionesPerfilOpcion.add(this.jMenuItemDuplicarPerfilOpcion);		
			this.jmenuAccionesPerfilOpcion.add(this.jMenuItemCopiarPerfilOpcion);		
			this.jmenuAccionesPerfilOpcion.add(this.jMenuItemVerFormPerfilOpcion);		
			
			this.jmenuDatosPerfilOpcion.add(this.jMenuItemRecargarInformacionPerfilOpcion);				
			this.jmenuDatosPerfilOpcion.add(this.jMenuItemAnterioresPerfilOpcion);				
			this.jmenuDatosPerfilOpcion.add(this.jMenuItemSiguientesPerfilOpcion);				
			this.jmenuDatosPerfilOpcion.add(this.jMenuItemAbrirOrderByPerfilOpcion);				
			this.jmenuDatosPerfilOpcion.add(this.jMenuItemMostrarOcultarPerfilOpcion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPerfilOpcion.add(this.jMenuItemGuardarCambiosPerfilOpcion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPerfilOpcion.add(this.jmenuArchivoPerfilOpcion);		
			this.jmenuBarPerfilOpcion.add(this.jmenuAccionesPerfilOpcion);		
			this.jmenuBarPerfilOpcion.add(this.jmenuDatosPerfilOpcion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPerfilOpcion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPerfilOpcion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setToolTipText("Buscar Por Sistema Por Modulo Por Grupo Opcion Por Perfil Por Opcion ");
		this.jButtonBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new JButtonMe();
		this.jButtonBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setText("Buscar");
		this.jButtonBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setToolTipText("Buscar Por Sistema Por Modulo Por Grupo Opcion Por Perfil Por Opcion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"buscar_button","Buscar Por Sistema Por Modulo Por Grupo Opcion Por Perfil Por Opcion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion = new JLabelMe();
		jLabelid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setText("Sistema :");
		jLabelid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setToolTipText("Sistema");
		jLabelid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new JComboBoxMe();
		jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion = new JLabelMe();
		jLabelid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setText("Modulo :");
		jLabelid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setToolTipText("Modulo");
		jLabelid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new JComboBoxMe();
		jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion = new JLabelMe();
		jLabelid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setText("Grupo Opcion :");
		jLabelid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setToolTipText("Grupo Opcion");
		jLabelid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new JComboBoxMe();
		jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion = new JLabelMe();
		jLabelid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setText("Perfil :");
		jLabelid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setToolTipText("Perfil");
		jLabelid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new JComboBoxMe();
		jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion = new JLabelMe();
		jLabelid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setText("Opcion :");
		jLabelid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setToolTipText("Opcion");
		jLabelid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new JComboBoxMe();
		jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarBusquedaPorIdPerfilPorIdOpcionid_opcionPerfilOpcion= new JButtonMe();
		this.jButtonBuscarBusquedaPorIdPerfilPorIdOpcionid_opcionPerfilOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorIdPerfilPorIdOpcionid_opcionPerfilOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorIdPerfilPorIdOpcionid_opcionPerfilOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarBusquedaPorIdPerfilPorIdOpcionid_opcionPerfilOpcion.setText("Buscar");
		this.jButtonBuscarBusquedaPorIdPerfilPorIdOpcionid_opcionPerfilOpcion.setToolTipText("Buscar");
		this.jButtonBuscarBusquedaPorIdPerfilPorIdOpcionid_opcionPerfilOpcion.setFocusable(false);

		this.jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setToolTipText("Buscar Por Sistema Por Modulo Por Grupo Opcion Por Perfil ");
		this.jButtonBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion= new JButtonMe();
		this.jButtonBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setText("Buscar");
		this.jButtonBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setToolTipText("Buscar Por Sistema Por Modulo Por Grupo Opcion Por Perfil ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"buscar_button","Buscar Por Sistema Por Modulo Por Grupo Opcion Por Perfil ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion = new JLabelMe();
		jLabelid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setText("Sistema :");
		jLabelid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setToolTipText("Sistema");
		jLabelid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion= new JComboBoxMe();
		jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion = new JLabelMe();
		jLabelid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setText("Modulo :");
		jLabelid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setToolTipText("Modulo");
		jLabelid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion= new JComboBoxMe();
		jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion = new JLabelMe();
		jLabelid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setText("Grupo Opcion :");
		jLabelid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setToolTipText("Grupo Opcion");
		jLabelid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion= new JComboBoxMe();
		jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion = new JLabelMe();
		jLabelid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setText("Perfil :");
		jLabelid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setToolTipText("Perfil");
		jLabelid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion= new JComboBoxMe();
		jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdGrupoOpcionPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGrupoOpcionPerfilOpcion.setToolTipText("Buscar Por Grupo Opcion ");
		this.jButtonFK_IdGrupoOpcionPerfilOpcion= new JButtonMe();
		this.jButtonFK_IdGrupoOpcionPerfilOpcion.setText("Buscar");
		this.jButtonFK_IdGrupoOpcionPerfilOpcion.setToolTipText("Buscar Por Grupo Opcion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGrupoOpcionPerfilOpcion,"buscar_button","Buscar Por Grupo Opcion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGrupoOpcionPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion = new JLabelMe();
		jLabelid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setText("Grupo Opcion :");
		jLabelid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setToolTipText("Grupo Opcion");
		jLabelid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion= new JComboBoxMe();
		jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPerfilOpcion=new JTabbedPane();


		this.jTabbedPaneBusquedasPerfilOpcion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasPerfilOpcion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasPerfilOpcion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));

		//this.jTabbedPaneBusquedasPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPerfilOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePerfilOpcion = new PerfilOpcionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Perfil Opcion DATOS");
			this.jInternalFrameDetalleFormPerfilOpcion = new PerfilOpcionDetalleFormJInternalFrame(jDesktopPane,this.perfilopcionSessionBean.getConGuardarRelaciones(),this.perfilopcionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPerfilOpcion = null;//new PerfilOpcionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPerfilOpcion= new GridBagLayout();
		
		
		this.jTableDatosPerfilOpcion = new JTableMe();      
		
		String sToolTipPerfilOpcion="";
		sToolTipPerfilOpcion=PerfilOpcionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPerfilOpcion+="(Seguridad.PerfilOpcion)";
		}
		
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
			sToolTipPerfilOpcion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPerfilOpcion.setToolTipText(sToolTipPerfilOpcion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPerfilOpcion);
		this.jTableDatosPerfilOpcion.setAutoCreateRowSorter(true);
		this.jTableDatosPerfilOpcion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPerfilOpcion.setRowSelectionAllowed(true);
		this.jTableDatosPerfilOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPerfilOpcion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPerfilOpcion = new JButtonMe();
		this.jButtonDuplicarPerfilOpcion = new JButtonMe();
		this.jButtonCopiarPerfilOpcion = new JButtonMe();
		this.jButtonVerFormPerfilOpcion = new JButtonMe();
		this.jButtonNuevoRelacionesPerfilOpcion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPerfilOpcion = new JButtonMe();
		this.jButtonCerrarPerfilOpcion = new JButtonMe();
		
		this.jScrollPanelDatosPerfilOpcion = new JScrollPane();   
        this.jScrollPanelDatosGeneralPerfilOpcion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciopermisoPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Perfil Opcion";
		
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Opciones" + this.sPath));
		} else {
			this.jScrollPanelDatosPerfilOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPerfilOpcion.setToolTipText("Acciones");
        this.jPanelAccionesPerfilOpcion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralPerfilOpcion.setName("jPanelCamposFingeneralPerfilOpcion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciopermisoPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Permiso"));
		this.jPanelCamposIniciopermisoPerfilOpcion.setName("jPanelCamposFinpermisoPerfilOpcion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciopermisoPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoPerfilOpcion=new ReporteDinamicoJInternalFrame(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPerfilOpcion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPerfilOpcion=new ImportacionJInternalFrame(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPerfilOpcion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPerfilOpcion = new JButtonMe();
		
		this.jButtonAbrirOrderByPerfilOpcion.setText("Orden");
		this.jButtonAbrirOrderByPerfilOpcion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPerfilOpcion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPerfilOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilOpcion,false,this);
			
			//this.cargarOrderByPerfilOpcion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPerfilOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilOpcion,true,this);
			
			//this.cargarOrderByPerfilOpcion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPerfilOpcion.setMinimumSize(new Dimension(400,50));//2330
		this.jTableDatosPerfilOpcion.setMaximumSize(new Dimension(400,50));//2330
		this.jTableDatosPerfilOpcion.setPreferredSize(new Dimension(400,50));//2330
		
		this.jScrollPanelDatosPerfilOpcion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPerfilOpcion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPerfilOpcion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPerfilOpcion.setText("Nuevo");
		this.jButtonDuplicarPerfilOpcion.setText("Duplicar");
		this.jButtonCopiarPerfilOpcion.setText("Copiar");
		this.jButtonVerFormPerfilOpcion.setText("Ver");
		this.jButtonNuevoRelacionesPerfilOpcion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPerfilOpcion.setText("Guardar");
		this.jButtonCerrarPerfilOpcion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPerfilOpcion,"nuevo_button","Nuevo",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPerfilOpcion,"duplicar_button","Duplicar",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPerfilOpcion,"copiar_button","Copiar",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPerfilOpcion,"ver_form","Ver",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPerfilOpcion,"nuevorelaciones_button","Nuevo Rel",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPerfilOpcion,"guardarcambiostabla_button","Guardar",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPerfilOpcion,"cerrar_button","Salir",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPerfilOpcion.setToolTipText("Nuevo"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPerfilOpcion.setToolTipText("Duplicar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPerfilOpcion.setToolTipText("Copiar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPerfilOpcion.setToolTipText("Ver"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPerfilOpcion.setToolTipText("Nuevo Rel"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPerfilOpcion.setToolTipText("Guardar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPerfilOpcion.setToolTipText("Salir"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPerfilOpcion";
		inputMap = this.jButtonNuevoPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPerfilOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPerfilOpcion"));
		
		//DUPLICAR
		sMapKey = "DuplicarPerfilOpcion";
		inputMap = this.jButtonDuplicarPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPerfilOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPerfilOpcion"));
		
		//COPIAR
		sMapKey = "CopiarPerfilOpcion";
		inputMap = this.jButtonCopiarPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPerfilOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPerfilOpcion"));
		
		//VEr FORM
		sMapKey = "VerFormPerfilOpcion";
		inputMap = this.jButtonVerFormPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPerfilOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPerfilOpcion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPerfilOpcion";
		inputMap = this.jButtonNuevoRelacionesPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPerfilOpcion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPerfilOpcion";
		inputMap = this.jButtonModificarPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPerfilOpcion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPerfilOpcion";
		inputMap = this.jButtonCerrarPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPerfilOpcion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPerfilOpcion";
		inputMap = this.jButtonGuardarCambiosTablaPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPerfilOpcion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PerfilOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PerfilOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PerfilOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PerfilOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PerfilOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPerfilOpcion.setName("jPanelParametrosReportesPerfilOpcion"); 
		
		this.jPanelParametrosReportesAccionesPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPerfilOpcion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPerfilOpcion.setName("jPanelParametrosReportesAccionesPerfilOpcion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPerfilOpcion = new JButtonMe();
		this.jButtonRecargarInformacionPerfilOpcion.setText("Recargar");
		this.jButtonRecargarInformacionPerfilOpcion.setToolTipText("Recargar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPerfilOpcion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPerfilOpcion = new JButtonMe();
		this.jButtonProcesarInformacionPerfilOpcion.setText("Procesar");
		this.jButtonProcesarInformacionPerfilOpcion.setToolTipText("Procesar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPerfilOpcion.setVisible(false);
			
		this.jButtonProcesarInformacionPerfilOpcion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPerfilOpcion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPerfilOpcion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPerfilOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilOpcion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPerfilOpcion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPerfilOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilOpcion.setText("TIPO");       
		this.jComboBoxTiposReportesPerfilOpcion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPerfilOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilOpcion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPerfilOpcion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPerfilOpcion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPerfilOpcion.setText("Paginacion");
		this.jComboBoxTiposPaginacionPerfilOpcion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPerfilOpcion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPerfilOpcion.setText("Accion");
		this.jComboBoxTiposRelacionesPerfilOpcion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPerfilOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPerfilOpcion.setText("Accion");
		this.jComboBoxTiposAccionesPerfilOpcion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPerfilOpcion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPerfilOpcion.setText("Accion");
		this.jComboBoxTiposSeleccionarPerfilOpcion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPerfilOpcion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPerfilOpcion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPerfilOpcion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPerfilOpcion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPerfilOpcion = new JLabelMe();
		
		this.jLabelAccionesPerfilOpcion.setText("Acciones");		
		this.jLabelAccionesPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPerfilOpcion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPerfilOpcion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPerfilOpcion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPerfilOpcion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPerfilOpcion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPerfilOpcion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPerfilOpcion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPerfilOpcion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPerfilOpcion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePerfilOpcion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePerfilOpcion.setText("Graf.");
		this.jCheckBoxConGraficoReportePerfilOpcion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPerfilOpcion = new JButtonMe();
		//this.jButtonAnterioresPerfilOpcion.setText("<<");
        this.jButtonAnterioresPerfilOpcion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPerfilOpcion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPerfilOpcion = new JButtonMe();
		//this.jButtonSiguientesPerfilOpcion.setText(">>");
        this.jButtonSiguientesPerfilOpcion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPerfilOpcion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPerfilOpcion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPerfilOpcion.setText("Nue");
        this.jButtonNuevoGuardarCambiosPerfilOpcion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPerfilOpcion,"nuevoguardarcambios_button","Nue",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPerfilOpcion";
		inputMap = this.jButtonNuevoGuardarCambiosPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPerfilOpcion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPerfilOpcion";
		inputMap = this.jButtonRecargarInformacionPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPerfilOpcion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPerfilOpcion";
		inputMap = this.jButtonSiguientesPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPerfilOpcion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPerfilOpcion";
		inputMap = this.jButtonAnterioresPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPerfilOpcion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPerfilOpcion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPerfilOpcion.setMinimumSize(new Dimension(this.getWidth(),PerfilOpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilOpcionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPerfilOpcion.setMaximumSize(new Dimension(this.getWidth(),PerfilOpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilOpcionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPerfilOpcion.setPreferredSize(new Dimension(this.getWidth(),PerfilOpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilOpcionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPerfilOpcion = new GridBagLayout();

			this.jPanelPaginacionPerfilOpcion.setLayout(gridaBagLayoutPaginacionPerfilOpcion);						
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy = 0;
			this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPerfilOpcion.add(this.jButtonAnterioresPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
					
						
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPerfilOpcion.gridy = 0;
			
			this.jPanelPaginacionPerfilOpcion.add(this.jButtonNuevoGuardarCambiosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
						
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPerfilOpcion.gridy = 0;
			this.jPanelPaginacionPerfilOpcion.add(this.jButtonSiguientesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy = 1;
			this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilOpcion.add(this.jButtonNuevoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
						
			
			
			if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
				this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPerfilOpcion.gridy = 1;
				this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPerfilOpcion.add(this.jButtonGuardarCambiosTablaPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			}
			
			
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy = 1;
			this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilOpcion.add(this.jButtonDuplicarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy = 1;
			this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilOpcion.add(this.jButtonCopiarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy = 1;
			this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilOpcion.add(this.jButtonVerFormPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy = 1;
			this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPerfilOpcion.add(this.jButtonCerrarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		
		
		
		this.jButtonRecargarInformacionPerfilOpcion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPerfilOpcion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPerfilOpcion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPerfilOpcion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPerfilOpcion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPerfilOpcion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPerfilOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPerfilOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPerfilOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPerfilOpcion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPerfilOpcion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPerfilOpcion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPerfilOpcion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPerfilOpcion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPerfilOpcion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPerfilOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPerfilOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPerfilOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPerfilOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPerfilOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPerfilOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPerfilOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPerfilOpcion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPerfilOpcion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPerfilOpcion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePerfilOpcion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePerfilOpcion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePerfilOpcion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPerfilOpcion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPerfilOpcion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPerfilOpcion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPerfilOpcion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPerfilOpcion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPerfilOpcion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPerfilOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPerfilOpcion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PerfilOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PerfilOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PerfilOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PerfilOpcion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPerfilOpcion.setLayout(gridaBagParametrosReportesPerfilOpcion);
			this.jPanelParametrosReportesAccionesPerfilOpcion.setLayout(gridaBagParametrosReportesAccionesPerfilOpcion);
			
			
			this.jPanelParametrosAuxiliar1PerfilOpcion.setLayout(gridaBagParametrosAuxiliar1PerfilOpcion);
			this.jPanelParametrosAuxiliar2PerfilOpcion.setLayout(gridaBagParametrosAuxiliar2PerfilOpcion);
			this.jPanelParametrosAuxiliar3PerfilOpcion.setLayout(gridaBagParametrosAuxiliar3PerfilOpcion);
			this.jPanelParametrosAuxiliar4PerfilOpcion.setLayout(gridaBagParametrosAuxiliar4PerfilOpcion);
			//this.jPanelParametrosAuxiliar5PerfilOpcion.setLayout(gridaBagParametrosAuxiliar2PerfilOpcion);			
			
			
			
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilOpcion.add(this.jButtonRecargarInformacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilOpcion.add(this.jComboBoxTiposPaginacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilOpcion.add(this.jCheckBoxConAltoMaximoTablaPerfilOpcion, this.gridBagConstraintsPerfilOpcion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilOpcion.add(this.jComboBoxTiposArchivosReportesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilOpcion.add(this.jPanelParametrosAuxiliar1PerfilOpcion, this.gridBagConstraintsPerfilOpcion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PerfilOpcion.add(this.jComboBoxTiposReportesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilOpcion.add(this.jPanelParametrosAuxiliar4PerfilOpcion, this.gridBagConstraintsPerfilOpcion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilOpcion.add(this.jComboBoxTiposReportesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilOpcion.add(this.jCheckBoxGenerarReportePerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilOpcion.add(this.jPanelParametrosAuxiliar2PerfilOpcion, this.gridBagConstraintsPerfilOpcion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilOpcion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilOpcion.add(this.jLabelAccionesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
				this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPerfilOpcion.add(this.jButtonAbrirOrderByPerfilOpcion, this.gridBagConstraintsPerfilOpcion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilOpcion.add(this.jComboBoxTiposSeleccionarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);			
			
			
			/*
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilOpcion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilOpcion.add(this.jCheckBoxSeleccionarTodosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PerfilOpcion.add(this.jCheckBoxSeleccionarTodosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);															
				
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PerfilOpcion.add(this.jCheckBoxSeleccionadosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilOpcion.add(this.jPanelParametrosAuxiliar3PerfilOpcion, this.gridBagConstraintsPerfilOpcion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilOpcion.add(this.jComboBoxTiposAccionesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
	
				
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilOpcion.add(this.jTextFieldValorCampoGeneralPerfilOpcion, this.gridBagConstraintsPerfilOpcion);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralPerfilOpcion= new GridBagLayout();
		this.jPanelCamposIniciogeneralPerfilOpcion.setLayout(gridaBagLayoutCamposIniciogeneralPerfilOpcion);

		GridBagLayout gridaBagLayoutCamposIniciopermisoPerfilOpcion= new GridBagLayout();
		this.jPanelCamposIniciopermisoPerfilOpcion.setLayout(gridaBagLayoutCamposIniciopermisoPerfilOpcion);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPerfilOpcion = new GridBagLayout();

			this.jScrollPanelDatosPerfilOpcion.setLayout(gridaBagLayoutDatosPerfilOpcion);
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy = 0;
			this.gridBagConstraintsPerfilOpcion.gridx = 0;
			
			this.jScrollPanelDatosPerfilOpcion.add(this.jTableDatosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPerfilOpcion.setViewportView(this.jTableDatosPerfilOpcion);
		this.jTableDatosPerfilOpcion.setFillsViewportHeight(true);
		this.jTableDatosPerfilOpcion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPerfilOpcion= new GridBagLayout();
		this.jPanelAccionesPerfilOpcion.setLayout(gridaBagLayoutAccionesPerfilOpcion);
		
		
		/*	
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 0;
			
		this.jPanelAccionesPerfilOpcion.add(this.jButtonNuevoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdPerfilPorIdOpcionPerfilOpcion= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setLayout(gridaBagLayoutBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 0;
		gridBagConstraintsPerfilOpcion.gridx = 0;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(jLabelid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 0;
		gridBagConstraintsPerfilOpcion.gridx = 1;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);


		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 1;
		gridBagConstraintsPerfilOpcion.gridx = 0;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(jLabelid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 1;
		gridBagConstraintsPerfilOpcion.gridx = 1;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);


		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 2;
		gridBagConstraintsPerfilOpcion.gridx = 0;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(jLabelid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 2;
		gridBagConstraintsPerfilOpcion.gridx = 1;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);


		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 3;
		gridBagConstraintsPerfilOpcion.gridx = 0;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(jLabelid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 3;
		gridBagConstraintsPerfilOpcion.gridx = 1;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);


		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 4;
		gridBagConstraintsPerfilOpcion.gridx = 0;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(jLabelid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 4;
		gridBagConstraintsPerfilOpcion.gridx = 1;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);


		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
		gridBagConstraintsPerfilOpcion.gridy = 4;
		gridBagConstraintsPerfilOpcion.gridx = 0;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(this.jButtonBuscarBusquedaPorIdPerfilPorIdOpcionid_opcionPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 5;
		gridBagConstraintsPerfilOpcion.gridx =1;
		jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.add(jButtonBusquedaPorIdPerfilPorIdOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);

		jTabbedPaneBusquedasPerfilOpcion.addTab("1.-Por Sistema Por Modulo Por Grupo Opcion Por Perfil Por Opcion ", jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);
		jTabbedPaneBusquedasPerfilOpcion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setLayout(gridaBagLayoutBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 0;
		gridBagConstraintsPerfilOpcion.gridx = 0;
		jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.add(jLabelid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 0;
		gridBagConstraintsPerfilOpcion.gridx = 1;
		jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.add(jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion, gridBagConstraintsPerfilOpcion);


		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 1;
		gridBagConstraintsPerfilOpcion.gridx = 0;
		jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.add(jLabelid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 1;
		gridBagConstraintsPerfilOpcion.gridx = 1;
		jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.add(jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion, gridBagConstraintsPerfilOpcion);


		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 2;
		gridBagConstraintsPerfilOpcion.gridx = 0;
		jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.add(jLabelid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 2;
		gridBagConstraintsPerfilOpcion.gridx = 1;
		jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.add(jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion, gridBagConstraintsPerfilOpcion);


		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 3;
		gridBagConstraintsPerfilOpcion.gridx = 0;
		jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.add(jLabelid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 3;
		gridBagConstraintsPerfilOpcion.gridx = 1;
		jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.add(jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 4;
		gridBagConstraintsPerfilOpcion.gridx =1;
		jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.add(jButtonBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion, gridBagConstraintsPerfilOpcion);

		jTabbedPaneBusquedasPerfilOpcion.addTab("2.-Por Sistema Por Modulo Por Grupo Opcion Por Perfil ", jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);
		jTabbedPaneBusquedasPerfilOpcion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdGrupoOpcionPerfilOpcion= new GridBagLayout();
		gridaBagLayoutFK_IdGrupoOpcionPerfilOpcion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGrupoOpcionPerfilOpcion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGrupoOpcionPerfilOpcion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGrupoOpcionPerfilOpcion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGrupoOpcionPerfilOpcion.setLayout(gridaBagLayoutFK_IdGrupoOpcionPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 0;
		gridBagConstraintsPerfilOpcion.gridx = 0;
		jPanelFK_IdGrupoOpcionPerfilOpcion.add(jLabelid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 0;
		gridBagConstraintsPerfilOpcion.gridx = 1;
		jPanelFK_IdGrupoOpcionPerfilOpcion.add(jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);

		gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilOpcion.gridy = 1;
		gridBagConstraintsPerfilOpcion.gridx =1;
		jPanelFK_IdGrupoOpcionPerfilOpcion.add(jButtonFK_IdGrupoOpcionPerfilOpcion, gridBagConstraintsPerfilOpcion);

		jTabbedPaneBusquedasPerfilOpcion.addTab("3.-Por Grupo Opcion ", jPanelFK_IdGrupoOpcionPerfilOpcion);
		jTabbedPaneBusquedasPerfilOpcion.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPerfilOpcion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPerfilOpcion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();						
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilOpcion.gridx = 0;		
			//this.gridBagConstraintsPerfilOpcion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPerfilOpcion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPerfilOpcion.gridx = 0;		
		//this.gridBagConstraintsPerfilOpcion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPerfilOpcion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPerfilOpcion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilOpcion.gridx = 0;		
			this.gridBagConstraintsPerfilOpcion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPerfilOpcion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPerfilOpcion, this.gridBagConstraintsPerfilOpcion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilOpcion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);								
		
		
		/*
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilOpcion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		*/		
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPerfilOpcion.gridx =0;
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPerfilOpcion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
				
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilOpcion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PerfilOpcionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPerfilOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPerfilOpcion = new GridBagLayout();
			this.jPanelBusquedasParametrosPerfilOpcion.setLayout(gridaBagLayoutBusquedasParametrosPerfilOpcion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPerfilOpcion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPerfilOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			
			
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		
			
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPerfilOpcion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPerfilOpcion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPerfilOpcion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPerfilOpcion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPerfilOpcion.setName("jPanelReporteDinamicoPerfilOpcion"); 
		
		this.jPanelReporteDinamicoPerfilOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPerfilOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPerfilOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPerfilOpcion.setLayout(gridaBagLayoutReporteDinamicoPerfilOpcion);
		
		
		this.jInternalFrameReporteDinamicoPerfilOpcion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPerfilOpcion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePerfilOpcion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPerfilOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPerfilOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPerfilOpcion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPerfilOpcion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPerfilOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPerfilOpcion.setResizable(true);
	    this.jInternalFrameReporteDinamicoPerfilOpcion.setClosable(true);
	    this.jInternalFrameReporteDinamicoPerfilOpcion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPerfilOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPerfilOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPerfilOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Opciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePerfilOpcion = new JLabelMe();

		this.jLabelColumnasSelectReportePerfilOpcion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPerfilOpcion.add(this.jLabelColumnasSelectReportePerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePerfilOpcion = new JList<Reporte>();
		this.jListColumnasSelectReportePerfilOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePerfilOpcion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePerfilOpcion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePerfilOpcion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePerfilOpcion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePerfilOpcion=new JScrollPane(this.jListColumnasSelectReportePerfilOpcion);
			
			this.jScrollColumnasSelectReportePerfilOpcion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePerfilOpcion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePerfilOpcion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPerfilOpcion.add(this.jListColumnasSelectReportePerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		this.jPanelReporteDinamicoPerfilOpcion.add(this.jScrollColumnasSelectReportePerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePerfilOpcion = new JLabelMe();

		this.jLabelRelacionesSelectReportePerfilOpcion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePerfilOpcion = new JList<Reporte>();
		this.jListRelacionesSelectReportePerfilOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePerfilOpcion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePerfilOpcion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePerfilOpcion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePerfilOpcion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePerfilOpcion=new JScrollPane(this.jListRelacionesSelectReportePerfilOpcion);
			
			this.jScrollRelacionesSelectReportePerfilOpcion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePerfilOpcion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePerfilOpcion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPerfilOpcion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPerfilOpcion = new JComboBoxMe();
		this.jListColumnasValoresGraficoPerfilOpcion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPerfilOpcion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPerfilOpcion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPerfilOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPerfilOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPerfilOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPerfilOpcion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPerfilOpcion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPerfilOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPerfilOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPerfilOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPerfilOpcion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPerfilOpcion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPerfilOpcion.add(this.jLabelGenerarExcelReporteDinamicoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPerfilOpcion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPerfilOpcion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPerfilOpcion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPerfilOpcion.setToolTipText("Generar EXCEL"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPerfilOpcion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPerfilOpcion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPerfilOpcion.add(this.jButtonGenerarExcelReporteDinamicoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilOpcion.add(this.jComboBoxTiposReportesDinamicoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPerfilOpcion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPerfilOpcion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPerfilOpcion.add(this.jLabelTiposArchivoReporteDinamicoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilOpcion.add(this.jComboBoxTiposArchivosReportesDinamicoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPerfilOpcion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPerfilOpcion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPerfilOpcion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPerfilOpcion.setToolTipText("Generar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilOpcion.add(this.jButtonGenerarReporteDinamicoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPerfilOpcion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPerfilOpcion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPerfilOpcion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPerfilOpcion.setToolTipText("Cancelar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilOpcion.add(this.jButtonCerrarReporteDinamicoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPerfilOpcion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPerfilOpcion= new JScrollPane(jPanelReporteDinamicoPerfilOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPerfilOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPerfilOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPerfilOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Opciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPerfilOpcion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPerfilOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPerfilOpcion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPerfilOpcion);
		this.jInternalFrameReporteDinamicoPerfilOpcion.getContentPane().add(this.jScrollPanelReporteDinamicoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPerfilOpcion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPerfilOpcion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPerfilOpcion.setName("jPanelImportacionPerfilOpcion"); 
		
		this.jPanelImportacionPerfilOpcion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPerfilOpcion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPerfilOpcion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPerfilOpcion.setLayout(gridaBagLayoutImportacionPerfilOpcion);
		
		
		this.jInternalFrameImportacionPerfilOpcion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPerfilOpcion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPerfilOpcion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePerfilOpcion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPerfilOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPerfilOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPerfilOpcion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPerfilOpcion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPerfilOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPerfilOpcion.setResizable(true);
	    this.jInternalFrameImportacionPerfilOpcion.setClosable(true);
	    this.jInternalFrameImportacionPerfilOpcion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPerfilOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPerfilOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPerfilOpcion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPerfilOpcion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPerfilOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPerfilOpcion.setResizable(true);
	    this.jInternalFrameImportacionPerfilOpcion.setClosable(true);
	    this.jInternalFrameImportacionPerfilOpcion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPerfilOpcion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPerfilOpcion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPerfilOpcion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Opciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPerfilOpcion = new JLabelMe();

		this.jLabelArchivoImportacionPerfilOpcion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYImportacion;		
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPerfilOpcion.add(this.jLabelArchivoImportacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPerfilOpcion = new JFileChooser();		
		this.jFileChooserImportacionPerfilOpcion.setToolTipText("ESCOGER ARCHIVO"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPerfilOpcion = new JButtonMe();
		this.jButtonAbrirImportacionPerfilOpcion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPerfilOpcion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPerfilOpcion.setToolTipText("Generar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilOpcion.add(this.jButtonAbrirImportacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPerfilOpcion = new JLabelMe();

		this.jLabelPathArchivoImportacionPerfilOpcion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYImportacion;		
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPerfilOpcion.add(this.jLabelPathArchivoImportacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPerfilOpcion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPerfilOpcion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPerfilOpcion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPerfilOpcion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilOpcion.add(this.jTextFieldPathArchivoImportacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPerfilOpcion = new JButtonMe();
		this.jButtonGenerarImportacionPerfilOpcion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPerfilOpcion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPerfilOpcion.setToolTipText("Generar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilOpcion.add(this.jButtonGenerarImportacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPerfilOpcion = new JButtonMe();
		this.jButtonCerrarImportacionPerfilOpcion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPerfilOpcion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPerfilOpcion.setToolTipText("Cancelar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilOpcion.add(this.jButtonCerrarImportacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPerfilOpcion = new GridBagLayout();
		
		this.jScrollPanelImportacionPerfilOpcion= new JScrollPane(jPanelImportacionPerfilOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy =iPosYImportacion;
		this.gridBagConstraintsPerfilOpcion.gridx =iPosXImportacion;
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPerfilOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPerfilOpcion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPerfilOpcion);
		this.jInternalFrameImportacionPerfilOpcion.getContentPane().add(this.jScrollPanelImportacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPerfilOpcion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPerfilOpcion = new JButtonMe();
			this.jButtonAbrirOrderByPerfilOpcion.setText("Orden");
			this.jButtonAbrirOrderByPerfilOpcion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPerfilOpcion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPerfilOpcion";
			inputMap = this.jButtonAbrirOrderByPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPerfilOpcion"));
		
		
			GridBagLayout gridaBagLayoutOrderByPerfilOpcion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPerfilOpcion.setName("jPanelOrderByPerfilOpcion"); 
			
			this.jPanelOrderByPerfilOpcion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPerfilOpcion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPerfilOpcion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPerfilOpcion.setLayout(gridaBagLayoutOrderByPerfilOpcion);
			
			
			this.jTableDatosPerfilOpcionOrderBy = new JTableMe();        
			this.jTableDatosPerfilOpcionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPerfilOpcionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPerfilOpcionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPerfilOpcionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPerfilOpcionOrderBy.setViewportView(this.jTableDatosPerfilOpcionOrderBy);
			this.jTableDatosPerfilOpcionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPerfilOpcionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPerfilOpcion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPerfilOpcion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPerfilOpcion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePerfilOpcion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPerfilOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPerfilOpcion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPerfilOpcion.setTitle("Orden");
			this.jInternalFrameOrderByPerfilOpcion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPerfilOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPerfilOpcion.setResizable(true);
			this.jInternalFrameOrderByPerfilOpcion.setClosable(true);
			this.jInternalFrameOrderByPerfilOpcion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPerfilOpcion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPerfilOpcion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPerfilOpcion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Opciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPerfilOpcion.gridx =iPosXOrderBy;
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPerfilOpcion.ipady =150;
				
			this.jPanelOrderByPerfilOpcion.add(jScrollPanelDatosPerfilOpcionOrderBy, this.gridBagConstraintsPerfilOpcion);//this.jTableDatosPerfilOpcionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPerfilOpcion = new JButtonMe();
			this.jButtonCerrarOrderByPerfilOpcion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPerfilOpcion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPerfilOpcion.setToolTipText("Cancelar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPerfilOpcion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPerfilOpcion.add(this.jButtonCerrarOrderByPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPerfilOpcion = new GridBagLayout();
			
			this.jScrollPanelOrderByPerfilOpcion= new JScrollPane(jPanelOrderByPerfilOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.gridy =iPosYOrderBy;
			this.gridBagConstraintsPerfilOpcion.gridx =iPosXOrderBy;
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPerfilOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPerfilOpcion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPerfilOpcion);
			
			this.jInternalFrameOrderByPerfilOpcion.getContentPane().add(this.jScrollPanelOrderByPerfilOpcion, this.gridBagConstraintsPerfilOpcion);			
		
		} else {
			this.jButtonAbrirOrderByPerfilOpcion = new JButtonMe();
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
		int iWidthTableCalculado=0;//4530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.perfilopcionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPerfilOpcion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPerfilOpcion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPerfilOpcion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPerfilOpcion.getRowHeight();//PerfilOpcionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PerfilOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPerfilOpcion.isSelected()) {
					iHeightTable=PerfilOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PerfilOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PerfilOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PerfilOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPerfilOpcion.isSelected()) {
					iHeightTable=PerfilOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PerfilOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PerfilOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPerfilOpcion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPerfilOpcion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPerfilOpcion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPerfilOpcion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPerfilOpcion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPerfilOpcion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPerfilOpcion!=null && this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy()!=null) {
			//if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPerfilOpcion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPerfilOpcion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPerfilOpcion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPerfilOpcion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPerfilOpcion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPerfilOpcion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=perfilopcionLogic.getPerfilOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilopcions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PerfilOpcion> TraerPerfilOpcionBeans(List<PerfilOpcion> perfilopcions,ArrayList<Classe> classes)throws Exception {
		try {
			for(PerfilOpcion perfilopcion:perfilopcions) {
					
				if(!(PerfilOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PerfilOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					perfilopcion.setsDetalleGeneralEntityReporte(PerfilOpcionConstantesFunciones.getPerfilOpcionDescripcion(perfilopcion));
										
					perfilopcion.settodo_descripcion(PerfilOpcionConstantesFunciones.gettodoDescripcion(perfilopcion));perfilopcion.setingreso_descripcion(PerfilOpcionConstantesFunciones.getingresoDescripcion(perfilopcion));perfilopcion.setmodificacion_descripcion(PerfilOpcionConstantesFunciones.getmodificacionDescripcion(perfilopcion));perfilopcion.seteliminacion_descripcion(PerfilOpcionConstantesFunciones.geteliminacionDescripcion(perfilopcion));perfilopcion.setguardar_cambios_descripcion(PerfilOpcionConstantesFunciones.getguardar_cambiosDescripcion(perfilopcion));perfilopcion.setconsulta_descripcion(PerfilOpcionConstantesFunciones.getconsultaDescripcion(perfilopcion));perfilopcion.setbusqueda_descripcion(PerfilOpcionConstantesFunciones.getbusquedaDescripcion(perfilopcion));perfilopcion.setreporte_descripcion(PerfilOpcionConstantesFunciones.getreporteDescripcion(perfilopcion));perfilopcion.setorden_descripcion(PerfilOpcionConstantesFunciones.getordenDescripcion(perfilopcion));perfilopcion.setpaginacion_medio_descripcion(PerfilOpcionConstantesFunciones.getpaginacion_medioDescripcion(perfilopcion));perfilopcion.setpaginacion_alto_descripcion(PerfilOpcionConstantesFunciones.getpaginacion_altoDescripcion(perfilopcion));perfilopcion.setpaginacion_todo_descripcion(PerfilOpcionConstantesFunciones.getpaginacion_todoDescripcion(perfilopcion));perfilopcion.setduplicar_descripcion(PerfilOpcionConstantesFunciones.getduplicarDescripcion(perfilopcion));perfilopcion.setcopiar_descripcion(PerfilOpcionConstantesFunciones.getcopiarDescripcion(perfilopcion));perfilopcion.setcon_precargar_descripcion(PerfilOpcionConstantesFunciones.getcon_precargarDescripcion(perfilopcion));perfilopcion.setestado_descripcion(PerfilOpcionConstantesFunciones.getestadoDescripcion(perfilopcion));	
					
						
					
				} else  {
							
					//perfilopcion.setsDetalleGeneralEntityReporte(perfilopcion.getsDetalleGeneralEntityReporte());
										
				}
				
				//perfilopcionbeans.add(perfilopcionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return perfilopcions;
    }
	//PARA REPORTES FIN
}
