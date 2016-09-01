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
import com.bydan.erp.seguridad.util.OpcionConstantesFunciones;

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
public class OpcionJInternalFrame extends OpcionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarOpcion;
	
	protected JMenuBar jmenuBarOpcion;
	
	protected JMenu jmenuOpcion;
	protected JMenu jmenuDatosOpcion;
	protected JMenu jmenuArchivoOpcion;
	protected JMenu jmenuAccionesOpcion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutOpcion;	
	protected GridBagConstraints gridBagConstraintsOpcion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public OpcionDetalleFormJInternalFrame jInternalFrameDetalleFormOpcion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoOpcion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionOpcion;	
	
	
	public OpcionBeanSwingJInternalFrameTree jInternalFrameTreeOpcion;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected GrupoOpcionBeanSwingJInternalFrame grupoopcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupoopcion="";

	protected OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_opcion="";

	protected TipoTeclaMascaraBeanSwingJInternalFrame tipoteclamascaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoteclamascara="";
	
	public OpcionSessionBean opcionSessionBean;
		
	
	
	public SistemaSessionBean sistemaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public GrupoOpcionSessionBean grupoopcionSessionBean;
	public TipoTeclaMascaraSessionBean tipoteclamascaraSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Opcion> opcions;		
	public List<Opcion> opcionsEliminados;	
	public List<Opcion> opcionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByOpcion;		
	protected JButton jButtonAbrirOrderByOpcion;
	
	
	//protected JPanel jPanelOrderByOpcion;
	//public JScrollPane jScrollPanelOrderByOpcion;	
	//protected JButton jButtonCerrarOrderByOpcion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public OpcionLogic opcionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosOpcion;
	public JScrollPane jScrollPanelDatosEdicionOpcion;
	public JScrollPane jScrollPanelDatosGeneralOpcion;
    
	
	
	//public JScrollPane jScrollPanelDatosOpcionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoOpcion;
	//public JScrollPane jScrollPanelImportacionOpcion;
	
	
	
	protected JPanel jPanelAccionesOpcion;
	
    protected JPanel jPanelPaginacionOpcion;
    protected JPanel jPanelParametrosReportesOpcion;
	protected JPanel jPanelParametrosReportesAccionesOpcion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Opcion;
	protected JPanel jPanelParametrosAuxiliar2Opcion;
	protected JPanel jPanelParametrosAuxiliar3Opcion;
	protected JPanel jPanelParametrosAuxiliar4Opcion;
	//protected JPanel jPanelParametrosAuxiliar5Opcion;
	
	
	
	//protected JPanel jPanelReporteDinamicoOpcion;
	//protected JPanel jPanelImportacionOpcion;
	
	
	public JTable jTableDatosOpcion;
	
	
	
	//public JTable jTableDatosOpcionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoOpcion;
	protected JButton jButtonDuplicarOpcion;
	protected JButton jButtonCopiarOpcion;
	protected JButton jButtonVerFormOpcion;
	protected JButton jButtonNuevoRelacionesOpcion;
	protected JButton jButtonModificarOpcion;
	
    protected JButton jButtonGuardarCambiosTablaOpcion;
	protected JButton jButtonCerrarOpcion;
	
	
	protected JButton jButtonRecargarInformacionOpcion;
	protected JButton jButtonProcesarInformacionOpcion;
	
	
	protected JButton jButtonAnterioresOpcion;
	protected JButton jButtonSiguientesOpcion;
	protected JButton jButtonNuevoGuardarCambiosOpcion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoOpcion;
	//protected JButton jButtonCerrarReporteDinamicoOpcion;
	//protected JButton jButtonGenerarExcelReporteDinamicoOpcion;	
	
	
	
	//protected JButton jButtonAbrirImportacionOpcion;
	//protected JButton jButtonGenerarImportacionOpcion;
	//protected JButton jButtonCerrarImportacionOpcion;
	//protected JFileChooser jFileChooserImportacionOpcion;
	//protected File fileImportacionOpcion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarOpcion;
	protected JButton jButtonDuplicarToolBarOpcion;
	protected JButton jButtonNuevoRelacionesToolBarOpcion;
	
	
	public JButton jButtonGuardarCambiosToolBarOpcion;
	protected JButton jButtonCopiarToolBarOpcion;
	protected JButton jButtonVerFormToolBarOpcion;
	public JButton jButtonGuardarCambiosTablaToolBarOpcion;
	protected JButton jButtonMostrarOcultarTablaToolBarOpcion;
	protected JButton jButtonCerrarToolBarOpcion;
	
	protected JButton jButtonRecargarInformacionToolBarOpcion;
	protected JButton jButtonProcesarInformacionToolBarOpcion;
	protected JButton jButtonAnterioresToolBarOpcion;
	protected JButton jButtonSiguientesToolBarOpcion;
	protected JButton jButtonNuevoGuardarCambiosToolBarOpcion;
	protected JButton jButtonAbrirOrderByToolBarOpcion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoOpcion;
	protected JMenuItem jMenuItemDuplicarOpcion;
	protected JMenuItem jMenuItemNuevoRelacionesOpcion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosOpcion;
	protected JMenuItem jMenuItemCopiarOpcion;
	protected JMenuItem jMenuItemVerFormOpcion;
	protected JMenuItem jMenuItemGuardarCambiosTablaOpcion;
	protected JMenuItem jMenuItemCerrarOpcion;
	protected JMenuItem jMenuItemDetalleCerrarOpcion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByOpcion;
	protected JMenuItem jMenuItemDetalleMostarOcultarOpcion;
	
	protected JMenuItem jMenuItemRecargarInformacionOpcion;
	protected JMenuItem jMenuItemProcesarInformacionOpcion;
	protected JMenuItem jMenuItemAnterioresOpcion;
	protected JMenuItem jMenuItemSiguientesOpcion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosOpcion;
	protected JMenuItem jMenuItemAbrirOrderByOpcion;
	protected JMenuItem jMenuItemMostrarOcultarOpcion;
	
	
	//MENU
	
	protected JButton jButtonArbolOpcion;	
	
	protected JLabel jLabelAccionesOpcion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosOpcion;
	protected JCheckBox jCheckBoxSeleccionadosOpcion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaOpcion;
	protected JCheckBox jCheckBoxConGraficoReporteOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesOpcion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoOpcion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarOpcion;
	protected JTextField jTextFieldValorCampoGeneralOpcion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteOpcion;
	//public JList<Reporte> jListColumnasSelectReporteOpcion;
	//public JScrollPane jScrollColumnasSelectReporteOpcion;
	
	//public JLabel jLabelRelacionesSelectReporteOpcion;
	//public JList<Reporte> jListRelacionesSelectReporteOpcion;
	//public JScrollPane jScrollRelacionesSelectReporteOpcion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoOpcion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoOpcion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoOpcion;
	//public JLabel jLabelTiposArchivoReporteDinamicoOpcion;
	
		
	//public JLabel jLabelArchivoImportacionOpcion;	
	//public JLabel jLabelPathArchivoImportacionOpcion;
	//protected JTextField jTextFieldPathArchivoImportacionOpcion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoOpcion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoOpcion;
	
	//public JLabel jLabelColumnaCategoriaValorOpcion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorOpcion;
	
	//public JLabel jLabelColumnasValoresGraficoOpcion;
	//public JList<Reporte> jListColumnasValoresGraficoOpcion;
	//public JScrollPane jScrollColumnasValoresGraficoOpcion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoOpcion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoOpcion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasOpcion;
	public JPanel jPanelBusquedaPorIdModuloPorIdOpcionOpcion;
	public JButton jButtonBusquedaPorIdModuloPorIdOpcionOpcion;
	public JPanel jPanelBusquedaPorIdModuloPorNombreOpcion;
	public JButton jButtonBusquedaPorIdModuloPorNombreOpcion;
	public JPanel jPanelBusquedaPorIdSistemaPorModuloOpcion;
	public JButton jButtonBusquedaPorIdSistemaPorModuloOpcion;
	public JPanel jPanelFK_IdSistemaOpcion;
	public JButton jButtonFK_IdSistemaOpcion;
	public JPanel jPanelFK_IdTipoTeclaMascaraOpcion;
	public JButton jButtonFK_IdTipoTeclaMascaraOpcion;
	
	public JPanel jPanelid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion;
	public JLabel jLabelid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion;
	public JButton jButtonid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdModuloPorIdOpcionOpcionUpdate= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdModuloPorIdOpcionOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloBusquedaPorIdModuloPorIdOpcionOpcion;
	public JLabel jLabelid_moduloBusquedaPorIdModuloPorIdOpcionOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion;
	public JButton jButtonid_moduloBusquedaPorIdModuloPorIdOpcionOpcion= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorIdOpcionOpcionUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorIdOpcionOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_opcionBusquedaPorIdModuloPorIdOpcionOpcion;
	public JLabel jLabelid_opcionBusquedaPorIdModuloPorIdOpcionOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion;
	public JButton jButtonid_opcionBusquedaPorIdModuloPorIdOpcionOpcion= new JButtonMe();
	public JButton jButtonid_opcionBusquedaPorIdModuloPorIdOpcionOpcionUpdate= new JButtonMe();
	public JButton jButtonid_opcionBusquedaPorIdModuloPorIdOpcionOpcionBusqueda= new JButtonMe();
	public JButton jButtonid_opcionBusquedaPorIdModuloPorIdOpcionOpcionArbol= new JButtonMe();

	
	public JPanel jPanelid_sistemaBusquedaPorIdModuloPorNombreOpcion;
	public JLabel jLabelid_sistemaBusquedaPorIdModuloPorNombreOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion;
	public JButton jButtonid_sistemaBusquedaPorIdModuloPorNombreOpcion= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdModuloPorNombreOpcionUpdate= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdModuloPorNombreOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloBusquedaPorIdModuloPorNombreOpcion;
	public JLabel jLabelid_moduloBusquedaPorIdModuloPorNombreOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion;
	public JButton jButtonid_moduloBusquedaPorIdModuloPorNombreOpcion= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorNombreOpcionUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorNombreOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorIdModuloPorNombreOpcion;
	public JLabel jLabelnombreBusquedaPorIdModuloPorNombreOpcion;
	public JTextField jTextFieldnombreBusquedaPorIdModuloPorNombreOpcion;
	public JButton jButtonnombreBusquedaPorIdModuloPorNombreOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sistemaBusquedaPorIdSistemaPorModuloOpcion;
	public JLabel jLabelid_sistemaBusquedaPorIdSistemaPorModuloOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion;
	public JButton jButtonid_sistemaBusquedaPorIdSistemaPorModuloOpcion= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdSistemaPorModuloOpcionUpdate= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdSistemaPorModuloOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloBusquedaPorIdSistemaPorModuloOpcion;
	public JLabel jLabelid_moduloBusquedaPorIdSistemaPorModuloOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion;
	public JButton jButtonid_moduloBusquedaPorIdSistemaPorModuloOpcion= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdSistemaPorModuloOpcionUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdSistemaPorModuloOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sistemaFK_IdSistemaOpcion;
	public JLabel jLabelid_sistemaFK_IdSistemaOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaFK_IdSistemaOpcion;
	public JButton jButtonid_sistemaFK_IdSistemaOpcion= new JButtonMe();
	public JButton jButtonid_sistemaFK_IdSistemaOpcionUpdate= new JButtonMe();
	public JButton jButtonid_sistemaFK_IdSistemaOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion;
	public JLabel jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion;
	public JButton jButtonid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion= new JButtonMe();
	public JButton jButtonid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcionBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public OpcionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OpcionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OpcionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OpcionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionOpcion)	{
		this.jButtonRecargarInformacionOpcion = jButtonRecargarInformacionOpcion;
	}
	
	public JButton getjButtonProcesarInformacionOpcion() {
		return this.jButtonProcesarInformacionOpcion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionOpcion)	{
		this.jButtonProcesarInformacionOpcion = jButtonProcesarInformacionOpcion;
	}
	
	
	public JButton getjButtonRecargarInformacionOpcion() {
		return this.jButtonRecargarInformacionOpcion;
	}
	
	public JButton getjButtonArbolOpcion() {
		return this.jButtonArbolOpcion;
	}
	
	public void setjButtonArbol(JButton jButtonArbolOpcion)	{
		this.jButtonArbolOpcion = jButtonArbolOpcion;
	}
	
	public List<Opcion> getopcions() {
		return this.opcions;
	}

	public void setopcions(List<Opcion> opcions) {
		this.opcions = opcions;
	}
	
	public List<Opcion> getopcionsAux() {
		return this.opcionsAux;
	}

	public void setopcionsAux(List<Opcion> opcionsAux) {
		this.opcionsAux = opcionsAux;
	}
	
	public List<Opcion> getopcionsEliminados() {
		return this.opcionsEliminados;
	}

	public void setOpcionsEliminados(List<Opcion> opcionsEliminados) {
		this.opcionsEliminados = opcionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarOpcion() {
		return jComboBoxTiposSeleccionarOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarOpcion(
			JComboBox jComboBoxTiposSeleccionarOpcion) {
		this.jComboBoxTiposSeleccionarOpcion = jComboBoxTiposSeleccionarOpcion;
	}
	
	public void setBorderResaltarTiposSeleccionarOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarOpcion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralOpcion() {
		return jTextFieldValorCampoGeneralOpcion;
	}

	public void setjTextFieldValorCampoGeneralOpcion(
			JTextField jTextFieldValorCampoGeneralOpcion) {
		this.jTextFieldValorCampoGeneralOpcion = jTextFieldValorCampoGeneralOpcion;
	}

	public void setBorderResaltarValorCampoGeneralOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralOpcion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosOpcion() {
		return this.jCheckBoxSeleccionarTodosOpcion;
	}

	public void setjCheckBoxSeleccionarTodosOpcion(
			JCheckBox jCheckBoxSeleccionarTodosOpcion) {
		this.jCheckBoxSeleccionarTodosOpcion = jCheckBoxSeleccionarTodosOpcion;
	}

	public void setBorderResaltarSeleccionarTodosOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosOpcion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosOpcion() {
		return this.jCheckBoxSeleccionadosOpcion;
	}

	public void setjCheckBoxSeleccionadosOpcion(
			JCheckBox jCheckBoxSeleccionadosOpcion) {
		this.jCheckBoxSeleccionadosOpcion = jCheckBoxSeleccionadosOpcion;
	}
	
	public void setBorderResaltarSeleccionadosOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosOpcion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesOpcion() {
		return this.jComboBoxTiposArchivosReportesOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesOpcion(
			JComboBox jComboBoxTiposArchivosReportesOpcion) {
		this.jComboBoxTiposArchivosReportesOpcion = jComboBoxTiposArchivosReportesOpcion;
	}

	public void setBorderResaltarTiposArchivosReportesOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesOpcion() {
		return this.jComboBoxTiposReportesOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesOpcion(
			JComboBox jComboBoxTiposReportesOpcion) {
		this.jComboBoxTiposReportesOpcion = jComboBoxTiposReportesOpcion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoOpcion() {
	//	return jComboBoxTiposReportesDinamicoOpcion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoOpcion(
	//		JComboBox jComboBoxTiposReportesDinamicoOpcion) {
	//	this.jComboBoxTiposReportesDinamicoOpcion = jComboBoxTiposReportesDinamicoOpcion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoOpcion() {
	//	return jComboBoxTiposArchivosReportesDinamicoOpcion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoOpcion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoOpcion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoOpcion = jComboBoxTiposArchivosReportesDinamicoOpcion;
	//}
	
	public void setBorderResaltarTiposReportesOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesOpcion() {
		return this.jComboBoxTiposGraficosReportesOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesOpcion(
			JComboBox jComboBoxTiposGraficosReportesOpcion) {
		this.jComboBoxTiposGraficosReportesOpcion = jComboBoxTiposGraficosReportesOpcion;
	}
	
	public void setBorderResaltarTiposGraficosReportesOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionOpcion() {
		return this.jComboBoxTiposPaginacionOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionOpcion(
			JComboBox jComboBoxTiposPaginacionOpcion) {
		this.jComboBoxTiposPaginacionOpcion = jComboBoxTiposPaginacionOpcion;
	}
	
	public void setBorderResaltarTiposPaginacionOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesOpcion() {
		return this.jComboBoxTiposRelacionesOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesOpcion() {
		return this.jComboBoxTiposAccionesOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesOpcion(
			JComboBox jComboBoxTiposRelacionesOpcion) {
		this.jComboBoxTiposRelacionesOpcion = jComboBoxTiposRelacionesOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesOpcion(
			JComboBox jComboBoxTiposAccionesOpcion) {
		this.jComboBoxTiposAccionesOpcion = jComboBoxTiposAccionesOpcion;
	}
	
	public void setBorderResaltarTiposRelacionesOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesOpcion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesOpcion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoOpcion() {
	//	return jCheckBoxConGraficoDinamicoOpcion;
	//}

	//public void setjCheckBoxConGraficoDinamicoOpcion(
	//		JCheckBox jCheckBoxConGraficoDinamicoOpcion) {
	//	this.jCheckBoxConGraficoDinamicoOpcion = jCheckBoxConGraficoDinamicoOpcion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoOpcion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarOpcion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoOpcion .setBorder(borderResaltar);		
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
		this.opcionSessionBean=new OpcionSessionBean();
		
		this.opcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.opcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.opcionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=OpcionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=OpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		OpcionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		OpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		OpcionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Opcion MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
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
		
		OpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarOpcion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarOpcion,this.jTtoolBarOpcion,
							"nuevo","nuevo","Nuevo"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarOpcion,this.jTtoolBarOpcion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarOpcion,this.jTtoolBarOpcion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarOpcion,this.jTtoolBarOpcion,
							"duplicar","duplicar","Duplicar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarOpcion,this.jTtoolBarOpcion,
							"copiar","copiar","Copiar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarOpcion,this.jTtoolBarOpcion,
							"ver_form","ver_form","Ver"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOpcion,this.jTtoolBarOpcion,
							"recargar","recargar","Recargar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOpcion,this.jTtoolBarOpcion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOpcion,this.jTtoolBarOpcion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarOpcion,this.jTtoolBarOpcion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarOpcion,this.jTtoolBarOpcion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarOpcion,this.jTtoolBarOpcion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarOpcion,this.jTtoolBarOpcion,
							"cerrar","cerrar","Salir"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarOpcion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarOpcion;
			
				this.jButtonProcesarInformacionToolBarOpcion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarOpcion;
				
		//protected JButton jButtonModificarToolBarOpcion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarOpcion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuOpcion=new JMenuMe("General");
		this.jmenuArchivoOpcion=new JMenuMe("Archivo");
		this.jmenuAccionesOpcion=new JMenuMe("Acciones");
		this.jmenuDatosOpcion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoOpcion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoOpcion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoOpcion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarOpcion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarOpcion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarOpcion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesOpcion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesOpcion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesOpcion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosOpcion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosOpcion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosOpcion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarOpcion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarOpcion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarOpcion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormOpcion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormOpcion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormOpcion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaOpcion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaOpcion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaOpcion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionOpcion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionOpcion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionOpcion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionOpcion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionOpcion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionOpcion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresOpcion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresOpcion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresOpcion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesOpcion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesOpcion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesOpcion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByOpcion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByOpcion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByOpcion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarOpcion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByOpcion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByOpcion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByOpcion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarOpcion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosOpcion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosOpcion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosOpcion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoOpcion.add(this.jMenuItemCerrarOpcion);
			
			this.jmenuAccionesOpcion.add(this.jMenuItemNuevoOpcion);
			this.jmenuAccionesOpcion.add(this.jMenuItemNuevoGuardarCambiosOpcion);
			this.jmenuAccionesOpcion.add(this.jMenuItemNuevoRelacionesOpcion);
			this.jmenuAccionesOpcion.add(this.jMenuItemGuardarCambiosTablaOpcion);		
			this.jmenuAccionesOpcion.add(this.jMenuItemDuplicarOpcion);		
			this.jmenuAccionesOpcion.add(this.jMenuItemCopiarOpcion);		
			this.jmenuAccionesOpcion.add(this.jMenuItemVerFormOpcion);		
			
			this.jmenuDatosOpcion.add(this.jMenuItemRecargarInformacionOpcion);				
			this.jmenuDatosOpcion.add(this.jMenuItemAnterioresOpcion);				
			this.jmenuDatosOpcion.add(this.jMenuItemSiguientesOpcion);				
			this.jmenuDatosOpcion.add(this.jMenuItemAbrirOrderByOpcion);				
			this.jmenuDatosOpcion.add(this.jMenuItemMostrarOcultarOpcion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesOpcion.add(this.jMenuItemGuardarCambiosOpcion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarOpcion.add(this.jmenuArchivoOpcion);		
			this.jmenuBarOpcion.add(this.jmenuAccionesOpcion);		
			this.jmenuBarOpcion.add(this.jmenuDatosOpcion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarOpcion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasOpcion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdModuloPorIdOpcionOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdModuloPorIdOpcionOpcion.setToolTipText("Buscar Por Sistema Por Modulo Por Opcion ");
		this.jButtonBusquedaPorIdModuloPorIdOpcionOpcion= new JButtonMe();
		this.jButtonBusquedaPorIdModuloPorIdOpcionOpcion.setText("Buscar");
		this.jButtonBusquedaPorIdModuloPorIdOpcionOpcion.setToolTipText("Buscar Por Sistema Por Modulo Por Opcion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdModuloPorIdOpcionOpcion,"buscar_button","Buscar Por Sistema Por Modulo Por Opcion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdModuloPorIdOpcionOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion = new JLabelMe();
		jLabelid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setText("Sistema :");
		jLabelid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setToolTipText("Sistema");
		jLabelid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion= new JComboBoxMe();
		jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_moduloBusquedaPorIdModuloPorIdOpcionOpcion = new JLabelMe();
		jLabelid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setText("Modulo :");
		jLabelid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setToolTipText("Modulo");
		jLabelid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaPorIdModuloPorIdOpcionOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion= new JComboBoxMe();
		jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_opcionBusquedaPorIdModuloPorIdOpcionOpcion = new JLabelMe();
		jLabelid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setText("Opcion :");
		jLabelid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setToolTipText("Opcion");
		jLabelid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_opcionBusquedaPorIdModuloPorIdOpcionOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion= new JComboBoxMe();
		jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorIdModuloPorNombreOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdModuloPorNombreOpcion.setToolTipText("Buscar Por Sistema Por Modulo Por Nombre ");
		this.jButtonBusquedaPorIdModuloPorNombreOpcion= new JButtonMe();
		this.jButtonBusquedaPorIdModuloPorNombreOpcion.setText("Buscar");
		this.jButtonBusquedaPorIdModuloPorNombreOpcion.setToolTipText("Buscar Por Sistema Por Modulo Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdModuloPorNombreOpcion,"buscar_button","Buscar Por Sistema Por Modulo Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdModuloPorNombreOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sistemaBusquedaPorIdModuloPorNombreOpcion = new JLabelMe();
		jLabelid_sistemaBusquedaPorIdModuloPorNombreOpcion.setText("Sistema :");
		jLabelid_sistemaBusquedaPorIdModuloPorNombreOpcion.setToolTipText("Sistema");
		jLabelid_sistemaBusquedaPorIdModuloPorNombreOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdModuloPorNombreOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdModuloPorNombreOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaBusquedaPorIdModuloPorNombreOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion= new JComboBoxMe();
		jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_moduloBusquedaPorIdModuloPorNombreOpcion = new JLabelMe();
		jLabelid_moduloBusquedaPorIdModuloPorNombreOpcion.setText("Modulo :");
		jLabelid_moduloBusquedaPorIdModuloPorNombreOpcion.setToolTipText("Modulo");
		jLabelid_moduloBusquedaPorIdModuloPorNombreOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorNombreOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorNombreOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaPorIdModuloPorNombreOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion= new JComboBoxMe();
		jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombreBusquedaPorIdModuloPorNombreOpcion = new JLabelMe();
		jLabelnombreBusquedaPorIdModuloPorNombreOpcion.setText("Nombre :");
		jLabelnombreBusquedaPorIdModuloPorNombreOpcion.setToolTipText("Nombre");
		jLabelnombreBusquedaPorIdModuloPorNombreOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdModuloPorNombreOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdModuloPorNombreOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorIdModuloPorNombreOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorIdModuloPorNombreOpcion= new JTextFieldMe();
		jTextFieldnombreBusquedaPorIdModuloPorNombreOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorIdModuloPorNombreOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorIdModuloPorNombreOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorIdModuloPorNombreOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorIdSistemaPorModuloOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdSistemaPorModuloOpcion.setToolTipText("Buscar Por Sistema Por Modulo ");
		this.jButtonBusquedaPorIdSistemaPorModuloOpcion= new JButtonMe();
		this.jButtonBusquedaPorIdSistemaPorModuloOpcion.setText("Buscar");
		this.jButtonBusquedaPorIdSistemaPorModuloOpcion.setToolTipText("Buscar Por Sistema Por Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdSistemaPorModuloOpcion,"buscar_button","Buscar Por Sistema Por Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdSistemaPorModuloOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sistemaBusquedaPorIdSistemaPorModuloOpcion = new JLabelMe();
		jLabelid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setText("Sistema :");
		jLabelid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setToolTipText("Sistema");
		jLabelid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaBusquedaPorIdSistemaPorModuloOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion= new JComboBoxMe();
		jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_moduloBusquedaPorIdSistemaPorModuloOpcion = new JLabelMe();
		jLabelid_moduloBusquedaPorIdSistemaPorModuloOpcion.setText("Modulo :");
		jLabelid_moduloBusquedaPorIdSistemaPorModuloOpcion.setToolTipText("Modulo");
		jLabelid_moduloBusquedaPorIdSistemaPorModuloOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdSistemaPorModuloOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdSistemaPorModuloOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaPorIdSistemaPorModuloOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion= new JComboBoxMe();
		jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSistemaOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSistemaOpcion.setToolTipText("Buscar Por Sistema ");
		this.jButtonFK_IdSistemaOpcion= new JButtonMe();
		this.jButtonFK_IdSistemaOpcion.setText("Buscar");
		this.jButtonFK_IdSistemaOpcion.setToolTipText("Buscar Por Sistema ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSistemaOpcion,"buscar_button","Buscar Por Sistema ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSistemaOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sistemaFK_IdSistemaOpcion = new JLabelMe();
		jLabelid_sistemaFK_IdSistemaOpcion.setText("Sistema :");
		jLabelid_sistemaFK_IdSistemaOpcion.setToolTipText("Sistema");
		jLabelid_sistemaFK_IdSistemaOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaFK_IdSistemaOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaFK_IdSistemaOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaFK_IdSistemaOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sistemaFK_IdSistemaOpcion= new JComboBoxMe();
		jComboBoxid_sistemaFK_IdSistemaOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaFK_IdSistemaOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaFK_IdSistemaOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaFK_IdSistemaOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTeclaMascaraOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTeclaMascaraOpcion.setToolTipText("Buscar Por Tecla Mascara ");
		this.jButtonFK_IdTipoTeclaMascaraOpcion= new JButtonMe();
		this.jButtonFK_IdTipoTeclaMascaraOpcion.setText("Buscar");
		this.jButtonFK_IdTipoTeclaMascaraOpcion.setToolTipText("Buscar Por Tecla Mascara ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTeclaMascaraOpcion,"buscar_button","Buscar Por Tecla Mascara ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTeclaMascaraOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion = new JLabelMe();
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setText("Tecla Mascara :");
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setToolTipText("Tecla Mascara");
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion= new JComboBoxMe();
		jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasOpcion=new JTabbedPane();


		this.jTabbedPaneBusquedasOpcion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasOpcion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasOpcion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleOpcion = new OpcionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Opcion DATOS");
			this.jInternalFrameDetalleFormOpcion = new OpcionDetalleFormJInternalFrame(jDesktopPane,this.opcionSessionBean.getConGuardarRelaciones(),this.opcionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormOpcion = null;//new OpcionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutOpcion= new GridBagLayout();
		
		
		this.jTableDatosOpcion = new JTableMe();      
		
		String sToolTipOpcion="";
		sToolTipOpcion=OpcionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipOpcion+="(Seguridad.Opcion)";
		}
		
		if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
			sToolTipOpcion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosOpcion.setToolTipText(sToolTipOpcion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosOpcion);
		this.jTableDatosOpcion.setAutoCreateRowSorter(true);
		this.jTableDatosOpcion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosOpcion.setRowSelectionAllowed(true);
		this.jTableDatosOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosOpcion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoOpcion = new JButtonMe();
		this.jButtonDuplicarOpcion = new JButtonMe();
		this.jButtonCopiarOpcion = new JButtonMe();
		this.jButtonVerFormOpcion = new JButtonMe();
		this.jButtonNuevoRelacionesOpcion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaOpcion = new JButtonMe();
		this.jButtonCerrarOpcion = new JButtonMe();
		
		this.jScrollPanelDatosOpcion = new JScrollPane();   
        this.jScrollPanelDatosGeneralOpcion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Opcion";
		
		if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Opciones" + this.sPath));
		} else {
			this.jScrollPanelDatosOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesOpcion.setToolTipText("Acciones");
        this.jPanelAccionesOpcion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosOpcion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoOpcion=new ReporteDinamicoJInternalFrame(OpcionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoOpcion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionOpcion=new ImportacionJInternalFrame(OpcionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionOpcion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByOpcion = new JButtonMe();
		
		this.jButtonAbrirOrderByOpcion.setText("Orden");
		this.jButtonAbrirOrderByOpcion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByOpcion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOpcion,false,this);
			
			//this.cargarOrderByOpcion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOpcion,true,this);
			
			//this.cargarOrderByOpcion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosOpcion.setMinimumSize(new Dimension(400,50));//2130
		this.jTableDatosOpcion.setMaximumSize(new Dimension(400,50));//2130
		this.jTableDatosOpcion.setPreferredSize(new Dimension(400,50));//2130
		
		this.jScrollPanelDatosOpcion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosOpcion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosOpcion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoOpcion.setText("Nuevo");
		this.jButtonDuplicarOpcion.setText("Duplicar");
		this.jButtonCopiarOpcion.setText("Copiar");
		this.jButtonVerFormOpcion.setText("Ver");
		this.jButtonNuevoRelacionesOpcion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaOpcion.setText("Guardar");
		this.jButtonCerrarOpcion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoOpcion,"nuevo_button","Nuevo",this.opcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarOpcion,"duplicar_button","Duplicar",this.opcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarOpcion,"copiar_button","Copiar",this.opcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormOpcion,"ver_form","Ver",this.opcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesOpcion,"nuevorelaciones_button","Nuevo Rel",this.opcionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaOpcion,"guardarcambiostabla_button","Guardar",this.opcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOpcion,"cerrar_button","Salir",this.opcionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoOpcion.setToolTipText("Nuevo"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarOpcion.setToolTipText("Duplicar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarOpcion.setToolTipText("Copiar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormOpcion.setToolTipText("Ver"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesOpcion.setToolTipText("Nuevo Rel"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaOpcion.setToolTipText("Guardar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarOpcion.setToolTipText("Salir"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoOpcion";
		inputMap = this.jButtonNuevoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoOpcion"));
		
		//DUPLICAR
		sMapKey = "DuplicarOpcion";
		inputMap = this.jButtonDuplicarOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarOpcion"));
		
		//COPIAR
		sMapKey = "CopiarOpcion";
		inputMap = this.jButtonCopiarOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarOpcion"));
		
		//VEr FORM
		sMapKey = "VerFormOpcion";
		inputMap = this.jButtonVerFormOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormOpcion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesOpcion";
		inputMap = this.jButtonNuevoRelacionesOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesOpcion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarOpcion";
		inputMap = this.jButtonModificarOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarOpcion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarOpcion";
		inputMap = this.jButtonCerrarOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarOpcion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaOpcion";
		inputMap = this.jButtonGuardarCambiosTablaOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaOpcion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Opcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Opcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Opcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Opcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Opcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesOpcion.setName("jPanelParametrosReportesOpcion"); 
		
		this.jPanelParametrosReportesAccionesOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesOpcion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesOpcion.setName("jPanelParametrosReportesAccionesOpcion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionOpcion = new JButtonMe();
		this.jButtonRecargarInformacionOpcion.setText("Recargar");
		this.jButtonRecargarInformacionOpcion.setToolTipText("Recargar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionOpcion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionOpcion = new JButtonMe();
		this.jButtonProcesarInformacionOpcion.setText("Procesar");
		this.jButtonProcesarInformacionOpcion.setToolTipText("Procesar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionOpcion.setVisible(false);
			
		this.jButtonProcesarInformacionOpcion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionOpcion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionOpcion.setPreferredSize(new Dimension(185,25));		
		
		
		
		this.jButtonArbolOpcion = new JButtonMe();
		this.jButtonArbolOpcion.setText("Arbol");		
		this.jButtonArbolOpcion.setToolTipText("Buscar Por Arbol");
		
		
		
			
		this.jComboBoxTiposArchivosReportesOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOpcion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesOpcion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOpcion.setText("TIPO");       
		this.jComboBoxTiposReportesOpcion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOpcion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesOpcion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionOpcion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionOpcion.setText("Paginacion");
		this.jComboBoxTiposPaginacionOpcion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesOpcion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesOpcion.setText("Accion");
		this.jComboBoxTiposRelacionesOpcion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesOpcion.setText("Accion");
		this.jComboBoxTiposAccionesOpcion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarOpcion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarOpcion.setText("Accion");
		this.jComboBoxTiposSeleccionarOpcion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralOpcion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralOpcion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralOpcion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralOpcion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesOpcion = new JLabelMe();
		
		this.jLabelAccionesOpcion.setText("Acciones");		
		this.jLabelAccionesOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosOpcion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosOpcion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosOpcion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosOpcion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosOpcion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosOpcion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaOpcion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaOpcion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaOpcion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteOpcion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteOpcion.setText("Graf.");
		this.jCheckBoxConGraficoReporteOpcion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresOpcion = new JButtonMe();
		//this.jButtonAnterioresOpcion.setText("<<");
        this.jButtonAnterioresOpcion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresOpcion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesOpcion = new JButtonMe();
		//this.jButtonSiguientesOpcion.setText(">>");
        this.jButtonSiguientesOpcion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesOpcion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosOpcion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosOpcion.setText("Nue");
        this.jButtonNuevoGuardarCambiosOpcion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosOpcion,"nuevoguardarcambios_button","Nue",this.opcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosOpcion";
		inputMap = this.jButtonNuevoGuardarCambiosOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosOpcion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionOpcion";
		inputMap = this.jButtonRecargarInformacionOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionOpcion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesOpcion";
		inputMap = this.jButtonSiguientesOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesOpcion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresOpcion";
		inputMap = this.jButtonAnterioresOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresOpcion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasOpcion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesOpcion.setMinimumSize(new Dimension(this.getWidth(),OpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OpcionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesOpcion.setMaximumSize(new Dimension(this.getWidth(),OpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OpcionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesOpcion.setPreferredSize(new Dimension(this.getWidth(),OpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OpcionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionOpcion = new GridBagLayout();

			this.jPanelPaginacionOpcion.setLayout(gridaBagLayoutPaginacionOpcion);						
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = 0;
			this.gridBagConstraintsOpcion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionOpcion.add(this.jButtonAnterioresOpcion, this.gridBagConstraintsOpcion);
					
						
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsOpcion.gridy = 0;
			
			this.jPanelPaginacionOpcion.add(this.jButtonNuevoGuardarCambiosOpcion, this.gridBagConstraintsOpcion);
						
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsOpcion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsOpcion.gridy = 0;
			this.jPanelPaginacionOpcion.add(this.jButtonSiguientesOpcion, this.gridBagConstraintsOpcion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = 1;
			this.gridBagConstraintsOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOpcion.add(this.jButtonNuevoOpcion, this.gridBagConstraintsOpcion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsOpcion = new GridBagConstraints();
				this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsOpcion.gridy = 1;
				this.gridBagConstraintsOpcion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionOpcion.add(this.jButtonNuevoRelacionesOpcion, this.gridBagConstraintsOpcion);
			}
			
			
			if(!this.opcionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsOpcion = new GridBagConstraints();
				this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsOpcion.gridy = 1;
				this.gridBagConstraintsOpcion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionOpcion.add(this.jButtonGuardarCambiosTablaOpcion, this.gridBagConstraintsOpcion);
			}
			
			
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = 1;
			this.gridBagConstraintsOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOpcion.add(this.jButtonDuplicarOpcion, this.gridBagConstraintsOpcion);
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = 1;
			this.gridBagConstraintsOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOpcion.add(this.jButtonCopiarOpcion, this.gridBagConstraintsOpcion);
		
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = 1;
			this.gridBagConstraintsOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOpcion.add(this.jButtonVerFormOpcion, this.gridBagConstraintsOpcion);
		
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = 1;
			this.gridBagConstraintsOpcion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionOpcion.add(this.jButtonCerrarOpcion, this.gridBagConstraintsOpcion);
		
		
		
		this.jButtonRecargarInformacionOpcion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionOpcion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionOpcion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jButtonArbolOpcion.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolOpcion.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolOpcion.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposArchivosReportesOpcion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesOpcion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesOpcion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesOpcion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesOpcion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesOpcion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionOpcion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionOpcion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionOpcion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaOpcion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaOpcion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaOpcion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteOpcion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteOpcion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteOpcion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosOpcion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosOpcion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosOpcion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosOpcion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosOpcion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosOpcion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesOpcion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Opcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Opcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Opcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Opcion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesOpcion.setLayout(gridaBagParametrosReportesOpcion);
			this.jPanelParametrosReportesAccionesOpcion.setLayout(gridaBagParametrosReportesAccionesOpcion);
			
			
			this.jPanelParametrosAuxiliar1Opcion.setLayout(gridaBagParametrosAuxiliar1Opcion);
			this.jPanelParametrosAuxiliar2Opcion.setLayout(gridaBagParametrosAuxiliar2Opcion);
			this.jPanelParametrosAuxiliar3Opcion.setLayout(gridaBagParametrosAuxiliar3Opcion);
			this.jPanelParametrosAuxiliar4Opcion.setLayout(gridaBagParametrosAuxiliar4Opcion);
			//this.jPanelParametrosAuxiliar5Opcion.setLayout(gridaBagParametrosAuxiliar2Opcion);			
			
			
			
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOpcion.add(this.jButtonRecargarInformacionOpcion, this.gridBagConstraintsOpcion);			
			
			

			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOpcion.add(this.jButtonArbolOpcion, this.gridBagConstraintsOpcion);
			
			
			
			//PAGINACION
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Opcion.add(this.jComboBoxTiposPaginacionOpcion, this.gridBagConstraintsOpcion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Opcion.add(this.jCheckBoxConAltoMaximoTablaOpcion, this.gridBagConstraintsOpcion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Opcion.add(this.jComboBoxTiposArchivosReportesOpcion, this.gridBagConstraintsOpcion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOpcion.add(this.jPanelParametrosAuxiliar1Opcion, this.gridBagConstraintsOpcion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Opcion.add(this.jComboBoxTiposReportesOpcion, this.gridBagConstraintsOpcion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOpcion.add(this.jPanelParametrosAuxiliar4Opcion, this.gridBagConstraintsOpcion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOpcion.add(this.jComboBoxTiposReportesOpcion, this.gridBagConstraintsOpcion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOpcion.add(this.jCheckBoxGenerarReporteOpcion, this.gridBagConstraintsOpcion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOpcion.add(this.jPanelParametrosAuxiliar2Opcion, this.gridBagConstraintsOpcion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOpcion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOpcion.add(this.jLabelAccionesOpcion, this.gridBagConstraintsOpcion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsOpcion = new GridBagConstraints();
				this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesOpcion.add(this.jButtonAbrirOrderByOpcion, this.gridBagConstraintsOpcion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOpcion.add(this.jComboBoxTiposSeleccionarOpcion, this.gridBagConstraintsOpcion);			
			
			
			/*
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOpcion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOpcion.add(this.jCheckBoxSeleccionarTodosOpcion, this.gridBagConstraintsOpcion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Opcion.add(this.jCheckBoxSeleccionarTodosOpcion, this.gridBagConstraintsOpcion);															
				
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Opcion.add(this.jCheckBoxSeleccionadosOpcion, this.gridBagConstraintsOpcion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOpcion.add(this.jPanelParametrosAuxiliar3Opcion, this.gridBagConstraintsOpcion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOpcion.add(this.jComboBoxTiposRelacionesOpcion, this.gridBagConstraintsOpcion);
				
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOpcion.add(this.jComboBoxTiposAccionesOpcion, this.gridBagConstraintsOpcion);
	
				
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOpcion.add(this.jTextFieldValorCampoGeneralOpcion, this.gridBagConstraintsOpcion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosOpcion = new GridBagLayout();

			this.jScrollPanelDatosOpcion.setLayout(gridaBagLayoutDatosOpcion);
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = 0;
			this.gridBagConstraintsOpcion.gridx = 0;
			
			this.jScrollPanelDatosOpcion.add(this.jTableDatosOpcion, this.gridBagConstraintsOpcion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosOpcion.setViewportView(this.jTableDatosOpcion);
		this.jTableDatosOpcion.setFillsViewportHeight(true);
		this.jTableDatosOpcion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesOpcion= new GridBagLayout();
		this.jPanelAccionesOpcion.setLayout(gridaBagLayoutAccionesOpcion);
		
		
		/*	
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 0;
			
		this.jPanelAccionesOpcion.add(this.jButtonNuevoOpcion, this.gridBagConstraintsOpcion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdModuloPorIdOpcionOpcion= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdModuloPorIdOpcionOpcion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorIdOpcionOpcion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorIdOpcionOpcion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdModuloPorIdOpcionOpcion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdModuloPorIdOpcionOpcion.setLayout(gridaBagLayoutBusquedaPorIdModuloPorIdOpcionOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 0;
		gridBagConstraintsOpcion.gridx = 0;
		jPanelBusquedaPorIdModuloPorIdOpcionOpcion.add(jLabelid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 0;
		gridBagConstraintsOpcion.gridx = 1;
		jPanelBusquedaPorIdModuloPorIdOpcionOpcion.add(jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion, gridBagConstraintsOpcion);


		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 1;
		gridBagConstraintsOpcion.gridx = 0;
		jPanelBusquedaPorIdModuloPorIdOpcionOpcion.add(jLabelid_moduloBusquedaPorIdModuloPorIdOpcionOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 1;
		gridBagConstraintsOpcion.gridx = 1;
		jPanelBusquedaPorIdModuloPorIdOpcionOpcion.add(jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion, gridBagConstraintsOpcion);


		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 2;
		gridBagConstraintsOpcion.gridx = 0;
		jPanelBusquedaPorIdModuloPorIdOpcionOpcion.add(jLabelid_opcionBusquedaPorIdModuloPorIdOpcionOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 2;
		gridBagConstraintsOpcion.gridx = 1;
		jPanelBusquedaPorIdModuloPorIdOpcionOpcion.add(jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 3;
		gridBagConstraintsOpcion.gridx =1;
		jPanelBusquedaPorIdModuloPorIdOpcionOpcion.add(jButtonBusquedaPorIdModuloPorIdOpcionOpcion, gridBagConstraintsOpcion);

		jTabbedPaneBusquedasOpcion.addTab("1.-Por Sistema Por Modulo Por Opcion ", jPanelBusquedaPorIdModuloPorIdOpcionOpcion);
		jTabbedPaneBusquedasOpcion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIdModuloPorNombreOpcion= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdModuloPorNombreOpcion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorNombreOpcion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorNombreOpcion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdModuloPorNombreOpcion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdModuloPorNombreOpcion.setLayout(gridaBagLayoutBusquedaPorIdModuloPorNombreOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 0;
		gridBagConstraintsOpcion.gridx = 0;
		jPanelBusquedaPorIdModuloPorNombreOpcion.add(jLabelid_sistemaBusquedaPorIdModuloPorNombreOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 0;
		gridBagConstraintsOpcion.gridx = 1;
		jPanelBusquedaPorIdModuloPorNombreOpcion.add(jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion, gridBagConstraintsOpcion);


		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 1;
		gridBagConstraintsOpcion.gridx = 0;
		jPanelBusquedaPorIdModuloPorNombreOpcion.add(jLabelid_moduloBusquedaPorIdModuloPorNombreOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 1;
		gridBagConstraintsOpcion.gridx = 1;
		jPanelBusquedaPorIdModuloPorNombreOpcion.add(jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion, gridBagConstraintsOpcion);


		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 2;
		gridBagConstraintsOpcion.gridx = 0;
		jPanelBusquedaPorIdModuloPorNombreOpcion.add(jLabelnombreBusquedaPorIdModuloPorNombreOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 2;
		gridBagConstraintsOpcion.gridx = 1;
		jPanelBusquedaPorIdModuloPorNombreOpcion.add(jTextFieldnombreBusquedaPorIdModuloPorNombreOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 3;
		gridBagConstraintsOpcion.gridx =1;
		jPanelBusquedaPorIdModuloPorNombreOpcion.add(jButtonBusquedaPorIdModuloPorNombreOpcion, gridBagConstraintsOpcion);

		jTabbedPaneBusquedasOpcion.addTab("2.-Por Sistema Por Modulo Por Nombre ", jPanelBusquedaPorIdModuloPorNombreOpcion);
		jTabbedPaneBusquedasOpcion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorIdSistemaPorModuloOpcion= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdSistemaPorModuloOpcion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdSistemaPorModuloOpcion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdSistemaPorModuloOpcion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdSistemaPorModuloOpcion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdSistemaPorModuloOpcion.setLayout(gridaBagLayoutBusquedaPorIdSistemaPorModuloOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 0;
		gridBagConstraintsOpcion.gridx = 0;
		jPanelBusquedaPorIdSistemaPorModuloOpcion.add(jLabelid_sistemaBusquedaPorIdSistemaPorModuloOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 0;
		gridBagConstraintsOpcion.gridx = 1;
		jPanelBusquedaPorIdSistemaPorModuloOpcion.add(jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion, gridBagConstraintsOpcion);


		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 1;
		gridBagConstraintsOpcion.gridx = 0;
		jPanelBusquedaPorIdSistemaPorModuloOpcion.add(jLabelid_moduloBusquedaPorIdSistemaPorModuloOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 1;
		gridBagConstraintsOpcion.gridx = 1;
		jPanelBusquedaPorIdSistemaPorModuloOpcion.add(jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 2;
		gridBagConstraintsOpcion.gridx =1;
		jPanelBusquedaPorIdSistemaPorModuloOpcion.add(jButtonBusquedaPorIdSistemaPorModuloOpcion, gridBagConstraintsOpcion);

		jTabbedPaneBusquedasOpcion.addTab("3.-Por Sistema Por Modulo ", jPanelBusquedaPorIdSistemaPorModuloOpcion);
		jTabbedPaneBusquedasOpcion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdSistemaOpcion= new GridBagLayout();
		gridaBagLayoutFK_IdSistemaOpcion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSistemaOpcion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSistemaOpcion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSistemaOpcion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSistemaOpcion.setLayout(gridaBagLayoutFK_IdSistemaOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 0;
		gridBagConstraintsOpcion.gridx = 0;
		jPanelFK_IdSistemaOpcion.add(jLabelid_sistemaFK_IdSistemaOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 0;
		gridBagConstraintsOpcion.gridx = 1;
		jPanelFK_IdSistemaOpcion.add(jComboBoxid_sistemaFK_IdSistemaOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 1;
		gridBagConstraintsOpcion.gridx =1;
		jPanelFK_IdSistemaOpcion.add(jButtonFK_IdSistemaOpcion, gridBagConstraintsOpcion);

		jTabbedPaneBusquedasOpcion.addTab("4.-Por Sistema ", jPanelFK_IdSistemaOpcion);
		jTabbedPaneBusquedasOpcion.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoTeclaMascaraOpcion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTeclaMascaraOpcion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTeclaMascaraOpcion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTeclaMascaraOpcion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTeclaMascaraOpcion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTeclaMascaraOpcion.setLayout(gridaBagLayoutFK_IdTipoTeclaMascaraOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 0;
		gridBagConstraintsOpcion.gridx = 0;
		jPanelFK_IdTipoTeclaMascaraOpcion.add(jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 0;
		gridBagConstraintsOpcion.gridx = 1;
		jPanelFK_IdTipoTeclaMascaraOpcion.add(jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion, gridBagConstraintsOpcion);

		gridBagConstraintsOpcion = new GridBagConstraints();
		gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOpcion.gridy = 1;
		gridBagConstraintsOpcion.gridx =1;
		jPanelFK_IdTipoTeclaMascaraOpcion.add(jButtonFK_IdTipoTeclaMascaraOpcion, gridBagConstraintsOpcion);

		jTabbedPaneBusquedasOpcion.addTab("5.-Por Tecla Mascara ", jPanelFK_IdTipoTeclaMascaraOpcion);
		jTabbedPaneBusquedasOpcion.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutOpcion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutOpcion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.opcionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsOpcion = new GridBagConstraints();						
			this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOpcion.gridx = 0;		
			//this.gridBagConstraintsOpcion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsOpcion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarOpcion, this.gridBagConstraintsOpcion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsOpcion.gridx = 0;		
		//this.gridBagConstraintsOpcion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsOpcion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsOpcion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOpcion.gridx = 0;		
			this.gridBagConstraintsOpcion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsOpcion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasOpcion, this.gridBagConstraintsOpcion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOpcion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesOpcion, this.gridBagConstraintsOpcion);								
		
		
		/*
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOpcion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesOpcion, this.gridBagConstraintsOpcion);
		*/		
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsOpcion.gridx =0;
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsOpcion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosOpcion, this.gridBagConstraintsOpcion);
				
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOpcion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionOpcion, this.gridBagConstraintsOpcion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeOpcion = new OpcionBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeOpcion.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeOpcion.setTitle("Opcion ARBOL");
		this.jInternalFrameTreeOpcion.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Opcion Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeOpcion.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeOpcion.setResizable(true);
	    this.jInternalFrameTreeOpcion.setClosable(true);
	    this.jInternalFrameTreeOpcion.setMaximizable(true);
			
			
		if(OpcionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosOpcion = new GridBagLayout();
			this.jPanelBusquedasParametrosOpcion.setLayout(gridaBagLayoutBusquedasParametrosOpcion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralOpcion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOpcion, this.gridBagConstraintsOpcion);
			
			
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosOpcion, this.gridBagConstraintsOpcion);
		
			
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsOpcion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesOpcion, this.gridBagConstraintsOpcion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralOpcion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoOpcion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoOpcion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoOpcion.setName("jPanelReporteDinamicoOpcion"); 
		
		this.jPanelReporteDinamicoOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoOpcion.setLayout(gridaBagLayoutReporteDinamicoOpcion);
		
		
		this.jInternalFrameReporteDinamicoOpcion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoOpcion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteOpcion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoOpcion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoOpcion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoOpcion.setResizable(true);
	    this.jInternalFrameReporteDinamicoOpcion.setClosable(true);
	    this.jInternalFrameReporteDinamicoOpcion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Opciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteOpcion = new JLabelMe();

		this.jLabelColumnasSelectReporteOpcion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOpcion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoOpcion.add(this.jLabelColumnasSelectReporteOpcion, this.gridBagConstraintsOpcion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteOpcion = new JList<Reporte>();
		this.jListColumnasSelectReporteOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteOpcion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteOpcion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteOpcion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteOpcion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteOpcion=new JScrollPane(this.jListColumnasSelectReporteOpcion);
			
			this.jScrollColumnasSelectReporteOpcion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteOpcion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteOpcion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOpcion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoOpcion.add(this.jListColumnasSelectReporteOpcion, this.gridBagConstraintsOpcion);
		this.jPanelReporteDinamicoOpcion.add(this.jScrollColumnasSelectReporteOpcion, this.gridBagConstraintsOpcion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteOpcion = new JLabelMe();

		this.jLabelRelacionesSelectReporteOpcion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOpcion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoOpcion.add(this.jLabelRelacionesSelectReporteOpcion, this.gridBagConstraintsOpcion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteOpcion = new JList<Reporte>();
		this.jListRelacionesSelectReporteOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteOpcion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteOpcion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteOpcion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteOpcion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteOpcion=new JScrollPane(this.jListRelacionesSelectReporteOpcion);
			
			this.jScrollRelacionesSelectReporteOpcion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteOpcion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteOpcion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOpcion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoOpcion.add(this.jListRelacionesSelectReporteOpcion, this.gridBagConstraintsOpcion);
		this.jPanelReporteDinamicoOpcion.add(this.jScrollRelacionesSelectReporteOpcion, this.gridBagConstraintsOpcion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoOpcion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoOpcion = new JComboBoxMe();
		this.jListColumnasValoresGraficoOpcion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoOpcion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoOpcion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoOpcion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoOpcion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoOpcion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoOpcion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOpcion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOpcion.add(this.jLabelGenerarExcelReporteDinamicoOpcion, this.gridBagConstraintsOpcion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoOpcion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoOpcion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoOpcion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoOpcion.setToolTipText("Generar EXCEL"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsOpcion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsOpcion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoOpcion.add(this.jButtonGenerarExcelReporteDinamicoOpcion, this.gridBagConstraintsOpcion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOpcion.add(this.jComboBoxTiposReportesDinamicoOpcion, this.gridBagConstraintsOpcion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoOpcion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoOpcion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOpcion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOpcion.add(this.jLabelTiposArchivoReporteDinamicoOpcion, this.gridBagConstraintsOpcion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOpcion.add(this.jComboBoxTiposArchivosReportesDinamicoOpcion, this.gridBagConstraintsOpcion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoOpcion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoOpcion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoOpcion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoOpcion.setToolTipText("Generar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOpcion.add(this.jButtonGenerarReporteDinamicoOpcion, this.gridBagConstraintsOpcion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoOpcion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoOpcion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoOpcion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoOpcion.setToolTipText("Cancelar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOpcion.add(this.jButtonCerrarReporteDinamicoOpcion, this.gridBagConstraintsOpcion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalOpcion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoOpcion= new JScrollPane(jPanelReporteDinamicoOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Opciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsOpcion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoOpcion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalOpcion);
		this.jInternalFrameReporteDinamicoOpcion.getContentPane().add(this.jScrollPanelReporteDinamicoOpcion, this.gridBagConstraintsOpcion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionOpcion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionOpcion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionOpcion.setName("jPanelImportacionOpcion"); 
		
		this.jPanelImportacionOpcion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionOpcion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionOpcion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionOpcion.setLayout(gridaBagLayoutImportacionOpcion);
		
		
		this.jInternalFrameImportacionOpcion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionOpcion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionOpcion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteOpcion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionOpcion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionOpcion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionOpcion.setResizable(true);
	    this.jInternalFrameImportacionOpcion.setClosable(true);
	    this.jInternalFrameImportacionOpcion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionOpcion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionOpcion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionOpcion.setResizable(true);
	    this.jInternalFrameImportacionOpcion.setClosable(true);
	    this.jInternalFrameImportacionOpcion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionOpcion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionOpcion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionOpcion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Opciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionOpcion = new JLabelMe();

		this.jLabelArchivoImportacionOpcion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = iPosYImportacion;		
		this.gridBagConstraintsOpcion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionOpcion.add(this.jLabelArchivoImportacionOpcion, this.gridBagConstraintsOpcion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionOpcion = new JFileChooser();		
		this.jFileChooserImportacionOpcion.setToolTipText("ESCOGER ARCHIVO"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionOpcion = new JButtonMe();
		this.jButtonAbrirImportacionOpcion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionOpcion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionOpcion.setToolTipText("Generar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOpcion.add(this.jButtonAbrirImportacionOpcion, this.gridBagConstraintsOpcion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionOpcion = new JLabelMe();

		this.jLabelPathArchivoImportacionOpcion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = iPosYImportacion;		
		this.gridBagConstraintsOpcion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionOpcion.add(this.jLabelPathArchivoImportacionOpcion, this.gridBagConstraintsOpcion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionOpcion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionOpcion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionOpcion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionOpcion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOpcion.add(this.jTextFieldPathArchivoImportacionOpcion, this.gridBagConstraintsOpcion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionOpcion = new JButtonMe();
		this.jButtonGenerarImportacionOpcion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionOpcion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionOpcion.setToolTipText("Generar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOpcion.add(this.jButtonGenerarImportacionOpcion, this.gridBagConstraintsOpcion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionOpcion = new JButtonMe();
		this.jButtonCerrarImportacionOpcion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionOpcion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionOpcion.setToolTipText("Cancelar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOpcion.add(this.jButtonCerrarImportacionOpcion, this.gridBagConstraintsOpcion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalOpcion = new GridBagLayout();
		
		this.jScrollPanelImportacionOpcion= new JScrollPane(jPanelImportacionOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy =iPosYImportacion;
		this.gridBagConstraintsOpcion.gridx =iPosXImportacion;
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionOpcion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalOpcion);
		this.jInternalFrameImportacionOpcion.getContentPane().add(this.jScrollPanelImportacionOpcion, this.gridBagConstraintsOpcion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByOpcion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByOpcion = new JButtonMe();
			this.jButtonAbrirOrderByOpcion.setText("Orden");
			this.jButtonAbrirOrderByOpcion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByOpcion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByOpcion";
			inputMap = this.jButtonAbrirOrderByOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByOpcion"));
		
		
			GridBagLayout gridaBagLayoutOrderByOpcion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByOpcion.setName("jPanelOrderByOpcion"); 
			
			this.jPanelOrderByOpcion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByOpcion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByOpcion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByOpcion.setLayout(gridaBagLayoutOrderByOpcion);
			
			
			this.jTableDatosOpcionOrderBy = new JTableMe();        
			this.jTableDatosOpcionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosOpcionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosOpcionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosOpcionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosOpcionOrderBy.setViewportView(this.jTableDatosOpcionOrderBy);
			this.jTableDatosOpcionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosOpcionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByOpcion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByOpcion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByOpcion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteOpcion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByOpcion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByOpcion.setTitle("Orden");
			this.jInternalFrameOrderByOpcion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByOpcion.setResizable(true);
			this.jInternalFrameOrderByOpcion.setClosable(true);
			this.jInternalFrameOrderByOpcion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByOpcion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByOpcion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByOpcion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Opciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsOpcion.gridx =iPosXOrderBy;
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsOpcion.ipady =150;
				
			this.jPanelOrderByOpcion.add(jScrollPanelDatosOpcionOrderBy, this.gridBagConstraintsOpcion);//this.jTableDatosOpcionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByOpcion = new JButtonMe();
			this.jButtonCerrarOrderByOpcion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByOpcion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByOpcion.setToolTipText("Cancelar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsOpcion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByOpcion.add(this.jButtonCerrarOrderByOpcion, this.gridBagConstraintsOpcion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalOpcion = new GridBagLayout();
			
			this.jScrollPanelOrderByOpcion= new JScrollPane(jPanelOrderByOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridy =iPosYOrderBy;
			this.gridBagConstraintsOpcion.gridx =iPosXOrderBy;
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByOpcion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalOpcion);
			
			this.jInternalFrameOrderByOpcion.getContentPane().add(this.jScrollPanelOrderByOpcion, this.gridBagConstraintsOpcion);			
		
		} else {
			this.jButtonAbrirOrderByOpcion = new JButtonMe();
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
		int iWidthTableCalculado=0;//4630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=500;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.opcionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosOpcion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosOpcion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosOpcion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosOpcion.getRowHeight();//OpcionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.opcionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > OpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaOpcion.isSelected()) {
					iHeightTable=OpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < OpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=OpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > OpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaOpcion.isSelected()) {
					iHeightTable=OpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < OpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=OpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosOpcion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosOpcion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosOpcion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosOpcion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosOpcion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosOpcion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByOpcion!=null && this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy()!=null) {
			//if(!this.opcionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByOpcion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByOpcion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByOpcion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosOpcion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosOpcion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosOpcion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=opcionLogic.getOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=opcions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Opcion> TraerOpcionBeans(List<Opcion> opcions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Opcion opcion:opcions) {
					
				if(!(OpcionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || OpcionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					opcion.setsDetalleGeneralEntityReporte(OpcionConstantesFunciones.getOpcionDescripcion(opcion));
										
					opcion.setes_para_menu_descripcion(OpcionConstantesFunciones.getes_para_menuDescripcion(opcion));opcion.setcon_mostrar_acciones_campo_descripcion(OpcionConstantesFunciones.getcon_mostrar_acciones_campoDescripcion(opcion));opcion.setes_guardar_relaciones_descripcion(OpcionConstantesFunciones.getes_guardar_relacionesDescripcion(opcion));opcion.setestado_descripcion(OpcionConstantesFunciones.getestadoDescripcion(opcion));	
					
					

					if(opcion.getUsuarioOpcions()!=null && Funciones.existeClass(classes,UsuarioOpcion.class)) {
						try{opcion.setusuarioopcionsDescripcionReporte(new JRBeanCollectionDataSource(UsuarioOpcionJInternalFrame.TraerUsuarioOpcionBeans(opcion.getUsuarioOpcions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(opcion.getOpcions()!=null && Funciones.existeClass(classes,Opcion.class)) {
						try{opcion.setopcionsDescripcionReporte(new JRBeanCollectionDataSource(OpcionJInternalFrame.TraerOpcionBeans(opcion.getOpcions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(opcion.getAccions()!=null && Funciones.existeClass(classes,Accion.class)) {
						try{opcion.setaccionsDescripcionReporte(new JRBeanCollectionDataSource(AccionJInternalFrame.TraerAccionBeans(opcion.getAccions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(opcion.getPerfilOpcions()!=null && Funciones.existeClass(classes,PerfilOpcion.class)) {
						try{opcion.setperfilopcionsDescripcionReporte(new JRBeanCollectionDataSource(PerfilOpcionJInternalFrame.TraerPerfilOpcionBeans(opcion.getPerfilOpcions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(opcion.getCampos()!=null && Funciones.existeClass(classes,Campo.class)) {
						try{opcion.setcamposDescripcionReporte(new JRBeanCollectionDataSource(CampoJInternalFrame.TraerCampoBeans(opcion.getCampos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//opcion.setsDetalleGeneralEntityReporte(opcion.getsDetalleGeneralEntityReporte());
										
				}
				
				//opcionbeans.add(opcionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return opcions;
    }
	//PARA REPORTES FIN
}
