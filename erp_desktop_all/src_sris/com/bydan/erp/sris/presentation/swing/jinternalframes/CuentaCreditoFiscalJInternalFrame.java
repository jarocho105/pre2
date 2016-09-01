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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.CuentaCreditoFiscalConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class CuentaCreditoFiscalJInternalFrame extends CuentaCreditoFiscalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCuentaCreditoFiscal;
	
	protected JMenuBar jmenuBarCuentaCreditoFiscal;
	
	protected JMenu jmenuCuentaCreditoFiscal;
	protected JMenu jmenuDatosCuentaCreditoFiscal;
	protected JMenu jmenuArchivoCuentaCreditoFiscal;
	protected JMenu jmenuAccionesCuentaCreditoFiscal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaCreditoFiscal;	
	protected GridBagConstraints gridBagConstraintsCuentaCreditoFiscal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CuentaCreditoFiscalDetalleFormJInternalFrame jInternalFrameDetalleFormCuentaCreditoFiscal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCuentaCreditoFiscal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCuentaCreditoFiscal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public CuentaCreditoFiscalSessionBean cuentacreditofiscalSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CuentaCreditoFiscal> cuentacreditofiscals;		
	public List<CuentaCreditoFiscal> cuentacreditofiscalsEliminados;	
	public List<CuentaCreditoFiscal> cuentacreditofiscalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCuentaCreditoFiscal;		
	protected JButton jButtonAbrirOrderByCuentaCreditoFiscal;
	
	
	//protected JPanel jPanelOrderByCuentaCreditoFiscal;
	//public JScrollPane jScrollPanelOrderByCuentaCreditoFiscal;	
	//protected JButton jButtonCerrarOrderByCuentaCreditoFiscal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CuentaCreditoFiscalLogic cuentacreditofiscalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCuentaCreditoFiscal;
	public JScrollPane jScrollPanelDatosEdicionCuentaCreditoFiscal;
	public JScrollPane jScrollPanelDatosGeneralCuentaCreditoFiscal;
    
	
	
	//public JScrollPane jScrollPanelDatosCuentaCreditoFiscalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCuentaCreditoFiscal;
	//public JScrollPane jScrollPanelImportacionCuentaCreditoFiscal;
	
	
	
	protected JPanel jPanelAccionesCuentaCreditoFiscal;
	
    protected JPanel jPanelPaginacionCuentaCreditoFiscal;
    protected JPanel jPanelParametrosReportesCuentaCreditoFiscal;
	protected JPanel jPanelParametrosReportesAccionesCuentaCreditoFiscal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CuentaCreditoFiscal;
	protected JPanel jPanelParametrosAuxiliar2CuentaCreditoFiscal;
	protected JPanel jPanelParametrosAuxiliar3CuentaCreditoFiscal;
	protected JPanel jPanelParametrosAuxiliar4CuentaCreditoFiscal;
	//protected JPanel jPanelParametrosAuxiliar5CuentaCreditoFiscal;
	
	
	
	//protected JPanel jPanelReporteDinamicoCuentaCreditoFiscal;
	//protected JPanel jPanelImportacionCuentaCreditoFiscal;
	
	
	public JTable jTableDatosCuentaCreditoFiscal;
	
	
	
	//public JTable jTableDatosCuentaCreditoFiscalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCuentaCreditoFiscal;
	protected JButton jButtonDuplicarCuentaCreditoFiscal;
	protected JButton jButtonCopiarCuentaCreditoFiscal;
	protected JButton jButtonVerFormCuentaCreditoFiscal;
	protected JButton jButtonNuevoRelacionesCuentaCreditoFiscal;
	protected JButton jButtonModificarCuentaCreditoFiscal;
	
    protected JButton jButtonGuardarCambiosTablaCuentaCreditoFiscal;
	protected JButton jButtonCerrarCuentaCreditoFiscal;
	
	
	protected JButton jButtonRecargarInformacionCuentaCreditoFiscal;
	protected JButton jButtonProcesarInformacionCuentaCreditoFiscal;
	
	
	protected JButton jButtonAnterioresCuentaCreditoFiscal;
	protected JButton jButtonSiguientesCuentaCreditoFiscal;
	protected JButton jButtonNuevoGuardarCambiosCuentaCreditoFiscal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCuentaCreditoFiscal;
	//protected JButton jButtonCerrarReporteDinamicoCuentaCreditoFiscal;
	//protected JButton jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscal;	
	
	
	
	//protected JButton jButtonAbrirImportacionCuentaCreditoFiscal;
	//protected JButton jButtonGenerarImportacionCuentaCreditoFiscal;
	//protected JButton jButtonCerrarImportacionCuentaCreditoFiscal;
	//protected JFileChooser jFileChooserImportacionCuentaCreditoFiscal;
	//protected File fileImportacionCuentaCreditoFiscal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaCreditoFiscal;
	protected JButton jButtonDuplicarToolBarCuentaCreditoFiscal;
	protected JButton jButtonNuevoRelacionesToolBarCuentaCreditoFiscal;
	
	
	public JButton jButtonGuardarCambiosToolBarCuentaCreditoFiscal;
	protected JButton jButtonCopiarToolBarCuentaCreditoFiscal;
	protected JButton jButtonVerFormToolBarCuentaCreditoFiscal;
	public JButton jButtonGuardarCambiosTablaToolBarCuentaCreditoFiscal;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaCreditoFiscal;
	protected JButton jButtonCerrarToolBarCuentaCreditoFiscal;
	
	protected JButton jButtonRecargarInformacionToolBarCuentaCreditoFiscal;
	protected JButton jButtonProcesarInformacionToolBarCuentaCreditoFiscal;
	protected JButton jButtonAnterioresToolBarCuentaCreditoFiscal;
	protected JButton jButtonSiguientesToolBarCuentaCreditoFiscal;
	protected JButton jButtonNuevoGuardarCambiosToolBarCuentaCreditoFiscal;
	protected JButton jButtonAbrirOrderByToolBarCuentaCreditoFiscal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaCreditoFiscal;
	protected JMenuItem jMenuItemDuplicarCuentaCreditoFiscal;
	protected JMenuItem jMenuItemNuevoRelacionesCuentaCreditoFiscal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCuentaCreditoFiscal;
	protected JMenuItem jMenuItemCopiarCuentaCreditoFiscal;
	protected JMenuItem jMenuItemVerFormCuentaCreditoFiscal;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaCreditoFiscal;
	protected JMenuItem jMenuItemCerrarCuentaCreditoFiscal;
	protected JMenuItem jMenuItemDetalleCerrarCuentaCreditoFiscal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCuentaCreditoFiscal;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaCreditoFiscal;
	
	protected JMenuItem jMenuItemRecargarInformacionCuentaCreditoFiscal;
	protected JMenuItem jMenuItemProcesarInformacionCuentaCreditoFiscal;
	protected JMenuItem jMenuItemAnterioresCuentaCreditoFiscal;
	protected JMenuItem jMenuItemSiguientesCuentaCreditoFiscal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaCreditoFiscal;
	protected JMenuItem jMenuItemAbrirOrderByCuentaCreditoFiscal;
	protected JMenuItem jMenuItemMostrarOcultarCuentaCreditoFiscal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaCreditoFiscal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCuentaCreditoFiscal;
	protected JCheckBox jCheckBoxSeleccionadosCuentaCreditoFiscal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCuentaCreditoFiscal;
	protected JCheckBox jCheckBoxConGraficoReporteCuentaCreditoFiscal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCuentaCreditoFiscal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCuentaCreditoFiscal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCuentaCreditoFiscal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCuentaCreditoFiscal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCuentaCreditoFiscal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaCreditoFiscal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaCreditoFiscal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCuentaCreditoFiscal;
	protected JTextField jTextFieldValorCampoGeneralCuentaCreditoFiscal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCuentaCreditoFiscal;
	//public JList<Reporte> jListColumnasSelectReporteCuentaCreditoFiscal;
	//public JScrollPane jScrollColumnasSelectReporteCuentaCreditoFiscal;
	
	//public JLabel jLabelRelacionesSelectReporteCuentaCreditoFiscal;
	//public JList<Reporte> jListRelacionesSelectReporteCuentaCreditoFiscal;
	//public JScrollPane jScrollRelacionesSelectReporteCuentaCreditoFiscal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCuentaCreditoFiscal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCuentaCreditoFiscal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCuentaCreditoFiscal;
	//public JLabel jLabelTiposArchivoReporteDinamicoCuentaCreditoFiscal;
	
		
	//public JLabel jLabelArchivoImportacionCuentaCreditoFiscal;	
	//public JLabel jLabelPathArchivoImportacionCuentaCreditoFiscal;
	//protected JTextField jTextFieldPathArchivoImportacionCuentaCreditoFiscal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCuentaCreditoFiscal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCuentaCreditoFiscal;
	
	//public JLabel jLabelColumnaCategoriaValorCuentaCreditoFiscal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCuentaCreditoFiscal;
	
	//public JLabel jLabelColumnasValoresGraficoCuentaCreditoFiscal;
	//public JList<Reporte> jListColumnasValoresGraficoCuentaCreditoFiscal;
	//public JScrollPane jScrollColumnasValoresGraficoCuentaCreditoFiscal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCuentaCreditoFiscal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCuentaCreditoFiscal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCuentaCreditoFiscal;
	public JPanel jPanelFK_IdCuentaContableCuentaCreditoFiscal;
	public JButton jButtonFK_IdCuentaContableCuentaCreditoFiscal;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscalArbol= new JButtonMe();

	
	
	
	
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
	public CuentaCreditoFiscalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CuentaCreditoFiscal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaCreditoFiscalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaCreditoFiscal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaCreditoFiscalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaCreditoFiscal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaCreditoFiscalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaCreditoFiscal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCuentaCreditoFiscal)	{
		this.jButtonRecargarInformacionCuentaCreditoFiscal = jButtonRecargarInformacionCuentaCreditoFiscal;
	}
	
	public JButton getjButtonProcesarInformacionCuentaCreditoFiscal() {
		return this.jButtonProcesarInformacionCuentaCreditoFiscal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaCreditoFiscal)	{
		this.jButtonProcesarInformacionCuentaCreditoFiscal = jButtonProcesarInformacionCuentaCreditoFiscal;
	}
	
	
	public JButton getjButtonRecargarInformacionCuentaCreditoFiscal() {
		return this.jButtonRecargarInformacionCuentaCreditoFiscal;
	}
	
	
	public List<CuentaCreditoFiscal> getcuentacreditofiscals() {
		return this.cuentacreditofiscals;
	}

	public void setcuentacreditofiscals(List<CuentaCreditoFiscal> cuentacreditofiscals) {
		this.cuentacreditofiscals = cuentacreditofiscals;
	}
	
	public List<CuentaCreditoFiscal> getcuentacreditofiscalsAux() {
		return this.cuentacreditofiscalsAux;
	}

	public void setcuentacreditofiscalsAux(List<CuentaCreditoFiscal> cuentacreditofiscalsAux) {
		this.cuentacreditofiscalsAux = cuentacreditofiscalsAux;
	}
	
	public List<CuentaCreditoFiscal> getcuentacreditofiscalsEliminados() {
		return this.cuentacreditofiscalsEliminados;
	}

	public void setCuentaCreditoFiscalsEliminados(List<CuentaCreditoFiscal> cuentacreditofiscalsEliminados) {
		this.cuentacreditofiscalsEliminados = cuentacreditofiscalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCuentaCreditoFiscal() {
		return jComboBoxTiposSeleccionarCuentaCreditoFiscal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCuentaCreditoFiscal(
			JComboBox jComboBoxTiposSeleccionarCuentaCreditoFiscal) {
		this.jComboBoxTiposSeleccionarCuentaCreditoFiscal = jComboBoxTiposSeleccionarCuentaCreditoFiscal;
	}
	
	public void setBorderResaltarTiposSeleccionarCuentaCreditoFiscal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCuentaCreditoFiscal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCuentaCreditoFiscal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCuentaCreditoFiscal() {
		return jTextFieldValorCampoGeneralCuentaCreditoFiscal;
	}

	public void setjTextFieldValorCampoGeneralCuentaCreditoFiscal(
			JTextField jTextFieldValorCampoGeneralCuentaCreditoFiscal) {
		this.jTextFieldValorCampoGeneralCuentaCreditoFiscal = jTextFieldValorCampoGeneralCuentaCreditoFiscal;
	}

	public void setBorderResaltarValorCampoGeneralCuentaCreditoFiscal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaCreditoFiscal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCuentaCreditoFiscal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCuentaCreditoFiscal() {
		return this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal;
	}

	public void setjCheckBoxSeleccionarTodosCuentaCreditoFiscal(
			JCheckBox jCheckBoxSeleccionarTodosCuentaCreditoFiscal) {
		this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal = jCheckBoxSeleccionarTodosCuentaCreditoFiscal;
	}

	public void setBorderResaltarSeleccionarTodosCuentaCreditoFiscal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaCreditoFiscal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCuentaCreditoFiscal() {
		return this.jCheckBoxSeleccionadosCuentaCreditoFiscal;
	}

	public void setjCheckBoxSeleccionadosCuentaCreditoFiscal(
			JCheckBox jCheckBoxSeleccionadosCuentaCreditoFiscal) {
		this.jCheckBoxSeleccionadosCuentaCreditoFiscal = jCheckBoxSeleccionadosCuentaCreditoFiscal;
	}
	
	public void setBorderResaltarSeleccionadosCuentaCreditoFiscal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaCreditoFiscal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCuentaCreditoFiscal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCuentaCreditoFiscal() {
		return this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCuentaCreditoFiscal(
			JComboBox jComboBoxTiposArchivosReportesCuentaCreditoFiscal) {
		this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal = jComboBoxTiposArchivosReportesCuentaCreditoFiscal;
	}

	public void setBorderResaltarTiposArchivosReportesCuentaCreditoFiscal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaCreditoFiscal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCuentaCreditoFiscal() {
		return this.jComboBoxTiposReportesCuentaCreditoFiscal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCuentaCreditoFiscal(
			JComboBox jComboBoxTiposReportesCuentaCreditoFiscal) {
		this.jComboBoxTiposReportesCuentaCreditoFiscal = jComboBoxTiposReportesCuentaCreditoFiscal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCuentaCreditoFiscal() {
	//	return jComboBoxTiposReportesDinamicoCuentaCreditoFiscal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCuentaCreditoFiscal(
	//		JComboBox jComboBoxTiposReportesDinamicoCuentaCreditoFiscal) {
	//	this.jComboBoxTiposReportesDinamicoCuentaCreditoFiscal = jComboBoxTiposReportesDinamicoCuentaCreditoFiscal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal() {
	//	return jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal = jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal;
	//}
	
	public void setBorderResaltarTiposReportesCuentaCreditoFiscal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaCreditoFiscal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCuentaCreditoFiscal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCuentaCreditoFiscal() {
		return this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCuentaCreditoFiscal(
			JComboBox jComboBoxTiposGraficosReportesCuentaCreditoFiscal) {
		this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal = jComboBoxTiposGraficosReportesCuentaCreditoFiscal;
	}
	
	public void setBorderResaltarTiposGraficosReportesCuentaCreditoFiscal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaCreditoFiscal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCuentaCreditoFiscal() {
		return this.jComboBoxTiposPaginacionCuentaCreditoFiscal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCuentaCreditoFiscal(
			JComboBox jComboBoxTiposPaginacionCuentaCreditoFiscal) {
		this.jComboBoxTiposPaginacionCuentaCreditoFiscal = jComboBoxTiposPaginacionCuentaCreditoFiscal;
	}
	
	public void setBorderResaltarTiposPaginacionCuentaCreditoFiscal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaCreditoFiscal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCuentaCreditoFiscal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCuentaCreditoFiscal() {
		return this.jComboBoxTiposRelacionesCuentaCreditoFiscal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaCreditoFiscal() {
		return this.jComboBoxTiposAccionesCuentaCreditoFiscal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaCreditoFiscal(
			JComboBox jComboBoxTiposRelacionesCuentaCreditoFiscal) {
		this.jComboBoxTiposRelacionesCuentaCreditoFiscal = jComboBoxTiposRelacionesCuentaCreditoFiscal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaCreditoFiscal(
			JComboBox jComboBoxTiposAccionesCuentaCreditoFiscal) {
		this.jComboBoxTiposAccionesCuentaCreditoFiscal = jComboBoxTiposAccionesCuentaCreditoFiscal;
	}
	
	public void setBorderResaltarTiposRelacionesCuentaCreditoFiscal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaCreditoFiscal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCuentaCreditoFiscal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCuentaCreditoFiscal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaCreditoFiscal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCuentaCreditoFiscal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCuentaCreditoFiscal() {
	//	return jCheckBoxConGraficoDinamicoCuentaCreditoFiscal;
	//}

	//public void setjCheckBoxConGraficoDinamicoCuentaCreditoFiscal(
	//		JCheckBox jCheckBoxConGraficoDinamicoCuentaCreditoFiscal) {
	//	this.jCheckBoxConGraficoDinamicoCuentaCreditoFiscal = jCheckBoxConGraficoDinamicoCuentaCreditoFiscal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCuentaCreditoFiscal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCuentaCreditoFiscal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCuentaCreditoFiscal .setBorder(borderResaltar);		
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
		this.cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean();
		
		this.cuentacreditofiscalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacreditofiscalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CuentaCreditoFiscalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CuentaCreditoFiscalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaCreditoFiscalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaCreditoFiscalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaCreditoFiscalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Credito Fiscal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
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
		
		CuentaCreditoFiscalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CuentaCreditoFiscal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCuentaCreditoFiscal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"nuevo","nuevo","Nuevo"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"duplicar","duplicar","Duplicar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"copiar","copiar","Copiar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"ver_form","ver_form","Ver"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"recargar","recargar","Recargar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,
							"cerrar","cerrar","Salir"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCuentaCreditoFiscal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCuentaCreditoFiscal;
			
				this.jButtonProcesarInformacionToolBarCuentaCreditoFiscal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCuentaCreditoFiscal;
				
		//protected JButton jButtonModificarToolBarCuentaCreditoFiscal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCuentaCreditoFiscal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCuentaCreditoFiscal=new JMenuMe("General");
		this.jmenuArchivoCuentaCreditoFiscal=new JMenuMe("Archivo");
		this.jmenuAccionesCuentaCreditoFiscal=new JMenuMe("Acciones");
		this.jmenuDatosCuentaCreditoFiscal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaCreditoFiscal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaCreditoFiscal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaCreditoFiscal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCuentaCreditoFiscal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCuentaCreditoFiscal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCuentaCreditoFiscal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCuentaCreditoFiscal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCuentaCreditoFiscal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCuentaCreditoFiscal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCuentaCreditoFiscal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaCreditoFiscal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaCreditoFiscal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCuentaCreditoFiscal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCuentaCreditoFiscal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCuentaCreditoFiscal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCuentaCreditoFiscal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCuentaCreditoFiscal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCuentaCreditoFiscal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCuentaCreditoFiscal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCuentaCreditoFiscal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCuentaCreditoFiscal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaCreditoFiscal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaCreditoFiscal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaCreditoFiscal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCuentaCreditoFiscal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCuentaCreditoFiscal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCuentaCreditoFiscal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCuentaCreditoFiscal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCuentaCreditoFiscal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCuentaCreditoFiscal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCuentaCreditoFiscal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCuentaCreditoFiscal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCuentaCreditoFiscal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCuentaCreditoFiscal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCuentaCreditoFiscal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCuentaCreditoFiscal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCuentaCreditoFiscal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCuentaCreditoFiscal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCuentaCreditoFiscal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaCreditoFiscal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaCreditoFiscal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaCreditoFiscal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCuentaCreditoFiscal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCuentaCreditoFiscal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCuentaCreditoFiscal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaCreditoFiscal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaCreditoFiscal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaCreditoFiscal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCuentaCreditoFiscal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCuentaCreditoFiscal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCuentaCreditoFiscal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCuentaCreditoFiscal.add(this.jMenuItemCerrarCuentaCreditoFiscal);
			
			this.jmenuAccionesCuentaCreditoFiscal.add(this.jMenuItemNuevoCuentaCreditoFiscal);
			this.jmenuAccionesCuentaCreditoFiscal.add(this.jMenuItemNuevoGuardarCambiosCuentaCreditoFiscal);
			this.jmenuAccionesCuentaCreditoFiscal.add(this.jMenuItemNuevoRelacionesCuentaCreditoFiscal);
			this.jmenuAccionesCuentaCreditoFiscal.add(this.jMenuItemGuardarCambiosTablaCuentaCreditoFiscal);		
			this.jmenuAccionesCuentaCreditoFiscal.add(this.jMenuItemDuplicarCuentaCreditoFiscal);		
			this.jmenuAccionesCuentaCreditoFiscal.add(this.jMenuItemCopiarCuentaCreditoFiscal);		
			this.jmenuAccionesCuentaCreditoFiscal.add(this.jMenuItemVerFormCuentaCreditoFiscal);		
			
			this.jmenuDatosCuentaCreditoFiscal.add(this.jMenuItemRecargarInformacionCuentaCreditoFiscal);				
			this.jmenuDatosCuentaCreditoFiscal.add(this.jMenuItemAnterioresCuentaCreditoFiscal);				
			this.jmenuDatosCuentaCreditoFiscal.add(this.jMenuItemSiguientesCuentaCreditoFiscal);				
			this.jmenuDatosCuentaCreditoFiscal.add(this.jMenuItemAbrirOrderByCuentaCreditoFiscal);				
			this.jmenuDatosCuentaCreditoFiscal.add(this.jMenuItemMostrarOcultarCuentaCreditoFiscal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCuentaCreditoFiscal.add(this.jMenuItemGuardarCambiosCuentaCreditoFiscal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCuentaCreditoFiscal.add(this.jmenuArchivoCuentaCreditoFiscal);		
			this.jmenuBarCuentaCreditoFiscal.add(this.jmenuAccionesCuentaCreditoFiscal);		
			this.jmenuBarCuentaCreditoFiscal.add(this.jmenuDatosCuentaCreditoFiscal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCuentaCreditoFiscal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCuentaCreditoFiscal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableCuentaCreditoFiscal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCuentaCreditoFiscal.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableCuentaCreditoFiscal= new JButtonMe();
		this.jButtonFK_IdCuentaContableCuentaCreditoFiscal.setText("Buscar");
		this.jButtonFK_IdCuentaContableCuentaCreditoFiscal.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCuentaCreditoFiscal,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCuentaCreditoFiscal=new JTabbedPane();


		this.jTabbedPaneBusquedasCuentaCreditoFiscal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaCreditoFiscal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaCreditoFiscal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCuentaCreditoFiscal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCuentaCreditoFiscal = new CuentaCreditoFiscalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuenta Credito Fiscal DATOS");
			this.jInternalFrameDetalleFormCuentaCreditoFiscal = new CuentaCreditoFiscalDetalleFormJInternalFrame(jDesktopPane,this.cuentacreditofiscalSessionBean.getConGuardarRelaciones(),this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal = null;//new CuentaCreditoFiscalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaCreditoFiscal= new GridBagLayout();
		
		
		this.jTableDatosCuentaCreditoFiscal = new JTableMe();      
		
		String sToolTipCuentaCreditoFiscal="";
		sToolTipCuentaCreditoFiscal=CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaCreditoFiscal+="(Sris.CuentaCreditoFiscal)";
		}
		
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaCreditoFiscal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCuentaCreditoFiscal.setToolTipText(sToolTipCuentaCreditoFiscal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCuentaCreditoFiscal);
		this.jTableDatosCuentaCreditoFiscal.setAutoCreateRowSorter(true);
		this.jTableDatosCuentaCreditoFiscal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCuentaCreditoFiscal.setRowSelectionAllowed(true);
		this.jTableDatosCuentaCreditoFiscal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCuentaCreditoFiscal = new JButtonMe();
		this.jButtonDuplicarCuentaCreditoFiscal = new JButtonMe();
		this.jButtonCopiarCuentaCreditoFiscal = new JButtonMe();
		this.jButtonVerFormCuentaCreditoFiscal = new JButtonMe();
		this.jButtonNuevoRelacionesCuentaCreditoFiscal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCuentaCreditoFiscal = new JButtonMe();
		this.jButtonCerrarCuentaCreditoFiscal = new JButtonMe();
		
		this.jScrollPanelDatosCuentaCreditoFiscal = new JScrollPane();   
        this.jScrollPanelDatosGeneralCuentaCreditoFiscal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Credito Fiscal";
		
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Credito Fiscales" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaCreditoFiscal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaCreditoFiscal.setToolTipText("Acciones");
        this.jPanelAccionesCuentaCreditoFiscal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCuentaCreditoFiscal=new ReporteDinamicoJInternalFrame(CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCuentaCreditoFiscal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCuentaCreditoFiscal=new ImportacionJInternalFrame(CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCuentaCreditoFiscal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCuentaCreditoFiscal = new JButtonMe();
		
		this.jButtonAbrirOrderByCuentaCreditoFiscal.setText("Orden");
		this.jButtonAbrirOrderByCuentaCreditoFiscal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaCreditoFiscal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaCreditoFiscal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaCreditoFiscal,false,this);
			
			//this.cargarOrderByCuentaCreditoFiscal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaCreditoFiscal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaCreditoFiscal,true,this);
			
			//this.cargarOrderByCuentaCreditoFiscal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCuentaCreditoFiscal.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosCuentaCreditoFiscal.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosCuentaCreditoFiscal.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosCuentaCreditoFiscal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaCreditoFiscal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaCreditoFiscal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCuentaCreditoFiscal.setText("Nuevo");
		this.jButtonDuplicarCuentaCreditoFiscal.setText("Duplicar");
		this.jButtonCopiarCuentaCreditoFiscal.setText("Copiar");
		this.jButtonVerFormCuentaCreditoFiscal.setText("Ver");
		this.jButtonNuevoRelacionesCuentaCreditoFiscal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.setText("Guardar");
		this.jButtonCerrarCuentaCreditoFiscal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaCreditoFiscal,"nuevo_button","Nuevo",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCuentaCreditoFiscal,"duplicar_button","Duplicar",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCuentaCreditoFiscal,"copiar_button","Copiar",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCuentaCreditoFiscal,"ver_form","Ver",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCuentaCreditoFiscal,"nuevorelaciones_button","Nuevo Rel",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaCreditoFiscal,"guardarcambiostabla_button","Guardar",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaCreditoFiscal,"cerrar_button","Salir",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCuentaCreditoFiscal.setToolTipText("Nuevo"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCuentaCreditoFiscal.setToolTipText("Duplicar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCuentaCreditoFiscal.setToolTipText("Copiar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCuentaCreditoFiscal.setToolTipText("Ver"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCuentaCreditoFiscal.setToolTipText("Nuevo Rel"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.setToolTipText("Guardar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaCreditoFiscal.setToolTipText("Salir"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaCreditoFiscal";
		inputMap = this.jButtonNuevoCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaCreditoFiscal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaCreditoFiscal"));
		
		//DUPLICAR
		sMapKey = "DuplicarCuentaCreditoFiscal";
		inputMap = this.jButtonDuplicarCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCuentaCreditoFiscal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCuentaCreditoFiscal"));
		
		//COPIAR
		sMapKey = "CopiarCuentaCreditoFiscal";
		inputMap = this.jButtonCopiarCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCuentaCreditoFiscal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCuentaCreditoFiscal"));
		
		//VEr FORM
		sMapKey = "VerFormCuentaCreditoFiscal";
		inputMap = this.jButtonVerFormCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCuentaCreditoFiscal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCuentaCreditoFiscal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCuentaCreditoFiscal";
		inputMap = this.jButtonNuevoRelacionesCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCuentaCreditoFiscal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCuentaCreditoFiscal";
		inputMap = this.jButtonModificarCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCuentaCreditoFiscal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCuentaCreditoFiscal";
		inputMap = this.jButtonCerrarCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaCreditoFiscal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaCreditoFiscal";
		inputMap = this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaCreditoFiscal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CuentaCreditoFiscal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CuentaCreditoFiscal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CuentaCreditoFiscal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CuentaCreditoFiscal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CuentaCreditoFiscal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCuentaCreditoFiscal.setName("jPanelParametrosReportesCuentaCreditoFiscal"); 
		
		this.jPanelParametrosReportesAccionesCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCuentaCreditoFiscal.setName("jPanelParametrosReportesAccionesCuentaCreditoFiscal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCuentaCreditoFiscal = new JButtonMe();
		this.jButtonRecargarInformacionCuentaCreditoFiscal.setText("Recargar");
		this.jButtonRecargarInformacionCuentaCreditoFiscal.setToolTipText("Recargar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCuentaCreditoFiscal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCuentaCreditoFiscal = new JButtonMe();
		this.jButtonProcesarInformacionCuentaCreditoFiscal.setText("Procesar");
		this.jButtonProcesarInformacionCuentaCreditoFiscal.setToolTipText("Procesar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCuentaCreditoFiscal.setVisible(false);
			
		this.jButtonProcesarInformacionCuentaCreditoFiscal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaCreditoFiscal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaCreditoFiscal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCuentaCreditoFiscal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal.setText("TIPO");       
		this.jComboBoxTiposReportesCuentaCreditoFiscal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCuentaCreditoFiscal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCuentaCreditoFiscal.setText("Paginacion");
		this.jComboBoxTiposPaginacionCuentaCreditoFiscal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCuentaCreditoFiscal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCuentaCreditoFiscal.setText("Accion");
		this.jComboBoxTiposRelacionesCuentaCreditoFiscal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCuentaCreditoFiscal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaCreditoFiscal.setText("Accion");
		this.jComboBoxTiposAccionesCuentaCreditoFiscal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCuentaCreditoFiscal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.setText("Accion");
		this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCuentaCreditoFiscal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCuentaCreditoFiscal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaCreditoFiscal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaCreditoFiscal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCuentaCreditoFiscal = new JLabelMe();
		
		this.jLabelAccionesCuentaCreditoFiscal.setText("Acciones");		
		this.jLabelAccionesCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCuentaCreditoFiscal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCuentaCreditoFiscal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCuentaCreditoFiscal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCuentaCreditoFiscal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCuentaCreditoFiscal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCuentaCreditoFiscal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCuentaCreditoFiscal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCuentaCreditoFiscal.setText("Graf.");
		this.jCheckBoxConGraficoReporteCuentaCreditoFiscal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCuentaCreditoFiscal = new JButtonMe();
		//this.jButtonAnterioresCuentaCreditoFiscal.setText("<<");
        this.jButtonAnterioresCuentaCreditoFiscal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCuentaCreditoFiscal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCuentaCreditoFiscal = new JButtonMe();
		//this.jButtonSiguientesCuentaCreditoFiscal.setText(">>");
        this.jButtonSiguientesCuentaCreditoFiscal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCuentaCreditoFiscal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCuentaCreditoFiscal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCuentaCreditoFiscal.setText("Nue");
        this.jButtonNuevoGuardarCambiosCuentaCreditoFiscal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCuentaCreditoFiscal,"nuevoguardarcambios_button","Nue",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCuentaCreditoFiscal";
		inputMap = this.jButtonNuevoGuardarCambiosCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCuentaCreditoFiscal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCuentaCreditoFiscal";
		inputMap = this.jButtonRecargarInformacionCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCuentaCreditoFiscal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCuentaCreditoFiscal";
		inputMap = this.jButtonSiguientesCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCuentaCreditoFiscal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCuentaCreditoFiscal";
		inputMap = this.jButtonAnterioresCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCuentaCreditoFiscal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCuentaCreditoFiscal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCuentaCreditoFiscal.setMinimumSize(new Dimension(this.getWidth(),CuentaCreditoFiscalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaCreditoFiscalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaCreditoFiscal.setMaximumSize(new Dimension(this.getWidth(),CuentaCreditoFiscalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaCreditoFiscalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaCreditoFiscal.setPreferredSize(new Dimension(this.getWidth(),CuentaCreditoFiscalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaCreditoFiscalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCuentaCreditoFiscal = new GridBagLayout();

			this.jPanelPaginacionCuentaCreditoFiscal.setLayout(gridaBagLayoutPaginacionCuentaCreditoFiscal);						
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCuentaCreditoFiscal.add(this.jButtonAnterioresCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
					
						
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
			
			this.jPanelPaginacionCuentaCreditoFiscal.add(this.jButtonNuevoGuardarCambiosCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
						
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
			this.jPanelPaginacionCuentaCreditoFiscal.add(this.jButtonSiguientesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = 1;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaCreditoFiscal.add(this.jButtonNuevoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
						
			
			
			if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
				this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaCreditoFiscal.gridy = 1;
				this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCuentaCreditoFiscal.add(this.jButtonGuardarCambiosTablaCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			}
			
			
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = 1;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaCreditoFiscal.add(this.jButtonDuplicarCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = 1;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaCreditoFiscal.add(this.jButtonCopiarCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = 1;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaCreditoFiscal.add(this.jButtonVerFormCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = 1;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCuentaCreditoFiscal.add(this.jButtonCerrarCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		
		
		
		this.jButtonRecargarInformacionCuentaCreditoFiscal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaCreditoFiscal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaCreditoFiscal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCuentaCreditoFiscal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaCreditoFiscal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaCreditoFiscal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCuentaCreditoFiscal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaCreditoFiscal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaCreditoFiscal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCuentaCreditoFiscal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaCreditoFiscal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaCreditoFiscal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCuentaCreditoFiscal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaCreditoFiscal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaCreditoFiscal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCuentaCreditoFiscal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaCreditoFiscal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaCreditoFiscal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCuentaCreditoFiscal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaCreditoFiscal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaCreditoFiscal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCuentaCreditoFiscal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaCreditoFiscal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaCreditoFiscal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCuentaCreditoFiscal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCuentaCreditoFiscal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CuentaCreditoFiscal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CuentaCreditoFiscal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CuentaCreditoFiscal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CuentaCreditoFiscal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCuentaCreditoFiscal.setLayout(gridaBagParametrosReportesCuentaCreditoFiscal);
			this.jPanelParametrosReportesAccionesCuentaCreditoFiscal.setLayout(gridaBagParametrosReportesAccionesCuentaCreditoFiscal);
			
			
			this.jPanelParametrosAuxiliar1CuentaCreditoFiscal.setLayout(gridaBagParametrosAuxiliar1CuentaCreditoFiscal);
			this.jPanelParametrosAuxiliar2CuentaCreditoFiscal.setLayout(gridaBagParametrosAuxiliar2CuentaCreditoFiscal);
			this.jPanelParametrosAuxiliar3CuentaCreditoFiscal.setLayout(gridaBagParametrosAuxiliar3CuentaCreditoFiscal);
			this.jPanelParametrosAuxiliar4CuentaCreditoFiscal.setLayout(gridaBagParametrosAuxiliar4CuentaCreditoFiscal);
			//this.jPanelParametrosAuxiliar5CuentaCreditoFiscal.setLayout(gridaBagParametrosAuxiliar2CuentaCreditoFiscal);			
			
			
			
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jButtonRecargarInformacionCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaCreditoFiscal.add(this.jComboBoxTiposPaginacionCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaCreditoFiscal.add(this.jCheckBoxConAltoMaximoTablaCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaCreditoFiscal.add(this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jPanelParametrosAuxiliar1CuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CuentaCreditoFiscal.add(this.jComboBoxTiposReportesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jPanelParametrosAuxiliar4CuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jComboBoxTiposReportesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jCheckBoxGenerarReporteCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jPanelParametrosAuxiliar2CuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jLabelAccionesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
				this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jButtonAbrirOrderByCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jComboBoxTiposSeleccionarCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);			
			
			
			/*
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaCreditoFiscal.add(this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);															
				
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaCreditoFiscal.add(this.jCheckBoxSeleccionadosCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jPanelParametrosAuxiliar3CuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jComboBoxTiposAccionesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
	
				
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaCreditoFiscal.add(this.jTextFieldValorCampoGeneralCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCuentaCreditoFiscal = new GridBagLayout();

			this.jScrollPanelDatosCuentaCreditoFiscal.setLayout(gridaBagLayoutDatosCuentaCreditoFiscal);
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
			
			this.jScrollPanelDatosCuentaCreditoFiscal.add(this.jTableDatosCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCuentaCreditoFiscal.setViewportView(this.jTableDatosCuentaCreditoFiscal);
		this.jTableDatosCuentaCreditoFiscal.setFillsViewportHeight(true);
		this.jTableDatosCuentaCreditoFiscal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCuentaCreditoFiscal= new GridBagLayout();
		this.jPanelAccionesCuentaCreditoFiscal.setLayout(gridaBagLayoutAccionesCuentaCreditoFiscal);
		
		
		/*	
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
			
		this.jPanelAccionesCuentaCreditoFiscal.add(this.jButtonNuevoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableCuentaCreditoFiscal= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCuentaCreditoFiscal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaCreditoFiscal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaCreditoFiscal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCuentaCreditoFiscal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCuentaCreditoFiscal.setLayout(gridaBagLayoutFK_IdCuentaContableCuentaCreditoFiscal);

		gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
		gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
		jPanelFK_IdCuentaContableCuentaCreditoFiscal.add(jLabelid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal, gridBagConstraintsCuentaCreditoFiscal);

		gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
		gridBagConstraintsCuentaCreditoFiscal.gridx = 1;
		jPanelFK_IdCuentaContableCuentaCreditoFiscal.add(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal, gridBagConstraintsCuentaCreditoFiscal);

		gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaCreditoFiscal.gridy = 1;
		gridBagConstraintsCuentaCreditoFiscal.gridx =1;
		jPanelFK_IdCuentaContableCuentaCreditoFiscal.add(jButtonFK_IdCuentaContableCuentaCreditoFiscal, gridBagConstraintsCuentaCreditoFiscal);

		jTabbedPaneBusquedasCuentaCreditoFiscal.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableCuentaCreditoFiscal);
		jTabbedPaneBusquedasCuentaCreditoFiscal.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaCreditoFiscal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaCreditoFiscal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();						
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;		
			//this.gridBagConstraintsCuentaCreditoFiscal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;		
		//this.gridBagConstraintsCuentaCreditoFiscal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCuentaCreditoFiscal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;		
			this.gridBagConstraintsCuentaCreditoFiscal.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);								
		
		
		/*
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		*/		
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx =0;
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaCreditoFiscal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
				
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CuentaCreditoFiscalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCuentaCreditoFiscal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaCreditoFiscal = new GridBagLayout();
			this.jPanelBusquedasParametrosCuentaCreditoFiscal.setLayout(gridaBagLayoutBusquedasParametrosCuentaCreditoFiscal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCuentaCreditoFiscal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			
			
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		
			
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCuentaCreditoFiscal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCuentaCreditoFiscal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCuentaCreditoFiscal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCuentaCreditoFiscal.setName("jPanelReporteDinamicoCuentaCreditoFiscal"); 
		
		this.jPanelReporteDinamicoCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCuentaCreditoFiscal.setLayout(gridaBagLayoutReporteDinamicoCuentaCreditoFiscal);
		
		
		this.jInternalFrameReporteDinamicoCuentaCreditoFiscal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCuentaCreditoFiscal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaCreditoFiscal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setResizable(true);
	    this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setClosable(true);
	    this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Credito Fiscales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCuentaCreditoFiscal = new JLabelMe();

		this.jLabelColumnasSelectReporteCuentaCreditoFiscal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaCreditoFiscal.add(this.jLabelColumnasSelectReporteCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCuentaCreditoFiscal = new JList<Reporte>();
		this.jListColumnasSelectReporteCuentaCreditoFiscal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCuentaCreditoFiscal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCuentaCreditoFiscal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaCreditoFiscal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaCreditoFiscal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCuentaCreditoFiscal=new JScrollPane(this.jListColumnasSelectReporteCuentaCreditoFiscal);
			
			this.jScrollColumnasSelectReporteCuentaCreditoFiscal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaCreditoFiscal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaCreditoFiscal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaCreditoFiscal.add(this.jListColumnasSelectReporteCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		this.jPanelReporteDinamicoCuentaCreditoFiscal.add(this.jScrollColumnasSelectReporteCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCuentaCreditoFiscal = new JLabelMe();

		this.jLabelRelacionesSelectReporteCuentaCreditoFiscal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCuentaCreditoFiscal = new JList<Reporte>();
		this.jListRelacionesSelectReporteCuentaCreditoFiscal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCuentaCreditoFiscal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCuentaCreditoFiscal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaCreditoFiscal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaCreditoFiscal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCuentaCreditoFiscal=new JScrollPane(this.jListRelacionesSelectReporteCuentaCreditoFiscal);
			
			this.jScrollRelacionesSelectReporteCuentaCreditoFiscal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaCreditoFiscal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaCreditoFiscal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCuentaCreditoFiscal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCuentaCreditoFiscal = new JComboBoxMe();
		this.jListColumnasValoresGraficoCuentaCreditoFiscal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCuentaCreditoFiscal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCuentaCreditoFiscal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCuentaCreditoFiscal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaCreditoFiscal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaCreditoFiscal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCuentaCreditoFiscal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCuentaCreditoFiscal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaCreditoFiscal.add(this.jLabelGenerarExcelReporteDinamicoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscal.setToolTipText("Generar EXCEL"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		//this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCuentaCreditoFiscal.add(this.jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaCreditoFiscal.add(this.jComboBoxTiposReportesDinamicoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCuentaCreditoFiscal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCuentaCreditoFiscal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaCreditoFiscal.add(this.jLabelTiposArchivoReporteDinamicoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaCreditoFiscal.add(this.jComboBoxTiposArchivosReportesDinamicoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCuentaCreditoFiscal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCuentaCreditoFiscal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCuentaCreditoFiscal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCuentaCreditoFiscal.setToolTipText("Generar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaCreditoFiscal.add(this.jButtonGenerarReporteDinamicoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCuentaCreditoFiscal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCuentaCreditoFiscal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCuentaCreditoFiscal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCuentaCreditoFiscal.setToolTipText("Cancelar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaCreditoFiscal.add(this.jButtonCerrarReporteDinamicoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCuentaCreditoFiscal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCuentaCreditoFiscal= new JScrollPane(jPanelReporteDinamicoCuentaCreditoFiscal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Credito Fiscales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCuentaCreditoFiscal);
		this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getContentPane().add(this.jScrollPanelReporteDinamicoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCuentaCreditoFiscal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCuentaCreditoFiscal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCuentaCreditoFiscal.setName("jPanelImportacionCuentaCreditoFiscal"); 
		
		this.jPanelImportacionCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCuentaCreditoFiscal.setLayout(gridaBagLayoutImportacionCuentaCreditoFiscal);
		
		
		this.jInternalFrameImportacionCuentaCreditoFiscal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCuentaCreditoFiscal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCuentaCreditoFiscal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaCreditoFiscal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCuentaCreditoFiscal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaCreditoFiscal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaCreditoFiscal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCuentaCreditoFiscal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaCreditoFiscal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaCreditoFiscal.setResizable(true);
	    this.jInternalFrameImportacionCuentaCreditoFiscal.setClosable(true);
	    this.jInternalFrameImportacionCuentaCreditoFiscal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCuentaCreditoFiscal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaCreditoFiscal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaCreditoFiscal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCuentaCreditoFiscal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaCreditoFiscal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaCreditoFiscal.setResizable(true);
	    this.jInternalFrameImportacionCuentaCreditoFiscal.setClosable(true);
	    this.jInternalFrameImportacionCuentaCreditoFiscal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Credito Fiscales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCuentaCreditoFiscal = new JLabelMe();

		this.jLabelArchivoImportacionCuentaCreditoFiscal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaCreditoFiscal.add(this.jLabelArchivoImportacionCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCuentaCreditoFiscal = new JFileChooser();		
		this.jFileChooserImportacionCuentaCreditoFiscal.setToolTipText("ESCOGER ARCHIVO"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCuentaCreditoFiscal = new JButtonMe();
		this.jButtonAbrirImportacionCuentaCreditoFiscal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCuentaCreditoFiscal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCuentaCreditoFiscal.setToolTipText("Generar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaCreditoFiscal.add(this.jButtonAbrirImportacionCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCuentaCreditoFiscal = new JLabelMe();

		this.jLabelPathArchivoImportacionCuentaCreditoFiscal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaCreditoFiscal.add(this.jLabelPathArchivoImportacionCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCuentaCreditoFiscal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCuentaCreditoFiscal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaCreditoFiscal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaCreditoFiscal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaCreditoFiscal.add(this.jTextFieldPathArchivoImportacionCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCuentaCreditoFiscal = new JButtonMe();
		this.jButtonGenerarImportacionCuentaCreditoFiscal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCuentaCreditoFiscal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCuentaCreditoFiscal.setToolTipText("Generar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaCreditoFiscal.add(this.jButtonGenerarImportacionCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCuentaCreditoFiscal = new JButtonMe();
		this.jButtonCerrarImportacionCuentaCreditoFiscal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCuentaCreditoFiscal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCuentaCreditoFiscal.setToolTipText("Cancelar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaCreditoFiscal.add(this.jButtonCerrarImportacionCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCuentaCreditoFiscal = new GridBagLayout();
		
		this.jScrollPanelImportacionCuentaCreditoFiscal= new JScrollPane(jPanelImportacionCuentaCreditoFiscal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy =iPosYImportacion;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx =iPosXImportacion;
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCuentaCreditoFiscal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCuentaCreditoFiscal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCuentaCreditoFiscal);
		this.jInternalFrameImportacionCuentaCreditoFiscal.getContentPane().add(this.jScrollPanelImportacionCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCuentaCreditoFiscal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCuentaCreditoFiscal = new JButtonMe();
			this.jButtonAbrirOrderByCuentaCreditoFiscal.setText("Orden");
			this.jButtonAbrirOrderByCuentaCreditoFiscal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaCreditoFiscal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCuentaCreditoFiscal";
			inputMap = this.jButtonAbrirOrderByCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCuentaCreditoFiscal"));
		
		
			GridBagLayout gridaBagLayoutOrderByCuentaCreditoFiscal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCuentaCreditoFiscal.setName("jPanelOrderByCuentaCreditoFiscal"); 
			
			this.jPanelOrderByCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCuentaCreditoFiscal.setLayout(gridaBagLayoutOrderByCuentaCreditoFiscal);
			
			
			this.jTableDatosCuentaCreditoFiscalOrderBy = new JTableMe();        
			this.jTableDatosCuentaCreditoFiscalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCuentaCreditoFiscalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCuentaCreditoFiscalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCuentaCreditoFiscalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCuentaCreditoFiscalOrderBy.setViewportView(this.jTableDatosCuentaCreditoFiscalOrderBy);
			this.jTableDatosCuentaCreditoFiscalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCuentaCreditoFiscalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCuentaCreditoFiscal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCuentaCreditoFiscal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCuentaCreditoFiscal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCuentaCreditoFiscal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCuentaCreditoFiscal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCuentaCreditoFiscal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCuentaCreditoFiscal.setTitle("Orden");
			this.jInternalFrameOrderByCuentaCreditoFiscal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCuentaCreditoFiscal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCuentaCreditoFiscal.setResizable(true);
			this.jInternalFrameOrderByCuentaCreditoFiscal.setClosable(true);
			this.jInternalFrameOrderByCuentaCreditoFiscal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Credito Fiscales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCuentaCreditoFiscal.ipady =150;
				
			this.jPanelOrderByCuentaCreditoFiscal.add(jScrollPanelDatosCuentaCreditoFiscalOrderBy, this.gridBagConstraintsCuentaCreditoFiscal);//this.jTableDatosCuentaCreditoFiscalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCuentaCreditoFiscal = new JButtonMe();
			this.jButtonCerrarOrderByCuentaCreditoFiscal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCuentaCreditoFiscal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCuentaCreditoFiscal.setToolTipText("Cancelar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCuentaCreditoFiscal.add(this.jButtonCerrarOrderByCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCuentaCreditoFiscal = new GridBagLayout();
			
			this.jScrollPanelOrderByCuentaCreditoFiscal= new JScrollPane(jPanelOrderByCuentaCreditoFiscal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.gridy =iPosYOrderBy;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCuentaCreditoFiscal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCuentaCreditoFiscal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCuentaCreditoFiscal);
			
			this.jInternalFrameOrderByCuentaCreditoFiscal.getContentPane().add(this.jScrollPanelOrderByCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);			
		
		} else {
			this.jButtonAbrirOrderByCuentaCreditoFiscal = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cuentacreditofiscalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCuentaCreditoFiscal.getRowHeight();//CuentaCreditoFiscalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CuentaCreditoFiscalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaCreditoFiscal.isSelected()) {
					iHeightTable=CuentaCreditoFiscalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaCreditoFiscalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaCreditoFiscalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CuentaCreditoFiscalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaCreditoFiscal.isSelected()) {
					iHeightTable=CuentaCreditoFiscalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaCreditoFiscalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaCreditoFiscalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCuentaCreditoFiscal!=null && this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy()!=null) {
			//if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCuentaCreditoFiscal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCuentaCreditoFiscal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCuentaCreditoFiscal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cuentacreditofiscalLogic.getCuentaCreditoFiscals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacreditofiscals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CuentaCreditoFiscal> TraerCuentaCreditoFiscalBeans(List<CuentaCreditoFiscal> cuentacreditofiscals,ArrayList<Classe> classes)throws Exception {
		try {
			for(CuentaCreditoFiscal cuentacreditofiscal:cuentacreditofiscals) {
					
				if(!(CuentaCreditoFiscalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CuentaCreditoFiscalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cuentacreditofiscal.setsDetalleGeneralEntityReporte(CuentaCreditoFiscalConstantesFunciones.getCuentaCreditoFiscalDescripcion(cuentacreditofiscal));
										
					cuentacreditofiscal.setesta_activo_descripcion(CuentaCreditoFiscalConstantesFunciones.getesta_activoDescripcion(cuentacreditofiscal));	
					
						
					
				} else  {
							
					//cuentacreditofiscal.setsDetalleGeneralEntityReporte(cuentacreditofiscal.getsDetalleGeneralEntityReporte());
										
				}
				
				//cuentacreditofiscalbeans.add(cuentacreditofiscalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cuentacreditofiscals;
    }
	//PARA REPORTES FIN
}
