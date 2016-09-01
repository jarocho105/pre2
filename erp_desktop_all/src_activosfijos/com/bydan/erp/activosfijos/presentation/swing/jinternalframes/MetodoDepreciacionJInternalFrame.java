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
import com.bydan.erp.activosfijos.util.MetodoDepreciacionConstantesFunciones;

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
public class MetodoDepreciacionJInternalFrame extends MetodoDepreciacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMetodoDepreciacion;
	
	protected JMenuBar jmenuBarMetodoDepreciacion;
	
	protected JMenu jmenuMetodoDepreciacion;
	protected JMenu jmenuDatosMetodoDepreciacion;
	protected JMenu jmenuArchivoMetodoDepreciacion;
	protected JMenu jmenuAccionesMetodoDepreciacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMetodoDepreciacion;	
	protected GridBagConstraints gridBagConstraintsMetodoDepreciacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MetodoDepreciacionDetalleFormJInternalFrame jInternalFrameDetalleFormMetodoDepreciacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMetodoDepreciacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMetodoDepreciacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public MetodoDepreciacionSessionBean metododepreciacionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public AnioSessionBean anioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MetodoDepreciacion> metododepreciacions;		
	public List<MetodoDepreciacion> metododepreciacionsEliminados;	
	public List<MetodoDepreciacion> metododepreciacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMetodoDepreciacion;		
	protected JButton jButtonAbrirOrderByMetodoDepreciacion;
	
	
	//protected JPanel jPanelOrderByMetodoDepreciacion;
	//public JScrollPane jScrollPanelOrderByMetodoDepreciacion;	
	//protected JButton jButtonCerrarOrderByMetodoDepreciacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MetodoDepreciacionLogic metododepreciacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMetodoDepreciacion;
	public JScrollPane jScrollPanelDatosEdicionMetodoDepreciacion;
	public JScrollPane jScrollPanelDatosGeneralMetodoDepreciacion;
    
	
	
	//public JScrollPane jScrollPanelDatosMetodoDepreciacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMetodoDepreciacion;
	//public JScrollPane jScrollPanelImportacionMetodoDepreciacion;
	
	
	
	protected JPanel jPanelAccionesMetodoDepreciacion;
	
    protected JPanel jPanelPaginacionMetodoDepreciacion;
    protected JPanel jPanelParametrosReportesMetodoDepreciacion;
	protected JPanel jPanelParametrosReportesAccionesMetodoDepreciacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MetodoDepreciacion;
	protected JPanel jPanelParametrosAuxiliar2MetodoDepreciacion;
	protected JPanel jPanelParametrosAuxiliar3MetodoDepreciacion;
	protected JPanel jPanelParametrosAuxiliar4MetodoDepreciacion;
	//protected JPanel jPanelParametrosAuxiliar5MetodoDepreciacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoMetodoDepreciacion;
	//protected JPanel jPanelImportacionMetodoDepreciacion;
	
	
	public JTable jTableDatosMetodoDepreciacion;
	
	
	
	//public JTable jTableDatosMetodoDepreciacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMetodoDepreciacion;
	protected JButton jButtonDuplicarMetodoDepreciacion;
	protected JButton jButtonCopiarMetodoDepreciacion;
	protected JButton jButtonVerFormMetodoDepreciacion;
	protected JButton jButtonNuevoRelacionesMetodoDepreciacion;
	protected JButton jButtonModificarMetodoDepreciacion;
	
    protected JButton jButtonGuardarCambiosTablaMetodoDepreciacion;
	protected JButton jButtonCerrarMetodoDepreciacion;
	
	
	protected JButton jButtonRecargarInformacionMetodoDepreciacion;
	protected JButton jButtonProcesarInformacionMetodoDepreciacion;
	
	
	protected JButton jButtonAnterioresMetodoDepreciacion;
	protected JButton jButtonSiguientesMetodoDepreciacion;
	protected JButton jButtonNuevoGuardarCambiosMetodoDepreciacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMetodoDepreciacion;
	//protected JButton jButtonCerrarReporteDinamicoMetodoDepreciacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoMetodoDepreciacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionMetodoDepreciacion;
	//protected JButton jButtonGenerarImportacionMetodoDepreciacion;
	//protected JButton jButtonCerrarImportacionMetodoDepreciacion;
	//protected JFileChooser jFileChooserImportacionMetodoDepreciacion;
	//protected File fileImportacionMetodoDepreciacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMetodoDepreciacion;
	protected JButton jButtonDuplicarToolBarMetodoDepreciacion;
	protected JButton jButtonNuevoRelacionesToolBarMetodoDepreciacion;
	
	
	public JButton jButtonGuardarCambiosToolBarMetodoDepreciacion;
	protected JButton jButtonCopiarToolBarMetodoDepreciacion;
	protected JButton jButtonVerFormToolBarMetodoDepreciacion;
	public JButton jButtonGuardarCambiosTablaToolBarMetodoDepreciacion;
	protected JButton jButtonMostrarOcultarTablaToolBarMetodoDepreciacion;
	protected JButton jButtonCerrarToolBarMetodoDepreciacion;
	
	protected JButton jButtonRecargarInformacionToolBarMetodoDepreciacion;
	protected JButton jButtonProcesarInformacionToolBarMetodoDepreciacion;
	protected JButton jButtonAnterioresToolBarMetodoDepreciacion;
	protected JButton jButtonSiguientesToolBarMetodoDepreciacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarMetodoDepreciacion;
	protected JButton jButtonAbrirOrderByToolBarMetodoDepreciacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMetodoDepreciacion;
	protected JMenuItem jMenuItemDuplicarMetodoDepreciacion;
	protected JMenuItem jMenuItemNuevoRelacionesMetodoDepreciacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMetodoDepreciacion;
	protected JMenuItem jMenuItemCopiarMetodoDepreciacion;
	protected JMenuItem jMenuItemVerFormMetodoDepreciacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaMetodoDepreciacion;
	protected JMenuItem jMenuItemCerrarMetodoDepreciacion;
	protected JMenuItem jMenuItemDetalleCerrarMetodoDepreciacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMetodoDepreciacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarMetodoDepreciacion;
	
	protected JMenuItem jMenuItemRecargarInformacionMetodoDepreciacion;
	protected JMenuItem jMenuItemProcesarInformacionMetodoDepreciacion;
	protected JMenuItem jMenuItemAnterioresMetodoDepreciacion;
	protected JMenuItem jMenuItemSiguientesMetodoDepreciacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMetodoDepreciacion;
	protected JMenuItem jMenuItemAbrirOrderByMetodoDepreciacion;
	protected JMenuItem jMenuItemMostrarOcultarMetodoDepreciacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMetodoDepreciacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMetodoDepreciacion;
	protected JCheckBox jCheckBoxSeleccionadosMetodoDepreciacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMetodoDepreciacion;
	protected JCheckBox jCheckBoxConGraficoReporteMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMetodoDepreciacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMetodoDepreciacion;
	protected JTextField jTextFieldValorCampoGeneralMetodoDepreciacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMetodoDepreciacion;
	//public JList<Reporte> jListColumnasSelectReporteMetodoDepreciacion;
	//public JScrollPane jScrollColumnasSelectReporteMetodoDepreciacion;
	
	//public JLabel jLabelRelacionesSelectReporteMetodoDepreciacion;
	//public JList<Reporte> jListRelacionesSelectReporteMetodoDepreciacion;
	//public JScrollPane jScrollRelacionesSelectReporteMetodoDepreciacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMetodoDepreciacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMetodoDepreciacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMetodoDepreciacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoMetodoDepreciacion;
	
		
	//public JLabel jLabelArchivoImportacionMetodoDepreciacion;	
	//public JLabel jLabelPathArchivoImportacionMetodoDepreciacion;
	//protected JTextField jTextFieldPathArchivoImportacionMetodoDepreciacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMetodoDepreciacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMetodoDepreciacion;
	
	//public JLabel jLabelColumnaCategoriaValorMetodoDepreciacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMetodoDepreciacion;
	
	//public JLabel jLabelColumnasValoresGraficoMetodoDepreciacion;
	//public JList<Reporte> jListColumnasValoresGraficoMetodoDepreciacion;
	//public JScrollPane jScrollColumnasValoresGraficoMetodoDepreciacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMetodoDepreciacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMetodoDepreciacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMetodoDepreciacion;
	public JPanel jPanelFK_IdAnioMetodoDepreciacion;
	public JButton jButtonFK_IdAnioMetodoDepreciacion;
	public JPanel jPanelFK_IdDetalleActivoFijoMetodoDepreciacion;
	public JButton jButtonFK_IdDetalleActivoFijoMetodoDepreciacion;
	
	public JPanel jPanelid_anioFK_IdAnioMetodoDepreciacion;
	public JLabel jLabelid_anioFK_IdAnioMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioMetodoDepreciacion;
	public JButton jButtonid_anioFK_IdAnioMetodoDepreciacion= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioMetodoDepreciacionUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioMetodoDepreciacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion;
	public JLabel jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion;
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacionUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public MetodoDepreciacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MetodoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MetodoDepreciacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MetodoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MetodoDepreciacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MetodoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MetodoDepreciacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MetodoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMetodoDepreciacion)	{
		this.jButtonRecargarInformacionMetodoDepreciacion = jButtonRecargarInformacionMetodoDepreciacion;
	}
	
	public JButton getjButtonProcesarInformacionMetodoDepreciacion() {
		return this.jButtonProcesarInformacionMetodoDepreciacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMetodoDepreciacion)	{
		this.jButtonProcesarInformacionMetodoDepreciacion = jButtonProcesarInformacionMetodoDepreciacion;
	}
	
	
	public JButton getjButtonRecargarInformacionMetodoDepreciacion() {
		return this.jButtonRecargarInformacionMetodoDepreciacion;
	}
	
	
	public List<MetodoDepreciacion> getmetododepreciacions() {
		return this.metododepreciacions;
	}

	public void setmetododepreciacions(List<MetodoDepreciacion> metododepreciacions) {
		this.metododepreciacions = metododepreciacions;
	}
	
	public List<MetodoDepreciacion> getmetododepreciacionsAux() {
		return this.metododepreciacionsAux;
	}

	public void setmetododepreciacionsAux(List<MetodoDepreciacion> metododepreciacionsAux) {
		this.metododepreciacionsAux = metododepreciacionsAux;
	}
	
	public List<MetodoDepreciacion> getmetododepreciacionsEliminados() {
		return this.metododepreciacionsEliminados;
	}

	public void setMetodoDepreciacionsEliminados(List<MetodoDepreciacion> metododepreciacionsEliminados) {
		this.metododepreciacionsEliminados = metododepreciacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMetodoDepreciacion() {
		return jComboBoxTiposSeleccionarMetodoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMetodoDepreciacion(
			JComboBox jComboBoxTiposSeleccionarMetodoDepreciacion) {
		this.jComboBoxTiposSeleccionarMetodoDepreciacion = jComboBoxTiposSeleccionarMetodoDepreciacion;
	}
	
	public void setBorderResaltarTiposSeleccionarMetodoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMetodoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMetodoDepreciacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMetodoDepreciacion() {
		return jTextFieldValorCampoGeneralMetodoDepreciacion;
	}

	public void setjTextFieldValorCampoGeneralMetodoDepreciacion(
			JTextField jTextFieldValorCampoGeneralMetodoDepreciacion) {
		this.jTextFieldValorCampoGeneralMetodoDepreciacion = jTextFieldValorCampoGeneralMetodoDepreciacion;
	}

	public void setBorderResaltarValorCampoGeneralMetodoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMetodoDepreciacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMetodoDepreciacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMetodoDepreciacion() {
		return this.jCheckBoxSeleccionarTodosMetodoDepreciacion;
	}

	public void setjCheckBoxSeleccionarTodosMetodoDepreciacion(
			JCheckBox jCheckBoxSeleccionarTodosMetodoDepreciacion) {
		this.jCheckBoxSeleccionarTodosMetodoDepreciacion = jCheckBoxSeleccionarTodosMetodoDepreciacion;
	}

	public void setBorderResaltarSeleccionarTodosMetodoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMetodoDepreciacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMetodoDepreciacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMetodoDepreciacion() {
		return this.jCheckBoxSeleccionadosMetodoDepreciacion;
	}

	public void setjCheckBoxSeleccionadosMetodoDepreciacion(
			JCheckBox jCheckBoxSeleccionadosMetodoDepreciacion) {
		this.jCheckBoxSeleccionadosMetodoDepreciacion = jCheckBoxSeleccionadosMetodoDepreciacion;
	}
	
	public void setBorderResaltarSeleccionadosMetodoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMetodoDepreciacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMetodoDepreciacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMetodoDepreciacion() {
		return this.jComboBoxTiposArchivosReportesMetodoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMetodoDepreciacion(
			JComboBox jComboBoxTiposArchivosReportesMetodoDepreciacion) {
		this.jComboBoxTiposArchivosReportesMetodoDepreciacion = jComboBoxTiposArchivosReportesMetodoDepreciacion;
	}

	public void setBorderResaltarTiposArchivosReportesMetodoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMetodoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMetodoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMetodoDepreciacion() {
		return this.jComboBoxTiposReportesMetodoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMetodoDepreciacion(
			JComboBox jComboBoxTiposReportesMetodoDepreciacion) {
		this.jComboBoxTiposReportesMetodoDepreciacion = jComboBoxTiposReportesMetodoDepreciacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMetodoDepreciacion() {
	//	return jComboBoxTiposReportesDinamicoMetodoDepreciacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMetodoDepreciacion(
	//		JComboBox jComboBoxTiposReportesDinamicoMetodoDepreciacion) {
	//	this.jComboBoxTiposReportesDinamicoMetodoDepreciacion = jComboBoxTiposReportesDinamicoMetodoDepreciacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion = jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion;
	//}
	
	public void setBorderResaltarTiposReportesMetodoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMetodoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMetodoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMetodoDepreciacion() {
		return this.jComboBoxTiposGraficosReportesMetodoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMetodoDepreciacion(
			JComboBox jComboBoxTiposGraficosReportesMetodoDepreciacion) {
		this.jComboBoxTiposGraficosReportesMetodoDepreciacion = jComboBoxTiposGraficosReportesMetodoDepreciacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesMetodoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMetodoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMetodoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMetodoDepreciacion() {
		return this.jComboBoxTiposPaginacionMetodoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMetodoDepreciacion(
			JComboBox jComboBoxTiposPaginacionMetodoDepreciacion) {
		this.jComboBoxTiposPaginacionMetodoDepreciacion = jComboBoxTiposPaginacionMetodoDepreciacion;
	}
	
	public void setBorderResaltarTiposPaginacionMetodoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMetodoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMetodoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMetodoDepreciacion() {
		return this.jComboBoxTiposRelacionesMetodoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMetodoDepreciacion() {
		return this.jComboBoxTiposAccionesMetodoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMetodoDepreciacion(
			JComboBox jComboBoxTiposRelacionesMetodoDepreciacion) {
		this.jComboBoxTiposRelacionesMetodoDepreciacion = jComboBoxTiposRelacionesMetodoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMetodoDepreciacion(
			JComboBox jComboBoxTiposAccionesMetodoDepreciacion) {
		this.jComboBoxTiposAccionesMetodoDepreciacion = jComboBoxTiposAccionesMetodoDepreciacion;
	}
	
	public void setBorderResaltarTiposRelacionesMetodoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMetodoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMetodoDepreciacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMetodoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMetodoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMetodoDepreciacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMetodoDepreciacion() {
	//	return jCheckBoxConGraficoDinamicoMetodoDepreciacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoMetodoDepreciacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoMetodoDepreciacion) {
	//	this.jCheckBoxConGraficoDinamicoMetodoDepreciacion = jCheckBoxConGraficoDinamicoMetodoDepreciacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMetodoDepreciacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMetodoDepreciacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMetodoDepreciacion .setBorder(borderResaltar);		
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
		this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
		
		this.metododepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.metododepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.metododepreciacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MetodoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MetodoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MetodoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MetodoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MetodoDepreciacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Metodo Depreciacion MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
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
		
		MetodoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MetodoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMetodoDepreciacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"nuevo","nuevo","Nuevo"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"duplicar","duplicar","Duplicar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"copiar","copiar","Copiar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"ver_form","ver_form","Ver"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"recargar","recargar","Recargar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,
							"cerrar","cerrar","Salir"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMetodoDepreciacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMetodoDepreciacion;
			
				this.jButtonProcesarInformacionToolBarMetodoDepreciacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMetodoDepreciacion;
				
		//protected JButton jButtonModificarToolBarMetodoDepreciacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMetodoDepreciacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMetodoDepreciacion=new JMenuMe("General");
		this.jmenuArchivoMetodoDepreciacion=new JMenuMe("Archivo");
		this.jmenuAccionesMetodoDepreciacion=new JMenuMe("Acciones");
		this.jmenuDatosMetodoDepreciacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMetodoDepreciacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMetodoDepreciacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMetodoDepreciacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMetodoDepreciacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMetodoDepreciacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMetodoDepreciacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMetodoDepreciacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMetodoDepreciacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMetodoDepreciacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMetodoDepreciacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMetodoDepreciacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMetodoDepreciacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMetodoDepreciacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMetodoDepreciacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMetodoDepreciacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMetodoDepreciacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMetodoDepreciacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMetodoDepreciacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMetodoDepreciacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMetodoDepreciacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMetodoDepreciacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMetodoDepreciacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMetodoDepreciacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMetodoDepreciacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMetodoDepreciacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMetodoDepreciacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMetodoDepreciacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMetodoDepreciacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMetodoDepreciacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMetodoDepreciacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMetodoDepreciacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMetodoDepreciacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMetodoDepreciacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMetodoDepreciacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMetodoDepreciacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMetodoDepreciacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMetodoDepreciacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMetodoDepreciacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMetodoDepreciacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMetodoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMetodoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMetodoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMetodoDepreciacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMetodoDepreciacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMetodoDepreciacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMetodoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMetodoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMetodoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMetodoDepreciacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMetodoDepreciacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMetodoDepreciacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMetodoDepreciacion.add(this.jMenuItemCerrarMetodoDepreciacion);
			
			this.jmenuAccionesMetodoDepreciacion.add(this.jMenuItemNuevoMetodoDepreciacion);
			this.jmenuAccionesMetodoDepreciacion.add(this.jMenuItemNuevoGuardarCambiosMetodoDepreciacion);
			this.jmenuAccionesMetodoDepreciacion.add(this.jMenuItemNuevoRelacionesMetodoDepreciacion);
			this.jmenuAccionesMetodoDepreciacion.add(this.jMenuItemGuardarCambiosTablaMetodoDepreciacion);		
			this.jmenuAccionesMetodoDepreciacion.add(this.jMenuItemDuplicarMetodoDepreciacion);		
			this.jmenuAccionesMetodoDepreciacion.add(this.jMenuItemCopiarMetodoDepreciacion);		
			this.jmenuAccionesMetodoDepreciacion.add(this.jMenuItemVerFormMetodoDepreciacion);		
			
			this.jmenuDatosMetodoDepreciacion.add(this.jMenuItemRecargarInformacionMetodoDepreciacion);				
			this.jmenuDatosMetodoDepreciacion.add(this.jMenuItemAnterioresMetodoDepreciacion);				
			this.jmenuDatosMetodoDepreciacion.add(this.jMenuItemSiguientesMetodoDepreciacion);				
			this.jmenuDatosMetodoDepreciacion.add(this.jMenuItemAbrirOrderByMetodoDepreciacion);				
			this.jmenuDatosMetodoDepreciacion.add(this.jMenuItemMostrarOcultarMetodoDepreciacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMetodoDepreciacion.add(this.jMenuItemGuardarCambiosMetodoDepreciacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMetodoDepreciacion.add(this.jmenuArchivoMetodoDepreciacion);		
			this.jmenuBarMetodoDepreciacion.add(this.jmenuAccionesMetodoDepreciacion);		
			this.jmenuBarMetodoDepreciacion.add(this.jmenuDatosMetodoDepreciacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMetodoDepreciacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMetodoDepreciacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioMetodoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioMetodoDepreciacion.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioMetodoDepreciacion= new JButtonMe();
		this.jButtonFK_IdAnioMetodoDepreciacion.setText("Buscar");
		this.jButtonFK_IdAnioMetodoDepreciacion.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioMetodoDepreciacion,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioMetodoDepreciacion = new JLabelMe();
		jLabelid_anioFK_IdAnioMetodoDepreciacion.setText("Anio :");
		jLabelid_anioFK_IdAnioMetodoDepreciacion.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioMetodoDepreciacion= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDetalleActivoFijoMetodoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleActivoFijoMetodoDepreciacion.setToolTipText("Buscar Por Detalle Activo Fijo ");
		this.jButtonFK_IdDetalleActivoFijoMetodoDepreciacion= new JButtonMe();
		this.jButtonFK_IdDetalleActivoFijoMetodoDepreciacion.setText("Buscar");
		this.jButtonFK_IdDetalleActivoFijoMetodoDepreciacion.setToolTipText("Buscar Por Detalle Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleActivoFijoMetodoDepreciacion,"buscar_button","Buscar Por Detalle Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleActivoFijoMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion = new JLabelMe();
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setText("Detalle Activo Fijo :");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setToolTipText("Detalle Activo Fijo");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasMetodoDepreciacion=new JTabbedPane();


		this.jTabbedPaneBusquedasMetodoDepreciacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasMetodoDepreciacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasMetodoDepreciacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMetodoDepreciacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMetodoDepreciacion = new MetodoDepreciacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Metodo Depreciacion DATOS");
			this.jInternalFrameDetalleFormMetodoDepreciacion = new MetodoDepreciacionDetalleFormJInternalFrame(jDesktopPane,this.metododepreciacionSessionBean.getConGuardarRelaciones(),this.metododepreciacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMetodoDepreciacion = null;//new MetodoDepreciacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMetodoDepreciacion= new GridBagLayout();
		
		
		this.jTableDatosMetodoDepreciacion = new JTableMe();      
		
		String sToolTipMetodoDepreciacion="";
		sToolTipMetodoDepreciacion=MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMetodoDepreciacion+="(ActivosFijos.MetodoDepreciacion)";
		}
		
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipMetodoDepreciacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMetodoDepreciacion.setToolTipText(sToolTipMetodoDepreciacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMetodoDepreciacion);
		this.jTableDatosMetodoDepreciacion.setAutoCreateRowSorter(true);
		this.jTableDatosMetodoDepreciacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMetodoDepreciacion.setRowSelectionAllowed(true);
		this.jTableDatosMetodoDepreciacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMetodoDepreciacion = new JButtonMe();
		this.jButtonDuplicarMetodoDepreciacion = new JButtonMe();
		this.jButtonCopiarMetodoDepreciacion = new JButtonMe();
		this.jButtonVerFormMetodoDepreciacion = new JButtonMe();
		this.jButtonNuevoRelacionesMetodoDepreciacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMetodoDepreciacion = new JButtonMe();
		this.jButtonCerrarMetodoDepreciacion = new JButtonMe();
		
		this.jScrollPanelDatosMetodoDepreciacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralMetodoDepreciacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Metodo Depreciacion";
		
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Metodo Depreciaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosMetodoDepreciacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMetodoDepreciacion.setToolTipText("Acciones");
        this.jPanelAccionesMetodoDepreciacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMetodoDepreciacion=new ReporteDinamicoJInternalFrame(MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMetodoDepreciacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMetodoDepreciacion=new ImportacionJInternalFrame(MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMetodoDepreciacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMetodoDepreciacion = new JButtonMe();
		
		this.jButtonAbrirOrderByMetodoDepreciacion.setText("Orden");
		this.jButtonAbrirOrderByMetodoDepreciacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMetodoDepreciacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMetodoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMetodoDepreciacion,false,this);
			
			//this.cargarOrderByMetodoDepreciacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMetodoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMetodoDepreciacion,true,this);
			
			//this.cargarOrderByMetodoDepreciacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMetodoDepreciacion.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosMetodoDepreciacion.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosMetodoDepreciacion.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosMetodoDepreciacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMetodoDepreciacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMetodoDepreciacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMetodoDepreciacion.setText("Nuevo");
		this.jButtonDuplicarMetodoDepreciacion.setText("Duplicar");
		this.jButtonCopiarMetodoDepreciacion.setText("Copiar");
		this.jButtonVerFormMetodoDepreciacion.setText("Ver");
		this.jButtonNuevoRelacionesMetodoDepreciacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMetodoDepreciacion.setText("Guardar");
		this.jButtonCerrarMetodoDepreciacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMetodoDepreciacion,"nuevo_button","Nuevo",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMetodoDepreciacion,"duplicar_button","Duplicar",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMetodoDepreciacion,"copiar_button","Copiar",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMetodoDepreciacion,"ver_form","Ver",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMetodoDepreciacion,"nuevorelaciones_button","Nuevo Rel",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMetodoDepreciacion,"guardarcambiostabla_button","Guardar",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMetodoDepreciacion,"cerrar_button","Salir",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMetodoDepreciacion.setToolTipText("Nuevo"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMetodoDepreciacion.setToolTipText("Duplicar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMetodoDepreciacion.setToolTipText("Copiar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMetodoDepreciacion.setToolTipText("Ver"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMetodoDepreciacion.setToolTipText("Nuevo Rel"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMetodoDepreciacion.setToolTipText("Guardar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMetodoDepreciacion.setToolTipText("Salir"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMetodoDepreciacion";
		inputMap = this.jButtonNuevoMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMetodoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMetodoDepreciacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarMetodoDepreciacion";
		inputMap = this.jButtonDuplicarMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMetodoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMetodoDepreciacion"));
		
		//COPIAR
		sMapKey = "CopiarMetodoDepreciacion";
		inputMap = this.jButtonCopiarMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMetodoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMetodoDepreciacion"));
		
		//VEr FORM
		sMapKey = "VerFormMetodoDepreciacion";
		inputMap = this.jButtonVerFormMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMetodoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMetodoDepreciacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMetodoDepreciacion";
		inputMap = this.jButtonNuevoRelacionesMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMetodoDepreciacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMetodoDepreciacion";
		inputMap = this.jButtonModificarMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMetodoDepreciacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMetodoDepreciacion";
		inputMap = this.jButtonCerrarMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMetodoDepreciacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMetodoDepreciacion";
		inputMap = this.jButtonGuardarCambiosTablaMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMetodoDepreciacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MetodoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MetodoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MetodoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MetodoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MetodoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMetodoDepreciacion.setName("jPanelParametrosReportesMetodoDepreciacion"); 
		
		this.jPanelParametrosReportesAccionesMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMetodoDepreciacion.setName("jPanelParametrosReportesAccionesMetodoDepreciacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMetodoDepreciacion = new JButtonMe();
		this.jButtonRecargarInformacionMetodoDepreciacion.setText("Recargar");
		this.jButtonRecargarInformacionMetodoDepreciacion.setToolTipText("Recargar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMetodoDepreciacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMetodoDepreciacion = new JButtonMe();
		this.jButtonProcesarInformacionMetodoDepreciacion.setText("Procesar");
		this.jButtonProcesarInformacionMetodoDepreciacion.setToolTipText("Procesar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMetodoDepreciacion.setVisible(false);
			
		this.jButtonProcesarInformacionMetodoDepreciacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMetodoDepreciacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMetodoDepreciacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMetodoDepreciacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMetodoDepreciacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMetodoDepreciacion.setText("TIPO");       
		this.jComboBoxTiposReportesMetodoDepreciacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMetodoDepreciacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMetodoDepreciacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMetodoDepreciacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionMetodoDepreciacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMetodoDepreciacion.setText("Accion");
		this.jComboBoxTiposRelacionesMetodoDepreciacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMetodoDepreciacion.setText("Accion");
		this.jComboBoxTiposAccionesMetodoDepreciacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMetodoDepreciacion.setText("Accion");
		this.jComboBoxTiposSeleccionarMetodoDepreciacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMetodoDepreciacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMetodoDepreciacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMetodoDepreciacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMetodoDepreciacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMetodoDepreciacion = new JLabelMe();
		
		this.jLabelAccionesMetodoDepreciacion.setText("Acciones");		
		this.jLabelAccionesMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMetodoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMetodoDepreciacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMetodoDepreciacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMetodoDepreciacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMetodoDepreciacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMetodoDepreciacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMetodoDepreciacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMetodoDepreciacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMetodoDepreciacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMetodoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMetodoDepreciacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteMetodoDepreciacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMetodoDepreciacion = new JButtonMe();
		//this.jButtonAnterioresMetodoDepreciacion.setText("<<");
        this.jButtonAnterioresMetodoDepreciacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMetodoDepreciacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMetodoDepreciacion = new JButtonMe();
		//this.jButtonSiguientesMetodoDepreciacion.setText(">>");
        this.jButtonSiguientesMetodoDepreciacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMetodoDepreciacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMetodoDepreciacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMetodoDepreciacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosMetodoDepreciacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMetodoDepreciacion,"nuevoguardarcambios_button","Nue",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMetodoDepreciacion";
		inputMap = this.jButtonNuevoGuardarCambiosMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMetodoDepreciacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMetodoDepreciacion";
		inputMap = this.jButtonRecargarInformacionMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMetodoDepreciacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMetodoDepreciacion";
		inputMap = this.jButtonSiguientesMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMetodoDepreciacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMetodoDepreciacion";
		inputMap = this.jButtonAnterioresMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMetodoDepreciacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMetodoDepreciacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMetodoDepreciacion.setMinimumSize(new Dimension(this.getWidth(),MetodoDepreciacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MetodoDepreciacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMetodoDepreciacion.setMaximumSize(new Dimension(this.getWidth(),MetodoDepreciacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MetodoDepreciacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMetodoDepreciacion.setPreferredSize(new Dimension(this.getWidth(),MetodoDepreciacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MetodoDepreciacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMetodoDepreciacion = new GridBagLayout();

			this.jPanelPaginacionMetodoDepreciacion.setLayout(gridaBagLayoutPaginacionMetodoDepreciacion);						
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
			this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMetodoDepreciacion.add(this.jButtonAnterioresMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
					
						
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
			
			this.jPanelPaginacionMetodoDepreciacion.add(this.jButtonNuevoGuardarCambiosMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
						
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
			this.jPanelPaginacionMetodoDepreciacion.add(this.jButtonSiguientesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = 1;
			this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMetodoDepreciacion.add(this.jButtonNuevoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
						
			
			
			if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
				this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMetodoDepreciacion.gridy = 1;
				this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMetodoDepreciacion.add(this.jButtonGuardarCambiosTablaMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			}
			
			
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = 1;
			this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMetodoDepreciacion.add(this.jButtonDuplicarMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = 1;
			this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMetodoDepreciacion.add(this.jButtonCopiarMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = 1;
			this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMetodoDepreciacion.add(this.jButtonVerFormMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = 1;
			this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMetodoDepreciacion.add(this.jButtonCerrarMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
		
		
		this.jButtonRecargarInformacionMetodoDepreciacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMetodoDepreciacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMetodoDepreciacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMetodoDepreciacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMetodoDepreciacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMetodoDepreciacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMetodoDepreciacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMetodoDepreciacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMetodoDepreciacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMetodoDepreciacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMetodoDepreciacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMetodoDepreciacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMetodoDepreciacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMetodoDepreciacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMetodoDepreciacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMetodoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMetodoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMetodoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMetodoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMetodoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMetodoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMetodoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMetodoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMetodoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMetodoDepreciacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMetodoDepreciacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMetodoDepreciacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMetodoDepreciacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMetodoDepreciacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMetodoDepreciacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMetodoDepreciacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMetodoDepreciacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMetodoDepreciacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMetodoDepreciacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMetodoDepreciacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMetodoDepreciacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMetodoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMetodoDepreciacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MetodoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MetodoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MetodoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MetodoDepreciacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMetodoDepreciacion.setLayout(gridaBagParametrosReportesMetodoDepreciacion);
			this.jPanelParametrosReportesAccionesMetodoDepreciacion.setLayout(gridaBagParametrosReportesAccionesMetodoDepreciacion);
			
			
			this.jPanelParametrosAuxiliar1MetodoDepreciacion.setLayout(gridaBagParametrosAuxiliar1MetodoDepreciacion);
			this.jPanelParametrosAuxiliar2MetodoDepreciacion.setLayout(gridaBagParametrosAuxiliar2MetodoDepreciacion);
			this.jPanelParametrosAuxiliar3MetodoDepreciacion.setLayout(gridaBagParametrosAuxiliar3MetodoDepreciacion);
			this.jPanelParametrosAuxiliar4MetodoDepreciacion.setLayout(gridaBagParametrosAuxiliar4MetodoDepreciacion);
			//this.jPanelParametrosAuxiliar5MetodoDepreciacion.setLayout(gridaBagParametrosAuxiliar2MetodoDepreciacion);			
			
			
			
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jButtonRecargarInformacionMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MetodoDepreciacion.add(this.jComboBoxTiposPaginacionMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MetodoDepreciacion.add(this.jCheckBoxConAltoMaximoTablaMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MetodoDepreciacion.add(this.jComboBoxTiposArchivosReportesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jPanelParametrosAuxiliar1MetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMetodoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MetodoDepreciacion.add(this.jComboBoxTiposReportesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);																		
			
			
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMetodoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4MetodoDepreciacion.add(this.jComboBoxTiposGraficosReportesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jPanelParametrosAuxiliar4MetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jComboBoxTiposReportesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jCheckBoxGenerarReporteMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jPanelParametrosAuxiliar2MetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMetodoDepreciacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jLabelAccionesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
				this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMetodoDepreciacion.add(this.jButtonAbrirOrderByMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jComboBoxTiposSeleccionarMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);			
			
			
			/*
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMetodoDepreciacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jCheckBoxSeleccionarTodosMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMetodoDepreciacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jCheckBoxConGraficoReporteMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMetodoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MetodoDepreciacion.add(this.jCheckBoxSeleccionarTodosMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);															
				
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMetodoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MetodoDepreciacion.add(this.jCheckBoxSeleccionadosMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);															
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMetodoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MetodoDepreciacion.add(this.jCheckBoxConGraficoReporteMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jPanelParametrosAuxiliar3MetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jComboBoxTiposAccionesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
	
				
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMetodoDepreciacion.add(this.jTextFieldValorCampoGeneralMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMetodoDepreciacion = new GridBagLayout();

			this.jScrollPanelDatosMetodoDepreciacion.setLayout(gridaBagLayoutDatosMetodoDepreciacion);
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
			this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
			
			this.jScrollPanelDatosMetodoDepreciacion.add(this.jTableDatosMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMetodoDepreciacion.setViewportView(this.jTableDatosMetodoDepreciacion);
		this.jTableDatosMetodoDepreciacion.setFillsViewportHeight(true);
		this.jTableDatosMetodoDepreciacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMetodoDepreciacion= new GridBagLayout();
		this.jPanelAccionesMetodoDepreciacion.setLayout(gridaBagLayoutAccionesMetodoDepreciacion);
		
		
		/*	
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
			
		this.jPanelAccionesMetodoDepreciacion.add(this.jButtonNuevoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioMetodoDepreciacion= new GridBagLayout();
		gridaBagLayoutFK_IdAnioMetodoDepreciacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioMetodoDepreciacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioMetodoDepreciacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioMetodoDepreciacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioMetodoDepreciacion.setLayout(gridaBagLayoutFK_IdAnioMetodoDepreciacion);

		gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMetodoDepreciacion.gridy = 0;
		gridBagConstraintsMetodoDepreciacion.gridx = 0;
		jPanelFK_IdAnioMetodoDepreciacion.add(jLabelid_anioFK_IdAnioMetodoDepreciacion, gridBagConstraintsMetodoDepreciacion);

		gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMetodoDepreciacion.gridy = 0;
		gridBagConstraintsMetodoDepreciacion.gridx = 1;
		jPanelFK_IdAnioMetodoDepreciacion.add(jComboBoxid_anioFK_IdAnioMetodoDepreciacion, gridBagConstraintsMetodoDepreciacion);

		gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMetodoDepreciacion.gridy = 1;
		gridBagConstraintsMetodoDepreciacion.gridx =1;
		jPanelFK_IdAnioMetodoDepreciacion.add(jButtonFK_IdAnioMetodoDepreciacion, gridBagConstraintsMetodoDepreciacion);

		jTabbedPaneBusquedasMetodoDepreciacion.addTab("1.-Por Anio ", jPanelFK_IdAnioMetodoDepreciacion);
		jTabbedPaneBusquedasMetodoDepreciacion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDetalleActivoFijoMetodoDepreciacion= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleActivoFijoMetodoDepreciacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoMetodoDepreciacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoMetodoDepreciacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleActivoFijoMetodoDepreciacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleActivoFijoMetodoDepreciacion.setLayout(gridaBagLayoutFK_IdDetalleActivoFijoMetodoDepreciacion);

		gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMetodoDepreciacion.gridy = 0;
		gridBagConstraintsMetodoDepreciacion.gridx = 0;
		jPanelFK_IdDetalleActivoFijoMetodoDepreciacion.add(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion, gridBagConstraintsMetodoDepreciacion);

		gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMetodoDepreciacion.gridy = 0;
		gridBagConstraintsMetodoDepreciacion.gridx = 1;
		jPanelFK_IdDetalleActivoFijoMetodoDepreciacion.add(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion, gridBagConstraintsMetodoDepreciacion);

		gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMetodoDepreciacion.gridy = 1;
		gridBagConstraintsMetodoDepreciacion.gridx =1;
		jPanelFK_IdDetalleActivoFijoMetodoDepreciacion.add(jButtonFK_IdDetalleActivoFijoMetodoDepreciacion, gridBagConstraintsMetodoDepreciacion);

		jTabbedPaneBusquedasMetodoDepreciacion.addTab("2.-Por Detalle Activo Fijo ", jPanelFK_IdDetalleActivoFijoMetodoDepreciacion);
		jTabbedPaneBusquedasMetodoDepreciacion.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMetodoDepreciacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMetodoDepreciacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();						
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMetodoDepreciacion.gridx = 0;		
			//this.gridBagConstraintsMetodoDepreciacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMetodoDepreciacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 0;		
		//this.gridBagConstraintsMetodoDepreciacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMetodoDepreciacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMetodoDepreciacion.gridx = 0;		
			this.gridBagConstraintsMetodoDepreciacion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMetodoDepreciacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);								
		
		
		/*
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		*/		
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMetodoDepreciacion.gridx =0;
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMetodoDepreciacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
				
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MetodoDepreciacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMetodoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMetodoDepreciacion = new GridBagLayout();
			this.jPanelBusquedasParametrosMetodoDepreciacion.setLayout(gridaBagLayoutBusquedasParametrosMetodoDepreciacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMetodoDepreciacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMetodoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMetodoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMetodoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			
			
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
			
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMetodoDepreciacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMetodoDepreciacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMetodoDepreciacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMetodoDepreciacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMetodoDepreciacion.setName("jPanelReporteDinamicoMetodoDepreciacion"); 
		
		this.jPanelReporteDinamicoMetodoDepreciacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMetodoDepreciacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMetodoDepreciacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMetodoDepreciacion.setLayout(gridaBagLayoutReporteDinamicoMetodoDepreciacion);
		
		
		this.jInternalFrameReporteDinamicoMetodoDepreciacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMetodoDepreciacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMetodoDepreciacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMetodoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMetodoDepreciacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMetodoDepreciacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMetodoDepreciacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMetodoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMetodoDepreciacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoMetodoDepreciacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoMetodoDepreciacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMetodoDepreciacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMetodoDepreciacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMetodoDepreciacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Metodo Depreciaciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMetodoDepreciacion = new JLabelMe();

		this.jLabelColumnasSelectReporteMetodoDepreciacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jLabelColumnasSelectReporteMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMetodoDepreciacion = new JList<Reporte>();
		this.jListColumnasSelectReporteMetodoDepreciacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMetodoDepreciacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMetodoDepreciacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMetodoDepreciacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMetodoDepreciacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMetodoDepreciacion=new JScrollPane(this.jListColumnasSelectReporteMetodoDepreciacion);
			
			this.jScrollColumnasSelectReporteMetodoDepreciacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMetodoDepreciacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMetodoDepreciacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jListColumnasSelectReporteMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jScrollColumnasSelectReporteMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMetodoDepreciacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteMetodoDepreciacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMetodoDepreciacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteMetodoDepreciacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMetodoDepreciacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMetodoDepreciacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMetodoDepreciacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMetodoDepreciacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMetodoDepreciacion=new JScrollPane(this.jListRelacionesSelectReporteMetodoDepreciacion);
			
			this.jScrollRelacionesSelectReporteMetodoDepreciacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMetodoDepreciacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMetodoDepreciacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMetodoDepreciacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMetodoDepreciacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoMetodoDepreciacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMetodoDepreciacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMetodoDepreciacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMetodoDepreciacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMetodoDepreciacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMetodoDepreciacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoMetodoDepreciacion = new JLabelMe();

		this.jLabelConGraficoDinamicoMetodoDepreciacion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jLabelConGraficoDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoMetodoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoMetodoDepreciacion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoMetodoDepreciacion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoMetodoDepreciacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMetodoDepreciacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMetodoDepreciacion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jCheckBoxConGraficoDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoMetodoDepreciacion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoMetodoDepreciacion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jLabelColumnaCategoriaGraficoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMetodoDepreciacion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoMetodoDepreciacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoMetodoDepreciacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMetodoDepreciacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMetodoDepreciacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jComboBoxColumnaCategoriaGraficoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorMetodoDepreciacion = new JLabelMe();

		this.jLabelColumnaCategoriaValorMetodoDepreciacion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jLabelColumnaCategoriaValorMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorMetodoDepreciacion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorMetodoDepreciacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorMetodoDepreciacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMetodoDepreciacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMetodoDepreciacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jComboBoxColumnaCategoriaValorMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoMetodoDepreciacion = new JLabelMe();

		this.jLabelColumnasValoresGraficoMetodoDepreciacion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jLabelColumnasValoresGraficoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoMetodoDepreciacion = new JList<Reporte>();
		this.jListColumnasValoresGraficoMetodoDepreciacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoMetodoDepreciacion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoMetodoDepreciacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMetodoDepreciacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMetodoDepreciacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoMetodoDepreciacion=new JScrollPane(this.jListColumnasValoresGraficoMetodoDepreciacion);
			
			this.jScrollColumnasValoresGraficoMetodoDepreciacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMetodoDepreciacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMetodoDepreciacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jListColumnasSelectReporteMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jScrollColumnasValoresGraficoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoMetodoDepreciacion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoMetodoDepreciacion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jLabelTiposGraficosReportesDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMetodoDepreciacion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoMetodoDepreciacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoMetodoDepreciacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMetodoDepreciacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMetodoDepreciacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jComboBoxTiposGraficosReportesDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMetodoDepreciacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMetodoDepreciacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jLabelGenerarExcelReporteDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMetodoDepreciacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMetodoDepreciacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMetodoDepreciacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMetodoDepreciacion.setToolTipText("Generar EXCEL"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jButtonGenerarExcelReporteDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jComboBoxTiposReportesDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMetodoDepreciacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMetodoDepreciacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jLabelTiposArchivoReporteDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jComboBoxTiposArchivosReportesDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMetodoDepreciacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMetodoDepreciacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMetodoDepreciacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMetodoDepreciacion.setToolTipText("Generar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jButtonGenerarReporteDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMetodoDepreciacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMetodoDepreciacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMetodoDepreciacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMetodoDepreciacion.setToolTipText("Cancelar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMetodoDepreciacion.add(this.jButtonCerrarReporteDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMetodoDepreciacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMetodoDepreciacion= new JScrollPane(jPanelReporteDinamicoMetodoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMetodoDepreciacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMetodoDepreciacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMetodoDepreciacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Metodo Depreciaciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMetodoDepreciacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMetodoDepreciacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMetodoDepreciacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMetodoDepreciacion);
		this.jInternalFrameReporteDinamicoMetodoDepreciacion.getContentPane().add(this.jScrollPanelReporteDinamicoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMetodoDepreciacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMetodoDepreciacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMetodoDepreciacion.setName("jPanelImportacionMetodoDepreciacion"); 
		
		this.jPanelImportacionMetodoDepreciacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMetodoDepreciacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMetodoDepreciacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMetodoDepreciacion.setLayout(gridaBagLayoutImportacionMetodoDepreciacion);
		
		
		this.jInternalFrameImportacionMetodoDepreciacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMetodoDepreciacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMetodoDepreciacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMetodoDepreciacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMetodoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMetodoDepreciacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMetodoDepreciacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMetodoDepreciacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMetodoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMetodoDepreciacion.setResizable(true);
	    this.jInternalFrameImportacionMetodoDepreciacion.setClosable(true);
	    this.jInternalFrameImportacionMetodoDepreciacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMetodoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMetodoDepreciacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMetodoDepreciacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMetodoDepreciacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMetodoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMetodoDepreciacion.setResizable(true);
	    this.jInternalFrameImportacionMetodoDepreciacion.setClosable(true);
	    this.jInternalFrameImportacionMetodoDepreciacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMetodoDepreciacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMetodoDepreciacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMetodoDepreciacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Metodo Depreciaciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMetodoDepreciacion = new JLabelMe();

		this.jLabelArchivoImportacionMetodoDepreciacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMetodoDepreciacion.add(this.jLabelArchivoImportacionMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMetodoDepreciacion = new JFileChooser();		
		this.jFileChooserImportacionMetodoDepreciacion.setToolTipText("ESCOGER ARCHIVO"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMetodoDepreciacion = new JButtonMe();
		this.jButtonAbrirImportacionMetodoDepreciacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMetodoDepreciacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMetodoDepreciacion.setToolTipText("Generar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMetodoDepreciacion.add(this.jButtonAbrirImportacionMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMetodoDepreciacion = new JLabelMe();

		this.jLabelPathArchivoImportacionMetodoDepreciacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMetodoDepreciacion.add(this.jLabelPathArchivoImportacionMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMetodoDepreciacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMetodoDepreciacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMetodoDepreciacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMetodoDepreciacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMetodoDepreciacion.add(this.jTextFieldPathArchivoImportacionMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMetodoDepreciacion = new JButtonMe();
		this.jButtonGenerarImportacionMetodoDepreciacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMetodoDepreciacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMetodoDepreciacion.setToolTipText("Generar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMetodoDepreciacion.add(this.jButtonGenerarImportacionMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMetodoDepreciacion = new JButtonMe();
		this.jButtonCerrarImportacionMetodoDepreciacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMetodoDepreciacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMetodoDepreciacion.setToolTipText("Cancelar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMetodoDepreciacion.add(this.jButtonCerrarImportacionMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMetodoDepreciacion = new GridBagLayout();
		
		this.jScrollPanelImportacionMetodoDepreciacion= new JScrollPane(jPanelImportacionMetodoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy =iPosYImportacion;
		this.gridBagConstraintsMetodoDepreciacion.gridx =iPosXImportacion;
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMetodoDepreciacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMetodoDepreciacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMetodoDepreciacion);
		this.jInternalFrameImportacionMetodoDepreciacion.getContentPane().add(this.jScrollPanelImportacionMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMetodoDepreciacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMetodoDepreciacion = new JButtonMe();
			this.jButtonAbrirOrderByMetodoDepreciacion.setText("Orden");
			this.jButtonAbrirOrderByMetodoDepreciacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMetodoDepreciacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMetodoDepreciacion";
			inputMap = this.jButtonAbrirOrderByMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMetodoDepreciacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByMetodoDepreciacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMetodoDepreciacion.setName("jPanelOrderByMetodoDepreciacion"); 
			
			this.jPanelOrderByMetodoDepreciacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMetodoDepreciacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMetodoDepreciacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMetodoDepreciacion.setLayout(gridaBagLayoutOrderByMetodoDepreciacion);
			
			
			this.jTableDatosMetodoDepreciacionOrderBy = new JTableMe();        
			this.jTableDatosMetodoDepreciacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMetodoDepreciacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMetodoDepreciacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMetodoDepreciacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMetodoDepreciacionOrderBy.setViewportView(this.jTableDatosMetodoDepreciacionOrderBy);
			this.jTableDatosMetodoDepreciacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMetodoDepreciacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMetodoDepreciacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMetodoDepreciacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMetodoDepreciacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMetodoDepreciacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMetodoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMetodoDepreciacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMetodoDepreciacion.setTitle("Orden");
			this.jInternalFrameOrderByMetodoDepreciacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMetodoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMetodoDepreciacion.setResizable(true);
			this.jInternalFrameOrderByMetodoDepreciacion.setClosable(true);
			this.jInternalFrameOrderByMetodoDepreciacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMetodoDepreciacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMetodoDepreciacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMetodoDepreciacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Metodo Depreciaciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMetodoDepreciacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMetodoDepreciacion.ipady =150;
				
			this.jPanelOrderByMetodoDepreciacion.add(jScrollPanelDatosMetodoDepreciacionOrderBy, this.gridBagConstraintsMetodoDepreciacion);//this.jTableDatosMetodoDepreciacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMetodoDepreciacion = new JButtonMe();
			this.jButtonCerrarOrderByMetodoDepreciacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMetodoDepreciacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMetodoDepreciacion.setToolTipText("Cancelar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMetodoDepreciacion.add(this.jButtonCerrarOrderByMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMetodoDepreciacion = new GridBagLayout();
			
			this.jScrollPanelOrderByMetodoDepreciacion= new JScrollPane(jPanelOrderByMetodoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsMetodoDepreciacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMetodoDepreciacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMetodoDepreciacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMetodoDepreciacion);
			
			this.jInternalFrameOrderByMetodoDepreciacion.getContentPane().add(this.jScrollPanelOrderByMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);			
		
		} else {
			this.jButtonAbrirOrderByMetodoDepreciacion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.metododepreciacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMetodoDepreciacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMetodoDepreciacion.getRowHeight();//MetodoDepreciacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MetodoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMetodoDepreciacion.isSelected()) {
					iHeightTable=MetodoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MetodoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MetodoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MetodoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMetodoDepreciacion.isSelected()) {
					iHeightTable=MetodoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MetodoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MetodoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMetodoDepreciacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMetodoDepreciacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMetodoDepreciacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMetodoDepreciacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMetodoDepreciacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMetodoDepreciacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMetodoDepreciacion!=null && this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy()!=null) {
			//if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMetodoDepreciacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMetodoDepreciacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMetodoDepreciacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMetodoDepreciacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMetodoDepreciacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMetodoDepreciacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=metododepreciacionLogic.getMetodoDepreciacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=metododepreciacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MetodoDepreciacion> TraerMetodoDepreciacionBeans(List<MetodoDepreciacion> metododepreciacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(MetodoDepreciacion metododepreciacion:metododepreciacions) {
					
				if(!(MetodoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MetodoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					metododepreciacion.setsDetalleGeneralEntityReporte(MetodoDepreciacionConstantesFunciones.getMetodoDepreciacionDescripcion(metododepreciacion));
										
						
					
						
					
				} else  {
							
					//metododepreciacion.setsDetalleGeneralEntityReporte(metododepreciacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//metododepreciacionbeans.add(metododepreciacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return metododepreciacions;
    }
	//PARA REPORTES FIN
}
