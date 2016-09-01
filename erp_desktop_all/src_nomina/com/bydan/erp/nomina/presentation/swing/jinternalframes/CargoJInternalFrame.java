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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.nomina.util.CargoConstantesFunciones;

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
public class CargoJInternalFrame extends CargoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCargo;
	
	protected JMenuBar jmenuBarCargo;
	
	protected JMenu jmenuCargo;
	protected JMenu jmenuDatosCargo;
	protected JMenu jmenuArchivoCargo;
	protected JMenu jmenuAccionesCargo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCargo;	
	protected GridBagConstraints gridBagConstraintsCargo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CargoDetalleFormJInternalFrame jInternalFrameDetalleFormCargo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCargo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCargo;	
	
	
	public CargoBeanSwingJInternalFrameTree jInternalFrameTreeCargo;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";

	protected TipoPago_NMBeanSwingJInternalFrame tipopago_nmBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipopago_nm="";

	protected CargoGrupoBeanSwingJInternalFrame cargogrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargogrupo="";
	
	public CargoSessionBean cargoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;
	public TipoPago_NMSessionBean tipopago_nmSessionBean;
	public CargoGrupoSessionBean cargogrupoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Cargo> cargos;		
	public List<Cargo> cargosEliminados;	
	public List<Cargo> cargosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCargo;		
	protected JButton jButtonAbrirOrderByCargo;
	
	
	//protected JPanel jPanelOrderByCargo;
	//public JScrollPane jScrollPanelOrderByCargo;	
	//protected JButton jButtonCerrarOrderByCargo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CargoLogic cargoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCargo;
	public JScrollPane jScrollPanelDatosEdicionCargo;
	public JScrollPane jScrollPanelDatosGeneralCargo;
    
	
	
	//public JScrollPane jScrollPanelDatosCargoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCargo;
	//public JScrollPane jScrollPanelImportacionCargo;
	
	
	
	protected JPanel jPanelAccionesCargo;
	
    protected JPanel jPanelPaginacionCargo;
    protected JPanel jPanelParametrosReportesCargo;
	protected JPanel jPanelParametrosReportesAccionesCargo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Cargo;
	protected JPanel jPanelParametrosAuxiliar2Cargo;
	protected JPanel jPanelParametrosAuxiliar3Cargo;
	protected JPanel jPanelParametrosAuxiliar4Cargo;
	//protected JPanel jPanelParametrosAuxiliar5Cargo;
	
	
	
	//protected JPanel jPanelReporteDinamicoCargo;
	//protected JPanel jPanelImportacionCargo;
	
	
	public JTable jTableDatosCargo;
	
	
	
	//public JTable jTableDatosCargoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCargo;
	protected JButton jButtonDuplicarCargo;
	protected JButton jButtonCopiarCargo;
	protected JButton jButtonVerFormCargo;
	protected JButton jButtonNuevoRelacionesCargo;
	protected JButton jButtonModificarCargo;
	
    protected JButton jButtonGuardarCambiosTablaCargo;
	protected JButton jButtonCerrarCargo;
	
	
	protected JButton jButtonRecargarInformacionCargo;
	protected JButton jButtonProcesarInformacionCargo;
	
	
	protected JButton jButtonAnterioresCargo;
	protected JButton jButtonSiguientesCargo;
	protected JButton jButtonNuevoGuardarCambiosCargo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCargo;
	//protected JButton jButtonCerrarReporteDinamicoCargo;
	//protected JButton jButtonGenerarExcelReporteDinamicoCargo;	
	
	
	
	//protected JButton jButtonAbrirImportacionCargo;
	//protected JButton jButtonGenerarImportacionCargo;
	//protected JButton jButtonCerrarImportacionCargo;
	//protected JFileChooser jFileChooserImportacionCargo;
	//protected File fileImportacionCargo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCargo;
	protected JButton jButtonDuplicarToolBarCargo;
	protected JButton jButtonNuevoRelacionesToolBarCargo;
	
	
	public JButton jButtonGuardarCambiosToolBarCargo;
	protected JButton jButtonCopiarToolBarCargo;
	protected JButton jButtonVerFormToolBarCargo;
	public JButton jButtonGuardarCambiosTablaToolBarCargo;
	protected JButton jButtonMostrarOcultarTablaToolBarCargo;
	protected JButton jButtonCerrarToolBarCargo;
	
	protected JButton jButtonRecargarInformacionToolBarCargo;
	protected JButton jButtonProcesarInformacionToolBarCargo;
	protected JButton jButtonAnterioresToolBarCargo;
	protected JButton jButtonSiguientesToolBarCargo;
	protected JButton jButtonNuevoGuardarCambiosToolBarCargo;
	protected JButton jButtonAbrirOrderByToolBarCargo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCargo;
	protected JMenuItem jMenuItemDuplicarCargo;
	protected JMenuItem jMenuItemNuevoRelacionesCargo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCargo;
	protected JMenuItem jMenuItemCopiarCargo;
	protected JMenuItem jMenuItemVerFormCargo;
	protected JMenuItem jMenuItemGuardarCambiosTablaCargo;
	protected JMenuItem jMenuItemCerrarCargo;
	protected JMenuItem jMenuItemDetalleCerrarCargo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCargo;
	protected JMenuItem jMenuItemDetalleMostarOcultarCargo;
	
	protected JMenuItem jMenuItemRecargarInformacionCargo;
	protected JMenuItem jMenuItemProcesarInformacionCargo;
	protected JMenuItem jMenuItemAnterioresCargo;
	protected JMenuItem jMenuItemSiguientesCargo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCargo;
	protected JMenuItem jMenuItemAbrirOrderByCargo;
	protected JMenuItem jMenuItemMostrarOcultarCargo;
	
	
	//MENU
	
	protected JButton jButtonArbolCargo;	
	
	protected JLabel jLabelAccionesCargo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCargo;
	protected JCheckBox jCheckBoxSeleccionadosCargo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCargo;
	protected JCheckBox jCheckBoxConGraficoReporteCargo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCargo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCargo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCargo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCargo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCargo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCargo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCargo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCargo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCargo;
	protected JTextField jTextFieldValorCampoGeneralCargo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCargo;
	//public JList<Reporte> jListColumnasSelectReporteCargo;
	//public JScrollPane jScrollColumnasSelectReporteCargo;
	
	//public JLabel jLabelRelacionesSelectReporteCargo;
	//public JList<Reporte> jListRelacionesSelectReporteCargo;
	//public JScrollPane jScrollRelacionesSelectReporteCargo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCargo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCargo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCargo;
	//public JLabel jLabelTiposArchivoReporteDinamicoCargo;
	
		
	//public JLabel jLabelArchivoImportacionCargo;	
	//public JLabel jLabelPathArchivoImportacionCargo;
	//protected JTextField jTextFieldPathArchivoImportacionCargo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCargo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCargo;
	
	//public JLabel jLabelColumnaCategoriaValorCargo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCargo;
	
	//public JLabel jLabelColumnasValoresGraficoCargo;
	//public JList<Reporte> jListColumnasValoresGraficoCargo;
	//public JScrollPane jScrollColumnasValoresGraficoCargo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCargo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCargo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCargo;
	public JPanel jPanelFK_IdCargoCargo;
	public JButton jButtonFK_IdCargoCargo;
	public JPanel jPanelFK_IdCargoGrupoCargo;
	public JButton jButtonFK_IdCargoGrupoCargo;
	public JPanel jPanelFK_IdCuentaContableCargo;
	public JButton jButtonFK_IdCuentaContableCargo;
	public JPanel jPanelFK_IdNumeroPatronalCargo;
	public JButton jButtonFK_IdNumeroPatronalCargo;
	public JPanel jPanelFK_IdTipoPago_NMCargo;
	public JButton jButtonFK_IdTipoPago_NMCargo;
	
	public JPanel jPanelid_cargoFK_IdCargoCargo;
	public JLabel jLabelid_cargoFK_IdCargoCargo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoFK_IdCargoCargo;
	public JButton jButtonid_cargoFK_IdCargoCargo= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoCargoUpdate= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoCargoBusqueda= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoCargoArbol= new JButtonMe();

	
	public JPanel jPanelid_cargo_grupoFK_IdCargoGrupoCargo;
	public JLabel jLabelid_cargo_grupoFK_IdCargoGrupoCargo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo;
	public JButton jButtonid_cargo_grupoFK_IdCargoGrupoCargo= new JButtonMe();
	public JButton jButtonid_cargo_grupoFK_IdCargoGrupoCargoUpdate= new JButtonMe();
	public JButton jButtonid_cargo_grupoFK_IdCargoGrupoCargoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableCargo;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableCargo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableCargo;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCargo= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCargoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCargoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCargoArbol= new JButtonMe();

	
	public JPanel jPanelid_numero_patronalFK_IdNumeroPatronalCargo;
	public JLabel jLabelid_numero_patronalFK_IdNumeroPatronalCargo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo;
	public JButton jButtonid_numero_patronalFK_IdNumeroPatronalCargo= new JButtonMe();
	public JButton jButtonid_numero_patronalFK_IdNumeroPatronalCargoUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalFK_IdNumeroPatronalCargoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_pago__n_mFK_IdTipoPago_NMCargo;
	public JLabel jLabelid_tipo_pago__n_mFK_IdTipoPago_NMCargo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo;
	public JButton jButtonid_tipo_pago__n_mFK_IdTipoPago_NMCargo= new JButtonMe();
	public JButton jButtonid_tipo_pago__n_mFK_IdTipoPago_NMCargoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_pago__n_mFK_IdTipoPago_NMCargoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=945;//(screenSize.width-screenSize.width/2)+(250*1);
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
	public CargoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Cargo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cargo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cargo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cargo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCargo)	{
		this.jButtonRecargarInformacionCargo = jButtonRecargarInformacionCargo;
	}
	
	public JButton getjButtonProcesarInformacionCargo() {
		return this.jButtonProcesarInformacionCargo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCargo)	{
		this.jButtonProcesarInformacionCargo = jButtonProcesarInformacionCargo;
	}
	
	
	public JButton getjButtonRecargarInformacionCargo() {
		return this.jButtonRecargarInformacionCargo;
	}
	
	public JButton getjButtonArbolCargo() {
		return this.jButtonArbolCargo;
	}
	
	public void setjButtonArbol(JButton jButtonArbolCargo)	{
		this.jButtonArbolCargo = jButtonArbolCargo;
	}
	
	public List<Cargo> getcargos() {
		return this.cargos;
	}

	public void setcargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
	
	public List<Cargo> getcargosAux() {
		return this.cargosAux;
	}

	public void setcargosAux(List<Cargo> cargosAux) {
		this.cargosAux = cargosAux;
	}
	
	public List<Cargo> getcargosEliminados() {
		return this.cargosEliminados;
	}

	public void setCargosEliminados(List<Cargo> cargosEliminados) {
		this.cargosEliminados = cargosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCargo() {
		return jComboBoxTiposSeleccionarCargo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCargo(
			JComboBox jComboBoxTiposSeleccionarCargo) {
		this.jComboBoxTiposSeleccionarCargo = jComboBoxTiposSeleccionarCargo;
	}
	
	public void setBorderResaltarTiposSeleccionarCargo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCargo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCargo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCargo() {
		return jTextFieldValorCampoGeneralCargo;
	}

	public void setjTextFieldValorCampoGeneralCargo(
			JTextField jTextFieldValorCampoGeneralCargo) {
		this.jTextFieldValorCampoGeneralCargo = jTextFieldValorCampoGeneralCargo;
	}

	public void setBorderResaltarValorCampoGeneralCargo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCargo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCargo() {
		return this.jCheckBoxSeleccionarTodosCargo;
	}

	public void setjCheckBoxSeleccionarTodosCargo(
			JCheckBox jCheckBoxSeleccionarTodosCargo) {
		this.jCheckBoxSeleccionarTodosCargo = jCheckBoxSeleccionarTodosCargo;
	}

	public void setBorderResaltarSeleccionarTodosCargo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCargo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCargo() {
		return this.jCheckBoxSeleccionadosCargo;
	}

	public void setjCheckBoxSeleccionadosCargo(
			JCheckBox jCheckBoxSeleccionadosCargo) {
		this.jCheckBoxSeleccionadosCargo = jCheckBoxSeleccionadosCargo;
	}
	
	public void setBorderResaltarSeleccionadosCargo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCargo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCargo() {
		return this.jComboBoxTiposArchivosReportesCargo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCargo(
			JComboBox jComboBoxTiposArchivosReportesCargo) {
		this.jComboBoxTiposArchivosReportesCargo = jComboBoxTiposArchivosReportesCargo;
	}

	public void setBorderResaltarTiposArchivosReportesCargo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCargo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCargo() {
		return this.jComboBoxTiposReportesCargo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCargo(
			JComboBox jComboBoxTiposReportesCargo) {
		this.jComboBoxTiposReportesCargo = jComboBoxTiposReportesCargo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCargo() {
	//	return jComboBoxTiposReportesDinamicoCargo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCargo(
	//		JComboBox jComboBoxTiposReportesDinamicoCargo) {
	//	this.jComboBoxTiposReportesDinamicoCargo = jComboBoxTiposReportesDinamicoCargo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCargo() {
	//	return jComboBoxTiposArchivosReportesDinamicoCargo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCargo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCargo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCargo = jComboBoxTiposArchivosReportesDinamicoCargo;
	//}
	
	public void setBorderResaltarTiposReportesCargo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCargo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCargo() {
		return this.jComboBoxTiposGraficosReportesCargo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCargo(
			JComboBox jComboBoxTiposGraficosReportesCargo) {
		this.jComboBoxTiposGraficosReportesCargo = jComboBoxTiposGraficosReportesCargo;
	}
	
	public void setBorderResaltarTiposGraficosReportesCargo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCargo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCargo() {
		return this.jComboBoxTiposPaginacionCargo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCargo(
			JComboBox jComboBoxTiposPaginacionCargo) {
		this.jComboBoxTiposPaginacionCargo = jComboBoxTiposPaginacionCargo;
	}
	
	public void setBorderResaltarTiposPaginacionCargo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCargo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCargo() {
		return this.jComboBoxTiposRelacionesCargo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCargo() {
		return this.jComboBoxTiposAccionesCargo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCargo(
			JComboBox jComboBoxTiposRelacionesCargo) {
		this.jComboBoxTiposRelacionesCargo = jComboBoxTiposRelacionesCargo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCargo(
			JComboBox jComboBoxTiposAccionesCargo) {
		this.jComboBoxTiposAccionesCargo = jComboBoxTiposAccionesCargo;
	}
	
	public void setBorderResaltarTiposRelacionesCargo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCargo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCargo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCargo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCargo() {
	//	return jCheckBoxConGraficoDinamicoCargo;
	//}

	//public void setjCheckBoxConGraficoDinamicoCargo(
	//		JCheckBox jCheckBoxConGraficoDinamicoCargo) {
	//	this.jCheckBoxConGraficoDinamicoCargo = jCheckBoxConGraficoDinamicoCargo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCargo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCargo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCargo .setBorder(borderResaltar);		
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
		this.cargoSessionBean=new CargoSessionBean();
		
		this.cargoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cargoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CargoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CargoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CargoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CargoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CargoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cargo MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
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
		
		CargoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Cargo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCargo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCargo,this.jTtoolBarCargo,
							"nuevo","nuevo","Nuevo"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCargo,this.jTtoolBarCargo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCargo,this.jTtoolBarCargo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCargo,this.jTtoolBarCargo,
							"duplicar","duplicar","Duplicar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCargo,this.jTtoolBarCargo,
							"copiar","copiar","Copiar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCargo,this.jTtoolBarCargo,
							"ver_form","ver_form","Ver"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargo,this.jTtoolBarCargo,
							"recargar","recargar","Recargar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargo,this.jTtoolBarCargo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargo,this.jTtoolBarCargo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCargo,this.jTtoolBarCargo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCargo,this.jTtoolBarCargo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCargo,this.jTtoolBarCargo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCargo,this.jTtoolBarCargo,
							"cerrar","cerrar","Salir"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCargo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCargo;
			
				this.jButtonProcesarInformacionToolBarCargo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCargo;
				
		//protected JButton jButtonModificarToolBarCargo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCargo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCargo=new JMenuMe("General");
		this.jmenuArchivoCargo=new JMenuMe("Archivo");
		this.jmenuAccionesCargo=new JMenuMe("Acciones");
		this.jmenuDatosCargo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCargo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCargo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCargo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCargo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCargo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCargo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCargo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCargo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCargo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCargo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCargo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCargo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCargo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCargo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCargo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCargo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCargo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCargo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCargo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCargo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCargo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCargo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCargo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCargo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCargo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCargo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCargo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCargo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCargo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCargo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCargo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCargo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCargo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCargo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCargo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCargo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCargo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCargo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCargo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCargo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCargo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCargo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCargo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCargo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCargo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCargo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCargo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCargo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCargo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCargo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCargo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCargo.add(this.jMenuItemCerrarCargo);
			
			this.jmenuAccionesCargo.add(this.jMenuItemNuevoCargo);
			this.jmenuAccionesCargo.add(this.jMenuItemNuevoGuardarCambiosCargo);
			this.jmenuAccionesCargo.add(this.jMenuItemNuevoRelacionesCargo);
			this.jmenuAccionesCargo.add(this.jMenuItemGuardarCambiosTablaCargo);		
			this.jmenuAccionesCargo.add(this.jMenuItemDuplicarCargo);		
			this.jmenuAccionesCargo.add(this.jMenuItemCopiarCargo);		
			this.jmenuAccionesCargo.add(this.jMenuItemVerFormCargo);		
			
			this.jmenuDatosCargo.add(this.jMenuItemRecargarInformacionCargo);				
			this.jmenuDatosCargo.add(this.jMenuItemAnterioresCargo);				
			this.jmenuDatosCargo.add(this.jMenuItemSiguientesCargo);				
			this.jmenuDatosCargo.add(this.jMenuItemAbrirOrderByCargo);				
			this.jmenuDatosCargo.add(this.jMenuItemMostrarOcultarCargo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCargo.add(this.jMenuItemGuardarCambiosCargo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCargo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCargo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCargo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCargo.add(this.jmenuArchivoCargo);		
			this.jmenuBarCargo.add(this.jmenuAccionesCargo);		
			this.jmenuBarCargo.add(this.jmenuDatosCargo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCargo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCargo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCargoCargo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCargoCargo.setToolTipText("Buscar Por Cargo ");
		this.jButtonFK_IdCargoCargo= new JButtonMe();
		this.jButtonFK_IdCargoCargo.setText("Buscar");
		this.jButtonFK_IdCargoCargo.setToolTipText("Buscar Por Cargo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCargoCargo,"buscar_button","Buscar Por Cargo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCargoCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cargoFK_IdCargoCargo = new JLabelMe();
		jLabelid_cargoFK_IdCargoCargo.setText("Cargo :");
		jLabelid_cargoFK_IdCargoCargo.setToolTipText("Cargo");
		jLabelid_cargoFK_IdCargoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoFK_IdCargoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoFK_IdCargoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cargoFK_IdCargoCargo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cargoFK_IdCargoCargo= new JComboBoxMe();
		jComboBoxid_cargoFK_IdCargoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoFK_IdCargoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoFK_IdCargoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoFK_IdCargoCargo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCargoGrupoCargo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCargoGrupoCargo.setToolTipText("Buscar Por Cargo Grupo ");
		this.jButtonFK_IdCargoGrupoCargo= new JButtonMe();
		this.jButtonFK_IdCargoGrupoCargo.setText("Buscar");
		this.jButtonFK_IdCargoGrupoCargo.setToolTipText("Buscar Por Cargo Grupo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCargoGrupoCargo,"buscar_button","Buscar Por Cargo Grupo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCargoGrupoCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cargo_grupoFK_IdCargoGrupoCargo = new JLabelMe();
		jLabelid_cargo_grupoFK_IdCargoGrupoCargo.setText("Cargo Grupo :");
		jLabelid_cargo_grupoFK_IdCargoGrupoCargo.setToolTipText("Cargo Grupo");
		jLabelid_cargo_grupoFK_IdCargoGrupoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargo_grupoFK_IdCargoGrupoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargo_grupoFK_IdCargoGrupoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cargo_grupoFK_IdCargoGrupoCargo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo= new JComboBoxMe();
		jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCargo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCargo.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableCargo= new JButtonMe();
		this.jButtonFK_IdCuentaContableCargo.setText("Buscar");
		this.jButtonFK_IdCuentaContableCargo.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCargo,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableCargo = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableCargo.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableCargo.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableCargo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableCargo= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableCargo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNumeroPatronalCargo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNumeroPatronalCargo.setToolTipText("Buscar Por Numero Patronal ");
		this.jButtonFK_IdNumeroPatronalCargo= new JButtonMe();
		this.jButtonFK_IdNumeroPatronalCargo.setText("Buscar");
		this.jButtonFK_IdNumeroPatronalCargo.setToolTipText("Buscar Por Numero Patronal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNumeroPatronalCargo,"buscar_button","Buscar Por Numero Patronal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNumeroPatronalCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_numero_patronalFK_IdNumeroPatronalCargo = new JLabelMe();
		jLabelid_numero_patronalFK_IdNumeroPatronalCargo.setText("Numero Patronal :");
		jLabelid_numero_patronalFK_IdNumeroPatronalCargo.setToolTipText("Numero Patronal");
		jLabelid_numero_patronalFK_IdNumeroPatronalCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalFK_IdNumeroPatronalCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalFK_IdNumeroPatronalCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalFK_IdNumeroPatronalCargo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo= new JComboBoxMe();
		jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPago_NMCargo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPago_NMCargo.setToolTipText("Buscar Por Tipo Pago_ N M ");
		this.jButtonFK_IdTipoPago_NMCargo= new JButtonMe();
		this.jButtonFK_IdTipoPago_NMCargo.setText("Buscar");
		this.jButtonFK_IdTipoPago_NMCargo.setToolTipText("Buscar Por Tipo Pago_ N M ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPago_NMCargo,"buscar_button","Buscar Por Tipo Pago_ N M ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPago_NMCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMCargo = new JLabelMe();
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setText("Tipo Pago_ N M :");
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setToolTipText("Tipo Pago_ N M");
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_pago__n_mFK_IdTipoPago_NMCargo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo= new JComboBoxMe();
		jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCargo=new JTabbedPane();


		this.jTabbedPaneBusquedasCargo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCargo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCargo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCargo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCargo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCargo = new CargoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cargo DATOS");
			this.jInternalFrameDetalleFormCargo = new CargoDetalleFormJInternalFrame(jDesktopPane,this.cargoSessionBean.getConGuardarRelaciones(),this.cargoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCargo = null;//new CargoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCargo= new GridBagLayout();
		
		
		this.jTableDatosCargo = new JTableMe();      
		
		String sToolTipCargo="";
		sToolTipCargo=CargoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCargo+="(Nomina.Cargo)";
		}
		
		if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCargo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCargo.setToolTipText(sToolTipCargo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCargo);
		this.jTableDatosCargo.setAutoCreateRowSorter(true);
		this.jTableDatosCargo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCargo.setRowSelectionAllowed(true);
		this.jTableDatosCargo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCargo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCargo = new JButtonMe();
		this.jButtonDuplicarCargo = new JButtonMe();
		this.jButtonCopiarCargo = new JButtonMe();
		this.jButtonVerFormCargo = new JButtonMe();
		this.jButtonNuevoRelacionesCargo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCargo = new JButtonMe();
		this.jButtonCerrarCargo = new JButtonMe();
		
		this.jScrollPanelDatosCargo = new JScrollPane();   
        this.jScrollPanelDatosGeneralCargo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cargo";
		
		if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargos" + this.sPath));
		} else {
			this.jScrollPanelDatosCargo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCargo.setToolTipText("Acciones");
        this.jPanelAccionesCargo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCargo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCargo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCargo=new ReporteDinamicoJInternalFrame(CargoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCargo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCargo=new ImportacionJInternalFrame(CargoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCargo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCargo = new JButtonMe();
		
		this.jButtonAbrirOrderByCargo.setText("Orden");
		this.jButtonAbrirOrderByCargo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCargo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCargo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargo,false,this);
			
			//this.cargarOrderByCargo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCargo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargo,true,this);
			
			//this.cargarOrderByCargo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCargo.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosCargo.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosCargo.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosCargo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCargo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCargo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCargo.setText("Nuevo");
		this.jButtonDuplicarCargo.setText("Duplicar");
		this.jButtonCopiarCargo.setText("Copiar");
		this.jButtonVerFormCargo.setText("Ver");
		this.jButtonNuevoRelacionesCargo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCargo.setText("Guardar");
		this.jButtonCerrarCargo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCargo,"nuevo_button","Nuevo",this.cargoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCargo,"duplicar_button","Duplicar",this.cargoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCargo,"copiar_button","Copiar",this.cargoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCargo,"ver_form","Ver",this.cargoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCargo,"nuevorelaciones_button","Nuevo Rel",this.cargoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCargo,"guardarcambiostabla_button","Guardar",this.cargoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCargo,"cerrar_button","Salir",this.cargoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCargo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCargo.setToolTipText("Nuevo"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCargo.setToolTipText("Duplicar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCargo.setToolTipText("Copiar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCargo.setToolTipText("Ver"+" "+CargoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCargo.setToolTipText("Nuevo Rel"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCargo.setToolTipText("Guardar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCargo.setToolTipText("Salir"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCargo";
		inputMap = this.jButtonNuevoCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCargo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCargo"));
		
		//DUPLICAR
		sMapKey = "DuplicarCargo";
		inputMap = this.jButtonDuplicarCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCargo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCargo"));
		
		//COPIAR
		sMapKey = "CopiarCargo";
		inputMap = this.jButtonCopiarCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCargo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCargo"));
		
		//VEr FORM
		sMapKey = "VerFormCargo";
		inputMap = this.jButtonVerFormCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCargo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCargo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCargo";
		inputMap = this.jButtonNuevoRelacionesCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCargo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCargo";
		inputMap = this.jButtonModificarCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCargo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCargo";
		inputMap = this.jButtonCerrarCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCargo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCargo";
		inputMap = this.jButtonGuardarCambiosTablaCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCargo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Cargo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Cargo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Cargo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Cargo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Cargo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCargo.setName("jPanelParametrosReportesCargo"); 
		
		this.jPanelParametrosReportesAccionesCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCargo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCargo.setName("jPanelParametrosReportesAccionesCargo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCargo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCargo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCargo = new JButtonMe();
		this.jButtonRecargarInformacionCargo.setText("Recargar");
		this.jButtonRecargarInformacionCargo.setToolTipText("Recargar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCargo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCargo = new JButtonMe();
		this.jButtonProcesarInformacionCargo.setText("Procesar");
		this.jButtonProcesarInformacionCargo.setToolTipText("Procesar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCargo.setVisible(false);
			
		this.jButtonProcesarInformacionCargo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCargo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCargo.setPreferredSize(new Dimension(185,25));		
		
		
		
		this.jButtonArbolCargo = new JButtonMe();
		this.jButtonArbolCargo.setText("Arbol");		
		this.jButtonArbolCargo.setToolTipText("Buscar Por Arbol");
		
		
		
			
		this.jComboBoxTiposArchivosReportesCargo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCargo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCargo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargo.setText("TIPO");       
		this.jComboBoxTiposReportesCargo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCargo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCargo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCargo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCargo.setText("Paginacion");
		this.jComboBoxTiposPaginacionCargo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCargo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCargo.setText("Accion");
		this.jComboBoxTiposRelacionesCargo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCargo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCargo.setText("Accion");
		this.jComboBoxTiposAccionesCargo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCargo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCargo.setText("Accion");
		this.jComboBoxTiposSeleccionarCargo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCargo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCargo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCargo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCargo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCargo = new JLabelMe();
		
		this.jLabelAccionesCargo.setText("Acciones");		
		this.jLabelAccionesCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCargo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCargo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCargo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCargo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCargo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCargo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCargo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCargo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCargo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCargo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCargo.setText("Graf.");
		this.jCheckBoxConGraficoReporteCargo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCargo = new JButtonMe();
		//this.jButtonAnterioresCargo.setText("<<");
        this.jButtonAnterioresCargo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCargo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCargo = new JButtonMe();
		//this.jButtonSiguientesCargo.setText(">>");
        this.jButtonSiguientesCargo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCargo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCargo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCargo.setText("Nue");
        this.jButtonNuevoGuardarCambiosCargo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCargo,"nuevoguardarcambios_button","Nue",this.cargoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCargo";
		inputMap = this.jButtonNuevoGuardarCambiosCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCargo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCargo";
		inputMap = this.jButtonRecargarInformacionCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCargo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCargo";
		inputMap = this.jButtonSiguientesCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCargo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCargo";
		inputMap = this.jButtonAnterioresCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCargo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCargo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCargo.setMinimumSize(new Dimension(this.getWidth(),CargoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCargo.setMaximumSize(new Dimension(this.getWidth(),CargoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCargo.setPreferredSize(new Dimension(this.getWidth(),CargoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCargo = new GridBagLayout();

			this.jPanelPaginacionCargo.setLayout(gridaBagLayoutPaginacionCargo);						
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = 0;
			this.gridBagConstraintsCargo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCargo.add(this.jButtonAnterioresCargo, this.gridBagConstraintsCargo);
					
						
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCargo.gridy = 0;
			
			this.jPanelPaginacionCargo.add(this.jButtonNuevoGuardarCambiosCargo, this.gridBagConstraintsCargo);
						
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCargo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCargo.gridy = 0;
			this.jPanelPaginacionCargo.add(this.jButtonSiguientesCargo, this.gridBagConstraintsCargo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = 1;
			this.gridBagConstraintsCargo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargo.add(this.jButtonNuevoCargo, this.gridBagConstraintsCargo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCargo = new GridBagConstraints();
				this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCargo.gridy = 1;
				this.gridBagConstraintsCargo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCargo.add(this.jButtonNuevoRelacionesCargo, this.gridBagConstraintsCargo);
			}
			
			
			if(!this.cargoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCargo = new GridBagConstraints();
				this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCargo.gridy = 1;
				this.gridBagConstraintsCargo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCargo.add(this.jButtonGuardarCambiosTablaCargo, this.gridBagConstraintsCargo);
			}
			
			
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = 1;
			this.gridBagConstraintsCargo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargo.add(this.jButtonDuplicarCargo, this.gridBagConstraintsCargo);
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = 1;
			this.gridBagConstraintsCargo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargo.add(this.jButtonCopiarCargo, this.gridBagConstraintsCargo);
		
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = 1;
			this.gridBagConstraintsCargo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargo.add(this.jButtonVerFormCargo, this.gridBagConstraintsCargo);
		
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = 1;
			this.gridBagConstraintsCargo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCargo.add(this.jButtonCerrarCargo, this.gridBagConstraintsCargo);
		
		
		
		this.jButtonRecargarInformacionCargo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCargo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCargo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCargo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jButtonArbolCargo.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolCargo.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolCargo.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposArchivosReportesCargo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCargo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCargo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCargo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCargo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCargo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCargo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCargo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCargo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCargo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCargo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCargo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCargo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCargo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCargo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCargo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCargo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCargo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCargo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCargo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCargo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCargo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCargo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCargo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCargo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCargo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCargo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCargo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCargo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCargo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCargo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCargo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCargo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCargo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Cargo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Cargo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Cargo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Cargo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCargo.setLayout(gridaBagParametrosReportesCargo);
			this.jPanelParametrosReportesAccionesCargo.setLayout(gridaBagParametrosReportesAccionesCargo);
			
			
			this.jPanelParametrosAuxiliar1Cargo.setLayout(gridaBagParametrosAuxiliar1Cargo);
			this.jPanelParametrosAuxiliar2Cargo.setLayout(gridaBagParametrosAuxiliar2Cargo);
			this.jPanelParametrosAuxiliar3Cargo.setLayout(gridaBagParametrosAuxiliar3Cargo);
			this.jPanelParametrosAuxiliar4Cargo.setLayout(gridaBagParametrosAuxiliar4Cargo);
			//this.jPanelParametrosAuxiliar5Cargo.setLayout(gridaBagParametrosAuxiliar2Cargo);			
			
			
			
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargo.add(this.jButtonRecargarInformacionCargo, this.gridBagConstraintsCargo);			
			
			

			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargo.add(this.jButtonArbolCargo, this.gridBagConstraintsCargo);
			
			
			
			//PAGINACION
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cargo.add(this.jComboBoxTiposPaginacionCargo, this.gridBagConstraintsCargo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cargo.add(this.jCheckBoxConAltoMaximoTablaCargo, this.gridBagConstraintsCargo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cargo.add(this.jComboBoxTiposArchivosReportesCargo, this.gridBagConstraintsCargo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargo.add(this.jPanelParametrosAuxiliar1Cargo, this.gridBagConstraintsCargo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Cargo.add(this.jComboBoxTiposReportesCargo, this.gridBagConstraintsCargo);																		
			
			
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Cargo.add(this.jComboBoxTiposGraficosReportesCargo, this.gridBagConstraintsCargo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargo.add(this.jPanelParametrosAuxiliar4Cargo, this.gridBagConstraintsCargo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargo.add(this.jComboBoxTiposReportesCargo, this.gridBagConstraintsCargo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargo.add(this.jCheckBoxGenerarReporteCargo, this.gridBagConstraintsCargo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargo.add(this.jPanelParametrosAuxiliar2Cargo, this.gridBagConstraintsCargo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargo.add(this.jLabelAccionesCargo, this.gridBagConstraintsCargo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCargo = new GridBagConstraints();
				this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCargo.add(this.jButtonAbrirOrderByCargo, this.gridBagConstraintsCargo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargo.add(this.jComboBoxTiposSeleccionarCargo, this.gridBagConstraintsCargo);			
			
			
			/*
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargo.add(this.jCheckBoxSeleccionarTodosCargo, this.gridBagConstraintsCargo);
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargo.add(this.jCheckBoxConGraficoReporteCargo, this.gridBagConstraintsCargo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cargo.add(this.jCheckBoxSeleccionarTodosCargo, this.gridBagConstraintsCargo);															
				
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cargo.add(this.jCheckBoxSeleccionadosCargo, this.gridBagConstraintsCargo);															
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cargo.add(this.jCheckBoxConGraficoReporteCargo, this.gridBagConstraintsCargo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargo.add(this.jPanelParametrosAuxiliar3Cargo, this.gridBagConstraintsCargo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargo.add(this.jComboBoxTiposRelacionesCargo, this.gridBagConstraintsCargo);
				
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargo.add(this.jComboBoxTiposAccionesCargo, this.gridBagConstraintsCargo);
	
				
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargo.add(this.jTextFieldValorCampoGeneralCargo, this.gridBagConstraintsCargo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCargo = new GridBagLayout();

			this.jScrollPanelDatosCargo.setLayout(gridaBagLayoutDatosCargo);
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = 0;
			this.gridBagConstraintsCargo.gridx = 0;
			
			this.jScrollPanelDatosCargo.add(this.jTableDatosCargo, this.gridBagConstraintsCargo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCargo.setViewportView(this.jTableDatosCargo);
		this.jTableDatosCargo.setFillsViewportHeight(true);
		this.jTableDatosCargo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCargo= new GridBagLayout();
		this.jPanelAccionesCargo.setLayout(gridaBagLayoutAccionesCargo);
		
		
		/*	
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 0;
			
		this.jPanelAccionesCargo.add(this.jButtonNuevoCargo, this.gridBagConstraintsCargo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCargoCargo= new GridBagLayout();
		gridaBagLayoutFK_IdCargoCargo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCargoCargo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCargoCargo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCargoCargo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCargoCargo.setLayout(gridaBagLayoutFK_IdCargoCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 0;
		gridBagConstraintsCargo.gridx = 0;
		jPanelFK_IdCargoCargo.add(jLabelid_cargoFK_IdCargoCargo, gridBagConstraintsCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 0;
		gridBagConstraintsCargo.gridx = 1;
		jPanelFK_IdCargoCargo.add(jComboBoxid_cargoFK_IdCargoCargo, gridBagConstraintsCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 1;
		gridBagConstraintsCargo.gridx =1;
		jPanelFK_IdCargoCargo.add(jButtonFK_IdCargoCargo, gridBagConstraintsCargo);

		jTabbedPaneBusquedasCargo.addTab("1.-Por Cargo ", jPanelFK_IdCargoCargo);
		jTabbedPaneBusquedasCargo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCargoGrupoCargo= new GridBagLayout();
		gridaBagLayoutFK_IdCargoGrupoCargo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCargoGrupoCargo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCargoGrupoCargo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCargoGrupoCargo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCargoGrupoCargo.setLayout(gridaBagLayoutFK_IdCargoGrupoCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 0;
		gridBagConstraintsCargo.gridx = 0;
		jPanelFK_IdCargoGrupoCargo.add(jLabelid_cargo_grupoFK_IdCargoGrupoCargo, gridBagConstraintsCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 0;
		gridBagConstraintsCargo.gridx = 1;
		jPanelFK_IdCargoGrupoCargo.add(jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo, gridBagConstraintsCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 1;
		gridBagConstraintsCargo.gridx =1;
		jPanelFK_IdCargoGrupoCargo.add(jButtonFK_IdCargoGrupoCargo, gridBagConstraintsCargo);

		jTabbedPaneBusquedasCargo.addTab("2.-Por Cargo Grupo ", jPanelFK_IdCargoGrupoCargo);
		jTabbedPaneBusquedasCargo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCargo= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCargo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCargo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCargo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCargo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCargo.setLayout(gridaBagLayoutFK_IdCuentaContableCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 0;
		gridBagConstraintsCargo.gridx = 0;
		jPanelFK_IdCuentaContableCargo.add(jLabelid_cuenta_contableFK_IdCuentaContableCargo, gridBagConstraintsCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 0;
		gridBagConstraintsCargo.gridx = 1;
		jPanelFK_IdCuentaContableCargo.add(jComboBoxid_cuenta_contableFK_IdCuentaContableCargo, gridBagConstraintsCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 1;
		gridBagConstraintsCargo.gridx =1;
		jPanelFK_IdCuentaContableCargo.add(jButtonFK_IdCuentaContableCargo, gridBagConstraintsCargo);

		jTabbedPaneBusquedasCargo.addTab("3.-Por Cuenta Contable ", jPanelFK_IdCuentaContableCargo);
		jTabbedPaneBusquedasCargo.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdNumeroPatronalCargo= new GridBagLayout();
		gridaBagLayoutFK_IdNumeroPatronalCargo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNumeroPatronalCargo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNumeroPatronalCargo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNumeroPatronalCargo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNumeroPatronalCargo.setLayout(gridaBagLayoutFK_IdNumeroPatronalCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 0;
		gridBagConstraintsCargo.gridx = 0;
		jPanelFK_IdNumeroPatronalCargo.add(jLabelid_numero_patronalFK_IdNumeroPatronalCargo, gridBagConstraintsCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 0;
		gridBagConstraintsCargo.gridx = 1;
		jPanelFK_IdNumeroPatronalCargo.add(jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo, gridBagConstraintsCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 1;
		gridBagConstraintsCargo.gridx =1;
		jPanelFK_IdNumeroPatronalCargo.add(jButtonFK_IdNumeroPatronalCargo, gridBagConstraintsCargo);

		jTabbedPaneBusquedasCargo.addTab("4.-Por Numero Patronal ", jPanelFK_IdNumeroPatronalCargo);
		jTabbedPaneBusquedasCargo.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoPago_NMCargo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPago_NMCargo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPago_NMCargo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPago_NMCargo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPago_NMCargo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPago_NMCargo.setLayout(gridaBagLayoutFK_IdTipoPago_NMCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 0;
		gridBagConstraintsCargo.gridx = 0;
		jPanelFK_IdTipoPago_NMCargo.add(jLabelid_tipo_pago__n_mFK_IdTipoPago_NMCargo, gridBagConstraintsCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 0;
		gridBagConstraintsCargo.gridx = 1;
		jPanelFK_IdTipoPago_NMCargo.add(jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo, gridBagConstraintsCargo);

		gridBagConstraintsCargo = new GridBagConstraints();
		gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargo.gridy = 1;
		gridBagConstraintsCargo.gridx =1;
		jPanelFK_IdTipoPago_NMCargo.add(jButtonFK_IdTipoPago_NMCargo, gridBagConstraintsCargo);

		jTabbedPaneBusquedasCargo.addTab("5.-Por Tipo Pago_ N M ", jPanelFK_IdTipoPago_NMCargo);
		jTabbedPaneBusquedasCargo.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCargo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCargo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cargoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCargo = new GridBagConstraints();						
			this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargo.gridx = 0;		
			//this.gridBagConstraintsCargo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCargo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCargo, this.gridBagConstraintsCargo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCargo.gridx = 0;		
		//this.gridBagConstraintsCargo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCargo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCargo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargo.gridx = 0;		
			this.gridBagConstraintsCargo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCargo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCargo, this.gridBagConstraintsCargo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCargo, this.gridBagConstraintsCargo);								
		
		
		/*
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCargo, this.gridBagConstraintsCargo);
		*/		
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCargo.gridx =0;
		this.gridBagConstraintsCargo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCargo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCargo, this.gridBagConstraintsCargo);
				
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCargo, this.gridBagConstraintsCargo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeCargo = new CargoBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeCargo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeCargo.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeCargo.setTitle("Cargo ARBOL");
		this.jInternalFrameTreeCargo.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cargo Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeCargo.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeCargo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeCargo.setResizable(true);
	    this.jInternalFrameTreeCargo.setClosable(true);
	    this.jInternalFrameTreeCargo.setMaximizable(true);
			
			
		if(CargoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCargo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCargo = new GridBagLayout();
			this.jPanelBusquedasParametrosCargo.setLayout(gridaBagLayoutBusquedasParametrosCargo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCargo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCargo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCargo, this.gridBagConstraintsCargo);
			
			
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCargo, this.gridBagConstraintsCargo);
		
			
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCargo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCargo, this.gridBagConstraintsCargo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCargo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCargo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCargo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCargo.setName("jPanelReporteDinamicoCargo"); 
		
		this.jPanelReporteDinamicoCargo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCargo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCargo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCargo.setLayout(gridaBagLayoutReporteDinamicoCargo);
		
		
		this.jInternalFrameReporteDinamicoCargo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCargo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCargo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCargo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCargo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCargo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCargo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCargo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCargo.setResizable(true);
	    this.jInternalFrameReporteDinamicoCargo.setClosable(true);
	    this.jInternalFrameReporteDinamicoCargo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCargo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCargo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCargo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCargo = new JLabelMe();

		this.jLabelColumnasSelectReporteCargo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargo.add(this.jLabelColumnasSelectReporteCargo, this.gridBagConstraintsCargo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCargo = new JList<Reporte>();
		this.jListColumnasSelectReporteCargo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCargo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCargo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCargo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCargo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCargo=new JScrollPane(this.jListColumnasSelectReporteCargo);
			
			this.jScrollColumnasSelectReporteCargo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCargo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCargo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCargo.add(this.jListColumnasSelectReporteCargo, this.gridBagConstraintsCargo);
		this.jPanelReporteDinamicoCargo.add(this.jScrollColumnasSelectReporteCargo, this.gridBagConstraintsCargo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCargo = new JLabelMe();

		this.jLabelRelacionesSelectReporteCargo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargo.add(this.jLabelRelacionesSelectReporteCargo, this.gridBagConstraintsCargo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCargo = new JList<Reporte>();
		this.jListRelacionesSelectReporteCargo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCargo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCargo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCargo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCargo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCargo=new JScrollPane(this.jListRelacionesSelectReporteCargo);
			
			this.jScrollRelacionesSelectReporteCargo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCargo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCargo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCargo.add(this.jListRelacionesSelectReporteCargo, this.gridBagConstraintsCargo);
		this.jPanelReporteDinamicoCargo.add(this.jScrollRelacionesSelectReporteCargo, this.gridBagConstraintsCargo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCargo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCargo = new JComboBoxMe();
		this.jListColumnasValoresGraficoCargo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCargo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCargo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCargo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCargo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCargo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCargo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCargo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCargo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCargo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCargo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCargo = new JLabelMe();

		this.jLabelConGraficoDinamicoCargo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargo.add(this.jLabelConGraficoDinamicoCargo, this.gridBagConstraintsCargo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCargo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCargo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCargo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCargo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCargo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCargo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargo.add(this.jCheckBoxConGraficoDinamicoCargo, this.gridBagConstraintsCargo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCargo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCargo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargo.add(this.jLabelColumnaCategoriaGraficoCargo, this.gridBagConstraintsCargo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCargo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCargo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCargo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCargo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCargo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCargo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCargo.add(this.jComboBoxColumnaCategoriaGraficoCargo, this.gridBagConstraintsCargo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCargo = new JLabelMe();

		this.jLabelColumnaCategoriaValorCargo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargo.add(this.jLabelColumnaCategoriaValorCargo, this.gridBagConstraintsCargo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCargo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCargo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCargo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCargo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCargo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCargo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCargo.add(this.jComboBoxColumnaCategoriaValorCargo, this.gridBagConstraintsCargo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCargo = new JLabelMe();

		this.jLabelColumnasValoresGraficoCargo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargo.add(this.jLabelColumnasValoresGraficoCargo, this.gridBagConstraintsCargo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCargo = new JList<Reporte>();
		this.jListColumnasValoresGraficoCargo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCargo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCargo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCargo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCargo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCargo=new JScrollPane(this.jListColumnasValoresGraficoCargo);
			
			this.jScrollColumnasValoresGraficoCargo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCargo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCargo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCargo.add(this.jListColumnasSelectReporteCargo, this.gridBagConstraintsCargo);
		this.jPanelReporteDinamicoCargo.add(this.jScrollColumnasValoresGraficoCargo, this.gridBagConstraintsCargo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCargo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCargo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargo.add(this.jLabelTiposGraficosReportesDinamicoCargo, this.gridBagConstraintsCargo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCargo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCargo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCargo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCargo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCargo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCargo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargo.add(this.jComboBoxTiposGraficosReportesDinamicoCargo, this.gridBagConstraintsCargo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCargo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCargo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargo.add(this.jLabelGenerarExcelReporteDinamicoCargo, this.gridBagConstraintsCargo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCargo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCargo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCargo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCargo.setToolTipText("Generar EXCEL"+" "+CargoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCargo.add(this.jButtonGenerarExcelReporteDinamicoCargo, this.gridBagConstraintsCargo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargo.add(this.jComboBoxTiposReportesDinamicoCargo, this.gridBagConstraintsCargo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCargo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCargo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargo.add(this.jLabelTiposArchivoReporteDinamicoCargo, this.gridBagConstraintsCargo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargo.add(this.jComboBoxTiposArchivosReportesDinamicoCargo, this.gridBagConstraintsCargo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCargo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCargo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCargo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCargo.setToolTipText("Generar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargo.add(this.jButtonGenerarReporteDinamicoCargo, this.gridBagConstraintsCargo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCargo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCargo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCargo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCargo.setToolTipText("Cancelar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargo.add(this.jButtonCerrarReporteDinamicoCargo, this.gridBagConstraintsCargo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCargo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCargo= new JScrollPane(jPanelReporteDinamicoCargo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCargo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCargo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCargo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCargo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCargo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCargo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCargo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCargo);
		this.jInternalFrameReporteDinamicoCargo.getContentPane().add(this.jScrollPanelReporteDinamicoCargo, this.gridBagConstraintsCargo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCargo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCargo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCargo.setName("jPanelImportacionCargo"); 
		
		this.jPanelImportacionCargo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCargo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCargo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCargo.setLayout(gridaBagLayoutImportacionCargo);
		
		
		this.jInternalFrameImportacionCargo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCargo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCargo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCargo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCargo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCargo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCargo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCargo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCargo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCargo.setResizable(true);
	    this.jInternalFrameImportacionCargo.setClosable(true);
	    this.jInternalFrameImportacionCargo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCargo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCargo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCargo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCargo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCargo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCargo.setResizable(true);
	    this.jInternalFrameImportacionCargo.setClosable(true);
	    this.jInternalFrameImportacionCargo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCargo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCargo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCargo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCargo = new JLabelMe();

		this.jLabelArchivoImportacionCargo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYImportacion;		
		this.gridBagConstraintsCargo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCargo.add(this.jLabelArchivoImportacionCargo, this.gridBagConstraintsCargo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCargo = new JFileChooser();		
		this.jFileChooserImportacionCargo.setToolTipText("ESCOGER ARCHIVO"+" "+CargoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCargo = new JButtonMe();
		this.jButtonAbrirImportacionCargo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCargo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCargo.setToolTipText("Generar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.gridy = iPosYImportacion;
		this.gridBagConstraintsCargo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargo.add(this.jButtonAbrirImportacionCargo, this.gridBagConstraintsCargo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCargo = new JLabelMe();

		this.jLabelPathArchivoImportacionCargo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = iPosYImportacion;		
		this.gridBagConstraintsCargo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCargo.add(this.jLabelPathArchivoImportacionCargo, this.gridBagConstraintsCargo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCargo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCargo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCargo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCargo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.gridy = iPosYImportacion;
		this.gridBagConstraintsCargo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargo.add(this.jTextFieldPathArchivoImportacionCargo, this.gridBagConstraintsCargo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCargo = new JButtonMe();
		this.jButtonGenerarImportacionCargo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCargo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCargo.setToolTipText("Generar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.gridy = iPosYImportacion;
		this.gridBagConstraintsCargo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargo.add(this.jButtonGenerarImportacionCargo, this.gridBagConstraintsCargo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCargo = new JButtonMe();
		this.jButtonCerrarImportacionCargo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCargo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCargo.setToolTipText("Cancelar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.gridy = iPosYImportacion;
		this.gridBagConstraintsCargo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargo.add(this.jButtonCerrarImportacionCargo, this.gridBagConstraintsCargo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCargo = new GridBagLayout();
		
		this.jScrollPanelImportacionCargo= new JScrollPane(jPanelImportacionCargo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy =iPosYImportacion;
		this.gridBagConstraintsCargo.gridx =iPosXImportacion;
		this.gridBagConstraintsCargo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCargo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCargo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCargo);
		this.jInternalFrameImportacionCargo.getContentPane().add(this.jScrollPanelImportacionCargo, this.gridBagConstraintsCargo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCargo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCargo = new JButtonMe();
			this.jButtonAbrirOrderByCargo.setText("Orden");
			this.jButtonAbrirOrderByCargo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCargo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCargo";
			inputMap = this.jButtonAbrirOrderByCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCargo"));
		
		
			GridBagLayout gridaBagLayoutOrderByCargo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCargo.setName("jPanelOrderByCargo"); 
			
			this.jPanelOrderByCargo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCargo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCargo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCargo.setLayout(gridaBagLayoutOrderByCargo);
			
			
			this.jTableDatosCargoOrderBy = new JTableMe();        
			this.jTableDatosCargoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCargoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCargoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCargoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCargoOrderBy.setViewportView(this.jTableDatosCargoOrderBy);
			this.jTableDatosCargoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCargoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCargo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCargo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCargo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCargo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCargo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCargo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCargo.setTitle("Orden");
			this.jInternalFrameOrderByCargo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCargo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCargo.setResizable(true);
			this.jInternalFrameOrderByCargo.setClosable(true);
			this.jInternalFrameOrderByCargo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCargo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCargo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCargo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCargo.gridx =iPosXOrderBy;
			this.gridBagConstraintsCargo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCargo.ipady =150;
				
			this.jPanelOrderByCargo.add(jScrollPanelDatosCargoOrderBy, this.gridBagConstraintsCargo);//this.jTableDatosCargoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCargo = new JButtonMe();
			this.jButtonCerrarOrderByCargo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCargo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCargo.setToolTipText("Cancelar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCargo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCargo.add(this.jButtonCerrarOrderByCargo, this.gridBagConstraintsCargo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCargo = new GridBagLayout();
			
			this.jScrollPanelOrderByCargo= new JScrollPane(jPanelOrderByCargo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridy =iPosYOrderBy;
			this.gridBagConstraintsCargo.gridx =iPosXOrderBy;
			this.gridBagConstraintsCargo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCargo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCargo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCargo);
			
			this.jInternalFrameOrderByCargo.getContentPane().add(this.jScrollPanelOrderByCargo, this.gridBagConstraintsCargo);			
		
		} else {
			this.jButtonAbrirOrderByCargo = new JButtonMe();
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
		int iWidthTableCalculado=0;//3430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cargoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCargo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCargo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCargo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCargo.getRowHeight();//CargoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cargoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CargoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCargo.isSelected()) {
					iHeightTable=CargoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CargoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CargoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CargoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCargo.isSelected()) {
					iHeightTable=CargoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CargoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CargoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCargo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCargo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCargo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCargo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCargo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCargo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCargo!=null && this.jInternalFrameOrderByCargo.getjTableDatosOrderBy()!=null) {
			//if(!this.cargoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCargo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCargo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCargo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCargo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCargo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCargo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCargo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCargo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCargo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCargo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cargoLogic.getCargos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Cargo> TraerCargoBeans(List<Cargo> cargos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Cargo cargo:cargos) {
					
				if(!(CargoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CargoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cargo.setsDetalleGeneralEntityReporte(CargoConstantesFunciones.getCargoDescripcion(cargo));
										
					cargo.setes_jefe_descripcion(CargoConstantesFunciones.getes_jefeDescripcion(cargo));cargo.setes_anual_descripcion(CargoConstantesFunciones.getes_anualDescripcion(cargo));	
					
					

					if(cargo.getAsistenciaMensuals()!=null && Funciones.existeClass(classes,AsistenciaMensual.class)) {
						try{cargo.setasistenciamensualsDescripcionReporte(new JRBeanCollectionDataSource(AsistenciaMensualJInternalFrame.TraerAsistenciaMensualBeans(cargo.getAsistenciaMensuals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cargo.getEmpleadoEstructuras()!=null && Funciones.existeClass(classes,EmpleadoEstructura.class)) {
						try{cargo.setempleadoestructurasDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoEstructuraJInternalFrame.TraerEmpleadoEstructuraBeans(cargo.getEmpleadoEstructuras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cargo.getEmpleados()!=null && Funciones.existeClass(classes,Empleado.class)) {
						try{cargo.setempleadosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoJInternalFrame.TraerEmpleadoBeans(cargo.getEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cargo.getCargos()!=null && Funciones.existeClass(classes,Cargo.class)) {
						try{cargo.setcargosDescripcionReporte(new JRBeanCollectionDataSource(CargoJInternalFrame.TraerCargoBeans(cargo.getCargos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//cargo.setsDetalleGeneralEntityReporte(cargo.getsDetalleGeneralEntityReporte());
										
				}
				
				//cargobeans.add(cargobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cargos;
    }
	//PARA REPORTES FIN
}
