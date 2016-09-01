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
import com.bydan.erp.contabilidad.util.ParametroPlanillaConstantesFunciones;

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
public class ParametroPlanillaJInternalFrame extends ParametroPlanillaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroPlanilla;
	
	protected JMenuBar jmenuBarParametroPlanilla;
	
	protected JMenu jmenuParametroPlanilla;
	protected JMenu jmenuDatosParametroPlanilla;
	protected JMenu jmenuArchivoParametroPlanilla;
	protected JMenu jmenuAccionesParametroPlanilla;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroPlanilla;	
	protected GridBagConstraints gridBagConstraintsParametroPlanilla;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroPlanillaDetalleFormJInternalFrame jInternalFrameDetalleFormParametroPlanilla;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroPlanilla;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroPlanilla;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinicialBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinicial="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefinalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefinal="";
	
	public ParametroPlanillaSessionBean parametroplanillaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableinicialSessionBean;
	public CuentaContableSessionBean cuentacontablefinalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroPlanilla> parametroplanillas;		
	public List<ParametroPlanilla> parametroplanillasEliminados;	
	public List<ParametroPlanilla> parametroplanillasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroPlanilla;		
	protected JButton jButtonAbrirOrderByParametroPlanilla;
	
	
	//protected JPanel jPanelOrderByParametroPlanilla;
	//public JScrollPane jScrollPanelOrderByParametroPlanilla;	
	//protected JButton jButtonCerrarOrderByParametroPlanilla;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroPlanillaLogic parametroplanillaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroPlanilla;
	public JScrollPane jScrollPanelDatosEdicionParametroPlanilla;
	public JScrollPane jScrollPanelDatosGeneralParametroPlanilla;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroPlanillaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroPlanilla;
	//public JScrollPane jScrollPanelImportacionParametroPlanilla;
	
	
	
	protected JPanel jPanelAccionesParametroPlanilla;
	
    protected JPanel jPanelPaginacionParametroPlanilla;
    protected JPanel jPanelParametrosReportesParametroPlanilla;
	protected JPanel jPanelParametrosReportesAccionesParametroPlanilla;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroPlanilla;
	protected JPanel jPanelParametrosAuxiliar2ParametroPlanilla;
	protected JPanel jPanelParametrosAuxiliar3ParametroPlanilla;
	protected JPanel jPanelParametrosAuxiliar4ParametroPlanilla;
	//protected JPanel jPanelParametrosAuxiliar5ParametroPlanilla;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroPlanilla;
	//protected JPanel jPanelImportacionParametroPlanilla;
	
	
	public JTable jTableDatosParametroPlanilla;
	
	
	
	//public JTable jTableDatosParametroPlanillaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroPlanilla;
	protected JButton jButtonDuplicarParametroPlanilla;
	protected JButton jButtonCopiarParametroPlanilla;
	protected JButton jButtonVerFormParametroPlanilla;
	protected JButton jButtonNuevoRelacionesParametroPlanilla;
	protected JButton jButtonModificarParametroPlanilla;
	
    protected JButton jButtonGuardarCambiosTablaParametroPlanilla;
	protected JButton jButtonCerrarParametroPlanilla;
	
	
	protected JButton jButtonRecargarInformacionParametroPlanilla;
	protected JButton jButtonProcesarInformacionParametroPlanilla;
	
	
	protected JButton jButtonAnterioresParametroPlanilla;
	protected JButton jButtonSiguientesParametroPlanilla;
	protected JButton jButtonNuevoGuardarCambiosParametroPlanilla;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroPlanilla;
	//protected JButton jButtonCerrarReporteDinamicoParametroPlanilla;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroPlanilla;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroPlanilla;
	//protected JButton jButtonGenerarImportacionParametroPlanilla;
	//protected JButton jButtonCerrarImportacionParametroPlanilla;
	//protected JFileChooser jFileChooserImportacionParametroPlanilla;
	//protected File fileImportacionParametroPlanilla;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroPlanilla;
	protected JButton jButtonDuplicarToolBarParametroPlanilla;
	protected JButton jButtonNuevoRelacionesToolBarParametroPlanilla;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroPlanilla;
	protected JButton jButtonCopiarToolBarParametroPlanilla;
	protected JButton jButtonVerFormToolBarParametroPlanilla;
	public JButton jButtonGuardarCambiosTablaToolBarParametroPlanilla;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroPlanilla;
	protected JButton jButtonCerrarToolBarParametroPlanilla;
	
	protected JButton jButtonRecargarInformacionToolBarParametroPlanilla;
	protected JButton jButtonProcesarInformacionToolBarParametroPlanilla;
	protected JButton jButtonAnterioresToolBarParametroPlanilla;
	protected JButton jButtonSiguientesToolBarParametroPlanilla;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroPlanilla;
	protected JButton jButtonAbrirOrderByToolBarParametroPlanilla;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroPlanilla;
	protected JMenuItem jMenuItemDuplicarParametroPlanilla;
	protected JMenuItem jMenuItemNuevoRelacionesParametroPlanilla;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroPlanilla;
	protected JMenuItem jMenuItemCopiarParametroPlanilla;
	protected JMenuItem jMenuItemVerFormParametroPlanilla;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroPlanilla;
	protected JMenuItem jMenuItemCerrarParametroPlanilla;
	protected JMenuItem jMenuItemDetalleCerrarParametroPlanilla;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroPlanilla;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroPlanilla;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroPlanilla;
	protected JMenuItem jMenuItemProcesarInformacionParametroPlanilla;
	protected JMenuItem jMenuItemAnterioresParametroPlanilla;
	protected JMenuItem jMenuItemSiguientesParametroPlanilla;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroPlanilla;
	protected JMenuItem jMenuItemAbrirOrderByParametroPlanilla;
	protected JMenuItem jMenuItemMostrarOcultarParametroPlanilla;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroPlanilla;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroPlanilla;
	protected JCheckBox jCheckBoxSeleccionadosParametroPlanilla;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroPlanilla;
	protected JCheckBox jCheckBoxConGraficoReporteParametroPlanilla;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroPlanilla;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroPlanilla;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroPlanilla;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroPlanilla;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroPlanilla;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroPlanilla;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroPlanilla;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroPlanilla;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroPlanilla;
	protected JTextField jTextFieldValorCampoGeneralParametroPlanilla;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroPlanilla;
	//public JList<Reporte> jListColumnasSelectReporteParametroPlanilla;
	//public JScrollPane jScrollColumnasSelectReporteParametroPlanilla;
	
	//public JLabel jLabelRelacionesSelectReporteParametroPlanilla;
	//public JList<Reporte> jListRelacionesSelectReporteParametroPlanilla;
	//public JScrollPane jScrollRelacionesSelectReporteParametroPlanilla;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroPlanilla;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroPlanilla;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroPlanilla;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroPlanilla;
	
		
	//public JLabel jLabelArchivoImportacionParametroPlanilla;	
	//public JLabel jLabelPathArchivoImportacionParametroPlanilla;
	//protected JTextField jTextFieldPathArchivoImportacionParametroPlanilla;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroPlanilla;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroPlanilla;
	
	//public JLabel jLabelColumnaCategoriaValorParametroPlanilla;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroPlanilla;
	
	//public JLabel jLabelColumnasValoresGraficoParametroPlanilla;
	//public JList<Reporte> jListColumnasValoresGraficoParametroPlanilla;
	//public JScrollPane jScrollColumnasValoresGraficoParametroPlanilla;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroPlanilla;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroPlanilla;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroPlanilla;
	public JPanel jPanelFK_IdCuentaContableFinalParametroPlanilla;
	public JButton jButtonFK_IdCuentaContableFinalParametroPlanilla;
	public JPanel jPanelFK_IdCuentaContableInicialParametroPlanilla;
	public JButton jButtonFK_IdCuentaContableInicialParametroPlanilla;
	
	public JPanel jPanelid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla;
	public JLabel jLabelid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla;
	public JButton jButtonid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanillaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanillaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanillaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableFinalid_cuenta_contable_finalParametroPlanilla;
	
	public JPanel jPanelid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla;
	public JLabel jLabelid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla;
	public JButton jButtonid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanillaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanillaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanillaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableInicialid_cuenta_contable_inicialParametroPlanilla;
	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public ParametroPlanillaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroPlanilla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroPlanillaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroPlanilla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroPlanillaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroPlanilla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroPlanillaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroPlanilla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroPlanilla)	{
		this.jButtonRecargarInformacionParametroPlanilla = jButtonRecargarInformacionParametroPlanilla;
	}
	
	public JButton getjButtonProcesarInformacionParametroPlanilla() {
		return this.jButtonProcesarInformacionParametroPlanilla;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroPlanilla)	{
		this.jButtonProcesarInformacionParametroPlanilla = jButtonProcesarInformacionParametroPlanilla;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroPlanilla() {
		return this.jButtonRecargarInformacionParametroPlanilla;
	}
	
	
	public List<ParametroPlanilla> getparametroplanillas() {
		return this.parametroplanillas;
	}

	public void setparametroplanillas(List<ParametroPlanilla> parametroplanillas) {
		this.parametroplanillas = parametroplanillas;
	}
	
	public List<ParametroPlanilla> getparametroplanillasAux() {
		return this.parametroplanillasAux;
	}

	public void setparametroplanillasAux(List<ParametroPlanilla> parametroplanillasAux) {
		this.parametroplanillasAux = parametroplanillasAux;
	}
	
	public List<ParametroPlanilla> getparametroplanillasEliminados() {
		return this.parametroplanillasEliminados;
	}

	public void setParametroPlanillasEliminados(List<ParametroPlanilla> parametroplanillasEliminados) {
		this.parametroplanillasEliminados = parametroplanillasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroPlanilla() {
		return jComboBoxTiposSeleccionarParametroPlanilla;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroPlanilla(
			JComboBox jComboBoxTiposSeleccionarParametroPlanilla) {
		this.jComboBoxTiposSeleccionarParametroPlanilla = jComboBoxTiposSeleccionarParametroPlanilla;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroPlanilla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroPlanilla.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroPlanilla .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroPlanilla() {
		return jTextFieldValorCampoGeneralParametroPlanilla;
	}

	public void setjTextFieldValorCampoGeneralParametroPlanilla(
			JTextField jTextFieldValorCampoGeneralParametroPlanilla) {
		this.jTextFieldValorCampoGeneralParametroPlanilla = jTextFieldValorCampoGeneralParametroPlanilla;
	}

	public void setBorderResaltarValorCampoGeneralParametroPlanilla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroPlanilla.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroPlanilla .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroPlanilla() {
		return this.jCheckBoxSeleccionarTodosParametroPlanilla;
	}

	public void setjCheckBoxSeleccionarTodosParametroPlanilla(
			JCheckBox jCheckBoxSeleccionarTodosParametroPlanilla) {
		this.jCheckBoxSeleccionarTodosParametroPlanilla = jCheckBoxSeleccionarTodosParametroPlanilla;
	}

	public void setBorderResaltarSeleccionarTodosParametroPlanilla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroPlanilla.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroPlanilla .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroPlanilla() {
		return this.jCheckBoxSeleccionadosParametroPlanilla;
	}

	public void setjCheckBoxSeleccionadosParametroPlanilla(
			JCheckBox jCheckBoxSeleccionadosParametroPlanilla) {
		this.jCheckBoxSeleccionadosParametroPlanilla = jCheckBoxSeleccionadosParametroPlanilla;
	}
	
	public void setBorderResaltarSeleccionadosParametroPlanilla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroPlanilla.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroPlanilla .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroPlanilla() {
		return this.jComboBoxTiposArchivosReportesParametroPlanilla;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroPlanilla(
			JComboBox jComboBoxTiposArchivosReportesParametroPlanilla) {
		this.jComboBoxTiposArchivosReportesParametroPlanilla = jComboBoxTiposArchivosReportesParametroPlanilla;
	}

	public void setBorderResaltarTiposArchivosReportesParametroPlanilla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroPlanilla.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroPlanilla .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroPlanilla() {
		return this.jComboBoxTiposReportesParametroPlanilla;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroPlanilla(
			JComboBox jComboBoxTiposReportesParametroPlanilla) {
		this.jComboBoxTiposReportesParametroPlanilla = jComboBoxTiposReportesParametroPlanilla;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroPlanilla() {
	//	return jComboBoxTiposReportesDinamicoParametroPlanilla;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroPlanilla(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroPlanilla) {
	//	this.jComboBoxTiposReportesDinamicoParametroPlanilla = jComboBoxTiposReportesDinamicoParametroPlanilla;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroPlanilla() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroPlanilla;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroPlanilla(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroPlanilla) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroPlanilla = jComboBoxTiposArchivosReportesDinamicoParametroPlanilla;
	//}
	
	public void setBorderResaltarTiposReportesParametroPlanilla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroPlanilla.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroPlanilla .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroPlanilla() {
		return this.jComboBoxTiposGraficosReportesParametroPlanilla;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroPlanilla(
			JComboBox jComboBoxTiposGraficosReportesParametroPlanilla) {
		this.jComboBoxTiposGraficosReportesParametroPlanilla = jComboBoxTiposGraficosReportesParametroPlanilla;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroPlanilla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroPlanilla.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroPlanilla .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroPlanilla() {
		return this.jComboBoxTiposPaginacionParametroPlanilla;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroPlanilla(
			JComboBox jComboBoxTiposPaginacionParametroPlanilla) {
		this.jComboBoxTiposPaginacionParametroPlanilla = jComboBoxTiposPaginacionParametroPlanilla;
	}
	
	public void setBorderResaltarTiposPaginacionParametroPlanilla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroPlanilla.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroPlanilla .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroPlanilla() {
		return this.jComboBoxTiposRelacionesParametroPlanilla;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroPlanilla() {
		return this.jComboBoxTiposAccionesParametroPlanilla;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroPlanilla(
			JComboBox jComboBoxTiposRelacionesParametroPlanilla) {
		this.jComboBoxTiposRelacionesParametroPlanilla = jComboBoxTiposRelacionesParametroPlanilla;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroPlanilla(
			JComboBox jComboBoxTiposAccionesParametroPlanilla) {
		this.jComboBoxTiposAccionesParametroPlanilla = jComboBoxTiposAccionesParametroPlanilla;
	}
	
	public void setBorderResaltarTiposRelacionesParametroPlanilla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroPlanilla.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroPlanilla .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroPlanilla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroPlanilla.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroPlanilla .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroPlanilla() {
	//	return jCheckBoxConGraficoDinamicoParametroPlanilla;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroPlanilla(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroPlanilla) {
	//	this.jCheckBoxConGraficoDinamicoParametroPlanilla = jCheckBoxConGraficoDinamicoParametroPlanilla;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroPlanilla() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroPlanilla.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroPlanilla .setBorder(borderResaltar);		
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
		this.parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
		
		this.parametroplanillaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroplanillaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroplanillaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroPlanillaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroPlanillaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroPlanillaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroPlanillaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroPlanillaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Planilla MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroPlanillaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroPlanilla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroPlanilla= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"nuevo","nuevo","Nuevo"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"duplicar","duplicar","Duplicar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"copiar","copiar","Copiar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"ver_form","ver_form","Ver"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"recargar","recargar","Recargar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroPlanilla,this.jTtoolBarParametroPlanilla,
							"cerrar","cerrar","Salir"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroPlanilla=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroPlanilla;
			
				this.jButtonProcesarInformacionToolBarParametroPlanilla=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroPlanilla;
				
		//protected JButton jButtonModificarToolBarParametroPlanilla;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroPlanilla=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroPlanilla=new JMenuMe("General");
		this.jmenuArchivoParametroPlanilla=new JMenuMe("Archivo");
		this.jmenuAccionesParametroPlanilla=new JMenuMe("Acciones");
		this.jmenuDatosParametroPlanilla=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroPlanilla= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroPlanilla.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroPlanilla,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroPlanilla= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroPlanilla.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroPlanilla,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroPlanilla= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroPlanilla.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroPlanilla,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroPlanilla= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroPlanilla.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroPlanilla,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroPlanilla= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroPlanilla.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroPlanilla,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroPlanilla= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroPlanilla.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroPlanilla,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroPlanilla= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroPlanilla.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroPlanilla,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroPlanilla= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroPlanilla.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroPlanilla,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroPlanilla= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroPlanilla.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroPlanilla,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroPlanilla= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroPlanilla.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroPlanilla,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroPlanilla= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroPlanilla.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroPlanilla,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroPlanilla= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroPlanilla.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroPlanilla,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroPlanilla= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroPlanilla.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroPlanilla,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroPlanilla= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroPlanilla.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroPlanilla,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroPlanilla= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroPlanilla.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroPlanilla,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroPlanilla= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroPlanilla.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroPlanilla,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroPlanilla= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroPlanilla.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroPlanilla,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroPlanilla.add(this.jMenuItemCerrarParametroPlanilla);
			
			this.jmenuAccionesParametroPlanilla.add(this.jMenuItemNuevoParametroPlanilla);
			this.jmenuAccionesParametroPlanilla.add(this.jMenuItemNuevoGuardarCambiosParametroPlanilla);
			this.jmenuAccionesParametroPlanilla.add(this.jMenuItemNuevoRelacionesParametroPlanilla);
			this.jmenuAccionesParametroPlanilla.add(this.jMenuItemGuardarCambiosTablaParametroPlanilla);		
			this.jmenuAccionesParametroPlanilla.add(this.jMenuItemDuplicarParametroPlanilla);		
			this.jmenuAccionesParametroPlanilla.add(this.jMenuItemCopiarParametroPlanilla);		
			this.jmenuAccionesParametroPlanilla.add(this.jMenuItemVerFormParametroPlanilla);		
			
			this.jmenuDatosParametroPlanilla.add(this.jMenuItemRecargarInformacionParametroPlanilla);				
			this.jmenuDatosParametroPlanilla.add(this.jMenuItemAnterioresParametroPlanilla);				
			this.jmenuDatosParametroPlanilla.add(this.jMenuItemSiguientesParametroPlanilla);				
			this.jmenuDatosParametroPlanilla.add(this.jMenuItemAbrirOrderByParametroPlanilla);				
			this.jmenuDatosParametroPlanilla.add(this.jMenuItemMostrarOcultarParametroPlanilla);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroPlanilla.add(this.jMenuItemGuardarCambiosParametroPlanilla);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroPlanilla.add(this.jmenuArchivoParametroPlanilla);		
			this.jmenuBarParametroPlanilla.add(this.jmenuAccionesParametroPlanilla);		
			this.jmenuBarParametroPlanilla.add(this.jmenuDatosParametroPlanilla);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroPlanilla);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroPlanilla() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableFinalParametroPlanilla=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableFinalParametroPlanilla.setToolTipText("Buscar Por Cuenta C. Final ");
		this.jButtonFK_IdCuentaContableFinalParametroPlanilla= new JButtonMe();
		this.jButtonFK_IdCuentaContableFinalParametroPlanilla.setText("Buscar");
		this.jButtonFK_IdCuentaContableFinalParametroPlanilla.setToolTipText("Buscar Por Cuenta C. Final ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableFinalParametroPlanilla,"buscar_button","Buscar Por Cuenta C. Final ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableFinalParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla = new JLabelMe();
		jLabelid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setText("Cuenta C. Final :");
		jLabelid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setToolTipText("Cuenta C. Final");
		jLabelid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla= new JComboBoxMe();
		jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableFinalid_cuenta_contable_finalParametroPlanilla= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableFinalid_cuenta_contable_finalParametroPlanilla.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFinalid_cuenta_contable_finalParametroPlanilla.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFinalid_cuenta_contable_finalParametroPlanilla.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableFinalid_cuenta_contable_finalParametroPlanilla.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFinalid_cuenta_contable_finalParametroPlanilla.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFinalid_cuenta_contable_finalParametroPlanilla.setFocusable(false);

		this.jPanelFK_IdCuentaContableInicialParametroPlanilla=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableInicialParametroPlanilla.setToolTipText("Buscar Por Cuenta C. Inicial ");
		this.jButtonFK_IdCuentaContableInicialParametroPlanilla= new JButtonMe();
		this.jButtonFK_IdCuentaContableInicialParametroPlanilla.setText("Buscar");
		this.jButtonFK_IdCuentaContableInicialParametroPlanilla.setToolTipText("Buscar Por Cuenta C. Inicial ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableInicialParametroPlanilla,"buscar_button","Buscar Por Cuenta C. Inicial ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableInicialParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla = new JLabelMe();
		jLabelid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setText("Cuenta C. Inicial :");
		jLabelid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setToolTipText("Cuenta C. Inicial");
		jLabelid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableInicialid_cuenta_contable_inicialParametroPlanilla= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableInicialid_cuenta_contable_inicialParametroPlanilla.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableInicialid_cuenta_contable_inicialParametroPlanilla.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableInicialid_cuenta_contable_inicialParametroPlanilla.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableInicialid_cuenta_contable_inicialParametroPlanilla.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableInicialid_cuenta_contable_inicialParametroPlanilla.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableInicialid_cuenta_contable_inicialParametroPlanilla.setFocusable(false);


		this.jTabbedPaneBusquedasParametroPlanilla=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroPlanilla.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroPlanilla.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroPlanilla.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroPlanilla.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroPlanilla,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroPlanilla = new ParametroPlanillaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Planilla DATOS");
			this.jInternalFrameDetalleFormParametroPlanilla = new ParametroPlanillaDetalleFormJInternalFrame(jDesktopPane,this.parametroplanillaSessionBean.getConGuardarRelaciones(),this.parametroplanillaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroPlanilla = null;//new ParametroPlanillaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroPlanilla= new GridBagLayout();
		
		
		this.jTableDatosParametroPlanilla = new JTableMe();      
		
		String sToolTipParametroPlanilla="";
		sToolTipParametroPlanilla=ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroPlanilla+="(Contabilidad.ParametroPlanilla)";
		}
		
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroPlanilla+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroPlanilla.setToolTipText(sToolTipParametroPlanilla);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroPlanilla);
		this.jTableDatosParametroPlanilla.setAutoCreateRowSorter(true);
		this.jTableDatosParametroPlanilla.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroPlanilla.setRowSelectionAllowed(true);
		this.jTableDatosParametroPlanilla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroPlanilla,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroPlanilla = new JButtonMe();
		this.jButtonDuplicarParametroPlanilla = new JButtonMe();
		this.jButtonCopiarParametroPlanilla = new JButtonMe();
		this.jButtonVerFormParametroPlanilla = new JButtonMe();
		this.jButtonNuevoRelacionesParametroPlanilla = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroPlanilla = new JButtonMe();
		this.jButtonCerrarParametroPlanilla = new JButtonMe();
		
		this.jScrollPanelDatosParametroPlanilla = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroPlanilla = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Planilla";
		
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Planillas" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroPlanilla.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroPlanilla.setToolTipText("Acciones");
        this.jPanelAccionesParametroPlanilla.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroPlanilla=new ReporteDinamicoJInternalFrame(ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroPlanilla();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroPlanilla=new ImportacionJInternalFrame(ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroPlanilla();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroPlanilla = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroPlanilla.setText("Orden");
		this.jButtonAbrirOrderByParametroPlanilla.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroPlanilla,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroPlanilla=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroPlanilla,false,this);
			
			//this.cargarOrderByParametroPlanilla(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroPlanilla=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroPlanilla,true,this);
			
			//this.cargarOrderByParametroPlanilla(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroPlanilla.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosParametroPlanilla.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosParametroPlanilla.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosParametroPlanilla.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroPlanilla.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroPlanilla.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroPlanilla.setText("Nuevo");
		this.jButtonDuplicarParametroPlanilla.setText("Duplicar");
		this.jButtonCopiarParametroPlanilla.setText("Copiar");
		this.jButtonVerFormParametroPlanilla.setText("Ver");
		this.jButtonNuevoRelacionesParametroPlanilla.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroPlanilla.setText("Guardar");
		this.jButtonCerrarParametroPlanilla.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroPlanilla,"nuevo_button","Nuevo",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroPlanilla,"duplicar_button","Duplicar",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroPlanilla,"copiar_button","Copiar",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroPlanilla,"ver_form","Ver",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroPlanilla,"nuevorelaciones_button","Nuevo Rel",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroPlanilla,"guardarcambiostabla_button","Guardar",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroPlanilla,"cerrar_button","Salir",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroPlanilla.setToolTipText("Nuevo"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroPlanilla.setToolTipText("Duplicar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroPlanilla.setToolTipText("Copiar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroPlanilla.setToolTipText("Ver"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroPlanilla.setToolTipText("Nuevo Rel"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroPlanilla.setToolTipText("Guardar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroPlanilla.setToolTipText("Salir"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroPlanilla";
		inputMap = this.jButtonNuevoParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroPlanilla.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroPlanilla"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroPlanilla";
		inputMap = this.jButtonDuplicarParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroPlanilla.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroPlanilla"));
		
		//COPIAR
		sMapKey = "CopiarParametroPlanilla";
		inputMap = this.jButtonCopiarParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroPlanilla.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroPlanilla"));
		
		//VEr FORM
		sMapKey = "VerFormParametroPlanilla";
		inputMap = this.jButtonVerFormParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroPlanilla.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroPlanilla"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroPlanilla";
		inputMap = this.jButtonNuevoRelacionesParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroPlanilla"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroPlanilla";
		inputMap = this.jButtonModificarParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroPlanilla"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroPlanilla";
		inputMap = this.jButtonCerrarParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroPlanilla"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroPlanilla";
		inputMap = this.jButtonGuardarCambiosTablaParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroPlanilla"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroPlanilla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroPlanilla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroPlanilla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroPlanilla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroPlanilla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroPlanilla.setName("jPanelParametrosReportesParametroPlanilla"); 
		
		this.jPanelParametrosReportesAccionesParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroPlanilla.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroPlanilla.setName("jPanelParametrosReportesAccionesParametroPlanilla"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroPlanilla = new JButtonMe();
		this.jButtonRecargarInformacionParametroPlanilla.setText("Recargar");
		this.jButtonRecargarInformacionParametroPlanilla.setToolTipText("Recargar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroPlanilla,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroPlanilla = new JButtonMe();
		this.jButtonProcesarInformacionParametroPlanilla.setText("Procesar");
		this.jButtonProcesarInformacionParametroPlanilla.setToolTipText("Procesar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroPlanilla.setVisible(false);
			
		this.jButtonProcesarInformacionParametroPlanilla.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroPlanilla.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroPlanilla.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroPlanilla = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroPlanilla.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroPlanilla.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroPlanilla = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroPlanilla.setText("TIPO");       
		this.jComboBoxTiposReportesParametroPlanilla.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroPlanilla = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroPlanilla.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroPlanilla.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroPlanilla = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroPlanilla.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroPlanilla.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroPlanilla = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroPlanilla.setText("Accion");
		this.jComboBoxTiposRelacionesParametroPlanilla.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroPlanilla = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroPlanilla.setText("Accion");
		this.jComboBoxTiposAccionesParametroPlanilla.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroPlanilla = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroPlanilla.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroPlanilla.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroPlanilla=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroPlanilla.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroPlanilla.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroPlanilla.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroPlanilla = new JLabelMe();
		
		this.jLabelAccionesParametroPlanilla.setText("Acciones");		
		this.jLabelAccionesParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroPlanilla = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroPlanilla.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroPlanilla.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroPlanilla = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroPlanilla.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroPlanilla.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroPlanilla = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroPlanilla.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroPlanilla.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroPlanilla = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroPlanilla.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroPlanilla.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroPlanilla = new JButtonMe();
		//this.jButtonAnterioresParametroPlanilla.setText("<<");
        this.jButtonAnterioresParametroPlanilla.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroPlanilla,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroPlanilla = new JButtonMe();
		//this.jButtonSiguientesParametroPlanilla.setText(">>");
        this.jButtonSiguientesParametroPlanilla.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroPlanilla,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroPlanilla = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroPlanilla.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroPlanilla.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroPlanilla,"nuevoguardarcambios_button","Nue",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroPlanilla";
		inputMap = this.jButtonNuevoGuardarCambiosParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroPlanilla"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroPlanilla";
		inputMap = this.jButtonRecargarInformacionParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroPlanilla"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroPlanilla";
		inputMap = this.jButtonSiguientesParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroPlanilla"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroPlanilla";
		inputMap = this.jButtonAnterioresParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroPlanilla"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroPlanilla();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroPlanilla.setMinimumSize(new Dimension(this.getWidth(),ParametroPlanillaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroPlanillaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroPlanilla.setMaximumSize(new Dimension(this.getWidth(),ParametroPlanillaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroPlanillaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroPlanilla.setPreferredSize(new Dimension(this.getWidth(),ParametroPlanillaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroPlanillaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroPlanilla = new GridBagLayout();

			this.jPanelPaginacionParametroPlanilla.setLayout(gridaBagLayoutPaginacionParametroPlanilla);						
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy = 0;
			this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroPlanilla.add(this.jButtonAnterioresParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
					
						
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroPlanilla.gridy = 0;
			
			this.jPanelPaginacionParametroPlanilla.add(this.jButtonNuevoGuardarCambiosParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
						
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroPlanilla.gridy = 0;
			this.jPanelPaginacionParametroPlanilla.add(this.jButtonSiguientesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy = 1;
			this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroPlanilla.add(this.jButtonNuevoParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
						
			
			
			if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
				this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroPlanilla.gridy = 1;
				this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroPlanilla.add(this.jButtonGuardarCambiosTablaParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			}
			
			
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy = 1;
			this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroPlanilla.add(this.jButtonDuplicarParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy = 1;
			this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroPlanilla.add(this.jButtonCopiarParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy = 1;
			this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroPlanilla.add(this.jButtonVerFormParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy = 1;
			this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroPlanilla.add(this.jButtonCerrarParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		
		
		
		this.jButtonRecargarInformacionParametroPlanilla.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroPlanilla.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroPlanilla.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroPlanilla.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroPlanilla.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroPlanilla.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroPlanilla.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroPlanilla.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroPlanilla.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroPlanilla.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroPlanilla.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroPlanilla.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroPlanilla.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroPlanilla.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroPlanilla.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroPlanilla.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroPlanilla.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroPlanilla.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroPlanilla.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroPlanilla.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroPlanilla.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroPlanilla.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroPlanilla.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroPlanilla.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroPlanilla.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroPlanilla.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroPlanilla.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroPlanilla.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroPlanilla.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroPlanilla.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroPlanilla.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroPlanilla.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroPlanilla.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroPlanilla.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroPlanilla.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroPlanilla.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroPlanilla = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroPlanilla = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroPlanilla = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroPlanilla = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroPlanilla = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroPlanilla = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroPlanilla.setLayout(gridaBagParametrosReportesParametroPlanilla);
			this.jPanelParametrosReportesAccionesParametroPlanilla.setLayout(gridaBagParametrosReportesAccionesParametroPlanilla);
			
			
			this.jPanelParametrosAuxiliar1ParametroPlanilla.setLayout(gridaBagParametrosAuxiliar1ParametroPlanilla);
			this.jPanelParametrosAuxiliar2ParametroPlanilla.setLayout(gridaBagParametrosAuxiliar2ParametroPlanilla);
			this.jPanelParametrosAuxiliar3ParametroPlanilla.setLayout(gridaBagParametrosAuxiliar3ParametroPlanilla);
			this.jPanelParametrosAuxiliar4ParametroPlanilla.setLayout(gridaBagParametrosAuxiliar4ParametroPlanilla);
			//this.jPanelParametrosAuxiliar5ParametroPlanilla.setLayout(gridaBagParametrosAuxiliar2ParametroPlanilla);			
			
			
			
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroPlanilla.add(this.jButtonRecargarInformacionParametroPlanilla, this.gridBagConstraintsParametroPlanilla);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroPlanilla.add(this.jComboBoxTiposPaginacionParametroPlanilla, this.gridBagConstraintsParametroPlanilla);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroPlanilla.add(this.jCheckBoxConAltoMaximoTablaParametroPlanilla, this.gridBagConstraintsParametroPlanilla);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroPlanilla.add(this.jComboBoxTiposArchivosReportesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroPlanilla.add(this.jPanelParametrosAuxiliar1ParametroPlanilla, this.gridBagConstraintsParametroPlanilla);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroPlanilla.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroPlanilla.add(this.jComboBoxTiposReportesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroPlanilla.add(this.jPanelParametrosAuxiliar4ParametroPlanilla, this.gridBagConstraintsParametroPlanilla);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroPlanilla.add(this.jComboBoxTiposReportesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroPlanilla.add(this.jCheckBoxGenerarReporteParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroPlanilla.add(this.jPanelParametrosAuxiliar2ParametroPlanilla, this.gridBagConstraintsParametroPlanilla);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroPlanilla.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroPlanilla.add(this.jLabelAccionesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
				this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroPlanilla.add(this.jButtonAbrirOrderByParametroPlanilla, this.gridBagConstraintsParametroPlanilla);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroPlanilla.add(this.jComboBoxTiposSeleccionarParametroPlanilla, this.gridBagConstraintsParametroPlanilla);			
			
			
			/*
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroPlanilla.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroPlanilla.add(this.jCheckBoxSeleccionarTodosParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroPlanilla.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroPlanilla.add(this.jCheckBoxSeleccionarTodosParametroPlanilla, this.gridBagConstraintsParametroPlanilla);															
				
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroPlanilla.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroPlanilla.add(this.jCheckBoxSeleccionadosParametroPlanilla, this.gridBagConstraintsParametroPlanilla);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroPlanilla.add(this.jPanelParametrosAuxiliar3ParametroPlanilla, this.gridBagConstraintsParametroPlanilla);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroPlanilla.add(this.jComboBoxTiposAccionesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
	
				
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroPlanilla.add(this.jTextFieldValorCampoGeneralParametroPlanilla, this.gridBagConstraintsParametroPlanilla);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroPlanilla = new GridBagLayout();

			this.jScrollPanelDatosParametroPlanilla.setLayout(gridaBagLayoutDatosParametroPlanilla);
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy = 0;
			this.gridBagConstraintsParametroPlanilla.gridx = 0;
			
			this.jScrollPanelDatosParametroPlanilla.add(this.jTableDatosParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroPlanilla.setViewportView(this.jTableDatosParametroPlanilla);
		this.jTableDatosParametroPlanilla.setFillsViewportHeight(true);
		this.jTableDatosParametroPlanilla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroPlanilla= new GridBagLayout();
		this.jPanelAccionesParametroPlanilla.setLayout(gridaBagLayoutAccionesParametroPlanilla);
		
		
		/*	
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.gridy = 0;
		this.gridBagConstraintsParametroPlanilla.gridx = 0;
			
		this.jPanelAccionesParametroPlanilla.add(this.jButtonNuevoParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableFinalParametroPlanilla= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableFinalParametroPlanilla.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFinalParametroPlanilla.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFinalParametroPlanilla.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableFinalParametroPlanilla.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableFinalParametroPlanilla.setLayout(gridaBagLayoutFK_IdCuentaContableFinalParametroPlanilla);

		gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroPlanilla.gridy = 0;
		gridBagConstraintsParametroPlanilla.gridx = 0;
		jPanelFK_IdCuentaContableFinalParametroPlanilla.add(jLabelid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla, gridBagConstraintsParametroPlanilla);

		gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroPlanilla.gridy = 0;
		gridBagConstraintsParametroPlanilla.gridx = 1;
		jPanelFK_IdCuentaContableFinalParametroPlanilla.add(jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla, gridBagConstraintsParametroPlanilla);


		gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.EAST;
		gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.NONE;
		gridBagConstraintsParametroPlanilla.gridy = 0;
		gridBagConstraintsParametroPlanilla.gridx = 0;
		jPanelFK_IdCuentaContableFinalParametroPlanilla.add(this.jButtonBuscarFK_IdCuentaContableFinalid_cuenta_contable_finalParametroPlanilla, gridBagConstraintsParametroPlanilla);

		gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroPlanilla.gridy = 1;
		gridBagConstraintsParametroPlanilla.gridx =1;
		jPanelFK_IdCuentaContableFinalParametroPlanilla.add(jButtonFK_IdCuentaContableFinalParametroPlanilla, gridBagConstraintsParametroPlanilla);

		jTabbedPaneBusquedasParametroPlanilla.addTab("1.-Por Cuenta C. Final ", jPanelFK_IdCuentaContableFinalParametroPlanilla);
		jTabbedPaneBusquedasParametroPlanilla.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableInicialParametroPlanilla= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableInicialParametroPlanilla.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableInicialParametroPlanilla.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableInicialParametroPlanilla.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableInicialParametroPlanilla.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableInicialParametroPlanilla.setLayout(gridaBagLayoutFK_IdCuentaContableInicialParametroPlanilla);

		gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroPlanilla.gridy = 0;
		gridBagConstraintsParametroPlanilla.gridx = 0;
		jPanelFK_IdCuentaContableInicialParametroPlanilla.add(jLabelid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla, gridBagConstraintsParametroPlanilla);

		gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroPlanilla.gridy = 0;
		gridBagConstraintsParametroPlanilla.gridx = 1;
		jPanelFK_IdCuentaContableInicialParametroPlanilla.add(jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla, gridBagConstraintsParametroPlanilla);


		gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.EAST;
		gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.NONE;
		gridBagConstraintsParametroPlanilla.gridy = 0;
		gridBagConstraintsParametroPlanilla.gridx = 0;
		jPanelFK_IdCuentaContableInicialParametroPlanilla.add(this.jButtonBuscarFK_IdCuentaContableInicialid_cuenta_contable_inicialParametroPlanilla, gridBagConstraintsParametroPlanilla);

		gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroPlanilla.gridy = 1;
		gridBagConstraintsParametroPlanilla.gridx =1;
		jPanelFK_IdCuentaContableInicialParametroPlanilla.add(jButtonFK_IdCuentaContableInicialParametroPlanilla, gridBagConstraintsParametroPlanilla);

		jTabbedPaneBusquedasParametroPlanilla.addTab("2.-Por Cuenta C. Inicial ", jPanelFK_IdCuentaContableInicialParametroPlanilla);
		jTabbedPaneBusquedasParametroPlanilla.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroPlanilla = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroPlanilla);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();						
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroPlanilla.gridx = 0;		
			//this.gridBagConstraintsParametroPlanilla.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroPlanilla.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroPlanilla, this.gridBagConstraintsParametroPlanilla);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroPlanilla.gridx = 0;		
		//this.gridBagConstraintsParametroPlanilla.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroPlanilla.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroPlanilla);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroPlanilla.gridx = 0;		
			this.gridBagConstraintsParametroPlanilla.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroPlanilla.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroPlanilla, this.gridBagConstraintsParametroPlanilla);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroPlanilla.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);								
		
		
		/*
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroPlanilla.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		*/		
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroPlanilla.gridx =0;
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroPlanilla.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
				
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroPlanilla.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroPlanillaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroPlanilla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroPlanilla = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroPlanilla.setLayout(gridaBagLayoutBusquedasParametrosParametroPlanilla);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroPlanilla=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroPlanilla.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroPlanilla.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroPlanilla.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroPlanilla.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			
			
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroPlanilla.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		
			
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroPlanilla.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroPlanilla;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroPlanilla() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroPlanilla = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroPlanilla.setName("jPanelReporteDinamicoParametroPlanilla"); 
		
		this.jPanelReporteDinamicoParametroPlanilla.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroPlanilla.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroPlanilla.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroPlanilla.setLayout(gridaBagLayoutReporteDinamicoParametroPlanilla);
		
		
		this.jInternalFrameReporteDinamicoParametroPlanilla= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroPlanilla = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroPlanilla= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroPlanilla.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroPlanilla.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroPlanilla.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroPlanilla.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroPlanilla.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroPlanilla.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroPlanilla.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroPlanilla.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroPlanilla.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroPlanilla.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroPlanilla.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Planillas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroPlanilla = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroPlanilla.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroPlanilla.add(this.jLabelColumnasSelectReporteParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroPlanilla = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroPlanilla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroPlanilla.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroPlanilla.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroPlanilla.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroPlanilla.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroPlanilla=new JScrollPane(this.jListColumnasSelectReporteParametroPlanilla);
			
			this.jScrollColumnasSelectReporteParametroPlanilla.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroPlanilla.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroPlanilla.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroPlanilla.add(this.jListColumnasSelectReporteParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		this.jPanelReporteDinamicoParametroPlanilla.add(this.jScrollColumnasSelectReporteParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroPlanilla = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroPlanilla.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroPlanilla = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroPlanilla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroPlanilla.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroPlanilla.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroPlanilla.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroPlanilla.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroPlanilla=new JScrollPane(this.jListRelacionesSelectReporteParametroPlanilla);
			
			this.jScrollRelacionesSelectReporteParametroPlanilla.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroPlanilla.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroPlanilla.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroPlanilla = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroPlanilla = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroPlanilla = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroPlanilla = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroPlanilla.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroPlanilla.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroPlanilla.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroPlanilla.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroPlanilla = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroPlanilla.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroPlanilla.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroPlanilla.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroPlanilla.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroPlanilla = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroPlanilla.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroPlanilla.add(this.jLabelGenerarExcelReporteDinamicoParametroPlanilla, this.gridBagConstraintsParametroPlanilla);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroPlanilla = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroPlanilla.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroPlanilla,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroPlanilla.setToolTipText("Generar EXCEL"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		//this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroPlanilla.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroPlanilla.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroPlanilla.add(this.jButtonGenerarExcelReporteDinamicoParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroPlanilla.add(this.jComboBoxTiposReportesDinamicoParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroPlanilla = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroPlanilla.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroPlanilla.add(this.jLabelTiposArchivoReporteDinamicoParametroPlanilla, this.gridBagConstraintsParametroPlanilla);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroPlanilla.add(this.jComboBoxTiposArchivosReportesDinamicoParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroPlanilla = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroPlanilla.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroPlanilla,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroPlanilla.setToolTipText("Generar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroPlanilla.add(this.jButtonGenerarReporteDinamicoParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroPlanilla = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroPlanilla.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroPlanilla,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroPlanilla.setToolTipText("Cancelar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroPlanilla.add(this.jButtonCerrarReporteDinamicoParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroPlanilla = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroPlanilla= new JScrollPane(jPanelReporteDinamicoParametroPlanilla,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroPlanilla.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroPlanilla.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroPlanilla.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Planillas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroPlanilla.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroPlanilla.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroPlanilla.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroPlanilla);
		this.jInternalFrameReporteDinamicoParametroPlanilla.getContentPane().add(this.jScrollPanelReporteDinamicoParametroPlanilla, this.gridBagConstraintsParametroPlanilla);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroPlanilla() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroPlanilla = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroPlanilla.setName("jPanelImportacionParametroPlanilla"); 
		
		this.jPanelImportacionParametroPlanilla.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroPlanilla.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroPlanilla.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroPlanilla.setLayout(gridaBagLayoutImportacionParametroPlanilla);
		
		
		this.jInternalFrameImportacionParametroPlanilla= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroPlanilla= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroPlanilla = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroPlanilla= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroPlanilla.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroPlanilla.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroPlanilla.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroPlanilla.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroPlanilla.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroPlanilla.setResizable(true);
	    this.jInternalFrameImportacionParametroPlanilla.setClosable(true);
	    this.jInternalFrameImportacionParametroPlanilla.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroPlanilla.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroPlanilla.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroPlanilla.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroPlanilla.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroPlanilla.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroPlanilla.setResizable(true);
	    this.jInternalFrameImportacionParametroPlanilla.setClosable(true);
	    this.jInternalFrameImportacionParametroPlanilla.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroPlanilla.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroPlanilla.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroPlanilla.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Planillas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroPlanilla = new JLabelMe();

		this.jLabelArchivoImportacionParametroPlanilla.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroPlanilla.add(this.jLabelArchivoImportacionParametroPlanilla, this.gridBagConstraintsParametroPlanilla);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroPlanilla = new JFileChooser();		
		this.jFileChooserImportacionParametroPlanilla.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroPlanilla = new JButtonMe();
		this.jButtonAbrirImportacionParametroPlanilla.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroPlanilla,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroPlanilla.setToolTipText("Generar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroPlanilla.add(this.jButtonAbrirImportacionParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroPlanilla = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroPlanilla.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroPlanilla.add(this.jLabelPathArchivoImportacionParametroPlanilla, this.gridBagConstraintsParametroPlanilla);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroPlanilla=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroPlanilla.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroPlanilla.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroPlanilla.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroPlanilla.add(this.jTextFieldPathArchivoImportacionParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroPlanilla = new JButtonMe();
		this.jButtonGenerarImportacionParametroPlanilla.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroPlanilla,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroPlanilla.setToolTipText("Generar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroPlanilla.add(this.jButtonGenerarImportacionParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroPlanilla = new JButtonMe();
		this.jButtonCerrarImportacionParametroPlanilla.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroPlanilla,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroPlanilla.setToolTipText("Cancelar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroPlanilla.add(this.jButtonCerrarImportacionParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroPlanilla = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroPlanilla= new JScrollPane(jPanelImportacionParametroPlanilla,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroPlanilla.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroPlanilla.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroPlanilla.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroPlanilla);
		this.jInternalFrameImportacionParametroPlanilla.getContentPane().add(this.jScrollPanelImportacionParametroPlanilla, this.gridBagConstraintsParametroPlanilla);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroPlanilla(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroPlanilla = new JButtonMe();
			this.jButtonAbrirOrderByParametroPlanilla.setText("Orden");
			this.jButtonAbrirOrderByParametroPlanilla.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroPlanilla,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroPlanilla";
			inputMap = this.jButtonAbrirOrderByParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroPlanilla"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroPlanilla = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroPlanilla.setName("jPanelOrderByParametroPlanilla"); 
			
			this.jPanelOrderByParametroPlanilla.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroPlanilla.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroPlanilla.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroPlanilla.setLayout(gridaBagLayoutOrderByParametroPlanilla);
			
			
			this.jTableDatosParametroPlanillaOrderBy = new JTableMe();        
			this.jTableDatosParametroPlanillaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroPlanillaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroPlanillaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroPlanillaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroPlanillaOrderBy.setViewportView(this.jTableDatosParametroPlanillaOrderBy);
			this.jTableDatosParametroPlanillaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroPlanillaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroPlanilla= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroPlanilla= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroPlanilla = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroPlanilla= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroPlanilla.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroPlanilla.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroPlanilla.setTitle("Orden");
			this.jInternalFrameOrderByParametroPlanilla.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroPlanilla.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroPlanilla.setResizable(true);
			this.jInternalFrameOrderByParametroPlanilla.setClosable(true);
			this.jInternalFrameOrderByParametroPlanilla.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroPlanilla.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroPlanilla.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroPlanilla.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Planillas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroPlanilla.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroPlanilla.ipady =150;
				
			this.jPanelOrderByParametroPlanilla.add(jScrollPanelDatosParametroPlanillaOrderBy, this.gridBagConstraintsParametroPlanilla);//this.jTableDatosParametroPlanillaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroPlanilla = new JButtonMe();
			this.jButtonCerrarOrderByParametroPlanilla.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroPlanilla,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroPlanilla.setToolTipText("Cancelar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroPlanilla.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroPlanilla.add(this.jButtonCerrarOrderByParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroPlanilla = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroPlanilla= new JScrollPane(jPanelOrderByParametroPlanilla,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroPlanilla.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroPlanilla.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroPlanilla.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroPlanilla);
			
			this.jInternalFrameOrderByParametroPlanilla.getContentPane().add(this.jScrollPanelOrderByParametroPlanilla, this.gridBagConstraintsParametroPlanilla);			
		
		} else {
			this.jButtonAbrirOrderByParametroPlanilla = new JButtonMe();
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
			&& this.parametroplanillaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroPlanilla.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroPlanilla.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroPlanilla.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroPlanilla.getRowHeight();//ParametroPlanillaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroPlanillaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroPlanilla.isSelected()) {
					iHeightTable=ParametroPlanillaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroPlanillaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroPlanillaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroPlanillaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroPlanilla.isSelected()) {
					iHeightTable=ParametroPlanillaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroPlanillaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroPlanillaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroPlanilla.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroPlanilla.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroPlanilla.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroPlanilla.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroPlanilla.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroPlanilla.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroPlanilla!=null && this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy()!=null) {
			//if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroPlanilla.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroPlanilla.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroPlanilla.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroPlanilla.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroPlanilla.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroPlanilla.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametroplanillaLogic.getParametroPlanillas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroplanillas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroPlanilla> TraerParametroPlanillaBeans(List<ParametroPlanilla> parametroplanillas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroPlanilla parametroplanilla:parametroplanillas) {
					
				if(!(ParametroPlanillaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroPlanillaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametroplanilla.setsDetalleGeneralEntityReporte(ParametroPlanillaConstantesFunciones.getParametroPlanillaDescripcion(parametroplanilla));
										
						
					
						
					
				} else  {
							
					//parametroplanilla.setsDetalleGeneralEntityReporte(parametroplanilla.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametroplanillabeans.add(parametroplanillabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametroplanillas;
    }
	//PARA REPORTES FIN
}
