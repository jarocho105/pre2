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


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.activosfijos.util.CuentaContaGastoDepreConstantesFunciones;

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
public class CuentaContaGastoDepreJInternalFrame extends CuentaContaGastoDepreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCuentaContaGastoDepre;
	
	protected JMenuBar jmenuBarCuentaContaGastoDepre;
	
	protected JMenu jmenuCuentaContaGastoDepre;
	protected JMenu jmenuDatosCuentaContaGastoDepre;
	protected JMenu jmenuArchivoCuentaContaGastoDepre;
	protected JMenu jmenuAccionesCuentaContaGastoDepre;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaContaGastoDepre;	
	protected GridBagConstraints gridBagConstraintsCuentaContaGastoDepre;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CuentaContaGastoDepreDetalleFormJInternalFrame jInternalFrameDetalleFormCuentaContaGastoDepre;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCuentaContaGastoDepre;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCuentaContaGastoDepre;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected GastoDepreciacionBeanSwingJInternalFrame gastodepreciacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_gastodepreciacion="";
	
	public CuentaContaGastoDepreSessionBean cuentacontagastodepreSessionBean;
		
	
	
	public CuentaContableSessionBean cuentacontableSessionBean;
	public GastoDepreciacionSessionBean gastodepreciacionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CuentaContaGastoDepre> cuentacontagastodepres;		
	public List<CuentaContaGastoDepre> cuentacontagastodepresEliminados;	
	public List<CuentaContaGastoDepre> cuentacontagastodepresAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCuentaContaGastoDepre;		
	protected JButton jButtonAbrirOrderByCuentaContaGastoDepre;
	
	
	//protected JPanel jPanelOrderByCuentaContaGastoDepre;
	//public JScrollPane jScrollPanelOrderByCuentaContaGastoDepre;	
	//protected JButton jButtonCerrarOrderByCuentaContaGastoDepre;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CuentaContaGastoDepreLogic cuentacontagastodepreLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCuentaContaGastoDepre;
	public JScrollPane jScrollPanelDatosEdicionCuentaContaGastoDepre;
	public JScrollPane jScrollPanelDatosGeneralCuentaContaGastoDepre;
    
	
	
	//public JScrollPane jScrollPanelDatosCuentaContaGastoDepreOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCuentaContaGastoDepre;
	//public JScrollPane jScrollPanelImportacionCuentaContaGastoDepre;
	
	
	
	protected JPanel jPanelAccionesCuentaContaGastoDepre;
	
    protected JPanel jPanelPaginacionCuentaContaGastoDepre;
    protected JPanel jPanelParametrosReportesCuentaContaGastoDepre;
	protected JPanel jPanelParametrosReportesAccionesCuentaContaGastoDepre;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CuentaContaGastoDepre;
	protected JPanel jPanelParametrosAuxiliar2CuentaContaGastoDepre;
	protected JPanel jPanelParametrosAuxiliar3CuentaContaGastoDepre;
	protected JPanel jPanelParametrosAuxiliar4CuentaContaGastoDepre;
	//protected JPanel jPanelParametrosAuxiliar5CuentaContaGastoDepre;
	
	
	
	//protected JPanel jPanelReporteDinamicoCuentaContaGastoDepre;
	//protected JPanel jPanelImportacionCuentaContaGastoDepre;
	
	
	public JTable jTableDatosCuentaContaGastoDepre;
	
	
	
	//public JTable jTableDatosCuentaContaGastoDepreOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCuentaContaGastoDepre;
	protected JButton jButtonDuplicarCuentaContaGastoDepre;
	protected JButton jButtonCopiarCuentaContaGastoDepre;
	protected JButton jButtonVerFormCuentaContaGastoDepre;
	protected JButton jButtonNuevoRelacionesCuentaContaGastoDepre;
	protected JButton jButtonModificarCuentaContaGastoDepre;
	
    protected JButton jButtonGuardarCambiosTablaCuentaContaGastoDepre;
	protected JButton jButtonCerrarCuentaContaGastoDepre;
	
	
	protected JButton jButtonRecargarInformacionCuentaContaGastoDepre;
	protected JButton jButtonProcesarInformacionCuentaContaGastoDepre;
	
	
	protected JButton jButtonAnterioresCuentaContaGastoDepre;
	protected JButton jButtonSiguientesCuentaContaGastoDepre;
	protected JButton jButtonNuevoGuardarCambiosCuentaContaGastoDepre;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCuentaContaGastoDepre;
	//protected JButton jButtonCerrarReporteDinamicoCuentaContaGastoDepre;
	//protected JButton jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepre;	
	
	
	
	//protected JButton jButtonAbrirImportacionCuentaContaGastoDepre;
	//protected JButton jButtonGenerarImportacionCuentaContaGastoDepre;
	//protected JButton jButtonCerrarImportacionCuentaContaGastoDepre;
	//protected JFileChooser jFileChooserImportacionCuentaContaGastoDepre;
	//protected File fileImportacionCuentaContaGastoDepre;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaContaGastoDepre;
	protected JButton jButtonDuplicarToolBarCuentaContaGastoDepre;
	protected JButton jButtonNuevoRelacionesToolBarCuentaContaGastoDepre;
	
	
	public JButton jButtonGuardarCambiosToolBarCuentaContaGastoDepre;
	protected JButton jButtonCopiarToolBarCuentaContaGastoDepre;
	protected JButton jButtonVerFormToolBarCuentaContaGastoDepre;
	public JButton jButtonGuardarCambiosTablaToolBarCuentaContaGastoDepre;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaContaGastoDepre;
	protected JButton jButtonCerrarToolBarCuentaContaGastoDepre;
	
	protected JButton jButtonRecargarInformacionToolBarCuentaContaGastoDepre;
	protected JButton jButtonProcesarInformacionToolBarCuentaContaGastoDepre;
	protected JButton jButtonAnterioresToolBarCuentaContaGastoDepre;
	protected JButton jButtonSiguientesToolBarCuentaContaGastoDepre;
	protected JButton jButtonNuevoGuardarCambiosToolBarCuentaContaGastoDepre;
	protected JButton jButtonAbrirOrderByToolBarCuentaContaGastoDepre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaContaGastoDepre;
	protected JMenuItem jMenuItemDuplicarCuentaContaGastoDepre;
	protected JMenuItem jMenuItemNuevoRelacionesCuentaContaGastoDepre;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCuentaContaGastoDepre;
	protected JMenuItem jMenuItemCopiarCuentaContaGastoDepre;
	protected JMenuItem jMenuItemVerFormCuentaContaGastoDepre;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaContaGastoDepre;
	protected JMenuItem jMenuItemCerrarCuentaContaGastoDepre;
	protected JMenuItem jMenuItemDetalleCerrarCuentaContaGastoDepre;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCuentaContaGastoDepre;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaContaGastoDepre;
	
	protected JMenuItem jMenuItemRecargarInformacionCuentaContaGastoDepre;
	protected JMenuItem jMenuItemProcesarInformacionCuentaContaGastoDepre;
	protected JMenuItem jMenuItemAnterioresCuentaContaGastoDepre;
	protected JMenuItem jMenuItemSiguientesCuentaContaGastoDepre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaContaGastoDepre;
	protected JMenuItem jMenuItemAbrirOrderByCuentaContaGastoDepre;
	protected JMenuItem jMenuItemMostrarOcultarCuentaContaGastoDepre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaContaGastoDepre;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCuentaContaGastoDepre;
	protected JCheckBox jCheckBoxSeleccionadosCuentaContaGastoDepre;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCuentaContaGastoDepre;
	protected JCheckBox jCheckBoxConGraficoReporteCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCuentaContaGastoDepre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCuentaContaGastoDepre;
	protected JTextField jTextFieldValorCampoGeneralCuentaContaGastoDepre;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCuentaContaGastoDepre;
	//public JList<Reporte> jListColumnasSelectReporteCuentaContaGastoDepre;
	//public JScrollPane jScrollColumnasSelectReporteCuentaContaGastoDepre;
	
	//public JLabel jLabelRelacionesSelectReporteCuentaContaGastoDepre;
	//public JList<Reporte> jListRelacionesSelectReporteCuentaContaGastoDepre;
	//public JScrollPane jScrollRelacionesSelectReporteCuentaContaGastoDepre;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCuentaContaGastoDepre;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCuentaContaGastoDepre;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCuentaContaGastoDepre;
	//public JLabel jLabelTiposArchivoReporteDinamicoCuentaContaGastoDepre;
	
		
	//public JLabel jLabelArchivoImportacionCuentaContaGastoDepre;	
	//public JLabel jLabelPathArchivoImportacionCuentaContaGastoDepre;
	//protected JTextField jTextFieldPathArchivoImportacionCuentaContaGastoDepre;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCuentaContaGastoDepre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCuentaContaGastoDepre;
	
	//public JLabel jLabelColumnaCategoriaValorCuentaContaGastoDepre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCuentaContaGastoDepre;
	
	//public JLabel jLabelColumnasValoresGraficoCuentaContaGastoDepre;
	//public JList<Reporte> jListColumnasValoresGraficoCuentaContaGastoDepre;
	//public JScrollPane jScrollColumnasValoresGraficoCuentaContaGastoDepre;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCuentaContaGastoDepre;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCuentaContaGastoDepre;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCuentaContaGastoDepre;
	public JPanel jPanelFK_IdCuentaContableCuentaContaGastoDepre;
	public JButton jButtonFK_IdCuentaContableCuentaContaGastoDepre;
	public JPanel jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre;
	public JButton jButtonFK_IdGastoDepreciacionCuentaContaGastoDepre;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepreUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepreBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepreArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaGastoDepre;
	
	public JPanel jPanelid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre;
	public JLabel jLabelid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre;
	public JButton jButtonid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre= new JButtonMe();
	public JButton jButtonid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepreUpdate= new JButtonMe();
	public JButton jButtonid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepreBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CuentaContaGastoDepreJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CuentaContaGastoDepre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaGastoDepreJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContaGastoDepre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaGastoDepreJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContaGastoDepre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaGastoDepreJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaContaGastoDepre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCuentaContaGastoDepre)	{
		this.jButtonRecargarInformacionCuentaContaGastoDepre = jButtonRecargarInformacionCuentaContaGastoDepre;
	}
	
	public JButton getjButtonProcesarInformacionCuentaContaGastoDepre() {
		return this.jButtonProcesarInformacionCuentaContaGastoDepre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaContaGastoDepre)	{
		this.jButtonProcesarInformacionCuentaContaGastoDepre = jButtonProcesarInformacionCuentaContaGastoDepre;
	}
	
	
	public JButton getjButtonRecargarInformacionCuentaContaGastoDepre() {
		return this.jButtonRecargarInformacionCuentaContaGastoDepre;
	}
	
	
	public List<CuentaContaGastoDepre> getcuentacontagastodepres() {
		return this.cuentacontagastodepres;
	}

	public void setcuentacontagastodepres(List<CuentaContaGastoDepre> cuentacontagastodepres) {
		this.cuentacontagastodepres = cuentacontagastodepres;
	}
	
	public List<CuentaContaGastoDepre> getcuentacontagastodepresAux() {
		return this.cuentacontagastodepresAux;
	}

	public void setcuentacontagastodepresAux(List<CuentaContaGastoDepre> cuentacontagastodepresAux) {
		this.cuentacontagastodepresAux = cuentacontagastodepresAux;
	}
	
	public List<CuentaContaGastoDepre> getcuentacontagastodepresEliminados() {
		return this.cuentacontagastodepresEliminados;
	}

	public void setCuentaContaGastoDepresEliminados(List<CuentaContaGastoDepre> cuentacontagastodepresEliminados) {
		this.cuentacontagastodepresEliminados = cuentacontagastodepresEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCuentaContaGastoDepre() {
		return jComboBoxTiposSeleccionarCuentaContaGastoDepre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCuentaContaGastoDepre(
			JComboBox jComboBoxTiposSeleccionarCuentaContaGastoDepre) {
		this.jComboBoxTiposSeleccionarCuentaContaGastoDepre = jComboBoxTiposSeleccionarCuentaContaGastoDepre;
	}
	
	public void setBorderResaltarTiposSeleccionarCuentaContaGastoDepre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCuentaContaGastoDepre.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCuentaContaGastoDepre .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCuentaContaGastoDepre() {
		return jTextFieldValorCampoGeneralCuentaContaGastoDepre;
	}

	public void setjTextFieldValorCampoGeneralCuentaContaGastoDepre(
			JTextField jTextFieldValorCampoGeneralCuentaContaGastoDepre) {
		this.jTextFieldValorCampoGeneralCuentaContaGastoDepre = jTextFieldValorCampoGeneralCuentaContaGastoDepre;
	}

	public void setBorderResaltarValorCampoGeneralCuentaContaGastoDepre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaGastoDepre.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCuentaContaGastoDepre .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCuentaContaGastoDepre() {
		return this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre;
	}

	public void setjCheckBoxSeleccionarTodosCuentaContaGastoDepre(
			JCheckBox jCheckBoxSeleccionarTodosCuentaContaGastoDepre) {
		this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre = jCheckBoxSeleccionarTodosCuentaContaGastoDepre;
	}

	public void setBorderResaltarSeleccionarTodosCuentaContaGastoDepre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaGastoDepre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCuentaContaGastoDepre() {
		return this.jCheckBoxSeleccionadosCuentaContaGastoDepre;
	}

	public void setjCheckBoxSeleccionadosCuentaContaGastoDepre(
			JCheckBox jCheckBoxSeleccionadosCuentaContaGastoDepre) {
		this.jCheckBoxSeleccionadosCuentaContaGastoDepre = jCheckBoxSeleccionadosCuentaContaGastoDepre;
	}
	
	public void setBorderResaltarSeleccionadosCuentaContaGastoDepre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaGastoDepre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCuentaContaGastoDepre .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCuentaContaGastoDepre() {
		return this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCuentaContaGastoDepre(
			JComboBox jComboBoxTiposArchivosReportesCuentaContaGastoDepre) {
		this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre = jComboBoxTiposArchivosReportesCuentaContaGastoDepre;
	}

	public void setBorderResaltarTiposArchivosReportesCuentaContaGastoDepre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaGastoDepre.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCuentaContaGastoDepre() {
		return this.jComboBoxTiposReportesCuentaContaGastoDepre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCuentaContaGastoDepre(
			JComboBox jComboBoxTiposReportesCuentaContaGastoDepre) {
		this.jComboBoxTiposReportesCuentaContaGastoDepre = jComboBoxTiposReportesCuentaContaGastoDepre;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCuentaContaGastoDepre() {
	//	return jComboBoxTiposReportesDinamicoCuentaContaGastoDepre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCuentaContaGastoDepre(
	//		JComboBox jComboBoxTiposReportesDinamicoCuentaContaGastoDepre) {
	//	this.jComboBoxTiposReportesDinamicoCuentaContaGastoDepre = jComboBoxTiposReportesDinamicoCuentaContaGastoDepre;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre() {
	//	return jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre = jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre;
	//}
	
	public void setBorderResaltarTiposReportesCuentaContaGastoDepre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaGastoDepre.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCuentaContaGastoDepre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCuentaContaGastoDepre() {
		return this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCuentaContaGastoDepre(
			JComboBox jComboBoxTiposGraficosReportesCuentaContaGastoDepre) {
		this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre = jComboBoxTiposGraficosReportesCuentaContaGastoDepre;
	}
	
	public void setBorderResaltarTiposGraficosReportesCuentaContaGastoDepre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaGastoDepre.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCuentaContaGastoDepre() {
		return this.jComboBoxTiposPaginacionCuentaContaGastoDepre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCuentaContaGastoDepre(
			JComboBox jComboBoxTiposPaginacionCuentaContaGastoDepre) {
		this.jComboBoxTiposPaginacionCuentaContaGastoDepre = jComboBoxTiposPaginacionCuentaContaGastoDepre;
	}
	
	public void setBorderResaltarTiposPaginacionCuentaContaGastoDepre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaGastoDepre.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCuentaContaGastoDepre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCuentaContaGastoDepre() {
		return this.jComboBoxTiposRelacionesCuentaContaGastoDepre;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaContaGastoDepre() {
		return this.jComboBoxTiposAccionesCuentaContaGastoDepre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaContaGastoDepre(
			JComboBox jComboBoxTiposRelacionesCuentaContaGastoDepre) {
		this.jComboBoxTiposRelacionesCuentaContaGastoDepre = jComboBoxTiposRelacionesCuentaContaGastoDepre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaContaGastoDepre(
			JComboBox jComboBoxTiposAccionesCuentaContaGastoDepre) {
		this.jComboBoxTiposAccionesCuentaContaGastoDepre = jComboBoxTiposAccionesCuentaContaGastoDepre;
	}
	
	public void setBorderResaltarTiposRelacionesCuentaContaGastoDepre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaGastoDepre.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCuentaContaGastoDepre .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCuentaContaGastoDepre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaGastoDepre.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCuentaContaGastoDepre .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCuentaContaGastoDepre() {
	//	return jCheckBoxConGraficoDinamicoCuentaContaGastoDepre;
	//}

	//public void setjCheckBoxConGraficoDinamicoCuentaContaGastoDepre(
	//		JCheckBox jCheckBoxConGraficoDinamicoCuentaContaGastoDepre) {
	//	this.jCheckBoxConGraficoDinamicoCuentaContaGastoDepre = jCheckBoxConGraficoDinamicoCuentaContaGastoDepre;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCuentaContaGastoDepre() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCuentaContaGastoDepre.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCuentaContaGastoDepre .setBorder(borderResaltar);		
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
		this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
		
		this.cuentacontagastodepreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacontagastodepreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CuentaContaGastoDepreJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CuentaContaGastoDepreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaContaGastoDepreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaContaGastoDepreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaContaGastoDepreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Conta Gasto Depre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
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
		
		CuentaContaGastoDepreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CuentaContaGastoDepre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCuentaContaGastoDepre= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"nuevo","nuevo","Nuevo"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"duplicar","duplicar","Duplicar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"copiar","copiar","Copiar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"ver_form","ver_form","Ver"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"recargar","recargar","Recargar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,
							"cerrar","cerrar","Salir"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCuentaContaGastoDepre=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCuentaContaGastoDepre;
			
				this.jButtonProcesarInformacionToolBarCuentaContaGastoDepre=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCuentaContaGastoDepre;
				
		//protected JButton jButtonModificarToolBarCuentaContaGastoDepre;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCuentaContaGastoDepre=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCuentaContaGastoDepre=new JMenuMe("General");
		this.jmenuArchivoCuentaContaGastoDepre=new JMenuMe("Archivo");
		this.jmenuAccionesCuentaContaGastoDepre=new JMenuMe("Acciones");
		this.jmenuDatosCuentaContaGastoDepre=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaContaGastoDepre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaContaGastoDepre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaContaGastoDepre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCuentaContaGastoDepre= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCuentaContaGastoDepre.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCuentaContaGastoDepre,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCuentaContaGastoDepre= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCuentaContaGastoDepre.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCuentaContaGastoDepre,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCuentaContaGastoDepre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaContaGastoDepre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaContaGastoDepre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCuentaContaGastoDepre= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCuentaContaGastoDepre.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCuentaContaGastoDepre,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCuentaContaGastoDepre= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCuentaContaGastoDepre.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCuentaContaGastoDepre,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCuentaContaGastoDepre= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCuentaContaGastoDepre.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCuentaContaGastoDepre,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaContaGastoDepre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaContaGastoDepre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaContaGastoDepre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCuentaContaGastoDepre= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCuentaContaGastoDepre.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCuentaContaGastoDepre,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCuentaContaGastoDepre= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCuentaContaGastoDepre.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCuentaContaGastoDepre,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCuentaContaGastoDepre= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCuentaContaGastoDepre.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCuentaContaGastoDepre,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCuentaContaGastoDepre= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCuentaContaGastoDepre.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCuentaContaGastoDepre,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCuentaContaGastoDepre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCuentaContaGastoDepre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCuentaContaGastoDepre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaContaGastoDepre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaContaGastoDepre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaContaGastoDepre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCuentaContaGastoDepre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCuentaContaGastoDepre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCuentaContaGastoDepre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaContaGastoDepre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaContaGastoDepre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaContaGastoDepre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCuentaContaGastoDepre= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCuentaContaGastoDepre.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCuentaContaGastoDepre,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCuentaContaGastoDepre.add(this.jMenuItemCerrarCuentaContaGastoDepre);
			
			this.jmenuAccionesCuentaContaGastoDepre.add(this.jMenuItemNuevoCuentaContaGastoDepre);
			this.jmenuAccionesCuentaContaGastoDepre.add(this.jMenuItemNuevoGuardarCambiosCuentaContaGastoDepre);
			this.jmenuAccionesCuentaContaGastoDepre.add(this.jMenuItemNuevoRelacionesCuentaContaGastoDepre);
			this.jmenuAccionesCuentaContaGastoDepre.add(this.jMenuItemGuardarCambiosTablaCuentaContaGastoDepre);		
			this.jmenuAccionesCuentaContaGastoDepre.add(this.jMenuItemDuplicarCuentaContaGastoDepre);		
			this.jmenuAccionesCuentaContaGastoDepre.add(this.jMenuItemCopiarCuentaContaGastoDepre);		
			this.jmenuAccionesCuentaContaGastoDepre.add(this.jMenuItemVerFormCuentaContaGastoDepre);		
			
			this.jmenuDatosCuentaContaGastoDepre.add(this.jMenuItemRecargarInformacionCuentaContaGastoDepre);				
			this.jmenuDatosCuentaContaGastoDepre.add(this.jMenuItemAnterioresCuentaContaGastoDepre);				
			this.jmenuDatosCuentaContaGastoDepre.add(this.jMenuItemSiguientesCuentaContaGastoDepre);				
			this.jmenuDatosCuentaContaGastoDepre.add(this.jMenuItemAbrirOrderByCuentaContaGastoDepre);				
			this.jmenuDatosCuentaContaGastoDepre.add(this.jMenuItemMostrarOcultarCuentaContaGastoDepre);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCuentaContaGastoDepre.add(this.jMenuItemGuardarCambiosCuentaContaGastoDepre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCuentaContaGastoDepre.add(this.jmenuArchivoCuentaContaGastoDepre);		
			this.jmenuBarCuentaContaGastoDepre.add(this.jmenuAccionesCuentaContaGastoDepre);		
			this.jmenuBarCuentaContaGastoDepre.add(this.jmenuDatosCuentaContaGastoDepre);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCuentaContaGastoDepre);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCuentaContaGastoDepre() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableCuentaContaGastoDepre=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCuentaContaGastoDepre.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableCuentaContaGastoDepre= new JButtonMe();
		this.jButtonFK_IdCuentaContableCuentaContaGastoDepre.setText("Buscar");
		this.jButtonFK_IdCuentaContableCuentaContaGastoDepre.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCuentaContaGastoDepre,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaGastoDepre= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaGastoDepre.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaGastoDepre.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaGastoDepre.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaGastoDepre.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaGastoDepre.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaGastoDepre.setFocusable(false);

		this.jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre.setToolTipText("Buscar Por Gasto Depreciacion ");
		this.jButtonFK_IdGastoDepreciacionCuentaContaGastoDepre= new JButtonMe();
		this.jButtonFK_IdGastoDepreciacionCuentaContaGastoDepre.setText("Buscar");
		this.jButtonFK_IdGastoDepreciacionCuentaContaGastoDepre.setToolTipText("Buscar Por Gasto Depreciacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGastoDepreciacionCuentaContaGastoDepre,"buscar_button","Buscar Por Gasto Depreciacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGastoDepreciacionCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre = new JLabelMe();
		jLabelid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setText("Gasto Depreciacion :");
		jLabelid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setToolTipText("Gasto Depreciacion");
		jLabelid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre= new JComboBoxMe();
		jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCuentaContaGastoDepre=new JTabbedPane();


		this.jTabbedPaneBusquedasCuentaContaGastoDepre.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCuentaContaGastoDepre.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCuentaContaGastoDepre.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCuentaContaGastoDepre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCuentaContaGastoDepre = new CuentaContaGastoDepreDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuenta Conta Gasto Depre DATOS");
			this.jInternalFrameDetalleFormCuentaContaGastoDepre = new CuentaContaGastoDepreDetalleFormJInternalFrame(jDesktopPane,this.cuentacontagastodepreSessionBean.getConGuardarRelaciones(),this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre = null;//new CuentaContaGastoDepreDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaContaGastoDepre= new GridBagLayout();
		
		
		this.jTableDatosCuentaContaGastoDepre = new JTableMe();      
		
		String sToolTipCuentaContaGastoDepre="";
		sToolTipCuentaContaGastoDepre=CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaContaGastoDepre+="(ActivosFijos.CuentaContaGastoDepre)";
		}
		
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaContaGastoDepre+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCuentaContaGastoDepre.setToolTipText(sToolTipCuentaContaGastoDepre);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCuentaContaGastoDepre);
		this.jTableDatosCuentaContaGastoDepre.setAutoCreateRowSorter(true);
		this.jTableDatosCuentaContaGastoDepre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCuentaContaGastoDepre.setRowSelectionAllowed(true);
		this.jTableDatosCuentaContaGastoDepre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCuentaContaGastoDepre = new JButtonMe();
		this.jButtonDuplicarCuentaContaGastoDepre = new JButtonMe();
		this.jButtonCopiarCuentaContaGastoDepre = new JButtonMe();
		this.jButtonVerFormCuentaContaGastoDepre = new JButtonMe();
		this.jButtonNuevoRelacionesCuentaContaGastoDepre = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCuentaContaGastoDepre = new JButtonMe();
		this.jButtonCerrarCuentaContaGastoDepre = new JButtonMe();
		
		this.jScrollPanelDatosCuentaContaGastoDepre = new JScrollPane();   
        this.jScrollPanelDatosGeneralCuentaContaGastoDepre = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Conta Gasto Depre";
		
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Gasto Depres" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaContaGastoDepre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaContaGastoDepre.setToolTipText("Acciones");
        this.jPanelAccionesCuentaContaGastoDepre.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCuentaContaGastoDepre=new ReporteDinamicoJInternalFrame(CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCuentaContaGastoDepre();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCuentaContaGastoDepre=new ImportacionJInternalFrame(CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCuentaContaGastoDepre();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCuentaContaGastoDepre = new JButtonMe();
		
		this.jButtonAbrirOrderByCuentaContaGastoDepre.setText("Orden");
		this.jButtonAbrirOrderByCuentaContaGastoDepre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaContaGastoDepre,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaContaGastoDepre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContaGastoDepre,false,this);
			
			//this.cargarOrderByCuentaContaGastoDepre(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaContaGastoDepre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContaGastoDepre,true,this);
			
			//this.cargarOrderByCuentaContaGastoDepre(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCuentaContaGastoDepre.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosCuentaContaGastoDepre.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosCuentaContaGastoDepre.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosCuentaContaGastoDepre.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaContaGastoDepre.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaContaGastoDepre.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCuentaContaGastoDepre.setText("Nuevo");
		this.jButtonDuplicarCuentaContaGastoDepre.setText("Duplicar");
		this.jButtonCopiarCuentaContaGastoDepre.setText("Copiar");
		this.jButtonVerFormCuentaContaGastoDepre.setText("Ver");
		this.jButtonNuevoRelacionesCuentaContaGastoDepre.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.setText("Guardar");
		this.jButtonCerrarCuentaContaGastoDepre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaContaGastoDepre,"nuevo_button","Nuevo",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCuentaContaGastoDepre,"duplicar_button","Duplicar",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCuentaContaGastoDepre,"copiar_button","Copiar",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCuentaContaGastoDepre,"ver_form","Ver",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCuentaContaGastoDepre,"nuevorelaciones_button","Nuevo Rel",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaContaGastoDepre,"guardarcambiostabla_button","Guardar",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaContaGastoDepre,"cerrar_button","Salir",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCuentaContaGastoDepre.setToolTipText("Nuevo"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCuentaContaGastoDepre.setToolTipText("Duplicar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCuentaContaGastoDepre.setToolTipText("Copiar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCuentaContaGastoDepre.setToolTipText("Ver"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCuentaContaGastoDepre.setToolTipText("Nuevo Rel"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.setToolTipText("Guardar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaContaGastoDepre.setToolTipText("Salir"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaContaGastoDepre";
		inputMap = this.jButtonNuevoCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaContaGastoDepre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaContaGastoDepre"));
		
		//DUPLICAR
		sMapKey = "DuplicarCuentaContaGastoDepre";
		inputMap = this.jButtonDuplicarCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCuentaContaGastoDepre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCuentaContaGastoDepre"));
		
		//COPIAR
		sMapKey = "CopiarCuentaContaGastoDepre";
		inputMap = this.jButtonCopiarCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCuentaContaGastoDepre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCuentaContaGastoDepre"));
		
		//VEr FORM
		sMapKey = "VerFormCuentaContaGastoDepre";
		inputMap = this.jButtonVerFormCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCuentaContaGastoDepre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCuentaContaGastoDepre"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCuentaContaGastoDepre";
		inputMap = this.jButtonNuevoRelacionesCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCuentaContaGastoDepre"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCuentaContaGastoDepre";
		inputMap = this.jButtonModificarCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCuentaContaGastoDepre"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCuentaContaGastoDepre";
		inputMap = this.jButtonCerrarCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaContaGastoDepre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaContaGastoDepre";
		inputMap = this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaContaGastoDepre"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CuentaContaGastoDepre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CuentaContaGastoDepre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CuentaContaGastoDepre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CuentaContaGastoDepre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CuentaContaGastoDepre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCuentaContaGastoDepre.setName("jPanelParametrosReportesCuentaContaGastoDepre"); 
		
		this.jPanelParametrosReportesAccionesCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCuentaContaGastoDepre.setName("jPanelParametrosReportesAccionesCuentaContaGastoDepre"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCuentaContaGastoDepre = new JButtonMe();
		this.jButtonRecargarInformacionCuentaContaGastoDepre.setText("Recargar");
		this.jButtonRecargarInformacionCuentaContaGastoDepre.setToolTipText("Recargar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCuentaContaGastoDepre,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCuentaContaGastoDepre = new JButtonMe();
		this.jButtonProcesarInformacionCuentaContaGastoDepre.setText("Procesar");
		this.jButtonProcesarInformacionCuentaContaGastoDepre.setToolTipText("Procesar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCuentaContaGastoDepre.setVisible(false);
			
		this.jButtonProcesarInformacionCuentaContaGastoDepre.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaContaGastoDepre.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaContaGastoDepre.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCuentaContaGastoDepre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre.setText("TIPO");       
		this.jComboBoxTiposReportesCuentaContaGastoDepre.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCuentaContaGastoDepre = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCuentaContaGastoDepre.setText("Paginacion");
		this.jComboBoxTiposPaginacionCuentaContaGastoDepre.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCuentaContaGastoDepre = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCuentaContaGastoDepre.setText("Accion");
		this.jComboBoxTiposRelacionesCuentaContaGastoDepre.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCuentaContaGastoDepre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaContaGastoDepre.setText("Accion");
		this.jComboBoxTiposAccionesCuentaContaGastoDepre.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCuentaContaGastoDepre = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.setText("Accion");
		this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCuentaContaGastoDepre=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCuentaContaGastoDepre.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaContaGastoDepre.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaContaGastoDepre.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCuentaContaGastoDepre = new JLabelMe();
		
		this.jLabelAccionesCuentaContaGastoDepre.setText("Acciones");		
		this.jLabelAccionesCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCuentaContaGastoDepre = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCuentaContaGastoDepre.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCuentaContaGastoDepre.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCuentaContaGastoDepre = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCuentaContaGastoDepre.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCuentaContaGastoDepre.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCuentaContaGastoDepre = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCuentaContaGastoDepre.setText("Graf.");
		this.jCheckBoxConGraficoReporteCuentaContaGastoDepre.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCuentaContaGastoDepre = new JButtonMe();
		//this.jButtonAnterioresCuentaContaGastoDepre.setText("<<");
        this.jButtonAnterioresCuentaContaGastoDepre.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCuentaContaGastoDepre,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCuentaContaGastoDepre = new JButtonMe();
		//this.jButtonSiguientesCuentaContaGastoDepre.setText(">>");
        this.jButtonSiguientesCuentaContaGastoDepre.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCuentaContaGastoDepre,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCuentaContaGastoDepre = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCuentaContaGastoDepre.setText("Nue");
        this.jButtonNuevoGuardarCambiosCuentaContaGastoDepre.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCuentaContaGastoDepre,"nuevoguardarcambios_button","Nue",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCuentaContaGastoDepre";
		inputMap = this.jButtonNuevoGuardarCambiosCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCuentaContaGastoDepre"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCuentaContaGastoDepre";
		inputMap = this.jButtonRecargarInformacionCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCuentaContaGastoDepre"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCuentaContaGastoDepre";
		inputMap = this.jButtonSiguientesCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCuentaContaGastoDepre"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCuentaContaGastoDepre";
		inputMap = this.jButtonAnterioresCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCuentaContaGastoDepre"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCuentaContaGastoDepre();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCuentaContaGastoDepre.setMinimumSize(new Dimension(this.getWidth(),CuentaContaGastoDepreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContaGastoDepreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaContaGastoDepre.setMaximumSize(new Dimension(this.getWidth(),CuentaContaGastoDepreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContaGastoDepreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaContaGastoDepre.setPreferredSize(new Dimension(this.getWidth(),CuentaContaGastoDepreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContaGastoDepreBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCuentaContaGastoDepre = new GridBagLayout();

			this.jPanelPaginacionCuentaContaGastoDepre.setLayout(gridaBagLayoutPaginacionCuentaContaGastoDepre);						
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCuentaContaGastoDepre.add(this.jButtonAnterioresCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
					
						
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
			
			this.jPanelPaginacionCuentaContaGastoDepre.add(this.jButtonNuevoGuardarCambiosCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
						
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
			this.jPanelPaginacionCuentaContaGastoDepre.add(this.jButtonSiguientesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = 1;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContaGastoDepre.add(this.jButtonNuevoCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
						
			
			
			if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
				this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaContaGastoDepre.gridy = 1;
				this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCuentaContaGastoDepre.add(this.jButtonGuardarCambiosTablaCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			}
			
			
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = 1;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContaGastoDepre.add(this.jButtonDuplicarCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = 1;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContaGastoDepre.add(this.jButtonCopiarCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = 1;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContaGastoDepre.add(this.jButtonVerFormCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = 1;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCuentaContaGastoDepre.add(this.jButtonCerrarCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		
		
		
		this.jButtonRecargarInformacionCuentaContaGastoDepre.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaContaGastoDepre.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaContaGastoDepre.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCuentaContaGastoDepre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaContaGastoDepre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaContaGastoDepre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCuentaContaGastoDepre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaContaGastoDepre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaContaGastoDepre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCuentaContaGastoDepre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaContaGastoDepre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaContaGastoDepre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCuentaContaGastoDepre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContaGastoDepre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContaGastoDepre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCuentaContaGastoDepre.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaContaGastoDepre.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaContaGastoDepre.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCuentaContaGastoDepre.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaContaGastoDepre.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaContaGastoDepre.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCuentaContaGastoDepre.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaContaGastoDepre.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaContaGastoDepre.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCuentaContaGastoDepre = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCuentaContaGastoDepre = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CuentaContaGastoDepre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CuentaContaGastoDepre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CuentaContaGastoDepre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CuentaContaGastoDepre = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCuentaContaGastoDepre.setLayout(gridaBagParametrosReportesCuentaContaGastoDepre);
			this.jPanelParametrosReportesAccionesCuentaContaGastoDepre.setLayout(gridaBagParametrosReportesAccionesCuentaContaGastoDepre);
			
			
			this.jPanelParametrosAuxiliar1CuentaContaGastoDepre.setLayout(gridaBagParametrosAuxiliar1CuentaContaGastoDepre);
			this.jPanelParametrosAuxiliar2CuentaContaGastoDepre.setLayout(gridaBagParametrosAuxiliar2CuentaContaGastoDepre);
			this.jPanelParametrosAuxiliar3CuentaContaGastoDepre.setLayout(gridaBagParametrosAuxiliar3CuentaContaGastoDepre);
			this.jPanelParametrosAuxiliar4CuentaContaGastoDepre.setLayout(gridaBagParametrosAuxiliar4CuentaContaGastoDepre);
			//this.jPanelParametrosAuxiliar5CuentaContaGastoDepre.setLayout(gridaBagParametrosAuxiliar2CuentaContaGastoDepre);			
			
			
			
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jButtonRecargarInformacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContaGastoDepre.add(this.jComboBoxTiposPaginacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContaGastoDepre.add(this.jCheckBoxConAltoMaximoTablaCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContaGastoDepre.add(this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jPanelParametrosAuxiliar1CuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CuentaContaGastoDepre.add(this.jComboBoxTiposReportesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jPanelParametrosAuxiliar4CuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jComboBoxTiposReportesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jCheckBoxGenerarReporteCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jPanelParametrosAuxiliar2CuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jLabelAccionesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
				this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jButtonAbrirOrderByCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jComboBoxTiposSeleccionarCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);			
			
			
			/*
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaContaGastoDepre.add(this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);															
				
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaContaGastoDepre.add(this.jCheckBoxSeleccionadosCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jPanelParametrosAuxiliar3CuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jComboBoxTiposAccionesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
	
				
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContaGastoDepre.add(this.jTextFieldValorCampoGeneralCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCuentaContaGastoDepre = new GridBagLayout();

			this.jScrollPanelDatosCuentaContaGastoDepre.setLayout(gridaBagLayoutDatosCuentaContaGastoDepre);
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
			
			this.jScrollPanelDatosCuentaContaGastoDepre.add(this.jTableDatosCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCuentaContaGastoDepre.setViewportView(this.jTableDatosCuentaContaGastoDepre);
		this.jTableDatosCuentaContaGastoDepre.setFillsViewportHeight(true);
		this.jTableDatosCuentaContaGastoDepre.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCuentaContaGastoDepre= new GridBagLayout();
		this.jPanelAccionesCuentaContaGastoDepre.setLayout(gridaBagLayoutAccionesCuentaContaGastoDepre);
		
		
		/*	
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
			
		this.jPanelAccionesCuentaContaGastoDepre.add(this.jButtonNuevoCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableCuentaContaGastoDepre= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCuentaContaGastoDepre.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaContaGastoDepre.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaContaGastoDepre.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCuentaContaGastoDepre.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCuentaContaGastoDepre.setLayout(gridaBagLayoutFK_IdCuentaContableCuentaContaGastoDepre);

		gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
		jPanelFK_IdCuentaContableCuentaContaGastoDepre.add(jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre, gridBagConstraintsCuentaContaGastoDepre);

		gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		gridBagConstraintsCuentaContaGastoDepre.gridx = 1;
		jPanelFK_IdCuentaContableCuentaContaGastoDepre.add(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre, gridBagConstraintsCuentaContaGastoDepre);


		gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.NONE;
		gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
		jPanelFK_IdCuentaContableCuentaContaGastoDepre.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaGastoDepre, gridBagConstraintsCuentaContaGastoDepre);

		gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaGastoDepre.gridy = 1;
		gridBagConstraintsCuentaContaGastoDepre.gridx =1;
		jPanelFK_IdCuentaContableCuentaContaGastoDepre.add(jButtonFK_IdCuentaContableCuentaContaGastoDepre, gridBagConstraintsCuentaContaGastoDepre);

		jTabbedPaneBusquedasCuentaContaGastoDepre.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableCuentaContaGastoDepre);
		jTabbedPaneBusquedasCuentaContaGastoDepre.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdGastoDepreciacionCuentaContaGastoDepre= new GridBagLayout();
		gridaBagLayoutFK_IdGastoDepreciacionCuentaContaGastoDepre.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGastoDepreciacionCuentaContaGastoDepre.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGastoDepreciacionCuentaContaGastoDepre.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGastoDepreciacionCuentaContaGastoDepre.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre.setLayout(gridaBagLayoutFK_IdGastoDepreciacionCuentaContaGastoDepre);

		gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
		jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre.add(jLabelid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre, gridBagConstraintsCuentaContaGastoDepre);

		gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		gridBagConstraintsCuentaContaGastoDepre.gridx = 1;
		jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre.add(jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre, gridBagConstraintsCuentaContaGastoDepre);

		gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaGastoDepre.gridy = 1;
		gridBagConstraintsCuentaContaGastoDepre.gridx =1;
		jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre.add(jButtonFK_IdGastoDepreciacionCuentaContaGastoDepre, gridBagConstraintsCuentaContaGastoDepre);

		jTabbedPaneBusquedasCuentaContaGastoDepre.addTab("2.-Por Gasto Depreciacion ", jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre);
		jTabbedPaneBusquedasCuentaContaGastoDepre.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaContaGastoDepre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaContaGastoDepre);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();						
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;		
			//this.gridBagConstraintsCuentaContaGastoDepre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;		
		//this.gridBagConstraintsCuentaContaGastoDepre.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCuentaContaGastoDepre);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;		
			this.gridBagConstraintsCuentaContaGastoDepre.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);								
		
		
		/*
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		*/		
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx =0;
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaContaGastoDepre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
				
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CuentaContaGastoDepreJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCuentaContaGastoDepre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaContaGastoDepre = new GridBagLayout();
			this.jPanelBusquedasParametrosCuentaContaGastoDepre.setLayout(gridaBagLayoutBusquedasParametrosCuentaContaGastoDepre);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCuentaContaGastoDepre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			
			
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		
			
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCuentaContaGastoDepre;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCuentaContaGastoDepre() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCuentaContaGastoDepre = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCuentaContaGastoDepre.setName("jPanelReporteDinamicoCuentaContaGastoDepre"); 
		
		this.jPanelReporteDinamicoCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCuentaContaGastoDepre.setLayout(gridaBagLayoutReporteDinamicoCuentaContaGastoDepre);
		
		
		this.jInternalFrameReporteDinamicoCuentaContaGastoDepre= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCuentaContaGastoDepre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaContaGastoDepre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setResizable(true);
	    this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setClosable(true);
	    this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Gasto Depres"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCuentaContaGastoDepre = new JLabelMe();

		this.jLabelColumnasSelectReporteCuentaContaGastoDepre.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaContaGastoDepre.add(this.jLabelColumnasSelectReporteCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCuentaContaGastoDepre = new JList<Reporte>();
		this.jListColumnasSelectReporteCuentaContaGastoDepre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCuentaContaGastoDepre.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCuentaContaGastoDepre.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaContaGastoDepre.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaContaGastoDepre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCuentaContaGastoDepre=new JScrollPane(this.jListColumnasSelectReporteCuentaContaGastoDepre);
			
			this.jScrollColumnasSelectReporteCuentaContaGastoDepre.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaContaGastoDepre.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaContaGastoDepre.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaContaGastoDepre.add(this.jListColumnasSelectReporteCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		this.jPanelReporteDinamicoCuentaContaGastoDepre.add(this.jScrollColumnasSelectReporteCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCuentaContaGastoDepre = new JLabelMe();

		this.jLabelRelacionesSelectReporteCuentaContaGastoDepre.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCuentaContaGastoDepre = new JList<Reporte>();
		this.jListRelacionesSelectReporteCuentaContaGastoDepre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCuentaContaGastoDepre.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCuentaContaGastoDepre.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaContaGastoDepre.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaContaGastoDepre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCuentaContaGastoDepre=new JScrollPane(this.jListRelacionesSelectReporteCuentaContaGastoDepre);
			
			this.jScrollRelacionesSelectReporteCuentaContaGastoDepre.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaContaGastoDepre.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaContaGastoDepre.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCuentaContaGastoDepre = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCuentaContaGastoDepre = new JComboBoxMe();
		this.jListColumnasValoresGraficoCuentaContaGastoDepre = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCuentaContaGastoDepre = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCuentaContaGastoDepre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCuentaContaGastoDepre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaContaGastoDepre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaContaGastoDepre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCuentaContaGastoDepre = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCuentaContaGastoDepre.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaContaGastoDepre.add(this.jLabelGenerarExcelReporteDinamicoCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepre = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepre.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepre,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepre.setToolTipText("Generar EXCEL"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCuentaContaGastoDepre.add(this.jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContaGastoDepre.add(this.jComboBoxTiposReportesDinamicoCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCuentaContaGastoDepre = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCuentaContaGastoDepre.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaContaGastoDepre.add(this.jLabelTiposArchivoReporteDinamicoCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContaGastoDepre.add(this.jComboBoxTiposArchivosReportesDinamicoCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCuentaContaGastoDepre = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCuentaContaGastoDepre.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCuentaContaGastoDepre,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCuentaContaGastoDepre.setToolTipText("Generar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContaGastoDepre.add(this.jButtonGenerarReporteDinamicoCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCuentaContaGastoDepre = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCuentaContaGastoDepre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCuentaContaGastoDepre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCuentaContaGastoDepre.setToolTipText("Cancelar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContaGastoDepre.add(this.jButtonCerrarReporteDinamicoCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCuentaContaGastoDepre = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCuentaContaGastoDepre= new JScrollPane(jPanelReporteDinamicoCuentaContaGastoDepre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Gasto Depres"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCuentaContaGastoDepre);
		this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getContentPane().add(this.jScrollPanelReporteDinamicoCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCuentaContaGastoDepre() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCuentaContaGastoDepre = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCuentaContaGastoDepre.setName("jPanelImportacionCuentaContaGastoDepre"); 
		
		this.jPanelImportacionCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCuentaContaGastoDepre.setLayout(gridaBagLayoutImportacionCuentaContaGastoDepre);
		
		
		this.jInternalFrameImportacionCuentaContaGastoDepre= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCuentaContaGastoDepre= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCuentaContaGastoDepre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaContaGastoDepre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCuentaContaGastoDepre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaContaGastoDepre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaContaGastoDepre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCuentaContaGastoDepre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaContaGastoDepre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaContaGastoDepre.setResizable(true);
	    this.jInternalFrameImportacionCuentaContaGastoDepre.setClosable(true);
	    this.jInternalFrameImportacionCuentaContaGastoDepre.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCuentaContaGastoDepre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaContaGastoDepre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaContaGastoDepre.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCuentaContaGastoDepre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaContaGastoDepre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaContaGastoDepre.setResizable(true);
	    this.jInternalFrameImportacionCuentaContaGastoDepre.setClosable(true);
	    this.jInternalFrameImportacionCuentaContaGastoDepre.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Gasto Depres"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCuentaContaGastoDepre = new JLabelMe();

		this.jLabelArchivoImportacionCuentaContaGastoDepre.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaContaGastoDepre.add(this.jLabelArchivoImportacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCuentaContaGastoDepre = new JFileChooser();		
		this.jFileChooserImportacionCuentaContaGastoDepre.setToolTipText("ESCOGER ARCHIVO"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCuentaContaGastoDepre = new JButtonMe();
		this.jButtonAbrirImportacionCuentaContaGastoDepre.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCuentaContaGastoDepre,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCuentaContaGastoDepre.setToolTipText("Generar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContaGastoDepre.add(this.jButtonAbrirImportacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCuentaContaGastoDepre = new JLabelMe();

		this.jLabelPathArchivoImportacionCuentaContaGastoDepre.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaContaGastoDepre.add(this.jLabelPathArchivoImportacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCuentaContaGastoDepre=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCuentaContaGastoDepre.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaContaGastoDepre.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaContaGastoDepre.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContaGastoDepre.add(this.jTextFieldPathArchivoImportacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCuentaContaGastoDepre = new JButtonMe();
		this.jButtonGenerarImportacionCuentaContaGastoDepre.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCuentaContaGastoDepre,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCuentaContaGastoDepre.setToolTipText("Generar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContaGastoDepre.add(this.jButtonGenerarImportacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCuentaContaGastoDepre = new JButtonMe();
		this.jButtonCerrarImportacionCuentaContaGastoDepre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCuentaContaGastoDepre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCuentaContaGastoDepre.setToolTipText("Cancelar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContaGastoDepre.add(this.jButtonCerrarImportacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCuentaContaGastoDepre = new GridBagLayout();
		
		this.jScrollPanelImportacionCuentaContaGastoDepre= new JScrollPane(jPanelImportacionCuentaContaGastoDepre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy =iPosYImportacion;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx =iPosXImportacion;
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCuentaContaGastoDepre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCuentaContaGastoDepre.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCuentaContaGastoDepre);
		this.jInternalFrameImportacionCuentaContaGastoDepre.getContentPane().add(this.jScrollPanelImportacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCuentaContaGastoDepre(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCuentaContaGastoDepre = new JButtonMe();
			this.jButtonAbrirOrderByCuentaContaGastoDepre.setText("Orden");
			this.jButtonAbrirOrderByCuentaContaGastoDepre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaContaGastoDepre,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCuentaContaGastoDepre";
			inputMap = this.jButtonAbrirOrderByCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCuentaContaGastoDepre"));
		
		
			GridBagLayout gridaBagLayoutOrderByCuentaContaGastoDepre = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCuentaContaGastoDepre.setName("jPanelOrderByCuentaContaGastoDepre"); 
			
			this.jPanelOrderByCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCuentaContaGastoDepre.setLayout(gridaBagLayoutOrderByCuentaContaGastoDepre);
			
			
			this.jTableDatosCuentaContaGastoDepreOrderBy = new JTableMe();        
			this.jTableDatosCuentaContaGastoDepreOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCuentaContaGastoDepreOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCuentaContaGastoDepreOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCuentaContaGastoDepreOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCuentaContaGastoDepreOrderBy.setViewportView(this.jTableDatosCuentaContaGastoDepreOrderBy);
			this.jTableDatosCuentaContaGastoDepreOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCuentaContaGastoDepreOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCuentaContaGastoDepre= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCuentaContaGastoDepre= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCuentaContaGastoDepre = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCuentaContaGastoDepre= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCuentaContaGastoDepre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCuentaContaGastoDepre.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCuentaContaGastoDepre.setTitle("Orden");
			this.jInternalFrameOrderByCuentaContaGastoDepre.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCuentaContaGastoDepre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCuentaContaGastoDepre.setResizable(true);
			this.jInternalFrameOrderByCuentaContaGastoDepre.setClosable(true);
			this.jInternalFrameOrderByCuentaContaGastoDepre.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Gasto Depres"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCuentaContaGastoDepre.ipady =150;
				
			this.jPanelOrderByCuentaContaGastoDepre.add(jScrollPanelDatosCuentaContaGastoDepreOrderBy, this.gridBagConstraintsCuentaContaGastoDepre);//this.jTableDatosCuentaContaGastoDepreTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCuentaContaGastoDepre = new JButtonMe();
			this.jButtonCerrarOrderByCuentaContaGastoDepre.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCuentaContaGastoDepre,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCuentaContaGastoDepre.setToolTipText("Cancelar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCuentaContaGastoDepre.add(this.jButtonCerrarOrderByCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCuentaContaGastoDepre = new GridBagLayout();
			
			this.jScrollPanelOrderByCuentaContaGastoDepre= new JScrollPane(jPanelOrderByCuentaContaGastoDepre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.gridy =iPosYOrderBy;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCuentaContaGastoDepre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCuentaContaGastoDepre.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCuentaContaGastoDepre);
			
			this.jInternalFrameOrderByCuentaContaGastoDepre.getContentPane().add(this.jScrollPanelOrderByCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);			
		
		} else {
			this.jButtonAbrirOrderByCuentaContaGastoDepre = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cuentacontagastodepreSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCuentaContaGastoDepre.getRowHeight();//CuentaContaGastoDepreConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CuentaContaGastoDepreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaContaGastoDepre.isSelected()) {
					iHeightTable=CuentaContaGastoDepreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaContaGastoDepreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaContaGastoDepreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CuentaContaGastoDepreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaContaGastoDepre.isSelected()) {
					iHeightTable=CuentaContaGastoDepreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaContaGastoDepreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaContaGastoDepreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCuentaContaGastoDepre!=null && this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy()!=null) {
			//if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCuentaContaGastoDepre.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCuentaContaGastoDepre.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCuentaContaGastoDepre.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cuentacontagastodepreLogic.getCuentaContaGastoDepres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacontagastodepres.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CuentaContaGastoDepre> TraerCuentaContaGastoDepreBeans(List<CuentaContaGastoDepre> cuentacontagastodepres,ArrayList<Classe> classes)throws Exception {
		try {
			for(CuentaContaGastoDepre cuentacontagastodepre:cuentacontagastodepres) {
					
				if(!(CuentaContaGastoDepreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CuentaContaGastoDepreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cuentacontagastodepre.setsDetalleGeneralEntityReporte(CuentaContaGastoDepreConstantesFunciones.getCuentaContaGastoDepreDescripcion(cuentacontagastodepre));
										
						
					
						
					
				} else  {
							
					//cuentacontagastodepre.setsDetalleGeneralEntityReporte(cuentacontagastodepre.getsDetalleGeneralEntityReporte());
										
				}
				
				//cuentacontagastodeprebeans.add(cuentacontagastodeprebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cuentacontagastodepres;
    }
	//PARA REPORTES FIN
}
