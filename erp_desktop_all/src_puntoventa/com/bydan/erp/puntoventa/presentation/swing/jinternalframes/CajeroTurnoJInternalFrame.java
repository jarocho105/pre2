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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

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
import com.bydan.erp.puntoventa.util.CajeroTurnoConstantesFunciones;

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
public class CajeroTurnoJInternalFrame extends CajeroTurnoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCajeroTurno;
	
	protected JMenuBar jmenuBarCajeroTurno;
	
	protected JMenu jmenuCajeroTurno;
	protected JMenu jmenuDatosCajeroTurno;
	protected JMenu jmenuArchivoCajeroTurno;
	protected JMenu jmenuAccionesCajeroTurno;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajeroTurno;	
	protected GridBagConstraints gridBagConstraintsCajeroTurno;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CajeroTurnoDetalleFormJInternalFrame jInternalFrameDetalleFormCajeroTurno;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCajeroTurno;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCajeroTurno;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected MesaBeanSwingJInternalFrame mesaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesa="";

	protected TurnoPunVenBeanSwingJInternalFrame turnopunvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_turnopunven="";
	
	public CajeroTurnoSessionBean cajeroturnoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public CajaSessionBean cajaSessionBean;
	public MesaSessionBean mesaSessionBean;
	public TurnoPunVenSessionBean turnopunvenSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CajeroTurno> cajeroturnos;		
	public List<CajeroTurno> cajeroturnosEliminados;	
	public List<CajeroTurno> cajeroturnosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCajeroTurno;		
	protected JButton jButtonAbrirOrderByCajeroTurno;
	
	
	//protected JPanel jPanelOrderByCajeroTurno;
	//public JScrollPane jScrollPanelOrderByCajeroTurno;	
	//protected JButton jButtonCerrarOrderByCajeroTurno;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CajeroTurnoLogic cajeroturnoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCajeroTurno;
	public JScrollPane jScrollPanelDatosEdicionCajeroTurno;
	public JScrollPane jScrollPanelDatosGeneralCajeroTurno;
    
	
	
	//public JScrollPane jScrollPanelDatosCajeroTurnoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCajeroTurno;
	//public JScrollPane jScrollPanelImportacionCajeroTurno;
	
	
	
	protected JPanel jPanelAccionesCajeroTurno;
	
    protected JPanel jPanelPaginacionCajeroTurno;
    protected JPanel jPanelParametrosReportesCajeroTurno;
	protected JPanel jPanelParametrosReportesAccionesCajeroTurno;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CajeroTurno;
	protected JPanel jPanelParametrosAuxiliar2CajeroTurno;
	protected JPanel jPanelParametrosAuxiliar3CajeroTurno;
	protected JPanel jPanelParametrosAuxiliar4CajeroTurno;
	//protected JPanel jPanelParametrosAuxiliar5CajeroTurno;
	
	
	
	//protected JPanel jPanelReporteDinamicoCajeroTurno;
	//protected JPanel jPanelImportacionCajeroTurno;
	
	
	public JTable jTableDatosCajeroTurno;
	
	
	
	//public JTable jTableDatosCajeroTurnoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCajeroTurno;
	protected JButton jButtonDuplicarCajeroTurno;
	protected JButton jButtonCopiarCajeroTurno;
	protected JButton jButtonVerFormCajeroTurno;
	protected JButton jButtonNuevoRelacionesCajeroTurno;
	protected JButton jButtonModificarCajeroTurno;
	
    protected JButton jButtonGuardarCambiosTablaCajeroTurno;
	protected JButton jButtonCerrarCajeroTurno;
	
	
	protected JButton jButtonRecargarInformacionCajeroTurno;
	protected JButton jButtonProcesarInformacionCajeroTurno;
	
	
	protected JButton jButtonAnterioresCajeroTurno;
	protected JButton jButtonSiguientesCajeroTurno;
	protected JButton jButtonNuevoGuardarCambiosCajeroTurno;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCajeroTurno;
	//protected JButton jButtonCerrarReporteDinamicoCajeroTurno;
	//protected JButton jButtonGenerarExcelReporteDinamicoCajeroTurno;	
	
	
	
	//protected JButton jButtonAbrirImportacionCajeroTurno;
	//protected JButton jButtonGenerarImportacionCajeroTurno;
	//protected JButton jButtonCerrarImportacionCajeroTurno;
	//protected JFileChooser jFileChooserImportacionCajeroTurno;
	//protected File fileImportacionCajeroTurno;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajeroTurno;
	protected JButton jButtonDuplicarToolBarCajeroTurno;
	protected JButton jButtonNuevoRelacionesToolBarCajeroTurno;
	
	
	public JButton jButtonGuardarCambiosToolBarCajeroTurno;
	protected JButton jButtonCopiarToolBarCajeroTurno;
	protected JButton jButtonVerFormToolBarCajeroTurno;
	public JButton jButtonGuardarCambiosTablaToolBarCajeroTurno;
	protected JButton jButtonMostrarOcultarTablaToolBarCajeroTurno;
	protected JButton jButtonCerrarToolBarCajeroTurno;
	
	protected JButton jButtonRecargarInformacionToolBarCajeroTurno;
	protected JButton jButtonProcesarInformacionToolBarCajeroTurno;
	protected JButton jButtonAnterioresToolBarCajeroTurno;
	protected JButton jButtonSiguientesToolBarCajeroTurno;
	protected JButton jButtonNuevoGuardarCambiosToolBarCajeroTurno;
	protected JButton jButtonAbrirOrderByToolBarCajeroTurno;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajeroTurno;
	protected JMenuItem jMenuItemDuplicarCajeroTurno;
	protected JMenuItem jMenuItemNuevoRelacionesCajeroTurno;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCajeroTurno;
	protected JMenuItem jMenuItemCopiarCajeroTurno;
	protected JMenuItem jMenuItemVerFormCajeroTurno;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajeroTurno;
	protected JMenuItem jMenuItemCerrarCajeroTurno;
	protected JMenuItem jMenuItemDetalleCerrarCajeroTurno;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCajeroTurno;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajeroTurno;
	
	protected JMenuItem jMenuItemRecargarInformacionCajeroTurno;
	protected JMenuItem jMenuItemProcesarInformacionCajeroTurno;
	protected JMenuItem jMenuItemAnterioresCajeroTurno;
	protected JMenuItem jMenuItemSiguientesCajeroTurno;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajeroTurno;
	protected JMenuItem jMenuItemAbrirOrderByCajeroTurno;
	protected JMenuItem jMenuItemMostrarOcultarCajeroTurno;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajeroTurno;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCajeroTurno;
	protected JCheckBox jCheckBoxSeleccionadosCajeroTurno;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCajeroTurno;
	protected JCheckBox jCheckBoxConGraficoReporteCajeroTurno;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCajeroTurno;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCajeroTurno;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCajeroTurno;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCajeroTurno;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCajeroTurno;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCajeroTurno;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajeroTurno;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajeroTurno;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCajeroTurno;
	protected JTextField jTextFieldValorCampoGeneralCajeroTurno;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCajeroTurno;
	//public JList<Reporte> jListColumnasSelectReporteCajeroTurno;
	//public JScrollPane jScrollColumnasSelectReporteCajeroTurno;
	
	//public JLabel jLabelRelacionesSelectReporteCajeroTurno;
	//public JList<Reporte> jListRelacionesSelectReporteCajeroTurno;
	//public JScrollPane jScrollRelacionesSelectReporteCajeroTurno;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCajeroTurno;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCajeroTurno;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCajeroTurno;
	//public JLabel jLabelTiposArchivoReporteDinamicoCajeroTurno;
	
		
	//public JLabel jLabelArchivoImportacionCajeroTurno;	
	//public JLabel jLabelPathArchivoImportacionCajeroTurno;
	//protected JTextField jTextFieldPathArchivoImportacionCajeroTurno;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCajeroTurno;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCajeroTurno;
	
	//public JLabel jLabelColumnaCategoriaValorCajeroTurno;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCajeroTurno;
	
	//public JLabel jLabelColumnasValoresGraficoCajeroTurno;
	//public JList<Reporte> jListColumnasValoresGraficoCajeroTurno;
	//public JScrollPane jScrollColumnasValoresGraficoCajeroTurno;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCajeroTurno;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCajeroTurno;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCajeroTurno;
	public JPanel jPanelFK_IdCajaCajeroTurno;
	public JButton jButtonFK_IdCajaCajeroTurno;
	public JPanel jPanelFK_IdMesaCajeroTurno;
	public JButton jButtonFK_IdMesaCajeroTurno;
	public JPanel jPanelFK_IdTurnoPunVenCajeroTurno;
	public JButton jButtonFK_IdTurnoPunVenCajeroTurno;
	public JPanel jPanelFK_IdVendedorCajeroTurno;
	public JButton jButtonFK_IdVendedorCajeroTurno;
	
	public JPanel jPanelid_cajaFK_IdCajaCajeroTurno;
	public JLabel jLabelid_cajaFK_IdCajaCajeroTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaFK_IdCajaCajeroTurno;
	public JButton jButtonid_cajaFK_IdCajaCajeroTurno= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaCajeroTurnoUpdate= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaCajeroTurnoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesaFK_IdMesaCajeroTurno;
	public JLabel jLabelid_mesaFK_IdMesaCajeroTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesaFK_IdMesaCajeroTurno;
	public JButton jButtonid_mesaFK_IdMesaCajeroTurno= new JButtonMe();
	public JButton jButtonid_mesaFK_IdMesaCajeroTurnoUpdate= new JButtonMe();
	public JButton jButtonid_mesaFK_IdMesaCajeroTurnoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_turno_pun_venFK_IdTurnoPunVenCajeroTurno;
	public JLabel jLabelid_turno_pun_venFK_IdTurnoPunVenCajeroTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno;
	public JButton jButtonid_turno_pun_venFK_IdTurnoPunVenCajeroTurno= new JButtonMe();
	public JButton jButtonid_turno_pun_venFK_IdTurnoPunVenCajeroTurnoUpdate= new JButtonMe();
	public JButton jButtonid_turno_pun_venFK_IdTurnoPunVenCajeroTurnoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorCajeroTurno;
	public JLabel jLabelid_vendedorFK_IdVendedorCajeroTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorCajeroTurno;
	public JButton jButtonid_vendedorFK_IdVendedorCajeroTurno= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorCajeroTurnoUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorCajeroTurnoBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorCajeroTurnoArbol= new JButtonMe();

	
	
	
	
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
	public CajeroTurnoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CajeroTurno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajeroTurnoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajeroTurno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajeroTurnoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajeroTurno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajeroTurnoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajeroTurno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCajeroTurno)	{
		this.jButtonRecargarInformacionCajeroTurno = jButtonRecargarInformacionCajeroTurno;
	}
	
	public JButton getjButtonProcesarInformacionCajeroTurno() {
		return this.jButtonProcesarInformacionCajeroTurno;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajeroTurno)	{
		this.jButtonProcesarInformacionCajeroTurno = jButtonProcesarInformacionCajeroTurno;
	}
	
	
	public JButton getjButtonRecargarInformacionCajeroTurno() {
		return this.jButtonRecargarInformacionCajeroTurno;
	}
	
	
	public List<CajeroTurno> getcajeroturnos() {
		return this.cajeroturnos;
	}

	public void setcajeroturnos(List<CajeroTurno> cajeroturnos) {
		this.cajeroturnos = cajeroturnos;
	}
	
	public List<CajeroTurno> getcajeroturnosAux() {
		return this.cajeroturnosAux;
	}

	public void setcajeroturnosAux(List<CajeroTurno> cajeroturnosAux) {
		this.cajeroturnosAux = cajeroturnosAux;
	}
	
	public List<CajeroTurno> getcajeroturnosEliminados() {
		return this.cajeroturnosEliminados;
	}

	public void setCajeroTurnosEliminados(List<CajeroTurno> cajeroturnosEliminados) {
		this.cajeroturnosEliminados = cajeroturnosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCajeroTurno() {
		return jComboBoxTiposSeleccionarCajeroTurno;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCajeroTurno(
			JComboBox jComboBoxTiposSeleccionarCajeroTurno) {
		this.jComboBoxTiposSeleccionarCajeroTurno = jComboBoxTiposSeleccionarCajeroTurno;
	}
	
	public void setBorderResaltarTiposSeleccionarCajeroTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCajeroTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCajeroTurno .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCajeroTurno() {
		return jTextFieldValorCampoGeneralCajeroTurno;
	}

	public void setjTextFieldValorCampoGeneralCajeroTurno(
			JTextField jTextFieldValorCampoGeneralCajeroTurno) {
		this.jTextFieldValorCampoGeneralCajeroTurno = jTextFieldValorCampoGeneralCajeroTurno;
	}

	public void setBorderResaltarValorCampoGeneralCajeroTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeroTurno.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCajeroTurno .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCajeroTurno() {
		return this.jCheckBoxSeleccionarTodosCajeroTurno;
	}

	public void setjCheckBoxSeleccionarTodosCajeroTurno(
			JCheckBox jCheckBoxSeleccionarTodosCajeroTurno) {
		this.jCheckBoxSeleccionarTodosCajeroTurno = jCheckBoxSeleccionarTodosCajeroTurno;
	}

	public void setBorderResaltarSeleccionarTodosCajeroTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeroTurno.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCajeroTurno .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCajeroTurno() {
		return this.jCheckBoxSeleccionadosCajeroTurno;
	}

	public void setjCheckBoxSeleccionadosCajeroTurno(
			JCheckBox jCheckBoxSeleccionadosCajeroTurno) {
		this.jCheckBoxSeleccionadosCajeroTurno = jCheckBoxSeleccionadosCajeroTurno;
	}
	
	public void setBorderResaltarSeleccionadosCajeroTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeroTurno.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCajeroTurno .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCajeroTurno() {
		return this.jComboBoxTiposArchivosReportesCajeroTurno;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCajeroTurno(
			JComboBox jComboBoxTiposArchivosReportesCajeroTurno) {
		this.jComboBoxTiposArchivosReportesCajeroTurno = jComboBoxTiposArchivosReportesCajeroTurno;
	}

	public void setBorderResaltarTiposArchivosReportesCajeroTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeroTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCajeroTurno .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCajeroTurno() {
		return this.jComboBoxTiposReportesCajeroTurno;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCajeroTurno(
			JComboBox jComboBoxTiposReportesCajeroTurno) {
		this.jComboBoxTiposReportesCajeroTurno = jComboBoxTiposReportesCajeroTurno;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCajeroTurno() {
	//	return jComboBoxTiposReportesDinamicoCajeroTurno;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCajeroTurno(
	//		JComboBox jComboBoxTiposReportesDinamicoCajeroTurno) {
	//	this.jComboBoxTiposReportesDinamicoCajeroTurno = jComboBoxTiposReportesDinamicoCajeroTurno;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCajeroTurno() {
	//	return jComboBoxTiposArchivosReportesDinamicoCajeroTurno;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCajeroTurno(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCajeroTurno) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCajeroTurno = jComboBoxTiposArchivosReportesDinamicoCajeroTurno;
	//}
	
	public void setBorderResaltarTiposReportesCajeroTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeroTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCajeroTurno .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCajeroTurno() {
		return this.jComboBoxTiposGraficosReportesCajeroTurno;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCajeroTurno(
			JComboBox jComboBoxTiposGraficosReportesCajeroTurno) {
		this.jComboBoxTiposGraficosReportesCajeroTurno = jComboBoxTiposGraficosReportesCajeroTurno;
	}
	
	public void setBorderResaltarTiposGraficosReportesCajeroTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeroTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCajeroTurno .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCajeroTurno() {
		return this.jComboBoxTiposPaginacionCajeroTurno;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCajeroTurno(
			JComboBox jComboBoxTiposPaginacionCajeroTurno) {
		this.jComboBoxTiposPaginacionCajeroTurno = jComboBoxTiposPaginacionCajeroTurno;
	}
	
	public void setBorderResaltarTiposPaginacionCajeroTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeroTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCajeroTurno .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCajeroTurno() {
		return this.jComboBoxTiposRelacionesCajeroTurno;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajeroTurno() {
		return this.jComboBoxTiposAccionesCajeroTurno;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajeroTurno(
			JComboBox jComboBoxTiposRelacionesCajeroTurno) {
		this.jComboBoxTiposRelacionesCajeroTurno = jComboBoxTiposRelacionesCajeroTurno;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajeroTurno(
			JComboBox jComboBoxTiposAccionesCajeroTurno) {
		this.jComboBoxTiposAccionesCajeroTurno = jComboBoxTiposAccionesCajeroTurno;
	}
	
	public void setBorderResaltarTiposRelacionesCajeroTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeroTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCajeroTurno .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCajeroTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeroTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCajeroTurno .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCajeroTurno() {
	//	return jCheckBoxConGraficoDinamicoCajeroTurno;
	//}

	//public void setjCheckBoxConGraficoDinamicoCajeroTurno(
	//		JCheckBox jCheckBoxConGraficoDinamicoCajeroTurno) {
	//	this.jCheckBoxConGraficoDinamicoCajeroTurno = jCheckBoxConGraficoDinamicoCajeroTurno;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCajeroTurno() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCajeroTurno.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCajeroTurno .setBorder(borderResaltar);		
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
		this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		
		this.cajeroturnoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajeroturnoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajeroturnoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajeroTurnoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cajero Turno MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
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
		
		CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CajeroTurno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCajeroTurno= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"nuevo","nuevo","Nuevo"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"duplicar","duplicar","Duplicar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"copiar","copiar","Copiar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"ver_form","ver_form","Ver"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"recargar","recargar","Recargar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCajeroTurno,this.jTtoolBarCajeroTurno,
							"cerrar","cerrar","Salir"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCajeroTurno=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCajeroTurno;
			
				this.jButtonProcesarInformacionToolBarCajeroTurno=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCajeroTurno;
				
		//protected JButton jButtonModificarToolBarCajeroTurno;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCajeroTurno=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCajeroTurno=new JMenuMe("General");
		this.jmenuArchivoCajeroTurno=new JMenuMe("Archivo");
		this.jmenuAccionesCajeroTurno=new JMenuMe("Acciones");
		this.jmenuDatosCajeroTurno=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajeroTurno= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajeroTurno.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajeroTurno,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCajeroTurno= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCajeroTurno.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCajeroTurno,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCajeroTurno= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCajeroTurno.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCajeroTurno,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCajeroTurno= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajeroTurno.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajeroTurno,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCajeroTurno= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCajeroTurno.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCajeroTurno,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCajeroTurno= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCajeroTurno.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCajeroTurno,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCajeroTurno= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCajeroTurno.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCajeroTurno,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajeroTurno= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajeroTurno.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajeroTurno,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCajeroTurno= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCajeroTurno.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCajeroTurno,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCajeroTurno= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCajeroTurno.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCajeroTurno,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCajeroTurno= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCajeroTurno.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCajeroTurno,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCajeroTurno= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCajeroTurno.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCajeroTurno,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCajeroTurno= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCajeroTurno.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCajeroTurno,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajeroTurno= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajeroTurno.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajeroTurno,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCajeroTurno= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCajeroTurno.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCajeroTurno,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajeroTurno= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajeroTurno.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajeroTurno,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCajeroTurno= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCajeroTurno.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCajeroTurno,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCajeroTurno.add(this.jMenuItemCerrarCajeroTurno);
			
			this.jmenuAccionesCajeroTurno.add(this.jMenuItemNuevoCajeroTurno);
			this.jmenuAccionesCajeroTurno.add(this.jMenuItemNuevoGuardarCambiosCajeroTurno);
			this.jmenuAccionesCajeroTurno.add(this.jMenuItemNuevoRelacionesCajeroTurno);
			this.jmenuAccionesCajeroTurno.add(this.jMenuItemGuardarCambiosTablaCajeroTurno);		
			this.jmenuAccionesCajeroTurno.add(this.jMenuItemDuplicarCajeroTurno);		
			this.jmenuAccionesCajeroTurno.add(this.jMenuItemCopiarCajeroTurno);		
			this.jmenuAccionesCajeroTurno.add(this.jMenuItemVerFormCajeroTurno);		
			
			this.jmenuDatosCajeroTurno.add(this.jMenuItemRecargarInformacionCajeroTurno);				
			this.jmenuDatosCajeroTurno.add(this.jMenuItemAnterioresCajeroTurno);				
			this.jmenuDatosCajeroTurno.add(this.jMenuItemSiguientesCajeroTurno);				
			this.jmenuDatosCajeroTurno.add(this.jMenuItemAbrirOrderByCajeroTurno);				
			this.jmenuDatosCajeroTurno.add(this.jMenuItemMostrarOcultarCajeroTurno);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCajeroTurno.add(this.jMenuItemGuardarCambiosCajeroTurno);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCajeroTurno.add(this.jmenuArchivoCajeroTurno);		
			this.jmenuBarCajeroTurno.add(this.jmenuAccionesCajeroTurno);		
			this.jmenuBarCajeroTurno.add(this.jmenuDatosCajeroTurno);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCajeroTurno);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCajeroTurno() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCajaCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCajaCajeroTurno.setToolTipText("Buscar Por Caja ");
		this.jButtonFK_IdCajaCajeroTurno= new JButtonMe();
		this.jButtonFK_IdCajaCajeroTurno.setText("Buscar");
		this.jButtonFK_IdCajaCajeroTurno.setToolTipText("Buscar Por Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCajaCajeroTurno,"buscar_button","Buscar Por Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCajaCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cajaFK_IdCajaCajeroTurno = new JLabelMe();
		jLabelid_cajaFK_IdCajaCajeroTurno.setText("Caja :");
		jLabelid_cajaFK_IdCajaCajeroTurno.setToolTipText("Caja");
		jLabelid_cajaFK_IdCajaCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cajaFK_IdCajaCajeroTurno,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cajaFK_IdCajaCajeroTurno= new JComboBoxMe();
		jComboBoxid_cajaFK_IdCajaCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaFK_IdCajaCajeroTurno,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesaCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesaCajeroTurno.setToolTipText("Buscar Por Mesa ");
		this.jButtonFK_IdMesaCajeroTurno= new JButtonMe();
		this.jButtonFK_IdMesaCajeroTurno.setText("Buscar");
		this.jButtonFK_IdMesaCajeroTurno.setToolTipText("Buscar Por Mesa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesaCajeroTurno,"buscar_button","Buscar Por Mesa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesaCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesaFK_IdMesaCajeroTurno = new JLabelMe();
		jLabelid_mesaFK_IdMesaCajeroTurno.setText("Mesa :");
		jLabelid_mesaFK_IdMesaCajeroTurno.setToolTipText("Mesa");
		jLabelid_mesaFK_IdMesaCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesaFK_IdMesaCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesaFK_IdMesaCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesaFK_IdMesaCajeroTurno,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesaFK_IdMesaCajeroTurno= new JComboBoxMe();
		jComboBoxid_mesaFK_IdMesaCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaFK_IdMesaCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaFK_IdMesaCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesaFK_IdMesaCajeroTurno,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTurnoPunVenCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTurnoPunVenCajeroTurno.setToolTipText("Buscar Por Turno ");
		this.jButtonFK_IdTurnoPunVenCajeroTurno= new JButtonMe();
		this.jButtonFK_IdTurnoPunVenCajeroTurno.setText("Buscar");
		this.jButtonFK_IdTurnoPunVenCajeroTurno.setToolTipText("Buscar Por Turno ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTurnoPunVenCajeroTurno,"buscar_button","Buscar Por Turno ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTurnoPunVenCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajeroTurno = new JLabelMe();
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setText("Turno :");
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setToolTipText("Turno");
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_turno_pun_venFK_IdTurnoPunVenCajeroTurno,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno= new JComboBoxMe();
		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorCajeroTurno.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorCajeroTurno= new JButtonMe();
		this.jButtonFK_IdVendedorCajeroTurno.setText("Buscar");
		this.jButtonFK_IdVendedorCajeroTurno.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorCajeroTurno,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorCajeroTurno = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorCajeroTurno.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorCajeroTurno.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorCajeroTurno,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorCajeroTurno= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorCajeroTurno,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCajeroTurno=new JTabbedPane();


		this.jTabbedPaneBusquedasCajeroTurno.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajeroTurno.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajeroTurno.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCajeroTurno.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCajeroTurno,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCajeroTurno = new CajeroTurnoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cajero Turno DATOS");
			this.jInternalFrameDetalleFormCajeroTurno = new CajeroTurnoDetalleFormJInternalFrame(jDesktopPane,this.cajeroturnoSessionBean.getConGuardarRelaciones(),this.cajeroturnoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCajeroTurno = null;//new CajeroTurnoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajeroTurno= new GridBagLayout();
		
		
		this.jTableDatosCajeroTurno = new JTableMe();      
		
		String sToolTipCajeroTurno="";
		sToolTipCajeroTurno=CajeroTurnoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajeroTurno+="(PuntoVenta.CajeroTurno)";
		}
		
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajeroTurno+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCajeroTurno.setToolTipText(sToolTipCajeroTurno);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCajeroTurno);
		this.jTableDatosCajeroTurno.setAutoCreateRowSorter(true);
		this.jTableDatosCajeroTurno.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCajeroTurno.setRowSelectionAllowed(true);
		this.jTableDatosCajeroTurno.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCajeroTurno,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCajeroTurno = new JButtonMe();
		this.jButtonDuplicarCajeroTurno = new JButtonMe();
		this.jButtonCopiarCajeroTurno = new JButtonMe();
		this.jButtonVerFormCajeroTurno = new JButtonMe();
		this.jButtonNuevoRelacionesCajeroTurno = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCajeroTurno = new JButtonMe();
		this.jButtonCerrarCajeroTurno = new JButtonMe();
		
		this.jScrollPanelDatosCajeroTurno = new JScrollPane();   
        this.jScrollPanelDatosGeneralCajeroTurno = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cajero Turno";
		
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajero Turnos" + this.sPath));
		} else {
			this.jScrollPanelDatosCajeroTurno.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajeroTurno.setToolTipText("Acciones");
        this.jPanelAccionesCajeroTurno.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCajeroTurno=new ReporteDinamicoJInternalFrame(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCajeroTurno();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCajeroTurno=new ImportacionJInternalFrame(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCajeroTurno();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCajeroTurno = new JButtonMe();
		
		this.jButtonAbrirOrderByCajeroTurno.setText("Orden");
		this.jButtonAbrirOrderByCajeroTurno.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajeroTurno,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajeroTurno=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajeroTurno,false,this);
			
			//this.cargarOrderByCajeroTurno(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajeroTurno=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajeroTurno,true,this);
			
			//this.cargarOrderByCajeroTurno(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCajeroTurno.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosCajeroTurno.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosCajeroTurno.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosCajeroTurno.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajeroTurno.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajeroTurno.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCajeroTurno.setText("Nuevo");
		this.jButtonDuplicarCajeroTurno.setText("Duplicar");
		this.jButtonCopiarCajeroTurno.setText("Copiar");
		this.jButtonVerFormCajeroTurno.setText("Ver");
		this.jButtonNuevoRelacionesCajeroTurno.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCajeroTurno.setText("Guardar");
		this.jButtonCerrarCajeroTurno.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajeroTurno,"nuevo_button","Nuevo",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCajeroTurno,"duplicar_button","Duplicar",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCajeroTurno,"copiar_button","Copiar",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCajeroTurno,"ver_form","Ver",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCajeroTurno,"nuevorelaciones_button","Nuevo Rel",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajeroTurno,"guardarcambiostabla_button","Guardar",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajeroTurno,"cerrar_button","Salir",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCajeroTurno.setToolTipText("Nuevo"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCajeroTurno.setToolTipText("Duplicar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCajeroTurno.setToolTipText("Copiar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCajeroTurno.setToolTipText("Ver"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCajeroTurno.setToolTipText("Nuevo Rel"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCajeroTurno.setToolTipText("Guardar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajeroTurno.setToolTipText("Salir"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajeroTurno";
		inputMap = this.jButtonNuevoCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajeroTurno.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajeroTurno"));
		
		//DUPLICAR
		sMapKey = "DuplicarCajeroTurno";
		inputMap = this.jButtonDuplicarCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCajeroTurno.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCajeroTurno"));
		
		//COPIAR
		sMapKey = "CopiarCajeroTurno";
		inputMap = this.jButtonCopiarCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCajeroTurno.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCajeroTurno"));
		
		//VEr FORM
		sMapKey = "VerFormCajeroTurno";
		inputMap = this.jButtonVerFormCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCajeroTurno.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCajeroTurno"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCajeroTurno";
		inputMap = this.jButtonNuevoRelacionesCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCajeroTurno"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCajeroTurno";
		inputMap = this.jButtonModificarCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCajeroTurno"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCajeroTurno";
		inputMap = this.jButtonCerrarCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajeroTurno"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajeroTurno";
		inputMap = this.jButtonGuardarCambiosTablaCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajeroTurno"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CajeroTurno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CajeroTurno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CajeroTurno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CajeroTurno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CajeroTurno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCajeroTurno.setName("jPanelParametrosReportesCajeroTurno"); 
		
		this.jPanelParametrosReportesAccionesCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCajeroTurno.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCajeroTurno.setName("jPanelParametrosReportesAccionesCajeroTurno"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCajeroTurno = new JButtonMe();
		this.jButtonRecargarInformacionCajeroTurno.setText("Recargar");
		this.jButtonRecargarInformacionCajeroTurno.setToolTipText("Recargar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCajeroTurno,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCajeroTurno = new JButtonMe();
		this.jButtonProcesarInformacionCajeroTurno.setText("Procesar");
		this.jButtonProcesarInformacionCajeroTurno.setToolTipText("Procesar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCajeroTurno.setVisible(false);
			
		this.jButtonProcesarInformacionCajeroTurno.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajeroTurno.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajeroTurno.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCajeroTurno = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajeroTurno.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCajeroTurno.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCajeroTurno = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajeroTurno.setText("TIPO");       
		this.jComboBoxTiposReportesCajeroTurno.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCajeroTurno = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajeroTurno.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCajeroTurno.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCajeroTurno = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCajeroTurno.setText("Paginacion");
		this.jComboBoxTiposPaginacionCajeroTurno.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCajeroTurno = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCajeroTurno.setText("Accion");
		this.jComboBoxTiposRelacionesCajeroTurno.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCajeroTurno = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajeroTurno.setText("Accion");
		this.jComboBoxTiposAccionesCajeroTurno.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCajeroTurno = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCajeroTurno.setText("Accion");
		this.jComboBoxTiposSeleccionarCajeroTurno.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCajeroTurno=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCajeroTurno.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajeroTurno.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajeroTurno.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCajeroTurno = new JLabelMe();
		
		this.jLabelAccionesCajeroTurno.setText("Acciones");		
		this.jLabelAccionesCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCajeroTurno = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCajeroTurno.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCajeroTurno.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCajeroTurno = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCajeroTurno.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCajeroTurno.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCajeroTurno = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCajeroTurno.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCajeroTurno.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCajeroTurno = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCajeroTurno.setText("Graf.");
		this.jCheckBoxConGraficoReporteCajeroTurno.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCajeroTurno = new JButtonMe();
		//this.jButtonAnterioresCajeroTurno.setText("<<");
        this.jButtonAnterioresCajeroTurno.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCajeroTurno,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCajeroTurno = new JButtonMe();
		//this.jButtonSiguientesCajeroTurno.setText(">>");
        this.jButtonSiguientesCajeroTurno.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCajeroTurno,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCajeroTurno = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCajeroTurno.setText("Nue");
        this.jButtonNuevoGuardarCambiosCajeroTurno.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCajeroTurno,"nuevoguardarcambios_button","Nue",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCajeroTurno";
		inputMap = this.jButtonNuevoGuardarCambiosCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCajeroTurno"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCajeroTurno";
		inputMap = this.jButtonRecargarInformacionCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCajeroTurno"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCajeroTurno";
		inputMap = this.jButtonSiguientesCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCajeroTurno"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCajeroTurno";
		inputMap = this.jButtonAnterioresCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCajeroTurno"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCajeroTurno();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCajeroTurno.setMinimumSize(new Dimension(this.getWidth(),CajeroTurnoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajeroTurnoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajeroTurno.setMaximumSize(new Dimension(this.getWidth(),CajeroTurnoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajeroTurnoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajeroTurno.setPreferredSize(new Dimension(this.getWidth(),CajeroTurnoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajeroTurnoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCajeroTurno = new GridBagLayout();

			this.jPanelPaginacionCajeroTurno.setLayout(gridaBagLayoutPaginacionCajeroTurno);						
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy = 0;
			this.gridBagConstraintsCajeroTurno.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCajeroTurno.add(this.jButtonAnterioresCajeroTurno, this.gridBagConstraintsCajeroTurno);
					
						
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajeroTurno.gridy = 0;
			
			this.jPanelPaginacionCajeroTurno.add(this.jButtonNuevoGuardarCambiosCajeroTurno, this.gridBagConstraintsCajeroTurno);
						
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCajeroTurno.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajeroTurno.gridy = 0;
			this.jPanelPaginacionCajeroTurno.add(this.jButtonSiguientesCajeroTurno, this.gridBagConstraintsCajeroTurno);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy = 1;
			this.gridBagConstraintsCajeroTurno.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajeroTurno.add(this.jButtonNuevoCajeroTurno, this.gridBagConstraintsCajeroTurno);
						
			
			
			if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
				this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCajeroTurno.gridy = 1;
				this.gridBagConstraintsCajeroTurno.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCajeroTurno.add(this.jButtonGuardarCambiosTablaCajeroTurno, this.gridBagConstraintsCajeroTurno);
			}
			
			
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy = 1;
			this.gridBagConstraintsCajeroTurno.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajeroTurno.add(this.jButtonDuplicarCajeroTurno, this.gridBagConstraintsCajeroTurno);
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy = 1;
			this.gridBagConstraintsCajeroTurno.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajeroTurno.add(this.jButtonCopiarCajeroTurno, this.gridBagConstraintsCajeroTurno);
		
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy = 1;
			this.gridBagConstraintsCajeroTurno.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajeroTurno.add(this.jButtonVerFormCajeroTurno, this.gridBagConstraintsCajeroTurno);
		
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy = 1;
			this.gridBagConstraintsCajeroTurno.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCajeroTurno.add(this.jButtonCerrarCajeroTurno, this.gridBagConstraintsCajeroTurno);
		
		
		
		this.jButtonRecargarInformacionCajeroTurno.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajeroTurno.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajeroTurno.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCajeroTurno.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajeroTurno.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajeroTurno.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCajeroTurno.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajeroTurno.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajeroTurno.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCajeroTurno.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajeroTurno.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajeroTurno.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCajeroTurno.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajeroTurno.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajeroTurno.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCajeroTurno.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajeroTurno.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajeroTurno.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCajeroTurno.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajeroTurno.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajeroTurno.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCajeroTurno.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajeroTurno.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajeroTurno.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCajeroTurno.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajeroTurno.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajeroTurno.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCajeroTurno.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajeroTurno.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajeroTurno.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCajeroTurno.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajeroTurno.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajeroTurno.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCajeroTurno.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajeroTurno.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajeroTurno.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCajeroTurno = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCajeroTurno = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CajeroTurno = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CajeroTurno = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CajeroTurno = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CajeroTurno = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCajeroTurno.setLayout(gridaBagParametrosReportesCajeroTurno);
			this.jPanelParametrosReportesAccionesCajeroTurno.setLayout(gridaBagParametrosReportesAccionesCajeroTurno);
			
			
			this.jPanelParametrosAuxiliar1CajeroTurno.setLayout(gridaBagParametrosAuxiliar1CajeroTurno);
			this.jPanelParametrosAuxiliar2CajeroTurno.setLayout(gridaBagParametrosAuxiliar2CajeroTurno);
			this.jPanelParametrosAuxiliar3CajeroTurno.setLayout(gridaBagParametrosAuxiliar3CajeroTurno);
			this.jPanelParametrosAuxiliar4CajeroTurno.setLayout(gridaBagParametrosAuxiliar4CajeroTurno);
			//this.jPanelParametrosAuxiliar5CajeroTurno.setLayout(gridaBagParametrosAuxiliar2CajeroTurno);			
			
			
			
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajeroTurno.add(this.jButtonRecargarInformacionCajeroTurno, this.gridBagConstraintsCajeroTurno);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajeroTurno.add(this.jComboBoxTiposPaginacionCajeroTurno, this.gridBagConstraintsCajeroTurno);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajeroTurno.add(this.jCheckBoxConAltoMaximoTablaCajeroTurno, this.gridBagConstraintsCajeroTurno);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajeroTurno.add(this.jComboBoxTiposArchivosReportesCajeroTurno, this.gridBagConstraintsCajeroTurno);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajeroTurno.add(this.jPanelParametrosAuxiliar1CajeroTurno, this.gridBagConstraintsCajeroTurno);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajeroTurno.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CajeroTurno.add(this.jComboBoxTiposReportesCajeroTurno, this.gridBagConstraintsCajeroTurno);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajeroTurno.add(this.jPanelParametrosAuxiliar4CajeroTurno, this.gridBagConstraintsCajeroTurno);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajeroTurno.add(this.jComboBoxTiposReportesCajeroTurno, this.gridBagConstraintsCajeroTurno);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajeroTurno.add(this.jCheckBoxGenerarReporteCajeroTurno, this.gridBagConstraintsCajeroTurno);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajeroTurno.add(this.jPanelParametrosAuxiliar2CajeroTurno, this.gridBagConstraintsCajeroTurno);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajeroTurno.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajeroTurno.add(this.jLabelAccionesCajeroTurno, this.gridBagConstraintsCajeroTurno);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
				this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCajeroTurno.add(this.jButtonAbrirOrderByCajeroTurno, this.gridBagConstraintsCajeroTurno);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajeroTurno.add(this.jComboBoxTiposSeleccionarCajeroTurno, this.gridBagConstraintsCajeroTurno);			
			
			
			/*
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajeroTurno.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajeroTurno.add(this.jCheckBoxSeleccionarTodosCajeroTurno, this.gridBagConstraintsCajeroTurno);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajeroTurno.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajeroTurno.add(this.jCheckBoxSeleccionarTodosCajeroTurno, this.gridBagConstraintsCajeroTurno);															
				
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajeroTurno.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajeroTurno.add(this.jCheckBoxSeleccionadosCajeroTurno, this.gridBagConstraintsCajeroTurno);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajeroTurno.add(this.jPanelParametrosAuxiliar3CajeroTurno, this.gridBagConstraintsCajeroTurno);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajeroTurno.add(this.jComboBoxTiposAccionesCajeroTurno, this.gridBagConstraintsCajeroTurno);
	
				
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajeroTurno.add(this.jTextFieldValorCampoGeneralCajeroTurno, this.gridBagConstraintsCajeroTurno);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCajeroTurno = new GridBagLayout();

			this.jScrollPanelDatosCajeroTurno.setLayout(gridaBagLayoutDatosCajeroTurno);
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy = 0;
			this.gridBagConstraintsCajeroTurno.gridx = 0;
			
			this.jScrollPanelDatosCajeroTurno.add(this.jTableDatosCajeroTurno, this.gridBagConstraintsCajeroTurno);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCajeroTurno.setViewportView(this.jTableDatosCajeroTurno);
		this.jTableDatosCajeroTurno.setFillsViewportHeight(true);
		this.jTableDatosCajeroTurno.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCajeroTurno= new GridBagLayout();
		this.jPanelAccionesCajeroTurno.setLayout(gridaBagLayoutAccionesCajeroTurno);
		
		
		/*	
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 0;
			
		this.jPanelAccionesCajeroTurno.add(this.jButtonNuevoCajeroTurno, this.gridBagConstraintsCajeroTurno);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCajaCajeroTurno= new GridBagLayout();
		gridaBagLayoutFK_IdCajaCajeroTurno.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCajaCajeroTurno.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCajaCajeroTurno.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCajaCajeroTurno.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCajaCajeroTurno.setLayout(gridaBagLayoutFK_IdCajaCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 0;
		gridBagConstraintsCajeroTurno.gridx = 0;
		jPanelFK_IdCajaCajeroTurno.add(jLabelid_cajaFK_IdCajaCajeroTurno, gridBagConstraintsCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 0;
		gridBagConstraintsCajeroTurno.gridx = 1;
		jPanelFK_IdCajaCajeroTurno.add(jComboBoxid_cajaFK_IdCajaCajeroTurno, gridBagConstraintsCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 1;
		gridBagConstraintsCajeroTurno.gridx =1;
		jPanelFK_IdCajaCajeroTurno.add(jButtonFK_IdCajaCajeroTurno, gridBagConstraintsCajeroTurno);

		jTabbedPaneBusquedasCajeroTurno.addTab("1.-Por Caja ", jPanelFK_IdCajaCajeroTurno);
		jTabbedPaneBusquedasCajeroTurno.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdMesaCajeroTurno= new GridBagLayout();
		gridaBagLayoutFK_IdMesaCajeroTurno.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesaCajeroTurno.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesaCajeroTurno.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesaCajeroTurno.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesaCajeroTurno.setLayout(gridaBagLayoutFK_IdMesaCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 0;
		gridBagConstraintsCajeroTurno.gridx = 0;
		jPanelFK_IdMesaCajeroTurno.add(jLabelid_mesaFK_IdMesaCajeroTurno, gridBagConstraintsCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 0;
		gridBagConstraintsCajeroTurno.gridx = 1;
		jPanelFK_IdMesaCajeroTurno.add(jComboBoxid_mesaFK_IdMesaCajeroTurno, gridBagConstraintsCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 1;
		gridBagConstraintsCajeroTurno.gridx =1;
		jPanelFK_IdMesaCajeroTurno.add(jButtonFK_IdMesaCajeroTurno, gridBagConstraintsCajeroTurno);

		jTabbedPaneBusquedasCajeroTurno.addTab("2.-Por Mesa ", jPanelFK_IdMesaCajeroTurno);
		jTabbedPaneBusquedasCajeroTurno.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTurnoPunVenCajeroTurno= new GridBagLayout();
		gridaBagLayoutFK_IdTurnoPunVenCajeroTurno.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTurnoPunVenCajeroTurno.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTurnoPunVenCajeroTurno.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTurnoPunVenCajeroTurno.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTurnoPunVenCajeroTurno.setLayout(gridaBagLayoutFK_IdTurnoPunVenCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 0;
		gridBagConstraintsCajeroTurno.gridx = 0;
		jPanelFK_IdTurnoPunVenCajeroTurno.add(jLabelid_turno_pun_venFK_IdTurnoPunVenCajeroTurno, gridBagConstraintsCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 0;
		gridBagConstraintsCajeroTurno.gridx = 1;
		jPanelFK_IdTurnoPunVenCajeroTurno.add(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno, gridBagConstraintsCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 1;
		gridBagConstraintsCajeroTurno.gridx =1;
		jPanelFK_IdTurnoPunVenCajeroTurno.add(jButtonFK_IdTurnoPunVenCajeroTurno, gridBagConstraintsCajeroTurno);

		jTabbedPaneBusquedasCajeroTurno.addTab("3.-Por Turno ", jPanelFK_IdTurnoPunVenCajeroTurno);
		jTabbedPaneBusquedasCajeroTurno.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdVendedorCajeroTurno= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorCajeroTurno.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorCajeroTurno.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorCajeroTurno.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorCajeroTurno.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorCajeroTurno.setLayout(gridaBagLayoutFK_IdVendedorCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 0;
		gridBagConstraintsCajeroTurno.gridx = 0;
		jPanelFK_IdVendedorCajeroTurno.add(jLabelid_vendedorFK_IdVendedorCajeroTurno, gridBagConstraintsCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 0;
		gridBagConstraintsCajeroTurno.gridx = 1;
		jPanelFK_IdVendedorCajeroTurno.add(jComboBoxid_vendedorFK_IdVendedorCajeroTurno, gridBagConstraintsCajeroTurno);

		gridBagConstraintsCajeroTurno = new GridBagConstraints();
		gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeroTurno.gridy = 1;
		gridBagConstraintsCajeroTurno.gridx =1;
		jPanelFK_IdVendedorCajeroTurno.add(jButtonFK_IdVendedorCajeroTurno, gridBagConstraintsCajeroTurno);

		jTabbedPaneBusquedasCajeroTurno.addTab("4.-Por Vendedor ", jPanelFK_IdVendedorCajeroTurno);
		jTabbedPaneBusquedasCajeroTurno.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajeroTurno = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajeroTurno);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();						
			this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajeroTurno.gridx = 0;		
			//this.gridBagConstraintsCajeroTurno.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajeroTurno.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCajeroTurno, this.gridBagConstraintsCajeroTurno);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCajeroTurno.gridx = 0;		
		//this.gridBagConstraintsCajeroTurno.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCajeroTurno.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCajeroTurno);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajeroTurno.gridx = 0;		
			this.gridBagConstraintsCajeroTurno.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCajeroTurno.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCajeroTurno, this.gridBagConstraintsCajeroTurno);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeroTurno.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCajeroTurno, this.gridBagConstraintsCajeroTurno);								
		
		
		/*
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeroTurno.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCajeroTurno, this.gridBagConstraintsCajeroTurno);
		*/		
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajeroTurno.gridx =0;
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajeroTurno.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajeroTurno, this.gridBagConstraintsCajeroTurno);
				
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeroTurno.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCajeroTurno, this.gridBagConstraintsCajeroTurno);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CajeroTurnoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCajeroTurno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajeroTurno = new GridBagLayout();
			this.jPanelBusquedasParametrosCajeroTurno.setLayout(gridaBagLayoutBusquedasParametrosCajeroTurno);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCajeroTurno=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajeroTurno.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajeroTurno.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajeroTurno.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeroTurno.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajeroTurno, this.gridBagConstraintsCajeroTurno);
			
			
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeroTurno.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajeroTurno, this.gridBagConstraintsCajeroTurno);
		
			
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajeroTurno.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajeroTurno, this.gridBagConstraintsCajeroTurno);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCajeroTurno;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCajeroTurno() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCajeroTurno = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCajeroTurno.setName("jPanelReporteDinamicoCajeroTurno"); 
		
		this.jPanelReporteDinamicoCajeroTurno.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajeroTurno.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajeroTurno.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCajeroTurno.setLayout(gridaBagLayoutReporteDinamicoCajeroTurno);
		
		
		this.jInternalFrameReporteDinamicoCajeroTurno= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCajeroTurno = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajeroTurno= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCajeroTurno.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCajeroTurno.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCajeroTurno.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCajeroTurno.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCajeroTurno.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCajeroTurno.setResizable(true);
	    this.jInternalFrameReporteDinamicoCajeroTurno.setClosable(true);
	    this.jInternalFrameReporteDinamicoCajeroTurno.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCajeroTurno.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajeroTurno.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajeroTurno.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajero Turnos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCajeroTurno = new JLabelMe();

		this.jLabelColumnasSelectReporteCajeroTurno.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeroTurno.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajeroTurno.add(this.jLabelColumnasSelectReporteCajeroTurno, this.gridBagConstraintsCajeroTurno);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCajeroTurno = new JList<Reporte>();
		this.jListColumnasSelectReporteCajeroTurno.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCajeroTurno.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCajeroTurno.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajeroTurno.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajeroTurno.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCajeroTurno=new JScrollPane(this.jListColumnasSelectReporteCajeroTurno);
			
			this.jScrollColumnasSelectReporteCajeroTurno.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajeroTurno.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajeroTurno.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeroTurno.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCajeroTurno.add(this.jListColumnasSelectReporteCajeroTurno, this.gridBagConstraintsCajeroTurno);
		this.jPanelReporteDinamicoCajeroTurno.add(this.jScrollColumnasSelectReporteCajeroTurno, this.gridBagConstraintsCajeroTurno);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCajeroTurno = new JLabelMe();

		this.jLabelRelacionesSelectReporteCajeroTurno.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCajeroTurno = new JList<Reporte>();
		this.jListRelacionesSelectReporteCajeroTurno.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCajeroTurno.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCajeroTurno.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajeroTurno.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajeroTurno.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCajeroTurno=new JScrollPane(this.jListRelacionesSelectReporteCajeroTurno);
			
			this.jScrollRelacionesSelectReporteCajeroTurno.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajeroTurno.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajeroTurno.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCajeroTurno = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCajeroTurno = new JComboBoxMe();
		this.jListColumnasValoresGraficoCajeroTurno = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCajeroTurno = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCajeroTurno.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCajeroTurno.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajeroTurno.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajeroTurno.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCajeroTurno = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCajeroTurno.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCajeroTurno.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajeroTurno.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajeroTurno.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCajeroTurno = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCajeroTurno.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeroTurno.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajeroTurno.add(this.jLabelGenerarExcelReporteDinamicoCajeroTurno, this.gridBagConstraintsCajeroTurno);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCajeroTurno = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCajeroTurno.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCajeroTurno,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCajeroTurno.setToolTipText("Generar EXCEL"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCajeroTurno.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCajeroTurno.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCajeroTurno.add(this.jButtonGenerarExcelReporteDinamicoCajeroTurno, this.gridBagConstraintsCajeroTurno);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajeroTurno.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajeroTurno.add(this.jComboBoxTiposReportesDinamicoCajeroTurno, this.gridBagConstraintsCajeroTurno);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCajeroTurno = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCajeroTurno.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeroTurno.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajeroTurno.add(this.jLabelTiposArchivoReporteDinamicoCajeroTurno, this.gridBagConstraintsCajeroTurno);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajeroTurno.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajeroTurno.add(this.jComboBoxTiposArchivosReportesDinamicoCajeroTurno, this.gridBagConstraintsCajeroTurno);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCajeroTurno = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCajeroTurno.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCajeroTurno,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCajeroTurno.setToolTipText("Generar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajeroTurno.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajeroTurno.add(this.jButtonGenerarReporteDinamicoCajeroTurno, this.gridBagConstraintsCajeroTurno);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCajeroTurno = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCajeroTurno.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCajeroTurno,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCajeroTurno.setToolTipText("Cancelar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajeroTurno.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajeroTurno.add(this.jButtonCerrarReporteDinamicoCajeroTurno, this.gridBagConstraintsCajeroTurno);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCajeroTurno = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCajeroTurno= new JScrollPane(jPanelReporteDinamicoCajeroTurno,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCajeroTurno.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajeroTurno.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajeroTurno.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajero Turnos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCajeroTurno.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCajeroTurno.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCajeroTurno.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCajeroTurno);
		this.jInternalFrameReporteDinamicoCajeroTurno.getContentPane().add(this.jScrollPanelReporteDinamicoCajeroTurno, this.gridBagConstraintsCajeroTurno);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCajeroTurno() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCajeroTurno = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCajeroTurno.setName("jPanelImportacionCajeroTurno"); 
		
		this.jPanelImportacionCajeroTurno.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajeroTurno.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajeroTurno.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCajeroTurno.setLayout(gridaBagLayoutImportacionCajeroTurno);
		
		
		this.jInternalFrameImportacionCajeroTurno= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCajeroTurno= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCajeroTurno = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajeroTurno= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCajeroTurno.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajeroTurno.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajeroTurno.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCajeroTurno.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajeroTurno.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajeroTurno.setResizable(true);
	    this.jInternalFrameImportacionCajeroTurno.setClosable(true);
	    this.jInternalFrameImportacionCajeroTurno.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCajeroTurno.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajeroTurno.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajeroTurno.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCajeroTurno.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajeroTurno.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajeroTurno.setResizable(true);
	    this.jInternalFrameImportacionCajeroTurno.setClosable(true);
	    this.jInternalFrameImportacionCajeroTurno.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCajeroTurno.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajeroTurno.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajeroTurno.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajero Turnos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCajeroTurno = new JLabelMe();

		this.jLabelArchivoImportacionCajeroTurno.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajeroTurno.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajeroTurno.add(this.jLabelArchivoImportacionCajeroTurno, this.gridBagConstraintsCajeroTurno);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCajeroTurno = new JFileChooser();		
		this.jFileChooserImportacionCajeroTurno.setToolTipText("ESCOGER ARCHIVO"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCajeroTurno = new JButtonMe();
		this.jButtonAbrirImportacionCajeroTurno.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCajeroTurno,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCajeroTurno.setToolTipText("Generar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYImportacion;
		this.gridBagConstraintsCajeroTurno.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajeroTurno.add(this.jButtonAbrirImportacionCajeroTurno, this.gridBagConstraintsCajeroTurno);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCajeroTurno = new JLabelMe();

		this.jLabelPathArchivoImportacionCajeroTurno.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajeroTurno.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajeroTurno.add(this.jLabelPathArchivoImportacionCajeroTurno, this.gridBagConstraintsCajeroTurno);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCajeroTurno=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCajeroTurno.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajeroTurno.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajeroTurno.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYImportacion;
		this.gridBagConstraintsCajeroTurno.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajeroTurno.add(this.jTextFieldPathArchivoImportacionCajeroTurno, this.gridBagConstraintsCajeroTurno);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCajeroTurno = new JButtonMe();
		this.jButtonGenerarImportacionCajeroTurno.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCajeroTurno,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCajeroTurno.setToolTipText("Generar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYImportacion;
		this.gridBagConstraintsCajeroTurno.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajeroTurno.add(this.jButtonGenerarImportacionCajeroTurno, this.gridBagConstraintsCajeroTurno);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCajeroTurno = new JButtonMe();
		this.jButtonCerrarImportacionCajeroTurno.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCajeroTurno,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCajeroTurno.setToolTipText("Cancelar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.gridy = iPosYImportacion;
		this.gridBagConstraintsCajeroTurno.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajeroTurno.add(this.jButtonCerrarImportacionCajeroTurno, this.gridBagConstraintsCajeroTurno);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCajeroTurno = new GridBagLayout();
		
		this.jScrollPanelImportacionCajeroTurno= new JScrollPane(jPanelImportacionCajeroTurno,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy =iPosYImportacion;
		this.gridBagConstraintsCajeroTurno.gridx =iPosXImportacion;
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCajeroTurno.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCajeroTurno.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCajeroTurno);
		this.jInternalFrameImportacionCajeroTurno.getContentPane().add(this.jScrollPanelImportacionCajeroTurno, this.gridBagConstraintsCajeroTurno);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCajeroTurno(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCajeroTurno = new JButtonMe();
			this.jButtonAbrirOrderByCajeroTurno.setText("Orden");
			this.jButtonAbrirOrderByCajeroTurno.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajeroTurno,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCajeroTurno";
			inputMap = this.jButtonAbrirOrderByCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCajeroTurno"));
		
		
			GridBagLayout gridaBagLayoutOrderByCajeroTurno = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCajeroTurno.setName("jPanelOrderByCajeroTurno"); 
			
			this.jPanelOrderByCajeroTurno.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajeroTurno.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajeroTurno.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCajeroTurno.setLayout(gridaBagLayoutOrderByCajeroTurno);
			
			
			this.jTableDatosCajeroTurnoOrderBy = new JTableMe();        
			this.jTableDatosCajeroTurnoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCajeroTurnoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCajeroTurnoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCajeroTurnoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCajeroTurnoOrderBy.setViewportView(this.jTableDatosCajeroTurnoOrderBy);
			this.jTableDatosCajeroTurnoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCajeroTurnoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCajeroTurno= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCajeroTurno= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCajeroTurno = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCajeroTurno= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCajeroTurno.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCajeroTurno.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCajeroTurno.setTitle("Orden");
			this.jInternalFrameOrderByCajeroTurno.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCajeroTurno.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCajeroTurno.setResizable(true);
			this.jInternalFrameOrderByCajeroTurno.setClosable(true);
			this.jInternalFrameOrderByCajeroTurno.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCajeroTurno.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajeroTurno.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajeroTurno.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajero Turnos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCajeroTurno.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCajeroTurno.ipady =150;
				
			this.jPanelOrderByCajeroTurno.add(jScrollPanelDatosCajeroTurnoOrderBy, this.gridBagConstraintsCajeroTurno);//this.jTableDatosCajeroTurnoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCajeroTurno = new JButtonMe();
			this.jButtonCerrarOrderByCajeroTurno.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCajeroTurno,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCajeroTurno.setToolTipText("Cancelar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCajeroTurno.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCajeroTurno.add(this.jButtonCerrarOrderByCajeroTurno, this.gridBagConstraintsCajeroTurno);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCajeroTurno = new GridBagLayout();
			
			this.jScrollPanelOrderByCajeroTurno= new JScrollPane(jPanelOrderByCajeroTurno,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.gridy =iPosYOrderBy;
			this.gridBagConstraintsCajeroTurno.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCajeroTurno.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCajeroTurno.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCajeroTurno);
			
			this.jInternalFrameOrderByCajeroTurno.getContentPane().add(this.jScrollPanelOrderByCajeroTurno, this.gridBagConstraintsCajeroTurno);			
		
		} else {
			this.jButtonAbrirOrderByCajeroTurno = new JButtonMe();
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
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cajeroturnoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCajeroTurno.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCajeroTurno.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCajeroTurno.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCajeroTurno.getRowHeight();//CajeroTurnoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CajeroTurnoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajeroTurno.isSelected()) {
					iHeightTable=CajeroTurnoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajeroTurnoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajeroTurnoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CajeroTurnoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajeroTurno.isSelected()) {
					iHeightTable=CajeroTurnoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajeroTurnoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajeroTurnoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCajeroTurno.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajeroTurno.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajeroTurno.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCajeroTurno.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajeroTurno.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajeroTurno.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCajeroTurno!=null && this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy()!=null) {
			//if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCajeroTurno.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCajeroTurno.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCajeroTurno.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCajeroTurno.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajeroTurno.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajeroTurno.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cajeroturnoLogic.getCajeroTurnos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajeroturnos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CajeroTurno> TraerCajeroTurnoBeans(List<CajeroTurno> cajeroturnos,ArrayList<Classe> classes)throws Exception {
		try {
			for(CajeroTurno cajeroturno:cajeroturnos) {
					
				if(!(CajeroTurnoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CajeroTurnoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cajeroturno.setsDetalleGeneralEntityReporte(CajeroTurnoConstantesFunciones.getCajeroTurnoDescripcion(cajeroturno));
										
						
					
						
					
				} else  {
							
					//cajeroturno.setsDetalleGeneralEntityReporte(cajeroturno.getsDetalleGeneralEntityReporte());
										
				}
				
				//cajeroturnobeans.add(cajeroturnobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cajeroturnos;
    }
	//PARA REPORTES FIN
}
