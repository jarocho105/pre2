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
import com.bydan.erp.contabilidad.util.SaldoContableConstantesFunciones;

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
public class SaldoContableJInternalFrame extends SaldoContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSaldoContable;
	
	protected JMenuBar jmenuBarSaldoContable;
	
	protected JMenu jmenuSaldoContable;
	protected JMenu jmenuDatosSaldoContable;
	protected JMenu jmenuArchivoSaldoContable;
	protected JMenu jmenuAccionesSaldoContable;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSaldoContable;	
	protected GridBagConstraints gridBagConstraintsSaldoContable;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SaldoContableDetalleFormJInternalFrame jInternalFrameDetalleFormSaldoContable;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSaldoContable;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSaldoContable;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public SaldoContableSessionBean saldocontableSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SaldoContable> saldocontables;		
	public List<SaldoContable> saldocontablesEliminados;	
	public List<SaldoContable> saldocontablesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySaldoContable;		
	protected JButton jButtonAbrirOrderBySaldoContable;
	
	
	//protected JPanel jPanelOrderBySaldoContable;
	//public JScrollPane jScrollPanelOrderBySaldoContable;	
	//protected JButton jButtonCerrarOrderBySaldoContable;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SaldoContableLogic saldocontableLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSaldoContable;
	public JScrollPane jScrollPanelDatosEdicionSaldoContable;
	public JScrollPane jScrollPanelDatosGeneralSaldoContable;
    
	
	
	//public JScrollPane jScrollPanelDatosSaldoContableOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSaldoContable;
	//public JScrollPane jScrollPanelImportacionSaldoContable;
	
	
	
	protected JPanel jPanelAccionesSaldoContable;
	
    protected JPanel jPanelPaginacionSaldoContable;
    protected JPanel jPanelParametrosReportesSaldoContable;
	protected JPanel jPanelParametrosReportesAccionesSaldoContable;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SaldoContable;
	protected JPanel jPanelParametrosAuxiliar2SaldoContable;
	protected JPanel jPanelParametrosAuxiliar3SaldoContable;
	protected JPanel jPanelParametrosAuxiliar4SaldoContable;
	//protected JPanel jPanelParametrosAuxiliar5SaldoContable;
	
	
	
	//protected JPanel jPanelReporteDinamicoSaldoContable;
	//protected JPanel jPanelImportacionSaldoContable;
	
	
	public JTable jTableDatosSaldoContable;
	
	
	
	//public JTable jTableDatosSaldoContableOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSaldoContable;
	protected JButton jButtonDuplicarSaldoContable;
	protected JButton jButtonCopiarSaldoContable;
	protected JButton jButtonVerFormSaldoContable;
	protected JButton jButtonNuevoRelacionesSaldoContable;
	protected JButton jButtonModificarSaldoContable;
	
    protected JButton jButtonGuardarCambiosTablaSaldoContable;
	protected JButton jButtonCerrarSaldoContable;
	
	
	protected JButton jButtonRecargarInformacionSaldoContable;
	protected JButton jButtonProcesarInformacionSaldoContable;
	
	
	protected JButton jButtonAnterioresSaldoContable;
	protected JButton jButtonSiguientesSaldoContable;
	protected JButton jButtonNuevoGuardarCambiosSaldoContable;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSaldoContable;
	//protected JButton jButtonCerrarReporteDinamicoSaldoContable;
	//protected JButton jButtonGenerarExcelReporteDinamicoSaldoContable;	
	
	
	
	//protected JButton jButtonAbrirImportacionSaldoContable;
	//protected JButton jButtonGenerarImportacionSaldoContable;
	//protected JButton jButtonCerrarImportacionSaldoContable;
	//protected JFileChooser jFileChooserImportacionSaldoContable;
	//protected File fileImportacionSaldoContable;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSaldoContable;
	protected JButton jButtonDuplicarToolBarSaldoContable;
	protected JButton jButtonNuevoRelacionesToolBarSaldoContable;
	
	
	public JButton jButtonGuardarCambiosToolBarSaldoContable;
	protected JButton jButtonCopiarToolBarSaldoContable;
	protected JButton jButtonVerFormToolBarSaldoContable;
	public JButton jButtonGuardarCambiosTablaToolBarSaldoContable;
	protected JButton jButtonMostrarOcultarTablaToolBarSaldoContable;
	protected JButton jButtonCerrarToolBarSaldoContable;
	
	protected JButton jButtonRecargarInformacionToolBarSaldoContable;
	protected JButton jButtonProcesarInformacionToolBarSaldoContable;
	protected JButton jButtonAnterioresToolBarSaldoContable;
	protected JButton jButtonSiguientesToolBarSaldoContable;
	protected JButton jButtonNuevoGuardarCambiosToolBarSaldoContable;
	protected JButton jButtonAbrirOrderByToolBarSaldoContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSaldoContable;
	protected JMenuItem jMenuItemDuplicarSaldoContable;
	protected JMenuItem jMenuItemNuevoRelacionesSaldoContable;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSaldoContable;
	protected JMenuItem jMenuItemCopiarSaldoContable;
	protected JMenuItem jMenuItemVerFormSaldoContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaSaldoContable;
	protected JMenuItem jMenuItemCerrarSaldoContable;
	protected JMenuItem jMenuItemDetalleCerrarSaldoContable;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySaldoContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarSaldoContable;
	
	protected JMenuItem jMenuItemRecargarInformacionSaldoContable;
	protected JMenuItem jMenuItemProcesarInformacionSaldoContable;
	protected JMenuItem jMenuItemAnterioresSaldoContable;
	protected JMenuItem jMenuItemSiguientesSaldoContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSaldoContable;
	protected JMenuItem jMenuItemAbrirOrderBySaldoContable;
	protected JMenuItem jMenuItemMostrarOcultarSaldoContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSaldoContable;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSaldoContable;
	protected JCheckBox jCheckBoxSeleccionadosSaldoContable;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSaldoContable;
	protected JCheckBox jCheckBoxConGraficoReporteSaldoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSaldoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSaldoContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSaldoContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSaldoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSaldoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSaldoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSaldoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSaldoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSaldoContable;
	protected JTextField jTextFieldValorCampoGeneralSaldoContable;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSaldoContable;
	//public JList<Reporte> jListColumnasSelectReporteSaldoContable;
	//public JScrollPane jScrollColumnasSelectReporteSaldoContable;
	
	//public JLabel jLabelRelacionesSelectReporteSaldoContable;
	//public JList<Reporte> jListRelacionesSelectReporteSaldoContable;
	//public JScrollPane jScrollRelacionesSelectReporteSaldoContable;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSaldoContable;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSaldoContable;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSaldoContable;
	//public JLabel jLabelTiposArchivoReporteDinamicoSaldoContable;
	
		
	//public JLabel jLabelArchivoImportacionSaldoContable;	
	//public JLabel jLabelPathArchivoImportacionSaldoContable;
	//protected JTextField jTextFieldPathArchivoImportacionSaldoContable;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSaldoContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSaldoContable;
	
	//public JLabel jLabelColumnaCategoriaValorSaldoContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSaldoContable;
	
	//public JLabel jLabelColumnasValoresGraficoSaldoContable;
	//public JList<Reporte> jListColumnasValoresGraficoSaldoContable;
	//public JScrollPane jScrollColumnasValoresGraficoSaldoContable;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSaldoContable;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSaldoContable;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSaldoContable;
	public JPanel jPanelFK_IdCuentaContableSaldoContable;
	public JButton jButtonFK_IdCuentaContableSaldoContable;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableSaldoContable;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableSaldoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableSaldoContable= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableSaldoContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableSaldoContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableSaldoContableArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableSaldoContable;
	
	
	
	
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
	public SaldoContableJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SaldoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoContableJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoContableJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoContableJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SaldoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSaldoContable)	{
		this.jButtonRecargarInformacionSaldoContable = jButtonRecargarInformacionSaldoContable;
	}
	
	public JButton getjButtonProcesarInformacionSaldoContable() {
		return this.jButtonProcesarInformacionSaldoContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSaldoContable)	{
		this.jButtonProcesarInformacionSaldoContable = jButtonProcesarInformacionSaldoContable;
	}
	
	
	public JButton getjButtonRecargarInformacionSaldoContable() {
		return this.jButtonRecargarInformacionSaldoContable;
	}
	
	
	public List<SaldoContable> getsaldocontables() {
		return this.saldocontables;
	}

	public void setsaldocontables(List<SaldoContable> saldocontables) {
		this.saldocontables = saldocontables;
	}
	
	public List<SaldoContable> getsaldocontablesAux() {
		return this.saldocontablesAux;
	}

	public void setsaldocontablesAux(List<SaldoContable> saldocontablesAux) {
		this.saldocontablesAux = saldocontablesAux;
	}
	
	public List<SaldoContable> getsaldocontablesEliminados() {
		return this.saldocontablesEliminados;
	}

	public void setSaldoContablesEliminados(List<SaldoContable> saldocontablesEliminados) {
		this.saldocontablesEliminados = saldocontablesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSaldoContable() {
		return jComboBoxTiposSeleccionarSaldoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSaldoContable(
			JComboBox jComboBoxTiposSeleccionarSaldoContable) {
		this.jComboBoxTiposSeleccionarSaldoContable = jComboBoxTiposSeleccionarSaldoContable;
	}
	
	public void setBorderResaltarTiposSeleccionarSaldoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSaldoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSaldoContable .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSaldoContable() {
		return jTextFieldValorCampoGeneralSaldoContable;
	}

	public void setjTextFieldValorCampoGeneralSaldoContable(
			JTextField jTextFieldValorCampoGeneralSaldoContable) {
		this.jTextFieldValorCampoGeneralSaldoContable = jTextFieldValorCampoGeneralSaldoContable;
	}

	public void setBorderResaltarValorCampoGeneralSaldoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoContable.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSaldoContable .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSaldoContable() {
		return this.jCheckBoxSeleccionarTodosSaldoContable;
	}

	public void setjCheckBoxSeleccionarTodosSaldoContable(
			JCheckBox jCheckBoxSeleccionarTodosSaldoContable) {
		this.jCheckBoxSeleccionarTodosSaldoContable = jCheckBoxSeleccionarTodosSaldoContable;
	}

	public void setBorderResaltarSeleccionarTodosSaldoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSaldoContable .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSaldoContable() {
		return this.jCheckBoxSeleccionadosSaldoContable;
	}

	public void setjCheckBoxSeleccionadosSaldoContable(
			JCheckBox jCheckBoxSeleccionadosSaldoContable) {
		this.jCheckBoxSeleccionadosSaldoContable = jCheckBoxSeleccionadosSaldoContable;
	}
	
	public void setBorderResaltarSeleccionadosSaldoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSaldoContable .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSaldoContable() {
		return this.jComboBoxTiposArchivosReportesSaldoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSaldoContable(
			JComboBox jComboBoxTiposArchivosReportesSaldoContable) {
		this.jComboBoxTiposArchivosReportesSaldoContable = jComboBoxTiposArchivosReportesSaldoContable;
	}

	public void setBorderResaltarTiposArchivosReportesSaldoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSaldoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSaldoContable() {
		return this.jComboBoxTiposReportesSaldoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSaldoContable(
			JComboBox jComboBoxTiposReportesSaldoContable) {
		this.jComboBoxTiposReportesSaldoContable = jComboBoxTiposReportesSaldoContable;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSaldoContable() {
	//	return jComboBoxTiposReportesDinamicoSaldoContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSaldoContable(
	//		JComboBox jComboBoxTiposReportesDinamicoSaldoContable) {
	//	this.jComboBoxTiposReportesDinamicoSaldoContable = jComboBoxTiposReportesDinamicoSaldoContable;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSaldoContable() {
	//	return jComboBoxTiposArchivosReportesDinamicoSaldoContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSaldoContable(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSaldoContable) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSaldoContable = jComboBoxTiposArchivosReportesDinamicoSaldoContable;
	//}
	
	public void setBorderResaltarTiposReportesSaldoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSaldoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSaldoContable() {
		return this.jComboBoxTiposGraficosReportesSaldoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSaldoContable(
			JComboBox jComboBoxTiposGraficosReportesSaldoContable) {
		this.jComboBoxTiposGraficosReportesSaldoContable = jComboBoxTiposGraficosReportesSaldoContable;
	}
	
	public void setBorderResaltarTiposGraficosReportesSaldoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSaldoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSaldoContable() {
		return this.jComboBoxTiposPaginacionSaldoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSaldoContable(
			JComboBox jComboBoxTiposPaginacionSaldoContable) {
		this.jComboBoxTiposPaginacionSaldoContable = jComboBoxTiposPaginacionSaldoContable;
	}
	
	public void setBorderResaltarTiposPaginacionSaldoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSaldoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSaldoContable() {
		return this.jComboBoxTiposRelacionesSaldoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSaldoContable() {
		return this.jComboBoxTiposAccionesSaldoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSaldoContable(
			JComboBox jComboBoxTiposRelacionesSaldoContable) {
		this.jComboBoxTiposRelacionesSaldoContable = jComboBoxTiposRelacionesSaldoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSaldoContable(
			JComboBox jComboBoxTiposAccionesSaldoContable) {
		this.jComboBoxTiposAccionesSaldoContable = jComboBoxTiposAccionesSaldoContable;
	}
	
	public void setBorderResaltarTiposRelacionesSaldoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSaldoContable .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSaldoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSaldoContable .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSaldoContable() {
	//	return jCheckBoxConGraficoDinamicoSaldoContable;
	//}

	//public void setjCheckBoxConGraficoDinamicoSaldoContable(
	//		JCheckBox jCheckBoxConGraficoDinamicoSaldoContable) {
	//	this.jCheckBoxConGraficoDinamicoSaldoContable = jCheckBoxConGraficoDinamicoSaldoContable;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSaldoContable() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSaldoContable.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSaldoContable .setBorder(borderResaltar);		
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
		this.saldocontableSessionBean=new SaldoContableSessionBean();
		
		this.saldocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.saldocontableSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SaldoContableJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SaldoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SaldoContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SaldoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SaldoContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Saldo Contable MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
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
		
		SaldoContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SaldoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSaldoContable= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"nuevo","nuevo","Nuevo"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"duplicar","duplicar","Duplicar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"copiar","copiar","Copiar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"ver_form","ver_form","Ver"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"recargar","recargar","Recargar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSaldoContable,this.jTtoolBarSaldoContable,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSaldoContable,this.jTtoolBarSaldoContable,
							"cerrar","cerrar","Salir"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSaldoContable=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSaldoContable;
			
				this.jButtonProcesarInformacionToolBarSaldoContable=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSaldoContable;
				
		//protected JButton jButtonModificarToolBarSaldoContable;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSaldoContable=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSaldoContable=new JMenuMe("General");
		this.jmenuArchivoSaldoContable=new JMenuMe("Archivo");
		this.jmenuAccionesSaldoContable=new JMenuMe("Acciones");
		this.jmenuDatosSaldoContable=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSaldoContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSaldoContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSaldoContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSaldoContable= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSaldoContable.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSaldoContable,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSaldoContable= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSaldoContable.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSaldoContable,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSaldoContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSaldoContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSaldoContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSaldoContable= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSaldoContable.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSaldoContable,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSaldoContable= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSaldoContable.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSaldoContable,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSaldoContable= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSaldoContable.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSaldoContable,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSaldoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSaldoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSaldoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSaldoContable= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSaldoContable.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSaldoContable,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSaldoContable= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSaldoContable.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSaldoContable,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSaldoContable= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSaldoContable.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSaldoContable,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSaldoContable= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSaldoContable.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSaldoContable,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySaldoContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySaldoContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySaldoContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSaldoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSaldoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSaldoContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySaldoContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySaldoContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySaldoContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSaldoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSaldoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSaldoContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSaldoContable= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSaldoContable.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSaldoContable,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSaldoContable.add(this.jMenuItemCerrarSaldoContable);
			
			this.jmenuAccionesSaldoContable.add(this.jMenuItemNuevoSaldoContable);
			this.jmenuAccionesSaldoContable.add(this.jMenuItemNuevoGuardarCambiosSaldoContable);
			this.jmenuAccionesSaldoContable.add(this.jMenuItemNuevoRelacionesSaldoContable);
			this.jmenuAccionesSaldoContable.add(this.jMenuItemGuardarCambiosTablaSaldoContable);		
			this.jmenuAccionesSaldoContable.add(this.jMenuItemDuplicarSaldoContable);		
			this.jmenuAccionesSaldoContable.add(this.jMenuItemCopiarSaldoContable);		
			this.jmenuAccionesSaldoContable.add(this.jMenuItemVerFormSaldoContable);		
			
			this.jmenuDatosSaldoContable.add(this.jMenuItemRecargarInformacionSaldoContable);				
			this.jmenuDatosSaldoContable.add(this.jMenuItemAnterioresSaldoContable);				
			this.jmenuDatosSaldoContable.add(this.jMenuItemSiguientesSaldoContable);				
			this.jmenuDatosSaldoContable.add(this.jMenuItemAbrirOrderBySaldoContable);				
			this.jmenuDatosSaldoContable.add(this.jMenuItemMostrarOcultarSaldoContable);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSaldoContable.add(this.jMenuItemGuardarCambiosSaldoContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSaldoContable.add(this.jmenuArchivoSaldoContable);		
			this.jmenuBarSaldoContable.add(this.jmenuAccionesSaldoContable);		
			this.jmenuBarSaldoContable.add(this.jmenuDatosSaldoContable);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSaldoContable);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSaldoContable() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableSaldoContable.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableSaldoContable= new JButtonMe();
		this.jButtonFK_IdCuentaContableSaldoContable.setText("Buscar");
		this.jButtonFK_IdCuentaContableSaldoContable.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableSaldoContable,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableSaldoContable = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableSaldoContable.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableSaldoContable.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableSaldoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableSaldoContable= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableSaldoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableSaldoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableSaldoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableSaldoContable.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableSaldoContable.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableSaldoContable.setFocusable(false);


		this.jTabbedPaneBusquedasSaldoContable=new JTabbedPane();


		this.jTabbedPaneBusquedasSaldoContable.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSaldoContable.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSaldoContable.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSaldoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSaldoContable,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSaldoContable = new SaldoContableDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Saldo Contable DATOS");
			this.jInternalFrameDetalleFormSaldoContable = new SaldoContableDetalleFormJInternalFrame(jDesktopPane,this.saldocontableSessionBean.getConGuardarRelaciones(),this.saldocontableSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSaldoContable = null;//new SaldoContableDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSaldoContable= new GridBagLayout();
		
		
		this.jTableDatosSaldoContable = new JTableMe();      
		
		String sToolTipSaldoContable="";
		sToolTipSaldoContable=SaldoContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSaldoContable+="(Contabilidad.SaldoContable)";
		}
		
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipSaldoContable+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSaldoContable.setToolTipText(sToolTipSaldoContable);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSaldoContable);
		this.jTableDatosSaldoContable.setAutoCreateRowSorter(true);
		this.jTableDatosSaldoContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSaldoContable.setRowSelectionAllowed(true);
		this.jTableDatosSaldoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSaldoContable,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSaldoContable = new JButtonMe();
		this.jButtonDuplicarSaldoContable = new JButtonMe();
		this.jButtonCopiarSaldoContable = new JButtonMe();
		this.jButtonVerFormSaldoContable = new JButtonMe();
		this.jButtonNuevoRelacionesSaldoContable = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSaldoContable = new JButtonMe();
		this.jButtonCerrarSaldoContable = new JButtonMe();
		
		this.jScrollPanelDatosSaldoContable = new JScrollPane();   
        this.jScrollPanelDatosGeneralSaldoContable = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Saldo Contable";
		
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosSaldoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSaldoContable.setToolTipText("Acciones");
        this.jPanelAccionesSaldoContable.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSaldoContable=new ReporteDinamicoJInternalFrame(SaldoContableConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSaldoContable();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSaldoContable=new ImportacionJInternalFrame(SaldoContableConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSaldoContable();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySaldoContable = new JButtonMe();
		
		this.jButtonAbrirOrderBySaldoContable.setText("Orden");
		this.jButtonAbrirOrderBySaldoContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySaldoContable,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySaldoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldoContable,false,this);
			
			//this.cargarOrderBySaldoContable(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySaldoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldoContable,true,this);
			
			//this.cargarOrderBySaldoContable(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSaldoContable.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosSaldoContable.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosSaldoContable.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosSaldoContable.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSaldoContable.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSaldoContable.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSaldoContable.setText("Nuevo");
		this.jButtonDuplicarSaldoContable.setText("Duplicar");
		this.jButtonCopiarSaldoContable.setText("Copiar");
		this.jButtonVerFormSaldoContable.setText("Ver");
		this.jButtonNuevoRelacionesSaldoContable.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSaldoContable.setText("Guardar");
		this.jButtonCerrarSaldoContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSaldoContable,"nuevo_button","Nuevo",this.saldocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSaldoContable,"duplicar_button","Duplicar",this.saldocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSaldoContable,"copiar_button","Copiar",this.saldocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSaldoContable,"ver_form","Ver",this.saldocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSaldoContable,"nuevorelaciones_button","Nuevo Rel",this.saldocontableSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSaldoContable,"guardarcambiostabla_button","Guardar",this.saldocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSaldoContable,"cerrar_button","Salir",this.saldocontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSaldoContable.setToolTipText("Nuevo"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSaldoContable.setToolTipText("Duplicar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSaldoContable.setToolTipText("Copiar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSaldoContable.setToolTipText("Ver"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSaldoContable.setToolTipText("Nuevo Rel"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSaldoContable.setToolTipText("Guardar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSaldoContable.setToolTipText("Salir"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSaldoContable";
		inputMap = this.jButtonNuevoSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSaldoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSaldoContable"));
		
		//DUPLICAR
		sMapKey = "DuplicarSaldoContable";
		inputMap = this.jButtonDuplicarSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSaldoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSaldoContable"));
		
		//COPIAR
		sMapKey = "CopiarSaldoContable";
		inputMap = this.jButtonCopiarSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSaldoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSaldoContable"));
		
		//VEr FORM
		sMapKey = "VerFormSaldoContable";
		inputMap = this.jButtonVerFormSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSaldoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSaldoContable"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSaldoContable";
		inputMap = this.jButtonNuevoRelacionesSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSaldoContable"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSaldoContable";
		inputMap = this.jButtonModificarSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSaldoContable"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSaldoContable";
		inputMap = this.jButtonCerrarSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSaldoContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSaldoContable";
		inputMap = this.jButtonGuardarCambiosTablaSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSaldoContable"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SaldoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SaldoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SaldoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SaldoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SaldoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSaldoContable.setName("jPanelParametrosReportesSaldoContable"); 
		
		this.jPanelParametrosReportesAccionesSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSaldoContable.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSaldoContable.setName("jPanelParametrosReportesAccionesSaldoContable"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSaldoContable = new JButtonMe();
		this.jButtonRecargarInformacionSaldoContable.setText("Recargar");
		this.jButtonRecargarInformacionSaldoContable.setToolTipText("Recargar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSaldoContable,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSaldoContable = new JButtonMe();
		this.jButtonProcesarInformacionSaldoContable.setText("Procesar");
		this.jButtonProcesarInformacionSaldoContable.setToolTipText("Procesar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSaldoContable.setVisible(false);
			
		this.jButtonProcesarInformacionSaldoContable.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSaldoContable.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSaldoContable.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSaldoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldoContable.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSaldoContable.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSaldoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldoContable.setText("TIPO");       
		this.jComboBoxTiposReportesSaldoContable.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSaldoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldoContable.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSaldoContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSaldoContable = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSaldoContable.setText("Paginacion");
		this.jComboBoxTiposPaginacionSaldoContable.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSaldoContable = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSaldoContable.setText("Accion");
		this.jComboBoxTiposRelacionesSaldoContable.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSaldoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSaldoContable.setText("Accion");
		this.jComboBoxTiposAccionesSaldoContable.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSaldoContable = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSaldoContable.setText("Accion");
		this.jComboBoxTiposSeleccionarSaldoContable.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSaldoContable=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSaldoContable.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSaldoContable.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSaldoContable.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSaldoContable = new JLabelMe();
		
		this.jLabelAccionesSaldoContable.setText("Acciones");		
		this.jLabelAccionesSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSaldoContable = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSaldoContable.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSaldoContable.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSaldoContable = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSaldoContable.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSaldoContable.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSaldoContable = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSaldoContable.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSaldoContable.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSaldoContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSaldoContable.setText("Graf.");
		this.jCheckBoxConGraficoReporteSaldoContable.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSaldoContable = new JButtonMe();
		//this.jButtonAnterioresSaldoContable.setText("<<");
        this.jButtonAnterioresSaldoContable.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSaldoContable,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSaldoContable = new JButtonMe();
		//this.jButtonSiguientesSaldoContable.setText(">>");
        this.jButtonSiguientesSaldoContable.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSaldoContable,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSaldoContable = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSaldoContable.setText("Nue");
        this.jButtonNuevoGuardarCambiosSaldoContable.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSaldoContable,"nuevoguardarcambios_button","Nue",this.saldocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSaldoContable";
		inputMap = this.jButtonNuevoGuardarCambiosSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSaldoContable"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSaldoContable";
		inputMap = this.jButtonRecargarInformacionSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSaldoContable"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSaldoContable";
		inputMap = this.jButtonSiguientesSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSaldoContable"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSaldoContable";
		inputMap = this.jButtonAnterioresSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSaldoContable"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSaldoContable();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSaldoContable.setMinimumSize(new Dimension(this.getWidth(),SaldoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldoContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSaldoContable.setMaximumSize(new Dimension(this.getWidth(),SaldoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldoContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSaldoContable.setPreferredSize(new Dimension(this.getWidth(),SaldoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldoContableBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSaldoContable = new GridBagLayout();

			this.jPanelPaginacionSaldoContable.setLayout(gridaBagLayoutPaginacionSaldoContable);						
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = 0;
			this.gridBagConstraintsSaldoContable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSaldoContable.add(this.jButtonAnterioresSaldoContable, this.gridBagConstraintsSaldoContable);
					
						
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSaldoContable.gridy = 0;
			
			this.jPanelPaginacionSaldoContable.add(this.jButtonNuevoGuardarCambiosSaldoContable, this.gridBagConstraintsSaldoContable);
						
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSaldoContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSaldoContable.gridy = 0;
			this.jPanelPaginacionSaldoContable.add(this.jButtonSiguientesSaldoContable, this.gridBagConstraintsSaldoContable);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = 1;
			this.gridBagConstraintsSaldoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldoContable.add(this.jButtonNuevoSaldoContable, this.gridBagConstraintsSaldoContable);
						
			
			
			if(!this.saldocontableSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSaldoContable = new GridBagConstraints();
				this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSaldoContable.gridy = 1;
				this.gridBagConstraintsSaldoContable.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSaldoContable.add(this.jButtonGuardarCambiosTablaSaldoContable, this.gridBagConstraintsSaldoContable);
			}
			
			
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = 1;
			this.gridBagConstraintsSaldoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldoContable.add(this.jButtonDuplicarSaldoContable, this.gridBagConstraintsSaldoContable);
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = 1;
			this.gridBagConstraintsSaldoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldoContable.add(this.jButtonCopiarSaldoContable, this.gridBagConstraintsSaldoContable);
		
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = 1;
			this.gridBagConstraintsSaldoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldoContable.add(this.jButtonVerFormSaldoContable, this.gridBagConstraintsSaldoContable);
		
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = 1;
			this.gridBagConstraintsSaldoContable.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSaldoContable.add(this.jButtonCerrarSaldoContable, this.gridBagConstraintsSaldoContable);
		
		
		
		this.jButtonRecargarInformacionSaldoContable.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSaldoContable.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSaldoContable.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSaldoContable.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSaldoContable.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSaldoContable.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSaldoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSaldoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSaldoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSaldoContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSaldoContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSaldoContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSaldoContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSaldoContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSaldoContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSaldoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSaldoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSaldoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSaldoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSaldoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSaldoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSaldoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSaldoContable.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSaldoContable.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSaldoContable.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSaldoContable.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSaldoContable.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSaldoContable.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSaldoContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSaldoContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSaldoContable.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSaldoContable.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSaldoContable.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSaldoContable.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSaldoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSaldoContable = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SaldoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SaldoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SaldoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SaldoContable = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSaldoContable.setLayout(gridaBagParametrosReportesSaldoContable);
			this.jPanelParametrosReportesAccionesSaldoContable.setLayout(gridaBagParametrosReportesAccionesSaldoContable);
			
			
			this.jPanelParametrosAuxiliar1SaldoContable.setLayout(gridaBagParametrosAuxiliar1SaldoContable);
			this.jPanelParametrosAuxiliar2SaldoContable.setLayout(gridaBagParametrosAuxiliar2SaldoContable);
			this.jPanelParametrosAuxiliar3SaldoContable.setLayout(gridaBagParametrosAuxiliar3SaldoContable);
			this.jPanelParametrosAuxiliar4SaldoContable.setLayout(gridaBagParametrosAuxiliar4SaldoContable);
			//this.jPanelParametrosAuxiliar5SaldoContable.setLayout(gridaBagParametrosAuxiliar2SaldoContable);			
			
			
			
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldoContable.add(this.jButtonRecargarInformacionSaldoContable, this.gridBagConstraintsSaldoContable);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldoContable.add(this.jComboBoxTiposPaginacionSaldoContable, this.gridBagConstraintsSaldoContable);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldoContable.add(this.jCheckBoxConAltoMaximoTablaSaldoContable, this.gridBagConstraintsSaldoContable);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldoContable.add(this.jComboBoxTiposArchivosReportesSaldoContable, this.gridBagConstraintsSaldoContable);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldoContable.add(this.jPanelParametrosAuxiliar1SaldoContable, this.gridBagConstraintsSaldoContable);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SaldoContable.add(this.jComboBoxTiposReportesSaldoContable, this.gridBagConstraintsSaldoContable);																		
			
			
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SaldoContable.add(this.jComboBoxTiposGraficosReportesSaldoContable, this.gridBagConstraintsSaldoContable);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldoContable.add(this.jPanelParametrosAuxiliar4SaldoContable, this.gridBagConstraintsSaldoContable);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldoContable.add(this.jComboBoxTiposReportesSaldoContable, this.gridBagConstraintsSaldoContable);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldoContable.add(this.jCheckBoxGenerarReporteSaldoContable, this.gridBagConstraintsSaldoContable);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldoContable.add(this.jPanelParametrosAuxiliar2SaldoContable, this.gridBagConstraintsSaldoContable);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldoContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldoContable.add(this.jLabelAccionesSaldoContable, this.gridBagConstraintsSaldoContable);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSaldoContable = new GridBagConstraints();
				this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSaldoContable.add(this.jButtonAbrirOrderBySaldoContable, this.gridBagConstraintsSaldoContable);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldoContable.add(this.jComboBoxTiposSeleccionarSaldoContable, this.gridBagConstraintsSaldoContable);			
			
			
			/*
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldoContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldoContable.add(this.jCheckBoxSeleccionarTodosSaldoContable, this.gridBagConstraintsSaldoContable);
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldoContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldoContable.add(this.jCheckBoxConGraficoReporteSaldoContable, this.gridBagConstraintsSaldoContable);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldoContable.add(this.jCheckBoxSeleccionarTodosSaldoContable, this.gridBagConstraintsSaldoContable);															
				
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldoContable.add(this.jCheckBoxSeleccionadosSaldoContable, this.gridBagConstraintsSaldoContable);															
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldoContable.add(this.jCheckBoxConGraficoReporteSaldoContable, this.gridBagConstraintsSaldoContable);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldoContable.add(this.jPanelParametrosAuxiliar3SaldoContable, this.gridBagConstraintsSaldoContable);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldoContable.add(this.jComboBoxTiposAccionesSaldoContable, this.gridBagConstraintsSaldoContable);
	
				
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldoContable.add(this.jTextFieldValorCampoGeneralSaldoContable, this.gridBagConstraintsSaldoContable);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSaldoContable = new GridBagLayout();

			this.jScrollPanelDatosSaldoContable.setLayout(gridaBagLayoutDatosSaldoContable);
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = 0;
			this.gridBagConstraintsSaldoContable.gridx = 0;
			
			this.jScrollPanelDatosSaldoContable.add(this.jTableDatosSaldoContable, this.gridBagConstraintsSaldoContable);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSaldoContable.setViewportView(this.jTableDatosSaldoContable);
		this.jTableDatosSaldoContable.setFillsViewportHeight(true);
		this.jTableDatosSaldoContable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSaldoContable= new GridBagLayout();
		this.jPanelAccionesSaldoContable.setLayout(gridaBagLayoutAccionesSaldoContable);
		
		
		/*	
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 0;
			
		this.jPanelAccionesSaldoContable.add(this.jButtonNuevoSaldoContable, this.gridBagConstraintsSaldoContable);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableSaldoContable= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableSaldoContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableSaldoContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableSaldoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableSaldoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableSaldoContable.setLayout(gridaBagLayoutFK_IdCuentaContableSaldoContable);

		gridBagConstraintsSaldoContable = new GridBagConstraints();
		gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoContable.gridy = 0;
		gridBagConstraintsSaldoContable.gridx = 0;
		jPanelFK_IdCuentaContableSaldoContable.add(jLabelid_cuenta_contableFK_IdCuentaContableSaldoContable, gridBagConstraintsSaldoContable);

		gridBagConstraintsSaldoContable = new GridBagConstraints();
		gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoContable.gridy = 0;
		gridBagConstraintsSaldoContable.gridx = 1;
		jPanelFK_IdCuentaContableSaldoContable.add(jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable, gridBagConstraintsSaldoContable);


		gridBagConstraintsSaldoContable = new GridBagConstraints();
		gridBagConstraintsSaldoContable.anchor = GridBagConstraints.EAST;
		gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
		gridBagConstraintsSaldoContable.gridy = 0;
		gridBagConstraintsSaldoContable.gridx = 0;
		jPanelFK_IdCuentaContableSaldoContable.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableSaldoContable, gridBagConstraintsSaldoContable);

		gridBagConstraintsSaldoContable = new GridBagConstraints();
		gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoContable.gridy = 1;
		gridBagConstraintsSaldoContable.gridx =1;
		jPanelFK_IdCuentaContableSaldoContable.add(jButtonFK_IdCuentaContableSaldoContable, gridBagConstraintsSaldoContable);

		jTabbedPaneBusquedasSaldoContable.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableSaldoContable);
		jTabbedPaneBusquedasSaldoContable.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSaldoContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSaldoContable);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();						
			this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldoContable.gridx = 0;		
			//this.gridBagConstraintsSaldoContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSaldoContable.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSaldoContable, this.gridBagConstraintsSaldoContable);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSaldoContable.gridx = 0;		
		//this.gridBagConstraintsSaldoContable.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSaldoContable.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSaldoContable);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldoContable.gridx = 0;		
			this.gridBagConstraintsSaldoContable.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSaldoContable.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSaldoContable, this.gridBagConstraintsSaldoContable);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoContable.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSaldoContable, this.gridBagConstraintsSaldoContable);								
		
		
		/*
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSaldoContable, this.gridBagConstraintsSaldoContable);
		*/		
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSaldoContable.gridx =0;
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSaldoContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSaldoContable, this.gridBagConstraintsSaldoContable);
				
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSaldoContable, this.gridBagConstraintsSaldoContable);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SaldoContableJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSaldoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSaldoContable = new GridBagLayout();
			this.jPanelBusquedasParametrosSaldoContable.setLayout(gridaBagLayoutBusquedasParametrosSaldoContable);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSaldoContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSaldoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSaldoContable, this.gridBagConstraintsSaldoContable);
			
			
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSaldoContable, this.gridBagConstraintsSaldoContable);
		
			
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSaldoContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSaldoContable, this.gridBagConstraintsSaldoContable);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSaldoContable;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSaldoContable() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSaldoContable = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSaldoContable.setName("jPanelReporteDinamicoSaldoContable"); 
		
		this.jPanelReporteDinamicoSaldoContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSaldoContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSaldoContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSaldoContable.setLayout(gridaBagLayoutReporteDinamicoSaldoContable);
		
		
		this.jInternalFrameReporteDinamicoSaldoContable= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSaldoContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSaldoContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSaldoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSaldoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSaldoContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSaldoContable.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSaldoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSaldoContable.setResizable(true);
	    this.jInternalFrameReporteDinamicoSaldoContable.setClosable(true);
	    this.jInternalFrameReporteDinamicoSaldoContable.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSaldoContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSaldoContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSaldoContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Contables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSaldoContable = new JLabelMe();

		this.jLabelColumnasSelectReporteSaldoContable.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldoContable.add(this.jLabelColumnasSelectReporteSaldoContable, this.gridBagConstraintsSaldoContable);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSaldoContable = new JList<Reporte>();
		this.jListColumnasSelectReporteSaldoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSaldoContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSaldoContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSaldoContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSaldoContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSaldoContable=new JScrollPane(this.jListColumnasSelectReporteSaldoContable);
			
			this.jScrollColumnasSelectReporteSaldoContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSaldoContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSaldoContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSaldoContable.add(this.jListColumnasSelectReporteSaldoContable, this.gridBagConstraintsSaldoContable);
		this.jPanelReporteDinamicoSaldoContable.add(this.jScrollColumnasSelectReporteSaldoContable, this.gridBagConstraintsSaldoContable);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSaldoContable = new JLabelMe();

		this.jLabelRelacionesSelectReporteSaldoContable.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSaldoContable = new JList<Reporte>();
		this.jListRelacionesSelectReporteSaldoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSaldoContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSaldoContable.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSaldoContable.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSaldoContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSaldoContable=new JScrollPane(this.jListRelacionesSelectReporteSaldoContable);
			
			this.jScrollRelacionesSelectReporteSaldoContable.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSaldoContable.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSaldoContable.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSaldoContable = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSaldoContable = new JComboBoxMe();
		this.jListColumnasValoresGraficoSaldoContable = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSaldoContable = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSaldoContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSaldoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSaldoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSaldoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSaldoContable = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSaldoContable.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSaldoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSaldoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSaldoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSaldoContable = new JLabelMe();

		this.jLabelConGraficoDinamicoSaldoContable.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldoContable.add(this.jLabelConGraficoDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSaldoContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSaldoContable.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSaldoContable.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSaldoContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSaldoContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSaldoContable.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoContable.add(this.jCheckBoxConGraficoDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSaldoContable = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSaldoContable.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldoContable.add(this.jLabelColumnaCategoriaGraficoSaldoContable, this.gridBagConstraintsSaldoContable);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSaldoContable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSaldoContable.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSaldoContable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSaldoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSaldoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSaldoContable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSaldoContable.add(this.jComboBoxColumnaCategoriaGraficoSaldoContable, this.gridBagConstraintsSaldoContable);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSaldoContable = new JLabelMe();

		this.jLabelColumnaCategoriaValorSaldoContable.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoContable.add(this.jLabelColumnaCategoriaValorSaldoContable, this.gridBagConstraintsSaldoContable);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSaldoContable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSaldoContable.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSaldoContable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSaldoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSaldoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSaldoContable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSaldoContable.add(this.jComboBoxColumnaCategoriaValorSaldoContable, this.gridBagConstraintsSaldoContable);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSaldoContable = new JLabelMe();

		this.jLabelColumnasValoresGraficoSaldoContable.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoContable.add(this.jLabelColumnasValoresGraficoSaldoContable, this.gridBagConstraintsSaldoContable);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSaldoContable = new JList<Reporte>();
		this.jListColumnasValoresGraficoSaldoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSaldoContable.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSaldoContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSaldoContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSaldoContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSaldoContable=new JScrollPane(this.jListColumnasValoresGraficoSaldoContable);
			
			this.jScrollColumnasValoresGraficoSaldoContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSaldoContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSaldoContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSaldoContable.add(this.jListColumnasSelectReporteSaldoContable, this.gridBagConstraintsSaldoContable);
		this.jPanelReporteDinamicoSaldoContable.add(this.jScrollColumnasValoresGraficoSaldoContable, this.gridBagConstraintsSaldoContable);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSaldoContable = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSaldoContable.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoContable.add(this.jLabelTiposGraficosReportesDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSaldoContable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSaldoContable.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSaldoContable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSaldoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSaldoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSaldoContable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoContable.add(this.jComboBoxTiposGraficosReportesDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSaldoContable = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSaldoContable.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoContable.add(this.jLabelGenerarExcelReporteDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSaldoContable = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSaldoContable.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSaldoContable,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSaldoContable.setToolTipText("Generar EXCEL"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSaldoContable.add(this.jButtonGenerarExcelReporteDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldoContable.add(this.jComboBoxTiposReportesDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSaldoContable = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSaldoContable.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoContable.add(this.jLabelTiposArchivoReporteDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldoContable.add(this.jComboBoxTiposArchivosReportesDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSaldoContable = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSaldoContable.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSaldoContable,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSaldoContable.setToolTipText("Generar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldoContable.add(this.jButtonGenerarReporteDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSaldoContable = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSaldoContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSaldoContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSaldoContable.setToolTipText("Cancelar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldoContable.add(this.jButtonCerrarReporteDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSaldoContable = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSaldoContable= new JScrollPane(jPanelReporteDinamicoSaldoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSaldoContable.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSaldoContable.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSaldoContable.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Contables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSaldoContable.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSaldoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSaldoContable.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSaldoContable);
		this.jInternalFrameReporteDinamicoSaldoContable.getContentPane().add(this.jScrollPanelReporteDinamicoSaldoContable, this.gridBagConstraintsSaldoContable);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSaldoContable() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSaldoContable = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSaldoContable.setName("jPanelImportacionSaldoContable"); 
		
		this.jPanelImportacionSaldoContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSaldoContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSaldoContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSaldoContable.setLayout(gridaBagLayoutImportacionSaldoContable);
		
		
		this.jInternalFrameImportacionSaldoContable= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSaldoContable= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSaldoContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSaldoContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSaldoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSaldoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSaldoContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSaldoContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSaldoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSaldoContable.setResizable(true);
	    this.jInternalFrameImportacionSaldoContable.setClosable(true);
	    this.jInternalFrameImportacionSaldoContable.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSaldoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSaldoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSaldoContable.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSaldoContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSaldoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSaldoContable.setResizable(true);
	    this.jInternalFrameImportacionSaldoContable.setClosable(true);
	    this.jInternalFrameImportacionSaldoContable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSaldoContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSaldoContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSaldoContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Contables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSaldoContable = new JLabelMe();

		this.jLabelArchivoImportacionSaldoContable.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSaldoContable.add(this.jLabelArchivoImportacionSaldoContable, this.gridBagConstraintsSaldoContable);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSaldoContable = new JFileChooser();		
		this.jFileChooserImportacionSaldoContable.setToolTipText("ESCOGER ARCHIVO"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSaldoContable = new JButtonMe();
		this.jButtonAbrirImportacionSaldoContable.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSaldoContable,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSaldoContable.setToolTipText("Generar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldoContable.add(this.jButtonAbrirImportacionSaldoContable, this.gridBagConstraintsSaldoContable);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSaldoContable = new JLabelMe();

		this.jLabelPathArchivoImportacionSaldoContable.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSaldoContable.add(this.jLabelPathArchivoImportacionSaldoContable, this.gridBagConstraintsSaldoContable);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSaldoContable=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSaldoContable.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSaldoContable.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSaldoContable.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldoContable.add(this.jTextFieldPathArchivoImportacionSaldoContable, this.gridBagConstraintsSaldoContable);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSaldoContable = new JButtonMe();
		this.jButtonGenerarImportacionSaldoContable.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSaldoContable,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSaldoContable.setToolTipText("Generar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldoContable.add(this.jButtonGenerarImportacionSaldoContable, this.gridBagConstraintsSaldoContable);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSaldoContable = new JButtonMe();
		this.jButtonCerrarImportacionSaldoContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSaldoContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSaldoContable.setToolTipText("Cancelar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldoContable.add(this.jButtonCerrarImportacionSaldoContable, this.gridBagConstraintsSaldoContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSaldoContable = new GridBagLayout();
		
		this.jScrollPanelImportacionSaldoContable= new JScrollPane(jPanelImportacionSaldoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy =iPosYImportacion;
		this.gridBagConstraintsSaldoContable.gridx =iPosXImportacion;
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSaldoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSaldoContable.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSaldoContable);
		this.jInternalFrameImportacionSaldoContable.getContentPane().add(this.jScrollPanelImportacionSaldoContable, this.gridBagConstraintsSaldoContable);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySaldoContable(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySaldoContable = new JButtonMe();
			this.jButtonAbrirOrderBySaldoContable.setText("Orden");
			this.jButtonAbrirOrderBySaldoContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySaldoContable,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySaldoContable";
			inputMap = this.jButtonAbrirOrderBySaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySaldoContable"));
		
		
			GridBagLayout gridaBagLayoutOrderBySaldoContable = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySaldoContable.setName("jPanelOrderBySaldoContable"); 
			
			this.jPanelOrderBySaldoContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySaldoContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySaldoContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySaldoContable.setLayout(gridaBagLayoutOrderBySaldoContable);
			
			
			this.jTableDatosSaldoContableOrderBy = new JTableMe();        
			this.jTableDatosSaldoContableOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSaldoContableOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSaldoContableOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSaldoContableOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSaldoContableOrderBy.setViewportView(this.jTableDatosSaldoContableOrderBy);
			this.jTableDatosSaldoContableOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSaldoContableOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySaldoContable= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySaldoContable= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySaldoContable = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSaldoContable= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySaldoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySaldoContable.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySaldoContable.setTitle("Orden");
			this.jInternalFrameOrderBySaldoContable.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySaldoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySaldoContable.setResizable(true);
			this.jInternalFrameOrderBySaldoContable.setClosable(true);
			this.jInternalFrameOrderBySaldoContable.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySaldoContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySaldoContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySaldoContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Contables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSaldoContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSaldoContable.ipady =150;
				
			this.jPanelOrderBySaldoContable.add(jScrollPanelDatosSaldoContableOrderBy, this.gridBagConstraintsSaldoContable);//this.jTableDatosSaldoContableTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySaldoContable = new JButtonMe();
			this.jButtonCerrarOrderBySaldoContable.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySaldoContable,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySaldoContable.setToolTipText("Cancelar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSaldoContable.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySaldoContable.add(this.jButtonCerrarOrderBySaldoContable, this.gridBagConstraintsSaldoContable);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSaldoContable = new GridBagLayout();
			
			this.jScrollPanelOrderBySaldoContable= new JScrollPane(jPanelOrderBySaldoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.gridy =iPosYOrderBy;
			this.gridBagConstraintsSaldoContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySaldoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySaldoContable.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSaldoContable);
			
			this.jInternalFrameOrderBySaldoContable.getContentPane().add(this.jScrollPanelOrderBySaldoContable, this.gridBagConstraintsSaldoContable);			
		
		} else {
			this.jButtonAbrirOrderBySaldoContable = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.saldocontableSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSaldoContable.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSaldoContable.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSaldoContable.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSaldoContable.getRowHeight();//SaldoContableConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SaldoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSaldoContable.isSelected()) {
					iHeightTable=SaldoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SaldoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SaldoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SaldoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSaldoContable.isSelected()) {
					iHeightTable=SaldoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SaldoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SaldoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSaldoContable.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSaldoContable.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSaldoContable.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSaldoContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSaldoContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSaldoContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySaldoContable!=null && this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy()!=null) {
			//if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySaldoContable.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySaldoContable.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySaldoContable.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSaldoContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSaldoContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSaldoContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=saldocontableLogic.getSaldoContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldocontables.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SaldoContable> TraerSaldoContableBeans(List<SaldoContable> saldocontables,ArrayList<Classe> classes)throws Exception {
		try {
			for(SaldoContable saldocontable:saldocontables) {
					
				if(!(SaldoContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SaldoContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					saldocontable.setsDetalleGeneralEntityReporte(SaldoContableConstantesFunciones.getSaldoContableDescripcion(saldocontable));
										
						
					
						
					
				} else  {
							
					//saldocontable.setsDetalleGeneralEntityReporte(saldocontable.getsDetalleGeneralEntityReporte());
										
				}
				
				//saldocontablebeans.add(saldocontablebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return saldocontables;
    }
	//PARA REPORTES FIN
}
