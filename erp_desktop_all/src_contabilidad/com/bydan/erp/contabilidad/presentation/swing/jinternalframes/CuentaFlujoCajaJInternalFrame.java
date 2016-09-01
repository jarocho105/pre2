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
import com.bydan.erp.contabilidad.util.CuentaFlujoCajaConstantesFunciones;

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
public class CuentaFlujoCajaJInternalFrame extends CuentaFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCuentaFlujoCaja;
	
	protected JMenuBar jmenuBarCuentaFlujoCaja;
	
	protected JMenu jmenuCuentaFlujoCaja;
	protected JMenu jmenuDatosCuentaFlujoCaja;
	protected JMenu jmenuArchivoCuentaFlujoCaja;
	protected JMenu jmenuAccionesCuentaFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsCuentaFlujoCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CuentaFlujoCajaDetalleFormJInternalFrame jInternalFrameDetalleFormCuentaFlujoCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCuentaFlujoCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCuentaFlujoCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected DiaBeanSwingJInternalFrame diaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_dia="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public CuentaFlujoCajaSessionBean cuentaflujocajaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public MesSessionBean mesSessionBean;
	public DiaSessionBean diaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CuentaFlujoCaja> cuentaflujocajas;		
	public List<CuentaFlujoCaja> cuentaflujocajasEliminados;	
	public List<CuentaFlujoCaja> cuentaflujocajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCuentaFlujoCaja;		
	protected JButton jButtonAbrirOrderByCuentaFlujoCaja;
	
	
	//protected JPanel jPanelOrderByCuentaFlujoCaja;
	//public JScrollPane jScrollPanelOrderByCuentaFlujoCaja;	
	//protected JButton jButtonCerrarOrderByCuentaFlujoCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CuentaFlujoCajaLogic cuentaflujocajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCuentaFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionCuentaFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralCuentaFlujoCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosCuentaFlujoCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCuentaFlujoCaja;
	//public JScrollPane jScrollPanelImportacionCuentaFlujoCaja;
	
	
	
	protected JPanel jPanelAccionesCuentaFlujoCaja;
	
    protected JPanel jPanelPaginacionCuentaFlujoCaja;
    protected JPanel jPanelParametrosReportesCuentaFlujoCaja;
	protected JPanel jPanelParametrosReportesAccionesCuentaFlujoCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CuentaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar2CuentaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar3CuentaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar4CuentaFlujoCaja;
	//protected JPanel jPanelParametrosAuxiliar5CuentaFlujoCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoCuentaFlujoCaja;
	//protected JPanel jPanelImportacionCuentaFlujoCaja;
	
	
	public JTable jTableDatosCuentaFlujoCaja;
	
	
	
	//public JTable jTableDatosCuentaFlujoCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCuentaFlujoCaja;
	protected JButton jButtonDuplicarCuentaFlujoCaja;
	protected JButton jButtonCopiarCuentaFlujoCaja;
	protected JButton jButtonVerFormCuentaFlujoCaja;
	protected JButton jButtonNuevoRelacionesCuentaFlujoCaja;
	protected JButton jButtonModificarCuentaFlujoCaja;
	
    protected JButton jButtonGuardarCambiosTablaCuentaFlujoCaja;
	protected JButton jButtonCerrarCuentaFlujoCaja;
	
	
	protected JButton jButtonRecargarInformacionCuentaFlujoCaja;
	protected JButton jButtonProcesarInformacionCuentaFlujoCaja;
	
	
	protected JButton jButtonAnterioresCuentaFlujoCaja;
	protected JButton jButtonSiguientesCuentaFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosCuentaFlujoCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCuentaFlujoCaja;
	//protected JButton jButtonCerrarReporteDinamicoCuentaFlujoCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoCuentaFlujoCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionCuentaFlujoCaja;
	//protected JButton jButtonGenerarImportacionCuentaFlujoCaja;
	//protected JButton jButtonCerrarImportacionCuentaFlujoCaja;
	//protected JFileChooser jFileChooserImportacionCuentaFlujoCaja;
	//protected File fileImportacionCuentaFlujoCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaFlujoCaja;
	protected JButton jButtonDuplicarToolBarCuentaFlujoCaja;
	protected JButton jButtonNuevoRelacionesToolBarCuentaFlujoCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarCuentaFlujoCaja;
	protected JButton jButtonCopiarToolBarCuentaFlujoCaja;
	protected JButton jButtonVerFormToolBarCuentaFlujoCaja;
	public JButton jButtonGuardarCambiosTablaToolBarCuentaFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaFlujoCaja;
	protected JButton jButtonCerrarToolBarCuentaFlujoCaja;
	
	protected JButton jButtonRecargarInformacionToolBarCuentaFlujoCaja;
	protected JButton jButtonProcesarInformacionToolBarCuentaFlujoCaja;
	protected JButton jButtonAnterioresToolBarCuentaFlujoCaja;
	protected JButton jButtonSiguientesToolBarCuentaFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarCuentaFlujoCaja;
	protected JButton jButtonAbrirOrderByToolBarCuentaFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaFlujoCaja;
	protected JMenuItem jMenuItemDuplicarCuentaFlujoCaja;
	protected JMenuItem jMenuItemNuevoRelacionesCuentaFlujoCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCuentaFlujoCaja;
	protected JMenuItem jMenuItemCopiarCuentaFlujoCaja;
	protected JMenuItem jMenuItemVerFormCuentaFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaFlujoCaja;
	protected JMenuItem jMenuItemCerrarCuentaFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarCuentaFlujoCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCuentaFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaFlujoCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionCuentaFlujoCaja;
	protected JMenuItem jMenuItemProcesarInformacionCuentaFlujoCaja;
	protected JMenuItem jMenuItemAnterioresCuentaFlujoCaja;
	protected JMenuItem jMenuItemSiguientesCuentaFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaFlujoCaja;
	protected JMenuItem jMenuItemAbrirOrderByCuentaFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarCuentaFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaFlujoCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCuentaFlujoCaja;
	protected JCheckBox jCheckBoxSeleccionadosCuentaFlujoCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCuentaFlujoCaja;
	protected JCheckBox jCheckBoxConGraficoReporteCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCuentaFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCuentaFlujoCaja;
	protected JTextField jTextFieldValorCampoGeneralCuentaFlujoCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCuentaFlujoCaja;
	//public JList<Reporte> jListColumnasSelectReporteCuentaFlujoCaja;
	//public JScrollPane jScrollColumnasSelectReporteCuentaFlujoCaja;
	
	//public JLabel jLabelRelacionesSelectReporteCuentaFlujoCaja;
	//public JList<Reporte> jListRelacionesSelectReporteCuentaFlujoCaja;
	//public JScrollPane jScrollRelacionesSelectReporteCuentaFlujoCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCuentaFlujoCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCuentaFlujoCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCuentaFlujoCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoCuentaFlujoCaja;
	
		
	//public JLabel jLabelArchivoImportacionCuentaFlujoCaja;	
	//public JLabel jLabelPathArchivoImportacionCuentaFlujoCaja;
	//protected JTextField jTextFieldPathArchivoImportacionCuentaFlujoCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCuentaFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCuentaFlujoCaja;
	
	//public JLabel jLabelColumnaCategoriaValorCuentaFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCuentaFlujoCaja;
	
	//public JLabel jLabelColumnasValoresGraficoCuentaFlujoCaja;
	//public JList<Reporte> jListColumnasValoresGraficoCuentaFlujoCaja;
	//public JScrollPane jScrollColumnasValoresGraficoCuentaFlujoCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCuentaFlujoCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCuentaFlujoCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCuentaFlujoCaja;
	public JPanel jPanelBusquedaPorNombreCuentaFlujoCaja;
	public JButton jButtonBusquedaPorNombreCuentaFlujoCaja;
	public JPanel jPanelFK_IdCuentaContableCuentaFlujoCaja;
	public JButton jButtonFK_IdCuentaContableCuentaFlujoCaja;
	
	public JPanel jPanelnombreBusquedaPorNombreCuentaFlujoCaja;
	public JLabel jLabelnombreBusquedaPorNombreCuentaFlujoCaja;
	public JTextArea jTextAreanombreBusquedaPorNombreCuentaFlujoCaja;
	public JButton jButtonnombreBusquedaPorNombreCuentaFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaFlujoCajaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaFlujoCajaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaFlujoCaja;
	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CuentaFlujoCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaFlujoCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaFlujoCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaFlujoCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCuentaFlujoCaja)	{
		this.jButtonRecargarInformacionCuentaFlujoCaja = jButtonRecargarInformacionCuentaFlujoCaja;
	}
	
	public JButton getjButtonProcesarInformacionCuentaFlujoCaja() {
		return this.jButtonProcesarInformacionCuentaFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaFlujoCaja)	{
		this.jButtonProcesarInformacionCuentaFlujoCaja = jButtonProcesarInformacionCuentaFlujoCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionCuentaFlujoCaja() {
		return this.jButtonRecargarInformacionCuentaFlujoCaja;
	}
	
	
	public List<CuentaFlujoCaja> getcuentaflujocajas() {
		return this.cuentaflujocajas;
	}

	public void setcuentaflujocajas(List<CuentaFlujoCaja> cuentaflujocajas) {
		this.cuentaflujocajas = cuentaflujocajas;
	}
	
	public List<CuentaFlujoCaja> getcuentaflujocajasAux() {
		return this.cuentaflujocajasAux;
	}

	public void setcuentaflujocajasAux(List<CuentaFlujoCaja> cuentaflujocajasAux) {
		this.cuentaflujocajasAux = cuentaflujocajasAux;
	}
	
	public List<CuentaFlujoCaja> getcuentaflujocajasEliminados() {
		return this.cuentaflujocajasEliminados;
	}

	public void setCuentaFlujoCajasEliminados(List<CuentaFlujoCaja> cuentaflujocajasEliminados) {
		this.cuentaflujocajasEliminados = cuentaflujocajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCuentaFlujoCaja() {
		return jComboBoxTiposSeleccionarCuentaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCuentaFlujoCaja(
			JComboBox jComboBoxTiposSeleccionarCuentaFlujoCaja) {
		this.jComboBoxTiposSeleccionarCuentaFlujoCaja = jComboBoxTiposSeleccionarCuentaFlujoCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCuentaFlujoCaja() {
		return jTextFieldValorCampoGeneralCuentaFlujoCaja;
	}

	public void setjTextFieldValorCampoGeneralCuentaFlujoCaja(
			JTextField jTextFieldValorCampoGeneralCuentaFlujoCaja) {
		this.jTextFieldValorCampoGeneralCuentaFlujoCaja = jTextFieldValorCampoGeneralCuentaFlujoCaja;
	}

	public void setBorderResaltarValorCampoGeneralCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCuentaFlujoCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCuentaFlujoCaja() {
		return this.jCheckBoxSeleccionarTodosCuentaFlujoCaja;
	}

	public void setjCheckBoxSeleccionarTodosCuentaFlujoCaja(
			JCheckBox jCheckBoxSeleccionarTodosCuentaFlujoCaja) {
		this.jCheckBoxSeleccionarTodosCuentaFlujoCaja = jCheckBoxSeleccionarTodosCuentaFlujoCaja;
	}

	public void setBorderResaltarSeleccionarTodosCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCuentaFlujoCaja() {
		return this.jCheckBoxSeleccionadosCuentaFlujoCaja;
	}

	public void setjCheckBoxSeleccionadosCuentaFlujoCaja(
			JCheckBox jCheckBoxSeleccionadosCuentaFlujoCaja) {
		this.jCheckBoxSeleccionadosCuentaFlujoCaja = jCheckBoxSeleccionadosCuentaFlujoCaja;
	}
	
	public void setBorderResaltarSeleccionadosCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCuentaFlujoCaja() {
		return this.jComboBoxTiposArchivosReportesCuentaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCuentaFlujoCaja(
			JComboBox jComboBoxTiposArchivosReportesCuentaFlujoCaja) {
		this.jComboBoxTiposArchivosReportesCuentaFlujoCaja = jComboBoxTiposArchivosReportesCuentaFlujoCaja;
	}

	public void setBorderResaltarTiposArchivosReportesCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCuentaFlujoCaja() {
		return this.jComboBoxTiposReportesCuentaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCuentaFlujoCaja(
			JComboBox jComboBoxTiposReportesCuentaFlujoCaja) {
		this.jComboBoxTiposReportesCuentaFlujoCaja = jComboBoxTiposReportesCuentaFlujoCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCuentaFlujoCaja() {
	//	return jComboBoxTiposReportesDinamicoCuentaFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCuentaFlujoCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoCuentaFlujoCaja) {
	//	this.jComboBoxTiposReportesDinamicoCuentaFlujoCaja = jComboBoxTiposReportesDinamicoCuentaFlujoCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja = jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja;
	//}
	
	public void setBorderResaltarTiposReportesCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCuentaFlujoCaja() {
		return this.jComboBoxTiposGraficosReportesCuentaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCuentaFlujoCaja(
			JComboBox jComboBoxTiposGraficosReportesCuentaFlujoCaja) {
		this.jComboBoxTiposGraficosReportesCuentaFlujoCaja = jComboBoxTiposGraficosReportesCuentaFlujoCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCuentaFlujoCaja() {
		return this.jComboBoxTiposPaginacionCuentaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCuentaFlujoCaja(
			JComboBox jComboBoxTiposPaginacionCuentaFlujoCaja) {
		this.jComboBoxTiposPaginacionCuentaFlujoCaja = jComboBoxTiposPaginacionCuentaFlujoCaja;
	}
	
	public void setBorderResaltarTiposPaginacionCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCuentaFlujoCaja() {
		return this.jComboBoxTiposRelacionesCuentaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaFlujoCaja() {
		return this.jComboBoxTiposAccionesCuentaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaFlujoCaja(
			JComboBox jComboBoxTiposRelacionesCuentaFlujoCaja) {
		this.jComboBoxTiposRelacionesCuentaFlujoCaja = jComboBoxTiposRelacionesCuentaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaFlujoCaja(
			JComboBox jComboBoxTiposAccionesCuentaFlujoCaja) {
		this.jComboBoxTiposAccionesCuentaFlujoCaja = jComboBoxTiposAccionesCuentaFlujoCaja;
	}
	
	public void setBorderResaltarTiposRelacionesCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCuentaFlujoCaja() {
	//	return jCheckBoxConGraficoDinamicoCuentaFlujoCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoCuentaFlujoCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoCuentaFlujoCaja) {
	//	this.jCheckBoxConGraficoDinamicoCuentaFlujoCaja = jCheckBoxConGraficoDinamicoCuentaFlujoCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCuentaFlujoCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCuentaFlujoCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCuentaFlujoCaja .setBorder(borderResaltar);		
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
		this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
		
		this.cuentaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentaflujocajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
		
		CuentaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCuentaFlujoCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"nuevo","nuevo","Nuevo"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"duplicar","duplicar","Duplicar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"copiar","copiar","Copiar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"ver_form","ver_form","Ver"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"recargar","recargar","Recargar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,
							"cerrar","cerrar","Salir"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCuentaFlujoCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCuentaFlujoCaja;
			
				this.jButtonProcesarInformacionToolBarCuentaFlujoCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCuentaFlujoCaja;
				
		//protected JButton jButtonModificarToolBarCuentaFlujoCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCuentaFlujoCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCuentaFlujoCaja=new JMenuMe("General");
		this.jmenuArchivoCuentaFlujoCaja=new JMenuMe("Archivo");
		this.jmenuAccionesCuentaFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDatosCuentaFlujoCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCuentaFlujoCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCuentaFlujoCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCuentaFlujoCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCuentaFlujoCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCuentaFlujoCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCuentaFlujoCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCuentaFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCuentaFlujoCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCuentaFlujoCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCuentaFlujoCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCuentaFlujoCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCuentaFlujoCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCuentaFlujoCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCuentaFlujoCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCuentaFlujoCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCuentaFlujoCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCuentaFlujoCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCuentaFlujoCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCuentaFlujoCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCuentaFlujoCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCuentaFlujoCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCuentaFlujoCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCuentaFlujoCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCuentaFlujoCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCuentaFlujoCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCuentaFlujoCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCuentaFlujoCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCuentaFlujoCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCuentaFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCuentaFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCuentaFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCuentaFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCuentaFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCuentaFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCuentaFlujoCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCuentaFlujoCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCuentaFlujoCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCuentaFlujoCaja.add(this.jMenuItemCerrarCuentaFlujoCaja);
			
			this.jmenuAccionesCuentaFlujoCaja.add(this.jMenuItemNuevoCuentaFlujoCaja);
			this.jmenuAccionesCuentaFlujoCaja.add(this.jMenuItemNuevoGuardarCambiosCuentaFlujoCaja);
			this.jmenuAccionesCuentaFlujoCaja.add(this.jMenuItemNuevoRelacionesCuentaFlujoCaja);
			this.jmenuAccionesCuentaFlujoCaja.add(this.jMenuItemGuardarCambiosTablaCuentaFlujoCaja);		
			this.jmenuAccionesCuentaFlujoCaja.add(this.jMenuItemDuplicarCuentaFlujoCaja);		
			this.jmenuAccionesCuentaFlujoCaja.add(this.jMenuItemCopiarCuentaFlujoCaja);		
			this.jmenuAccionesCuentaFlujoCaja.add(this.jMenuItemVerFormCuentaFlujoCaja);		
			
			this.jmenuDatosCuentaFlujoCaja.add(this.jMenuItemRecargarInformacionCuentaFlujoCaja);				
			this.jmenuDatosCuentaFlujoCaja.add(this.jMenuItemAnterioresCuentaFlujoCaja);				
			this.jmenuDatosCuentaFlujoCaja.add(this.jMenuItemSiguientesCuentaFlujoCaja);				
			this.jmenuDatosCuentaFlujoCaja.add(this.jMenuItemAbrirOrderByCuentaFlujoCaja);				
			this.jmenuDatosCuentaFlujoCaja.add(this.jMenuItemMostrarOcultarCuentaFlujoCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCuentaFlujoCaja.add(this.jMenuItemGuardarCambiosCuentaFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCuentaFlujoCaja.add(this.jmenuArchivoCuentaFlujoCaja);		
			this.jmenuBarCuentaFlujoCaja.add(this.jmenuAccionesCuentaFlujoCaja);		
			this.jmenuBarCuentaFlujoCaja.add(this.jmenuDatosCuentaFlujoCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCuentaFlujoCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCuentaFlujoCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCuentaFlujoCaja.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreCuentaFlujoCaja= new JButtonMe();
		this.jButtonBusquedaPorNombreCuentaFlujoCaja.setText("Buscar");
		this.jButtonBusquedaPorNombreCuentaFlujoCaja.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCuentaFlujoCaja,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreCuentaFlujoCaja = new JLabelMe();
		jLabelnombreBusquedaPorNombreCuentaFlujoCaja.setText("Nombre :");
		jLabelnombreBusquedaPorNombreCuentaFlujoCaja.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreCuentaFlujoCaja= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCuentaFlujoCaja.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableCuentaFlujoCaja= new JButtonMe();
		this.jButtonFK_IdCuentaContableCuentaFlujoCaja.setText("Buscar");
		this.jButtonFK_IdCuentaContableCuentaFlujoCaja.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCuentaFlujoCaja,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaFlujoCaja= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaFlujoCaja.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaFlujoCaja.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaFlujoCaja.setFocusable(false);


		this.jTabbedPaneBusquedasCuentaFlujoCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasCuentaFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCuentaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCuentaFlujoCaja = new CuentaFlujoCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuenta Flujo Caja DATOS");
			this.jInternalFrameDetalleFormCuentaFlujoCaja = new CuentaFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.cuentaflujocajaSessionBean.getConGuardarRelaciones(),this.cuentaflujocajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCuentaFlujoCaja = null;//new CuentaFlujoCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaFlujoCaja= new GridBagLayout();
		
		
		this.jTableDatosCuentaFlujoCaja = new JTableMe();      
		
		String sToolTipCuentaFlujoCaja="";
		sToolTipCuentaFlujoCaja=CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaFlujoCaja+="(Contabilidad.CuentaFlujoCaja)";
		}
		
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaFlujoCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCuentaFlujoCaja.setToolTipText(sToolTipCuentaFlujoCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCuentaFlujoCaja);
		this.jTableDatosCuentaFlujoCaja.setAutoCreateRowSorter(true);
		this.jTableDatosCuentaFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCuentaFlujoCaja.setRowSelectionAllowed(true);
		this.jTableDatosCuentaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCuentaFlujoCaja = new JButtonMe();
		this.jButtonDuplicarCuentaFlujoCaja = new JButtonMe();
		this.jButtonCopiarCuentaFlujoCaja = new JButtonMe();
		this.jButtonVerFormCuentaFlujoCaja = new JButtonMe();
		this.jButtonNuevoRelacionesCuentaFlujoCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCuentaFlujoCaja = new JButtonMe();
		this.jButtonCerrarCuentaFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosCuentaFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralCuentaFlujoCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Flujo Caja";
		
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesCuentaFlujoCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCuentaFlujoCaja=new ReporteDinamicoJInternalFrame(CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCuentaFlujoCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCuentaFlujoCaja=new ImportacionJInternalFrame(CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCuentaFlujoCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCuentaFlujoCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByCuentaFlujoCaja.setText("Orden");
		this.jButtonAbrirOrderByCuentaFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaFlujoCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaFlujoCaja,false,this);
			
			//this.cargarOrderByCuentaFlujoCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaFlujoCaja,true,this);
			
			//this.cargarOrderByCuentaFlujoCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCuentaFlujoCaja.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosCuentaFlujoCaja.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosCuentaFlujoCaja.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosCuentaFlujoCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaFlujoCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaFlujoCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCuentaFlujoCaja.setText("Nuevo");
		this.jButtonDuplicarCuentaFlujoCaja.setText("Duplicar");
		this.jButtonCopiarCuentaFlujoCaja.setText("Copiar");
		this.jButtonVerFormCuentaFlujoCaja.setText("Ver");
		this.jButtonNuevoRelacionesCuentaFlujoCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCuentaFlujoCaja.setText("Guardar");
		this.jButtonCerrarCuentaFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaFlujoCaja,"nuevo_button","Nuevo",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCuentaFlujoCaja,"duplicar_button","Duplicar",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCuentaFlujoCaja,"copiar_button","Copiar",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCuentaFlujoCaja,"ver_form","Ver",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCuentaFlujoCaja,"nuevorelaciones_button","Nuevo Rel",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaFlujoCaja,"guardarcambiostabla_button","Guardar",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaFlujoCaja,"cerrar_button","Salir",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCuentaFlujoCaja.setToolTipText("Nuevo"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCuentaFlujoCaja.setToolTipText("Duplicar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCuentaFlujoCaja.setToolTipText("Copiar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCuentaFlujoCaja.setToolTipText("Ver"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCuentaFlujoCaja.setToolTipText("Nuevo Rel"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCuentaFlujoCaja.setToolTipText("Guardar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaFlujoCaja.setToolTipText("Salir"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaFlujoCaja";
		inputMap = this.jButtonNuevoCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaFlujoCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarCuentaFlujoCaja";
		inputMap = this.jButtonDuplicarCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCuentaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCuentaFlujoCaja"));
		
		//COPIAR
		sMapKey = "CopiarCuentaFlujoCaja";
		inputMap = this.jButtonCopiarCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCuentaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCuentaFlujoCaja"));
		
		//VEr FORM
		sMapKey = "VerFormCuentaFlujoCaja";
		inputMap = this.jButtonVerFormCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCuentaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCuentaFlujoCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCuentaFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCuentaFlujoCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCuentaFlujoCaja";
		inputMap = this.jButtonModificarCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCuentaFlujoCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCuentaFlujoCaja";
		inputMap = this.jButtonCerrarCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaFlujoCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCuentaFlujoCaja.setName("jPanelParametrosReportesCuentaFlujoCaja"); 
		
		this.jPanelParametrosReportesAccionesCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCuentaFlujoCaja.setName("jPanelParametrosReportesAccionesCuentaFlujoCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCuentaFlujoCaja = new JButtonMe();
		this.jButtonRecargarInformacionCuentaFlujoCaja.setText("Recargar");
		this.jButtonRecargarInformacionCuentaFlujoCaja.setToolTipText("Recargar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCuentaFlujoCaja,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCuentaFlujoCaja = new JButtonMe();
		this.jButtonProcesarInformacionCuentaFlujoCaja.setText("Procesar");
		this.jButtonProcesarInformacionCuentaFlujoCaja.setToolTipText("Procesar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCuentaFlujoCaja.setVisible(false);
			
		this.jButtonProcesarInformacionCuentaFlujoCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaFlujoCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaFlujoCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCuentaFlujoCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposReportesCuentaFlujoCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCuentaFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCuentaFlujoCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionCuentaFlujoCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCuentaFlujoCaja.setText("Accion");
		this.jComboBoxTiposRelacionesCuentaFlujoCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesCuentaFlujoCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCuentaFlujoCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarCuentaFlujoCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCuentaFlujoCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCuentaFlujoCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaFlujoCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaFlujoCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCuentaFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesCuentaFlujoCaja.setText("Acciones");		
		this.jLabelAccionesCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCuentaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCuentaFlujoCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCuentaFlujoCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCuentaFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCuentaFlujoCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCuentaFlujoCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCuentaFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCuentaFlujoCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCuentaFlujoCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCuentaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCuentaFlujoCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteCuentaFlujoCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCuentaFlujoCaja = new JButtonMe();
		//this.jButtonAnterioresCuentaFlujoCaja.setText("<<");
        this.jButtonAnterioresCuentaFlujoCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCuentaFlujoCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCuentaFlujoCaja = new JButtonMe();
		//this.jButtonSiguientesCuentaFlujoCaja.setText(">>");
        this.jButtonSiguientesCuentaFlujoCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCuentaFlujoCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCuentaFlujoCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCuentaFlujoCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosCuentaFlujoCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCuentaFlujoCaja,"nuevoguardarcambios_button","Nue",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCuentaFlujoCaja";
		inputMap = this.jButtonNuevoGuardarCambiosCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCuentaFlujoCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCuentaFlujoCaja";
		inputMap = this.jButtonRecargarInformacionCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCuentaFlujoCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCuentaFlujoCaja";
		inputMap = this.jButtonSiguientesCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCuentaFlujoCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCuentaFlujoCaja";
		inputMap = this.jButtonAnterioresCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCuentaFlujoCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCuentaFlujoCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCuentaFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),CuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),CuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),CuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCuentaFlujoCaja = new GridBagLayout();

			this.jPanelPaginacionCuentaFlujoCaja.setLayout(gridaBagLayoutPaginacionCuentaFlujoCaja);						
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCuentaFlujoCaja.add(this.jButtonAnterioresCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
					
						
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
			
			this.jPanelPaginacionCuentaFlujoCaja.add(this.jButtonNuevoGuardarCambiosCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
						
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
			this.jPanelPaginacionCuentaFlujoCaja.add(this.jButtonSiguientesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = 1;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaFlujoCaja.add(this.jButtonNuevoCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaFlujoCaja.gridy = 1;
				this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCuentaFlujoCaja.add(this.jButtonNuevoRelacionesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			}
			
			
			if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaFlujoCaja.gridy = 1;
				this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCuentaFlujoCaja.add(this.jButtonGuardarCambiosTablaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			}
			
			
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = 1;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaFlujoCaja.add(this.jButtonDuplicarCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = 1;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaFlujoCaja.add(this.jButtonCopiarCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = 1;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaFlujoCaja.add(this.jButtonVerFormCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = 1;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCuentaFlujoCaja.add(this.jButtonCerrarCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		
		
		
		this.jButtonRecargarInformacionCuentaFlujoCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaFlujoCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaFlujoCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCuentaFlujoCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaFlujoCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaFlujoCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCuentaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCuentaFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCuentaFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCuentaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCuentaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCuentaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCuentaFlujoCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaFlujoCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaFlujoCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCuentaFlujoCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaFlujoCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaFlujoCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCuentaFlujoCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaFlujoCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaFlujoCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCuentaFlujoCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaFlujoCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaFlujoCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCuentaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCuentaFlujoCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CuentaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CuentaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CuentaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CuentaFlujoCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCuentaFlujoCaja.setLayout(gridaBagParametrosReportesCuentaFlujoCaja);
			this.jPanelParametrosReportesAccionesCuentaFlujoCaja.setLayout(gridaBagParametrosReportesAccionesCuentaFlujoCaja);
			
			
			this.jPanelParametrosAuxiliar1CuentaFlujoCaja.setLayout(gridaBagParametrosAuxiliar1CuentaFlujoCaja);
			this.jPanelParametrosAuxiliar2CuentaFlujoCaja.setLayout(gridaBagParametrosAuxiliar2CuentaFlujoCaja);
			this.jPanelParametrosAuxiliar3CuentaFlujoCaja.setLayout(gridaBagParametrosAuxiliar3CuentaFlujoCaja);
			this.jPanelParametrosAuxiliar4CuentaFlujoCaja.setLayout(gridaBagParametrosAuxiliar4CuentaFlujoCaja);
			//this.jPanelParametrosAuxiliar5CuentaFlujoCaja.setLayout(gridaBagParametrosAuxiliar2CuentaFlujoCaja);			
			
			
			
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jButtonRecargarInformacionCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaFlujoCaja.add(this.jComboBoxTiposPaginacionCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaFlujoCaja.add(this.jCheckBoxConAltoMaximoTablaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaFlujoCaja.add(this.jComboBoxTiposArchivosReportesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jPanelParametrosAuxiliar1CuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CuentaFlujoCaja.add(this.jComboBoxTiposReportesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jPanelParametrosAuxiliar4CuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jComboBoxTiposReportesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jCheckBoxGenerarReporteCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jPanelParametrosAuxiliar2CuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jLabelAccionesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jButtonAbrirOrderByCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jComboBoxTiposSeleccionarCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);			
			
			
			/*
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jCheckBoxSeleccionarTodosCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaFlujoCaja.add(this.jCheckBoxSeleccionarTodosCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);															
				
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaFlujoCaja.add(this.jCheckBoxSeleccionadosCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jPanelParametrosAuxiliar3CuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jComboBoxTiposRelacionesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
				
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jComboBoxTiposAccionesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
	
				
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaFlujoCaja.add(this.jTextFieldValorCampoGeneralCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCuentaFlujoCaja = new GridBagLayout();

			this.jScrollPanelDatosCuentaFlujoCaja.setLayout(gridaBagLayoutDatosCuentaFlujoCaja);
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
			
			this.jScrollPanelDatosCuentaFlujoCaja.add(this.jTableDatosCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCuentaFlujoCaja.setViewportView(this.jTableDatosCuentaFlujoCaja);
		this.jTableDatosCuentaFlujoCaja.setFillsViewportHeight(true);
		this.jTableDatosCuentaFlujoCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCuentaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesCuentaFlujoCaja.setLayout(gridaBagLayoutAccionesCuentaFlujoCaja);
		
		
		/*	
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
			
		this.jPanelAccionesCuentaFlujoCaja.add(this.jButtonNuevoCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreCuentaFlujoCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCuentaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCuentaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCuentaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCuentaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCuentaFlujoCaja.setLayout(gridaBagLayoutBusquedaPorNombreCuentaFlujoCaja);

		gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		gridBagConstraintsCuentaFlujoCaja.gridx = 0;
		jPanelBusquedaPorNombreCuentaFlujoCaja.add(jLabelnombreBusquedaPorNombreCuentaFlujoCaja, gridBagConstraintsCuentaFlujoCaja);

		gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		gridBagConstraintsCuentaFlujoCaja.gridx = 1;
		jPanelBusquedaPorNombreCuentaFlujoCaja.add(jTextAreanombreBusquedaPorNombreCuentaFlujoCaja, gridBagConstraintsCuentaFlujoCaja);

		gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaFlujoCaja.gridy = 1;
		gridBagConstraintsCuentaFlujoCaja.gridx =1;
		jPanelBusquedaPorNombreCuentaFlujoCaja.add(jButtonBusquedaPorNombreCuentaFlujoCaja, gridBagConstraintsCuentaFlujoCaja);

		jTabbedPaneBusquedasCuentaFlujoCaja.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreCuentaFlujoCaja);
		jTabbedPaneBusquedasCuentaFlujoCaja.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCuentaFlujoCaja= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCuentaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCuentaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCuentaFlujoCaja.setLayout(gridaBagLayoutFK_IdCuentaContableCuentaFlujoCaja);

		gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		gridBagConstraintsCuentaFlujoCaja.gridx = 0;
		jPanelFK_IdCuentaContableCuentaFlujoCaja.add(jLabelid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja, gridBagConstraintsCuentaFlujoCaja);

		gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		gridBagConstraintsCuentaFlujoCaja.gridx = 1;
		jPanelFK_IdCuentaContableCuentaFlujoCaja.add(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja, gridBagConstraintsCuentaFlujoCaja);


		gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.NONE;
		gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		gridBagConstraintsCuentaFlujoCaja.gridx = 0;
		jPanelFK_IdCuentaContableCuentaFlujoCaja.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaFlujoCaja, gridBagConstraintsCuentaFlujoCaja);

		gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaFlujoCaja.gridy = 1;
		gridBagConstraintsCuentaFlujoCaja.gridx =1;
		jPanelFK_IdCuentaContableCuentaFlujoCaja.add(jButtonFK_IdCuentaContableCuentaFlujoCaja, gridBagConstraintsCuentaFlujoCaja);

		jTabbedPaneBusquedasCuentaFlujoCaja.addTab("2.-Por Cuenta Contable ", jPanelFK_IdCuentaContableCuentaFlujoCaja);
		jTabbedPaneBusquedasCuentaFlujoCaja.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaFlujoCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsCuentaFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaFlujoCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;		
		//this.gridBagConstraintsCuentaFlujoCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCuentaFlujoCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;		
			this.gridBagConstraintsCuentaFlujoCaja.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCuentaFlujoCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);								
		
		
		/*
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		*/		
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaFlujoCaja.gridx =0;
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
				
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaFlujoCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosCuentaFlujoCaja.setLayout(gridaBagLayoutBusquedasParametrosCuentaFlujoCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCuentaFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			
			
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		
			
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCuentaFlujoCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCuentaFlujoCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCuentaFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCuentaFlujoCaja.setName("jPanelReporteDinamicoCuentaFlujoCaja"); 
		
		this.jPanelReporteDinamicoCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCuentaFlujoCaja.setLayout(gridaBagLayoutReporteDinamicoCuentaFlujoCaja);
		
		
		this.jInternalFrameReporteDinamicoCuentaFlujoCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCuentaFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Flujo Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCuentaFlujoCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteCuentaFlujoCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jLabelColumnasSelectReporteCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCuentaFlujoCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteCuentaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCuentaFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCuentaFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCuentaFlujoCaja=new JScrollPane(this.jListColumnasSelectReporteCuentaFlujoCaja);
			
			this.jScrollColumnasSelectReporteCuentaFlujoCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaFlujoCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaFlujoCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jListColumnasSelectReporteCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jScrollColumnasSelectReporteCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCuentaFlujoCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteCuentaFlujoCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jLabelRelacionesSelectReporteCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCuentaFlujoCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteCuentaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCuentaFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCuentaFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCuentaFlujoCaja=new JScrollPane(this.jListRelacionesSelectReporteCuentaFlujoCaja);
			
			this.jScrollRelacionesSelectReporteCuentaFlujoCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaFlujoCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaFlujoCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jListRelacionesSelectReporteCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jScrollRelacionesSelectReporteCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCuentaFlujoCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCuentaFlujoCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoCuentaFlujoCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCuentaFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCuentaFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCuentaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCuentaFlujoCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCuentaFlujoCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jLabelGenerarExcelReporteDinamicoCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCuentaFlujoCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCuentaFlujoCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCuentaFlujoCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCuentaFlujoCaja.setToolTipText("Generar EXCEL"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jButtonGenerarExcelReporteDinamicoCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jComboBoxTiposReportesDinamicoCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCuentaFlujoCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCuentaFlujoCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jLabelTiposArchivoReporteDinamicoCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jComboBoxTiposArchivosReportesDinamicoCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCuentaFlujoCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCuentaFlujoCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCuentaFlujoCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCuentaFlujoCaja.setToolTipText("Generar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jButtonGenerarReporteDinamicoCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCuentaFlujoCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCuentaFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCuentaFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCuentaFlujoCaja.setToolTipText("Cancelar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaFlujoCaja.add(this.jButtonCerrarReporteDinamicoCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCuentaFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCuentaFlujoCaja= new JScrollPane(jPanelReporteDinamicoCuentaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Flujo Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCuentaFlujoCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCuentaFlujoCaja);
		this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getContentPane().add(this.jScrollPanelReporteDinamicoCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCuentaFlujoCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCuentaFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCuentaFlujoCaja.setName("jPanelImportacionCuentaFlujoCaja"); 
		
		this.jPanelImportacionCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCuentaFlujoCaja.setLayout(gridaBagLayoutImportacionCuentaFlujoCaja);
		
		
		this.jInternalFrameImportacionCuentaFlujoCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCuentaFlujoCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCuentaFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCuentaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCuentaFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionCuentaFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionCuentaFlujoCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCuentaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaFlujoCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCuentaFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionCuentaFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionCuentaFlujoCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Flujo Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCuentaFlujoCaja = new JLabelMe();

		this.jLabelArchivoImportacionCuentaFlujoCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaFlujoCaja.add(this.jLabelArchivoImportacionCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCuentaFlujoCaja = new JFileChooser();		
		this.jFileChooserImportacionCuentaFlujoCaja.setToolTipText("ESCOGER ARCHIVO"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCuentaFlujoCaja = new JButtonMe();
		this.jButtonAbrirImportacionCuentaFlujoCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCuentaFlujoCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCuentaFlujoCaja.setToolTipText("Generar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaFlujoCaja.add(this.jButtonAbrirImportacionCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCuentaFlujoCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionCuentaFlujoCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaFlujoCaja.add(this.jLabelPathArchivoImportacionCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCuentaFlujoCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCuentaFlujoCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaFlujoCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaFlujoCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaFlujoCaja.add(this.jTextFieldPathArchivoImportacionCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCuentaFlujoCaja = new JButtonMe();
		this.jButtonGenerarImportacionCuentaFlujoCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCuentaFlujoCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCuentaFlujoCaja.setToolTipText("Generar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaFlujoCaja.add(this.jButtonGenerarImportacionCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCuentaFlujoCaja = new JButtonMe();
		this.jButtonCerrarImportacionCuentaFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCuentaFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCuentaFlujoCaja.setToolTipText("Cancelar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaFlujoCaja.add(this.jButtonCerrarImportacionCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCuentaFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionCuentaFlujoCaja= new JScrollPane(jPanelImportacionCuentaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsCuentaFlujoCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCuentaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCuentaFlujoCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCuentaFlujoCaja);
		this.jInternalFrameImportacionCuentaFlujoCaja.getContentPane().add(this.jScrollPanelImportacionCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCuentaFlujoCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCuentaFlujoCaja = new JButtonMe();
			this.jButtonAbrirOrderByCuentaFlujoCaja.setText("Orden");
			this.jButtonAbrirOrderByCuentaFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaFlujoCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCuentaFlujoCaja";
			inputMap = this.jButtonAbrirOrderByCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCuentaFlujoCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByCuentaFlujoCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCuentaFlujoCaja.setName("jPanelOrderByCuentaFlujoCaja"); 
			
			this.jPanelOrderByCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCuentaFlujoCaja.setLayout(gridaBagLayoutOrderByCuentaFlujoCaja);
			
			
			this.jTableDatosCuentaFlujoCajaOrderBy = new JTableMe();        
			this.jTableDatosCuentaFlujoCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCuentaFlujoCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCuentaFlujoCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCuentaFlujoCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCuentaFlujoCajaOrderBy.setViewportView(this.jTableDatosCuentaFlujoCajaOrderBy);
			this.jTableDatosCuentaFlujoCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCuentaFlujoCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCuentaFlujoCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCuentaFlujoCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCuentaFlujoCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCuentaFlujoCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCuentaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCuentaFlujoCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCuentaFlujoCaja.setTitle("Orden");
			this.jInternalFrameOrderByCuentaFlujoCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCuentaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCuentaFlujoCaja.setResizable(true);
			this.jInternalFrameOrderByCuentaFlujoCaja.setClosable(true);
			this.jInternalFrameOrderByCuentaFlujoCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Flujo Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCuentaFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCuentaFlujoCaja.ipady =150;
				
			this.jPanelOrderByCuentaFlujoCaja.add(jScrollPanelDatosCuentaFlujoCajaOrderBy, this.gridBagConstraintsCuentaFlujoCaja);//this.jTableDatosCuentaFlujoCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCuentaFlujoCaja = new JButtonMe();
			this.jButtonCerrarOrderByCuentaFlujoCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCuentaFlujoCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCuentaFlujoCaja.setToolTipText("Cancelar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCuentaFlujoCaja.add(this.jButtonCerrarOrderByCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCuentaFlujoCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByCuentaFlujoCaja= new JScrollPane(jPanelOrderByCuentaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsCuentaFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCuentaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCuentaFlujoCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCuentaFlujoCaja);
			
			this.jInternalFrameOrderByCuentaFlujoCaja.getContentPane().add(this.jScrollPanelOrderByCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);			
		
		} else {
			this.jButtonAbrirOrderByCuentaFlujoCaja = new JButtonMe();
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
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cuentaflujocajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCuentaFlujoCaja.getRowHeight();//CuentaFlujoCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaFlujoCaja.isSelected()) {
					iHeightTable=CuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaFlujoCaja.isSelected()) {
					iHeightTable=CuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCuentaFlujoCaja!=null && this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCuentaFlujoCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCuentaFlujoCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCuentaFlujoCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cuentaflujocajaLogic.getCuentaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentaflujocajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CuentaFlujoCaja> TraerCuentaFlujoCajaBeans(List<CuentaFlujoCaja> cuentaflujocajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(CuentaFlujoCaja cuentaflujocaja:cuentaflujocajas) {
					
				if(!(CuentaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CuentaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cuentaflujocaja.setsDetalleGeneralEntityReporte(CuentaFlujoCajaConstantesFunciones.getCuentaFlujoCajaDescripcion(cuentaflujocaja));
										
					cuentaflujocaja.setes_flujo_caja_descripcion(CuentaFlujoCajaConstantesFunciones.getes_flujo_cajaDescripcion(cuentaflujocaja));cuentaflujocaja.setcon_agrupar_descripcion(CuentaFlujoCajaConstantesFunciones.getcon_agruparDescripcion(cuentaflujocaja));	
					
					

					if(cuentaflujocaja.getDetalleCuentaFlujoCajas()!=null && Funciones.existeClass(classes,DetalleCuentaFlujoCaja.class)) {
						try{cuentaflujocaja.setdetallecuentaflujocajasDescripcionReporte(new JRBeanCollectionDataSource(DetalleCuentaFlujoCajaJInternalFrame.TraerDetalleCuentaFlujoCajaBeans(cuentaflujocaja.getDetalleCuentaFlujoCajas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//cuentaflujocaja.setsDetalleGeneralEntityReporte(cuentaflujocaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//cuentaflujocajabeans.add(cuentaflujocajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cuentaflujocajas;
    }
	//PARA REPORTES FIN
}
