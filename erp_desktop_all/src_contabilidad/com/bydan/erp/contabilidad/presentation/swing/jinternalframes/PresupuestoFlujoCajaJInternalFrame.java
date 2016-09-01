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
import com.bydan.erp.contabilidad.util.PresupuestoFlujoCajaConstantesFunciones;

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
public class PresupuestoFlujoCajaJInternalFrame extends PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresupuestoFlujoCaja;
	
	protected JMenuBar jmenuBarPresupuestoFlujoCaja;
	
	protected JMenu jmenuPresupuestoFlujoCaja;
	protected JMenu jmenuDatosPresupuestoFlujoCaja;
	protected JMenu jmenuArchivoPresupuestoFlujoCaja;
	protected JMenu jmenuAccionesPresupuestoFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsPresupuestoFlujoCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresupuestoFlujoCajaDetalleFormJInternalFrame jInternalFrameDetalleFormPresupuestoFlujoCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresupuestoFlujoCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresupuestoFlujoCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PresupuestoFlujoCajaSessionBean presupuestoflujocajaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresupuestoFlujoCaja> presupuestoflujocajas;		
	public List<PresupuestoFlujoCaja> presupuestoflujocajasEliminados;	
	public List<PresupuestoFlujoCaja> presupuestoflujocajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresupuestoFlujoCaja;		
	protected JButton jButtonAbrirOrderByPresupuestoFlujoCaja;
	
	
	//protected JPanel jPanelOrderByPresupuestoFlujoCaja;
	//public JScrollPane jScrollPanelOrderByPresupuestoFlujoCaja;	
	//protected JButton jButtonCerrarOrderByPresupuestoFlujoCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresupuestoFlujoCajaLogic presupuestoflujocajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresupuestoFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoFlujoCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosPresupuestoFlujoCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresupuestoFlujoCaja;
	//public JScrollPane jScrollPanelImportacionPresupuestoFlujoCaja;
	
	
	
	protected JPanel jPanelAccionesPresupuestoFlujoCaja;
	
    protected JPanel jPanelPaginacionPresupuestoFlujoCaja;
    protected JPanel jPanelParametrosReportesPresupuestoFlujoCaja;
	protected JPanel jPanelParametrosReportesAccionesPresupuestoFlujoCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresupuestoFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar2PresupuestoFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar3PresupuestoFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar4PresupuestoFlujoCaja;
	//protected JPanel jPanelParametrosAuxiliar5PresupuestoFlujoCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresupuestoFlujoCaja;
	//protected JPanel jPanelImportacionPresupuestoFlujoCaja;
	
	
	public JTable jTableDatosPresupuestoFlujoCaja;
	
	
	
	//public JTable jTableDatosPresupuestoFlujoCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresupuestoFlujoCaja;
	protected JButton jButtonDuplicarPresupuestoFlujoCaja;
	protected JButton jButtonCopiarPresupuestoFlujoCaja;
	protected JButton jButtonVerFormPresupuestoFlujoCaja;
	protected JButton jButtonNuevoRelacionesPresupuestoFlujoCaja;
	protected JButton jButtonModificarPresupuestoFlujoCaja;
	
    protected JButton jButtonGuardarCambiosTablaPresupuestoFlujoCaja;
	protected JButton jButtonCerrarPresupuestoFlujoCaja;
	
	
	protected JButton jButtonRecargarInformacionPresupuestoFlujoCaja;
	protected JButton jButtonProcesarInformacionPresupuestoFlujoCaja;
	
	
	protected JButton jButtonAnterioresPresupuestoFlujoCaja;
	protected JButton jButtonSiguientesPresupuestoFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosPresupuestoFlujoCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresupuestoFlujoCaja;
	//protected JButton jButtonCerrarReporteDinamicoPresupuestoFlujoCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresupuestoFlujoCaja;
	//protected JButton jButtonGenerarImportacionPresupuestoFlujoCaja;
	//protected JButton jButtonCerrarImportacionPresupuestoFlujoCaja;
	//protected JFileChooser jFileChooserImportacionPresupuestoFlujoCaja;
	//protected File fileImportacionPresupuestoFlujoCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoFlujoCaja;
	protected JButton jButtonDuplicarToolBarPresupuestoFlujoCaja;
	protected JButton jButtonNuevoRelacionesToolBarPresupuestoFlujoCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarPresupuestoFlujoCaja;
	protected JButton jButtonCopiarToolBarPresupuestoFlujoCaja;
	protected JButton jButtonVerFormToolBarPresupuestoFlujoCaja;
	public JButton jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoFlujoCaja;
	protected JButton jButtonCerrarToolBarPresupuestoFlujoCaja;
	
	protected JButton jButtonRecargarInformacionToolBarPresupuestoFlujoCaja;
	protected JButton jButtonProcesarInformacionToolBarPresupuestoFlujoCaja;
	protected JButton jButtonAnterioresToolBarPresupuestoFlujoCaja;
	protected JButton jButtonSiguientesToolBarPresupuestoFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresupuestoFlujoCaja;
	protected JButton jButtonAbrirOrderByToolBarPresupuestoFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemDuplicarPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemNuevoRelacionesPresupuestoFlujoCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemCopiarPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemVerFormPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemCerrarPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemAnterioresPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemSiguientesPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemAbrirOrderByPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoFlujoCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresupuestoFlujoCaja;
	protected JCheckBox jCheckBoxSeleccionadosPresupuestoFlujoCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresupuestoFlujoCaja;
	protected JCheckBox jCheckBoxConGraficoReportePresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresupuestoFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresupuestoFlujoCaja;
	protected JTextField jTextFieldValorCampoGeneralPresupuestoFlujoCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresupuestoFlujoCaja;
	//public JList<Reporte> jListColumnasSelectReportePresupuestoFlujoCaja;
	//public JScrollPane jScrollColumnasSelectReportePresupuestoFlujoCaja;
	
	//public JLabel jLabelRelacionesSelectReportePresupuestoFlujoCaja;
	//public JList<Reporte> jListRelacionesSelectReportePresupuestoFlujoCaja;
	//public JScrollPane jScrollRelacionesSelectReportePresupuestoFlujoCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresupuestoFlujoCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCaja;
	
		
	//public JLabel jLabelArchivoImportacionPresupuestoFlujoCaja;	
	//public JLabel jLabelPathArchivoImportacionPresupuestoFlujoCaja;
	//protected JTextField jTextFieldPathArchivoImportacionPresupuestoFlujoCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresupuestoFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCaja;
	
	//public JLabel jLabelColumnaCategoriaValorPresupuestoFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresupuestoFlujoCaja;
	
	//public JLabel jLabelColumnasValoresGraficoPresupuestoFlujoCaja;
	//public JList<Reporte> jListColumnasValoresGraficoPresupuestoFlujoCaja;
	//public JScrollPane jScrollColumnasValoresGraficoPresupuestoFlujoCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresupuestoFlujoCaja;
	public JPanel jPanelFK_IdCentroCostoPresupuestoFlujoCaja;
	public JButton jButtonFK_IdCentroCostoPresupuestoFlujoCaja;
	public JPanel jPanelFK_IdCuentaContablePresupuestoFlujoCaja;
	public JButton jButtonFK_IdCuentaContablePresupuestoFlujoCaja;
	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja;
	public JButton jButtonid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCaja;
	
	
	
	
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
	//public int iHeightFormulario=352;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PresupuestoFlujoCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresupuestoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresupuestoFlujoCaja)	{
		this.jButtonRecargarInformacionPresupuestoFlujoCaja = jButtonRecargarInformacionPresupuestoFlujoCaja;
	}
	
	public JButton getjButtonProcesarInformacionPresupuestoFlujoCaja() {
		return this.jButtonProcesarInformacionPresupuestoFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoFlujoCaja)	{
		this.jButtonProcesarInformacionPresupuestoFlujoCaja = jButtonProcesarInformacionPresupuestoFlujoCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionPresupuestoFlujoCaja() {
		return this.jButtonRecargarInformacionPresupuestoFlujoCaja;
	}
	
	
	public List<PresupuestoFlujoCaja> getpresupuestoflujocajas() {
		return this.presupuestoflujocajas;
	}

	public void setpresupuestoflujocajas(List<PresupuestoFlujoCaja> presupuestoflujocajas) {
		this.presupuestoflujocajas = presupuestoflujocajas;
	}
	
	public List<PresupuestoFlujoCaja> getpresupuestoflujocajasAux() {
		return this.presupuestoflujocajasAux;
	}

	public void setpresupuestoflujocajasAux(List<PresupuestoFlujoCaja> presupuestoflujocajasAux) {
		this.presupuestoflujocajasAux = presupuestoflujocajasAux;
	}
	
	public List<PresupuestoFlujoCaja> getpresupuestoflujocajasEliminados() {
		return this.presupuestoflujocajasEliminados;
	}

	public void setPresupuestoFlujoCajasEliminados(List<PresupuestoFlujoCaja> presupuestoflujocajasEliminados) {
		this.presupuestoflujocajasEliminados = presupuestoflujocajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresupuestoFlujoCaja() {
		return jComboBoxTiposSeleccionarPresupuestoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresupuestoFlujoCaja(
			JComboBox jComboBoxTiposSeleccionarPresupuestoFlujoCaja) {
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja = jComboBoxTiposSeleccionarPresupuestoFlujoCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarPresupuestoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresupuestoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresupuestoFlujoCaja() {
		return jTextFieldValorCampoGeneralPresupuestoFlujoCaja;
	}

	public void setjTextFieldValorCampoGeneralPresupuestoFlujoCaja(
			JTextField jTextFieldValorCampoGeneralPresupuestoFlujoCaja) {
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCaja = jTextFieldValorCampoGeneralPresupuestoFlujoCaja;
	}

	public void setBorderResaltarValorCampoGeneralPresupuestoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresupuestoFlujoCaja() {
		return this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja;
	}

	public void setjCheckBoxSeleccionarTodosPresupuestoFlujoCaja(
			JCheckBox jCheckBoxSeleccionarTodosPresupuestoFlujoCaja) {
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja = jCheckBoxSeleccionarTodosPresupuestoFlujoCaja;
	}

	public void setBorderResaltarSeleccionarTodosPresupuestoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresupuestoFlujoCaja() {
		return this.jCheckBoxSeleccionadosPresupuestoFlujoCaja;
	}

	public void setjCheckBoxSeleccionadosPresupuestoFlujoCaja(
			JCheckBox jCheckBoxSeleccionadosPresupuestoFlujoCaja) {
		this.jCheckBoxSeleccionadosPresupuestoFlujoCaja = jCheckBoxSeleccionadosPresupuestoFlujoCaja;
	}
	
	public void setBorderResaltarSeleccionadosPresupuestoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresupuestoFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresupuestoFlujoCaja() {
		return this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresupuestoFlujoCaja(
			JComboBox jComboBoxTiposArchivosReportesPresupuestoFlujoCaja) {
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja = jComboBoxTiposArchivosReportesPresupuestoFlujoCaja;
	}

	public void setBorderResaltarTiposArchivosReportesPresupuestoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresupuestoFlujoCaja() {
		return this.jComboBoxTiposReportesPresupuestoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresupuestoFlujoCaja(
			JComboBox jComboBoxTiposReportesPresupuestoFlujoCaja) {
		this.jComboBoxTiposReportesPresupuestoFlujoCaja = jComboBoxTiposReportesPresupuestoFlujoCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresupuestoFlujoCaja() {
	//	return jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresupuestoFlujoCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja) {
	//	this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja = jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja = jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja;
	//}
	
	public void setBorderResaltarTiposReportesPresupuestoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresupuestoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresupuestoFlujoCaja() {
		return this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresupuestoFlujoCaja(
			JComboBox jComboBoxTiposGraficosReportesPresupuestoFlujoCaja) {
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja = jComboBoxTiposGraficosReportesPresupuestoFlujoCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresupuestoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresupuestoFlujoCaja() {
		return this.jComboBoxTiposPaginacionPresupuestoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresupuestoFlujoCaja(
			JComboBox jComboBoxTiposPaginacionPresupuestoFlujoCaja) {
		this.jComboBoxTiposPaginacionPresupuestoFlujoCaja = jComboBoxTiposPaginacionPresupuestoFlujoCaja;
	}
	
	public void setBorderResaltarTiposPaginacionPresupuestoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresupuestoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresupuestoFlujoCaja() {
		return this.jComboBoxTiposRelacionesPresupuestoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoFlujoCaja() {
		return this.jComboBoxTiposAccionesPresupuestoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoFlujoCaja(
			JComboBox jComboBoxTiposRelacionesPresupuestoFlujoCaja) {
		this.jComboBoxTiposRelacionesPresupuestoFlujoCaja = jComboBoxTiposRelacionesPresupuestoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoFlujoCaja(
			JComboBox jComboBoxTiposAccionesPresupuestoFlujoCaja) {
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja = jComboBoxTiposAccionesPresupuestoFlujoCaja;
	}
	
	public void setBorderResaltarTiposRelacionesPresupuestoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresupuestoFlujoCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresupuestoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresupuestoFlujoCaja() {
	//	return jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresupuestoFlujoCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja) {
	//	this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja = jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresupuestoFlujoCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresupuestoFlujoCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja .setBorder(borderResaltar);		
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
		this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
		
		this.presupuestoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresupuestoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresupuestoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
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
		
		PresupuestoFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresupuestoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresupuestoFlujoCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"nuevo","nuevo","Nuevo"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"duplicar","duplicar","Duplicar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"copiar","copiar","Copiar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"ver_form","ver_form","Ver"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"recargar","recargar","Recargar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,
							"cerrar","cerrar","Salir"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresupuestoFlujoCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresupuestoFlujoCaja;
			
				this.jButtonProcesarInformacionToolBarPresupuestoFlujoCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresupuestoFlujoCaja;
				
		//protected JButton jButtonModificarToolBarPresupuestoFlujoCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresupuestoFlujoCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresupuestoFlujoCaja=new JMenuMe("General");
		this.jmenuArchivoPresupuestoFlujoCaja=new JMenuMe("Archivo");
		this.jmenuAccionesPresupuestoFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDatosPresupuestoFlujoCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresupuestoFlujoCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresupuestoFlujoCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresupuestoFlujoCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresupuestoFlujoCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresupuestoFlujoCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresupuestoFlujoCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresupuestoFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresupuestoFlujoCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresupuestoFlujoCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresupuestoFlujoCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresupuestoFlujoCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresupuestoFlujoCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresupuestoFlujoCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresupuestoFlujoCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresupuestoFlujoCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresupuestoFlujoCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresupuestoFlujoCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresupuestoFlujoCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresupuestoFlujoCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresupuestoFlujoCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresupuestoFlujoCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresupuestoFlujoCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresupuestoFlujoCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresupuestoFlujoCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresupuestoFlujoCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresupuestoFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresupuestoFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresupuestoFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresupuestoFlujoCaja.add(this.jMenuItemCerrarPresupuestoFlujoCaja);
			
			this.jmenuAccionesPresupuestoFlujoCaja.add(this.jMenuItemNuevoPresupuestoFlujoCaja);
			this.jmenuAccionesPresupuestoFlujoCaja.add(this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCaja);
			this.jmenuAccionesPresupuestoFlujoCaja.add(this.jMenuItemNuevoRelacionesPresupuestoFlujoCaja);
			this.jmenuAccionesPresupuestoFlujoCaja.add(this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCaja);		
			this.jmenuAccionesPresupuestoFlujoCaja.add(this.jMenuItemDuplicarPresupuestoFlujoCaja);		
			this.jmenuAccionesPresupuestoFlujoCaja.add(this.jMenuItemCopiarPresupuestoFlujoCaja);		
			this.jmenuAccionesPresupuestoFlujoCaja.add(this.jMenuItemVerFormPresupuestoFlujoCaja);		
			
			this.jmenuDatosPresupuestoFlujoCaja.add(this.jMenuItemRecargarInformacionPresupuestoFlujoCaja);				
			this.jmenuDatosPresupuestoFlujoCaja.add(this.jMenuItemAnterioresPresupuestoFlujoCaja);				
			this.jmenuDatosPresupuestoFlujoCaja.add(this.jMenuItemSiguientesPresupuestoFlujoCaja);				
			this.jmenuDatosPresupuestoFlujoCaja.add(this.jMenuItemAbrirOrderByPresupuestoFlujoCaja);				
			this.jmenuDatosPresupuestoFlujoCaja.add(this.jMenuItemMostrarOcultarPresupuestoFlujoCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresupuestoFlujoCaja.add(this.jMenuItemGuardarCambiosPresupuestoFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresupuestoFlujoCaja.add(this.jmenuArchivoPresupuestoFlujoCaja);		
			this.jmenuBarPresupuestoFlujoCaja.add(this.jmenuAccionesPresupuestoFlujoCaja);		
			this.jmenuBarPresupuestoFlujoCaja.add(this.jmenuDatosPresupuestoFlujoCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresupuestoFlujoCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresupuestoFlujoCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCentroCostoPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoPresupuestoFlujoCaja.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoPresupuestoFlujoCaja= new JButtonMe();
		this.jButtonFK_IdCentroCostoPresupuestoFlujoCaja.setText("Buscar");
		this.jButtonFK_IdCentroCostoPresupuestoFlujoCaja.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoPresupuestoFlujoCaja,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContablePresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContablePresupuestoFlujoCaja.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContablePresupuestoFlujoCaja= new JButtonMe();
		this.jButtonFK_IdCuentaContablePresupuestoFlujoCaja.setText("Buscar");
		this.jButtonFK_IdCuentaContablePresupuestoFlujoCaja.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContablePresupuestoFlujoCaja,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContablePresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCaja= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCaja.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCaja.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCaja.setFocusable(false);


		this.jTabbedPaneBusquedasPresupuestoFlujoCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresupuestoFlujoCaja = new PresupuestoFlujoCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Presupuesto Flujo Caja DATOS");
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja = new PresupuestoFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.presupuestoflujocajaSessionBean.getConGuardarRelaciones(),this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja = null;//new PresupuestoFlujoCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoFlujoCaja= new GridBagLayout();
		
		
		this.jTableDatosPresupuestoFlujoCaja = new JTableMe();      
		
		String sToolTipPresupuestoFlujoCaja="";
		sToolTipPresupuestoFlujoCaja=PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoFlujoCaja+="(Contabilidad.PresupuestoFlujoCaja)";
		}
		
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoFlujoCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresupuestoFlujoCaja.setToolTipText(sToolTipPresupuestoFlujoCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresupuestoFlujoCaja);
		this.jTableDatosPresupuestoFlujoCaja.setAutoCreateRowSorter(true);
		this.jTableDatosPresupuestoFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresupuestoFlujoCaja.setRowSelectionAllowed(true);
		this.jTableDatosPresupuestoFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonDuplicarPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonCopiarPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonVerFormPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonNuevoRelacionesPresupuestoFlujoCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonCerrarPresupuestoFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresupuestoFlujoCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Flujo Caja";
		
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoFlujoCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja=new ReporteDinamicoJInternalFrame(PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresupuestoFlujoCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresupuestoFlujoCaja=new ImportacionJInternalFrame(PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresupuestoFlujoCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresupuestoFlujoCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByPresupuestoFlujoCaja.setText("Orden");
		this.jButtonAbrirOrderByPresupuestoFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoFlujoCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoFlujoCaja,false,this);
			
			//this.cargarOrderByPresupuestoFlujoCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoFlujoCaja,true,this);
			
			//this.cargarOrderByPresupuestoFlujoCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresupuestoFlujoCaja.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosPresupuestoFlujoCaja.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosPresupuestoFlujoCaja.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosPresupuestoFlujoCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoFlujoCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoFlujoCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresupuestoFlujoCaja.setText("Nuevo");
		this.jButtonDuplicarPresupuestoFlujoCaja.setText("Duplicar");
		this.jButtonCopiarPresupuestoFlujoCaja.setText("Copiar");
		this.jButtonVerFormPresupuestoFlujoCaja.setText("Ver");
		this.jButtonNuevoRelacionesPresupuestoFlujoCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.setText("Guardar");
		this.jButtonCerrarPresupuestoFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoFlujoCaja,"nuevo_button","Nuevo",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresupuestoFlujoCaja,"duplicar_button","Duplicar",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresupuestoFlujoCaja,"copiar_button","Copiar",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresupuestoFlujoCaja,"ver_form","Ver",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresupuestoFlujoCaja,"nuevorelaciones_button","Nuevo Rel",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja,"guardarcambiostabla_button","Guardar",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoFlujoCaja,"cerrar_button","Salir",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresupuestoFlujoCaja.setToolTipText("Nuevo"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresupuestoFlujoCaja.setToolTipText("Duplicar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresupuestoFlujoCaja.setToolTipText("Copiar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresupuestoFlujoCaja.setToolTipText("Ver"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresupuestoFlujoCaja.setToolTipText("Nuevo Rel"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.setToolTipText("Guardar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoFlujoCaja.setToolTipText("Salir"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoFlujoCaja";
		inputMap = this.jButtonNuevoPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoFlujoCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresupuestoFlujoCaja";
		inputMap = this.jButtonDuplicarPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresupuestoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresupuestoFlujoCaja"));
		
		//COPIAR
		sMapKey = "CopiarPresupuestoFlujoCaja";
		inputMap = this.jButtonCopiarPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresupuestoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresupuestoFlujoCaja"));
		
		//VEr FORM
		sMapKey = "VerFormPresupuestoFlujoCaja";
		inputMap = this.jButtonVerFormPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresupuestoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresupuestoFlujoCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresupuestoFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresupuestoFlujoCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresupuestoFlujoCaja";
		inputMap = this.jButtonModificarPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresupuestoFlujoCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoFlujoCaja";
		inputMap = this.jButtonCerrarPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoFlujoCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresupuestoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresupuestoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresupuestoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresupuestoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresupuestoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresupuestoFlujoCaja.setName("jPanelParametrosReportesPresupuestoFlujoCaja"); 
		
		this.jPanelParametrosReportesAccionesPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresupuestoFlujoCaja.setName("jPanelParametrosReportesAccionesPresupuestoFlujoCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonRecargarInformacionPresupuestoFlujoCaja.setText("Recargar");
		this.jButtonRecargarInformacionPresupuestoFlujoCaja.setToolTipText("Recargar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresupuestoFlujoCaja,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonProcesarInformacionPresupuestoFlujoCaja.setText("Procesar");
		this.jButtonProcesarInformacionPresupuestoFlujoCaja.setToolTipText("Procesar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresupuestoFlujoCaja.setVisible(false);
			
		this.jButtonProcesarInformacionPresupuestoFlujoCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoFlujoCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoFlujoCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposReportesPresupuestoFlujoCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresupuestoFlujoCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresupuestoFlujoCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresupuestoFlujoCaja.setText("Accion");
		this.jComboBoxTiposRelacionesPresupuestoFlujoCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresupuestoFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesPresupuestoFlujoCaja.setText("Acciones");		
		this.jLabelAccionesPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresupuestoFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresupuestoFlujoCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresupuestoFlujoCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresupuestoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresupuestoFlujoCaja.setText("Graf.");
		this.jCheckBoxConGraficoReportePresupuestoFlujoCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresupuestoFlujoCaja = new JButtonMe();
		//this.jButtonAnterioresPresupuestoFlujoCaja.setText("<<");
        this.jButtonAnterioresPresupuestoFlujoCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresupuestoFlujoCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresupuestoFlujoCaja = new JButtonMe();
		//this.jButtonSiguientesPresupuestoFlujoCaja.setText(">>");
        this.jButtonSiguientesPresupuestoFlujoCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresupuestoFlujoCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresupuestoFlujoCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresupuestoFlujoCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresupuestoFlujoCaja,"nuevoguardarcambios_button","Nue",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresupuestoFlujoCaja";
		inputMap = this.jButtonNuevoGuardarCambiosPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresupuestoFlujoCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresupuestoFlujoCaja";
		inputMap = this.jButtonRecargarInformacionPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresupuestoFlujoCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresupuestoFlujoCaja";
		inputMap = this.jButtonSiguientesPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresupuestoFlujoCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresupuestoFlujoCaja";
		inputMap = this.jButtonAnterioresPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresupuestoFlujoCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresupuestoFlujoCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresupuestoFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),PresupuestoFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),PresupuestoFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),PresupuestoFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresupuestoFlujoCaja = new GridBagLayout();

			this.jPanelPaginacionPresupuestoFlujoCaja.setLayout(gridaBagLayoutPaginacionPresupuestoFlujoCaja);						
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresupuestoFlujoCaja.add(this.jButtonAnterioresPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
					
						
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
			
			this.jPanelPaginacionPresupuestoFlujoCaja.add(this.jButtonNuevoGuardarCambiosPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
						
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
			this.jPanelPaginacionPresupuestoFlujoCaja.add(this.jButtonSiguientesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 1;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoFlujoCaja.add(this.jButtonNuevoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
						
			
			
			if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 1;
				this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresupuestoFlujoCaja.add(this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			}
			
			
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 1;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoFlujoCaja.add(this.jButtonDuplicarPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 1;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoFlujoCaja.add(this.jButtonCopiarPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 1;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoFlujoCaja.add(this.jButtonVerFormPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 1;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresupuestoFlujoCaja.add(this.jButtonCerrarPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
		
		
		this.jButtonRecargarInformacionPresupuestoFlujoCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoFlujoCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoFlujoCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresupuestoFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresupuestoFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresupuestoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresupuestoFlujoCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoFlujoCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoFlujoCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresupuestoFlujoCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoFlujoCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoFlujoCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresupuestoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresupuestoFlujoCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresupuestoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresupuestoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresupuestoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresupuestoFlujoCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresupuestoFlujoCaja.setLayout(gridaBagParametrosReportesPresupuestoFlujoCaja);
			this.jPanelParametrosReportesAccionesPresupuestoFlujoCaja.setLayout(gridaBagParametrosReportesAccionesPresupuestoFlujoCaja);
			
			
			this.jPanelParametrosAuxiliar1PresupuestoFlujoCaja.setLayout(gridaBagParametrosAuxiliar1PresupuestoFlujoCaja);
			this.jPanelParametrosAuxiliar2PresupuestoFlujoCaja.setLayout(gridaBagParametrosAuxiliar2PresupuestoFlujoCaja);
			this.jPanelParametrosAuxiliar3PresupuestoFlujoCaja.setLayout(gridaBagParametrosAuxiliar3PresupuestoFlujoCaja);
			this.jPanelParametrosAuxiliar4PresupuestoFlujoCaja.setLayout(gridaBagParametrosAuxiliar4PresupuestoFlujoCaja);
			//this.jPanelParametrosAuxiliar5PresupuestoFlujoCaja.setLayout(gridaBagParametrosAuxiliar2PresupuestoFlujoCaja);			
			
			
			
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jButtonRecargarInformacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoFlujoCaja.add(this.jComboBoxTiposPaginacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoFlujoCaja.add(this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoFlujoCaja.add(this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jPanelParametrosAuxiliar1PresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresupuestoFlujoCaja.add(this.jComboBoxTiposReportesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);																		
			
			
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresupuestoFlujoCaja.add(this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jPanelParametrosAuxiliar4PresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jComboBoxTiposReportesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jCheckBoxGenerarReportePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jPanelParametrosAuxiliar2PresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jLabelAccionesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jButtonAbrirOrderByPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);			
			
			
			/*
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jCheckBoxConGraficoReportePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoFlujoCaja.add(this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);															
				
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoFlujoCaja.add(this.jCheckBoxSeleccionadosPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);															
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoFlujoCaja.add(this.jCheckBoxConGraficoReportePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jPanelParametrosAuxiliar3PresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jComboBoxTiposAccionesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
	
				
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoFlujoCaja.add(this.jTextFieldValorCampoGeneralPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresupuestoFlujoCaja = new GridBagLayout();

			this.jScrollPanelDatosPresupuestoFlujoCaja.setLayout(gridaBagLayoutDatosPresupuestoFlujoCaja);
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
			
			this.jScrollPanelDatosPresupuestoFlujoCaja.add(this.jTableDatosPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresupuestoFlujoCaja.setViewportView(this.jTableDatosPresupuestoFlujoCaja);
		this.jTableDatosPresupuestoFlujoCaja.setFillsViewportHeight(true);
		this.jTableDatosPresupuestoFlujoCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoFlujoCaja= new GridBagLayout();
		this.jPanelAccionesPresupuestoFlujoCaja.setLayout(gridaBagLayoutAccionesPresupuestoFlujoCaja);
		
		
		/*	
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
			
		this.jPanelAccionesPresupuestoFlujoCaja.add(this.jButtonNuevoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCaja= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoPresupuestoFlujoCaja.setLayout(gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCaja);

		gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
		jPanelFK_IdCentroCostoPresupuestoFlujoCaja.add(jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja, gridBagConstraintsPresupuestoFlujoCaja);

		gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
		jPanelFK_IdCentroCostoPresupuestoFlujoCaja.add(jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja, gridBagConstraintsPresupuestoFlujoCaja);

		gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCaja.gridy = 1;
		gridBagConstraintsPresupuestoFlujoCaja.gridx =1;
		jPanelFK_IdCentroCostoPresupuestoFlujoCaja.add(jButtonFK_IdCentroCostoPresupuestoFlujoCaja, gridBagConstraintsPresupuestoFlujoCaja);

		jTabbedPaneBusquedasPresupuestoFlujoCaja.addTab("1.-Por Centro Costo ", jPanelFK_IdCentroCostoPresupuestoFlujoCaja);
		jTabbedPaneBusquedasPresupuestoFlujoCaja.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCaja= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContablePresupuestoFlujoCaja.setLayout(gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCaja);

		gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
		jPanelFK_IdCuentaContablePresupuestoFlujoCaja.add(jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja, gridBagConstraintsPresupuestoFlujoCaja);

		gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
		jPanelFK_IdCuentaContablePresupuestoFlujoCaja.add(jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja, gridBagConstraintsPresupuestoFlujoCaja);


		gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
		gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
		jPanelFK_IdCuentaContablePresupuestoFlujoCaja.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCaja, gridBagConstraintsPresupuestoFlujoCaja);

		gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCaja.gridy = 1;
		gridBagConstraintsPresupuestoFlujoCaja.gridx =1;
		jPanelFK_IdCuentaContablePresupuestoFlujoCaja.add(jButtonFK_IdCuentaContablePresupuestoFlujoCaja, gridBagConstraintsPresupuestoFlujoCaja);

		jTabbedPaneBusquedasPresupuestoFlujoCaja.addTab("2.-Por Cuenta Contable ", jPanelFK_IdCuentaContablePresupuestoFlujoCaja);
		jTabbedPaneBusquedasPresupuestoFlujoCaja.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoFlujoCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsPresupuestoFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;		
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresupuestoFlujoCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;		
			this.gridBagConstraintsPresupuestoFlujoCaja.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);								
		
		
		/*
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		*/		
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx =0;
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
				
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresupuestoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresupuestoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoFlujoCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosPresupuestoFlujoCaja.setLayout(gridaBagLayoutBusquedasParametrosPresupuestoFlujoCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresupuestoFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			
			
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
			
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresupuestoFlujoCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresupuestoFlujoCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresupuestoFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.setName("jPanelReporteDinamicoPresupuestoFlujoCaja"); 
		
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.setLayout(gridaBagLayoutReporteDinamicoPresupuestoFlujoCaja);
		
		
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresupuestoFlujoCaja = new JLabelMe();

		this.jLabelColumnasSelectReportePresupuestoFlujoCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jLabelColumnasSelectReportePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresupuestoFlujoCaja = new JList<Reporte>();
		this.jListColumnasSelectReportePresupuestoFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresupuestoFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresupuestoFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresupuestoFlujoCaja=new JScrollPane(this.jListColumnasSelectReportePresupuestoFlujoCaja);
			
			this.jScrollColumnasSelectReportePresupuestoFlujoCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoFlujoCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoFlujoCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jListColumnasSelectReportePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jScrollColumnasSelectReportePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresupuestoFlujoCaja = new JLabelMe();

		this.jLabelRelacionesSelectReportePresupuestoFlujoCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresupuestoFlujoCaja = new JList<Reporte>();
		this.jListRelacionesSelectReportePresupuestoFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresupuestoFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresupuestoFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresupuestoFlujoCaja=new JScrollPane(this.jListRelacionesSelectReportePresupuestoFlujoCaja);
			
			this.jScrollRelacionesSelectReportePresupuestoFlujoCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoFlujoCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoFlujoCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresupuestoFlujoCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresupuestoFlujoCaja = new JLabelMe();

		this.jLabelConGraficoDinamicoPresupuestoFlujoCaja.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jLabelConGraficoDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCaja = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCaja.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresupuestoFlujoCaja = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresupuestoFlujoCaja.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jLabelColumnaCategoriaValorPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresupuestoFlujoCaja = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresupuestoFlujoCaja.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jLabelColumnasValoresGraficoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresupuestoFlujoCaja = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresupuestoFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresupuestoFlujoCaja.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresupuestoFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresupuestoFlujoCaja=new JScrollPane(this.jListColumnasValoresGraficoPresupuestoFlujoCaja);
			
			this.jScrollColumnasValoresGraficoPresupuestoFlujoCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoFlujoCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoFlujoCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jListColumnasSelectReportePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jScrollColumnasValoresGraficoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCaja = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCaja.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCaja.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCaja.setToolTipText("Generar EXCEL"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresupuestoFlujoCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresupuestoFlujoCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresupuestoFlujoCaja.setToolTipText("Generar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jButtonGenerarReporteDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresupuestoFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresupuestoFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresupuestoFlujoCaja.setToolTipText("Cancelar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoFlujoCaja.add(this.jButtonCerrarReporteDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresupuestoFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCaja= new JScrollPane(jPanelReporteDinamicoPresupuestoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresupuestoFlujoCaja);
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getContentPane().add(this.jScrollPanelReporteDinamicoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresupuestoFlujoCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresupuestoFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresupuestoFlujoCaja.setName("jPanelImportacionPresupuestoFlujoCaja"); 
		
		this.jPanelImportacionPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresupuestoFlujoCaja.setLayout(gridaBagLayoutImportacionPresupuestoFlujoCaja);
		
		
		this.jInternalFrameImportacionPresupuestoFlujoCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresupuestoFlujoCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresupuestoFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresupuestoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresupuestoFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoFlujoCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresupuestoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoFlujoCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresupuestoFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoFlujoCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresupuestoFlujoCaja = new JLabelMe();

		this.jLabelArchivoImportacionPresupuestoFlujoCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoFlujoCaja.add(this.jLabelArchivoImportacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresupuestoFlujoCaja = new JFileChooser();		
		this.jFileChooserImportacionPresupuestoFlujoCaja.setToolTipText("ESCOGER ARCHIVO"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonAbrirImportacionPresupuestoFlujoCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresupuestoFlujoCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresupuestoFlujoCaja.setToolTipText("Generar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoFlujoCaja.add(this.jButtonAbrirImportacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresupuestoFlujoCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionPresupuestoFlujoCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoFlujoCaja.add(this.jLabelPathArchivoImportacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresupuestoFlujoCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresupuestoFlujoCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoFlujoCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoFlujoCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoFlujoCaja.add(this.jTextFieldPathArchivoImportacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonGenerarImportacionPresupuestoFlujoCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresupuestoFlujoCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresupuestoFlujoCaja.setToolTipText("Generar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoFlujoCaja.add(this.jButtonGenerarImportacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonCerrarImportacionPresupuestoFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresupuestoFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresupuestoFlujoCaja.setToolTipText("Cancelar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoFlujoCaja.add(this.jButtonCerrarImportacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresupuestoFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionPresupuestoFlujoCaja= new JScrollPane(jPanelImportacionPresupuestoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresupuestoFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresupuestoFlujoCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresupuestoFlujoCaja);
		this.jInternalFrameImportacionPresupuestoFlujoCaja.getContentPane().add(this.jScrollPanelImportacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresupuestoFlujoCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresupuestoFlujoCaja = new JButtonMe();
			this.jButtonAbrirOrderByPresupuestoFlujoCaja.setText("Orden");
			this.jButtonAbrirOrderByPresupuestoFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoFlujoCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresupuestoFlujoCaja";
			inputMap = this.jButtonAbrirOrderByPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresupuestoFlujoCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresupuestoFlujoCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresupuestoFlujoCaja.setName("jPanelOrderByPresupuestoFlujoCaja"); 
			
			this.jPanelOrderByPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresupuestoFlujoCaja.setLayout(gridaBagLayoutOrderByPresupuestoFlujoCaja);
			
			
			this.jTableDatosPresupuestoFlujoCajaOrderBy = new JTableMe();        
			this.jTableDatosPresupuestoFlujoCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresupuestoFlujoCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresupuestoFlujoCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresupuestoFlujoCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresupuestoFlujoCajaOrderBy.setViewportView(this.jTableDatosPresupuestoFlujoCajaOrderBy);
			this.jTableDatosPresupuestoFlujoCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresupuestoFlujoCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresupuestoFlujoCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresupuestoFlujoCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresupuestoFlujoCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresupuestoFlujoCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresupuestoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresupuestoFlujoCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresupuestoFlujoCaja.setTitle("Orden");
			this.jInternalFrameOrderByPresupuestoFlujoCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresupuestoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresupuestoFlujoCaja.setResizable(true);
			this.jInternalFrameOrderByPresupuestoFlujoCaja.setClosable(true);
			this.jInternalFrameOrderByPresupuestoFlujoCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresupuestoFlujoCaja.ipady =150;
				
			this.jPanelOrderByPresupuestoFlujoCaja.add(jScrollPanelDatosPresupuestoFlujoCajaOrderBy, this.gridBagConstraintsPresupuestoFlujoCaja);//this.jTableDatosPresupuestoFlujoCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresupuestoFlujoCaja = new JButtonMe();
			this.jButtonCerrarOrderByPresupuestoFlujoCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresupuestoFlujoCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresupuestoFlujoCaja.setToolTipText("Cancelar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresupuestoFlujoCaja.add(this.jButtonCerrarOrderByPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresupuestoFlujoCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByPresupuestoFlujoCaja= new JScrollPane(jPanelOrderByPresupuestoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresupuestoFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresupuestoFlujoCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresupuestoFlujoCaja);
			
			this.jInternalFrameOrderByPresupuestoFlujoCaja.getContentPane().add(this.jScrollPanelOrderByPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);			
		
		} else {
			this.jButtonAbrirOrderByPresupuestoFlujoCaja = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presupuestoflujocajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresupuestoFlujoCaja.getRowHeight();//PresupuestoFlujoCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresupuestoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCaja.isSelected()) {
					iHeightTable=PresupuestoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresupuestoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCaja.isSelected()) {
					iHeightTable=PresupuestoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresupuestoFlujoCaja!=null && this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresupuestoFlujoCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresupuestoFlujoCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresupuestoFlujoCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoflujocajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresupuestoFlujoCaja> TraerPresupuestoFlujoCajaBeans(List<PresupuestoFlujoCaja> presupuestoflujocajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajas) {
					
				if(!(PresupuestoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresupuestoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presupuestoflujocaja.setsDetalleGeneralEntityReporte(PresupuestoFlujoCajaConstantesFunciones.getPresupuestoFlujoCajaDescripcion(presupuestoflujocaja));
										
						
					
						
					
				} else  {
							
					//presupuestoflujocaja.setsDetalleGeneralEntityReporte(presupuestoflujocaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//presupuestoflujocajabeans.add(presupuestoflujocajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presupuestoflujocajas;
    }
	//PARA REPORTES FIN
}
