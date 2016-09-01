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

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.contabilidad.util.DatoFormularioIvaConstantesFunciones;

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
public class DatoFormularioIvaJInternalFrame extends DatoFormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDatoFormularioIva;
	
	protected JMenuBar jmenuBarDatoFormularioIva;
	
	protected JMenu jmenuDatoFormularioIva;
	protected JMenu jmenuDatosDatoFormularioIva;
	protected JMenu jmenuArchivoDatoFormularioIva;
	protected JMenu jmenuAccionesDatoFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDatoFormularioIva;	
	protected GridBagConstraints gridBagConstraintsDatoFormularioIva;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DatoFormularioIvaDetalleFormJInternalFrame jInternalFrameDetalleFormDatoFormularioIva;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDatoFormularioIva;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDatoFormularioIva;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected SemestreBeanSwingJInternalFrame semestreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_semestre="";
	
	public DatoFormularioIvaSessionBean datoformularioivaSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public SemestreSessionBean semestreSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DatoFormularioIva> datoformularioivas;		
	public List<DatoFormularioIva> datoformularioivasEliminados;	
	public List<DatoFormularioIva> datoformularioivasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDatoFormularioIva;		
	protected JButton jButtonAbrirOrderByDatoFormularioIva;
	
	
	//protected JPanel jPanelOrderByDatoFormularioIva;
	//public JScrollPane jScrollPanelOrderByDatoFormularioIva;	
	//protected JButton jButtonCerrarOrderByDatoFormularioIva;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DatoFormularioIvaLogic datoformularioivaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDatoFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionDatoFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralDatoFormularioIva;
    
	
	
	//public JScrollPane jScrollPanelDatosDatoFormularioIvaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDatoFormularioIva;
	//public JScrollPane jScrollPanelImportacionDatoFormularioIva;
	
	
	
	protected JPanel jPanelAccionesDatoFormularioIva;
	
    protected JPanel jPanelPaginacionDatoFormularioIva;
    protected JPanel jPanelParametrosReportesDatoFormularioIva;
	protected JPanel jPanelParametrosReportesAccionesDatoFormularioIva;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DatoFormularioIva;
	protected JPanel jPanelParametrosAuxiliar2DatoFormularioIva;
	protected JPanel jPanelParametrosAuxiliar3DatoFormularioIva;
	protected JPanel jPanelParametrosAuxiliar4DatoFormularioIva;
	//protected JPanel jPanelParametrosAuxiliar5DatoFormularioIva;
	
	
	
	//protected JPanel jPanelReporteDinamicoDatoFormularioIva;
	//protected JPanel jPanelImportacionDatoFormularioIva;
	
	
	public JTable jTableDatosDatoFormularioIva;
	
	
	
	//public JTable jTableDatosDatoFormularioIvaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDatoFormularioIva;
	protected JButton jButtonDuplicarDatoFormularioIva;
	protected JButton jButtonCopiarDatoFormularioIva;
	protected JButton jButtonVerFormDatoFormularioIva;
	protected JButton jButtonNuevoRelacionesDatoFormularioIva;
	protected JButton jButtonModificarDatoFormularioIva;
	
    protected JButton jButtonGuardarCambiosTablaDatoFormularioIva;
	protected JButton jButtonCerrarDatoFormularioIva;
	
	
	protected JButton jButtonRecargarInformacionDatoFormularioIva;
	protected JButton jButtonProcesarInformacionDatoFormularioIva;
	
	
	protected JButton jButtonAnterioresDatoFormularioIva;
	protected JButton jButtonSiguientesDatoFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosDatoFormularioIva;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDatoFormularioIva;
	//protected JButton jButtonCerrarReporteDinamicoDatoFormularioIva;
	//protected JButton jButtonGenerarExcelReporteDinamicoDatoFormularioIva;	
	
	
	
	//protected JButton jButtonAbrirImportacionDatoFormularioIva;
	//protected JButton jButtonGenerarImportacionDatoFormularioIva;
	//protected JButton jButtonCerrarImportacionDatoFormularioIva;
	//protected JFileChooser jFileChooserImportacionDatoFormularioIva;
	//protected File fileImportacionDatoFormularioIva;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDatoFormularioIva;
	protected JButton jButtonDuplicarToolBarDatoFormularioIva;
	protected JButton jButtonNuevoRelacionesToolBarDatoFormularioIva;
	
	
	public JButton jButtonGuardarCambiosToolBarDatoFormularioIva;
	protected JButton jButtonCopiarToolBarDatoFormularioIva;
	protected JButton jButtonVerFormToolBarDatoFormularioIva;
	public JButton jButtonGuardarCambiosTablaToolBarDatoFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarDatoFormularioIva;
	protected JButton jButtonCerrarToolBarDatoFormularioIva;
	
	protected JButton jButtonRecargarInformacionToolBarDatoFormularioIva;
	protected JButton jButtonProcesarInformacionToolBarDatoFormularioIva;
	protected JButton jButtonAnterioresToolBarDatoFormularioIva;
	protected JButton jButtonSiguientesToolBarDatoFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosToolBarDatoFormularioIva;
	protected JButton jButtonAbrirOrderByToolBarDatoFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDatoFormularioIva;
	protected JMenuItem jMenuItemDuplicarDatoFormularioIva;
	protected JMenuItem jMenuItemNuevoRelacionesDatoFormularioIva;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDatoFormularioIva;
	protected JMenuItem jMenuItemCopiarDatoFormularioIva;
	protected JMenuItem jMenuItemVerFormDatoFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaDatoFormularioIva;
	protected JMenuItem jMenuItemCerrarDatoFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarDatoFormularioIva;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDatoFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarDatoFormularioIva;
	
	protected JMenuItem jMenuItemRecargarInformacionDatoFormularioIva;
	protected JMenuItem jMenuItemProcesarInformacionDatoFormularioIva;
	protected JMenuItem jMenuItemAnterioresDatoFormularioIva;
	protected JMenuItem jMenuItemSiguientesDatoFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDatoFormularioIva;
	protected JMenuItem jMenuItemAbrirOrderByDatoFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarDatoFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDatoFormularioIva;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDatoFormularioIva;
	protected JCheckBox jCheckBoxSeleccionadosDatoFormularioIva;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDatoFormularioIva;
	protected JCheckBox jCheckBoxConGraficoReporteDatoFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDatoFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDatoFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDatoFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDatoFormularioIva;
	protected JTextField jTextFieldValorCampoGeneralDatoFormularioIva;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDatoFormularioIva;
	//public JList<Reporte> jListColumnasSelectReporteDatoFormularioIva;
	//public JScrollPane jScrollColumnasSelectReporteDatoFormularioIva;
	
	//public JLabel jLabelRelacionesSelectReporteDatoFormularioIva;
	//public JList<Reporte> jListRelacionesSelectReporteDatoFormularioIva;
	//public JScrollPane jScrollRelacionesSelectReporteDatoFormularioIva;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDatoFormularioIva;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDatoFormularioIva;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDatoFormularioIva;
	//public JLabel jLabelTiposArchivoReporteDinamicoDatoFormularioIva;
	
		
	//public JLabel jLabelArchivoImportacionDatoFormularioIva;	
	//public JLabel jLabelPathArchivoImportacionDatoFormularioIva;
	//protected JTextField jTextFieldPathArchivoImportacionDatoFormularioIva;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDatoFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDatoFormularioIva;
	
	//public JLabel jLabelColumnaCategoriaValorDatoFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDatoFormularioIva;
	
	//public JLabel jLabelColumnasValoresGraficoDatoFormularioIva;
	//public JList<Reporte> jListColumnasValoresGraficoDatoFormularioIva;
	//public JScrollPane jScrollColumnasValoresGraficoDatoFormularioIva;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDatoFormularioIva;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDatoFormularioIva;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDatoFormularioIva;
	public JPanel jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva;
	public JButton jButtonBusquedaPorIdAnioIdSemestreDatoFormularioIva;
	public JPanel jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva;
	public JButton jButtonBusquedaPorIdAnioPorIdMesDatoFormularioIva;
	public JPanel jPanelFK_IdAnioDatoFormularioIva;
	public JButton jButtonFK_IdAnioDatoFormularioIva;
	
	public JPanel jPanelid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva;
	public JLabel jLabelid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva;
	public JButton jButtonid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva= new JButtonMe();
	public JButton jButtonid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva;
	public JLabel jLabelid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva;
	public JButton jButtonid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva= new JButtonMe();
	public JButton jButtonid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva;
	public JLabel jLabelid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva;
	public JButton jButtonid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva= new JButtonMe();
	public JButton jButtonid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva;
	public JLabel jLabelid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva;
	public JButton jButtonid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva= new JButtonMe();
	public JButton jButtonid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioFK_IdAnioDatoFormularioIva;
	public JLabel jLabelid_anioFK_IdAnioDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioDatoFormularioIva;
	public JButton jButtonid_anioFK_IdAnioDatoFormularioIva= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioDatoFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioDatoFormularioIvaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DatoFormularioIvaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DatoFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioIvaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioIvaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioIvaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DatoFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDatoFormularioIva)	{
		this.jButtonRecargarInformacionDatoFormularioIva = jButtonRecargarInformacionDatoFormularioIva;
	}
	
	public JButton getjButtonProcesarInformacionDatoFormularioIva() {
		return this.jButtonProcesarInformacionDatoFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDatoFormularioIva)	{
		this.jButtonProcesarInformacionDatoFormularioIva = jButtonProcesarInformacionDatoFormularioIva;
	}
	
	
	public JButton getjButtonRecargarInformacionDatoFormularioIva() {
		return this.jButtonRecargarInformacionDatoFormularioIva;
	}
	
	
	public List<DatoFormularioIva> getdatoformularioivas() {
		return this.datoformularioivas;
	}

	public void setdatoformularioivas(List<DatoFormularioIva> datoformularioivas) {
		this.datoformularioivas = datoformularioivas;
	}
	
	public List<DatoFormularioIva> getdatoformularioivasAux() {
		return this.datoformularioivasAux;
	}

	public void setdatoformularioivasAux(List<DatoFormularioIva> datoformularioivasAux) {
		this.datoformularioivasAux = datoformularioivasAux;
	}
	
	public List<DatoFormularioIva> getdatoformularioivasEliminados() {
		return this.datoformularioivasEliminados;
	}

	public void setDatoFormularioIvasEliminados(List<DatoFormularioIva> datoformularioivasEliminados) {
		this.datoformularioivasEliminados = datoformularioivasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDatoFormularioIva() {
		return jComboBoxTiposSeleccionarDatoFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDatoFormularioIva(
			JComboBox jComboBoxTiposSeleccionarDatoFormularioIva) {
		this.jComboBoxTiposSeleccionarDatoFormularioIva = jComboBoxTiposSeleccionarDatoFormularioIva;
	}
	
	public void setBorderResaltarTiposSeleccionarDatoFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDatoFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDatoFormularioIva .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDatoFormularioIva() {
		return jTextFieldValorCampoGeneralDatoFormularioIva;
	}

	public void setjTextFieldValorCampoGeneralDatoFormularioIva(
			JTextField jTextFieldValorCampoGeneralDatoFormularioIva) {
		this.jTextFieldValorCampoGeneralDatoFormularioIva = jTextFieldValorCampoGeneralDatoFormularioIva;
	}

	public void setBorderResaltarValorCampoGeneralDatoFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioIva.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDatoFormularioIva .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDatoFormularioIva() {
		return this.jCheckBoxSeleccionarTodosDatoFormularioIva;
	}

	public void setjCheckBoxSeleccionarTodosDatoFormularioIva(
			JCheckBox jCheckBoxSeleccionarTodosDatoFormularioIva) {
		this.jCheckBoxSeleccionarTodosDatoFormularioIva = jCheckBoxSeleccionarTodosDatoFormularioIva;
	}

	public void setBorderResaltarSeleccionarTodosDatoFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDatoFormularioIva .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDatoFormularioIva() {
		return this.jCheckBoxSeleccionadosDatoFormularioIva;
	}

	public void setjCheckBoxSeleccionadosDatoFormularioIva(
			JCheckBox jCheckBoxSeleccionadosDatoFormularioIva) {
		this.jCheckBoxSeleccionadosDatoFormularioIva = jCheckBoxSeleccionadosDatoFormularioIva;
	}
	
	public void setBorderResaltarSeleccionadosDatoFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDatoFormularioIva .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDatoFormularioIva() {
		return this.jComboBoxTiposArchivosReportesDatoFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDatoFormularioIva(
			JComboBox jComboBoxTiposArchivosReportesDatoFormularioIva) {
		this.jComboBoxTiposArchivosReportesDatoFormularioIva = jComboBoxTiposArchivosReportesDatoFormularioIva;
	}

	public void setBorderResaltarTiposArchivosReportesDatoFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDatoFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDatoFormularioIva() {
		return this.jComboBoxTiposReportesDatoFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDatoFormularioIva(
			JComboBox jComboBoxTiposReportesDatoFormularioIva) {
		this.jComboBoxTiposReportesDatoFormularioIva = jComboBoxTiposReportesDatoFormularioIva;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDatoFormularioIva() {
	//	return jComboBoxTiposReportesDinamicoDatoFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDatoFormularioIva(
	//		JComboBox jComboBoxTiposReportesDinamicoDatoFormularioIva) {
	//	this.jComboBoxTiposReportesDinamicoDatoFormularioIva = jComboBoxTiposReportesDinamicoDatoFormularioIva;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDatoFormularioIva() {
	//	return jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDatoFormularioIva(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva = jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva;
	//}
	
	public void setBorderResaltarTiposReportesDatoFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDatoFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDatoFormularioIva() {
		return this.jComboBoxTiposGraficosReportesDatoFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDatoFormularioIva(
			JComboBox jComboBoxTiposGraficosReportesDatoFormularioIva) {
		this.jComboBoxTiposGraficosReportesDatoFormularioIva = jComboBoxTiposGraficosReportesDatoFormularioIva;
	}
	
	public void setBorderResaltarTiposGraficosReportesDatoFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDatoFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDatoFormularioIva() {
		return this.jComboBoxTiposPaginacionDatoFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDatoFormularioIva(
			JComboBox jComboBoxTiposPaginacionDatoFormularioIva) {
		this.jComboBoxTiposPaginacionDatoFormularioIva = jComboBoxTiposPaginacionDatoFormularioIva;
	}
	
	public void setBorderResaltarTiposPaginacionDatoFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDatoFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDatoFormularioIva() {
		return this.jComboBoxTiposRelacionesDatoFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDatoFormularioIva() {
		return this.jComboBoxTiposAccionesDatoFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDatoFormularioIva(
			JComboBox jComboBoxTiposRelacionesDatoFormularioIva) {
		this.jComboBoxTiposRelacionesDatoFormularioIva = jComboBoxTiposRelacionesDatoFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDatoFormularioIva(
			JComboBox jComboBoxTiposAccionesDatoFormularioIva) {
		this.jComboBoxTiposAccionesDatoFormularioIva = jComboBoxTiposAccionesDatoFormularioIva;
	}
	
	public void setBorderResaltarTiposRelacionesDatoFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDatoFormularioIva .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDatoFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDatoFormularioIva .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDatoFormularioIva() {
	//	return jCheckBoxConGraficoDinamicoDatoFormularioIva;
	//}

	//public void setjCheckBoxConGraficoDinamicoDatoFormularioIva(
	//		JCheckBox jCheckBoxConGraficoDinamicoDatoFormularioIva) {
	//	this.jCheckBoxConGraficoDinamicoDatoFormularioIva = jCheckBoxConGraficoDinamicoDatoFormularioIva;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDatoFormularioIva() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDatoFormularioIva.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDatoFormularioIva .setBorder(borderResaltar);		
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
		this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
		
		this.datoformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datoformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.datoformularioivaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DatoFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DatoFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DatoFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DatoFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DatoFormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dato Formulario Iva MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
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
		
		DatoFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DatoFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDatoFormularioIva= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"nuevo","nuevo","Nuevo"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"duplicar","duplicar","Duplicar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"copiar","copiar","Copiar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"ver_form","ver_form","Ver"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"recargar","recargar","Recargar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDatoFormularioIva,this.jTtoolBarDatoFormularioIva,
							"cerrar","cerrar","Salir"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDatoFormularioIva=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDatoFormularioIva;
			
				this.jButtonProcesarInformacionToolBarDatoFormularioIva=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDatoFormularioIva;
				
		//protected JButton jButtonModificarToolBarDatoFormularioIva;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDatoFormularioIva=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDatoFormularioIva=new JMenuMe("General");
		this.jmenuArchivoDatoFormularioIva=new JMenuMe("Archivo");
		this.jmenuAccionesDatoFormularioIva=new JMenuMe("Acciones");
		this.jmenuDatosDatoFormularioIva=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDatoFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDatoFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDatoFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDatoFormularioIva= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDatoFormularioIva.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDatoFormularioIva,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDatoFormularioIva= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDatoFormularioIva.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDatoFormularioIva,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDatoFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDatoFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDatoFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDatoFormularioIva= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDatoFormularioIva.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDatoFormularioIva,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDatoFormularioIva= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDatoFormularioIva.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDatoFormularioIva,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDatoFormularioIva= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDatoFormularioIva.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDatoFormularioIva,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDatoFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDatoFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDatoFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDatoFormularioIva= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDatoFormularioIva.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDatoFormularioIva,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDatoFormularioIva= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDatoFormularioIva.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDatoFormularioIva,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDatoFormularioIva= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDatoFormularioIva.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDatoFormularioIva,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDatoFormularioIva= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDatoFormularioIva.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDatoFormularioIva,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDatoFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDatoFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDatoFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDatoFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDatoFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDatoFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDatoFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDatoFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDatoFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDatoFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDatoFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDatoFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDatoFormularioIva= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDatoFormularioIva.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDatoFormularioIva,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDatoFormularioIva.add(this.jMenuItemCerrarDatoFormularioIva);
			
			this.jmenuAccionesDatoFormularioIva.add(this.jMenuItemNuevoDatoFormularioIva);
			this.jmenuAccionesDatoFormularioIva.add(this.jMenuItemNuevoGuardarCambiosDatoFormularioIva);
			this.jmenuAccionesDatoFormularioIva.add(this.jMenuItemNuevoRelacionesDatoFormularioIva);
			this.jmenuAccionesDatoFormularioIva.add(this.jMenuItemGuardarCambiosTablaDatoFormularioIva);		
			this.jmenuAccionesDatoFormularioIva.add(this.jMenuItemDuplicarDatoFormularioIva);		
			this.jmenuAccionesDatoFormularioIva.add(this.jMenuItemCopiarDatoFormularioIva);		
			this.jmenuAccionesDatoFormularioIva.add(this.jMenuItemVerFormDatoFormularioIva);		
			
			this.jmenuDatosDatoFormularioIva.add(this.jMenuItemRecargarInformacionDatoFormularioIva);				
			this.jmenuDatosDatoFormularioIva.add(this.jMenuItemAnterioresDatoFormularioIva);				
			this.jmenuDatosDatoFormularioIva.add(this.jMenuItemSiguientesDatoFormularioIva);				
			this.jmenuDatosDatoFormularioIva.add(this.jMenuItemAbrirOrderByDatoFormularioIva);				
			this.jmenuDatosDatoFormularioIva.add(this.jMenuItemMostrarOcultarDatoFormularioIva);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDatoFormularioIva.add(this.jMenuItemGuardarCambiosDatoFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDatoFormularioIva.add(this.jmenuArchivoDatoFormularioIva);		
			this.jmenuBarDatoFormularioIva.add(this.jmenuAccionesDatoFormularioIva);		
			this.jmenuBarDatoFormularioIva.add(this.jmenuDatosDatoFormularioIva);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDatoFormularioIva);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDatoFormularioIva() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva.setToolTipText("Buscar Por Anio Por Semestre ");
		this.jButtonBusquedaPorIdAnioIdSemestreDatoFormularioIva= new JButtonMe();
		this.jButtonBusquedaPorIdAnioIdSemestreDatoFormularioIva.setText("Buscar");
		this.jButtonBusquedaPorIdAnioIdSemestreDatoFormularioIva.setToolTipText("Buscar Por Anio Por Semestre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdAnioIdSemestreDatoFormularioIva,"buscar_button","Buscar Por Anio Por Semestre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdAnioIdSemestreDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva = new JLabelMe();
		jLabelid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setText("Anio :");
		jLabelid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setToolTipText("Anio");
		jLabelid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva= new JComboBoxMe();
		jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva = new JLabelMe();
		jLabelid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setText("Semestre :");
		jLabelid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setToolTipText("Semestre");
		jLabelid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva= new JComboBoxMe();
		jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva.setToolTipText("Buscar Por Anio Por Mes ");
		this.jButtonBusquedaPorIdAnioPorIdMesDatoFormularioIva= new JButtonMe();
		this.jButtonBusquedaPorIdAnioPorIdMesDatoFormularioIva.setText("Buscar");
		this.jButtonBusquedaPorIdAnioPorIdMesDatoFormularioIva.setToolTipText("Buscar Por Anio Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdAnioPorIdMesDatoFormularioIva,"buscar_button","Buscar Por Anio Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdAnioPorIdMesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva = new JLabelMe();
		jLabelid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setText("Anio :");
		jLabelid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setToolTipText("Anio");
		jLabelid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva= new JComboBoxMe();
		jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva = new JLabelMe();
		jLabelid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setText("Mes :");
		jLabelid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setToolTipText("Mes");
		jLabelid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva= new JComboBoxMe();
		jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdAnioDatoFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioDatoFormularioIva.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioDatoFormularioIva= new JButtonMe();
		this.jButtonFK_IdAnioDatoFormularioIva.setText("Buscar");
		this.jButtonFK_IdAnioDatoFormularioIva.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioDatoFormularioIva,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioDatoFormularioIva = new JLabelMe();
		jLabelid_anioFK_IdAnioDatoFormularioIva.setText("Anio :");
		jLabelid_anioFK_IdAnioDatoFormularioIva.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioDatoFormularioIva= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDatoFormularioIva=new JTabbedPane();


		this.jTabbedPaneBusquedasDatoFormularioIva.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDatoFormularioIva.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDatoFormularioIva.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDatoFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDatoFormularioIva = new DatoFormularioIvaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Dato Formulario Iva DATOS");
			this.jInternalFrameDetalleFormDatoFormularioIva = new DatoFormularioIvaDetalleFormJInternalFrame(jDesktopPane,this.datoformularioivaSessionBean.getConGuardarRelaciones(),this.datoformularioivaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDatoFormularioIva = null;//new DatoFormularioIvaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDatoFormularioIva= new GridBagLayout();
		
		
		this.jTableDatosDatoFormularioIva = new JTableMe();      
		
		String sToolTipDatoFormularioIva="";
		sToolTipDatoFormularioIva=DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDatoFormularioIva+="(Contabilidad.DatoFormularioIva)";
		}
		
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDatoFormularioIva+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDatoFormularioIva.setToolTipText(sToolTipDatoFormularioIva);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDatoFormularioIva);
		this.jTableDatosDatoFormularioIva.setAutoCreateRowSorter(true);
		this.jTableDatosDatoFormularioIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDatoFormularioIva.setRowSelectionAllowed(true);
		this.jTableDatosDatoFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDatoFormularioIva = new JButtonMe();
		this.jButtonDuplicarDatoFormularioIva = new JButtonMe();
		this.jButtonCopiarDatoFormularioIva = new JButtonMe();
		this.jButtonVerFormDatoFormularioIva = new JButtonMe();
		this.jButtonNuevoRelacionesDatoFormularioIva = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDatoFormularioIva = new JButtonMe();
		this.jButtonCerrarDatoFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosDatoFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosGeneralDatoFormularioIva = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Dato Formulario Iva";
		
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosDatoFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDatoFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesDatoFormularioIva.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDatoFormularioIva=new ReporteDinamicoJInternalFrame(DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDatoFormularioIva();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDatoFormularioIva=new ImportacionJInternalFrame(DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDatoFormularioIva();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDatoFormularioIva = new JButtonMe();
		
		this.jButtonAbrirOrderByDatoFormularioIva.setText("Orden");
		this.jButtonAbrirOrderByDatoFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDatoFormularioIva,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDatoFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoFormularioIva,false,this);
			
			//this.cargarOrderByDatoFormularioIva(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDatoFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoFormularioIva,true,this);
			
			//this.cargarOrderByDatoFormularioIva(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDatoFormularioIva.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosDatoFormularioIva.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosDatoFormularioIva.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosDatoFormularioIva.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDatoFormularioIva.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDatoFormularioIva.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDatoFormularioIva.setText("Nuevo");
		this.jButtonDuplicarDatoFormularioIva.setText("Duplicar");
		this.jButtonCopiarDatoFormularioIva.setText("Copiar");
		this.jButtonVerFormDatoFormularioIva.setText("Ver");
		this.jButtonNuevoRelacionesDatoFormularioIva.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDatoFormularioIva.setText("Guardar");
		this.jButtonCerrarDatoFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDatoFormularioIva,"nuevo_button","Nuevo",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDatoFormularioIva,"duplicar_button","Duplicar",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDatoFormularioIva,"copiar_button","Copiar",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDatoFormularioIva,"ver_form","Ver",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDatoFormularioIva,"nuevorelaciones_button","Nuevo Rel",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDatoFormularioIva,"guardarcambiostabla_button","Guardar",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDatoFormularioIva,"cerrar_button","Salir",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDatoFormularioIva.setToolTipText("Nuevo"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDatoFormularioIva.setToolTipText("Duplicar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDatoFormularioIva.setToolTipText("Copiar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDatoFormularioIva.setToolTipText("Ver"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDatoFormularioIva.setToolTipText("Nuevo Rel"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDatoFormularioIva.setToolTipText("Guardar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDatoFormularioIva.setToolTipText("Salir"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDatoFormularioIva";
		inputMap = this.jButtonNuevoDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDatoFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDatoFormularioIva"));
		
		//DUPLICAR
		sMapKey = "DuplicarDatoFormularioIva";
		inputMap = this.jButtonDuplicarDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDatoFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDatoFormularioIva"));
		
		//COPIAR
		sMapKey = "CopiarDatoFormularioIva";
		inputMap = this.jButtonCopiarDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDatoFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDatoFormularioIva"));
		
		//VEr FORM
		sMapKey = "VerFormDatoFormularioIva";
		inputMap = this.jButtonVerFormDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDatoFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDatoFormularioIva"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDatoFormularioIva";
		inputMap = this.jButtonNuevoRelacionesDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDatoFormularioIva"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDatoFormularioIva";
		inputMap = this.jButtonModificarDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDatoFormularioIva"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDatoFormularioIva";
		inputMap = this.jButtonCerrarDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDatoFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDatoFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDatoFormularioIva"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DatoFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DatoFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DatoFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DatoFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DatoFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDatoFormularioIva.setName("jPanelParametrosReportesDatoFormularioIva"); 
		
		this.jPanelParametrosReportesAccionesDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDatoFormularioIva.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDatoFormularioIva.setName("jPanelParametrosReportesAccionesDatoFormularioIva"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDatoFormularioIva = new JButtonMe();
		this.jButtonRecargarInformacionDatoFormularioIva.setText("Recargar");
		this.jButtonRecargarInformacionDatoFormularioIva.setToolTipText("Recargar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDatoFormularioIva,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDatoFormularioIva = new JButtonMe();
		this.jButtonProcesarInformacionDatoFormularioIva.setText("Procesar");
		this.jButtonProcesarInformacionDatoFormularioIva.setToolTipText("Procesar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDatoFormularioIva.setVisible(false);
			
		this.jButtonProcesarInformacionDatoFormularioIva.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDatoFormularioIva.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDatoFormularioIva.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDatoFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoFormularioIva.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDatoFormularioIva.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDatoFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoFormularioIva.setText("TIPO");       
		this.jComboBoxTiposReportesDatoFormularioIva.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDatoFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoFormularioIva.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDatoFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDatoFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDatoFormularioIva.setText("Paginacion");
		this.jComboBoxTiposPaginacionDatoFormularioIva.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDatoFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDatoFormularioIva.setText("Accion");
		this.jComboBoxTiposRelacionesDatoFormularioIva.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDatoFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDatoFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesDatoFormularioIva.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDatoFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDatoFormularioIva.setText("Accion");
		this.jComboBoxTiposSeleccionarDatoFormularioIva.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDatoFormularioIva=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDatoFormularioIva.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDatoFormularioIva.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDatoFormularioIva.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDatoFormularioIva = new JLabelMe();
		
		this.jLabelAccionesDatoFormularioIva.setText("Acciones");		
		this.jLabelAccionesDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDatoFormularioIva = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDatoFormularioIva.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDatoFormularioIva.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDatoFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDatoFormularioIva.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDatoFormularioIva.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDatoFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDatoFormularioIva.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDatoFormularioIva.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDatoFormularioIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDatoFormularioIva.setText("Graf.");
		this.jCheckBoxConGraficoReporteDatoFormularioIva.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDatoFormularioIva = new JButtonMe();
		//this.jButtonAnterioresDatoFormularioIva.setText("<<");
        this.jButtonAnterioresDatoFormularioIva.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDatoFormularioIva,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDatoFormularioIva = new JButtonMe();
		//this.jButtonSiguientesDatoFormularioIva.setText(">>");
        this.jButtonSiguientesDatoFormularioIva.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDatoFormularioIva,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDatoFormularioIva = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDatoFormularioIva.setText("Nue");
        this.jButtonNuevoGuardarCambiosDatoFormularioIva.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDatoFormularioIva,"nuevoguardarcambios_button","Nue",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDatoFormularioIva";
		inputMap = this.jButtonNuevoGuardarCambiosDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDatoFormularioIva"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDatoFormularioIva";
		inputMap = this.jButtonRecargarInformacionDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDatoFormularioIva"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDatoFormularioIva";
		inputMap = this.jButtonSiguientesDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDatoFormularioIva"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDatoFormularioIva";
		inputMap = this.jButtonAnterioresDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDatoFormularioIva"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDatoFormularioIva();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDatoFormularioIva.setMinimumSize(new Dimension(this.getWidth(),DatoFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDatoFormularioIva.setMaximumSize(new Dimension(this.getWidth(),DatoFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDatoFormularioIva.setPreferredSize(new Dimension(this.getWidth(),DatoFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDatoFormularioIva = new GridBagLayout();

			this.jPanelPaginacionDatoFormularioIva.setLayout(gridaBagLayoutPaginacionDatoFormularioIva);						
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = 0;
			this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDatoFormularioIva.add(this.jButtonAnterioresDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
					
						
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDatoFormularioIva.gridy = 0;
			
			this.jPanelPaginacionDatoFormularioIva.add(this.jButtonNuevoGuardarCambiosDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
						
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDatoFormularioIva.gridy = 0;
			this.jPanelPaginacionDatoFormularioIva.add(this.jButtonSiguientesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = 1;
			this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoFormularioIva.add(this.jButtonNuevoDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDatoFormularioIva.gridy = 1;
				this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionDatoFormularioIva.add(this.jButtonNuevoRelacionesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			}
			
			
			if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDatoFormularioIva.gridy = 1;
				this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDatoFormularioIva.add(this.jButtonGuardarCambiosTablaDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			}
			
			
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = 1;
			this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoFormularioIva.add(this.jButtonDuplicarDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = 1;
			this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoFormularioIva.add(this.jButtonCopiarDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = 1;
			this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoFormularioIva.add(this.jButtonVerFormDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = 1;
			this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDatoFormularioIva.add(this.jButtonCerrarDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		
		
		
		this.jButtonRecargarInformacionDatoFormularioIva.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDatoFormularioIva.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDatoFormularioIva.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDatoFormularioIva.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDatoFormularioIva.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDatoFormularioIva.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDatoFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDatoFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDatoFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDatoFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDatoFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDatoFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDatoFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDatoFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDatoFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDatoFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDatoFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDatoFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDatoFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDatoFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDatoFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDatoFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDatoFormularioIva.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDatoFormularioIva.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDatoFormularioIva.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDatoFormularioIva.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDatoFormularioIva.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDatoFormularioIva.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDatoFormularioIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDatoFormularioIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDatoFormularioIva.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDatoFormularioIva.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDatoFormularioIva.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDatoFormularioIva.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDatoFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDatoFormularioIva = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DatoFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DatoFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DatoFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DatoFormularioIva = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDatoFormularioIva.setLayout(gridaBagParametrosReportesDatoFormularioIva);
			this.jPanelParametrosReportesAccionesDatoFormularioIva.setLayout(gridaBagParametrosReportesAccionesDatoFormularioIva);
			
			
			this.jPanelParametrosAuxiliar1DatoFormularioIva.setLayout(gridaBagParametrosAuxiliar1DatoFormularioIva);
			this.jPanelParametrosAuxiliar2DatoFormularioIva.setLayout(gridaBagParametrosAuxiliar2DatoFormularioIva);
			this.jPanelParametrosAuxiliar3DatoFormularioIva.setLayout(gridaBagParametrosAuxiliar3DatoFormularioIva);
			this.jPanelParametrosAuxiliar4DatoFormularioIva.setLayout(gridaBagParametrosAuxiliar4DatoFormularioIva);
			//this.jPanelParametrosAuxiliar5DatoFormularioIva.setLayout(gridaBagParametrosAuxiliar2DatoFormularioIva);			
			
			
			
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jButtonRecargarInformacionDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoFormularioIva.add(this.jComboBoxTiposPaginacionDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoFormularioIva.add(this.jCheckBoxConAltoMaximoTablaDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoFormularioIva.add(this.jComboBoxTiposArchivosReportesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jPanelParametrosAuxiliar1DatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DatoFormularioIva.add(this.jComboBoxTiposReportesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jPanelParametrosAuxiliar4DatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jComboBoxTiposReportesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jCheckBoxGenerarReporteDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jPanelParametrosAuxiliar2DatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jLabelAccionesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDatoFormularioIva.add(this.jButtonAbrirOrderByDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jComboBoxTiposSeleccionarDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);			
			
			
			/*
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jCheckBoxSeleccionarTodosDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoFormularioIva.add(this.jCheckBoxSeleccionarTodosDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);															
				
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoFormularioIva.add(this.jCheckBoxSeleccionadosDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jPanelParametrosAuxiliar3DatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jComboBoxTiposRelacionesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
				
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jComboBoxTiposAccionesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
	
				
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoFormularioIva.add(this.jTextFieldValorCampoGeneralDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDatoFormularioIva = new GridBagLayout();

			this.jScrollPanelDatosDatoFormularioIva.setLayout(gridaBagLayoutDatosDatoFormularioIva);
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = 0;
			this.gridBagConstraintsDatoFormularioIva.gridx = 0;
			
			this.jScrollPanelDatosDatoFormularioIva.add(this.jTableDatosDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDatoFormularioIva.setViewportView(this.jTableDatosDatoFormularioIva);
		this.jTableDatosDatoFormularioIva.setFillsViewportHeight(true);
		this.jTableDatosDatoFormularioIva.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDatoFormularioIva= new GridBagLayout();
		this.jPanelAccionesDatoFormularioIva.setLayout(gridaBagLayoutAccionesDatoFormularioIva);
		
		
		/*	
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx = 0;
			
		this.jPanelAccionesDatoFormularioIva.add(this.jButtonNuevoDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdAnioIdSemestreDatoFormularioIva= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdAnioIdSemestreDatoFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdAnioIdSemestreDatoFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdAnioIdSemestreDatoFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdAnioIdSemestreDatoFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva.setLayout(gridaBagLayoutBusquedaPorIdAnioIdSemestreDatoFormularioIva);

		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 0;
		gridBagConstraintsDatoFormularioIva.gridx = 0;
		jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva.add(jLabelid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva, gridBagConstraintsDatoFormularioIva);

		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 0;
		gridBagConstraintsDatoFormularioIva.gridx = 1;
		jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva.add(jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva, gridBagConstraintsDatoFormularioIva);


		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 1;
		gridBagConstraintsDatoFormularioIva.gridx = 0;
		jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva.add(jLabelid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva, gridBagConstraintsDatoFormularioIva);

		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 1;
		gridBagConstraintsDatoFormularioIva.gridx = 1;
		jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva.add(jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva, gridBagConstraintsDatoFormularioIva);

		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 2;
		gridBagConstraintsDatoFormularioIva.gridx =1;
		jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva.add(jButtonBusquedaPorIdAnioIdSemestreDatoFormularioIva, gridBagConstraintsDatoFormularioIva);

		jTabbedPaneBusquedasDatoFormularioIva.addTab("1.-Por Anio Por Semestre ", jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva);
		jTabbedPaneBusquedasDatoFormularioIva.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIdAnioPorIdMesDatoFormularioIva= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdAnioPorIdMesDatoFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdAnioPorIdMesDatoFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdAnioPorIdMesDatoFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdAnioPorIdMesDatoFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva.setLayout(gridaBagLayoutBusquedaPorIdAnioPorIdMesDatoFormularioIva);

		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 0;
		gridBagConstraintsDatoFormularioIva.gridx = 0;
		jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva.add(jLabelid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva, gridBagConstraintsDatoFormularioIva);

		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 0;
		gridBagConstraintsDatoFormularioIva.gridx = 1;
		jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva.add(jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva, gridBagConstraintsDatoFormularioIva);


		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 1;
		gridBagConstraintsDatoFormularioIva.gridx = 0;
		jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva.add(jLabelid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva, gridBagConstraintsDatoFormularioIva);

		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 1;
		gridBagConstraintsDatoFormularioIva.gridx = 1;
		jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva.add(jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva, gridBagConstraintsDatoFormularioIva);

		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 2;
		gridBagConstraintsDatoFormularioIva.gridx =1;
		jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva.add(jButtonBusquedaPorIdAnioPorIdMesDatoFormularioIva, gridBagConstraintsDatoFormularioIva);

		jTabbedPaneBusquedasDatoFormularioIva.addTab("2.-Por Anio Por Mes ", jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva);
		jTabbedPaneBusquedasDatoFormularioIva.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdAnioDatoFormularioIva= new GridBagLayout();
		gridaBagLayoutFK_IdAnioDatoFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioDatoFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioDatoFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioDatoFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioDatoFormularioIva.setLayout(gridaBagLayoutFK_IdAnioDatoFormularioIva);

		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 0;
		gridBagConstraintsDatoFormularioIva.gridx = 0;
		jPanelFK_IdAnioDatoFormularioIva.add(jLabelid_anioFK_IdAnioDatoFormularioIva, gridBagConstraintsDatoFormularioIva);

		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 0;
		gridBagConstraintsDatoFormularioIva.gridx = 1;
		jPanelFK_IdAnioDatoFormularioIva.add(jComboBoxid_anioFK_IdAnioDatoFormularioIva, gridBagConstraintsDatoFormularioIva);

		gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioIva.gridy = 1;
		gridBagConstraintsDatoFormularioIva.gridx =1;
		jPanelFK_IdAnioDatoFormularioIva.add(jButtonFK_IdAnioDatoFormularioIva, gridBagConstraintsDatoFormularioIva);

		jTabbedPaneBusquedasDatoFormularioIva.addTab("3.-Por Anio ", jPanelFK_IdAnioDatoFormularioIva);
		jTabbedPaneBusquedasDatoFormularioIva.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDatoFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDatoFormularioIva);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoFormularioIva.gridx = 0;		
			//this.gridBagConstraintsDatoFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDatoFormularioIva.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDatoFormularioIva.gridx = 0;		
		//this.gridBagConstraintsDatoFormularioIva.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDatoFormularioIva.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDatoFormularioIva);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoFormularioIva.gridx = 0;		
			this.gridBagConstraintsDatoFormularioIva.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDatoFormularioIva.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioIva.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);								
		
		
		/*
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		*/		
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDatoFormularioIva.gridx =0;
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDatoFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
				
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(DatoFormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDatoFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDatoFormularioIva = new GridBagLayout();
			this.jPanelBusquedasParametrosDatoFormularioIva.setLayout(gridaBagLayoutBusquedasParametrosDatoFormularioIva);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDatoFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDatoFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			
			
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		
			
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDatoFormularioIva;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDatoFormularioIva() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDatoFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDatoFormularioIva.setName("jPanelReporteDinamicoDatoFormularioIva"); 
		
		this.jPanelReporteDinamicoDatoFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDatoFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDatoFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDatoFormularioIva.setLayout(gridaBagLayoutReporteDinamicoDatoFormularioIva);
		
		
		this.jInternalFrameReporteDinamicoDatoFormularioIva= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDatoFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDatoFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDatoFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDatoFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDatoFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDatoFormularioIva.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDatoFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDatoFormularioIva.setResizable(true);
	    this.jInternalFrameReporteDinamicoDatoFormularioIva.setClosable(true);
	    this.jInternalFrameReporteDinamicoDatoFormularioIva.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDatoFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDatoFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDatoFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Ivas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDatoFormularioIva = new JLabelMe();

		this.jLabelColumnasSelectReporteDatoFormularioIva.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDatoFormularioIva.add(this.jLabelColumnasSelectReporteDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDatoFormularioIva = new JList<Reporte>();
		this.jListColumnasSelectReporteDatoFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDatoFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDatoFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDatoFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDatoFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDatoFormularioIva=new JScrollPane(this.jListColumnasSelectReporteDatoFormularioIva);
			
			this.jScrollColumnasSelectReporteDatoFormularioIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDatoFormularioIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDatoFormularioIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDatoFormularioIva.add(this.jListColumnasSelectReporteDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		this.jPanelReporteDinamicoDatoFormularioIva.add(this.jScrollColumnasSelectReporteDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDatoFormularioIva = new JLabelMe();

		this.jLabelRelacionesSelectReporteDatoFormularioIva.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDatoFormularioIva.add(this.jLabelRelacionesSelectReporteDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDatoFormularioIva = new JList<Reporte>();
		this.jListRelacionesSelectReporteDatoFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDatoFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDatoFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDatoFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDatoFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDatoFormularioIva=new JScrollPane(this.jListRelacionesSelectReporteDatoFormularioIva);
			
			this.jScrollRelacionesSelectReporteDatoFormularioIva.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDatoFormularioIva.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDatoFormularioIva.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDatoFormularioIva.add(this.jListRelacionesSelectReporteDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		this.jPanelReporteDinamicoDatoFormularioIva.add(this.jScrollRelacionesSelectReporteDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoDatoFormularioIva = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDatoFormularioIva = new JComboBoxMe();
		this.jListColumnasValoresGraficoDatoFormularioIva = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDatoFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDatoFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDatoFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDatoFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDatoFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDatoFormularioIva = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDatoFormularioIva.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoFormularioIva.add(this.jLabelGenerarExcelReporteDinamicoDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDatoFormularioIva = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDatoFormularioIva.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDatoFormularioIva,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDatoFormularioIva.setToolTipText("Generar EXCEL"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDatoFormularioIva.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDatoFormularioIva.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDatoFormularioIva.add(this.jButtonGenerarExcelReporteDinamicoDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoFormularioIva.add(this.jComboBoxTiposReportesDinamicoDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDatoFormularioIva = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDatoFormularioIva.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoFormularioIva.add(this.jLabelTiposArchivoReporteDinamicoDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoFormularioIva.add(this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDatoFormularioIva = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDatoFormularioIva.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDatoFormularioIva,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDatoFormularioIva.setToolTipText("Generar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoFormularioIva.add(this.jButtonGenerarReporteDinamicoDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDatoFormularioIva = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDatoFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDatoFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDatoFormularioIva.setToolTipText("Cancelar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoFormularioIva.add(this.jButtonCerrarReporteDinamicoDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDatoFormularioIva = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDatoFormularioIva= new JScrollPane(jPanelReporteDinamicoDatoFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDatoFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDatoFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDatoFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Ivas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDatoFormularioIva.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDatoFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDatoFormularioIva.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDatoFormularioIva);
		this.jInternalFrameReporteDinamicoDatoFormularioIva.getContentPane().add(this.jScrollPanelReporteDinamicoDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDatoFormularioIva() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDatoFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDatoFormularioIva.setName("jPanelImportacionDatoFormularioIva"); 
		
		this.jPanelImportacionDatoFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDatoFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDatoFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDatoFormularioIva.setLayout(gridaBagLayoutImportacionDatoFormularioIva);
		
		
		this.jInternalFrameImportacionDatoFormularioIva= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDatoFormularioIva= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDatoFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDatoFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDatoFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDatoFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDatoFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDatoFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDatoFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDatoFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionDatoFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionDatoFormularioIva.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDatoFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDatoFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDatoFormularioIva.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDatoFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDatoFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDatoFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionDatoFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionDatoFormularioIva.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDatoFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDatoFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDatoFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Ivas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDatoFormularioIva = new JLabelMe();

		this.jLabelArchivoImportacionDatoFormularioIva.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDatoFormularioIva.add(this.jLabelArchivoImportacionDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDatoFormularioIva = new JFileChooser();		
		this.jFileChooserImportacionDatoFormularioIva.setToolTipText("ESCOGER ARCHIVO"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDatoFormularioIva = new JButtonMe();
		this.jButtonAbrirImportacionDatoFormularioIva.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDatoFormularioIva,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDatoFormularioIva.setToolTipText("Generar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoFormularioIva.add(this.jButtonAbrirImportacionDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDatoFormularioIva = new JLabelMe();

		this.jLabelPathArchivoImportacionDatoFormularioIva.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDatoFormularioIva.add(this.jLabelPathArchivoImportacionDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDatoFormularioIva=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDatoFormularioIva.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDatoFormularioIva.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDatoFormularioIva.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoFormularioIva.add(this.jTextFieldPathArchivoImportacionDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDatoFormularioIva = new JButtonMe();
		this.jButtonGenerarImportacionDatoFormularioIva.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDatoFormularioIva,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDatoFormularioIva.setToolTipText("Generar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoFormularioIva.add(this.jButtonGenerarImportacionDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDatoFormularioIva = new JButtonMe();
		this.jButtonCerrarImportacionDatoFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDatoFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDatoFormularioIva.setToolTipText("Cancelar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoFormularioIva.add(this.jButtonCerrarImportacionDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDatoFormularioIva = new GridBagLayout();
		
		this.jScrollPanelImportacionDatoFormularioIva= new JScrollPane(jPanelImportacionDatoFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy =iPosYImportacion;
		this.gridBagConstraintsDatoFormularioIva.gridx =iPosXImportacion;
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDatoFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDatoFormularioIva.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDatoFormularioIva);
		this.jInternalFrameImportacionDatoFormularioIva.getContentPane().add(this.jScrollPanelImportacionDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDatoFormularioIva(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDatoFormularioIva = new JButtonMe();
			this.jButtonAbrirOrderByDatoFormularioIva.setText("Orden");
			this.jButtonAbrirOrderByDatoFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDatoFormularioIva,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDatoFormularioIva";
			inputMap = this.jButtonAbrirOrderByDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDatoFormularioIva"));
		
		
			GridBagLayout gridaBagLayoutOrderByDatoFormularioIva = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDatoFormularioIva.setName("jPanelOrderByDatoFormularioIva"); 
			
			this.jPanelOrderByDatoFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDatoFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDatoFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDatoFormularioIva.setLayout(gridaBagLayoutOrderByDatoFormularioIva);
			
			
			this.jTableDatosDatoFormularioIvaOrderBy = new JTableMe();        
			this.jTableDatosDatoFormularioIvaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDatoFormularioIvaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDatoFormularioIvaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDatoFormularioIvaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDatoFormularioIvaOrderBy.setViewportView(this.jTableDatosDatoFormularioIvaOrderBy);
			this.jTableDatosDatoFormularioIvaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDatoFormularioIvaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDatoFormularioIva= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDatoFormularioIva= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDatoFormularioIva = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDatoFormularioIva= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDatoFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDatoFormularioIva.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDatoFormularioIva.setTitle("Orden");
			this.jInternalFrameOrderByDatoFormularioIva.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDatoFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDatoFormularioIva.setResizable(true);
			this.jInternalFrameOrderByDatoFormularioIva.setClosable(true);
			this.jInternalFrameOrderByDatoFormularioIva.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDatoFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDatoFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDatoFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Ivas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDatoFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDatoFormularioIva.ipady =150;
				
			this.jPanelOrderByDatoFormularioIva.add(jScrollPanelDatosDatoFormularioIvaOrderBy, this.gridBagConstraintsDatoFormularioIva);//this.jTableDatosDatoFormularioIvaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDatoFormularioIva = new JButtonMe();
			this.jButtonCerrarOrderByDatoFormularioIva.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDatoFormularioIva,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDatoFormularioIva.setToolTipText("Cancelar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDatoFormularioIva.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDatoFormularioIva.add(this.jButtonCerrarOrderByDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDatoFormularioIva = new GridBagLayout();
			
			this.jScrollPanelOrderByDatoFormularioIva= new JScrollPane(jPanelOrderByDatoFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridy =iPosYOrderBy;
			this.gridBagConstraintsDatoFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDatoFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDatoFormularioIva.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDatoFormularioIva);
			
			this.jInternalFrameOrderByDatoFormularioIva.getContentPane().add(this.jScrollPanelOrderByDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);			
		
		} else {
			this.jButtonAbrirOrderByDatoFormularioIva = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.datoformularioivaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDatoFormularioIva.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDatoFormularioIva.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDatoFormularioIva.getRowHeight();//DatoFormularioIvaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DatoFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDatoFormularioIva.isSelected()) {
					iHeightTable=DatoFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DatoFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DatoFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DatoFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDatoFormularioIva.isSelected()) {
					iHeightTable=DatoFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DatoFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DatoFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDatoFormularioIva.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDatoFormularioIva.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDatoFormularioIva.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDatoFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDatoFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDatoFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDatoFormularioIva!=null && this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy()!=null) {
			//if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDatoFormularioIva.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDatoFormularioIva.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDatoFormularioIva.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDatoFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDatoFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDatoFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=datoformularioivaLogic.getDatoFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datoformularioivas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DatoFormularioIva> TraerDatoFormularioIvaBeans(List<DatoFormularioIva> datoformularioivas,ArrayList<Classe> classes)throws Exception {
		try {
			for(DatoFormularioIva datoformularioiva:datoformularioivas) {
					
				if(!(DatoFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DatoFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					datoformularioiva.setsDetalleGeneralEntityReporte(DatoFormularioIvaConstantesFunciones.getDatoFormularioIvaDescripcion(datoformularioiva));
										
					datoformularioiva.setes_mensual_descripcion(DatoFormularioIvaConstantesFunciones.getes_mensualDescripcion(datoformularioiva));datoformularioiva.setes_sustitutiva_descripcion(DatoFormularioIvaConstantesFunciones.getes_sustitutivaDescripcion(datoformularioiva));	
					
					

					if(datoformularioiva.getFormularioIvas()!=null && Funciones.existeClass(classes,FormularioIva.class)) {
						try{datoformularioiva.setformularioivasDescripcionReporte(new JRBeanCollectionDataSource(FormularioIvaJInternalFrame.TraerFormularioIvaBeans(datoformularioiva.getFormularioIvas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//datoformularioiva.setsDetalleGeneralEntityReporte(datoformularioiva.getsDetalleGeneralEntityReporte());
										
				}
				
				//datoformularioivabeans.add(datoformularioivabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return datoformularioivas;
    }
	//PARA REPORTES FIN
}
