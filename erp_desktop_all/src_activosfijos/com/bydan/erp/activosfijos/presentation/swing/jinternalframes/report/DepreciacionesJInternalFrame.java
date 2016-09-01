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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.DepreciacionesConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class DepreciacionesJInternalFrame extends DepreciacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDepreciaciones;
	
	protected JMenuBar jmenuBarDepreciaciones;
	
	protected JMenu jmenuDepreciaciones;
	protected JMenu jmenuDatosDepreciaciones;
	protected JMenu jmenuArchivoDepreciaciones;
	protected JMenu jmenuAccionesDepreciaciones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDepreciaciones;	
	protected GridBagConstraints gridBagConstraintsDepreciaciones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DepreciacionesDetalleFormJInternalFrame jInternalFrameDetalleFormDepreciaciones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDepreciaciones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDepreciaciones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected AnioBeanSwingJInternalFrame anioinicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anioinicio="";

	protected AnioBeanSwingJInternalFrame aniofinBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_aniofin="";

	protected MesBeanSwingJInternalFrame mesinicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesinicio="";

	protected MesBeanSwingJInternalFrame mesfinBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesfin="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DepreciacionesSessionBean depreciacionesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public AnioSessionBean anioinicioSessionBean;
	public AnioSessionBean aniofinSessionBean;
	public MesSessionBean mesinicioSessionBean;
	public MesSessionBean mesfinSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Depreciaciones> depreciacioness;		
	public List<Depreciaciones> depreciacionessEliminados;	
	public List<Depreciaciones> depreciacionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDepreciaciones;		
	protected JButton jButtonAbrirOrderByDepreciaciones;
	
	
	//protected JPanel jPanelOrderByDepreciaciones;
	//public JScrollPane jScrollPanelOrderByDepreciaciones;	
	//protected JButton jButtonCerrarOrderByDepreciaciones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DepreciacionesLogic depreciacionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDepreciaciones;
	public JScrollPane jScrollPanelDatosEdicionDepreciaciones;
	public JScrollPane jScrollPanelDatosGeneralDepreciaciones;
    
	
	
	//public JScrollPane jScrollPanelDatosDepreciacionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDepreciaciones;
	//public JScrollPane jScrollPanelImportacionDepreciaciones;
	
	
	
	protected JPanel jPanelAccionesDepreciaciones;
	
    protected JPanel jPanelPaginacionDepreciaciones;
    protected JPanel jPanelParametrosReportesDepreciaciones;
	protected JPanel jPanelParametrosReportesAccionesDepreciaciones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Depreciaciones;
	protected JPanel jPanelParametrosAuxiliar2Depreciaciones;
	protected JPanel jPanelParametrosAuxiliar3Depreciaciones;
	protected JPanel jPanelParametrosAuxiliar4Depreciaciones;
	//protected JPanel jPanelParametrosAuxiliar5Depreciaciones;
	
	
	
	//protected JPanel jPanelReporteDinamicoDepreciaciones;
	//protected JPanel jPanelImportacionDepreciaciones;
	
	
	public JTable jTableDatosDepreciaciones;
	
	
	
	//public JTable jTableDatosDepreciacionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDepreciaciones;
	protected JButton jButtonDuplicarDepreciaciones;
	protected JButton jButtonCopiarDepreciaciones;
	protected JButton jButtonVerFormDepreciaciones;
	protected JButton jButtonNuevoRelacionesDepreciaciones;
	protected JButton jButtonModificarDepreciaciones;
	
    protected JButton jButtonGuardarCambiosTablaDepreciaciones;
	protected JButton jButtonCerrarDepreciaciones;
	
	
	protected JButton jButtonRecargarInformacionDepreciaciones;
	protected JButton jButtonProcesarInformacionDepreciaciones;
	
	
	protected JButton jButtonAnterioresDepreciaciones;
	protected JButton jButtonSiguientesDepreciaciones;
	protected JButton jButtonNuevoGuardarCambiosDepreciaciones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDepreciaciones;
	//protected JButton jButtonCerrarReporteDinamicoDepreciaciones;
	//protected JButton jButtonGenerarExcelReporteDinamicoDepreciaciones;	
	
	
	
	//protected JButton jButtonAbrirImportacionDepreciaciones;
	//protected JButton jButtonGenerarImportacionDepreciaciones;
	//protected JButton jButtonCerrarImportacionDepreciaciones;
	//protected JFileChooser jFileChooserImportacionDepreciaciones;
	//protected File fileImportacionDepreciaciones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDepreciaciones;
	protected JButton jButtonDuplicarToolBarDepreciaciones;
	protected JButton jButtonNuevoRelacionesToolBarDepreciaciones;
	
	
	public JButton jButtonGuardarCambiosToolBarDepreciaciones;
	protected JButton jButtonCopiarToolBarDepreciaciones;
	protected JButton jButtonVerFormToolBarDepreciaciones;
	public JButton jButtonGuardarCambiosTablaToolBarDepreciaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarDepreciaciones;
	protected JButton jButtonCerrarToolBarDepreciaciones;
	
	protected JButton jButtonRecargarInformacionToolBarDepreciaciones;
	protected JButton jButtonProcesarInformacionToolBarDepreciaciones;
	protected JButton jButtonAnterioresToolBarDepreciaciones;
	protected JButton jButtonSiguientesToolBarDepreciaciones;
	protected JButton jButtonNuevoGuardarCambiosToolBarDepreciaciones;
	protected JButton jButtonAbrirOrderByToolBarDepreciaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDepreciaciones;
	protected JMenuItem jMenuItemDuplicarDepreciaciones;
	protected JMenuItem jMenuItemNuevoRelacionesDepreciaciones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDepreciaciones;
	protected JMenuItem jMenuItemCopiarDepreciaciones;
	protected JMenuItem jMenuItemVerFormDepreciaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaDepreciaciones;
	protected JMenuItem jMenuItemCerrarDepreciaciones;
	protected JMenuItem jMenuItemDetalleCerrarDepreciaciones;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDepreciaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarDepreciaciones;
	
	protected JMenuItem jMenuItemRecargarInformacionDepreciaciones;
	protected JMenuItem jMenuItemProcesarInformacionDepreciaciones;
	protected JMenuItem jMenuItemAnterioresDepreciaciones;
	protected JMenuItem jMenuItemSiguientesDepreciaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDepreciaciones;
	protected JMenuItem jMenuItemAbrirOrderByDepreciaciones;
	protected JMenuItem jMenuItemMostrarOcultarDepreciaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDepreciaciones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDepreciaciones;
	protected JCheckBox jCheckBoxSeleccionadosDepreciaciones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDepreciaciones;
	protected JCheckBox jCheckBoxConGraficoReporteDepreciaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDepreciaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDepreciaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDepreciaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDepreciaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDepreciaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDepreciaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDepreciaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDepreciaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDepreciaciones;
	protected JTextField jTextFieldValorCampoGeneralDepreciaciones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDepreciaciones;
	//public JList<Reporte> jListColumnasSelectReporteDepreciaciones;
	//public JScrollPane jScrollColumnasSelectReporteDepreciaciones;
	
	//public JLabel jLabelRelacionesSelectReporteDepreciaciones;
	//public JList<Reporte> jListRelacionesSelectReporteDepreciaciones;
	//public JScrollPane jScrollRelacionesSelectReporteDepreciaciones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDepreciaciones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDepreciaciones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDepreciaciones;
	//public JLabel jLabelTiposArchivoReporteDinamicoDepreciaciones;
	
		
	//public JLabel jLabelArchivoImportacionDepreciaciones;	
	//public JLabel jLabelPathArchivoImportacionDepreciaciones;
	//protected JTextField jTextFieldPathArchivoImportacionDepreciaciones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDepreciaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDepreciaciones;
	
	//public JLabel jLabelColumnaCategoriaValorDepreciaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDepreciaciones;
	
	//public JLabel jLabelColumnasValoresGraficoDepreciaciones;
	//public JList<Reporte> jListColumnasValoresGraficoDepreciaciones;
	//public JScrollPane jScrollColumnasValoresGraficoDepreciaciones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDepreciaciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDepreciaciones;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDepreciaciones;
	public JPanel jPanelBusquedaDepreciacionesDepreciaciones;
	public JButton jButtonBusquedaDepreciacionesDepreciaciones;
	
	public JPanel jPanelid_anio_inicioBusquedaDepreciacionesDepreciaciones;
	public JLabel jLabelid_anio_inicioBusquedaDepreciacionesDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones;
	public JButton jButtonid_anio_inicioBusquedaDepreciacionesDepreciaciones= new JButtonMe();
	public JButton jButtonid_anio_inicioBusquedaDepreciacionesDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_anio_inicioBusquedaDepreciacionesDepreciacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anio_finBusquedaDepreciacionesDepreciaciones;
	public JLabel jLabelid_anio_finBusquedaDepreciacionesDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones;
	public JButton jButtonid_anio_finBusquedaDepreciacionesDepreciaciones= new JButtonMe();
	public JButton jButtonid_anio_finBusquedaDepreciacionesDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_anio_finBusquedaDepreciacionesDepreciacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mes_inicioBusquedaDepreciacionesDepreciaciones;
	public JLabel jLabelid_mes_inicioBusquedaDepreciacionesDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones;
	public JButton jButtonid_mes_inicioBusquedaDepreciacionesDepreciaciones= new JButtonMe();
	public JButton jButtonid_mes_inicioBusquedaDepreciacionesDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_mes_inicioBusquedaDepreciacionesDepreciacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mes_finBusquedaDepreciacionesDepreciaciones;
	public JLabel jLabelid_mes_finBusquedaDepreciacionesDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones;
	public JButton jButtonid_mes_finBusquedaDepreciacionesDepreciaciones= new JButtonMe();
	public JButton jButtonid_mes_finBusquedaDepreciacionesDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_mes_finBusquedaDepreciacionesDepreciacionesBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DepreciacionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Depreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Depreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Depreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Depreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDepreciaciones)	{
		this.jButtonRecargarInformacionDepreciaciones = jButtonRecargarInformacionDepreciaciones;
	}
	
	public JButton getjButtonProcesarInformacionDepreciaciones() {
		return this.jButtonProcesarInformacionDepreciaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDepreciaciones)	{
		this.jButtonProcesarInformacionDepreciaciones = jButtonProcesarInformacionDepreciaciones;
	}
	
	
	public JButton getjButtonRecargarInformacionDepreciaciones() {
		return this.jButtonRecargarInformacionDepreciaciones;
	}
	
	
	public List<Depreciaciones> getdepreciacioness() {
		return this.depreciacioness;
	}

	public void setdepreciacioness(List<Depreciaciones> depreciacioness) {
		this.depreciacioness = depreciacioness;
	}
	
	public List<Depreciaciones> getdepreciacionessAux() {
		return this.depreciacionessAux;
	}

	public void setdepreciacionessAux(List<Depreciaciones> depreciacionessAux) {
		this.depreciacionessAux = depreciacionessAux;
	}
	
	public List<Depreciaciones> getdepreciacionessEliminados() {
		return this.depreciacionessEliminados;
	}

	public void setDepreciacionessEliminados(List<Depreciaciones> depreciacionessEliminados) {
		this.depreciacionessEliminados = depreciacionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDepreciaciones() {
		return jComboBoxTiposSeleccionarDepreciaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDepreciaciones(
			JComboBox jComboBoxTiposSeleccionarDepreciaciones) {
		this.jComboBoxTiposSeleccionarDepreciaciones = jComboBoxTiposSeleccionarDepreciaciones;
	}
	
	public void setBorderResaltarTiposSeleccionarDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDepreciaciones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDepreciaciones() {
		return jTextFieldValorCampoGeneralDepreciaciones;
	}

	public void setjTextFieldValorCampoGeneralDepreciaciones(
			JTextField jTextFieldValorCampoGeneralDepreciaciones) {
		this.jTextFieldValorCampoGeneralDepreciaciones = jTextFieldValorCampoGeneralDepreciaciones;
	}

	public void setBorderResaltarValorCampoGeneralDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciaciones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDepreciaciones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDepreciaciones() {
		return this.jCheckBoxSeleccionarTodosDepreciaciones;
	}

	public void setjCheckBoxSeleccionarTodosDepreciaciones(
			JCheckBox jCheckBoxSeleccionarTodosDepreciaciones) {
		this.jCheckBoxSeleccionarTodosDepreciaciones = jCheckBoxSeleccionarTodosDepreciaciones;
	}

	public void setBorderResaltarSeleccionarTodosDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDepreciaciones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDepreciaciones() {
		return this.jCheckBoxSeleccionadosDepreciaciones;
	}

	public void setjCheckBoxSeleccionadosDepreciaciones(
			JCheckBox jCheckBoxSeleccionadosDepreciaciones) {
		this.jCheckBoxSeleccionadosDepreciaciones = jCheckBoxSeleccionadosDepreciaciones;
	}
	
	public void setBorderResaltarSeleccionadosDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDepreciaciones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDepreciaciones() {
		return this.jComboBoxTiposArchivosReportesDepreciaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDepreciaciones(
			JComboBox jComboBoxTiposArchivosReportesDepreciaciones) {
		this.jComboBoxTiposArchivosReportesDepreciaciones = jComboBoxTiposArchivosReportesDepreciaciones;
	}

	public void setBorderResaltarTiposArchivosReportesDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDepreciaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDepreciaciones() {
		return this.jComboBoxTiposReportesDepreciaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDepreciaciones(
			JComboBox jComboBoxTiposReportesDepreciaciones) {
		this.jComboBoxTiposReportesDepreciaciones = jComboBoxTiposReportesDepreciaciones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDepreciaciones() {
	//	return jComboBoxTiposReportesDinamicoDepreciaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDepreciaciones(
	//		JComboBox jComboBoxTiposReportesDinamicoDepreciaciones) {
	//	this.jComboBoxTiposReportesDinamicoDepreciaciones = jComboBoxTiposReportesDinamicoDepreciaciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDepreciaciones() {
	//	return jComboBoxTiposArchivosReportesDinamicoDepreciaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDepreciaciones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDepreciaciones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDepreciaciones = jComboBoxTiposArchivosReportesDinamicoDepreciaciones;
	//}
	
	public void setBorderResaltarTiposReportesDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDepreciaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDepreciaciones() {
		return this.jComboBoxTiposGraficosReportesDepreciaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDepreciaciones(
			JComboBox jComboBoxTiposGraficosReportesDepreciaciones) {
		this.jComboBoxTiposGraficosReportesDepreciaciones = jComboBoxTiposGraficosReportesDepreciaciones;
	}
	
	public void setBorderResaltarTiposGraficosReportesDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDepreciaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDepreciaciones() {
		return this.jComboBoxTiposPaginacionDepreciaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDepreciaciones(
			JComboBox jComboBoxTiposPaginacionDepreciaciones) {
		this.jComboBoxTiposPaginacionDepreciaciones = jComboBoxTiposPaginacionDepreciaciones;
	}
	
	public void setBorderResaltarTiposPaginacionDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDepreciaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDepreciaciones() {
		return this.jComboBoxTiposRelacionesDepreciaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDepreciaciones() {
		return this.jComboBoxTiposAccionesDepreciaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDepreciaciones(
			JComboBox jComboBoxTiposRelacionesDepreciaciones) {
		this.jComboBoxTiposRelacionesDepreciaciones = jComboBoxTiposRelacionesDepreciaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDepreciaciones(
			JComboBox jComboBoxTiposAccionesDepreciaciones) {
		this.jComboBoxTiposAccionesDepreciaciones = jComboBoxTiposAccionesDepreciaciones;
	}
	
	public void setBorderResaltarTiposRelacionesDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDepreciaciones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDepreciaciones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDepreciaciones() {
	//	return jCheckBoxConGraficoDinamicoDepreciaciones;
	//}

	//public void setjCheckBoxConGraficoDinamicoDepreciaciones(
	//		JCheckBox jCheckBoxConGraficoDinamicoDepreciaciones) {
	//	this.jCheckBoxConGraficoDinamicoDepreciaciones = jCheckBoxConGraficoDinamicoDepreciaciones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDepreciaciones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDepreciaciones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDepreciaciones .setBorder(borderResaltar);		
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
		this.depreciacionesSessionBean=new DepreciacionesSessionBean();
		
		this.depreciacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.depreciacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.depreciacionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DepreciacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Depreciaciones MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
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
		
		DepreciacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Depreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDepreciaciones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"nuevo","nuevo","Nuevo"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"duplicar","duplicar","Duplicar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"copiar","copiar","Copiar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"ver_form","ver_form","Ver"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"recargar","recargar","Buscar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDepreciaciones,this.jTtoolBarDepreciaciones,
							"cerrar","cerrar","Salir"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDepreciaciones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDepreciaciones;
			
				this.jButtonProcesarInformacionToolBarDepreciaciones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDepreciaciones;
				
		//protected JButton jButtonModificarToolBarDepreciaciones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDepreciaciones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDepreciaciones=new JMenuMe("General");
		this.jmenuArchivoDepreciaciones=new JMenuMe("Archivo");
		this.jmenuAccionesDepreciaciones=new JMenuMe("Acciones");
		this.jmenuDatosDepreciaciones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDepreciaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDepreciaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDepreciaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDepreciaciones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDepreciaciones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDepreciaciones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDepreciaciones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDepreciaciones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDepreciaciones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDepreciaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDepreciaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDepreciaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDepreciaciones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDepreciaciones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDepreciaciones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDepreciaciones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDepreciaciones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDepreciaciones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDepreciaciones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDepreciaciones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDepreciaciones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDepreciaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDepreciaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDepreciaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDepreciaciones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDepreciaciones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDepreciaciones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDepreciaciones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDepreciaciones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDepreciaciones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDepreciaciones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDepreciaciones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDepreciaciones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDepreciaciones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDepreciaciones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDepreciaciones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDepreciaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDepreciaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDepreciaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDepreciaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDepreciaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDepreciaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDepreciaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDepreciaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDepreciaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDepreciaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDepreciaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDepreciaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDepreciaciones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDepreciaciones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDepreciaciones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDepreciaciones.add(this.jMenuItemCerrarDepreciaciones);
			
			this.jmenuAccionesDepreciaciones.add(this.jMenuItemNuevoDepreciaciones);
			this.jmenuAccionesDepreciaciones.add(this.jMenuItemNuevoGuardarCambiosDepreciaciones);
			this.jmenuAccionesDepreciaciones.add(this.jMenuItemNuevoRelacionesDepreciaciones);
			this.jmenuAccionesDepreciaciones.add(this.jMenuItemGuardarCambiosTablaDepreciaciones);		
			this.jmenuAccionesDepreciaciones.add(this.jMenuItemDuplicarDepreciaciones);		
			this.jmenuAccionesDepreciaciones.add(this.jMenuItemCopiarDepreciaciones);		
			this.jmenuAccionesDepreciaciones.add(this.jMenuItemVerFormDepreciaciones);		
			
			this.jmenuDatosDepreciaciones.add(this.jMenuItemRecargarInformacionDepreciaciones);				
			this.jmenuDatosDepreciaciones.add(this.jMenuItemAnterioresDepreciaciones);				
			this.jmenuDatosDepreciaciones.add(this.jMenuItemSiguientesDepreciaciones);				
			this.jmenuDatosDepreciaciones.add(this.jMenuItemAbrirOrderByDepreciaciones);				
			this.jmenuDatosDepreciaciones.add(this.jMenuItemMostrarOcultarDepreciaciones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDepreciaciones.add(this.jMenuItemGuardarCambiosDepreciaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDepreciaciones.add(this.jmenuArchivoDepreciaciones);		
			this.jmenuBarDepreciaciones.add(this.jmenuAccionesDepreciaciones);		
			this.jmenuBarDepreciaciones.add(this.jmenuDatosDepreciaciones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDepreciaciones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDepreciaciones() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaDepreciacionesDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaDepreciacionesDepreciaciones.setToolTipText("Buscar Por Anio Inicio Por Anio Fin Por Mes Inicio Por Mes Fin ");
		this.jButtonBusquedaDepreciacionesDepreciaciones= new JButtonMe();
		this.jButtonBusquedaDepreciacionesDepreciaciones.setText("Buscar");
		this.jButtonBusquedaDepreciacionesDepreciaciones.setToolTipText("Buscar Por Anio Inicio Por Anio Fin Por Mes Inicio Por Mes Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaDepreciacionesDepreciaciones,"buscar_button","Buscar Por Anio Inicio Por Anio Fin Por Mes Inicio Por Mes Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaDepreciacionesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anio_inicioBusquedaDepreciacionesDepreciaciones = new JLabelMe();
		jLabelid_anio_inicioBusquedaDepreciacionesDepreciaciones.setText("Anio Inicio :");
		jLabelid_anio_inicioBusquedaDepreciacionesDepreciaciones.setToolTipText("Anio Inicio");
		jLabelid_anio_inicioBusquedaDepreciacionesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anio_inicioBusquedaDepreciacionesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anio_inicioBusquedaDepreciacionesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anio_inicioBusquedaDepreciacionesDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones= new JComboBoxMe();
		jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_anio_finBusquedaDepreciacionesDepreciaciones = new JLabelMe();
		jLabelid_anio_finBusquedaDepreciacionesDepreciaciones.setText("Anio Fin :");
		jLabelid_anio_finBusquedaDepreciacionesDepreciaciones.setToolTipText("Anio Fin");
		jLabelid_anio_finBusquedaDepreciacionesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anio_finBusquedaDepreciacionesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anio_finBusquedaDepreciacionesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anio_finBusquedaDepreciacionesDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones= new JComboBoxMe();
		jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_mes_inicioBusquedaDepreciacionesDepreciaciones = new JLabelMe();
		jLabelid_mes_inicioBusquedaDepreciacionesDepreciaciones.setText("Mes Inicio :");
		jLabelid_mes_inicioBusquedaDepreciacionesDepreciaciones.setToolTipText("Mes Inicio");
		jLabelid_mes_inicioBusquedaDepreciacionesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_inicioBusquedaDepreciacionesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_inicioBusquedaDepreciacionesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mes_inicioBusquedaDepreciacionesDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones= new JComboBoxMe();
		jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_mes_finBusquedaDepreciacionesDepreciaciones = new JLabelMe();
		jLabelid_mes_finBusquedaDepreciacionesDepreciaciones.setText("Mes Fin :");
		jLabelid_mes_finBusquedaDepreciacionesDepreciaciones.setToolTipText("Mes Fin");
		jLabelid_mes_finBusquedaDepreciacionesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_finBusquedaDepreciacionesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_finBusquedaDepreciacionesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mes_finBusquedaDepreciacionesDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones= new JComboBoxMe();
		jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDepreciaciones=new JTabbedPane();


		this.jTabbedPaneBusquedasDepreciaciones.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasDepreciaciones.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasDepreciaciones.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDepreciaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDepreciaciones = new DepreciacionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Depreciaciones DATOS");
			this.jInternalFrameDetalleFormDepreciaciones = new DepreciacionesDetalleFormJInternalFrame(jDesktopPane,this.depreciacionesSessionBean.getConGuardarRelaciones(),this.depreciacionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDepreciaciones = null;//new DepreciacionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDepreciaciones= new GridBagLayout();
		
		
		this.jTableDatosDepreciaciones = new JTableMe();      
		
		String sToolTipDepreciaciones="";
		sToolTipDepreciaciones=DepreciacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDepreciaciones+="(ActivosFijos.Depreciaciones)";
		}
		
		if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipDepreciaciones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDepreciaciones.setToolTipText(sToolTipDepreciaciones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDepreciaciones);
		this.jTableDatosDepreciaciones.setAutoCreateRowSorter(true);
		this.jTableDatosDepreciaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDepreciaciones.setRowSelectionAllowed(true);
		this.jTableDatosDepreciaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDepreciaciones = new JButtonMe();
		this.jButtonDuplicarDepreciaciones = new JButtonMe();
		this.jButtonCopiarDepreciaciones = new JButtonMe();
		this.jButtonVerFormDepreciaciones = new JButtonMe();
		this.jButtonNuevoRelacionesDepreciaciones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDepreciaciones = new JButtonMe();
		this.jButtonCerrarDepreciaciones = new JButtonMe();
		
		this.jScrollPanelDatosDepreciaciones = new JScrollPane();   
        this.jScrollPanelDatosGeneralDepreciaciones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Depreciaciones";
		
		if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosDepreciaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDepreciaciones.setToolTipText("Acciones");
        this.jPanelAccionesDepreciaciones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDepreciaciones=new ReporteDinamicoJInternalFrame(DepreciacionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDepreciaciones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDepreciaciones=new ImportacionJInternalFrame(DepreciacionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDepreciaciones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDepreciaciones = new JButtonMe();
		
		this.jButtonAbrirOrderByDepreciaciones.setText("Orden");
		this.jButtonAbrirOrderByDepreciaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDepreciaciones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDepreciaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepreciaciones,false,this);
			
			//this.cargarOrderByDepreciaciones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDepreciaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepreciaciones,true,this);
			
			//this.cargarOrderByDepreciaciones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDepreciaciones.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosDepreciaciones.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosDepreciaciones.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosDepreciaciones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDepreciaciones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDepreciaciones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDepreciaciones.setText("Nuevo");
		this.jButtonDuplicarDepreciaciones.setText("Duplicar");
		this.jButtonCopiarDepreciaciones.setText("Copiar");
		this.jButtonVerFormDepreciaciones.setText("Ver");
		this.jButtonNuevoRelacionesDepreciaciones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDepreciaciones.setText("Guardar");
		this.jButtonCerrarDepreciaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDepreciaciones,"nuevo_button","Nuevo",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDepreciaciones,"duplicar_button","Duplicar",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDepreciaciones,"copiar_button","Copiar",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDepreciaciones,"ver_form","Ver",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDepreciaciones,"nuevorelaciones_button","Nuevo Rel",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDepreciaciones,"guardarcambiostabla_button","Guardar",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDepreciaciones,"cerrar_button","Salir",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDepreciaciones.setToolTipText("Nuevo"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDepreciaciones.setToolTipText("Duplicar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDepreciaciones.setToolTipText("Copiar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDepreciaciones.setToolTipText("Ver"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDepreciaciones.setToolTipText("Nuevo Rel"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDepreciaciones.setToolTipText("Guardar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDepreciaciones.setToolTipText("Salir"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDepreciaciones";
		inputMap = this.jButtonNuevoDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDepreciaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDepreciaciones"));
		
		//DUPLICAR
		sMapKey = "DuplicarDepreciaciones";
		inputMap = this.jButtonDuplicarDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDepreciaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDepreciaciones"));
		
		//COPIAR
		sMapKey = "CopiarDepreciaciones";
		inputMap = this.jButtonCopiarDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDepreciaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDepreciaciones"));
		
		//VEr FORM
		sMapKey = "VerFormDepreciaciones";
		inputMap = this.jButtonVerFormDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDepreciaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDepreciaciones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDepreciaciones";
		inputMap = this.jButtonNuevoRelacionesDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDepreciaciones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDepreciaciones";
		inputMap = this.jButtonModificarDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDepreciaciones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDepreciaciones";
		inputMap = this.jButtonCerrarDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDepreciaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDepreciaciones";
		inputMap = this.jButtonGuardarCambiosTablaDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDepreciaciones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Depreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Depreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Depreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Depreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Depreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDepreciaciones.setName("jPanelParametrosReportesDepreciaciones"); 
		
		this.jPanelParametrosReportesAccionesDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDepreciaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDepreciaciones.setName("jPanelParametrosReportesAccionesDepreciaciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDepreciaciones = new JButtonMe();
		this.jButtonRecargarInformacionDepreciaciones.setText("Buscar");
		this.jButtonRecargarInformacionDepreciaciones.setToolTipText("Buscar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDepreciaciones,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionDepreciaciones.setVisible(false);
		
		
		this.jButtonProcesarInformacionDepreciaciones = new JButtonMe();
		this.jButtonProcesarInformacionDepreciaciones.setText("Procesar");
		this.jButtonProcesarInformacionDepreciaciones.setToolTipText("Procesar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDepreciaciones.setVisible(false);
			
		this.jButtonProcesarInformacionDepreciaciones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDepreciaciones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDepreciaciones.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDepreciaciones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDepreciaciones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDepreciaciones.setText("TIPO");       
		this.jComboBoxTiposReportesDepreciaciones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDepreciaciones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDepreciaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDepreciaciones.setText("Paginacion");
		this.jComboBoxTiposPaginacionDepreciaciones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDepreciaciones.setText("Accion");
		this.jComboBoxTiposRelacionesDepreciaciones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDepreciaciones.setText("Accion");
		this.jComboBoxTiposAccionesDepreciaciones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDepreciaciones.setText("Accion");
		this.jComboBoxTiposSeleccionarDepreciaciones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDepreciaciones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDepreciaciones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDepreciaciones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDepreciaciones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDepreciaciones = new JLabelMe();
		
		this.jLabelAccionesDepreciaciones.setText("Acciones");		
		this.jLabelAccionesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDepreciaciones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDepreciaciones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDepreciaciones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDepreciaciones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDepreciaciones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDepreciaciones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDepreciaciones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDepreciaciones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDepreciaciones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDepreciaciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDepreciaciones.setText("Graf.");
		this.jCheckBoxConGraficoReporteDepreciaciones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDepreciaciones = new JButtonMe();
		//this.jButtonAnterioresDepreciaciones.setText("<<");
        this.jButtonAnterioresDepreciaciones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDepreciaciones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDepreciaciones = new JButtonMe();
		//this.jButtonSiguientesDepreciaciones.setText(">>");
        this.jButtonSiguientesDepreciaciones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDepreciaciones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDepreciaciones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDepreciaciones.setText("Nue");
        this.jButtonNuevoGuardarCambiosDepreciaciones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDepreciaciones,"nuevoguardarcambios_button","Nue",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDepreciaciones";
		inputMap = this.jButtonNuevoGuardarCambiosDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDepreciaciones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDepreciaciones";
		inputMap = this.jButtonRecargarInformacionDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDepreciaciones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDepreciaciones";
		inputMap = this.jButtonSiguientesDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDepreciaciones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDepreciaciones";
		inputMap = this.jButtonAnterioresDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDepreciaciones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDepreciaciones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDepreciaciones.setMinimumSize(new Dimension(this.getWidth(),DepreciacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DepreciacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDepreciaciones.setMaximumSize(new Dimension(this.getWidth(),DepreciacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DepreciacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDepreciaciones.setPreferredSize(new Dimension(this.getWidth(),DepreciacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DepreciacionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDepreciaciones = new GridBagLayout();

			this.jPanelPaginacionDepreciaciones.setLayout(gridaBagLayoutPaginacionDepreciaciones);						
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = 0;
			this.gridBagConstraintsDepreciaciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDepreciaciones.add(this.jButtonAnterioresDepreciaciones, this.gridBagConstraintsDepreciaciones);
					
						
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDepreciaciones.gridy = 0;
			
			this.jPanelPaginacionDepreciaciones.add(this.jButtonNuevoGuardarCambiosDepreciaciones, this.gridBagConstraintsDepreciaciones);
						
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDepreciaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDepreciaciones.gridy = 0;
			this.jPanelPaginacionDepreciaciones.add(this.jButtonSiguientesDepreciaciones, this.gridBagConstraintsDepreciaciones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = 1;
			this.gridBagConstraintsDepreciaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepreciaciones.add(this.jButtonNuevoDepreciaciones, this.gridBagConstraintsDepreciaciones);
						
			
			
			if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
				this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDepreciaciones.gridy = 1;
				this.gridBagConstraintsDepreciaciones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDepreciaciones.add(this.jButtonGuardarCambiosTablaDepreciaciones, this.gridBagConstraintsDepreciaciones);
			}
			
			
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = 1;
			this.gridBagConstraintsDepreciaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepreciaciones.add(this.jButtonDuplicarDepreciaciones, this.gridBagConstraintsDepreciaciones);
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = 1;
			this.gridBagConstraintsDepreciaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepreciaciones.add(this.jButtonCopiarDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = 1;
			this.gridBagConstraintsDepreciaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepreciaciones.add(this.jButtonVerFormDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = 1;
			this.gridBagConstraintsDepreciaciones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDepreciaciones.add(this.jButtonCerrarDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
		
		
		this.jButtonRecargarInformacionDepreciaciones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDepreciaciones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDepreciaciones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDepreciaciones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDepreciaciones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDepreciaciones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDepreciaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDepreciaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDepreciaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDepreciaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDepreciaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDepreciaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDepreciaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDepreciaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDepreciaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDepreciaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDepreciaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDepreciaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDepreciaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepreciaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepreciaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDepreciaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDepreciaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDepreciaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDepreciaciones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDepreciaciones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDepreciaciones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDepreciaciones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDepreciaciones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDepreciaciones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDepreciaciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDepreciaciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDepreciaciones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDepreciaciones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDepreciaciones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDepreciaciones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDepreciaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDepreciaciones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Depreciaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Depreciaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Depreciaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Depreciaciones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDepreciaciones.setLayout(gridaBagParametrosReportesDepreciaciones);
			this.jPanelParametrosReportesAccionesDepreciaciones.setLayout(gridaBagParametrosReportesAccionesDepreciaciones);
			
			
			this.jPanelParametrosAuxiliar1Depreciaciones.setLayout(gridaBagParametrosAuxiliar1Depreciaciones);
			this.jPanelParametrosAuxiliar2Depreciaciones.setLayout(gridaBagParametrosAuxiliar2Depreciaciones);
			this.jPanelParametrosAuxiliar3Depreciaciones.setLayout(gridaBagParametrosAuxiliar3Depreciaciones);
			this.jPanelParametrosAuxiliar4Depreciaciones.setLayout(gridaBagParametrosAuxiliar4Depreciaciones);
			//this.jPanelParametrosAuxiliar5Depreciaciones.setLayout(gridaBagParametrosAuxiliar2Depreciaciones);			
			
			
			
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDepreciaciones.add(this.jButtonRecargarInformacionDepreciaciones, this.gridBagConstraintsDepreciaciones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Depreciaciones.add(this.jComboBoxTiposPaginacionDepreciaciones, this.gridBagConstraintsDepreciaciones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Depreciaciones.add(this.jCheckBoxConAltoMaximoTablaDepreciaciones, this.gridBagConstraintsDepreciaciones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Depreciaciones.add(this.jComboBoxTiposArchivosReportesDepreciaciones, this.gridBagConstraintsDepreciaciones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepreciaciones.add(this.jPanelParametrosAuxiliar1Depreciaciones, this.gridBagConstraintsDepreciaciones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepreciaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Depreciaciones.add(this.jComboBoxTiposReportesDepreciaciones, this.gridBagConstraintsDepreciaciones);																		
			
			
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepreciaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Depreciaciones.add(this.jComboBoxTiposGraficosReportesDepreciaciones, this.gridBagConstraintsDepreciaciones);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepreciaciones.add(this.jPanelParametrosAuxiliar4Depreciaciones, this.gridBagConstraintsDepreciaciones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepreciaciones.add(this.jComboBoxTiposReportesDepreciaciones, this.gridBagConstraintsDepreciaciones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepreciaciones.add(this.jCheckBoxGenerarReporteDepreciaciones, this.gridBagConstraintsDepreciaciones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepreciaciones.add(this.jPanelParametrosAuxiliar2Depreciaciones, this.gridBagConstraintsDepreciaciones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepreciaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepreciaciones.add(this.jLabelAccionesDepreciaciones, this.gridBagConstraintsDepreciaciones);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
				this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDepreciaciones.add(this.jButtonAbrirOrderByDepreciaciones, this.gridBagConstraintsDepreciaciones);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDepreciaciones.add(this.jComboBoxTiposSeleccionarDepreciaciones, this.gridBagConstraintsDepreciaciones);			
			
			
			/*
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepreciaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepreciaciones.add(this.jCheckBoxSeleccionarTodosDepreciaciones, this.gridBagConstraintsDepreciaciones);
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepreciaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepreciaciones.add(this.jCheckBoxConGraficoReporteDepreciaciones, this.gridBagConstraintsDepreciaciones);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepreciaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Depreciaciones.add(this.jCheckBoxSeleccionarTodosDepreciaciones, this.gridBagConstraintsDepreciaciones);															
				
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepreciaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Depreciaciones.add(this.jCheckBoxSeleccionadosDepreciaciones, this.gridBagConstraintsDepreciaciones);															
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepreciaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Depreciaciones.add(this.jCheckBoxConGraficoReporteDepreciaciones, this.gridBagConstraintsDepreciaciones);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepreciaciones.add(this.jPanelParametrosAuxiliar3Depreciaciones, this.gridBagConstraintsDepreciaciones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDepreciaciones.add(this.jComboBoxTiposAccionesDepreciaciones, this.gridBagConstraintsDepreciaciones);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDepreciaciones = new GridBagLayout();

			this.jScrollPanelDatosDepreciaciones.setLayout(gridaBagLayoutDatosDepreciaciones);
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = 0;
			this.gridBagConstraintsDepreciaciones.gridx = 0;
			
			this.jScrollPanelDatosDepreciaciones.add(this.jTableDatosDepreciaciones, this.gridBagConstraintsDepreciaciones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDepreciaciones.setViewportView(this.jTableDatosDepreciaciones);
		this.jTableDatosDepreciaciones.setFillsViewportHeight(true);
		this.jTableDatosDepreciaciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDepreciaciones= new GridBagLayout();
		this.jPanelAccionesDepreciaciones.setLayout(gridaBagLayoutAccionesDepreciaciones);
		
		
		/*	
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 0;
			
		this.jPanelAccionesDepreciaciones.add(this.jButtonNuevoDepreciaciones, this.gridBagConstraintsDepreciaciones);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaDepreciacionesDepreciaciones= new GridBagLayout();
		gridaBagLayoutBusquedaDepreciacionesDepreciaciones.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaDepreciacionesDepreciaciones.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaDepreciacionesDepreciaciones.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaDepreciacionesDepreciaciones.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaDepreciacionesDepreciaciones.setLayout(gridaBagLayoutBusquedaDepreciacionesDepreciaciones);

		gridBagConstraintsDepreciaciones = new GridBagConstraints();
		gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciaciones.gridy = 0;
		gridBagConstraintsDepreciaciones.gridx = 0;
		jPanelBusquedaDepreciacionesDepreciaciones.add(jLabelid_anio_inicioBusquedaDepreciacionesDepreciaciones, gridBagConstraintsDepreciaciones);

		gridBagConstraintsDepreciaciones = new GridBagConstraints();
		gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciaciones.gridy = 0;
		gridBagConstraintsDepreciaciones.gridx = 1;
		jPanelBusquedaDepreciacionesDepreciaciones.add(jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones, gridBagConstraintsDepreciaciones);


		gridBagConstraintsDepreciaciones = new GridBagConstraints();
		gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciaciones.gridy = 1;
		gridBagConstraintsDepreciaciones.gridx = 0;
		jPanelBusquedaDepreciacionesDepreciaciones.add(jLabelid_anio_finBusquedaDepreciacionesDepreciaciones, gridBagConstraintsDepreciaciones);

		gridBagConstraintsDepreciaciones = new GridBagConstraints();
		gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciaciones.gridy = 1;
		gridBagConstraintsDepreciaciones.gridx = 1;
		jPanelBusquedaDepreciacionesDepreciaciones.add(jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones, gridBagConstraintsDepreciaciones);


		gridBagConstraintsDepreciaciones = new GridBagConstraints();
		gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciaciones.gridy = 2;
		gridBagConstraintsDepreciaciones.gridx = 0;
		jPanelBusquedaDepreciacionesDepreciaciones.add(jLabelid_mes_inicioBusquedaDepreciacionesDepreciaciones, gridBagConstraintsDepreciaciones);

		gridBagConstraintsDepreciaciones = new GridBagConstraints();
		gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciaciones.gridy = 2;
		gridBagConstraintsDepreciaciones.gridx = 1;
		jPanelBusquedaDepreciacionesDepreciaciones.add(jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones, gridBagConstraintsDepreciaciones);


		gridBagConstraintsDepreciaciones = new GridBagConstraints();
		gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciaciones.gridy = 3;
		gridBagConstraintsDepreciaciones.gridx = 0;
		jPanelBusquedaDepreciacionesDepreciaciones.add(jLabelid_mes_finBusquedaDepreciacionesDepreciaciones, gridBagConstraintsDepreciaciones);

		gridBagConstraintsDepreciaciones = new GridBagConstraints();
		gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciaciones.gridy = 3;
		gridBagConstraintsDepreciaciones.gridx = 1;
		jPanelBusquedaDepreciacionesDepreciaciones.add(jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones, gridBagConstraintsDepreciaciones);

		gridBagConstraintsDepreciaciones = new GridBagConstraints();
		gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciaciones.gridy = 4;
		gridBagConstraintsDepreciaciones.gridx =1;
		jPanelBusquedaDepreciacionesDepreciaciones.add(jButtonBusquedaDepreciacionesDepreciaciones, gridBagConstraintsDepreciaciones);

		jTabbedPaneBusquedasDepreciaciones.addTab("1.-Por Anio Inicio Por Anio Fin Por Mes Inicio Por Mes Fin ", jPanelBusquedaDepreciacionesDepreciaciones);
		jTabbedPaneBusquedasDepreciaciones.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDepreciaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDepreciaciones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();						
			this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDepreciaciones.gridx = 0;		
			//this.gridBagConstraintsDepreciaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDepreciaciones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDepreciaciones, this.gridBagConstraintsDepreciaciones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDepreciaciones.gridx = 0;		
		//this.gridBagConstraintsDepreciaciones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDepreciaciones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDepreciaciones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDepreciaciones.gridx = 0;		
			this.gridBagConstraintsDepreciaciones.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDepreciaciones.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDepreciaciones, this.gridBagConstraintsDepreciaciones);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciaciones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDepreciaciones, this.gridBagConstraintsDepreciaciones);								
		
		
		/*
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDepreciaciones, this.gridBagConstraintsDepreciaciones);
		*/		
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDepreciaciones.gridx =0;
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDepreciaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDepreciaciones, this.gridBagConstraintsDepreciaciones);
				
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDepreciaciones, this.gridBagConstraintsDepreciaciones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DepreciacionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDepreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDepreciaciones = new GridBagLayout();
			this.jPanelBusquedasParametrosDepreciaciones.setLayout(gridaBagLayoutBusquedasParametrosDepreciaciones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDepreciaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDepreciaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepreciaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepreciaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDepreciaciones, this.gridBagConstraintsDepreciaciones);
			
			
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
			
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDepreciaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDepreciaciones, this.gridBagConstraintsDepreciaciones);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDepreciaciones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDepreciaciones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDepreciaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDepreciaciones.setName("jPanelReporteDinamicoDepreciaciones"); 
		
		this.jPanelReporteDinamicoDepreciaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDepreciaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDepreciaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDepreciaciones.setLayout(gridaBagLayoutReporteDinamicoDepreciaciones);
		
		
		this.jInternalFrameReporteDinamicoDepreciaciones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDepreciaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDepreciaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDepreciaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDepreciaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDepreciaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDepreciaciones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDepreciaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDepreciaciones.setResizable(true);
	    this.jInternalFrameReporteDinamicoDepreciaciones.setClosable(true);
	    this.jInternalFrameReporteDinamicoDepreciaciones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDepreciaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDepreciaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDepreciaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDepreciaciones = new JLabelMe();

		this.jLabelColumnasSelectReporteDepreciaciones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDepreciaciones.add(this.jLabelColumnasSelectReporteDepreciaciones, this.gridBagConstraintsDepreciaciones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDepreciaciones = new JList<Reporte>();
		this.jListColumnasSelectReporteDepreciaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDepreciaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDepreciaciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDepreciaciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDepreciaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDepreciaciones=new JScrollPane(this.jListColumnasSelectReporteDepreciaciones);
			
			this.jScrollColumnasSelectReporteDepreciaciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDepreciaciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDepreciaciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDepreciaciones.add(this.jListColumnasSelectReporteDepreciaciones, this.gridBagConstraintsDepreciaciones);
		this.jPanelReporteDinamicoDepreciaciones.add(this.jScrollColumnasSelectReporteDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDepreciaciones = new JLabelMe();

		this.jLabelRelacionesSelectReporteDepreciaciones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDepreciaciones = new JList<Reporte>();
		this.jListRelacionesSelectReporteDepreciaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDepreciaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDepreciaciones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDepreciaciones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDepreciaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDepreciaciones=new JScrollPane(this.jListRelacionesSelectReporteDepreciaciones);
			
			this.jScrollRelacionesSelectReporteDepreciaciones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDepreciaciones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDepreciaciones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDepreciaciones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDepreciaciones = new JComboBoxMe();
		this.jListColumnasValoresGraficoDepreciaciones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDepreciaciones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDepreciaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDepreciaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDepreciaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDepreciaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDepreciaciones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDepreciaciones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDepreciaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDepreciaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDepreciaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDepreciaciones = new JLabelMe();

		this.jLabelConGraficoDinamicoDepreciaciones.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDepreciaciones.add(this.jLabelConGraficoDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDepreciaciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDepreciaciones.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDepreciaciones.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDepreciaciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDepreciaciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDepreciaciones.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciaciones.add(this.jCheckBoxConGraficoDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDepreciaciones = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDepreciaciones.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDepreciaciones.add(this.jLabelColumnaCategoriaGraficoDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDepreciaciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDepreciaciones.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDepreciaciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDepreciaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDepreciaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDepreciaciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDepreciaciones.add(this.jComboBoxColumnaCategoriaGraficoDepreciaciones, this.gridBagConstraintsDepreciaciones);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDepreciaciones = new JLabelMe();

		this.jLabelColumnaCategoriaValorDepreciaciones.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciaciones.add(this.jLabelColumnaCategoriaValorDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDepreciaciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDepreciaciones.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDepreciaciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDepreciaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDepreciaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDepreciaciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDepreciaciones.add(this.jComboBoxColumnaCategoriaValorDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDepreciaciones = new JLabelMe();

		this.jLabelColumnasValoresGraficoDepreciaciones.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciaciones.add(this.jLabelColumnasValoresGraficoDepreciaciones, this.gridBagConstraintsDepreciaciones);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDepreciaciones = new JList<Reporte>();
		this.jListColumnasValoresGraficoDepreciaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDepreciaciones.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDepreciaciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDepreciaciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDepreciaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDepreciaciones=new JScrollPane(this.jListColumnasValoresGraficoDepreciaciones);
			
			this.jScrollColumnasValoresGraficoDepreciaciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDepreciaciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDepreciaciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDepreciaciones.add(this.jListColumnasSelectReporteDepreciaciones, this.gridBagConstraintsDepreciaciones);
		this.jPanelReporteDinamicoDepreciaciones.add(this.jScrollColumnasValoresGraficoDepreciaciones, this.gridBagConstraintsDepreciaciones);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDepreciaciones = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDepreciaciones.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciaciones.add(this.jLabelTiposGraficosReportesDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDepreciaciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDepreciaciones.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDepreciaciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDepreciaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDepreciaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDepreciaciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciaciones.add(this.jComboBoxTiposGraficosReportesDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDepreciaciones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDepreciaciones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciaciones.add(this.jLabelGenerarExcelReporteDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDepreciaciones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDepreciaciones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDepreciaciones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDepreciaciones.setToolTipText("Generar EXCEL"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDepreciaciones.add(this.jButtonGenerarExcelReporteDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepreciaciones.add(this.jComboBoxTiposReportesDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDepreciaciones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDepreciaciones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciaciones.add(this.jLabelTiposArchivoReporteDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepreciaciones.add(this.jComboBoxTiposArchivosReportesDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDepreciaciones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDepreciaciones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDepreciaciones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDepreciaciones.setToolTipText("Generar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepreciaciones.add(this.jButtonGenerarReporteDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDepreciaciones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDepreciaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDepreciaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDepreciaciones.setToolTipText("Cancelar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepreciaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepreciaciones.add(this.jButtonCerrarReporteDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDepreciaciones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDepreciaciones= new JScrollPane(jPanelReporteDinamicoDepreciaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDepreciaciones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDepreciaciones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDepreciaciones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDepreciaciones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDepreciaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDepreciaciones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDepreciaciones);
		this.jInternalFrameReporteDinamicoDepreciaciones.getContentPane().add(this.jScrollPanelReporteDinamicoDepreciaciones, this.gridBagConstraintsDepreciaciones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDepreciaciones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDepreciaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDepreciaciones.setName("jPanelImportacionDepreciaciones"); 
		
		this.jPanelImportacionDepreciaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDepreciaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDepreciaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDepreciaciones.setLayout(gridaBagLayoutImportacionDepreciaciones);
		
		
		this.jInternalFrameImportacionDepreciaciones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDepreciaciones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDepreciaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDepreciaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDepreciaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDepreciaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDepreciaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDepreciaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDepreciaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDepreciaciones.setResizable(true);
	    this.jInternalFrameImportacionDepreciaciones.setClosable(true);
	    this.jInternalFrameImportacionDepreciaciones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDepreciaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDepreciaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDepreciaciones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDepreciaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDepreciaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDepreciaciones.setResizable(true);
	    this.jInternalFrameImportacionDepreciaciones.setClosable(true);
	    this.jInternalFrameImportacionDepreciaciones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDepreciaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDepreciaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDepreciaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDepreciaciones = new JLabelMe();

		this.jLabelArchivoImportacionDepreciaciones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDepreciaciones.add(this.jLabelArchivoImportacionDepreciaciones, this.gridBagConstraintsDepreciaciones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDepreciaciones = new JFileChooser();		
		this.jFileChooserImportacionDepreciaciones.setToolTipText("ESCOGER ARCHIVO"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDepreciaciones = new JButtonMe();
		this.jButtonAbrirImportacionDepreciaciones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDepreciaciones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDepreciaciones.setToolTipText("Generar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsDepreciaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepreciaciones.add(this.jButtonAbrirImportacionDepreciaciones, this.gridBagConstraintsDepreciaciones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDepreciaciones = new JLabelMe();

		this.jLabelPathArchivoImportacionDepreciaciones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDepreciaciones.add(this.jLabelPathArchivoImportacionDepreciaciones, this.gridBagConstraintsDepreciaciones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDepreciaciones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDepreciaciones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDepreciaciones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDepreciaciones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsDepreciaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepreciaciones.add(this.jTextFieldPathArchivoImportacionDepreciaciones, this.gridBagConstraintsDepreciaciones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDepreciaciones = new JButtonMe();
		this.jButtonGenerarImportacionDepreciaciones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDepreciaciones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDepreciaciones.setToolTipText("Generar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsDepreciaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepreciaciones.add(this.jButtonGenerarImportacionDepreciaciones, this.gridBagConstraintsDepreciaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDepreciaciones = new JButtonMe();
		this.jButtonCerrarImportacionDepreciaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDepreciaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDepreciaciones.setToolTipText("Cancelar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsDepreciaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepreciaciones.add(this.jButtonCerrarImportacionDepreciaciones, this.gridBagConstraintsDepreciaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDepreciaciones = new GridBagLayout();
		
		this.jScrollPanelImportacionDepreciaciones= new JScrollPane(jPanelImportacionDepreciaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy =iPosYImportacion;
		this.gridBagConstraintsDepreciaciones.gridx =iPosXImportacion;
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDepreciaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDepreciaciones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDepreciaciones);
		this.jInternalFrameImportacionDepreciaciones.getContentPane().add(this.jScrollPanelImportacionDepreciaciones, this.gridBagConstraintsDepreciaciones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDepreciaciones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDepreciaciones = new JButtonMe();
			this.jButtonAbrirOrderByDepreciaciones.setText("Orden");
			this.jButtonAbrirOrderByDepreciaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDepreciaciones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDepreciaciones";
			inputMap = this.jButtonAbrirOrderByDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDepreciaciones"));
		
		
			GridBagLayout gridaBagLayoutOrderByDepreciaciones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDepreciaciones.setName("jPanelOrderByDepreciaciones"); 
			
			this.jPanelOrderByDepreciaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDepreciaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDepreciaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDepreciaciones.setLayout(gridaBagLayoutOrderByDepreciaciones);
			
			
			this.jTableDatosDepreciacionesOrderBy = new JTableMe();        
			this.jTableDatosDepreciacionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDepreciacionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDepreciacionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDepreciacionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDepreciacionesOrderBy.setViewportView(this.jTableDatosDepreciacionesOrderBy);
			this.jTableDatosDepreciacionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDepreciacionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDepreciaciones= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDepreciaciones= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDepreciaciones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDepreciaciones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDepreciaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDepreciaciones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDepreciaciones.setTitle("Orden");
			this.jInternalFrameOrderByDepreciaciones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDepreciaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDepreciaciones.setResizable(true);
			this.jInternalFrameOrderByDepreciaciones.setClosable(true);
			this.jInternalFrameOrderByDepreciaciones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDepreciaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDepreciaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDepreciaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDepreciaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDepreciaciones.ipady =150;
				
			this.jPanelOrderByDepreciaciones.add(jScrollPanelDatosDepreciacionesOrderBy, this.gridBagConstraintsDepreciaciones);//this.jTableDatosDepreciacionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDepreciaciones = new JButtonMe();
			this.jButtonCerrarOrderByDepreciaciones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDepreciaciones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDepreciaciones.setToolTipText("Cancelar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDepreciaciones.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDepreciaciones.add(this.jButtonCerrarOrderByDepreciaciones, this.gridBagConstraintsDepreciaciones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDepreciaciones = new GridBagLayout();
			
			this.jScrollPanelOrderByDepreciaciones= new JScrollPane(jPanelOrderByDepreciaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.gridy =iPosYOrderBy;
			this.gridBagConstraintsDepreciaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDepreciaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDepreciaciones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDepreciaciones);
			
			this.jInternalFrameOrderByDepreciaciones.getContentPane().add(this.jScrollPanelOrderByDepreciaciones, this.gridBagConstraintsDepreciaciones);			
		
		} else {
			this.jButtonAbrirOrderByDepreciaciones = new JButtonMe();
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
		int iWidthTableCalculado=0;//3830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.depreciacionesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDepreciaciones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDepreciaciones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDepreciaciones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosDepreciaciones.getRowHeight();//DepreciacionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DepreciacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDepreciaciones.isSelected()) {
					iHeightTable=DepreciacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DepreciacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DepreciacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DepreciacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDepreciaciones.isSelected()) {
					iHeightTable=DepreciacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DepreciacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DepreciacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDepreciaciones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDepreciaciones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDepreciaciones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDepreciaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDepreciaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDepreciaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDepreciaciones!=null && this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy()!=null) {
			//if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDepreciaciones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDepreciaciones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDepreciaciones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDepreciaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDepreciaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDepreciaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=depreciacionesLogic.getDepreciacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=depreciacioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Depreciaciones> TraerDepreciacionesBeans(List<Depreciaciones> depreciacioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(Depreciaciones depreciaciones:depreciacioness) {
					
				if(!(DepreciacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DepreciacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					depreciaciones.setsDetalleGeneralEntityReporte(DepreciacionesConstantesFunciones.getDepreciacionesDescripcion(depreciaciones));
										
						
					
						
					
				} else  {
							
					//depreciaciones.setsDetalleGeneralEntityReporte(depreciaciones.getsDetalleGeneralEntityReporte());
										
				}
				
				//depreciacionesbeans.add(depreciacionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return depreciacioness;
    }
	//PARA REPORTES FIN
}
