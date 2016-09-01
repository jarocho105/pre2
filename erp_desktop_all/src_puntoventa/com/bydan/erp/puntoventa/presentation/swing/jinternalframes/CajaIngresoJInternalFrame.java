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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.CajaIngresoConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class CajaIngresoJInternalFrame extends CajaIngresoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCajaIngreso;
	
	protected JMenuBar jmenuBarCajaIngreso;
	
	protected JMenu jmenuCajaIngreso;
	protected JMenu jmenuDatosCajaIngreso;
	protected JMenu jmenuArchivoCajaIngreso;
	protected JMenu jmenuAccionesCajaIngreso;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaIngreso;	
	protected GridBagConstraints gridBagConstraintsCajaIngreso;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CajaIngresoDetalleFormJInternalFrame jInternalFrameDetalleFormCajaIngreso;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCajaIngreso;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCajaIngreso;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected TurnoPunVenBeanSwingJInternalFrame turnopunvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_turnopunven="";
	
	public CajaIngresoSessionBean cajaingresoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public CajaSessionBean cajaSessionBean;
	public TurnoPunVenSessionBean turnopunvenSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CajaIngreso> cajaingresos;		
	public List<CajaIngreso> cajaingresosEliminados;	
	public List<CajaIngreso> cajaingresosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCajaIngreso;		
	protected JButton jButtonAbrirOrderByCajaIngreso;
	
	
	//protected JPanel jPanelOrderByCajaIngreso;
	//public JScrollPane jScrollPanelOrderByCajaIngreso;	
	//protected JButton jButtonCerrarOrderByCajaIngreso;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CajaIngresoLogic cajaingresoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCajaIngreso;
	public JScrollPane jScrollPanelDatosEdicionCajaIngreso;
	public JScrollPane jScrollPanelDatosGeneralCajaIngreso;
    
	
	
	//public JScrollPane jScrollPanelDatosCajaIngresoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCajaIngreso;
	//public JScrollPane jScrollPanelImportacionCajaIngreso;
	
	
	
	protected JPanel jPanelAccionesCajaIngreso;
	
    protected JPanel jPanelPaginacionCajaIngreso;
    protected JPanel jPanelParametrosReportesCajaIngreso;
	protected JPanel jPanelParametrosReportesAccionesCajaIngreso;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CajaIngreso;
	protected JPanel jPanelParametrosAuxiliar2CajaIngreso;
	protected JPanel jPanelParametrosAuxiliar3CajaIngreso;
	protected JPanel jPanelParametrosAuxiliar4CajaIngreso;
	//protected JPanel jPanelParametrosAuxiliar5CajaIngreso;
	
	
	
	//protected JPanel jPanelReporteDinamicoCajaIngreso;
	//protected JPanel jPanelImportacionCajaIngreso;
	
	
	public JTable jTableDatosCajaIngreso;
	
	
	
	//public JTable jTableDatosCajaIngresoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCajaIngreso;
	protected JButton jButtonDuplicarCajaIngreso;
	protected JButton jButtonCopiarCajaIngreso;
	protected JButton jButtonVerFormCajaIngreso;
	protected JButton jButtonNuevoRelacionesCajaIngreso;
	protected JButton jButtonModificarCajaIngreso;
	
    protected JButton jButtonGuardarCambiosTablaCajaIngreso;
	protected JButton jButtonCerrarCajaIngreso;
	
	
	protected JButton jButtonRecargarInformacionCajaIngreso;
	protected JButton jButtonProcesarInformacionCajaIngreso;
	
	
	protected JButton jButtonAnterioresCajaIngreso;
	protected JButton jButtonSiguientesCajaIngreso;
	protected JButton jButtonNuevoGuardarCambiosCajaIngreso;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCajaIngreso;
	//protected JButton jButtonCerrarReporteDinamicoCajaIngreso;
	//protected JButton jButtonGenerarExcelReporteDinamicoCajaIngreso;	
	
	
	
	//protected JButton jButtonAbrirImportacionCajaIngreso;
	//protected JButton jButtonGenerarImportacionCajaIngreso;
	//protected JButton jButtonCerrarImportacionCajaIngreso;
	//protected JFileChooser jFileChooserImportacionCajaIngreso;
	//protected File fileImportacionCajaIngreso;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaIngreso;
	protected JButton jButtonDuplicarToolBarCajaIngreso;
	protected JButton jButtonNuevoRelacionesToolBarCajaIngreso;
	
	
	public JButton jButtonGuardarCambiosToolBarCajaIngreso;
	protected JButton jButtonCopiarToolBarCajaIngreso;
	protected JButton jButtonVerFormToolBarCajaIngreso;
	public JButton jButtonGuardarCambiosTablaToolBarCajaIngreso;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaIngreso;
	protected JButton jButtonCerrarToolBarCajaIngreso;
	
	protected JButton jButtonRecargarInformacionToolBarCajaIngreso;
	protected JButton jButtonProcesarInformacionToolBarCajaIngreso;
	protected JButton jButtonAnterioresToolBarCajaIngreso;
	protected JButton jButtonSiguientesToolBarCajaIngreso;
	protected JButton jButtonNuevoGuardarCambiosToolBarCajaIngreso;
	protected JButton jButtonAbrirOrderByToolBarCajaIngreso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaIngreso;
	protected JMenuItem jMenuItemDuplicarCajaIngreso;
	protected JMenuItem jMenuItemNuevoRelacionesCajaIngreso;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCajaIngreso;
	protected JMenuItem jMenuItemCopiarCajaIngreso;
	protected JMenuItem jMenuItemVerFormCajaIngreso;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaIngreso;
	protected JMenuItem jMenuItemCerrarCajaIngreso;
	protected JMenuItem jMenuItemDetalleCerrarCajaIngreso;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCajaIngreso;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaIngreso;
	
	protected JMenuItem jMenuItemRecargarInformacionCajaIngreso;
	protected JMenuItem jMenuItemProcesarInformacionCajaIngreso;
	protected JMenuItem jMenuItemAnterioresCajaIngreso;
	protected JMenuItem jMenuItemSiguientesCajaIngreso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaIngreso;
	protected JMenuItem jMenuItemAbrirOrderByCajaIngreso;
	protected JMenuItem jMenuItemMostrarOcultarCajaIngreso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaIngreso;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCajaIngreso;
	protected JCheckBox jCheckBoxSeleccionadosCajaIngreso;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCajaIngreso;
	protected JCheckBox jCheckBoxConGraficoReporteCajaIngreso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCajaIngreso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCajaIngreso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCajaIngreso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCajaIngreso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCajaIngreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCajaIngreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaIngreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaIngreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCajaIngreso;
	protected JTextField jTextFieldValorCampoGeneralCajaIngreso;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCajaIngreso;
	//public JList<Reporte> jListColumnasSelectReporteCajaIngreso;
	//public JScrollPane jScrollColumnasSelectReporteCajaIngreso;
	
	//public JLabel jLabelRelacionesSelectReporteCajaIngreso;
	//public JList<Reporte> jListRelacionesSelectReporteCajaIngreso;
	//public JScrollPane jScrollRelacionesSelectReporteCajaIngreso;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCajaIngreso;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCajaIngreso;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCajaIngreso;
	//public JLabel jLabelTiposArchivoReporteDinamicoCajaIngreso;
	
		
	//public JLabel jLabelArchivoImportacionCajaIngreso;	
	//public JLabel jLabelPathArchivoImportacionCajaIngreso;
	//protected JTextField jTextFieldPathArchivoImportacionCajaIngreso;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCajaIngreso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCajaIngreso;
	
	//public JLabel jLabelColumnaCategoriaValorCajaIngreso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCajaIngreso;
	
	//public JLabel jLabelColumnasValoresGraficoCajaIngreso;
	//public JList<Reporte> jListColumnasValoresGraficoCajaIngreso;
	//public JScrollPane jScrollColumnasValoresGraficoCajaIngreso;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCajaIngreso;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCajaIngreso;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCajaIngreso;
	public JPanel jPanelFK_IdCajaCajaIngreso;
	public JButton jButtonFK_IdCajaCajaIngreso;
	public JPanel jPanelFK_IdTurnoPunVenCajaIngreso;
	public JButton jButtonFK_IdTurnoPunVenCajaIngreso;
	
	public JPanel jPanelid_cajaFK_IdCajaCajaIngreso;
	public JLabel jLabelid_cajaFK_IdCajaCajaIngreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaFK_IdCajaCajaIngreso;
	public JButton jButtonid_cajaFK_IdCajaCajaIngreso= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaCajaIngresoUpdate= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaCajaIngresoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_turno_pun_venFK_IdTurnoPunVenCajaIngreso;
	public JLabel jLabelid_turno_pun_venFK_IdTurnoPunVenCajaIngreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso;
	public JButton jButtonid_turno_pun_venFK_IdTurnoPunVenCajaIngreso= new JButtonMe();
	public JButton jButtonid_turno_pun_venFK_IdTurnoPunVenCajaIngresoUpdate= new JButtonMe();
	public JButton jButtonid_turno_pun_venFK_IdTurnoPunVenCajaIngresoBusqueda= new JButtonMe();

	
	
	
	
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
	public CajaIngresoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CajaIngreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaIngreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaIngreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaIngreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCajaIngreso)	{
		this.jButtonRecargarInformacionCajaIngreso = jButtonRecargarInformacionCajaIngreso;
	}
	
	public JButton getjButtonProcesarInformacionCajaIngreso() {
		return this.jButtonProcesarInformacionCajaIngreso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaIngreso)	{
		this.jButtonProcesarInformacionCajaIngreso = jButtonProcesarInformacionCajaIngreso;
	}
	
	
	public JButton getjButtonRecargarInformacionCajaIngreso() {
		return this.jButtonRecargarInformacionCajaIngreso;
	}
	
	
	public List<CajaIngreso> getcajaingresos() {
		return this.cajaingresos;
	}

	public void setcajaingresos(List<CajaIngreso> cajaingresos) {
		this.cajaingresos = cajaingresos;
	}
	
	public List<CajaIngreso> getcajaingresosAux() {
		return this.cajaingresosAux;
	}

	public void setcajaingresosAux(List<CajaIngreso> cajaingresosAux) {
		this.cajaingresosAux = cajaingresosAux;
	}
	
	public List<CajaIngreso> getcajaingresosEliminados() {
		return this.cajaingresosEliminados;
	}

	public void setCajaIngresosEliminados(List<CajaIngreso> cajaingresosEliminados) {
		this.cajaingresosEliminados = cajaingresosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCajaIngreso() {
		return jComboBoxTiposSeleccionarCajaIngreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCajaIngreso(
			JComboBox jComboBoxTiposSeleccionarCajaIngreso) {
		this.jComboBoxTiposSeleccionarCajaIngreso = jComboBoxTiposSeleccionarCajaIngreso;
	}
	
	public void setBorderResaltarTiposSeleccionarCajaIngreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCajaIngreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCajaIngreso .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCajaIngreso() {
		return jTextFieldValorCampoGeneralCajaIngreso;
	}

	public void setjTextFieldValorCampoGeneralCajaIngreso(
			JTextField jTextFieldValorCampoGeneralCajaIngreso) {
		this.jTextFieldValorCampoGeneralCajaIngreso = jTextFieldValorCampoGeneralCajaIngreso;
	}

	public void setBorderResaltarValorCampoGeneralCajaIngreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngreso.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCajaIngreso .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCajaIngreso() {
		return this.jCheckBoxSeleccionarTodosCajaIngreso;
	}

	public void setjCheckBoxSeleccionarTodosCajaIngreso(
			JCheckBox jCheckBoxSeleccionarTodosCajaIngreso) {
		this.jCheckBoxSeleccionarTodosCajaIngreso = jCheckBoxSeleccionarTodosCajaIngreso;
	}

	public void setBorderResaltarSeleccionarTodosCajaIngreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngreso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCajaIngreso .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCajaIngreso() {
		return this.jCheckBoxSeleccionadosCajaIngreso;
	}

	public void setjCheckBoxSeleccionadosCajaIngreso(
			JCheckBox jCheckBoxSeleccionadosCajaIngreso) {
		this.jCheckBoxSeleccionadosCajaIngreso = jCheckBoxSeleccionadosCajaIngreso;
	}
	
	public void setBorderResaltarSeleccionadosCajaIngreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngreso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCajaIngreso .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCajaIngreso() {
		return this.jComboBoxTiposArchivosReportesCajaIngreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCajaIngreso(
			JComboBox jComboBoxTiposArchivosReportesCajaIngreso) {
		this.jComboBoxTiposArchivosReportesCajaIngreso = jComboBoxTiposArchivosReportesCajaIngreso;
	}

	public void setBorderResaltarTiposArchivosReportesCajaIngreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCajaIngreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCajaIngreso() {
		return this.jComboBoxTiposReportesCajaIngreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCajaIngreso(
			JComboBox jComboBoxTiposReportesCajaIngreso) {
		this.jComboBoxTiposReportesCajaIngreso = jComboBoxTiposReportesCajaIngreso;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCajaIngreso() {
	//	return jComboBoxTiposReportesDinamicoCajaIngreso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCajaIngreso(
	//		JComboBox jComboBoxTiposReportesDinamicoCajaIngreso) {
	//	this.jComboBoxTiposReportesDinamicoCajaIngreso = jComboBoxTiposReportesDinamicoCajaIngreso;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCajaIngreso() {
	//	return jComboBoxTiposArchivosReportesDinamicoCajaIngreso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCajaIngreso(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCajaIngreso) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCajaIngreso = jComboBoxTiposArchivosReportesDinamicoCajaIngreso;
	//}
	
	public void setBorderResaltarTiposReportesCajaIngreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCajaIngreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCajaIngreso() {
		return this.jComboBoxTiposGraficosReportesCajaIngreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCajaIngreso(
			JComboBox jComboBoxTiposGraficosReportesCajaIngreso) {
		this.jComboBoxTiposGraficosReportesCajaIngreso = jComboBoxTiposGraficosReportesCajaIngreso;
	}
	
	public void setBorderResaltarTiposGraficosReportesCajaIngreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCajaIngreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCajaIngreso() {
		return this.jComboBoxTiposPaginacionCajaIngreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCajaIngreso(
			JComboBox jComboBoxTiposPaginacionCajaIngreso) {
		this.jComboBoxTiposPaginacionCajaIngreso = jComboBoxTiposPaginacionCajaIngreso;
	}
	
	public void setBorderResaltarTiposPaginacionCajaIngreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCajaIngreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCajaIngreso() {
		return this.jComboBoxTiposRelacionesCajaIngreso;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaIngreso() {
		return this.jComboBoxTiposAccionesCajaIngreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaIngreso(
			JComboBox jComboBoxTiposRelacionesCajaIngreso) {
		this.jComboBoxTiposRelacionesCajaIngreso = jComboBoxTiposRelacionesCajaIngreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaIngreso(
			JComboBox jComboBoxTiposAccionesCajaIngreso) {
		this.jComboBoxTiposAccionesCajaIngreso = jComboBoxTiposAccionesCajaIngreso;
	}
	
	public void setBorderResaltarTiposRelacionesCajaIngreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCajaIngreso .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCajaIngreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCajaIngreso .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCajaIngreso() {
	//	return jCheckBoxConGraficoDinamicoCajaIngreso;
	//}

	//public void setjCheckBoxConGraficoDinamicoCajaIngreso(
	//		JCheckBox jCheckBoxConGraficoDinamicoCajaIngreso) {
	//	this.jCheckBoxConGraficoDinamicoCajaIngreso = jCheckBoxConGraficoDinamicoCajaIngreso;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCajaIngreso() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCajaIngreso.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCajaIngreso .setBorder(borderResaltar);		
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
		this.cajaingresoSessionBean=new CajaIngresoSessionBean();
		
		this.cajaingresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaingresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajaingresoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaIngresoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Ingreso MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
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
		
		CajaIngresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CajaIngreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCajaIngreso= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"nuevo","nuevo","Nuevo"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"duplicar","duplicar","Duplicar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"copiar","copiar","Copiar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"ver_form","ver_form","Ver"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"recargar","recargar","Recargar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCajaIngreso,this.jTtoolBarCajaIngreso,
							"cerrar","cerrar","Salir"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCajaIngreso=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCajaIngreso;
			
				this.jButtonProcesarInformacionToolBarCajaIngreso=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCajaIngreso;
				
		//protected JButton jButtonModificarToolBarCajaIngreso;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCajaIngreso=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCajaIngreso=new JMenuMe("General");
		this.jmenuArchivoCajaIngreso=new JMenuMe("Archivo");
		this.jmenuAccionesCajaIngreso=new JMenuMe("Acciones");
		this.jmenuDatosCajaIngreso=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaIngreso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaIngreso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaIngreso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCajaIngreso= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCajaIngreso.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCajaIngreso,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCajaIngreso= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCajaIngreso.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCajaIngreso,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCajaIngreso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaIngreso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaIngreso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCajaIngreso= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCajaIngreso.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCajaIngreso,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCajaIngreso= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCajaIngreso.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCajaIngreso,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCajaIngreso= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCajaIngreso.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCajaIngreso,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaIngreso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaIngreso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaIngreso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCajaIngreso= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCajaIngreso.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCajaIngreso,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCajaIngreso= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCajaIngreso.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCajaIngreso,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCajaIngreso= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCajaIngreso.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCajaIngreso,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCajaIngreso= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCajaIngreso.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCajaIngreso,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCajaIngreso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCajaIngreso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCajaIngreso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaIngreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaIngreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaIngreso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCajaIngreso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCajaIngreso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCajaIngreso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaIngreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaIngreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaIngreso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCajaIngreso= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCajaIngreso.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCajaIngreso,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCajaIngreso.add(this.jMenuItemCerrarCajaIngreso);
			
			this.jmenuAccionesCajaIngreso.add(this.jMenuItemNuevoCajaIngreso);
			this.jmenuAccionesCajaIngreso.add(this.jMenuItemNuevoGuardarCambiosCajaIngreso);
			this.jmenuAccionesCajaIngreso.add(this.jMenuItemNuevoRelacionesCajaIngreso);
			this.jmenuAccionesCajaIngreso.add(this.jMenuItemGuardarCambiosTablaCajaIngreso);		
			this.jmenuAccionesCajaIngreso.add(this.jMenuItemDuplicarCajaIngreso);		
			this.jmenuAccionesCajaIngreso.add(this.jMenuItemCopiarCajaIngreso);		
			this.jmenuAccionesCajaIngreso.add(this.jMenuItemVerFormCajaIngreso);		
			
			this.jmenuDatosCajaIngreso.add(this.jMenuItemRecargarInformacionCajaIngreso);				
			this.jmenuDatosCajaIngreso.add(this.jMenuItemAnterioresCajaIngreso);				
			this.jmenuDatosCajaIngreso.add(this.jMenuItemSiguientesCajaIngreso);				
			this.jmenuDatosCajaIngreso.add(this.jMenuItemAbrirOrderByCajaIngreso);				
			this.jmenuDatosCajaIngreso.add(this.jMenuItemMostrarOcultarCajaIngreso);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCajaIngreso.add(this.jMenuItemGuardarCambiosCajaIngreso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCajaIngreso.add(this.jmenuArchivoCajaIngreso);		
			this.jmenuBarCajaIngreso.add(this.jmenuAccionesCajaIngreso);		
			this.jmenuBarCajaIngreso.add(this.jmenuDatosCajaIngreso);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCajaIngreso);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCajaIngreso() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCajaCajaIngreso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCajaCajaIngreso.setToolTipText("Buscar Por Caja ");
		this.jButtonFK_IdCajaCajaIngreso= new JButtonMe();
		this.jButtonFK_IdCajaCajaIngreso.setText("Buscar");
		this.jButtonFK_IdCajaCajaIngreso.setToolTipText("Buscar Por Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCajaCajaIngreso,"buscar_button","Buscar Por Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCajaCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cajaFK_IdCajaCajaIngreso = new JLabelMe();
		jLabelid_cajaFK_IdCajaCajaIngreso.setText("Caja :");
		jLabelid_cajaFK_IdCajaCajaIngreso.setToolTipText("Caja");
		jLabelid_cajaFK_IdCajaCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cajaFK_IdCajaCajaIngreso,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cajaFK_IdCajaCajaIngreso= new JComboBoxMe();
		jComboBoxid_cajaFK_IdCajaCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaFK_IdCajaCajaIngreso,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTurnoPunVenCajaIngreso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTurnoPunVenCajaIngreso.setToolTipText("Buscar Por Turno ");
		this.jButtonFK_IdTurnoPunVenCajaIngreso= new JButtonMe();
		this.jButtonFK_IdTurnoPunVenCajaIngreso.setText("Buscar");
		this.jButtonFK_IdTurnoPunVenCajaIngreso.setToolTipText("Buscar Por Turno ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTurnoPunVenCajaIngreso,"buscar_button","Buscar Por Turno ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTurnoPunVenCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaIngreso = new JLabelMe();
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setText("Turno :");
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setToolTipText("Turno");
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_turno_pun_venFK_IdTurnoPunVenCajaIngreso,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso= new JComboBoxMe();
		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCajaIngreso=new JTabbedPane();


		this.jTabbedPaneBusquedasCajaIngreso.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajaIngreso.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajaIngreso.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCajaIngreso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCajaIngreso,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCajaIngreso = new CajaIngresoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Caja Ingreso DATOS");
			this.jInternalFrameDetalleFormCajaIngreso = new CajaIngresoDetalleFormJInternalFrame(jDesktopPane,this.cajaingresoSessionBean.getConGuardarRelaciones(),this.cajaingresoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCajaIngreso = null;//new CajaIngresoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaIngreso= new GridBagLayout();
		
		
		this.jTableDatosCajaIngreso = new JTableMe();      
		
		String sToolTipCajaIngreso="";
		sToolTipCajaIngreso=CajaIngresoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaIngreso+="(PuntoVenta.CajaIngreso)";
		}
		
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaIngreso+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCajaIngreso.setToolTipText(sToolTipCajaIngreso);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCajaIngreso);
		this.jTableDatosCajaIngreso.setAutoCreateRowSorter(true);
		this.jTableDatosCajaIngreso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCajaIngreso.setRowSelectionAllowed(true);
		this.jTableDatosCajaIngreso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCajaIngreso,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCajaIngreso = new JButtonMe();
		this.jButtonDuplicarCajaIngreso = new JButtonMe();
		this.jButtonCopiarCajaIngreso = new JButtonMe();
		this.jButtonVerFormCajaIngreso = new JButtonMe();
		this.jButtonNuevoRelacionesCajaIngreso = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCajaIngreso = new JButtonMe();
		this.jButtonCerrarCajaIngreso = new JButtonMe();
		
		this.jScrollPanelDatosCajaIngreso = new JScrollPane();   
        this.jScrollPanelDatosGeneralCajaIngreso = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Ingreso";
		
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingresos" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaIngreso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaIngreso.setToolTipText("Acciones");
        this.jPanelAccionesCajaIngreso.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCajaIngreso=new ReporteDinamicoJInternalFrame(CajaIngresoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCajaIngreso();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCajaIngreso=new ImportacionJInternalFrame(CajaIngresoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCajaIngreso();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCajaIngreso = new JButtonMe();
		
		this.jButtonAbrirOrderByCajaIngreso.setText("Orden");
		this.jButtonAbrirOrderByCajaIngreso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaIngreso,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaIngreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaIngreso,false,this);
			
			//this.cargarOrderByCajaIngreso(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaIngreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaIngreso,true,this);
			
			//this.cargarOrderByCajaIngreso(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCajaIngreso.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosCajaIngreso.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosCajaIngreso.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosCajaIngreso.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaIngreso.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaIngreso.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCajaIngreso.setText("Nuevo");
		this.jButtonDuplicarCajaIngreso.setText("Duplicar");
		this.jButtonCopiarCajaIngreso.setText("Copiar");
		this.jButtonVerFormCajaIngreso.setText("Ver");
		this.jButtonNuevoRelacionesCajaIngreso.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCajaIngreso.setText("Guardar");
		this.jButtonCerrarCajaIngreso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaIngreso,"nuevo_button","Nuevo",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCajaIngreso,"duplicar_button","Duplicar",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCajaIngreso,"copiar_button","Copiar",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCajaIngreso,"ver_form","Ver",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCajaIngreso,"nuevorelaciones_button","Nuevo Rel",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaIngreso,"guardarcambiostabla_button","Guardar",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaIngreso,"cerrar_button","Salir",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCajaIngreso.setToolTipText("Nuevo"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCajaIngreso.setToolTipText("Duplicar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCajaIngreso.setToolTipText("Copiar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCajaIngreso.setToolTipText("Ver"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCajaIngreso.setToolTipText("Nuevo Rel"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCajaIngreso.setToolTipText("Guardar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaIngreso.setToolTipText("Salir"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaIngreso";
		inputMap = this.jButtonNuevoCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaIngreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaIngreso"));
		
		//DUPLICAR
		sMapKey = "DuplicarCajaIngreso";
		inputMap = this.jButtonDuplicarCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCajaIngreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCajaIngreso"));
		
		//COPIAR
		sMapKey = "CopiarCajaIngreso";
		inputMap = this.jButtonCopiarCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCajaIngreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCajaIngreso"));
		
		//VEr FORM
		sMapKey = "VerFormCajaIngreso";
		inputMap = this.jButtonVerFormCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCajaIngreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCajaIngreso"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCajaIngreso";
		inputMap = this.jButtonNuevoRelacionesCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCajaIngreso"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCajaIngreso";
		inputMap = this.jButtonModificarCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCajaIngreso"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCajaIngreso";
		inputMap = this.jButtonCerrarCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaIngreso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaIngreso";
		inputMap = this.jButtonGuardarCambiosTablaCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaIngreso"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CajaIngreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CajaIngreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CajaIngreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CajaIngreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CajaIngreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCajaIngreso.setName("jPanelParametrosReportesCajaIngreso"); 
		
		this.jPanelParametrosReportesAccionesCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCajaIngreso.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCajaIngreso.setName("jPanelParametrosReportesAccionesCajaIngreso"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCajaIngreso = new JButtonMe();
		this.jButtonRecargarInformacionCajaIngreso.setText("Recargar");
		this.jButtonRecargarInformacionCajaIngreso.setToolTipText("Recargar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCajaIngreso,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCajaIngreso = new JButtonMe();
		this.jButtonProcesarInformacionCajaIngreso.setText("Procesar");
		this.jButtonProcesarInformacionCajaIngreso.setToolTipText("Procesar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCajaIngreso.setVisible(false);
			
		this.jButtonProcesarInformacionCajaIngreso.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaIngreso.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaIngreso.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCajaIngreso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaIngreso.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCajaIngreso.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCajaIngreso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaIngreso.setText("TIPO");       
		this.jComboBoxTiposReportesCajaIngreso.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCajaIngreso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaIngreso.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCajaIngreso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCajaIngreso = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCajaIngreso.setText("Paginacion");
		this.jComboBoxTiposPaginacionCajaIngreso.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCajaIngreso = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCajaIngreso.setText("Accion");
		this.jComboBoxTiposRelacionesCajaIngreso.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCajaIngreso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaIngreso.setText("Accion");
		this.jComboBoxTiposAccionesCajaIngreso.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCajaIngreso = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCajaIngreso.setText("Accion");
		this.jComboBoxTiposSeleccionarCajaIngreso.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCajaIngreso=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCajaIngreso.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaIngreso.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaIngreso.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCajaIngreso = new JLabelMe();
		
		this.jLabelAccionesCajaIngreso.setText("Acciones");		
		this.jLabelAccionesCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCajaIngreso = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCajaIngreso.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCajaIngreso.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCajaIngreso = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCajaIngreso.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCajaIngreso.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCajaIngreso = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCajaIngreso.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCajaIngreso.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCajaIngreso = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCajaIngreso.setText("Graf.");
		this.jCheckBoxConGraficoReporteCajaIngreso.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCajaIngreso = new JButtonMe();
		//this.jButtonAnterioresCajaIngreso.setText("<<");
        this.jButtonAnterioresCajaIngreso.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCajaIngreso,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCajaIngreso = new JButtonMe();
		//this.jButtonSiguientesCajaIngreso.setText(">>");
        this.jButtonSiguientesCajaIngreso.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCajaIngreso,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCajaIngreso = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCajaIngreso.setText("Nue");
        this.jButtonNuevoGuardarCambiosCajaIngreso.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCajaIngreso,"nuevoguardarcambios_button","Nue",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCajaIngreso";
		inputMap = this.jButtonNuevoGuardarCambiosCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCajaIngreso"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCajaIngreso";
		inputMap = this.jButtonRecargarInformacionCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCajaIngreso"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCajaIngreso";
		inputMap = this.jButtonSiguientesCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCajaIngreso"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCajaIngreso";
		inputMap = this.jButtonAnterioresCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCajaIngreso"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCajaIngreso();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCajaIngreso.setMinimumSize(new Dimension(this.getWidth(),CajaIngresoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaIngresoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaIngreso.setMaximumSize(new Dimension(this.getWidth(),CajaIngresoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaIngresoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaIngreso.setPreferredSize(new Dimension(this.getWidth(),CajaIngresoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaIngresoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCajaIngreso = new GridBagLayout();

			this.jPanelPaginacionCajaIngreso.setLayout(gridaBagLayoutPaginacionCajaIngreso);						
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy = 0;
			this.gridBagConstraintsCajaIngreso.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCajaIngreso.add(this.jButtonAnterioresCajaIngreso, this.gridBagConstraintsCajaIngreso);
					
						
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaIngreso.gridy = 0;
			
			this.jPanelPaginacionCajaIngreso.add(this.jButtonNuevoGuardarCambiosCajaIngreso, this.gridBagConstraintsCajaIngreso);
						
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCajaIngreso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaIngreso.gridy = 0;
			this.jPanelPaginacionCajaIngreso.add(this.jButtonSiguientesCajaIngreso, this.gridBagConstraintsCajaIngreso);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy = 1;
			this.gridBagConstraintsCajaIngreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaIngreso.add(this.jButtonNuevoCajaIngreso, this.gridBagConstraintsCajaIngreso);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
				this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCajaIngreso.gridy = 1;
				this.gridBagConstraintsCajaIngreso.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCajaIngreso.add(this.jButtonNuevoRelacionesCajaIngreso, this.gridBagConstraintsCajaIngreso);
			}
			
			
			if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
				this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCajaIngreso.gridy = 1;
				this.gridBagConstraintsCajaIngreso.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCajaIngreso.add(this.jButtonGuardarCambiosTablaCajaIngreso, this.gridBagConstraintsCajaIngreso);
			}
			
			
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy = 1;
			this.gridBagConstraintsCajaIngreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaIngreso.add(this.jButtonDuplicarCajaIngreso, this.gridBagConstraintsCajaIngreso);
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy = 1;
			this.gridBagConstraintsCajaIngreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaIngreso.add(this.jButtonCopiarCajaIngreso, this.gridBagConstraintsCajaIngreso);
		
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy = 1;
			this.gridBagConstraintsCajaIngreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaIngreso.add(this.jButtonVerFormCajaIngreso, this.gridBagConstraintsCajaIngreso);
		
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy = 1;
			this.gridBagConstraintsCajaIngreso.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCajaIngreso.add(this.jButtonCerrarCajaIngreso, this.gridBagConstraintsCajaIngreso);
		
		
		
		this.jButtonRecargarInformacionCajaIngreso.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaIngreso.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaIngreso.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCajaIngreso.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaIngreso.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaIngreso.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCajaIngreso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaIngreso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaIngreso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCajaIngreso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaIngreso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaIngreso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCajaIngreso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaIngreso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaIngreso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCajaIngreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaIngreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaIngreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCajaIngreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaIngreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaIngreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCajaIngreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaIngreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaIngreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCajaIngreso.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaIngreso.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaIngreso.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCajaIngreso.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaIngreso.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaIngreso.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCajaIngreso.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaIngreso.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaIngreso.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCajaIngreso.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaIngreso.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaIngreso.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCajaIngreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCajaIngreso = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CajaIngreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CajaIngreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CajaIngreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CajaIngreso = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCajaIngreso.setLayout(gridaBagParametrosReportesCajaIngreso);
			this.jPanelParametrosReportesAccionesCajaIngreso.setLayout(gridaBagParametrosReportesAccionesCajaIngreso);
			
			
			this.jPanelParametrosAuxiliar1CajaIngreso.setLayout(gridaBagParametrosAuxiliar1CajaIngreso);
			this.jPanelParametrosAuxiliar2CajaIngreso.setLayout(gridaBagParametrosAuxiliar2CajaIngreso);
			this.jPanelParametrosAuxiliar3CajaIngreso.setLayout(gridaBagParametrosAuxiliar3CajaIngreso);
			this.jPanelParametrosAuxiliar4CajaIngreso.setLayout(gridaBagParametrosAuxiliar4CajaIngreso);
			//this.jPanelParametrosAuxiliar5CajaIngreso.setLayout(gridaBagParametrosAuxiliar2CajaIngreso);			
			
			
			
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaIngreso.add(this.jButtonRecargarInformacionCajaIngreso, this.gridBagConstraintsCajaIngreso);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaIngreso.add(this.jComboBoxTiposPaginacionCajaIngreso, this.gridBagConstraintsCajaIngreso);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaIngreso.add(this.jCheckBoxConAltoMaximoTablaCajaIngreso, this.gridBagConstraintsCajaIngreso);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaIngreso.add(this.jComboBoxTiposArchivosReportesCajaIngreso, this.gridBagConstraintsCajaIngreso);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaIngreso.add(this.jPanelParametrosAuxiliar1CajaIngreso, this.gridBagConstraintsCajaIngreso);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngreso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CajaIngreso.add(this.jComboBoxTiposReportesCajaIngreso, this.gridBagConstraintsCajaIngreso);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaIngreso.add(this.jPanelParametrosAuxiliar4CajaIngreso, this.gridBagConstraintsCajaIngreso);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaIngreso.add(this.jComboBoxTiposReportesCajaIngreso, this.gridBagConstraintsCajaIngreso);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaIngreso.add(this.jCheckBoxGenerarReporteCajaIngreso, this.gridBagConstraintsCajaIngreso);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaIngreso.add(this.jPanelParametrosAuxiliar2CajaIngreso, this.gridBagConstraintsCajaIngreso);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngreso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaIngreso.add(this.jLabelAccionesCajaIngreso, this.gridBagConstraintsCajaIngreso);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
				this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCajaIngreso.add(this.jButtonAbrirOrderByCajaIngreso, this.gridBagConstraintsCajaIngreso);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaIngreso.add(this.jComboBoxTiposSeleccionarCajaIngreso, this.gridBagConstraintsCajaIngreso);			
			
			
			/*
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngreso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaIngreso.add(this.jCheckBoxSeleccionarTodosCajaIngreso, this.gridBagConstraintsCajaIngreso);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngreso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaIngreso.add(this.jCheckBoxSeleccionarTodosCajaIngreso, this.gridBagConstraintsCajaIngreso);															
				
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngreso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaIngreso.add(this.jCheckBoxSeleccionadosCajaIngreso, this.gridBagConstraintsCajaIngreso);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaIngreso.add(this.jPanelParametrosAuxiliar3CajaIngreso, this.gridBagConstraintsCajaIngreso);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaIngreso.add(this.jComboBoxTiposRelacionesCajaIngreso, this.gridBagConstraintsCajaIngreso);
				
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaIngreso.add(this.jComboBoxTiposAccionesCajaIngreso, this.gridBagConstraintsCajaIngreso);
	
				
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaIngreso.add(this.jTextFieldValorCampoGeneralCajaIngreso, this.gridBagConstraintsCajaIngreso);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCajaIngreso = new GridBagLayout();

			this.jScrollPanelDatosCajaIngreso.setLayout(gridaBagLayoutDatosCajaIngreso);
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy = 0;
			this.gridBagConstraintsCajaIngreso.gridx = 0;
			
			this.jScrollPanelDatosCajaIngreso.add(this.jTableDatosCajaIngreso, this.gridBagConstraintsCajaIngreso);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCajaIngreso.setViewportView(this.jTableDatosCajaIngreso);
		this.jTableDatosCajaIngreso.setFillsViewportHeight(true);
		this.jTableDatosCajaIngreso.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCajaIngreso= new GridBagLayout();
		this.jPanelAccionesCajaIngreso.setLayout(gridaBagLayoutAccionesCajaIngreso);
		
		
		/*	
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 0;
			
		this.jPanelAccionesCajaIngreso.add(this.jButtonNuevoCajaIngreso, this.gridBagConstraintsCajaIngreso);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCajaCajaIngreso= new GridBagLayout();
		gridaBagLayoutFK_IdCajaCajaIngreso.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCajaCajaIngreso.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCajaCajaIngreso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCajaCajaIngreso.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCajaCajaIngreso.setLayout(gridaBagLayoutFK_IdCajaCajaIngreso);

		gridBagConstraintsCajaIngreso = new GridBagConstraints();
		gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngreso.gridy = 0;
		gridBagConstraintsCajaIngreso.gridx = 0;
		jPanelFK_IdCajaCajaIngreso.add(jLabelid_cajaFK_IdCajaCajaIngreso, gridBagConstraintsCajaIngreso);

		gridBagConstraintsCajaIngreso = new GridBagConstraints();
		gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngreso.gridy = 0;
		gridBagConstraintsCajaIngreso.gridx = 1;
		jPanelFK_IdCajaCajaIngreso.add(jComboBoxid_cajaFK_IdCajaCajaIngreso, gridBagConstraintsCajaIngreso);

		gridBagConstraintsCajaIngreso = new GridBagConstraints();
		gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngreso.gridy = 1;
		gridBagConstraintsCajaIngreso.gridx =1;
		jPanelFK_IdCajaCajaIngreso.add(jButtonFK_IdCajaCajaIngreso, gridBagConstraintsCajaIngreso);

		jTabbedPaneBusquedasCajaIngreso.addTab("1.-Por Caja ", jPanelFK_IdCajaCajaIngreso);
		jTabbedPaneBusquedasCajaIngreso.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTurnoPunVenCajaIngreso= new GridBagLayout();
		gridaBagLayoutFK_IdTurnoPunVenCajaIngreso.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTurnoPunVenCajaIngreso.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTurnoPunVenCajaIngreso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTurnoPunVenCajaIngreso.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTurnoPunVenCajaIngreso.setLayout(gridaBagLayoutFK_IdTurnoPunVenCajaIngreso);

		gridBagConstraintsCajaIngreso = new GridBagConstraints();
		gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngreso.gridy = 0;
		gridBagConstraintsCajaIngreso.gridx = 0;
		jPanelFK_IdTurnoPunVenCajaIngreso.add(jLabelid_turno_pun_venFK_IdTurnoPunVenCajaIngreso, gridBagConstraintsCajaIngreso);

		gridBagConstraintsCajaIngreso = new GridBagConstraints();
		gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngreso.gridy = 0;
		gridBagConstraintsCajaIngreso.gridx = 1;
		jPanelFK_IdTurnoPunVenCajaIngreso.add(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso, gridBagConstraintsCajaIngreso);

		gridBagConstraintsCajaIngreso = new GridBagConstraints();
		gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngreso.gridy = 1;
		gridBagConstraintsCajaIngreso.gridx =1;
		jPanelFK_IdTurnoPunVenCajaIngreso.add(jButtonFK_IdTurnoPunVenCajaIngreso, gridBagConstraintsCajaIngreso);

		jTabbedPaneBusquedasCajaIngreso.addTab("2.-Por Turno ", jPanelFK_IdTurnoPunVenCajaIngreso);
		jTabbedPaneBusquedasCajaIngreso.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaIngreso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaIngreso);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();						
			this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaIngreso.gridx = 0;		
			//this.gridBagConstraintsCajaIngreso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaIngreso.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCajaIngreso, this.gridBagConstraintsCajaIngreso);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCajaIngreso.gridx = 0;		
		//this.gridBagConstraintsCajaIngreso.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCajaIngreso.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCajaIngreso);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaIngreso.gridx = 0;		
			this.gridBagConstraintsCajaIngreso.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCajaIngreso.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCajaIngreso, this.gridBagConstraintsCajaIngreso);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngreso.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCajaIngreso, this.gridBagConstraintsCajaIngreso);								
		
		
		/*
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngreso.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCajaIngreso, this.gridBagConstraintsCajaIngreso);
		*/		
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaIngreso.gridx =0;
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaIngreso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaIngreso, this.gridBagConstraintsCajaIngreso);
				
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngreso.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCajaIngreso, this.gridBagConstraintsCajaIngreso);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CajaIngresoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCajaIngreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaIngreso = new GridBagLayout();
			this.jPanelBusquedasParametrosCajaIngreso.setLayout(gridaBagLayoutBusquedasParametrosCajaIngreso);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCajaIngreso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaIngreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaIngreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaIngreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaIngreso, this.gridBagConstraintsCajaIngreso);
			
			
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaIngreso, this.gridBagConstraintsCajaIngreso);
		
			
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngreso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaIngreso, this.gridBagConstraintsCajaIngreso);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCajaIngreso;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCajaIngreso() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCajaIngreso = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCajaIngreso.setName("jPanelReporteDinamicoCajaIngreso"); 
		
		this.jPanelReporteDinamicoCajaIngreso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaIngreso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaIngreso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCajaIngreso.setLayout(gridaBagLayoutReporteDinamicoCajaIngreso);
		
		
		this.jInternalFrameReporteDinamicoCajaIngreso= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCajaIngreso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaIngreso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCajaIngreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCajaIngreso.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCajaIngreso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCajaIngreso.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCajaIngreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCajaIngreso.setResizable(true);
	    this.jInternalFrameReporteDinamicoCajaIngreso.setClosable(true);
	    this.jInternalFrameReporteDinamicoCajaIngreso.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCajaIngreso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaIngreso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaIngreso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingresos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCajaIngreso = new JLabelMe();

		this.jLabelColumnasSelectReporteCajaIngreso.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngreso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaIngreso.add(this.jLabelColumnasSelectReporteCajaIngreso, this.gridBagConstraintsCajaIngreso);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCajaIngreso = new JList<Reporte>();
		this.jListColumnasSelectReporteCajaIngreso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCajaIngreso.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCajaIngreso.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaIngreso.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaIngreso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCajaIngreso=new JScrollPane(this.jListColumnasSelectReporteCajaIngreso);
			
			this.jScrollColumnasSelectReporteCajaIngreso.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaIngreso.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaIngreso.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngreso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCajaIngreso.add(this.jListColumnasSelectReporteCajaIngreso, this.gridBagConstraintsCajaIngreso);
		this.jPanelReporteDinamicoCajaIngreso.add(this.jScrollColumnasSelectReporteCajaIngreso, this.gridBagConstraintsCajaIngreso);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCajaIngreso = new JLabelMe();

		this.jLabelRelacionesSelectReporteCajaIngreso.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngreso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaIngreso.add(this.jLabelRelacionesSelectReporteCajaIngreso, this.gridBagConstraintsCajaIngreso);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCajaIngreso = new JList<Reporte>();
		this.jListRelacionesSelectReporteCajaIngreso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCajaIngreso.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCajaIngreso.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaIngreso.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaIngreso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCajaIngreso=new JScrollPane(this.jListRelacionesSelectReporteCajaIngreso);
			
			this.jScrollRelacionesSelectReporteCajaIngreso.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaIngreso.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaIngreso.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngreso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCajaIngreso.add(this.jListRelacionesSelectReporteCajaIngreso, this.gridBagConstraintsCajaIngreso);
		this.jPanelReporteDinamicoCajaIngreso.add(this.jScrollRelacionesSelectReporteCajaIngreso, this.gridBagConstraintsCajaIngreso);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCajaIngreso = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCajaIngreso = new JComboBoxMe();
		this.jListColumnasValoresGraficoCajaIngreso = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCajaIngreso = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCajaIngreso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCajaIngreso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaIngreso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaIngreso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCajaIngreso = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCajaIngreso.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCajaIngreso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaIngreso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaIngreso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCajaIngreso = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCajaIngreso.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngreso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaIngreso.add(this.jLabelGenerarExcelReporteDinamicoCajaIngreso, this.gridBagConstraintsCajaIngreso);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCajaIngreso = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCajaIngreso.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCajaIngreso,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCajaIngreso.setToolTipText("Generar EXCEL"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCajaIngreso.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCajaIngreso.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCajaIngreso.add(this.jButtonGenerarExcelReporteDinamicoCajaIngreso, this.gridBagConstraintsCajaIngreso);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaIngreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaIngreso.add(this.jComboBoxTiposReportesDinamicoCajaIngreso, this.gridBagConstraintsCajaIngreso);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCajaIngreso = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCajaIngreso.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngreso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaIngreso.add(this.jLabelTiposArchivoReporteDinamicoCajaIngreso, this.gridBagConstraintsCajaIngreso);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaIngreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaIngreso.add(this.jComboBoxTiposArchivosReportesDinamicoCajaIngreso, this.gridBagConstraintsCajaIngreso);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCajaIngreso = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCajaIngreso.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCajaIngreso,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCajaIngreso.setToolTipText("Generar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaIngreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaIngreso.add(this.jButtonGenerarReporteDinamicoCajaIngreso, this.gridBagConstraintsCajaIngreso);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCajaIngreso = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCajaIngreso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCajaIngreso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCajaIngreso.setToolTipText("Cancelar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaIngreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaIngreso.add(this.jButtonCerrarReporteDinamicoCajaIngreso, this.gridBagConstraintsCajaIngreso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCajaIngreso = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCajaIngreso= new JScrollPane(jPanelReporteDinamicoCajaIngreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCajaIngreso.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaIngreso.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaIngreso.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingresos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCajaIngreso.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCajaIngreso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCajaIngreso.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCajaIngreso);
		this.jInternalFrameReporteDinamicoCajaIngreso.getContentPane().add(this.jScrollPanelReporteDinamicoCajaIngreso, this.gridBagConstraintsCajaIngreso);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCajaIngreso() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCajaIngreso = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCajaIngreso.setName("jPanelImportacionCajaIngreso"); 
		
		this.jPanelImportacionCajaIngreso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaIngreso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaIngreso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCajaIngreso.setLayout(gridaBagLayoutImportacionCajaIngreso);
		
		
		this.jInternalFrameImportacionCajaIngreso= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCajaIngreso= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCajaIngreso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaIngreso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCajaIngreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaIngreso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaIngreso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCajaIngreso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaIngreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaIngreso.setResizable(true);
	    this.jInternalFrameImportacionCajaIngreso.setClosable(true);
	    this.jInternalFrameImportacionCajaIngreso.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCajaIngreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaIngreso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaIngreso.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCajaIngreso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaIngreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaIngreso.setResizable(true);
	    this.jInternalFrameImportacionCajaIngreso.setClosable(true);
	    this.jInternalFrameImportacionCajaIngreso.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCajaIngreso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaIngreso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaIngreso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingresos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCajaIngreso = new JLabelMe();

		this.jLabelArchivoImportacionCajaIngreso.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaIngreso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaIngreso.add(this.jLabelArchivoImportacionCajaIngreso, this.gridBagConstraintsCajaIngreso);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCajaIngreso = new JFileChooser();		
		this.jFileChooserImportacionCajaIngreso.setToolTipText("ESCOGER ARCHIVO"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCajaIngreso = new JButtonMe();
		this.jButtonAbrirImportacionCajaIngreso.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCajaIngreso,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCajaIngreso.setToolTipText("Generar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaIngreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaIngreso.add(this.jButtonAbrirImportacionCajaIngreso, this.gridBagConstraintsCajaIngreso);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCajaIngreso = new JLabelMe();

		this.jLabelPathArchivoImportacionCajaIngreso.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaIngreso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaIngreso.add(this.jLabelPathArchivoImportacionCajaIngreso, this.gridBagConstraintsCajaIngreso);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCajaIngreso=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCajaIngreso.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaIngreso.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaIngreso.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaIngreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaIngreso.add(this.jTextFieldPathArchivoImportacionCajaIngreso, this.gridBagConstraintsCajaIngreso);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCajaIngreso = new JButtonMe();
		this.jButtonGenerarImportacionCajaIngreso.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCajaIngreso,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCajaIngreso.setToolTipText("Generar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaIngreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaIngreso.add(this.jButtonGenerarImportacionCajaIngreso, this.gridBagConstraintsCajaIngreso);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCajaIngreso = new JButtonMe();
		this.jButtonCerrarImportacionCajaIngreso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCajaIngreso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCajaIngreso.setToolTipText("Cancelar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaIngreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaIngreso.add(this.jButtonCerrarImportacionCajaIngreso, this.gridBagConstraintsCajaIngreso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCajaIngreso = new GridBagLayout();
		
		this.jScrollPanelImportacionCajaIngreso= new JScrollPane(jPanelImportacionCajaIngreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy =iPosYImportacion;
		this.gridBagConstraintsCajaIngreso.gridx =iPosXImportacion;
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCajaIngreso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCajaIngreso.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCajaIngreso);
		this.jInternalFrameImportacionCajaIngreso.getContentPane().add(this.jScrollPanelImportacionCajaIngreso, this.gridBagConstraintsCajaIngreso);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCajaIngreso(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCajaIngreso = new JButtonMe();
			this.jButtonAbrirOrderByCajaIngreso.setText("Orden");
			this.jButtonAbrirOrderByCajaIngreso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaIngreso,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCajaIngreso";
			inputMap = this.jButtonAbrirOrderByCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCajaIngreso"));
		
		
			GridBagLayout gridaBagLayoutOrderByCajaIngreso = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCajaIngreso.setName("jPanelOrderByCajaIngreso"); 
			
			this.jPanelOrderByCajaIngreso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaIngreso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaIngreso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCajaIngreso.setLayout(gridaBagLayoutOrderByCajaIngreso);
			
			
			this.jTableDatosCajaIngresoOrderBy = new JTableMe();        
			this.jTableDatosCajaIngresoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCajaIngresoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCajaIngresoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCajaIngresoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCajaIngresoOrderBy.setViewportView(this.jTableDatosCajaIngresoOrderBy);
			this.jTableDatosCajaIngresoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCajaIngresoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCajaIngreso= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCajaIngreso= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCajaIngreso = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCajaIngreso= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCajaIngreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCajaIngreso.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCajaIngreso.setTitle("Orden");
			this.jInternalFrameOrderByCajaIngreso.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCajaIngreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCajaIngreso.setResizable(true);
			this.jInternalFrameOrderByCajaIngreso.setClosable(true);
			this.jInternalFrameOrderByCajaIngreso.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCajaIngreso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaIngreso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaIngreso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingresos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCajaIngreso.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCajaIngreso.ipady =150;
				
			this.jPanelOrderByCajaIngreso.add(jScrollPanelDatosCajaIngresoOrderBy, this.gridBagConstraintsCajaIngreso);//this.jTableDatosCajaIngresoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCajaIngreso = new JButtonMe();
			this.jButtonCerrarOrderByCajaIngreso.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCajaIngreso,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCajaIngreso.setToolTipText("Cancelar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCajaIngreso.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCajaIngreso.add(this.jButtonCerrarOrderByCajaIngreso, this.gridBagConstraintsCajaIngreso);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCajaIngreso = new GridBagLayout();
			
			this.jScrollPanelOrderByCajaIngreso= new JScrollPane(jPanelOrderByCajaIngreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridy =iPosYOrderBy;
			this.gridBagConstraintsCajaIngreso.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCajaIngreso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCajaIngreso.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCajaIngreso);
			
			this.jInternalFrameOrderByCajaIngreso.getContentPane().add(this.jScrollPanelOrderByCajaIngreso, this.gridBagConstraintsCajaIngreso);			
		
		} else {
			this.jButtonAbrirOrderByCajaIngreso = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cajaingresoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCajaIngreso.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCajaIngreso.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCajaIngreso.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCajaIngreso.getRowHeight();//CajaIngresoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CajaIngresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaIngreso.isSelected()) {
					iHeightTable=CajaIngresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaIngresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaIngresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CajaIngresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaIngreso.isSelected()) {
					iHeightTable=CajaIngresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaIngresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaIngresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCajaIngreso.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaIngreso.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaIngreso.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCajaIngreso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaIngreso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaIngreso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCajaIngreso!=null && this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy()!=null) {
			//if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCajaIngreso.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCajaIngreso.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCajaIngreso.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCajaIngreso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaIngreso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaIngreso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cajaingresoLogic.getCajaIngresos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaingresos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CajaIngreso> TraerCajaIngresoBeans(List<CajaIngreso> cajaingresos,ArrayList<Classe> classes)throws Exception {
		try {
			for(CajaIngreso cajaingreso:cajaingresos) {
					
				if(!(CajaIngresoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CajaIngresoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cajaingreso.setsDetalleGeneralEntityReporte(CajaIngresoConstantesFunciones.getCajaIngresoDescripcion(cajaingreso));
										
						
					
					

					if(cajaingreso.getCajaIngresoDetalles()!=null && Funciones.existeClass(classes,CajaIngresoDetalle.class)) {
						try{cajaingreso.setcajaingresodetallesDescripcionReporte(new JRBeanCollectionDataSource(CajaIngresoDetalleJInternalFrame.TraerCajaIngresoDetalleBeans(cajaingreso.getCajaIngresoDetalles(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//cajaingreso.setsDetalleGeneralEntityReporte(cajaingreso.getsDetalleGeneralEntityReporte());
										
				}
				
				//cajaingresobeans.add(cajaingresobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cajaingresos;
    }
	//PARA REPORTES FIN
}
