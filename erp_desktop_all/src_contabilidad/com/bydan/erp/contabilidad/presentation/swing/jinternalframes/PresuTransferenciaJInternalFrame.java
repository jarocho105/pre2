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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.contabilidad.util.PresuTransferenciaConstantesFunciones;

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
public class PresuTransferenciaJInternalFrame extends PresuTransferenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresuTransferencia;
	
	protected JMenuBar jmenuBarPresuTransferencia;
	
	protected JMenu jmenuPresuTransferencia;
	protected JMenu jmenuDatosPresuTransferencia;
	protected JMenu jmenuArchivoPresuTransferencia;
	protected JMenu jmenuAccionesPresuTransferencia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuTransferencia;	
	protected GridBagConstraints gridBagConstraintsPresuTransferencia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresuTransferenciaDetalleFormJInternalFrame jInternalFrameDetalleFormPresuTransferencia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresuTransferencia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresuTransferencia;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PresuProyectoBeanSwingJInternalFrame presuproyectoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuproyecto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledestino="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public PresuTransferenciaSessionBean presutransferenciaSessionBean;
		
	
	
	public PresuProyectoSessionBean presuproyectoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontabledestinoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresuTransferencia> presutransferencias;		
	public List<PresuTransferencia> presutransferenciasEliminados;	
	public List<PresuTransferencia> presutransferenciasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresuTransferencia;		
	protected JButton jButtonAbrirOrderByPresuTransferencia;
	
	
	//protected JPanel jPanelOrderByPresuTransferencia;
	//public JScrollPane jScrollPanelOrderByPresuTransferencia;	
	//protected JButton jButtonCerrarOrderByPresuTransferencia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresuTransferenciaLogic presutransferenciaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresuTransferencia;
	public JScrollPane jScrollPanelDatosEdicionPresuTransferencia;
	public JScrollPane jScrollPanelDatosGeneralPresuTransferencia;
    
	
	
	//public JScrollPane jScrollPanelDatosPresuTransferenciaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresuTransferencia;
	//public JScrollPane jScrollPanelImportacionPresuTransferencia;
	
	
	
	protected JPanel jPanelAccionesPresuTransferencia;
	
    protected JPanel jPanelPaginacionPresuTransferencia;
    protected JPanel jPanelParametrosReportesPresuTransferencia;
	protected JPanel jPanelParametrosReportesAccionesPresuTransferencia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresuTransferencia;
	protected JPanel jPanelParametrosAuxiliar2PresuTransferencia;
	protected JPanel jPanelParametrosAuxiliar3PresuTransferencia;
	protected JPanel jPanelParametrosAuxiliar4PresuTransferencia;
	//protected JPanel jPanelParametrosAuxiliar5PresuTransferencia;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresuTransferencia;
	//protected JPanel jPanelImportacionPresuTransferencia;
	
	
	public JTable jTableDatosPresuTransferencia;
	
	
	
	//public JTable jTableDatosPresuTransferenciaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresuTransferencia;
	protected JButton jButtonDuplicarPresuTransferencia;
	protected JButton jButtonCopiarPresuTransferencia;
	protected JButton jButtonVerFormPresuTransferencia;
	protected JButton jButtonNuevoRelacionesPresuTransferencia;
	protected JButton jButtonModificarPresuTransferencia;
	
    protected JButton jButtonGuardarCambiosTablaPresuTransferencia;
	protected JButton jButtonCerrarPresuTransferencia;
	
	
	protected JButton jButtonRecargarInformacionPresuTransferencia;
	protected JButton jButtonProcesarInformacionPresuTransferencia;
	
	
	protected JButton jButtonAnterioresPresuTransferencia;
	protected JButton jButtonSiguientesPresuTransferencia;
	protected JButton jButtonNuevoGuardarCambiosPresuTransferencia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresuTransferencia;
	//protected JButton jButtonCerrarReporteDinamicoPresuTransferencia;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresuTransferencia;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresuTransferencia;
	//protected JButton jButtonGenerarImportacionPresuTransferencia;
	//protected JButton jButtonCerrarImportacionPresuTransferencia;
	//protected JFileChooser jFileChooserImportacionPresuTransferencia;
	//protected File fileImportacionPresuTransferencia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuTransferencia;
	protected JButton jButtonDuplicarToolBarPresuTransferencia;
	protected JButton jButtonNuevoRelacionesToolBarPresuTransferencia;
	
	
	public JButton jButtonGuardarCambiosToolBarPresuTransferencia;
	protected JButton jButtonCopiarToolBarPresuTransferencia;
	protected JButton jButtonVerFormToolBarPresuTransferencia;
	public JButton jButtonGuardarCambiosTablaToolBarPresuTransferencia;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuTransferencia;
	protected JButton jButtonCerrarToolBarPresuTransferencia;
	
	protected JButton jButtonRecargarInformacionToolBarPresuTransferencia;
	protected JButton jButtonProcesarInformacionToolBarPresuTransferencia;
	protected JButton jButtonAnterioresToolBarPresuTransferencia;
	protected JButton jButtonSiguientesToolBarPresuTransferencia;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresuTransferencia;
	protected JButton jButtonAbrirOrderByToolBarPresuTransferencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuTransferencia;
	protected JMenuItem jMenuItemDuplicarPresuTransferencia;
	protected JMenuItem jMenuItemNuevoRelacionesPresuTransferencia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresuTransferencia;
	protected JMenuItem jMenuItemCopiarPresuTransferencia;
	protected JMenuItem jMenuItemVerFormPresuTransferencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuTransferencia;
	protected JMenuItem jMenuItemCerrarPresuTransferencia;
	protected JMenuItem jMenuItemDetalleCerrarPresuTransferencia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresuTransferencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuTransferencia;
	
	protected JMenuItem jMenuItemRecargarInformacionPresuTransferencia;
	protected JMenuItem jMenuItemProcesarInformacionPresuTransferencia;
	protected JMenuItem jMenuItemAnterioresPresuTransferencia;
	protected JMenuItem jMenuItemSiguientesPresuTransferencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuTransferencia;
	protected JMenuItem jMenuItemAbrirOrderByPresuTransferencia;
	protected JMenuItem jMenuItemMostrarOcultarPresuTransferencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuTransferencia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresuTransferencia;
	protected JCheckBox jCheckBoxSeleccionadosPresuTransferencia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresuTransferencia;
	protected JCheckBox jCheckBoxConGraficoReportePresuTransferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresuTransferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresuTransferencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresuTransferencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresuTransferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresuTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresuTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresuTransferencia;
	protected JTextField jTextFieldValorCampoGeneralPresuTransferencia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresuTransferencia;
	//public JList<Reporte> jListColumnasSelectReportePresuTransferencia;
	//public JScrollPane jScrollColumnasSelectReportePresuTransferencia;
	
	//public JLabel jLabelRelacionesSelectReportePresuTransferencia;
	//public JList<Reporte> jListRelacionesSelectReportePresuTransferencia;
	//public JScrollPane jScrollRelacionesSelectReportePresuTransferencia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresuTransferencia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresuTransferencia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresuTransferencia;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresuTransferencia;
	
		
	//public JLabel jLabelArchivoImportacionPresuTransferencia;	
	//public JLabel jLabelPathArchivoImportacionPresuTransferencia;
	//protected JTextField jTextFieldPathArchivoImportacionPresuTransferencia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresuTransferencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresuTransferencia;
	
	//public JLabel jLabelColumnaCategoriaValorPresuTransferencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresuTransferencia;
	
	//public JLabel jLabelColumnasValoresGraficoPresuTransferencia;
	//public JList<Reporte> jListColumnasValoresGraficoPresuTransferencia;
	//public JScrollPane jScrollColumnasValoresGraficoPresuTransferencia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresuTransferencia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresuTransferencia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresuTransferencia;
	public JPanel jPanelFK_IdCuentaContablePresuTransferencia;
	public JButton jButtonFK_IdCuentaContablePresuTransferencia;
	public JPanel jPanelFK_IdCuentaContableDestinoPresuTransferencia;
	public JButton jButtonFK_IdCuentaContableDestinoPresuTransferencia;
	public JPanel jPanelFK_IdEmpleadoPresuTransferencia;
	public JButton jButtonFK_IdEmpleadoPresuTransferencia;
	public JPanel jPanelFK_IdPresuProyectoPresuTransferencia;
	public JButton jButtonFK_IdPresuProyectoPresuTransferencia;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContablePresuTransferencia;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContablePresuTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresuTransferencia= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresuTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresuTransferenciaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresuTransferenciaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuTransferencia;
	
	public JPanel jPanelid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia;
	public JLabel jLabelid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia;
	public JButton jButtonid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia= new JButtonMe();
	public JButton jButtonid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferenciaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferenciaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableDestinoid_cuenta_contable_destinoPresuTransferencia;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoPresuTransferencia;
	public JLabel jLabelid_empleadoFK_IdEmpleadoPresuTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia;
	public JButton jButtonid_empleadoFK_IdEmpleadoPresuTransferencia= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPresuTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPresuTransferenciaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoPresuTransferencia;
	
	public JPanel jPanelid_presu_proyectoFK_IdPresuProyectoPresuTransferencia;
	public JLabel jLabelid_presu_proyectoFK_IdPresuProyectoPresuTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia;
	public JButton jButtonid_presu_proyectoFK_IdPresuProyectoPresuTransferencia= new JButtonMe();
	public JButton jButtonid_presu_proyectoFK_IdPresuProyectoPresuTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_presu_proyectoFK_IdPresuProyectoPresuTransferenciaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PresuTransferenciaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresuTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTransferenciaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTransferenciaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTransferenciaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresuTransferencia)	{
		this.jButtonRecargarInformacionPresuTransferencia = jButtonRecargarInformacionPresuTransferencia;
	}
	
	public JButton getjButtonProcesarInformacionPresuTransferencia() {
		return this.jButtonProcesarInformacionPresuTransferencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuTransferencia)	{
		this.jButtonProcesarInformacionPresuTransferencia = jButtonProcesarInformacionPresuTransferencia;
	}
	
	
	public JButton getjButtonRecargarInformacionPresuTransferencia() {
		return this.jButtonRecargarInformacionPresuTransferencia;
	}
	
	
	public List<PresuTransferencia> getpresutransferencias() {
		return this.presutransferencias;
	}

	public void setpresutransferencias(List<PresuTransferencia> presutransferencias) {
		this.presutransferencias = presutransferencias;
	}
	
	public List<PresuTransferencia> getpresutransferenciasAux() {
		return this.presutransferenciasAux;
	}

	public void setpresutransferenciasAux(List<PresuTransferencia> presutransferenciasAux) {
		this.presutransferenciasAux = presutransferenciasAux;
	}
	
	public List<PresuTransferencia> getpresutransferenciasEliminados() {
		return this.presutransferenciasEliminados;
	}

	public void setPresuTransferenciasEliminados(List<PresuTransferencia> presutransferenciasEliminados) {
		this.presutransferenciasEliminados = presutransferenciasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresuTransferencia() {
		return jComboBoxTiposSeleccionarPresuTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresuTransferencia(
			JComboBox jComboBoxTiposSeleccionarPresuTransferencia) {
		this.jComboBoxTiposSeleccionarPresuTransferencia = jComboBoxTiposSeleccionarPresuTransferencia;
	}
	
	public void setBorderResaltarTiposSeleccionarPresuTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresuTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresuTransferencia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresuTransferencia() {
		return jTextFieldValorCampoGeneralPresuTransferencia;
	}

	public void setjTextFieldValorCampoGeneralPresuTransferencia(
			JTextField jTextFieldValorCampoGeneralPresuTransferencia) {
		this.jTextFieldValorCampoGeneralPresuTransferencia = jTextFieldValorCampoGeneralPresuTransferencia;
	}

	public void setBorderResaltarValorCampoGeneralPresuTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTransferencia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresuTransferencia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresuTransferencia() {
		return this.jCheckBoxSeleccionarTodosPresuTransferencia;
	}

	public void setjCheckBoxSeleccionarTodosPresuTransferencia(
			JCheckBox jCheckBoxSeleccionarTodosPresuTransferencia) {
		this.jCheckBoxSeleccionarTodosPresuTransferencia = jCheckBoxSeleccionarTodosPresuTransferencia;
	}

	public void setBorderResaltarSeleccionarTodosPresuTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTransferencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresuTransferencia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresuTransferencia() {
		return this.jCheckBoxSeleccionadosPresuTransferencia;
	}

	public void setjCheckBoxSeleccionadosPresuTransferencia(
			JCheckBox jCheckBoxSeleccionadosPresuTransferencia) {
		this.jCheckBoxSeleccionadosPresuTransferencia = jCheckBoxSeleccionadosPresuTransferencia;
	}
	
	public void setBorderResaltarSeleccionadosPresuTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTransferencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresuTransferencia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresuTransferencia() {
		return this.jComboBoxTiposArchivosReportesPresuTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresuTransferencia(
			JComboBox jComboBoxTiposArchivosReportesPresuTransferencia) {
		this.jComboBoxTiposArchivosReportesPresuTransferencia = jComboBoxTiposArchivosReportesPresuTransferencia;
	}

	public void setBorderResaltarTiposArchivosReportesPresuTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresuTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresuTransferencia() {
		return this.jComboBoxTiposReportesPresuTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresuTransferencia(
			JComboBox jComboBoxTiposReportesPresuTransferencia) {
		this.jComboBoxTiposReportesPresuTransferencia = jComboBoxTiposReportesPresuTransferencia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresuTransferencia() {
	//	return jComboBoxTiposReportesDinamicoPresuTransferencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresuTransferencia(
	//		JComboBox jComboBoxTiposReportesDinamicoPresuTransferencia) {
	//	this.jComboBoxTiposReportesDinamicoPresuTransferencia = jComboBoxTiposReportesDinamicoPresuTransferencia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresuTransferencia() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresuTransferencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresuTransferencia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresuTransferencia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresuTransferencia = jComboBoxTiposArchivosReportesDinamicoPresuTransferencia;
	//}
	
	public void setBorderResaltarTiposReportesPresuTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresuTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresuTransferencia() {
		return this.jComboBoxTiposGraficosReportesPresuTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresuTransferencia(
			JComboBox jComboBoxTiposGraficosReportesPresuTransferencia) {
		this.jComboBoxTiposGraficosReportesPresuTransferencia = jComboBoxTiposGraficosReportesPresuTransferencia;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresuTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresuTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresuTransferencia() {
		return this.jComboBoxTiposPaginacionPresuTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresuTransferencia(
			JComboBox jComboBoxTiposPaginacionPresuTransferencia) {
		this.jComboBoxTiposPaginacionPresuTransferencia = jComboBoxTiposPaginacionPresuTransferencia;
	}
	
	public void setBorderResaltarTiposPaginacionPresuTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresuTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresuTransferencia() {
		return this.jComboBoxTiposRelacionesPresuTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuTransferencia() {
		return this.jComboBoxTiposAccionesPresuTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuTransferencia(
			JComboBox jComboBoxTiposRelacionesPresuTransferencia) {
		this.jComboBoxTiposRelacionesPresuTransferencia = jComboBoxTiposRelacionesPresuTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuTransferencia(
			JComboBox jComboBoxTiposAccionesPresuTransferencia) {
		this.jComboBoxTiposAccionesPresuTransferencia = jComboBoxTiposAccionesPresuTransferencia;
	}
	
	public void setBorderResaltarTiposRelacionesPresuTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresuTransferencia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresuTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresuTransferencia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresuTransferencia() {
	//	return jCheckBoxConGraficoDinamicoPresuTransferencia;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresuTransferencia(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresuTransferencia) {
	//	this.jCheckBoxConGraficoDinamicoPresuTransferencia = jCheckBoxConGraficoDinamicoPresuTransferencia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresuTransferencia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresuTransferencia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresuTransferencia .setBorder(borderResaltar);		
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
		this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
		
		this.presutransferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presutransferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presutransferenciaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresuTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresuTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuTransferenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transferencia MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
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
		
		PresuTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresuTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresuTransferencia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"nuevo","nuevo","Nuevo"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"duplicar","duplicar","Duplicar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"copiar","copiar","Copiar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"ver_form","ver_form","Ver"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"recargar","recargar","Recargar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresuTransferencia,this.jTtoolBarPresuTransferencia,
							"cerrar","cerrar","Salir"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresuTransferencia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresuTransferencia;
			
				this.jButtonProcesarInformacionToolBarPresuTransferencia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresuTransferencia;
				
		//protected JButton jButtonModificarToolBarPresuTransferencia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresuTransferencia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresuTransferencia=new JMenuMe("General");
		this.jmenuArchivoPresuTransferencia=new JMenuMe("Archivo");
		this.jmenuAccionesPresuTransferencia=new JMenuMe("Acciones");
		this.jmenuDatosPresuTransferencia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuTransferencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuTransferencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuTransferencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresuTransferencia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresuTransferencia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresuTransferencia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresuTransferencia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresuTransferencia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresuTransferencia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresuTransferencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuTransferencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuTransferencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresuTransferencia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresuTransferencia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresuTransferencia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresuTransferencia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresuTransferencia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresuTransferencia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresuTransferencia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresuTransferencia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresuTransferencia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuTransferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuTransferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuTransferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresuTransferencia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresuTransferencia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresuTransferencia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresuTransferencia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresuTransferencia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresuTransferencia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresuTransferencia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresuTransferencia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresuTransferencia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresuTransferencia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresuTransferencia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresuTransferencia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresuTransferencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresuTransferencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresuTransferencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresuTransferencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresuTransferencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresuTransferencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresuTransferencia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresuTransferencia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresuTransferencia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresuTransferencia.add(this.jMenuItemCerrarPresuTransferencia);
			
			this.jmenuAccionesPresuTransferencia.add(this.jMenuItemNuevoPresuTransferencia);
			this.jmenuAccionesPresuTransferencia.add(this.jMenuItemNuevoGuardarCambiosPresuTransferencia);
			this.jmenuAccionesPresuTransferencia.add(this.jMenuItemNuevoRelacionesPresuTransferencia);
			this.jmenuAccionesPresuTransferencia.add(this.jMenuItemGuardarCambiosTablaPresuTransferencia);		
			this.jmenuAccionesPresuTransferencia.add(this.jMenuItemDuplicarPresuTransferencia);		
			this.jmenuAccionesPresuTransferencia.add(this.jMenuItemCopiarPresuTransferencia);		
			this.jmenuAccionesPresuTransferencia.add(this.jMenuItemVerFormPresuTransferencia);		
			
			this.jmenuDatosPresuTransferencia.add(this.jMenuItemRecargarInformacionPresuTransferencia);				
			this.jmenuDatosPresuTransferencia.add(this.jMenuItemAnterioresPresuTransferencia);				
			this.jmenuDatosPresuTransferencia.add(this.jMenuItemSiguientesPresuTransferencia);				
			this.jmenuDatosPresuTransferencia.add(this.jMenuItemAbrirOrderByPresuTransferencia);				
			this.jmenuDatosPresuTransferencia.add(this.jMenuItemMostrarOcultarPresuTransferencia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresuTransferencia.add(this.jMenuItemGuardarCambiosPresuTransferencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresuTransferencia.add(this.jmenuArchivoPresuTransferencia);		
			this.jmenuBarPresuTransferencia.add(this.jmenuAccionesPresuTransferencia);		
			this.jmenuBarPresuTransferencia.add(this.jmenuDatosPresuTransferencia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresuTransferencia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresuTransferencia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContablePresuTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContablePresuTransferencia.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContablePresuTransferencia= new JButtonMe();
		this.jButtonFK_IdCuentaContablePresuTransferencia.setText("Buscar");
		this.jButtonFK_IdCuentaContablePresuTransferencia.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContablePresuTransferencia,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContablePresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContablePresuTransferencia = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContablePresuTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuTransferencia= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuTransferencia.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuTransferencia.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuTransferencia.setFocusable(false);

		this.jPanelFK_IdCuentaContableDestinoPresuTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDestinoPresuTransferencia.setToolTipText("Buscar Por Cuenta Contable Destino ");
		this.jButtonFK_IdCuentaContableDestinoPresuTransferencia= new JButtonMe();
		this.jButtonFK_IdCuentaContableDestinoPresuTransferencia.setText("Buscar");
		this.jButtonFK_IdCuentaContableDestinoPresuTransferencia.setToolTipText("Buscar Por Cuenta Contable Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDestinoPresuTransferencia,"buscar_button","Buscar Por Cuenta Contable Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDestinoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia = new JLabelMe();
		jLabelid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setText("Cuenta Contable Destino :");
		jLabelid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setToolTipText("Cuenta Contable Destino");
		jLabelid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia= new JComboBoxMe();
		jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableDestinoid_cuenta_contable_destinoPresuTransferencia= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableDestinoid_cuenta_contable_destinoPresuTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDestinoid_cuenta_contable_destinoPresuTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDestinoid_cuenta_contable_destinoPresuTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableDestinoid_cuenta_contable_destinoPresuTransferencia.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDestinoid_cuenta_contable_destinoPresuTransferencia.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDestinoid_cuenta_contable_destinoPresuTransferencia.setFocusable(false);

		this.jPanelFK_IdEmpleadoPresuTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoPresuTransferencia.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoPresuTransferencia= new JButtonMe();
		this.jButtonFK_IdEmpleadoPresuTransferencia.setText("Buscar");
		this.jButtonFK_IdEmpleadoPresuTransferencia.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoPresuTransferencia,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoPresuTransferencia = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoPresuTransferencia.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoPresuTransferencia.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuTransferencia= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuTransferencia.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuTransferencia.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuTransferencia.setFocusable(false);

		this.jPanelFK_IdPresuProyectoPresuTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPresuProyectoPresuTransferencia.setToolTipText("Buscar Por Proyecto ");
		this.jButtonFK_IdPresuProyectoPresuTransferencia= new JButtonMe();
		this.jButtonFK_IdPresuProyectoPresuTransferencia.setText("Buscar");
		this.jButtonFK_IdPresuProyectoPresuTransferencia.setToolTipText("Buscar Por Proyecto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPresuProyectoPresuTransferencia,"buscar_button","Buscar Por Proyecto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPresuProyectoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuTransferencia = new JLabelMe();
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setText("Proyecto :");
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setToolTipText("Proyecto");
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_presu_proyectoFK_IdPresuProyectoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia= new JComboBoxMe();
		jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPresuTransferencia=new JTabbedPane();


		this.jTabbedPaneBusquedasPresuTransferencia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuTransferencia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuTransferencia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresuTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresuTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresuTransferencia = new PresuTransferenciaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transferencia DATOS");
			this.jInternalFrameDetalleFormPresuTransferencia = new PresuTransferenciaDetalleFormJInternalFrame(jDesktopPane,this.presutransferenciaSessionBean.getConGuardarRelaciones(),this.presutransferenciaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresuTransferencia = null;//new PresuTransferenciaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuTransferencia= new GridBagLayout();
		
		
		this.jTableDatosPresuTransferencia = new JTableMe();      
		
		String sToolTipPresuTransferencia="";
		sToolTipPresuTransferencia=PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuTransferencia+="(Contabilidad.PresuTransferencia)";
		}
		
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuTransferencia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresuTransferencia.setToolTipText(sToolTipPresuTransferencia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresuTransferencia);
		this.jTableDatosPresuTransferencia.setAutoCreateRowSorter(true);
		this.jTableDatosPresuTransferencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresuTransferencia.setRowSelectionAllowed(true);
		this.jTableDatosPresuTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresuTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresuTransferencia = new JButtonMe();
		this.jButtonDuplicarPresuTransferencia = new JButtonMe();
		this.jButtonCopiarPresuTransferencia = new JButtonMe();
		this.jButtonVerFormPresuTransferencia = new JButtonMe();
		this.jButtonNuevoRelacionesPresuTransferencia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresuTransferencia = new JButtonMe();
		this.jButtonCerrarPresuTransferencia = new JButtonMe();
		
		this.jScrollPanelDatosPresuTransferencia = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresuTransferencia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Transferencia";
		
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciaes" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuTransferencia.setToolTipText("Acciones");
        this.jPanelAccionesPresuTransferencia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresuTransferencia=new ReporteDinamicoJInternalFrame(PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresuTransferencia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresuTransferencia=new ImportacionJInternalFrame(PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresuTransferencia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresuTransferencia = new JButtonMe();
		
		this.jButtonAbrirOrderByPresuTransferencia.setText("Orden");
		this.jButtonAbrirOrderByPresuTransferencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuTransferencia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuTransferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTransferencia,false,this);
			
			//this.cargarOrderByPresuTransferencia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuTransferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTransferencia,true,this);
			
			//this.cargarOrderByPresuTransferencia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresuTransferencia.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosPresuTransferencia.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosPresuTransferencia.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosPresuTransferencia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuTransferencia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuTransferencia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresuTransferencia.setText("Nuevo");
		this.jButtonDuplicarPresuTransferencia.setText("Duplicar");
		this.jButtonCopiarPresuTransferencia.setText("Copiar");
		this.jButtonVerFormPresuTransferencia.setText("Ver");
		this.jButtonNuevoRelacionesPresuTransferencia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresuTransferencia.setText("Guardar");
		this.jButtonCerrarPresuTransferencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuTransferencia,"nuevo_button","Nuevo",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresuTransferencia,"duplicar_button","Duplicar",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresuTransferencia,"copiar_button","Copiar",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresuTransferencia,"ver_form","Ver",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresuTransferencia,"nuevorelaciones_button","Nuevo Rel",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuTransferencia,"guardarcambiostabla_button","Guardar",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuTransferencia,"cerrar_button","Salir",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresuTransferencia.setToolTipText("Nuevo"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresuTransferencia.setToolTipText("Duplicar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresuTransferencia.setToolTipText("Copiar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresuTransferencia.setToolTipText("Ver"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresuTransferencia.setToolTipText("Nuevo Rel"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresuTransferencia.setToolTipText("Guardar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuTransferencia.setToolTipText("Salir"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuTransferencia";
		inputMap = this.jButtonNuevoPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuTransferencia"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresuTransferencia";
		inputMap = this.jButtonDuplicarPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresuTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresuTransferencia"));
		
		//COPIAR
		sMapKey = "CopiarPresuTransferencia";
		inputMap = this.jButtonCopiarPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresuTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresuTransferencia"));
		
		//VEr FORM
		sMapKey = "VerFormPresuTransferencia";
		inputMap = this.jButtonVerFormPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresuTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresuTransferencia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresuTransferencia";
		inputMap = this.jButtonNuevoRelacionesPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresuTransferencia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresuTransferencia";
		inputMap = this.jButtonModificarPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresuTransferencia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresuTransferencia";
		inputMap = this.jButtonCerrarPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuTransferencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuTransferencia";
		inputMap = this.jButtonGuardarCambiosTablaPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuTransferencia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresuTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresuTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresuTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresuTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresuTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresuTransferencia.setName("jPanelParametrosReportesPresuTransferencia"); 
		
		this.jPanelParametrosReportesAccionesPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresuTransferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresuTransferencia.setName("jPanelParametrosReportesAccionesPresuTransferencia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresuTransferencia = new JButtonMe();
		this.jButtonRecargarInformacionPresuTransferencia.setText("Recargar");
		this.jButtonRecargarInformacionPresuTransferencia.setToolTipText("Recargar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresuTransferencia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresuTransferencia = new JButtonMe();
		this.jButtonProcesarInformacionPresuTransferencia.setText("Procesar");
		this.jButtonProcesarInformacionPresuTransferencia.setToolTipText("Procesar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresuTransferencia.setVisible(false);
			
		this.jButtonProcesarInformacionPresuTransferencia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuTransferencia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuTransferencia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuTransferencia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresuTransferencia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuTransferencia.setText("TIPO");       
		this.jComboBoxTiposReportesPresuTransferencia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuTransferencia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresuTransferencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresuTransferencia.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresuTransferencia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresuTransferencia.setText("Accion");
		this.jComboBoxTiposRelacionesPresuTransferencia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuTransferencia.setText("Accion");
		this.jComboBoxTiposAccionesPresuTransferencia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresuTransferencia.setText("Accion");
		this.jComboBoxTiposSeleccionarPresuTransferencia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresuTransferencia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresuTransferencia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuTransferencia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuTransferencia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresuTransferencia = new JLabelMe();
		
		this.jLabelAccionesPresuTransferencia.setText("Acciones");		
		this.jLabelAccionesPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresuTransferencia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresuTransferencia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresuTransferencia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresuTransferencia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresuTransferencia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresuTransferencia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresuTransferencia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresuTransferencia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresuTransferencia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresuTransferencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresuTransferencia.setText("Graf.");
		this.jCheckBoxConGraficoReportePresuTransferencia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresuTransferencia = new JButtonMe();
		//this.jButtonAnterioresPresuTransferencia.setText("<<");
        this.jButtonAnterioresPresuTransferencia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresuTransferencia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresuTransferencia = new JButtonMe();
		//this.jButtonSiguientesPresuTransferencia.setText(">>");
        this.jButtonSiguientesPresuTransferencia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresuTransferencia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresuTransferencia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresuTransferencia.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresuTransferencia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresuTransferencia,"nuevoguardarcambios_button","Nue",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresuTransferencia";
		inputMap = this.jButtonNuevoGuardarCambiosPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresuTransferencia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresuTransferencia";
		inputMap = this.jButtonRecargarInformacionPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresuTransferencia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresuTransferencia";
		inputMap = this.jButtonSiguientesPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresuTransferencia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresuTransferencia";
		inputMap = this.jButtonAnterioresPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresuTransferencia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresuTransferencia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresuTransferencia.setMinimumSize(new Dimension(this.getWidth(),PresuTransferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuTransferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuTransferencia.setMaximumSize(new Dimension(this.getWidth(),PresuTransferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuTransferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuTransferencia.setPreferredSize(new Dimension(this.getWidth(),PresuTransferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuTransferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresuTransferencia = new GridBagLayout();

			this.jPanelPaginacionPresuTransferencia.setLayout(gridaBagLayoutPaginacionPresuTransferencia);						
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = 0;
			this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresuTransferencia.add(this.jButtonAnterioresPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
					
						
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuTransferencia.gridy = 0;
			
			this.jPanelPaginacionPresuTransferencia.add(this.jButtonNuevoGuardarCambiosPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
						
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuTransferencia.gridy = 0;
			this.jPanelPaginacionPresuTransferencia.add(this.jButtonSiguientesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = 1;
			this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTransferencia.add(this.jButtonNuevoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
						
			
			
			if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
				this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresuTransferencia.gridy = 1;
				this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresuTransferencia.add(this.jButtonGuardarCambiosTablaPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			}
			
			
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = 1;
			this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTransferencia.add(this.jButtonDuplicarPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = 1;
			this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTransferencia.add(this.jButtonCopiarPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = 1;
			this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTransferencia.add(this.jButtonVerFormPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = 1;
			this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresuTransferencia.add(this.jButtonCerrarPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
		
		
		this.jButtonRecargarInformacionPresuTransferencia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuTransferencia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuTransferencia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresuTransferencia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuTransferencia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuTransferencia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresuTransferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuTransferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuTransferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresuTransferencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuTransferencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuTransferencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresuTransferencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuTransferencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuTransferencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresuTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresuTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresuTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresuTransferencia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuTransferencia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuTransferencia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresuTransferencia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuTransferencia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuTransferencia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresuTransferencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuTransferencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuTransferencia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresuTransferencia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuTransferencia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuTransferencia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresuTransferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresuTransferencia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresuTransferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresuTransferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresuTransferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresuTransferencia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresuTransferencia.setLayout(gridaBagParametrosReportesPresuTransferencia);
			this.jPanelParametrosReportesAccionesPresuTransferencia.setLayout(gridaBagParametrosReportesAccionesPresuTransferencia);
			
			
			this.jPanelParametrosAuxiliar1PresuTransferencia.setLayout(gridaBagParametrosAuxiliar1PresuTransferencia);
			this.jPanelParametrosAuxiliar2PresuTransferencia.setLayout(gridaBagParametrosAuxiliar2PresuTransferencia);
			this.jPanelParametrosAuxiliar3PresuTransferencia.setLayout(gridaBagParametrosAuxiliar3PresuTransferencia);
			this.jPanelParametrosAuxiliar4PresuTransferencia.setLayout(gridaBagParametrosAuxiliar4PresuTransferencia);
			//this.jPanelParametrosAuxiliar5PresuTransferencia.setLayout(gridaBagParametrosAuxiliar2PresuTransferencia);			
			
			
			
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTransferencia.add(this.jButtonRecargarInformacionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuTransferencia.add(this.jComboBoxTiposPaginacionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuTransferencia.add(this.jCheckBoxConAltoMaximoTablaPresuTransferencia, this.gridBagConstraintsPresuTransferencia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuTransferencia.add(this.jComboBoxTiposArchivosReportesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTransferencia.add(this.jPanelParametrosAuxiliar1PresuTransferencia, this.gridBagConstraintsPresuTransferencia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresuTransferencia.add(this.jComboBoxTiposReportesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);																		
			
			
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresuTransferencia.add(this.jComboBoxTiposGraficosReportesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTransferencia.add(this.jPanelParametrosAuxiliar4PresuTransferencia, this.gridBagConstraintsPresuTransferencia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTransferencia.add(this.jComboBoxTiposReportesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuTransferencia.add(this.jCheckBoxGenerarReportePresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTransferencia.add(this.jPanelParametrosAuxiliar2PresuTransferencia, this.gridBagConstraintsPresuTransferencia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuTransferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuTransferencia.add(this.jLabelAccionesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
				this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresuTransferencia.add(this.jButtonAbrirOrderByPresuTransferencia, this.gridBagConstraintsPresuTransferencia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTransferencia.add(this.jComboBoxTiposSeleccionarPresuTransferencia, this.gridBagConstraintsPresuTransferencia);			
			
			
			/*
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuTransferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuTransferencia.add(this.jCheckBoxSeleccionarTodosPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuTransferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuTransferencia.add(this.jCheckBoxConGraficoReportePresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuTransferencia.add(this.jCheckBoxSeleccionarTodosPresuTransferencia, this.gridBagConstraintsPresuTransferencia);															
				
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuTransferencia.add(this.jCheckBoxSeleccionadosPresuTransferencia, this.gridBagConstraintsPresuTransferencia);															
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuTransferencia.add(this.jCheckBoxConGraficoReportePresuTransferencia, this.gridBagConstraintsPresuTransferencia);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTransferencia.add(this.jPanelParametrosAuxiliar3PresuTransferencia, this.gridBagConstraintsPresuTransferencia);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTransferencia.add(this.jComboBoxTiposAccionesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
	
				
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTransferencia.add(this.jTextFieldValorCampoGeneralPresuTransferencia, this.gridBagConstraintsPresuTransferencia);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresuTransferencia = new GridBagLayout();

			this.jScrollPanelDatosPresuTransferencia.setLayout(gridaBagLayoutDatosPresuTransferencia);
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = 0;
			this.gridBagConstraintsPresuTransferencia.gridx = 0;
			
			this.jScrollPanelDatosPresuTransferencia.add(this.jTableDatosPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresuTransferencia.setViewportView(this.jTableDatosPresuTransferencia);
		this.jTableDatosPresuTransferencia.setFillsViewportHeight(true);
		this.jTableDatosPresuTransferencia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresuTransferencia= new GridBagLayout();
		this.jPanelAccionesPresuTransferencia.setLayout(gridaBagLayoutAccionesPresuTransferencia);
		
		
		/*	
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 0;
			
		this.jPanelAccionesPresuTransferencia.add(this.jButtonNuevoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContablePresuTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContablePresuTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContablePresuTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContablePresuTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContablePresuTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContablePresuTransferencia.setLayout(gridaBagLayoutFK_IdCuentaContablePresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 0;
		gridBagConstraintsPresuTransferencia.gridx = 0;
		jPanelFK_IdCuentaContablePresuTransferencia.add(jLabelid_cuenta_contableFK_IdCuentaContablePresuTransferencia, gridBagConstraintsPresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 0;
		gridBagConstraintsPresuTransferencia.gridx = 1;
		jPanelFK_IdCuentaContablePresuTransferencia.add(jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia, gridBagConstraintsPresuTransferencia);


		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.NONE;
		gridBagConstraintsPresuTransferencia.gridy = 0;
		gridBagConstraintsPresuTransferencia.gridx = 0;
		jPanelFK_IdCuentaContablePresuTransferencia.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuTransferencia, gridBagConstraintsPresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 1;
		gridBagConstraintsPresuTransferencia.gridx =1;
		jPanelFK_IdCuentaContablePresuTransferencia.add(jButtonFK_IdCuentaContablePresuTransferencia, gridBagConstraintsPresuTransferencia);

		jTabbedPaneBusquedasPresuTransferencia.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContablePresuTransferencia);
		jTabbedPaneBusquedasPresuTransferencia.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDestinoPresuTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDestinoPresuTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDestinoPresuTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDestinoPresuTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDestinoPresuTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDestinoPresuTransferencia.setLayout(gridaBagLayoutFK_IdCuentaContableDestinoPresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 0;
		gridBagConstraintsPresuTransferencia.gridx = 0;
		jPanelFK_IdCuentaContableDestinoPresuTransferencia.add(jLabelid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia, gridBagConstraintsPresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 0;
		gridBagConstraintsPresuTransferencia.gridx = 1;
		jPanelFK_IdCuentaContableDestinoPresuTransferencia.add(jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia, gridBagConstraintsPresuTransferencia);


		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.NONE;
		gridBagConstraintsPresuTransferencia.gridy = 0;
		gridBagConstraintsPresuTransferencia.gridx = 0;
		jPanelFK_IdCuentaContableDestinoPresuTransferencia.add(this.jButtonBuscarFK_IdCuentaContableDestinoid_cuenta_contable_destinoPresuTransferencia, gridBagConstraintsPresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 1;
		gridBagConstraintsPresuTransferencia.gridx =1;
		jPanelFK_IdCuentaContableDestinoPresuTransferencia.add(jButtonFK_IdCuentaContableDestinoPresuTransferencia, gridBagConstraintsPresuTransferencia);

		jTabbedPaneBusquedasPresuTransferencia.addTab("2.-Por Cuenta Contable Destino ", jPanelFK_IdCuentaContableDestinoPresuTransferencia);
		jTabbedPaneBusquedasPresuTransferencia.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoPresuTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoPresuTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPresuTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPresuTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoPresuTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoPresuTransferencia.setLayout(gridaBagLayoutFK_IdEmpleadoPresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 0;
		gridBagConstraintsPresuTransferencia.gridx = 0;
		jPanelFK_IdEmpleadoPresuTransferencia.add(jLabelid_empleadoFK_IdEmpleadoPresuTransferencia, gridBagConstraintsPresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 0;
		gridBagConstraintsPresuTransferencia.gridx = 1;
		jPanelFK_IdEmpleadoPresuTransferencia.add(jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia, gridBagConstraintsPresuTransferencia);


		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.NONE;
		gridBagConstraintsPresuTransferencia.gridy = 0;
		gridBagConstraintsPresuTransferencia.gridx = 0;
		jPanelFK_IdEmpleadoPresuTransferencia.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuTransferencia, gridBagConstraintsPresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 1;
		gridBagConstraintsPresuTransferencia.gridx =1;
		jPanelFK_IdEmpleadoPresuTransferencia.add(jButtonFK_IdEmpleadoPresuTransferencia, gridBagConstraintsPresuTransferencia);

		jTabbedPaneBusquedasPresuTransferencia.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoPresuTransferencia);
		jTabbedPaneBusquedasPresuTransferencia.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdPresuProyectoPresuTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdPresuProyectoPresuTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPresuProyectoPresuTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPresuProyectoPresuTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPresuProyectoPresuTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPresuProyectoPresuTransferencia.setLayout(gridaBagLayoutFK_IdPresuProyectoPresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 0;
		gridBagConstraintsPresuTransferencia.gridx = 0;
		jPanelFK_IdPresuProyectoPresuTransferencia.add(jLabelid_presu_proyectoFK_IdPresuProyectoPresuTransferencia, gridBagConstraintsPresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 0;
		gridBagConstraintsPresuTransferencia.gridx = 1;
		jPanelFK_IdPresuProyectoPresuTransferencia.add(jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia, gridBagConstraintsPresuTransferencia);

		gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTransferencia.gridy = 1;
		gridBagConstraintsPresuTransferencia.gridx =1;
		jPanelFK_IdPresuProyectoPresuTransferencia.add(jButtonFK_IdPresuProyectoPresuTransferencia, gridBagConstraintsPresuTransferencia);

		jTabbedPaneBusquedasPresuTransferencia.addTab("4.-Por Proyecto ", jPanelFK_IdPresuProyectoPresuTransferencia);
		jTabbedPaneBusquedasPresuTransferencia.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuTransferencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuTransferencia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();						
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuTransferencia.gridx = 0;		
			//this.gridBagConstraintsPresuTransferencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuTransferencia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresuTransferencia, this.gridBagConstraintsPresuTransferencia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresuTransferencia.gridx = 0;		
		//this.gridBagConstraintsPresuTransferencia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresuTransferencia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresuTransferencia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuTransferencia.gridx = 0;		
			this.gridBagConstraintsPresuTransferencia.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresuTransferencia.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresuTransferencia, this.gridBagConstraintsPresuTransferencia);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTransferencia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);								
		
		
		/*
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTransferencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		*/		
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuTransferencia.gridx =0;
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuTransferencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
				
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTransferencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresuTransferenciaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresuTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuTransferencia = new GridBagLayout();
			this.jPanelBusquedasParametrosPresuTransferencia.setLayout(gridaBagLayoutBusquedasParametrosPresuTransferencia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresuTransferencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			
			
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
			
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuTransferencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresuTransferencia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresuTransferencia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresuTransferencia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresuTransferencia.setName("jPanelReporteDinamicoPresuTransferencia"); 
		
		this.jPanelReporteDinamicoPresuTransferencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuTransferencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuTransferencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresuTransferencia.setLayout(gridaBagLayoutReporteDinamicoPresuTransferencia);
		
		
		this.jInternalFrameReporteDinamicoPresuTransferencia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresuTransferencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuTransferencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresuTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresuTransferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresuTransferencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresuTransferencia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresuTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresuTransferencia.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresuTransferencia.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresuTransferencia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresuTransferencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuTransferencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuTransferencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciaes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresuTransferencia = new JLabelMe();

		this.jLabelColumnasSelectReportePresuTransferencia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jLabelColumnasSelectReportePresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresuTransferencia = new JList<Reporte>();
		this.jListColumnasSelectReportePresuTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresuTransferencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresuTransferencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuTransferencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuTransferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresuTransferencia=new JScrollPane(this.jListColumnasSelectReportePresuTransferencia);
			
			this.jScrollColumnasSelectReportePresuTransferencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuTransferencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuTransferencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresuTransferencia.add(this.jListColumnasSelectReportePresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jScrollColumnasSelectReportePresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresuTransferencia = new JLabelMe();

		this.jLabelRelacionesSelectReportePresuTransferencia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresuTransferencia = new JList<Reporte>();
		this.jListRelacionesSelectReportePresuTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresuTransferencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresuTransferencia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuTransferencia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuTransferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresuTransferencia=new JScrollPane(this.jListRelacionesSelectReportePresuTransferencia);
			
			this.jScrollRelacionesSelectReportePresuTransferencia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuTransferencia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuTransferencia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresuTransferencia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresuTransferencia = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresuTransferencia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresuTransferencia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresuTransferencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresuTransferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuTransferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuTransferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresuTransferencia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresuTransferencia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresuTransferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuTransferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuTransferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresuTransferencia = new JLabelMe();

		this.jLabelConGraficoDinamicoPresuTransferencia.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jLabelConGraficoDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresuTransferencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresuTransferencia.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresuTransferencia.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresuTransferencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresuTransferencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresuTransferencia.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jCheckBoxConGraficoDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresuTransferencia = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresuTransferencia.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jLabelColumnaCategoriaGraficoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresuTransferencia.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresuTransferencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresuTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresuTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresuTransferencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jComboBoxColumnaCategoriaGraficoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresuTransferencia = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresuTransferencia.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jLabelColumnaCategoriaValorPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresuTransferencia.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresuTransferencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresuTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresuTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresuTransferencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jComboBoxColumnaCategoriaValorPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresuTransferencia = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresuTransferencia.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jLabelColumnasValoresGraficoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresuTransferencia = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresuTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresuTransferencia.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresuTransferencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresuTransferencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresuTransferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresuTransferencia=new JScrollPane(this.jListColumnasValoresGraficoPresuTransferencia);
			
			this.jScrollColumnasValoresGraficoPresuTransferencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresuTransferencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresuTransferencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresuTransferencia.add(this.jListColumnasSelectReportePresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jScrollColumnasValoresGraficoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresuTransferencia = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresuTransferencia.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jLabelTiposGraficosReportesDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresuTransferencia.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresuTransferencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresuTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresuTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresuTransferencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jComboBoxTiposGraficosReportesDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresuTransferencia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresuTransferencia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jLabelGenerarExcelReporteDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresuTransferencia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresuTransferencia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresuTransferencia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresuTransferencia.setToolTipText("Generar EXCEL"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresuTransferencia.add(this.jButtonGenerarExcelReporteDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jComboBoxTiposReportesDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresuTransferencia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresuTransferencia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jLabelTiposArchivoReporteDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jComboBoxTiposArchivosReportesDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresuTransferencia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresuTransferencia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresuTransferencia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresuTransferencia.setToolTipText("Generar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jButtonGenerarReporteDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresuTransferencia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresuTransferencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresuTransferencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresuTransferencia.setToolTipText("Cancelar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTransferencia.add(this.jButtonCerrarReporteDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresuTransferencia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresuTransferencia= new JScrollPane(jPanelReporteDinamicoPresuTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresuTransferencia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuTransferencia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuTransferencia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciaes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresuTransferencia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresuTransferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresuTransferencia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresuTransferencia);
		this.jInternalFrameReporteDinamicoPresuTransferencia.getContentPane().add(this.jScrollPanelReporteDinamicoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresuTransferencia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresuTransferencia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresuTransferencia.setName("jPanelImportacionPresuTransferencia"); 
		
		this.jPanelImportacionPresuTransferencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuTransferencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuTransferencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresuTransferencia.setLayout(gridaBagLayoutImportacionPresuTransferencia);
		
		
		this.jInternalFrameImportacionPresuTransferencia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresuTransferencia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresuTransferencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuTransferencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresuTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuTransferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuTransferencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresuTransferencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuTransferencia.setResizable(true);
	    this.jInternalFrameImportacionPresuTransferencia.setClosable(true);
	    this.jInternalFrameImportacionPresuTransferencia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresuTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuTransferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuTransferencia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresuTransferencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuTransferencia.setResizable(true);
	    this.jInternalFrameImportacionPresuTransferencia.setClosable(true);
	    this.jInternalFrameImportacionPresuTransferencia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresuTransferencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuTransferencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuTransferencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciaes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresuTransferencia = new JLabelMe();

		this.jLabelArchivoImportacionPresuTransferencia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuTransferencia.add(this.jLabelArchivoImportacionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresuTransferencia = new JFileChooser();		
		this.jFileChooserImportacionPresuTransferencia.setToolTipText("ESCOGER ARCHIVO"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresuTransferencia = new JButtonMe();
		this.jButtonAbrirImportacionPresuTransferencia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresuTransferencia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresuTransferencia.setToolTipText("Generar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTransferencia.add(this.jButtonAbrirImportacionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresuTransferencia = new JLabelMe();

		this.jLabelPathArchivoImportacionPresuTransferencia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuTransferencia.add(this.jLabelPathArchivoImportacionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresuTransferencia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresuTransferencia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuTransferencia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuTransferencia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTransferencia.add(this.jTextFieldPathArchivoImportacionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresuTransferencia = new JButtonMe();
		this.jButtonGenerarImportacionPresuTransferencia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresuTransferencia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresuTransferencia.setToolTipText("Generar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTransferencia.add(this.jButtonGenerarImportacionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresuTransferencia = new JButtonMe();
		this.jButtonCerrarImportacionPresuTransferencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresuTransferencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresuTransferencia.setToolTipText("Cancelar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTransferencia.add(this.jButtonCerrarImportacionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresuTransferencia = new GridBagLayout();
		
		this.jScrollPanelImportacionPresuTransferencia= new JScrollPane(jPanelImportacionPresuTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy =iPosYImportacion;
		this.gridBagConstraintsPresuTransferencia.gridx =iPosXImportacion;
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresuTransferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresuTransferencia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresuTransferencia);
		this.jInternalFrameImportacionPresuTransferencia.getContentPane().add(this.jScrollPanelImportacionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresuTransferencia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresuTransferencia = new JButtonMe();
			this.jButtonAbrirOrderByPresuTransferencia.setText("Orden");
			this.jButtonAbrirOrderByPresuTransferencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuTransferencia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresuTransferencia";
			inputMap = this.jButtonAbrirOrderByPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresuTransferencia"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresuTransferencia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresuTransferencia.setName("jPanelOrderByPresuTransferencia"); 
			
			this.jPanelOrderByPresuTransferencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuTransferencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuTransferencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresuTransferencia.setLayout(gridaBagLayoutOrderByPresuTransferencia);
			
			
			this.jTableDatosPresuTransferenciaOrderBy = new JTableMe();        
			this.jTableDatosPresuTransferenciaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresuTransferenciaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresuTransferenciaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresuTransferenciaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresuTransferenciaOrderBy.setViewportView(this.jTableDatosPresuTransferenciaOrderBy);
			this.jTableDatosPresuTransferenciaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresuTransferenciaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresuTransferencia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresuTransferencia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresuTransferencia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresuTransferencia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresuTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresuTransferencia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresuTransferencia.setTitle("Orden");
			this.jInternalFrameOrderByPresuTransferencia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresuTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresuTransferencia.setResizable(true);
			this.jInternalFrameOrderByPresuTransferencia.setClosable(true);
			this.jInternalFrameOrderByPresuTransferencia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresuTransferencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuTransferencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuTransferencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciaes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresuTransferencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresuTransferencia.ipady =150;
				
			this.jPanelOrderByPresuTransferencia.add(jScrollPanelDatosPresuTransferenciaOrderBy, this.gridBagConstraintsPresuTransferencia);//this.jTableDatosPresuTransferenciaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresuTransferencia = new JButtonMe();
			this.jButtonCerrarOrderByPresuTransferencia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresuTransferencia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresuTransferencia.setToolTipText("Cancelar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresuTransferencia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresuTransferencia.add(this.jButtonCerrarOrderByPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresuTransferencia = new GridBagLayout();
			
			this.jScrollPanelOrderByPresuTransferencia= new JScrollPane(jPanelOrderByPresuTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresuTransferencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresuTransferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresuTransferencia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresuTransferencia);
			
			this.jInternalFrameOrderByPresuTransferencia.getContentPane().add(this.jScrollPanelOrderByPresuTransferencia, this.gridBagConstraintsPresuTransferencia);			
		
		} else {
			this.jButtonAbrirOrderByPresuTransferencia = new JButtonMe();
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
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presutransferenciaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresuTransferencia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresuTransferencia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresuTransferencia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresuTransferencia.getRowHeight();//PresuTransferenciaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresuTransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuTransferencia.isSelected()) {
					iHeightTable=PresuTransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuTransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuTransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresuTransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuTransferencia.isSelected()) {
					iHeightTable=PresuTransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuTransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuTransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresuTransferencia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuTransferencia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuTransferencia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresuTransferencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuTransferencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuTransferencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresuTransferencia!=null && this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy()!=null) {
			//if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresuTransferencia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresuTransferencia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresuTransferencia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresuTransferencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuTransferencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuTransferencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presutransferenciaLogic.getPresuTransferencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presutransferencias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresuTransferencia> TraerPresuTransferenciaBeans(List<PresuTransferencia> presutransferencias,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresuTransferencia presutransferencia:presutransferencias) {
					
				if(!(PresuTransferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresuTransferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presutransferencia.setsDetalleGeneralEntityReporte(PresuTransferenciaConstantesFunciones.getPresuTransferenciaDescripcion(presutransferencia));
										
						
					
						
					
				} else  {
							
					//presutransferencia.setsDetalleGeneralEntityReporte(presutransferencia.getsDetalleGeneralEntityReporte());
										
				}
				
				//presutransferenciabeans.add(presutransferenciabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presutransferencias;
    }
	//PARA REPORTES FIN
}
