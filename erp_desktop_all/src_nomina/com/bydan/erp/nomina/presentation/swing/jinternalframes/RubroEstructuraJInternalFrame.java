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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.RubroEstructuraConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class RubroEstructuraJInternalFrame extends RubroEstructuraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRubroEstructura;
	
	protected JMenuBar jmenuBarRubroEstructura;
	
	protected JMenu jmenuRubroEstructura;
	protected JMenu jmenuDatosRubroEstructura;
	protected JMenu jmenuArchivoRubroEstructura;
	protected JMenu jmenuAccionesRubroEstructura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRubroEstructura;	
	protected GridBagConstraints gridBagConstraintsRubroEstructura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RubroEstructuraDetalleFormJInternalFrame jInternalFrameDetalleFormRubroEstructura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRubroEstructura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRubroEstructura;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";
	
	public RubroEstructuraSessionBean rubroestructuraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RubroEstructura> rubroestructuras;		
	public List<RubroEstructura> rubroestructurasEliminados;	
	public List<RubroEstructura> rubroestructurasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRubroEstructura;		
	protected JButton jButtonAbrirOrderByRubroEstructura;
	
	
	//protected JPanel jPanelOrderByRubroEstructura;
	//public JScrollPane jScrollPanelOrderByRubroEstructura;	
	//protected JButton jButtonCerrarOrderByRubroEstructura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RubroEstructuraLogic rubroestructuraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRubroEstructura;
	public JScrollPane jScrollPanelDatosEdicionRubroEstructura;
	public JScrollPane jScrollPanelDatosGeneralRubroEstructura;
    
	
	
	//public JScrollPane jScrollPanelDatosRubroEstructuraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRubroEstructura;
	//public JScrollPane jScrollPanelImportacionRubroEstructura;
	
	
	
	protected JPanel jPanelAccionesRubroEstructura;
	
    protected JPanel jPanelPaginacionRubroEstructura;
    protected JPanel jPanelParametrosReportesRubroEstructura;
	protected JPanel jPanelParametrosReportesAccionesRubroEstructura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RubroEstructura;
	protected JPanel jPanelParametrosAuxiliar2RubroEstructura;
	protected JPanel jPanelParametrosAuxiliar3RubroEstructura;
	protected JPanel jPanelParametrosAuxiliar4RubroEstructura;
	//protected JPanel jPanelParametrosAuxiliar5RubroEstructura;
	
	
	
	//protected JPanel jPanelReporteDinamicoRubroEstructura;
	//protected JPanel jPanelImportacionRubroEstructura;
	
	
	public JTable jTableDatosRubroEstructura;
	
	
	
	//public JTable jTableDatosRubroEstructuraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRubroEstructura;
	protected JButton jButtonDuplicarRubroEstructura;
	protected JButton jButtonCopiarRubroEstructura;
	protected JButton jButtonVerFormRubroEstructura;
	protected JButton jButtonNuevoRelacionesRubroEstructura;
	protected JButton jButtonModificarRubroEstructura;
	
    protected JButton jButtonGuardarCambiosTablaRubroEstructura;
	protected JButton jButtonCerrarRubroEstructura;
	
	
	protected JButton jButtonRecargarInformacionRubroEstructura;
	protected JButton jButtonProcesarInformacionRubroEstructura;
	
	
	protected JButton jButtonAnterioresRubroEstructura;
	protected JButton jButtonSiguientesRubroEstructura;
	protected JButton jButtonNuevoGuardarCambiosRubroEstructura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRubroEstructura;
	//protected JButton jButtonCerrarReporteDinamicoRubroEstructura;
	//protected JButton jButtonGenerarExcelReporteDinamicoRubroEstructura;	
	
	
	
	//protected JButton jButtonAbrirImportacionRubroEstructura;
	//protected JButton jButtonGenerarImportacionRubroEstructura;
	//protected JButton jButtonCerrarImportacionRubroEstructura;
	//protected JFileChooser jFileChooserImportacionRubroEstructura;
	//protected File fileImportacionRubroEstructura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRubroEstructura;
	protected JButton jButtonDuplicarToolBarRubroEstructura;
	protected JButton jButtonNuevoRelacionesToolBarRubroEstructura;
	
	
	public JButton jButtonGuardarCambiosToolBarRubroEstructura;
	protected JButton jButtonCopiarToolBarRubroEstructura;
	protected JButton jButtonVerFormToolBarRubroEstructura;
	public JButton jButtonGuardarCambiosTablaToolBarRubroEstructura;
	protected JButton jButtonMostrarOcultarTablaToolBarRubroEstructura;
	protected JButton jButtonCerrarToolBarRubroEstructura;
	
	protected JButton jButtonRecargarInformacionToolBarRubroEstructura;
	protected JButton jButtonProcesarInformacionToolBarRubroEstructura;
	protected JButton jButtonAnterioresToolBarRubroEstructura;
	protected JButton jButtonSiguientesToolBarRubroEstructura;
	protected JButton jButtonNuevoGuardarCambiosToolBarRubroEstructura;
	protected JButton jButtonAbrirOrderByToolBarRubroEstructura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRubroEstructura;
	protected JMenuItem jMenuItemDuplicarRubroEstructura;
	protected JMenuItem jMenuItemNuevoRelacionesRubroEstructura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRubroEstructura;
	protected JMenuItem jMenuItemCopiarRubroEstructura;
	protected JMenuItem jMenuItemVerFormRubroEstructura;
	protected JMenuItem jMenuItemGuardarCambiosTablaRubroEstructura;
	protected JMenuItem jMenuItemCerrarRubroEstructura;
	protected JMenuItem jMenuItemDetalleCerrarRubroEstructura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRubroEstructura;
	protected JMenuItem jMenuItemDetalleMostarOcultarRubroEstructura;
	
	protected JMenuItem jMenuItemRecargarInformacionRubroEstructura;
	protected JMenuItem jMenuItemProcesarInformacionRubroEstructura;
	protected JMenuItem jMenuItemAnterioresRubroEstructura;
	protected JMenuItem jMenuItemSiguientesRubroEstructura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRubroEstructura;
	protected JMenuItem jMenuItemAbrirOrderByRubroEstructura;
	protected JMenuItem jMenuItemMostrarOcultarRubroEstructura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRubroEstructura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRubroEstructura;
	protected JCheckBox jCheckBoxSeleccionadosRubroEstructura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRubroEstructura;
	protected JCheckBox jCheckBoxConGraficoReporteRubroEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRubroEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRubroEstructura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRubroEstructura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRubroEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRubroEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRubroEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRubroEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRubroEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRubroEstructura;
	protected JTextField jTextFieldValorCampoGeneralRubroEstructura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRubroEstructura;
	//public JList<Reporte> jListColumnasSelectReporteRubroEstructura;
	//public JScrollPane jScrollColumnasSelectReporteRubroEstructura;
	
	//public JLabel jLabelRelacionesSelectReporteRubroEstructura;
	//public JList<Reporte> jListRelacionesSelectReporteRubroEstructura;
	//public JScrollPane jScrollRelacionesSelectReporteRubroEstructura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRubroEstructura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRubroEstructura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRubroEstructura;
	//public JLabel jLabelTiposArchivoReporteDinamicoRubroEstructura;
	
		
	//public JLabel jLabelArchivoImportacionRubroEstructura;	
	//public JLabel jLabelPathArchivoImportacionRubroEstructura;
	//protected JTextField jTextFieldPathArchivoImportacionRubroEstructura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRubroEstructura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRubroEstructura;
	
	//public JLabel jLabelColumnaCategoriaValorRubroEstructura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRubroEstructura;
	
	//public JLabel jLabelColumnasValoresGraficoRubroEstructura;
	//public JList<Reporte> jListColumnasValoresGraficoRubroEstructura;
	//public JScrollPane jScrollColumnasValoresGraficoRubroEstructura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRubroEstructura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRubroEstructura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRubroEstructura;
	public JPanel jPanelFK_IdEstructuraRubroEstructura;
	public JButton jButtonFK_IdEstructuraRubroEstructura;
	public JPanel jPanelFK_IdRubroEmpleaRubroEstructura;
	public JButton jButtonFK_IdRubroEmpleaRubroEstructura;
	
	public JPanel jPanelid_estructuraFK_IdEstructuraRubroEstructura;
	public JLabel jLabelid_estructuraFK_IdEstructuraRubroEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraRubroEstructura;
	public JButton jButtonid_estructuraFK_IdEstructuraRubroEstructura= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraRubroEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraRubroEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraRubroEstructuraArbol= new JButtonMe();

	
	public JPanel jPanelid_rubro_empleaFK_IdRubroEmpleaRubroEstructura;
	public JLabel jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura;
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaRubroEstructura= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaRubroEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaRubroEstructuraBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RubroEstructuraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RubroEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEstructuraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEstructuraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEstructuraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RubroEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRubroEstructura)	{
		this.jButtonRecargarInformacionRubroEstructura = jButtonRecargarInformacionRubroEstructura;
	}
	
	public JButton getjButtonProcesarInformacionRubroEstructura() {
		return this.jButtonProcesarInformacionRubroEstructura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRubroEstructura)	{
		this.jButtonProcesarInformacionRubroEstructura = jButtonProcesarInformacionRubroEstructura;
	}
	
	
	public JButton getjButtonRecargarInformacionRubroEstructura() {
		return this.jButtonRecargarInformacionRubroEstructura;
	}
	
	
	public List<RubroEstructura> getrubroestructuras() {
		return this.rubroestructuras;
	}

	public void setrubroestructuras(List<RubroEstructura> rubroestructuras) {
		this.rubroestructuras = rubroestructuras;
	}
	
	public List<RubroEstructura> getrubroestructurasAux() {
		return this.rubroestructurasAux;
	}

	public void setrubroestructurasAux(List<RubroEstructura> rubroestructurasAux) {
		this.rubroestructurasAux = rubroestructurasAux;
	}
	
	public List<RubroEstructura> getrubroestructurasEliminados() {
		return this.rubroestructurasEliminados;
	}

	public void setRubroEstructurasEliminados(List<RubroEstructura> rubroestructurasEliminados) {
		this.rubroestructurasEliminados = rubroestructurasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRubroEstructura() {
		return jComboBoxTiposSeleccionarRubroEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRubroEstructura(
			JComboBox jComboBoxTiposSeleccionarRubroEstructura) {
		this.jComboBoxTiposSeleccionarRubroEstructura = jComboBoxTiposSeleccionarRubroEstructura;
	}
	
	public void setBorderResaltarTiposSeleccionarRubroEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRubroEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRubroEstructura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRubroEstructura() {
		return jTextFieldValorCampoGeneralRubroEstructura;
	}

	public void setjTextFieldValorCampoGeneralRubroEstructura(
			JTextField jTextFieldValorCampoGeneralRubroEstructura) {
		this.jTextFieldValorCampoGeneralRubroEstructura = jTextFieldValorCampoGeneralRubroEstructura;
	}

	public void setBorderResaltarValorCampoGeneralRubroEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEstructura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRubroEstructura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRubroEstructura() {
		return this.jCheckBoxSeleccionarTodosRubroEstructura;
	}

	public void setjCheckBoxSeleccionarTodosRubroEstructura(
			JCheckBox jCheckBoxSeleccionarTodosRubroEstructura) {
		this.jCheckBoxSeleccionarTodosRubroEstructura = jCheckBoxSeleccionarTodosRubroEstructura;
	}

	public void setBorderResaltarSeleccionarTodosRubroEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEstructura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRubroEstructura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRubroEstructura() {
		return this.jCheckBoxSeleccionadosRubroEstructura;
	}

	public void setjCheckBoxSeleccionadosRubroEstructura(
			JCheckBox jCheckBoxSeleccionadosRubroEstructura) {
		this.jCheckBoxSeleccionadosRubroEstructura = jCheckBoxSeleccionadosRubroEstructura;
	}
	
	public void setBorderResaltarSeleccionadosRubroEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEstructura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRubroEstructura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRubroEstructura() {
		return this.jComboBoxTiposArchivosReportesRubroEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRubroEstructura(
			JComboBox jComboBoxTiposArchivosReportesRubroEstructura) {
		this.jComboBoxTiposArchivosReportesRubroEstructura = jComboBoxTiposArchivosReportesRubroEstructura;
	}

	public void setBorderResaltarTiposArchivosReportesRubroEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRubroEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRubroEstructura() {
		return this.jComboBoxTiposReportesRubroEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRubroEstructura(
			JComboBox jComboBoxTiposReportesRubroEstructura) {
		this.jComboBoxTiposReportesRubroEstructura = jComboBoxTiposReportesRubroEstructura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRubroEstructura() {
	//	return jComboBoxTiposReportesDinamicoRubroEstructura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRubroEstructura(
	//		JComboBox jComboBoxTiposReportesDinamicoRubroEstructura) {
	//	this.jComboBoxTiposReportesDinamicoRubroEstructura = jComboBoxTiposReportesDinamicoRubroEstructura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRubroEstructura() {
	//	return jComboBoxTiposArchivosReportesDinamicoRubroEstructura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRubroEstructura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRubroEstructura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRubroEstructura = jComboBoxTiposArchivosReportesDinamicoRubroEstructura;
	//}
	
	public void setBorderResaltarTiposReportesRubroEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRubroEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRubroEstructura() {
		return this.jComboBoxTiposGraficosReportesRubroEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRubroEstructura(
			JComboBox jComboBoxTiposGraficosReportesRubroEstructura) {
		this.jComboBoxTiposGraficosReportesRubroEstructura = jComboBoxTiposGraficosReportesRubroEstructura;
	}
	
	public void setBorderResaltarTiposGraficosReportesRubroEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRubroEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRubroEstructura() {
		return this.jComboBoxTiposPaginacionRubroEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRubroEstructura(
			JComboBox jComboBoxTiposPaginacionRubroEstructura) {
		this.jComboBoxTiposPaginacionRubroEstructura = jComboBoxTiposPaginacionRubroEstructura;
	}
	
	public void setBorderResaltarTiposPaginacionRubroEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRubroEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRubroEstructura() {
		return this.jComboBoxTiposRelacionesRubroEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRubroEstructura() {
		return this.jComboBoxTiposAccionesRubroEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRubroEstructura(
			JComboBox jComboBoxTiposRelacionesRubroEstructura) {
		this.jComboBoxTiposRelacionesRubroEstructura = jComboBoxTiposRelacionesRubroEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRubroEstructura(
			JComboBox jComboBoxTiposAccionesRubroEstructura) {
		this.jComboBoxTiposAccionesRubroEstructura = jComboBoxTiposAccionesRubroEstructura;
	}
	
	public void setBorderResaltarTiposRelacionesRubroEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRubroEstructura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRubroEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRubroEstructura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRubroEstructura() {
	//	return jCheckBoxConGraficoDinamicoRubroEstructura;
	//}

	//public void setjCheckBoxConGraficoDinamicoRubroEstructura(
	//		JCheckBox jCheckBoxConGraficoDinamicoRubroEstructura) {
	//	this.jCheckBoxConGraficoDinamicoRubroEstructura = jCheckBoxConGraficoDinamicoRubroEstructura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRubroEstructura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRubroEstructura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRubroEstructura .setBorder(borderResaltar);		
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
		this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
		
		this.rubroestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubroestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rubroestructuraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RubroEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RubroEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RubroEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RubroEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RubroEstructuraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rubro Estructura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
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
		
		RubroEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RubroEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRubroEstructura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"nuevo","nuevo","Nuevo"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"duplicar","duplicar","Duplicar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"copiar","copiar","Copiar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"ver_form","ver_form","Ver"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"recargar","recargar","Recargar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRubroEstructura,this.jTtoolBarRubroEstructura,
							"cerrar","cerrar","Salir"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRubroEstructura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRubroEstructura;
			
				this.jButtonProcesarInformacionToolBarRubroEstructura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRubroEstructura;
				
		//protected JButton jButtonModificarToolBarRubroEstructura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRubroEstructura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRubroEstructura=new JMenuMe("General");
		this.jmenuArchivoRubroEstructura=new JMenuMe("Archivo");
		this.jmenuAccionesRubroEstructura=new JMenuMe("Acciones");
		this.jmenuDatosRubroEstructura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRubroEstructura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRubroEstructura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRubroEstructura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRubroEstructura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRubroEstructura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRubroEstructura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRubroEstructura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRubroEstructura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRubroEstructura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRubroEstructura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRubroEstructura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRubroEstructura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRubroEstructura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRubroEstructura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRubroEstructura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRubroEstructura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRubroEstructura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRubroEstructura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRubroEstructura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRubroEstructura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRubroEstructura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRubroEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRubroEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRubroEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRubroEstructura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRubroEstructura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRubroEstructura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRubroEstructura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRubroEstructura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRubroEstructura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRubroEstructura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRubroEstructura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRubroEstructura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRubroEstructura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRubroEstructura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRubroEstructura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRubroEstructura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRubroEstructura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRubroEstructura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRubroEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRubroEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRubroEstructura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRubroEstructura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRubroEstructura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRubroEstructura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRubroEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRubroEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRubroEstructura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRubroEstructura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRubroEstructura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRubroEstructura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRubroEstructura.add(this.jMenuItemCerrarRubroEstructura);
			
			this.jmenuAccionesRubroEstructura.add(this.jMenuItemNuevoRubroEstructura);
			this.jmenuAccionesRubroEstructura.add(this.jMenuItemNuevoGuardarCambiosRubroEstructura);
			this.jmenuAccionesRubroEstructura.add(this.jMenuItemNuevoRelacionesRubroEstructura);
			this.jmenuAccionesRubroEstructura.add(this.jMenuItemGuardarCambiosTablaRubroEstructura);		
			this.jmenuAccionesRubroEstructura.add(this.jMenuItemDuplicarRubroEstructura);		
			this.jmenuAccionesRubroEstructura.add(this.jMenuItemCopiarRubroEstructura);		
			this.jmenuAccionesRubroEstructura.add(this.jMenuItemVerFormRubroEstructura);		
			
			this.jmenuDatosRubroEstructura.add(this.jMenuItemRecargarInformacionRubroEstructura);				
			this.jmenuDatosRubroEstructura.add(this.jMenuItemAnterioresRubroEstructura);				
			this.jmenuDatosRubroEstructura.add(this.jMenuItemSiguientesRubroEstructura);				
			this.jmenuDatosRubroEstructura.add(this.jMenuItemAbrirOrderByRubroEstructura);				
			this.jmenuDatosRubroEstructura.add(this.jMenuItemMostrarOcultarRubroEstructura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRubroEstructura.add(this.jMenuItemGuardarCambiosRubroEstructura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRubroEstructura.add(this.jmenuArchivoRubroEstructura);		
			this.jmenuBarRubroEstructura.add(this.jmenuAccionesRubroEstructura);		
			this.jmenuBarRubroEstructura.add(this.jmenuDatosRubroEstructura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRubroEstructura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRubroEstructura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEstructuraRubroEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraRubroEstructura.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraRubroEstructura= new JButtonMe();
		this.jButtonFK_IdEstructuraRubroEstructura.setText("Buscar");
		this.jButtonFK_IdEstructuraRubroEstructura.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraRubroEstructura,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraRubroEstructura = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraRubroEstructura.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraRubroEstructura.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraRubroEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraRubroEstructura= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraRubroEstructura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRubroEmpleaRubroEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRubroEmpleaRubroEstructura.setToolTipText("Buscar Por Rubro Emplea ");
		this.jButtonFK_IdRubroEmpleaRubroEstructura= new JButtonMe();
		this.jButtonFK_IdRubroEmpleaRubroEstructura.setText("Buscar");
		this.jButtonFK_IdRubroEmpleaRubroEstructura.setToolTipText("Buscar Por Rubro Emplea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRubroEmpleaRubroEstructura,"buscar_button","Buscar Por Rubro Emplea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRubroEmpleaRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEstructura = new JLabelMe();
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setText("Rubro Emplea :");
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setToolTipText("Rubro Emplea");
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura= new JComboBoxMe();
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRubroEstructura=new JTabbedPane();


		this.jTabbedPaneBusquedasRubroEstructura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRubroEstructura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRubroEstructura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRubroEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRubroEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRubroEstructura = new RubroEstructuraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Rubro Estructura DATOS");
			this.jInternalFrameDetalleFormRubroEstructura = new RubroEstructuraDetalleFormJInternalFrame(jDesktopPane,this.rubroestructuraSessionBean.getConGuardarRelaciones(),this.rubroestructuraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRubroEstructura = null;//new RubroEstructuraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRubroEstructura= new GridBagLayout();
		
		
		this.jTableDatosRubroEstructura = new JTableMe();      
		
		String sToolTipRubroEstructura="";
		sToolTipRubroEstructura=RubroEstructuraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRubroEstructura+="(Nomina.RubroEstructura)";
		}
		
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
			sToolTipRubroEstructura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRubroEstructura.setToolTipText(sToolTipRubroEstructura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRubroEstructura);
		this.jTableDatosRubroEstructura.setAutoCreateRowSorter(true);
		this.jTableDatosRubroEstructura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRubroEstructura.setRowSelectionAllowed(true);
		this.jTableDatosRubroEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRubroEstructura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRubroEstructura = new JButtonMe();
		this.jButtonDuplicarRubroEstructura = new JButtonMe();
		this.jButtonCopiarRubroEstructura = new JButtonMe();
		this.jButtonVerFormRubroEstructura = new JButtonMe();
		this.jButtonNuevoRelacionesRubroEstructura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRubroEstructura = new JButtonMe();
		this.jButtonCerrarRubroEstructura = new JButtonMe();
		
		this.jScrollPanelDatosRubroEstructura = new JScrollPane();   
        this.jScrollPanelDatosGeneralRubroEstructura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Rubro Estructura";
		
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Estructuras" + this.sPath));
		} else {
			this.jScrollPanelDatosRubroEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRubroEstructura.setToolTipText("Acciones");
        this.jPanelAccionesRubroEstructura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRubroEstructura=new ReporteDinamicoJInternalFrame(RubroEstructuraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRubroEstructura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRubroEstructura=new ImportacionJInternalFrame(RubroEstructuraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRubroEstructura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRubroEstructura = new JButtonMe();
		
		this.jButtonAbrirOrderByRubroEstructura.setText("Orden");
		this.jButtonAbrirOrderByRubroEstructura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRubroEstructura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRubroEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEstructura,false,this);
			
			//this.cargarOrderByRubroEstructura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRubroEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEstructura,true,this);
			
			//this.cargarOrderByRubroEstructura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRubroEstructura.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosRubroEstructura.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosRubroEstructura.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosRubroEstructura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRubroEstructura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRubroEstructura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRubroEstructura.setText("Nuevo");
		this.jButtonDuplicarRubroEstructura.setText("Duplicar");
		this.jButtonCopiarRubroEstructura.setText("Copiar");
		this.jButtonVerFormRubroEstructura.setText("Ver");
		this.jButtonNuevoRelacionesRubroEstructura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRubroEstructura.setText("Guardar");
		this.jButtonCerrarRubroEstructura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRubroEstructura,"nuevo_button","Nuevo",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRubroEstructura,"duplicar_button","Duplicar",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRubroEstructura,"copiar_button","Copiar",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRubroEstructura,"ver_form","Ver",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRubroEstructura,"nuevorelaciones_button","Nuevo Rel",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRubroEstructura,"guardarcambiostabla_button","Guardar",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRubroEstructura,"cerrar_button","Salir",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRubroEstructura.setToolTipText("Nuevo"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRubroEstructura.setToolTipText("Duplicar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRubroEstructura.setToolTipText("Copiar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRubroEstructura.setToolTipText("Ver"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRubroEstructura.setToolTipText("Nuevo Rel"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRubroEstructura.setToolTipText("Guardar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRubroEstructura.setToolTipText("Salir"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRubroEstructura";
		inputMap = this.jButtonNuevoRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRubroEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRubroEstructura"));
		
		//DUPLICAR
		sMapKey = "DuplicarRubroEstructura";
		inputMap = this.jButtonDuplicarRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRubroEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRubroEstructura"));
		
		//COPIAR
		sMapKey = "CopiarRubroEstructura";
		inputMap = this.jButtonCopiarRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRubroEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRubroEstructura"));
		
		//VEr FORM
		sMapKey = "VerFormRubroEstructura";
		inputMap = this.jButtonVerFormRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRubroEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRubroEstructura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRubroEstructura";
		inputMap = this.jButtonNuevoRelacionesRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRubroEstructura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRubroEstructura";
		inputMap = this.jButtonModificarRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRubroEstructura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRubroEstructura";
		inputMap = this.jButtonCerrarRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRubroEstructura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRubroEstructura";
		inputMap = this.jButtonGuardarCambiosTablaRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRubroEstructura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RubroEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RubroEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RubroEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RubroEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RubroEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRubroEstructura.setName("jPanelParametrosReportesRubroEstructura"); 
		
		this.jPanelParametrosReportesAccionesRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRubroEstructura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRubroEstructura.setName("jPanelParametrosReportesAccionesRubroEstructura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRubroEstructura = new JButtonMe();
		this.jButtonRecargarInformacionRubroEstructura.setText("Recargar");
		this.jButtonRecargarInformacionRubroEstructura.setToolTipText("Recargar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRubroEstructura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRubroEstructura = new JButtonMe();
		this.jButtonProcesarInformacionRubroEstructura.setText("Procesar");
		this.jButtonProcesarInformacionRubroEstructura.setToolTipText("Procesar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRubroEstructura.setVisible(false);
			
		this.jButtonProcesarInformacionRubroEstructura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRubroEstructura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRubroEstructura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRubroEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEstructura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRubroEstructura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRubroEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEstructura.setText("TIPO");       
		this.jComboBoxTiposReportesRubroEstructura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRubroEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEstructura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRubroEstructura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRubroEstructura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRubroEstructura.setText("Paginacion");
		this.jComboBoxTiposPaginacionRubroEstructura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRubroEstructura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRubroEstructura.setText("Accion");
		this.jComboBoxTiposRelacionesRubroEstructura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRubroEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRubroEstructura.setText("Accion");
		this.jComboBoxTiposAccionesRubroEstructura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRubroEstructura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRubroEstructura.setText("Accion");
		this.jComboBoxTiposSeleccionarRubroEstructura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRubroEstructura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRubroEstructura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRubroEstructura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRubroEstructura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRubroEstructura = new JLabelMe();
		
		this.jLabelAccionesRubroEstructura.setText("Acciones");		
		this.jLabelAccionesRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRubroEstructura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRubroEstructura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRubroEstructura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRubroEstructura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRubroEstructura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRubroEstructura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRubroEstructura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRubroEstructura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRubroEstructura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRubroEstructura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRubroEstructura.setText("Graf.");
		this.jCheckBoxConGraficoReporteRubroEstructura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRubroEstructura = new JButtonMe();
		//this.jButtonAnterioresRubroEstructura.setText("<<");
        this.jButtonAnterioresRubroEstructura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRubroEstructura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRubroEstructura = new JButtonMe();
		//this.jButtonSiguientesRubroEstructura.setText(">>");
        this.jButtonSiguientesRubroEstructura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRubroEstructura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRubroEstructura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRubroEstructura.setText("Nue");
        this.jButtonNuevoGuardarCambiosRubroEstructura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRubroEstructura,"nuevoguardarcambios_button","Nue",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRubroEstructura";
		inputMap = this.jButtonNuevoGuardarCambiosRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRubroEstructura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRubroEstructura";
		inputMap = this.jButtonRecargarInformacionRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRubroEstructura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRubroEstructura";
		inputMap = this.jButtonSiguientesRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRubroEstructura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRubroEstructura";
		inputMap = this.jButtonAnterioresRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRubroEstructura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRubroEstructura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRubroEstructura.setMinimumSize(new Dimension(this.getWidth(),RubroEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRubroEstructura.setMaximumSize(new Dimension(this.getWidth(),RubroEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRubroEstructura.setPreferredSize(new Dimension(this.getWidth(),RubroEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRubroEstructura = new GridBagLayout();

			this.jPanelPaginacionRubroEstructura.setLayout(gridaBagLayoutPaginacionRubroEstructura);						
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy = 0;
			this.gridBagConstraintsRubroEstructura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRubroEstructura.add(this.jButtonAnterioresRubroEstructura, this.gridBagConstraintsRubroEstructura);
					
						
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRubroEstructura.gridy = 0;
			
			this.jPanelPaginacionRubroEstructura.add(this.jButtonNuevoGuardarCambiosRubroEstructura, this.gridBagConstraintsRubroEstructura);
						
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRubroEstructura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRubroEstructura.gridy = 0;
			this.jPanelPaginacionRubroEstructura.add(this.jButtonSiguientesRubroEstructura, this.gridBagConstraintsRubroEstructura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy = 1;
			this.gridBagConstraintsRubroEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEstructura.add(this.jButtonNuevoRubroEstructura, this.gridBagConstraintsRubroEstructura);
						
			
			
			if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
				this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRubroEstructura.gridy = 1;
				this.gridBagConstraintsRubroEstructura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRubroEstructura.add(this.jButtonGuardarCambiosTablaRubroEstructura, this.gridBagConstraintsRubroEstructura);
			}
			
			
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy = 1;
			this.gridBagConstraintsRubroEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEstructura.add(this.jButtonDuplicarRubroEstructura, this.gridBagConstraintsRubroEstructura);
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy = 1;
			this.gridBagConstraintsRubroEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEstructura.add(this.jButtonCopiarRubroEstructura, this.gridBagConstraintsRubroEstructura);
		
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy = 1;
			this.gridBagConstraintsRubroEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEstructura.add(this.jButtonVerFormRubroEstructura, this.gridBagConstraintsRubroEstructura);
		
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy = 1;
			this.gridBagConstraintsRubroEstructura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRubroEstructura.add(this.jButtonCerrarRubroEstructura, this.gridBagConstraintsRubroEstructura);
		
		
		
		this.jButtonRecargarInformacionRubroEstructura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRubroEstructura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRubroEstructura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRubroEstructura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRubroEstructura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRubroEstructura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRubroEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRubroEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRubroEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRubroEstructura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRubroEstructura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRubroEstructura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRubroEstructura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRubroEstructura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRubroEstructura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRubroEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRubroEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRubroEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRubroEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRubroEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRubroEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRubroEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRubroEstructura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRubroEstructura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRubroEstructura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRubroEstructura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRubroEstructura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRubroEstructura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRubroEstructura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRubroEstructura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRubroEstructura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRubroEstructura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRubroEstructura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRubroEstructura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRubroEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRubroEstructura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RubroEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RubroEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RubroEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RubroEstructura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRubroEstructura.setLayout(gridaBagParametrosReportesRubroEstructura);
			this.jPanelParametrosReportesAccionesRubroEstructura.setLayout(gridaBagParametrosReportesAccionesRubroEstructura);
			
			
			this.jPanelParametrosAuxiliar1RubroEstructura.setLayout(gridaBagParametrosAuxiliar1RubroEstructura);
			this.jPanelParametrosAuxiliar2RubroEstructura.setLayout(gridaBagParametrosAuxiliar2RubroEstructura);
			this.jPanelParametrosAuxiliar3RubroEstructura.setLayout(gridaBagParametrosAuxiliar3RubroEstructura);
			this.jPanelParametrosAuxiliar4RubroEstructura.setLayout(gridaBagParametrosAuxiliar4RubroEstructura);
			//this.jPanelParametrosAuxiliar5RubroEstructura.setLayout(gridaBagParametrosAuxiliar2RubroEstructura);			
			
			
			
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEstructura.add(this.jButtonRecargarInformacionRubroEstructura, this.gridBagConstraintsRubroEstructura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEstructura.add(this.jComboBoxTiposPaginacionRubroEstructura, this.gridBagConstraintsRubroEstructura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEstructura.add(this.jCheckBoxConAltoMaximoTablaRubroEstructura, this.gridBagConstraintsRubroEstructura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEstructura.add(this.jComboBoxTiposArchivosReportesRubroEstructura, this.gridBagConstraintsRubroEstructura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEstructura.add(this.jPanelParametrosAuxiliar1RubroEstructura, this.gridBagConstraintsRubroEstructura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RubroEstructura.add(this.jComboBoxTiposReportesRubroEstructura, this.gridBagConstraintsRubroEstructura);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEstructura.add(this.jPanelParametrosAuxiliar4RubroEstructura, this.gridBagConstraintsRubroEstructura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEstructura.add(this.jComboBoxTiposReportesRubroEstructura, this.gridBagConstraintsRubroEstructura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEstructura.add(this.jCheckBoxGenerarReporteRubroEstructura, this.gridBagConstraintsRubroEstructura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEstructura.add(this.jPanelParametrosAuxiliar2RubroEstructura, this.gridBagConstraintsRubroEstructura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEstructura.add(this.jLabelAccionesRubroEstructura, this.gridBagConstraintsRubroEstructura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
				this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRubroEstructura.add(this.jButtonAbrirOrderByRubroEstructura, this.gridBagConstraintsRubroEstructura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEstructura.add(this.jComboBoxTiposSeleccionarRubroEstructura, this.gridBagConstraintsRubroEstructura);			
			
			
			/*
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEstructura.add(this.jCheckBoxSeleccionarTodosRubroEstructura, this.gridBagConstraintsRubroEstructura);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubroEstructura.add(this.jCheckBoxSeleccionarTodosRubroEstructura, this.gridBagConstraintsRubroEstructura);															
				
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubroEstructura.add(this.jCheckBoxSeleccionadosRubroEstructura, this.gridBagConstraintsRubroEstructura);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEstructura.add(this.jPanelParametrosAuxiliar3RubroEstructura, this.gridBagConstraintsRubroEstructura);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEstructura.add(this.jComboBoxTiposAccionesRubroEstructura, this.gridBagConstraintsRubroEstructura);
	
				
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEstructura.add(this.jTextFieldValorCampoGeneralRubroEstructura, this.gridBagConstraintsRubroEstructura);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRubroEstructura = new GridBagLayout();

			this.jScrollPanelDatosRubroEstructura.setLayout(gridaBagLayoutDatosRubroEstructura);
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy = 0;
			this.gridBagConstraintsRubroEstructura.gridx = 0;
			
			this.jScrollPanelDatosRubroEstructura.add(this.jTableDatosRubroEstructura, this.gridBagConstraintsRubroEstructura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRubroEstructura.setViewportView(this.jTableDatosRubroEstructura);
		this.jTableDatosRubroEstructura.setFillsViewportHeight(true);
		this.jTableDatosRubroEstructura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRubroEstructura= new GridBagLayout();
		this.jPanelAccionesRubroEstructura.setLayout(gridaBagLayoutAccionesRubroEstructura);
		
		
		/*	
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx = 0;
			
		this.jPanelAccionesRubroEstructura.add(this.jButtonNuevoRubroEstructura, this.gridBagConstraintsRubroEstructura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEstructuraRubroEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraRubroEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraRubroEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraRubroEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraRubroEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraRubroEstructura.setLayout(gridaBagLayoutFK_IdEstructuraRubroEstructura);

		gridBagConstraintsRubroEstructura = new GridBagConstraints();
		gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEstructura.gridy = 0;
		gridBagConstraintsRubroEstructura.gridx = 0;
		jPanelFK_IdEstructuraRubroEstructura.add(jLabelid_estructuraFK_IdEstructuraRubroEstructura, gridBagConstraintsRubroEstructura);

		gridBagConstraintsRubroEstructura = new GridBagConstraints();
		gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEstructura.gridy = 0;
		gridBagConstraintsRubroEstructura.gridx = 1;
		jPanelFK_IdEstructuraRubroEstructura.add(jComboBoxid_estructuraFK_IdEstructuraRubroEstructura, gridBagConstraintsRubroEstructura);

		gridBagConstraintsRubroEstructura = new GridBagConstraints();
		gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEstructura.gridy = 1;
		gridBagConstraintsRubroEstructura.gridx =1;
		jPanelFK_IdEstructuraRubroEstructura.add(jButtonFK_IdEstructuraRubroEstructura, gridBagConstraintsRubroEstructura);

		jTabbedPaneBusquedasRubroEstructura.addTab("1.-Por Estructura ", jPanelFK_IdEstructuraRubroEstructura);
		jTabbedPaneBusquedasRubroEstructura.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdRubroEmpleaRubroEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdRubroEmpleaRubroEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaRubroEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaRubroEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRubroEmpleaRubroEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRubroEmpleaRubroEstructura.setLayout(gridaBagLayoutFK_IdRubroEmpleaRubroEstructura);

		gridBagConstraintsRubroEstructura = new GridBagConstraints();
		gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEstructura.gridy = 0;
		gridBagConstraintsRubroEstructura.gridx = 0;
		jPanelFK_IdRubroEmpleaRubroEstructura.add(jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEstructura, gridBagConstraintsRubroEstructura);

		gridBagConstraintsRubroEstructura = new GridBagConstraints();
		gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEstructura.gridy = 0;
		gridBagConstraintsRubroEstructura.gridx = 1;
		jPanelFK_IdRubroEmpleaRubroEstructura.add(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura, gridBagConstraintsRubroEstructura);

		gridBagConstraintsRubroEstructura = new GridBagConstraints();
		gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEstructura.gridy = 1;
		gridBagConstraintsRubroEstructura.gridx =1;
		jPanelFK_IdRubroEmpleaRubroEstructura.add(jButtonFK_IdRubroEmpleaRubroEstructura, gridBagConstraintsRubroEstructura);

		jTabbedPaneBusquedasRubroEstructura.addTab("2.-Por Rubro Emplea ", jPanelFK_IdRubroEmpleaRubroEstructura);
		jTabbedPaneBusquedasRubroEstructura.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRubroEstructura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRubroEstructura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();						
			this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEstructura.gridx = 0;		
			//this.gridBagConstraintsRubroEstructura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRubroEstructura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRubroEstructura, this.gridBagConstraintsRubroEstructura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRubroEstructura.gridx = 0;		
		//this.gridBagConstraintsRubroEstructura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRubroEstructura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRubroEstructura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEstructura.gridx = 0;		
			this.gridBagConstraintsRubroEstructura.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRubroEstructura.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRubroEstructura, this.gridBagConstraintsRubroEstructura);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEstructura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRubroEstructura, this.gridBagConstraintsRubroEstructura);								
		
		
		/*
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEstructura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRubroEstructura, this.gridBagConstraintsRubroEstructura);
		*/		
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRubroEstructura.gridx =0;
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRubroEstructura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRubroEstructura, this.gridBagConstraintsRubroEstructura);
				
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEstructura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRubroEstructura, this.gridBagConstraintsRubroEstructura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RubroEstructuraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRubroEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRubroEstructura = new GridBagLayout();
			this.jPanelBusquedasParametrosRubroEstructura.setLayout(gridaBagLayoutBusquedasParametrosRubroEstructura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRubroEstructura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRubroEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRubroEstructura, this.gridBagConstraintsRubroEstructura);
			
			
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRubroEstructura, this.gridBagConstraintsRubroEstructura);
		
			
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRubroEstructura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRubroEstructura, this.gridBagConstraintsRubroEstructura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRubroEstructura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRubroEstructura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRubroEstructura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRubroEstructura.setName("jPanelReporteDinamicoRubroEstructura"); 
		
		this.jPanelReporteDinamicoRubroEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRubroEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRubroEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRubroEstructura.setLayout(gridaBagLayoutReporteDinamicoRubroEstructura);
		
		
		this.jInternalFrameReporteDinamicoRubroEstructura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRubroEstructura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRubroEstructura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRubroEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRubroEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRubroEstructura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRubroEstructura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRubroEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRubroEstructura.setResizable(true);
	    this.jInternalFrameReporteDinamicoRubroEstructura.setClosable(true);
	    this.jInternalFrameReporteDinamicoRubroEstructura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRubroEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRubroEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRubroEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Estructuras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRubroEstructura = new JLabelMe();

		this.jLabelColumnasSelectReporteRubroEstructura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEstructura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRubroEstructura.add(this.jLabelColumnasSelectReporteRubroEstructura, this.gridBagConstraintsRubroEstructura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRubroEstructura = new JList<Reporte>();
		this.jListColumnasSelectReporteRubroEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRubroEstructura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRubroEstructura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRubroEstructura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRubroEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRubroEstructura=new JScrollPane(this.jListColumnasSelectReporteRubroEstructura);
			
			this.jScrollColumnasSelectReporteRubroEstructura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRubroEstructura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRubroEstructura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEstructura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRubroEstructura.add(this.jListColumnasSelectReporteRubroEstructura, this.gridBagConstraintsRubroEstructura);
		this.jPanelReporteDinamicoRubroEstructura.add(this.jScrollColumnasSelectReporteRubroEstructura, this.gridBagConstraintsRubroEstructura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRubroEstructura = new JLabelMe();

		this.jLabelRelacionesSelectReporteRubroEstructura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRubroEstructura = new JList<Reporte>();
		this.jListRelacionesSelectReporteRubroEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRubroEstructura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRubroEstructura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRubroEstructura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRubroEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRubroEstructura=new JScrollPane(this.jListRelacionesSelectReporteRubroEstructura);
			
			this.jScrollRelacionesSelectReporteRubroEstructura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRubroEstructura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRubroEstructura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRubroEstructura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRubroEstructura = new JComboBoxMe();
		this.jListColumnasValoresGraficoRubroEstructura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRubroEstructura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRubroEstructura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRubroEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRubroEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRubroEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRubroEstructura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRubroEstructura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRubroEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRubroEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRubroEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRubroEstructura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRubroEstructura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEstructura.add(this.jLabelGenerarExcelReporteDinamicoRubroEstructura, this.gridBagConstraintsRubroEstructura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRubroEstructura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRubroEstructura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRubroEstructura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRubroEstructura.setToolTipText("Generar EXCEL"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		//this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRubroEstructura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRubroEstructura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRubroEstructura.add(this.jButtonGenerarExcelReporteDinamicoRubroEstructura, this.gridBagConstraintsRubroEstructura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEstructura.add(this.jComboBoxTiposReportesDinamicoRubroEstructura, this.gridBagConstraintsRubroEstructura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRubroEstructura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRubroEstructura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEstructura.add(this.jLabelTiposArchivoReporteDinamicoRubroEstructura, this.gridBagConstraintsRubroEstructura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEstructura.add(this.jComboBoxTiposArchivosReportesDinamicoRubroEstructura, this.gridBagConstraintsRubroEstructura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRubroEstructura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRubroEstructura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRubroEstructura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRubroEstructura.setToolTipText("Generar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEstructura.add(this.jButtonGenerarReporteDinamicoRubroEstructura, this.gridBagConstraintsRubroEstructura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRubroEstructura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRubroEstructura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRubroEstructura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRubroEstructura.setToolTipText("Cancelar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEstructura.add(this.jButtonCerrarReporteDinamicoRubroEstructura, this.gridBagConstraintsRubroEstructura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRubroEstructura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRubroEstructura= new JScrollPane(jPanelReporteDinamicoRubroEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRubroEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRubroEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRubroEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Estructuras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRubroEstructura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRubroEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRubroEstructura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRubroEstructura);
		this.jInternalFrameReporteDinamicoRubroEstructura.getContentPane().add(this.jScrollPanelReporteDinamicoRubroEstructura, this.gridBagConstraintsRubroEstructura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRubroEstructura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRubroEstructura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRubroEstructura.setName("jPanelImportacionRubroEstructura"); 
		
		this.jPanelImportacionRubroEstructura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRubroEstructura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRubroEstructura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRubroEstructura.setLayout(gridaBagLayoutImportacionRubroEstructura);
		
		
		this.jInternalFrameImportacionRubroEstructura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRubroEstructura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRubroEstructura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRubroEstructura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRubroEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRubroEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRubroEstructura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRubroEstructura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRubroEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRubroEstructura.setResizable(true);
	    this.jInternalFrameImportacionRubroEstructura.setClosable(true);
	    this.jInternalFrameImportacionRubroEstructura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRubroEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRubroEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRubroEstructura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRubroEstructura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRubroEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRubroEstructura.setResizable(true);
	    this.jInternalFrameImportacionRubroEstructura.setClosable(true);
	    this.jInternalFrameImportacionRubroEstructura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRubroEstructura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRubroEstructura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRubroEstructura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Estructuras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRubroEstructura = new JLabelMe();

		this.jLabelArchivoImportacionRubroEstructura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYImportacion;		
		this.gridBagConstraintsRubroEstructura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRubroEstructura.add(this.jLabelArchivoImportacionRubroEstructura, this.gridBagConstraintsRubroEstructura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRubroEstructura = new JFileChooser();		
		this.jFileChooserImportacionRubroEstructura.setToolTipText("ESCOGER ARCHIVO"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRubroEstructura = new JButtonMe();
		this.jButtonAbrirImportacionRubroEstructura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRubroEstructura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRubroEstructura.setToolTipText("Generar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEstructura.add(this.jButtonAbrirImportacionRubroEstructura, this.gridBagConstraintsRubroEstructura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRubroEstructura = new JLabelMe();

		this.jLabelPathArchivoImportacionRubroEstructura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYImportacion;		
		this.gridBagConstraintsRubroEstructura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRubroEstructura.add(this.jLabelPathArchivoImportacionRubroEstructura, this.gridBagConstraintsRubroEstructura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRubroEstructura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRubroEstructura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRubroEstructura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRubroEstructura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEstructura.add(this.jTextFieldPathArchivoImportacionRubroEstructura, this.gridBagConstraintsRubroEstructura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRubroEstructura = new JButtonMe();
		this.jButtonGenerarImportacionRubroEstructura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRubroEstructura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRubroEstructura.setToolTipText("Generar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEstructura.add(this.jButtonGenerarImportacionRubroEstructura, this.gridBagConstraintsRubroEstructura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRubroEstructura = new JButtonMe();
		this.jButtonCerrarImportacionRubroEstructura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRubroEstructura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRubroEstructura.setToolTipText("Cancelar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEstructura.add(this.jButtonCerrarImportacionRubroEstructura, this.gridBagConstraintsRubroEstructura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRubroEstructura = new GridBagLayout();
		
		this.jScrollPanelImportacionRubroEstructura= new JScrollPane(jPanelImportacionRubroEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy =iPosYImportacion;
		this.gridBagConstraintsRubroEstructura.gridx =iPosXImportacion;
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRubroEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRubroEstructura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRubroEstructura);
		this.jInternalFrameImportacionRubroEstructura.getContentPane().add(this.jScrollPanelImportacionRubroEstructura, this.gridBagConstraintsRubroEstructura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRubroEstructura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRubroEstructura = new JButtonMe();
			this.jButtonAbrirOrderByRubroEstructura.setText("Orden");
			this.jButtonAbrirOrderByRubroEstructura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRubroEstructura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRubroEstructura";
			inputMap = this.jButtonAbrirOrderByRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRubroEstructura"));
		
		
			GridBagLayout gridaBagLayoutOrderByRubroEstructura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRubroEstructura.setName("jPanelOrderByRubroEstructura"); 
			
			this.jPanelOrderByRubroEstructura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRubroEstructura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRubroEstructura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRubroEstructura.setLayout(gridaBagLayoutOrderByRubroEstructura);
			
			
			this.jTableDatosRubroEstructuraOrderBy = new JTableMe();        
			this.jTableDatosRubroEstructuraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRubroEstructuraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRubroEstructuraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRubroEstructuraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRubroEstructuraOrderBy.setViewportView(this.jTableDatosRubroEstructuraOrderBy);
			this.jTableDatosRubroEstructuraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRubroEstructuraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRubroEstructura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRubroEstructura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRubroEstructura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRubroEstructura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRubroEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRubroEstructura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRubroEstructura.setTitle("Orden");
			this.jInternalFrameOrderByRubroEstructura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRubroEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRubroEstructura.setResizable(true);
			this.jInternalFrameOrderByRubroEstructura.setClosable(true);
			this.jInternalFrameOrderByRubroEstructura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRubroEstructura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRubroEstructura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRubroEstructura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Estructuras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRubroEstructura.gridx =iPosXOrderBy;
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRubroEstructura.ipady =150;
				
			this.jPanelOrderByRubroEstructura.add(jScrollPanelDatosRubroEstructuraOrderBy, this.gridBagConstraintsRubroEstructura);//this.jTableDatosRubroEstructuraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRubroEstructura = new JButtonMe();
			this.jButtonCerrarOrderByRubroEstructura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRubroEstructura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRubroEstructura.setToolTipText("Cancelar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRubroEstructura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRubroEstructura.add(this.jButtonCerrarOrderByRubroEstructura, this.gridBagConstraintsRubroEstructura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRubroEstructura = new GridBagLayout();
			
			this.jScrollPanelOrderByRubroEstructura= new JScrollPane(jPanelOrderByRubroEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.gridy =iPosYOrderBy;
			this.gridBagConstraintsRubroEstructura.gridx =iPosXOrderBy;
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRubroEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRubroEstructura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRubroEstructura);
			
			this.jInternalFrameOrderByRubroEstructura.getContentPane().add(this.jScrollPanelOrderByRubroEstructura, this.gridBagConstraintsRubroEstructura);			
		
		} else {
			this.jButtonAbrirOrderByRubroEstructura = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.rubroestructuraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRubroEstructura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRubroEstructura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRubroEstructura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRubroEstructura.getRowHeight();//RubroEstructuraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RubroEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRubroEstructura.isSelected()) {
					iHeightTable=RubroEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RubroEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RubroEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RubroEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRubroEstructura.isSelected()) {
					iHeightTable=RubroEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RubroEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RubroEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRubroEstructura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRubroEstructura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRubroEstructura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRubroEstructura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRubroEstructura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRubroEstructura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRubroEstructura!=null && this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy()!=null) {
			//if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRubroEstructura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRubroEstructura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRubroEstructura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRubroEstructura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRubroEstructura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRubroEstructura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=rubroestructuraLogic.getRubroEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubroestructuras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RubroEstructura> TraerRubroEstructuraBeans(List<RubroEstructura> rubroestructuras,ArrayList<Classe> classes)throws Exception {
		try {
			for(RubroEstructura rubroestructura:rubroestructuras) {
					
				if(!(RubroEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RubroEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					rubroestructura.setsDetalleGeneralEntityReporte(RubroEstructuraConstantesFunciones.getRubroEstructuraDescripcion(rubroestructura));
										
					rubroestructura.setesta_activo_descripcion(RubroEstructuraConstantesFunciones.getesta_activoDescripcion(rubroestructura));	
					
						
					
				} else  {
							
					//rubroestructura.setsDetalleGeneralEntityReporte(rubroestructura.getsDetalleGeneralEntityReporte());
										
				}
				
				//rubroestructurabeans.add(rubroestructurabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return rubroestructuras;
    }
	//PARA REPORTES FIN
}
