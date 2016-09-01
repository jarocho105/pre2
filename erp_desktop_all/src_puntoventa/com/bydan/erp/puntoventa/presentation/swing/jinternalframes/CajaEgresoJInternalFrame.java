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
import com.bydan.erp.puntoventa.util.CajaEgresoConstantesFunciones;

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
public class CajaEgresoJInternalFrame extends CajaEgresoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCajaEgreso;
	
	protected JMenuBar jmenuBarCajaEgreso;
	
	protected JMenu jmenuCajaEgreso;
	protected JMenu jmenuDatosCajaEgreso;
	protected JMenu jmenuArchivoCajaEgreso;
	protected JMenu jmenuAccionesCajaEgreso;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaEgreso;	
	protected GridBagConstraints gridBagConstraintsCajaEgreso;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CajaEgresoDetalleFormJInternalFrame jInternalFrameDetalleFormCajaEgreso;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCajaEgreso;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCajaEgreso;	
	
	
	
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
	
	public CajaEgresoSessionBean cajaegresoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public CajaSessionBean cajaSessionBean;
	public TurnoPunVenSessionBean turnopunvenSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CajaEgreso> cajaegresos;		
	public List<CajaEgreso> cajaegresosEliminados;	
	public List<CajaEgreso> cajaegresosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCajaEgreso;		
	protected JButton jButtonAbrirOrderByCajaEgreso;
	
	
	//protected JPanel jPanelOrderByCajaEgreso;
	//public JScrollPane jScrollPanelOrderByCajaEgreso;	
	//protected JButton jButtonCerrarOrderByCajaEgreso;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CajaEgresoLogic cajaegresoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCajaEgreso;
	public JScrollPane jScrollPanelDatosEdicionCajaEgreso;
	public JScrollPane jScrollPanelDatosGeneralCajaEgreso;
    
	
	
	//public JScrollPane jScrollPanelDatosCajaEgresoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCajaEgreso;
	//public JScrollPane jScrollPanelImportacionCajaEgreso;
	
	
	
	protected JPanel jPanelAccionesCajaEgreso;
	
    protected JPanel jPanelPaginacionCajaEgreso;
    protected JPanel jPanelParametrosReportesCajaEgreso;
	protected JPanel jPanelParametrosReportesAccionesCajaEgreso;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CajaEgreso;
	protected JPanel jPanelParametrosAuxiliar2CajaEgreso;
	protected JPanel jPanelParametrosAuxiliar3CajaEgreso;
	protected JPanel jPanelParametrosAuxiliar4CajaEgreso;
	//protected JPanel jPanelParametrosAuxiliar5CajaEgreso;
	
	
	
	//protected JPanel jPanelReporteDinamicoCajaEgreso;
	//protected JPanel jPanelImportacionCajaEgreso;
	
	
	public JTable jTableDatosCajaEgreso;
	
	
	
	//public JTable jTableDatosCajaEgresoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCajaEgreso;
	protected JButton jButtonDuplicarCajaEgreso;
	protected JButton jButtonCopiarCajaEgreso;
	protected JButton jButtonVerFormCajaEgreso;
	protected JButton jButtonNuevoRelacionesCajaEgreso;
	protected JButton jButtonModificarCajaEgreso;
	
    protected JButton jButtonGuardarCambiosTablaCajaEgreso;
	protected JButton jButtonCerrarCajaEgreso;
	
	
	protected JButton jButtonRecargarInformacionCajaEgreso;
	protected JButton jButtonProcesarInformacionCajaEgreso;
	
	
	protected JButton jButtonAnterioresCajaEgreso;
	protected JButton jButtonSiguientesCajaEgreso;
	protected JButton jButtonNuevoGuardarCambiosCajaEgreso;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCajaEgreso;
	//protected JButton jButtonCerrarReporteDinamicoCajaEgreso;
	//protected JButton jButtonGenerarExcelReporteDinamicoCajaEgreso;	
	
	
	
	//protected JButton jButtonAbrirImportacionCajaEgreso;
	//protected JButton jButtonGenerarImportacionCajaEgreso;
	//protected JButton jButtonCerrarImportacionCajaEgreso;
	//protected JFileChooser jFileChooserImportacionCajaEgreso;
	//protected File fileImportacionCajaEgreso;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaEgreso;
	protected JButton jButtonDuplicarToolBarCajaEgreso;
	protected JButton jButtonNuevoRelacionesToolBarCajaEgreso;
	
	
	public JButton jButtonGuardarCambiosToolBarCajaEgreso;
	protected JButton jButtonCopiarToolBarCajaEgreso;
	protected JButton jButtonVerFormToolBarCajaEgreso;
	public JButton jButtonGuardarCambiosTablaToolBarCajaEgreso;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaEgreso;
	protected JButton jButtonCerrarToolBarCajaEgreso;
	
	protected JButton jButtonRecargarInformacionToolBarCajaEgreso;
	protected JButton jButtonProcesarInformacionToolBarCajaEgreso;
	protected JButton jButtonAnterioresToolBarCajaEgreso;
	protected JButton jButtonSiguientesToolBarCajaEgreso;
	protected JButton jButtonNuevoGuardarCambiosToolBarCajaEgreso;
	protected JButton jButtonAbrirOrderByToolBarCajaEgreso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaEgreso;
	protected JMenuItem jMenuItemDuplicarCajaEgreso;
	protected JMenuItem jMenuItemNuevoRelacionesCajaEgreso;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCajaEgreso;
	protected JMenuItem jMenuItemCopiarCajaEgreso;
	protected JMenuItem jMenuItemVerFormCajaEgreso;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaEgreso;
	protected JMenuItem jMenuItemCerrarCajaEgreso;
	protected JMenuItem jMenuItemDetalleCerrarCajaEgreso;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCajaEgreso;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaEgreso;
	
	protected JMenuItem jMenuItemRecargarInformacionCajaEgreso;
	protected JMenuItem jMenuItemProcesarInformacionCajaEgreso;
	protected JMenuItem jMenuItemAnterioresCajaEgreso;
	protected JMenuItem jMenuItemSiguientesCajaEgreso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaEgreso;
	protected JMenuItem jMenuItemAbrirOrderByCajaEgreso;
	protected JMenuItem jMenuItemMostrarOcultarCajaEgreso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaEgreso;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCajaEgreso;
	protected JCheckBox jCheckBoxSeleccionadosCajaEgreso;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCajaEgreso;
	protected JCheckBox jCheckBoxConGraficoReporteCajaEgreso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCajaEgreso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCajaEgreso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCajaEgreso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCajaEgreso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCajaEgreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCajaEgreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaEgreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaEgreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCajaEgreso;
	protected JTextField jTextFieldValorCampoGeneralCajaEgreso;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCajaEgreso;
	//public JList<Reporte> jListColumnasSelectReporteCajaEgreso;
	//public JScrollPane jScrollColumnasSelectReporteCajaEgreso;
	
	//public JLabel jLabelRelacionesSelectReporteCajaEgreso;
	//public JList<Reporte> jListRelacionesSelectReporteCajaEgreso;
	//public JScrollPane jScrollRelacionesSelectReporteCajaEgreso;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCajaEgreso;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCajaEgreso;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCajaEgreso;
	//public JLabel jLabelTiposArchivoReporteDinamicoCajaEgreso;
	
		
	//public JLabel jLabelArchivoImportacionCajaEgreso;	
	//public JLabel jLabelPathArchivoImportacionCajaEgreso;
	//protected JTextField jTextFieldPathArchivoImportacionCajaEgreso;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCajaEgreso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCajaEgreso;
	
	//public JLabel jLabelColumnaCategoriaValorCajaEgreso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCajaEgreso;
	
	//public JLabel jLabelColumnasValoresGraficoCajaEgreso;
	//public JList<Reporte> jListColumnasValoresGraficoCajaEgreso;
	//public JScrollPane jScrollColumnasValoresGraficoCajaEgreso;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCajaEgreso;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCajaEgreso;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCajaEgreso;
	public JPanel jPanelFK_IdCajaCajaEgreso;
	public JButton jButtonFK_IdCajaCajaEgreso;
	public JPanel jPanelFK_IdTurnoPunVenCajaEgreso;
	public JButton jButtonFK_IdTurnoPunVenCajaEgreso;
	
	public JPanel jPanelid_cajaFK_IdCajaCajaEgreso;
	public JLabel jLabelid_cajaFK_IdCajaCajaEgreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaFK_IdCajaCajaEgreso;
	public JButton jButtonid_cajaFK_IdCajaCajaEgreso= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaCajaEgresoUpdate= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaCajaEgresoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_turno_pun_venFK_IdTurnoPunVenCajaEgreso;
	public JLabel jLabelid_turno_pun_venFK_IdTurnoPunVenCajaEgreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso;
	public JButton jButtonid_turno_pun_venFK_IdTurnoPunVenCajaEgreso= new JButtonMe();
	public JButton jButtonid_turno_pun_venFK_IdTurnoPunVenCajaEgresoUpdate= new JButtonMe();
	public JButton jButtonid_turno_pun_venFK_IdTurnoPunVenCajaEgresoBusqueda= new JButtonMe();

	
	
	
	
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
	public CajaEgresoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CajaEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCajaEgreso)	{
		this.jButtonRecargarInformacionCajaEgreso = jButtonRecargarInformacionCajaEgreso;
	}
	
	public JButton getjButtonProcesarInformacionCajaEgreso() {
		return this.jButtonProcesarInformacionCajaEgreso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaEgreso)	{
		this.jButtonProcesarInformacionCajaEgreso = jButtonProcesarInformacionCajaEgreso;
	}
	
	
	public JButton getjButtonRecargarInformacionCajaEgreso() {
		return this.jButtonRecargarInformacionCajaEgreso;
	}
	
	
	public List<CajaEgreso> getcajaegresos() {
		return this.cajaegresos;
	}

	public void setcajaegresos(List<CajaEgreso> cajaegresos) {
		this.cajaegresos = cajaegresos;
	}
	
	public List<CajaEgreso> getcajaegresosAux() {
		return this.cajaegresosAux;
	}

	public void setcajaegresosAux(List<CajaEgreso> cajaegresosAux) {
		this.cajaegresosAux = cajaegresosAux;
	}
	
	public List<CajaEgreso> getcajaegresosEliminados() {
		return this.cajaegresosEliminados;
	}

	public void setCajaEgresosEliminados(List<CajaEgreso> cajaegresosEliminados) {
		this.cajaegresosEliminados = cajaegresosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCajaEgreso() {
		return jComboBoxTiposSeleccionarCajaEgreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCajaEgreso(
			JComboBox jComboBoxTiposSeleccionarCajaEgreso) {
		this.jComboBoxTiposSeleccionarCajaEgreso = jComboBoxTiposSeleccionarCajaEgreso;
	}
	
	public void setBorderResaltarTiposSeleccionarCajaEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCajaEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCajaEgreso .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCajaEgreso() {
		return jTextFieldValorCampoGeneralCajaEgreso;
	}

	public void setjTextFieldValorCampoGeneralCajaEgreso(
			JTextField jTextFieldValorCampoGeneralCajaEgreso) {
		this.jTextFieldValorCampoGeneralCajaEgreso = jTextFieldValorCampoGeneralCajaEgreso;
	}

	public void setBorderResaltarValorCampoGeneralCajaEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgreso.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCajaEgreso .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCajaEgreso() {
		return this.jCheckBoxSeleccionarTodosCajaEgreso;
	}

	public void setjCheckBoxSeleccionarTodosCajaEgreso(
			JCheckBox jCheckBoxSeleccionarTodosCajaEgreso) {
		this.jCheckBoxSeleccionarTodosCajaEgreso = jCheckBoxSeleccionarTodosCajaEgreso;
	}

	public void setBorderResaltarSeleccionarTodosCajaEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgreso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCajaEgreso .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCajaEgreso() {
		return this.jCheckBoxSeleccionadosCajaEgreso;
	}

	public void setjCheckBoxSeleccionadosCajaEgreso(
			JCheckBox jCheckBoxSeleccionadosCajaEgreso) {
		this.jCheckBoxSeleccionadosCajaEgreso = jCheckBoxSeleccionadosCajaEgreso;
	}
	
	public void setBorderResaltarSeleccionadosCajaEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgreso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCajaEgreso .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCajaEgreso() {
		return this.jComboBoxTiposArchivosReportesCajaEgreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCajaEgreso(
			JComboBox jComboBoxTiposArchivosReportesCajaEgreso) {
		this.jComboBoxTiposArchivosReportesCajaEgreso = jComboBoxTiposArchivosReportesCajaEgreso;
	}

	public void setBorderResaltarTiposArchivosReportesCajaEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCajaEgreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCajaEgreso() {
		return this.jComboBoxTiposReportesCajaEgreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCajaEgreso(
			JComboBox jComboBoxTiposReportesCajaEgreso) {
		this.jComboBoxTiposReportesCajaEgreso = jComboBoxTiposReportesCajaEgreso;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCajaEgreso() {
	//	return jComboBoxTiposReportesDinamicoCajaEgreso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCajaEgreso(
	//		JComboBox jComboBoxTiposReportesDinamicoCajaEgreso) {
	//	this.jComboBoxTiposReportesDinamicoCajaEgreso = jComboBoxTiposReportesDinamicoCajaEgreso;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCajaEgreso() {
	//	return jComboBoxTiposArchivosReportesDinamicoCajaEgreso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCajaEgreso(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCajaEgreso) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCajaEgreso = jComboBoxTiposArchivosReportesDinamicoCajaEgreso;
	//}
	
	public void setBorderResaltarTiposReportesCajaEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCajaEgreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCajaEgreso() {
		return this.jComboBoxTiposGraficosReportesCajaEgreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCajaEgreso(
			JComboBox jComboBoxTiposGraficosReportesCajaEgreso) {
		this.jComboBoxTiposGraficosReportesCajaEgreso = jComboBoxTiposGraficosReportesCajaEgreso;
	}
	
	public void setBorderResaltarTiposGraficosReportesCajaEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCajaEgreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCajaEgreso() {
		return this.jComboBoxTiposPaginacionCajaEgreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCajaEgreso(
			JComboBox jComboBoxTiposPaginacionCajaEgreso) {
		this.jComboBoxTiposPaginacionCajaEgreso = jComboBoxTiposPaginacionCajaEgreso;
	}
	
	public void setBorderResaltarTiposPaginacionCajaEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCajaEgreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCajaEgreso() {
		return this.jComboBoxTiposRelacionesCajaEgreso;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaEgreso() {
		return this.jComboBoxTiposAccionesCajaEgreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaEgreso(
			JComboBox jComboBoxTiposRelacionesCajaEgreso) {
		this.jComboBoxTiposRelacionesCajaEgreso = jComboBoxTiposRelacionesCajaEgreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaEgreso(
			JComboBox jComboBoxTiposAccionesCajaEgreso) {
		this.jComboBoxTiposAccionesCajaEgreso = jComboBoxTiposAccionesCajaEgreso;
	}
	
	public void setBorderResaltarTiposRelacionesCajaEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCajaEgreso .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCajaEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCajaEgreso .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCajaEgreso() {
	//	return jCheckBoxConGraficoDinamicoCajaEgreso;
	//}

	//public void setjCheckBoxConGraficoDinamicoCajaEgreso(
	//		JCheckBox jCheckBoxConGraficoDinamicoCajaEgreso) {
	//	this.jCheckBoxConGraficoDinamicoCajaEgreso = jCheckBoxConGraficoDinamicoCajaEgreso;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCajaEgreso() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCajaEgreso.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCajaEgreso .setBorder(borderResaltar);		
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
		this.cajaegresoSessionBean=new CajaEgresoSessionBean();
		
		this.cajaegresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaegresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajaegresoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaEgresoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Egreso MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
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
		
		CajaEgresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CajaEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCajaEgreso= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"nuevo","nuevo","Nuevo"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"duplicar","duplicar","Duplicar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"copiar","copiar","Copiar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"ver_form","ver_form","Ver"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"recargar","recargar","Recargar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCajaEgreso,this.jTtoolBarCajaEgreso,
							"cerrar","cerrar","Salir"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCajaEgreso=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCajaEgreso;
			
				this.jButtonProcesarInformacionToolBarCajaEgreso=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCajaEgreso;
				
		//protected JButton jButtonModificarToolBarCajaEgreso;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCajaEgreso=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCajaEgreso=new JMenuMe("General");
		this.jmenuArchivoCajaEgreso=new JMenuMe("Archivo");
		this.jmenuAccionesCajaEgreso=new JMenuMe("Acciones");
		this.jmenuDatosCajaEgreso=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaEgreso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaEgreso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaEgreso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCajaEgreso= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCajaEgreso.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCajaEgreso,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCajaEgreso= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCajaEgreso.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCajaEgreso,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCajaEgreso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaEgreso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaEgreso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCajaEgreso= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCajaEgreso.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCajaEgreso,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCajaEgreso= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCajaEgreso.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCajaEgreso,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCajaEgreso= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCajaEgreso.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCajaEgreso,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaEgreso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaEgreso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaEgreso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCajaEgreso= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCajaEgreso.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCajaEgreso,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCajaEgreso= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCajaEgreso.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCajaEgreso,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCajaEgreso= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCajaEgreso.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCajaEgreso,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCajaEgreso= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCajaEgreso.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCajaEgreso,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCajaEgreso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCajaEgreso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCajaEgreso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaEgreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaEgreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaEgreso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCajaEgreso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCajaEgreso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCajaEgreso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaEgreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaEgreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaEgreso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCajaEgreso= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCajaEgreso.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCajaEgreso,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCajaEgreso.add(this.jMenuItemCerrarCajaEgreso);
			
			this.jmenuAccionesCajaEgreso.add(this.jMenuItemNuevoCajaEgreso);
			this.jmenuAccionesCajaEgreso.add(this.jMenuItemNuevoGuardarCambiosCajaEgreso);
			this.jmenuAccionesCajaEgreso.add(this.jMenuItemNuevoRelacionesCajaEgreso);
			this.jmenuAccionesCajaEgreso.add(this.jMenuItemGuardarCambiosTablaCajaEgreso);		
			this.jmenuAccionesCajaEgreso.add(this.jMenuItemDuplicarCajaEgreso);		
			this.jmenuAccionesCajaEgreso.add(this.jMenuItemCopiarCajaEgreso);		
			this.jmenuAccionesCajaEgreso.add(this.jMenuItemVerFormCajaEgreso);		
			
			this.jmenuDatosCajaEgreso.add(this.jMenuItemRecargarInformacionCajaEgreso);				
			this.jmenuDatosCajaEgreso.add(this.jMenuItemAnterioresCajaEgreso);				
			this.jmenuDatosCajaEgreso.add(this.jMenuItemSiguientesCajaEgreso);				
			this.jmenuDatosCajaEgreso.add(this.jMenuItemAbrirOrderByCajaEgreso);				
			this.jmenuDatosCajaEgreso.add(this.jMenuItemMostrarOcultarCajaEgreso);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCajaEgreso.add(this.jMenuItemGuardarCambiosCajaEgreso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCajaEgreso.add(this.jmenuArchivoCajaEgreso);		
			this.jmenuBarCajaEgreso.add(this.jmenuAccionesCajaEgreso);		
			this.jmenuBarCajaEgreso.add(this.jmenuDatosCajaEgreso);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCajaEgreso);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCajaEgreso() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCajaCajaEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCajaCajaEgreso.setToolTipText("Buscar Por Caja ");
		this.jButtonFK_IdCajaCajaEgreso= new JButtonMe();
		this.jButtonFK_IdCajaCajaEgreso.setText("Buscar");
		this.jButtonFK_IdCajaCajaEgreso.setToolTipText("Buscar Por Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCajaCajaEgreso,"buscar_button","Buscar Por Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCajaCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cajaFK_IdCajaCajaEgreso = new JLabelMe();
		jLabelid_cajaFK_IdCajaCajaEgreso.setText("Caja :");
		jLabelid_cajaFK_IdCajaCajaEgreso.setToolTipText("Caja");
		jLabelid_cajaFK_IdCajaCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cajaFK_IdCajaCajaEgreso,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cajaFK_IdCajaCajaEgreso= new JComboBoxMe();
		jComboBoxid_cajaFK_IdCajaCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaFK_IdCajaCajaEgreso,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTurnoPunVenCajaEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTurnoPunVenCajaEgreso.setToolTipText("Buscar Por Turno ");
		this.jButtonFK_IdTurnoPunVenCajaEgreso= new JButtonMe();
		this.jButtonFK_IdTurnoPunVenCajaEgreso.setText("Buscar");
		this.jButtonFK_IdTurnoPunVenCajaEgreso.setToolTipText("Buscar Por Turno ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTurnoPunVenCajaEgreso,"buscar_button","Buscar Por Turno ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTurnoPunVenCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaEgreso = new JLabelMe();
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setText("Turno :");
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setToolTipText("Turno");
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_turno_pun_venFK_IdTurnoPunVenCajaEgreso,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso= new JComboBoxMe();
		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCajaEgreso=new JTabbedPane();


		this.jTabbedPaneBusquedasCajaEgreso.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajaEgreso.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajaEgreso.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCajaEgreso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCajaEgreso,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCajaEgreso = new CajaEgresoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Caja Egreso DATOS");
			this.jInternalFrameDetalleFormCajaEgreso = new CajaEgresoDetalleFormJInternalFrame(jDesktopPane,this.cajaegresoSessionBean.getConGuardarRelaciones(),this.cajaegresoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCajaEgreso = null;//new CajaEgresoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaEgreso= new GridBagLayout();
		
		
		this.jTableDatosCajaEgreso = new JTableMe();      
		
		String sToolTipCajaEgreso="";
		sToolTipCajaEgreso=CajaEgresoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaEgreso+="(PuntoVenta.CajaEgreso)";
		}
		
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaEgreso+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCajaEgreso.setToolTipText(sToolTipCajaEgreso);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCajaEgreso);
		this.jTableDatosCajaEgreso.setAutoCreateRowSorter(true);
		this.jTableDatosCajaEgreso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCajaEgreso.setRowSelectionAllowed(true);
		this.jTableDatosCajaEgreso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCajaEgreso,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCajaEgreso = new JButtonMe();
		this.jButtonDuplicarCajaEgreso = new JButtonMe();
		this.jButtonCopiarCajaEgreso = new JButtonMe();
		this.jButtonVerFormCajaEgreso = new JButtonMe();
		this.jButtonNuevoRelacionesCajaEgreso = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCajaEgreso = new JButtonMe();
		this.jButtonCerrarCajaEgreso = new JButtonMe();
		
		this.jScrollPanelDatosCajaEgreso = new JScrollPane();   
        this.jScrollPanelDatosGeneralCajaEgreso = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Egreso";
		
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egresos" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaEgreso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaEgreso.setToolTipText("Acciones");
        this.jPanelAccionesCajaEgreso.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCajaEgreso=new ReporteDinamicoJInternalFrame(CajaEgresoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCajaEgreso();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCajaEgreso=new ImportacionJInternalFrame(CajaEgresoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCajaEgreso();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCajaEgreso = new JButtonMe();
		
		this.jButtonAbrirOrderByCajaEgreso.setText("Orden");
		this.jButtonAbrirOrderByCajaEgreso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaEgreso,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaEgreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaEgreso,false,this);
			
			//this.cargarOrderByCajaEgreso(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaEgreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaEgreso,true,this);
			
			//this.cargarOrderByCajaEgreso(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCajaEgreso.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosCajaEgreso.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosCajaEgreso.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosCajaEgreso.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaEgreso.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaEgreso.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCajaEgreso.setText("Nuevo");
		this.jButtonDuplicarCajaEgreso.setText("Duplicar");
		this.jButtonCopiarCajaEgreso.setText("Copiar");
		this.jButtonVerFormCajaEgreso.setText("Ver");
		this.jButtonNuevoRelacionesCajaEgreso.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCajaEgreso.setText("Guardar");
		this.jButtonCerrarCajaEgreso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaEgreso,"nuevo_button","Nuevo",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCajaEgreso,"duplicar_button","Duplicar",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCajaEgreso,"copiar_button","Copiar",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCajaEgreso,"ver_form","Ver",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCajaEgreso,"nuevorelaciones_button","Nuevo Rel",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaEgreso,"guardarcambiostabla_button","Guardar",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaEgreso,"cerrar_button","Salir",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCajaEgreso.setToolTipText("Nuevo"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCajaEgreso.setToolTipText("Duplicar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCajaEgreso.setToolTipText("Copiar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCajaEgreso.setToolTipText("Ver"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCajaEgreso.setToolTipText("Nuevo Rel"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCajaEgreso.setToolTipText("Guardar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaEgreso.setToolTipText("Salir"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaEgreso";
		inputMap = this.jButtonNuevoCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaEgreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaEgreso"));
		
		//DUPLICAR
		sMapKey = "DuplicarCajaEgreso";
		inputMap = this.jButtonDuplicarCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCajaEgreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCajaEgreso"));
		
		//COPIAR
		sMapKey = "CopiarCajaEgreso";
		inputMap = this.jButtonCopiarCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCajaEgreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCajaEgreso"));
		
		//VEr FORM
		sMapKey = "VerFormCajaEgreso";
		inputMap = this.jButtonVerFormCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCajaEgreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCajaEgreso"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCajaEgreso";
		inputMap = this.jButtonNuevoRelacionesCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCajaEgreso"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCajaEgreso";
		inputMap = this.jButtonModificarCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCajaEgreso"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCajaEgreso";
		inputMap = this.jButtonCerrarCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaEgreso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaEgreso";
		inputMap = this.jButtonGuardarCambiosTablaCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaEgreso"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CajaEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CajaEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CajaEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CajaEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CajaEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCajaEgreso.setName("jPanelParametrosReportesCajaEgreso"); 
		
		this.jPanelParametrosReportesAccionesCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCajaEgreso.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCajaEgreso.setName("jPanelParametrosReportesAccionesCajaEgreso"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCajaEgreso = new JButtonMe();
		this.jButtonRecargarInformacionCajaEgreso.setText("Recargar");
		this.jButtonRecargarInformacionCajaEgreso.setToolTipText("Recargar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCajaEgreso,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCajaEgreso = new JButtonMe();
		this.jButtonProcesarInformacionCajaEgreso.setText("Procesar");
		this.jButtonProcesarInformacionCajaEgreso.setToolTipText("Procesar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCajaEgreso.setVisible(false);
			
		this.jButtonProcesarInformacionCajaEgreso.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaEgreso.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaEgreso.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCajaEgreso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaEgreso.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCajaEgreso.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCajaEgreso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaEgreso.setText("TIPO");       
		this.jComboBoxTiposReportesCajaEgreso.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCajaEgreso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaEgreso.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCajaEgreso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCajaEgreso = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCajaEgreso.setText("Paginacion");
		this.jComboBoxTiposPaginacionCajaEgreso.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCajaEgreso = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCajaEgreso.setText("Accion");
		this.jComboBoxTiposRelacionesCajaEgreso.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCajaEgreso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaEgreso.setText("Accion");
		this.jComboBoxTiposAccionesCajaEgreso.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCajaEgreso = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCajaEgreso.setText("Accion");
		this.jComboBoxTiposSeleccionarCajaEgreso.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCajaEgreso=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCajaEgreso.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaEgreso.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaEgreso.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCajaEgreso = new JLabelMe();
		
		this.jLabelAccionesCajaEgreso.setText("Acciones");		
		this.jLabelAccionesCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCajaEgreso = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCajaEgreso.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCajaEgreso.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCajaEgreso = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCajaEgreso.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCajaEgreso.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCajaEgreso = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCajaEgreso.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCajaEgreso.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCajaEgreso = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCajaEgreso.setText("Graf.");
		this.jCheckBoxConGraficoReporteCajaEgreso.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCajaEgreso = new JButtonMe();
		//this.jButtonAnterioresCajaEgreso.setText("<<");
        this.jButtonAnterioresCajaEgreso.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCajaEgreso,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCajaEgreso = new JButtonMe();
		//this.jButtonSiguientesCajaEgreso.setText(">>");
        this.jButtonSiguientesCajaEgreso.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCajaEgreso,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCajaEgreso = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCajaEgreso.setText("Nue");
        this.jButtonNuevoGuardarCambiosCajaEgreso.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCajaEgreso,"nuevoguardarcambios_button","Nue",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCajaEgreso";
		inputMap = this.jButtonNuevoGuardarCambiosCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCajaEgreso"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCajaEgreso";
		inputMap = this.jButtonRecargarInformacionCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCajaEgreso"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCajaEgreso";
		inputMap = this.jButtonSiguientesCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCajaEgreso"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCajaEgreso";
		inputMap = this.jButtonAnterioresCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCajaEgreso"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCajaEgreso();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCajaEgreso.setMinimumSize(new Dimension(this.getWidth(),CajaEgresoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaEgresoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaEgreso.setMaximumSize(new Dimension(this.getWidth(),CajaEgresoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaEgresoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaEgreso.setPreferredSize(new Dimension(this.getWidth(),CajaEgresoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaEgresoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCajaEgreso = new GridBagLayout();

			this.jPanelPaginacionCajaEgreso.setLayout(gridaBagLayoutPaginacionCajaEgreso);						
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = 0;
			this.gridBagConstraintsCajaEgreso.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCajaEgreso.add(this.jButtonAnterioresCajaEgreso, this.gridBagConstraintsCajaEgreso);
					
						
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaEgreso.gridy = 0;
			
			this.jPanelPaginacionCajaEgreso.add(this.jButtonNuevoGuardarCambiosCajaEgreso, this.gridBagConstraintsCajaEgreso);
						
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCajaEgreso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaEgreso.gridy = 0;
			this.jPanelPaginacionCajaEgreso.add(this.jButtonSiguientesCajaEgreso, this.gridBagConstraintsCajaEgreso);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = 1;
			this.gridBagConstraintsCajaEgreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaEgreso.add(this.jButtonNuevoCajaEgreso, this.gridBagConstraintsCajaEgreso);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
				this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCajaEgreso.gridy = 1;
				this.gridBagConstraintsCajaEgreso.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCajaEgreso.add(this.jButtonNuevoRelacionesCajaEgreso, this.gridBagConstraintsCajaEgreso);
			}
			
			
			if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
				this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCajaEgreso.gridy = 1;
				this.gridBagConstraintsCajaEgreso.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCajaEgreso.add(this.jButtonGuardarCambiosTablaCajaEgreso, this.gridBagConstraintsCajaEgreso);
			}
			
			
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = 1;
			this.gridBagConstraintsCajaEgreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaEgreso.add(this.jButtonDuplicarCajaEgreso, this.gridBagConstraintsCajaEgreso);
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = 1;
			this.gridBagConstraintsCajaEgreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaEgreso.add(this.jButtonCopiarCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = 1;
			this.gridBagConstraintsCajaEgreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaEgreso.add(this.jButtonVerFormCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = 1;
			this.gridBagConstraintsCajaEgreso.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCajaEgreso.add(this.jButtonCerrarCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
		
		
		this.jButtonRecargarInformacionCajaEgreso.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaEgreso.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaEgreso.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCajaEgreso.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaEgreso.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaEgreso.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCajaEgreso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaEgreso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaEgreso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCajaEgreso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaEgreso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaEgreso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCajaEgreso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaEgreso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaEgreso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCajaEgreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaEgreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaEgreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCajaEgreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaEgreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaEgreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCajaEgreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaEgreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaEgreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCajaEgreso.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaEgreso.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaEgreso.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCajaEgreso.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaEgreso.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaEgreso.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCajaEgreso.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaEgreso.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaEgreso.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCajaEgreso.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaEgreso.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaEgreso.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCajaEgreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCajaEgreso = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CajaEgreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CajaEgreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CajaEgreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CajaEgreso = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCajaEgreso.setLayout(gridaBagParametrosReportesCajaEgreso);
			this.jPanelParametrosReportesAccionesCajaEgreso.setLayout(gridaBagParametrosReportesAccionesCajaEgreso);
			
			
			this.jPanelParametrosAuxiliar1CajaEgreso.setLayout(gridaBagParametrosAuxiliar1CajaEgreso);
			this.jPanelParametrosAuxiliar2CajaEgreso.setLayout(gridaBagParametrosAuxiliar2CajaEgreso);
			this.jPanelParametrosAuxiliar3CajaEgreso.setLayout(gridaBagParametrosAuxiliar3CajaEgreso);
			this.jPanelParametrosAuxiliar4CajaEgreso.setLayout(gridaBagParametrosAuxiliar4CajaEgreso);
			//this.jPanelParametrosAuxiliar5CajaEgreso.setLayout(gridaBagParametrosAuxiliar2CajaEgreso);			
			
			
			
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaEgreso.add(this.jButtonRecargarInformacionCajaEgreso, this.gridBagConstraintsCajaEgreso);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaEgreso.add(this.jComboBoxTiposPaginacionCajaEgreso, this.gridBagConstraintsCajaEgreso);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaEgreso.add(this.jCheckBoxConAltoMaximoTablaCajaEgreso, this.gridBagConstraintsCajaEgreso);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaEgreso.add(this.jComboBoxTiposArchivosReportesCajaEgreso, this.gridBagConstraintsCajaEgreso);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaEgreso.add(this.jPanelParametrosAuxiliar1CajaEgreso, this.gridBagConstraintsCajaEgreso);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgreso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CajaEgreso.add(this.jComboBoxTiposReportesCajaEgreso, this.gridBagConstraintsCajaEgreso);																		
			
			
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgreso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CajaEgreso.add(this.jComboBoxTiposGraficosReportesCajaEgreso, this.gridBagConstraintsCajaEgreso);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaEgreso.add(this.jPanelParametrosAuxiliar4CajaEgreso, this.gridBagConstraintsCajaEgreso);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaEgreso.add(this.jComboBoxTiposReportesCajaEgreso, this.gridBagConstraintsCajaEgreso);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaEgreso.add(this.jCheckBoxGenerarReporteCajaEgreso, this.gridBagConstraintsCajaEgreso);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaEgreso.add(this.jPanelParametrosAuxiliar2CajaEgreso, this.gridBagConstraintsCajaEgreso);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgreso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaEgreso.add(this.jLabelAccionesCajaEgreso, this.gridBagConstraintsCajaEgreso);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
				this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCajaEgreso.add(this.jButtonAbrirOrderByCajaEgreso, this.gridBagConstraintsCajaEgreso);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaEgreso.add(this.jComboBoxTiposSeleccionarCajaEgreso, this.gridBagConstraintsCajaEgreso);			
			
			
			/*
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgreso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaEgreso.add(this.jCheckBoxSeleccionarTodosCajaEgreso, this.gridBagConstraintsCajaEgreso);
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgreso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaEgreso.add(this.jCheckBoxConGraficoReporteCajaEgreso, this.gridBagConstraintsCajaEgreso);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgreso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaEgreso.add(this.jCheckBoxSeleccionarTodosCajaEgreso, this.gridBagConstraintsCajaEgreso);															
				
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgreso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaEgreso.add(this.jCheckBoxSeleccionadosCajaEgreso, this.gridBagConstraintsCajaEgreso);															
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgreso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaEgreso.add(this.jCheckBoxConGraficoReporteCajaEgreso, this.gridBagConstraintsCajaEgreso);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaEgreso.add(this.jPanelParametrosAuxiliar3CajaEgreso, this.gridBagConstraintsCajaEgreso);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaEgreso.add(this.jComboBoxTiposRelacionesCajaEgreso, this.gridBagConstraintsCajaEgreso);
				
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaEgreso.add(this.jComboBoxTiposAccionesCajaEgreso, this.gridBagConstraintsCajaEgreso);
	
				
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaEgreso.add(this.jTextFieldValorCampoGeneralCajaEgreso, this.gridBagConstraintsCajaEgreso);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCajaEgreso = new GridBagLayout();

			this.jScrollPanelDatosCajaEgreso.setLayout(gridaBagLayoutDatosCajaEgreso);
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = 0;
			this.gridBagConstraintsCajaEgreso.gridx = 0;
			
			this.jScrollPanelDatosCajaEgreso.add(this.jTableDatosCajaEgreso, this.gridBagConstraintsCajaEgreso);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCajaEgreso.setViewportView(this.jTableDatosCajaEgreso);
		this.jTableDatosCajaEgreso.setFillsViewportHeight(true);
		this.jTableDatosCajaEgreso.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCajaEgreso= new GridBagLayout();
		this.jPanelAccionesCajaEgreso.setLayout(gridaBagLayoutAccionesCajaEgreso);
		
		
		/*	
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 0;
			
		this.jPanelAccionesCajaEgreso.add(this.jButtonNuevoCajaEgreso, this.gridBagConstraintsCajaEgreso);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCajaCajaEgreso= new GridBagLayout();
		gridaBagLayoutFK_IdCajaCajaEgreso.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCajaCajaEgreso.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCajaCajaEgreso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCajaCajaEgreso.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCajaCajaEgreso.setLayout(gridaBagLayoutFK_IdCajaCajaEgreso);

		gridBagConstraintsCajaEgreso = new GridBagConstraints();
		gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgreso.gridy = 0;
		gridBagConstraintsCajaEgreso.gridx = 0;
		jPanelFK_IdCajaCajaEgreso.add(jLabelid_cajaFK_IdCajaCajaEgreso, gridBagConstraintsCajaEgreso);

		gridBagConstraintsCajaEgreso = new GridBagConstraints();
		gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgreso.gridy = 0;
		gridBagConstraintsCajaEgreso.gridx = 1;
		jPanelFK_IdCajaCajaEgreso.add(jComboBoxid_cajaFK_IdCajaCajaEgreso, gridBagConstraintsCajaEgreso);

		gridBagConstraintsCajaEgreso = new GridBagConstraints();
		gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgreso.gridy = 1;
		gridBagConstraintsCajaEgreso.gridx =1;
		jPanelFK_IdCajaCajaEgreso.add(jButtonFK_IdCajaCajaEgreso, gridBagConstraintsCajaEgreso);

		jTabbedPaneBusquedasCajaEgreso.addTab("1.-Por Caja ", jPanelFK_IdCajaCajaEgreso);
		jTabbedPaneBusquedasCajaEgreso.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTurnoPunVenCajaEgreso= new GridBagLayout();
		gridaBagLayoutFK_IdTurnoPunVenCajaEgreso.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTurnoPunVenCajaEgreso.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTurnoPunVenCajaEgreso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTurnoPunVenCajaEgreso.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTurnoPunVenCajaEgreso.setLayout(gridaBagLayoutFK_IdTurnoPunVenCajaEgreso);

		gridBagConstraintsCajaEgreso = new GridBagConstraints();
		gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgreso.gridy = 0;
		gridBagConstraintsCajaEgreso.gridx = 0;
		jPanelFK_IdTurnoPunVenCajaEgreso.add(jLabelid_turno_pun_venFK_IdTurnoPunVenCajaEgreso, gridBagConstraintsCajaEgreso);

		gridBagConstraintsCajaEgreso = new GridBagConstraints();
		gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgreso.gridy = 0;
		gridBagConstraintsCajaEgreso.gridx = 1;
		jPanelFK_IdTurnoPunVenCajaEgreso.add(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso, gridBagConstraintsCajaEgreso);

		gridBagConstraintsCajaEgreso = new GridBagConstraints();
		gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgreso.gridy = 1;
		gridBagConstraintsCajaEgreso.gridx =1;
		jPanelFK_IdTurnoPunVenCajaEgreso.add(jButtonFK_IdTurnoPunVenCajaEgreso, gridBagConstraintsCajaEgreso);

		jTabbedPaneBusquedasCajaEgreso.addTab("2.-Por Turno ", jPanelFK_IdTurnoPunVenCajaEgreso);
		jTabbedPaneBusquedasCajaEgreso.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaEgreso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaEgreso);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();						
			this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaEgreso.gridx = 0;		
			//this.gridBagConstraintsCajaEgreso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaEgreso.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCajaEgreso, this.gridBagConstraintsCajaEgreso);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCajaEgreso.gridx = 0;		
		//this.gridBagConstraintsCajaEgreso.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCajaEgreso.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCajaEgreso);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaEgreso.gridx = 0;		
			this.gridBagConstraintsCajaEgreso.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCajaEgreso.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCajaEgreso, this.gridBagConstraintsCajaEgreso);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgreso.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCajaEgreso, this.gridBagConstraintsCajaEgreso);								
		
		
		/*
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgreso.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCajaEgreso, this.gridBagConstraintsCajaEgreso);
		*/		
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaEgreso.gridx =0;
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaEgreso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaEgreso, this.gridBagConstraintsCajaEgreso);
				
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgreso.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCajaEgreso, this.gridBagConstraintsCajaEgreso);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CajaEgresoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCajaEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaEgreso = new GridBagLayout();
			this.jPanelBusquedasParametrosCajaEgreso.setLayout(gridaBagLayoutBusquedasParametrosCajaEgreso);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCajaEgreso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaEgreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaEgreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaEgreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaEgreso, this.gridBagConstraintsCajaEgreso);
			
			
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
			
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgreso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaEgreso, this.gridBagConstraintsCajaEgreso);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCajaEgreso;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCajaEgreso() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCajaEgreso = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCajaEgreso.setName("jPanelReporteDinamicoCajaEgreso"); 
		
		this.jPanelReporteDinamicoCajaEgreso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaEgreso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaEgreso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCajaEgreso.setLayout(gridaBagLayoutReporteDinamicoCajaEgreso);
		
		
		this.jInternalFrameReporteDinamicoCajaEgreso= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCajaEgreso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaEgreso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCajaEgreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCajaEgreso.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCajaEgreso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCajaEgreso.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCajaEgreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCajaEgreso.setResizable(true);
	    this.jInternalFrameReporteDinamicoCajaEgreso.setClosable(true);
	    this.jInternalFrameReporteDinamicoCajaEgreso.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCajaEgreso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaEgreso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaEgreso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egresos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCajaEgreso = new JLabelMe();

		this.jLabelColumnasSelectReporteCajaEgreso.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaEgreso.add(this.jLabelColumnasSelectReporteCajaEgreso, this.gridBagConstraintsCajaEgreso);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCajaEgreso = new JList<Reporte>();
		this.jListColumnasSelectReporteCajaEgreso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCajaEgreso.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCajaEgreso.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaEgreso.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaEgreso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCajaEgreso=new JScrollPane(this.jListColumnasSelectReporteCajaEgreso);
			
			this.jScrollColumnasSelectReporteCajaEgreso.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaEgreso.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaEgreso.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCajaEgreso.add(this.jListColumnasSelectReporteCajaEgreso, this.gridBagConstraintsCajaEgreso);
		this.jPanelReporteDinamicoCajaEgreso.add(this.jScrollColumnasSelectReporteCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCajaEgreso = new JLabelMe();

		this.jLabelRelacionesSelectReporteCajaEgreso.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaEgreso.add(this.jLabelRelacionesSelectReporteCajaEgreso, this.gridBagConstraintsCajaEgreso);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCajaEgreso = new JList<Reporte>();
		this.jListRelacionesSelectReporteCajaEgreso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCajaEgreso.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCajaEgreso.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaEgreso.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaEgreso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCajaEgreso=new JScrollPane(this.jListRelacionesSelectReporteCajaEgreso);
			
			this.jScrollRelacionesSelectReporteCajaEgreso.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaEgreso.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaEgreso.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCajaEgreso.add(this.jListRelacionesSelectReporteCajaEgreso, this.gridBagConstraintsCajaEgreso);
		this.jPanelReporteDinamicoCajaEgreso.add(this.jScrollRelacionesSelectReporteCajaEgreso, this.gridBagConstraintsCajaEgreso);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCajaEgreso = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCajaEgreso = new JComboBoxMe();
		this.jListColumnasValoresGraficoCajaEgreso = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCajaEgreso = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCajaEgreso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCajaEgreso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaEgreso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaEgreso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCajaEgreso = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCajaEgreso.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCajaEgreso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaEgreso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaEgreso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCajaEgreso = new JLabelMe();

		this.jLabelConGraficoDinamicoCajaEgreso.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaEgreso.add(this.jLabelConGraficoDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCajaEgreso = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCajaEgreso.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCajaEgreso.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCajaEgreso.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajaEgreso.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajaEgreso.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgreso.add(this.jCheckBoxConGraficoDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCajaEgreso = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCajaEgreso.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaEgreso.add(this.jLabelColumnaCategoriaGraficoCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCajaEgreso = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajaEgreso.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCajaEgreso.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCajaEgreso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajaEgreso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajaEgreso.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCajaEgreso.add(this.jComboBoxColumnaCategoriaGraficoCajaEgreso, this.gridBagConstraintsCajaEgreso);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCajaEgreso = new JLabelMe();

		this.jLabelColumnaCategoriaValorCajaEgreso.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgreso.add(this.jLabelColumnaCategoriaValorCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCajaEgreso = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCajaEgreso.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCajaEgreso.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCajaEgreso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajaEgreso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajaEgreso.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCajaEgreso.add(this.jComboBoxColumnaCategoriaValorCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCajaEgreso = new JLabelMe();

		this.jLabelColumnasValoresGraficoCajaEgreso.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgreso.add(this.jLabelColumnasValoresGraficoCajaEgreso, this.gridBagConstraintsCajaEgreso);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCajaEgreso = new JList<Reporte>();
		this.jListColumnasValoresGraficoCajaEgreso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCajaEgreso.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCajaEgreso.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajaEgreso.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajaEgreso.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCajaEgreso=new JScrollPane(this.jListColumnasValoresGraficoCajaEgreso);
			
			this.jScrollColumnasValoresGraficoCajaEgreso.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajaEgreso.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajaEgreso.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCajaEgreso.add(this.jListColumnasSelectReporteCajaEgreso, this.gridBagConstraintsCajaEgreso);
		this.jPanelReporteDinamicoCajaEgreso.add(this.jScrollColumnasValoresGraficoCajaEgreso, this.gridBagConstraintsCajaEgreso);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCajaEgreso = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCajaEgreso.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgreso.add(this.jLabelTiposGraficosReportesDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCajaEgreso = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajaEgreso.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCajaEgreso.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCajaEgreso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajaEgreso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajaEgreso.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgreso.add(this.jComboBoxTiposGraficosReportesDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCajaEgreso = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCajaEgreso.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgreso.add(this.jLabelGenerarExcelReporteDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCajaEgreso = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCajaEgreso.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCajaEgreso,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCajaEgreso.setToolTipText("Generar EXCEL"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCajaEgreso.add(this.jButtonGenerarExcelReporteDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaEgreso.add(this.jComboBoxTiposReportesDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCajaEgreso = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCajaEgreso.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgreso.add(this.jLabelTiposArchivoReporteDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaEgreso.add(this.jComboBoxTiposArchivosReportesDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCajaEgreso = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCajaEgreso.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCajaEgreso,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCajaEgreso.setToolTipText("Generar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaEgreso.add(this.jButtonGenerarReporteDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCajaEgreso = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCajaEgreso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCajaEgreso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCajaEgreso.setToolTipText("Cancelar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaEgreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaEgreso.add(this.jButtonCerrarReporteDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCajaEgreso = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCajaEgreso= new JScrollPane(jPanelReporteDinamicoCajaEgreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCajaEgreso.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaEgreso.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaEgreso.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egresos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCajaEgreso.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCajaEgreso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCajaEgreso.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCajaEgreso);
		this.jInternalFrameReporteDinamicoCajaEgreso.getContentPane().add(this.jScrollPanelReporteDinamicoCajaEgreso, this.gridBagConstraintsCajaEgreso);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCajaEgreso() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCajaEgreso = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCajaEgreso.setName("jPanelImportacionCajaEgreso"); 
		
		this.jPanelImportacionCajaEgreso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaEgreso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaEgreso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCajaEgreso.setLayout(gridaBagLayoutImportacionCajaEgreso);
		
		
		this.jInternalFrameImportacionCajaEgreso= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCajaEgreso= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCajaEgreso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaEgreso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCajaEgreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaEgreso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaEgreso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCajaEgreso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaEgreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaEgreso.setResizable(true);
	    this.jInternalFrameImportacionCajaEgreso.setClosable(true);
	    this.jInternalFrameImportacionCajaEgreso.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCajaEgreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaEgreso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaEgreso.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCajaEgreso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaEgreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaEgreso.setResizable(true);
	    this.jInternalFrameImportacionCajaEgreso.setClosable(true);
	    this.jInternalFrameImportacionCajaEgreso.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCajaEgreso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaEgreso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaEgreso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egresos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCajaEgreso = new JLabelMe();

		this.jLabelArchivoImportacionCajaEgreso.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaEgreso.add(this.jLabelArchivoImportacionCajaEgreso, this.gridBagConstraintsCajaEgreso);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCajaEgreso = new JFileChooser();		
		this.jFileChooserImportacionCajaEgreso.setToolTipText("ESCOGER ARCHIVO"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCajaEgreso = new JButtonMe();
		this.jButtonAbrirImportacionCajaEgreso.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCajaEgreso,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCajaEgreso.setToolTipText("Generar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaEgreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaEgreso.add(this.jButtonAbrirImportacionCajaEgreso, this.gridBagConstraintsCajaEgreso);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCajaEgreso = new JLabelMe();

		this.jLabelPathArchivoImportacionCajaEgreso.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaEgreso.add(this.jLabelPathArchivoImportacionCajaEgreso, this.gridBagConstraintsCajaEgreso);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCajaEgreso=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCajaEgreso.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaEgreso.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaEgreso.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaEgreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaEgreso.add(this.jTextFieldPathArchivoImportacionCajaEgreso, this.gridBagConstraintsCajaEgreso);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCajaEgreso = new JButtonMe();
		this.jButtonGenerarImportacionCajaEgreso.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCajaEgreso,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCajaEgreso.setToolTipText("Generar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaEgreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaEgreso.add(this.jButtonGenerarImportacionCajaEgreso, this.gridBagConstraintsCajaEgreso);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCajaEgreso = new JButtonMe();
		this.jButtonCerrarImportacionCajaEgreso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCajaEgreso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCajaEgreso.setToolTipText("Cancelar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaEgreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaEgreso.add(this.jButtonCerrarImportacionCajaEgreso, this.gridBagConstraintsCajaEgreso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCajaEgreso = new GridBagLayout();
		
		this.jScrollPanelImportacionCajaEgreso= new JScrollPane(jPanelImportacionCajaEgreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy =iPosYImportacion;
		this.gridBagConstraintsCajaEgreso.gridx =iPosXImportacion;
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCajaEgreso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCajaEgreso.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCajaEgreso);
		this.jInternalFrameImportacionCajaEgreso.getContentPane().add(this.jScrollPanelImportacionCajaEgreso, this.gridBagConstraintsCajaEgreso);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCajaEgreso(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCajaEgreso = new JButtonMe();
			this.jButtonAbrirOrderByCajaEgreso.setText("Orden");
			this.jButtonAbrirOrderByCajaEgreso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaEgreso,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCajaEgreso";
			inputMap = this.jButtonAbrirOrderByCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCajaEgreso"));
		
		
			GridBagLayout gridaBagLayoutOrderByCajaEgreso = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCajaEgreso.setName("jPanelOrderByCajaEgreso"); 
			
			this.jPanelOrderByCajaEgreso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaEgreso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaEgreso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCajaEgreso.setLayout(gridaBagLayoutOrderByCajaEgreso);
			
			
			this.jTableDatosCajaEgresoOrderBy = new JTableMe();        
			this.jTableDatosCajaEgresoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCajaEgresoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCajaEgresoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCajaEgresoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCajaEgresoOrderBy.setViewportView(this.jTableDatosCajaEgresoOrderBy);
			this.jTableDatosCajaEgresoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCajaEgresoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCajaEgreso= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCajaEgreso= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCajaEgreso = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCajaEgreso= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCajaEgreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCajaEgreso.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCajaEgreso.setTitle("Orden");
			this.jInternalFrameOrderByCajaEgreso.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCajaEgreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCajaEgreso.setResizable(true);
			this.jInternalFrameOrderByCajaEgreso.setClosable(true);
			this.jInternalFrameOrderByCajaEgreso.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCajaEgreso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaEgreso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaEgreso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egresos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCajaEgreso.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCajaEgreso.ipady =150;
				
			this.jPanelOrderByCajaEgreso.add(jScrollPanelDatosCajaEgresoOrderBy, this.gridBagConstraintsCajaEgreso);//this.jTableDatosCajaEgresoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCajaEgreso = new JButtonMe();
			this.jButtonCerrarOrderByCajaEgreso.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCajaEgreso,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCajaEgreso.setToolTipText("Cancelar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCajaEgreso.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCajaEgreso.add(this.jButtonCerrarOrderByCajaEgreso, this.gridBagConstraintsCajaEgreso);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCajaEgreso = new GridBagLayout();
			
			this.jScrollPanelOrderByCajaEgreso= new JScrollPane(jPanelOrderByCajaEgreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridy =iPosYOrderBy;
			this.gridBagConstraintsCajaEgreso.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCajaEgreso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCajaEgreso.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCajaEgreso);
			
			this.jInternalFrameOrderByCajaEgreso.getContentPane().add(this.jScrollPanelOrderByCajaEgreso, this.gridBagConstraintsCajaEgreso);			
		
		} else {
			this.jButtonAbrirOrderByCajaEgreso = new JButtonMe();
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
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cajaegresoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCajaEgreso.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCajaEgreso.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCajaEgreso.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCajaEgreso.getRowHeight();//CajaEgresoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CajaEgresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaEgreso.isSelected()) {
					iHeightTable=CajaEgresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaEgresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaEgresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CajaEgresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaEgreso.isSelected()) {
					iHeightTable=CajaEgresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaEgresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaEgresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCajaEgreso.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaEgreso.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaEgreso.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCajaEgreso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaEgreso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaEgreso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCajaEgreso!=null && this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy()!=null) {
			//if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCajaEgreso.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCajaEgreso.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCajaEgreso.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCajaEgreso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaEgreso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaEgreso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cajaegresoLogic.getCajaEgresos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaegresos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CajaEgreso> TraerCajaEgresoBeans(List<CajaEgreso> cajaegresos,ArrayList<Classe> classes)throws Exception {
		try {
			for(CajaEgreso cajaegreso:cajaegresos) {
					
				if(!(CajaEgresoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CajaEgresoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cajaegreso.setsDetalleGeneralEntityReporte(CajaEgresoConstantesFunciones.getCajaEgresoDescripcion(cajaegreso));
										
						
					
					

					if(cajaegreso.getCajaEgresoDetalles()!=null && Funciones.existeClass(classes,CajaEgresoDetalle.class)) {
						try{cajaegreso.setcajaegresodetallesDescripcionReporte(new JRBeanCollectionDataSource(CajaEgresoDetalleJInternalFrame.TraerCajaEgresoDetalleBeans(cajaegreso.getCajaEgresoDetalles(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//cajaegreso.setsDetalleGeneralEntityReporte(cajaegreso.getsDetalleGeneralEntityReporte());
										
				}
				
				//cajaegresobeans.add(cajaegresobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cajaegresos;
    }
	//PARA REPORTES FIN
}
