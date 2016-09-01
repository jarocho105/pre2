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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.nomina.util.PrestamoConstantesFunciones;

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
public class PrestamoJInternalFrame extends PrestamoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPrestamo;
	
	protected JMenuBar jmenuBarPrestamo;
	
	protected JMenu jmenuPrestamo;
	protected JMenu jmenuDatosPrestamo;
	protected JMenu jmenuArchivoPrestamo;
	protected JMenu jmenuAccionesPrestamo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPrestamo;	
	protected GridBagConstraints gridBagConstraintsPrestamo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PrestamoDetalleFormJInternalFrame jInternalFrameDetalleFormPrestamo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPrestamo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPrestamo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoPrestamoBeanSwingJInternalFrame tipoprestamoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprestamo="";

	protected TipoCuotaBeanSwingJInternalFrame tipocuotaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuota="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public PrestamoSessionBean prestamoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoPrestamoSessionBean tipoprestamoSessionBean;
	public TipoCuotaSessionBean tipocuotaSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Prestamo> prestamos;		
	public List<Prestamo> prestamosEliminados;	
	public List<Prestamo> prestamosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPrestamo;		
	protected JButton jButtonAbrirOrderByPrestamo;
	
	
	//protected JPanel jPanelOrderByPrestamo;
	//public JScrollPane jScrollPanelOrderByPrestamo;	
	//protected JButton jButtonCerrarOrderByPrestamo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PrestamoLogic prestamoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPrestamo;
	public JScrollPane jScrollPanelDatosEdicionPrestamo;
	public JScrollPane jScrollPanelDatosGeneralPrestamo;
    
	
	
	//public JScrollPane jScrollPanelDatosPrestamoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPrestamo;
	//public JScrollPane jScrollPanelImportacionPrestamo;
	
	
	
	protected JPanel jPanelAccionesPrestamo;
	
    protected JPanel jPanelPaginacionPrestamo;
    protected JPanel jPanelParametrosReportesPrestamo;
	protected JPanel jPanelParametrosReportesAccionesPrestamo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Prestamo;
	protected JPanel jPanelParametrosAuxiliar2Prestamo;
	protected JPanel jPanelParametrosAuxiliar3Prestamo;
	protected JPanel jPanelParametrosAuxiliar4Prestamo;
	//protected JPanel jPanelParametrosAuxiliar5Prestamo;
	
	
	
	//protected JPanel jPanelReporteDinamicoPrestamo;
	//protected JPanel jPanelImportacionPrestamo;
	
	
	public JTable jTableDatosPrestamo;
	
	
	
	//public JTable jTableDatosPrestamoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPrestamo;
	protected JButton jButtonDuplicarPrestamo;
	protected JButton jButtonCopiarPrestamo;
	protected JButton jButtonVerFormPrestamo;
	protected JButton jButtonNuevoRelacionesPrestamo;
	protected JButton jButtonModificarPrestamo;
	
    protected JButton jButtonGuardarCambiosTablaPrestamo;
	protected JButton jButtonCerrarPrestamo;
	
	
	protected JButton jButtonRecargarInformacionPrestamo;
	protected JButton jButtonProcesarInformacionPrestamo;
	
	
	protected JButton jButtonAnterioresPrestamo;
	protected JButton jButtonSiguientesPrestamo;
	protected JButton jButtonNuevoGuardarCambiosPrestamo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPrestamo;
	//protected JButton jButtonCerrarReporteDinamicoPrestamo;
	//protected JButton jButtonGenerarExcelReporteDinamicoPrestamo;	
	
	
	
	//protected JButton jButtonAbrirImportacionPrestamo;
	//protected JButton jButtonGenerarImportacionPrestamo;
	//protected JButton jButtonCerrarImportacionPrestamo;
	//protected JFileChooser jFileChooserImportacionPrestamo;
	//protected File fileImportacionPrestamo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPrestamo;
	protected JButton jButtonDuplicarToolBarPrestamo;
	protected JButton jButtonNuevoRelacionesToolBarPrestamo;
	
	
	public JButton jButtonGuardarCambiosToolBarPrestamo;
	protected JButton jButtonCopiarToolBarPrestamo;
	protected JButton jButtonVerFormToolBarPrestamo;
	public JButton jButtonGuardarCambiosTablaToolBarPrestamo;
	protected JButton jButtonMostrarOcultarTablaToolBarPrestamo;
	protected JButton jButtonCerrarToolBarPrestamo;
	
	protected JButton jButtonRecargarInformacionToolBarPrestamo;
	protected JButton jButtonProcesarInformacionToolBarPrestamo;
	protected JButton jButtonAnterioresToolBarPrestamo;
	protected JButton jButtonSiguientesToolBarPrestamo;
	protected JButton jButtonNuevoGuardarCambiosToolBarPrestamo;
	protected JButton jButtonAbrirOrderByToolBarPrestamo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPrestamo;
	protected JMenuItem jMenuItemDuplicarPrestamo;
	protected JMenuItem jMenuItemNuevoRelacionesPrestamo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPrestamo;
	protected JMenuItem jMenuItemCopiarPrestamo;
	protected JMenuItem jMenuItemVerFormPrestamo;
	protected JMenuItem jMenuItemGuardarCambiosTablaPrestamo;
	protected JMenuItem jMenuItemCerrarPrestamo;
	protected JMenuItem jMenuItemDetalleCerrarPrestamo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPrestamo;
	protected JMenuItem jMenuItemDetalleMostarOcultarPrestamo;
	
	protected JMenuItem jMenuItemRecargarInformacionPrestamo;
	protected JMenuItem jMenuItemProcesarInformacionPrestamo;
	protected JMenuItem jMenuItemAnterioresPrestamo;
	protected JMenuItem jMenuItemSiguientesPrestamo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPrestamo;
	protected JMenuItem jMenuItemAbrirOrderByPrestamo;
	protected JMenuItem jMenuItemMostrarOcultarPrestamo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPrestamo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPrestamo;
	protected JCheckBox jCheckBoxSeleccionadosPrestamo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPrestamo;
	protected JCheckBox jCheckBoxConGraficoReportePrestamo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPrestamo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPrestamo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPrestamo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPrestamo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPrestamo;
	protected JTextField jTextFieldValorCampoGeneralPrestamo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePrestamo;
	//public JList<Reporte> jListColumnasSelectReportePrestamo;
	//public JScrollPane jScrollColumnasSelectReportePrestamo;
	
	//public JLabel jLabelRelacionesSelectReportePrestamo;
	//public JList<Reporte> jListRelacionesSelectReportePrestamo;
	//public JScrollPane jScrollRelacionesSelectReportePrestamo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPrestamo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPrestamo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPrestamo;
	//public JLabel jLabelTiposArchivoReporteDinamicoPrestamo;
	
		
	//public JLabel jLabelArchivoImportacionPrestamo;	
	//public JLabel jLabelPathArchivoImportacionPrestamo;
	//protected JTextField jTextFieldPathArchivoImportacionPrestamo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPrestamo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPrestamo;
	
	//public JLabel jLabelColumnaCategoriaValorPrestamo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPrestamo;
	
	//public JLabel jLabelColumnasValoresGraficoPrestamo;
	//public JList<Reporte> jListColumnasValoresGraficoPrestamo;
	//public JScrollPane jScrollColumnasValoresGraficoPrestamo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPrestamo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPrestamo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPrestamo;
	public JPanel jPanelFK_IdAsientoContablePrestamo;
	public JButton jButtonFK_IdAsientoContablePrestamo;
	public JPanel jPanelFK_IdEmpleadoPrestamo;
	public JButton jButtonFK_IdEmpleadoPrestamo;
	public JPanel jPanelFK_IdTipoCuotaPrestamo;
	public JButton jButtonFK_IdTipoCuotaPrestamo;
	public JPanel jPanelFK_IdTipoPrestamoPrestamo;
	public JButton jButtonFK_IdTipoPrestamoPrestamo;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContablePrestamo;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContablePrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo;
	public JButton jButtonid_asiento_contableFK_IdAsientoContablePrestamo= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContablePrestamoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContablePrestamoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contablePrestamo;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoPrestamo;
	public JLabel jLabelid_empleadoFK_IdEmpleadoPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoPrestamo;
	public JButton jButtonid_empleadoFK_IdEmpleadoPrestamo= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPrestamoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoPrestamo;
	
	public JPanel jPanelid_tipo_cuotaFK_IdTipoCuotaPrestamo;
	public JLabel jLabelid_tipo_cuotaFK_IdTipoCuotaPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo;
	public JButton jButtonid_tipo_cuotaFK_IdTipoCuotaPrestamo= new JButtonMe();
	public JButton jButtonid_tipo_cuotaFK_IdTipoCuotaPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuotaFK_IdTipoCuotaPrestamoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_prestamoFK_IdTipoPrestamoPrestamo;
	public JLabel jLabelid_tipo_prestamoFK_IdTipoPrestamoPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo;
	public JButton jButtonid_tipo_prestamoFK_IdTipoPrestamoPrestamo= new JButtonMe();
	public JButton jButtonid_tipo_prestamoFK_IdTipoPrestamoPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_prestamoFK_IdTipoPrestamoPrestamoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
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
	public PrestamoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Prestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrestamoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Prestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrestamoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Prestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrestamoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Prestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPrestamo)	{
		this.jButtonRecargarInformacionPrestamo = jButtonRecargarInformacionPrestamo;
	}
	
	public JButton getjButtonProcesarInformacionPrestamo() {
		return this.jButtonProcesarInformacionPrestamo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPrestamo)	{
		this.jButtonProcesarInformacionPrestamo = jButtonProcesarInformacionPrestamo;
	}
	
	
	public JButton getjButtonRecargarInformacionPrestamo() {
		return this.jButtonRecargarInformacionPrestamo;
	}
	
	
	public List<Prestamo> getprestamos() {
		return this.prestamos;
	}

	public void setprestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	
	public List<Prestamo> getprestamosAux() {
		return this.prestamosAux;
	}

	public void setprestamosAux(List<Prestamo> prestamosAux) {
		this.prestamosAux = prestamosAux;
	}
	
	public List<Prestamo> getprestamosEliminados() {
		return this.prestamosEliminados;
	}

	public void setPrestamosEliminados(List<Prestamo> prestamosEliminados) {
		this.prestamosEliminados = prestamosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPrestamo() {
		return jComboBoxTiposSeleccionarPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPrestamo(
			JComboBox jComboBoxTiposSeleccionarPrestamo) {
		this.jComboBoxTiposSeleccionarPrestamo = jComboBoxTiposSeleccionarPrestamo;
	}
	
	public void setBorderResaltarTiposSeleccionarPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPrestamo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPrestamo() {
		return jTextFieldValorCampoGeneralPrestamo;
	}

	public void setjTextFieldValorCampoGeneralPrestamo(
			JTextField jTextFieldValorCampoGeneralPrestamo) {
		this.jTextFieldValorCampoGeneralPrestamo = jTextFieldValorCampoGeneralPrestamo;
	}

	public void setBorderResaltarValorCampoGeneralPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrestamo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPrestamo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPrestamo() {
		return this.jCheckBoxSeleccionarTodosPrestamo;
	}

	public void setjCheckBoxSeleccionarTodosPrestamo(
			JCheckBox jCheckBoxSeleccionarTodosPrestamo) {
		this.jCheckBoxSeleccionarTodosPrestamo = jCheckBoxSeleccionarTodosPrestamo;
	}

	public void setBorderResaltarSeleccionarTodosPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrestamo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPrestamo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPrestamo() {
		return this.jCheckBoxSeleccionadosPrestamo;
	}

	public void setjCheckBoxSeleccionadosPrestamo(
			JCheckBox jCheckBoxSeleccionadosPrestamo) {
		this.jCheckBoxSeleccionadosPrestamo = jCheckBoxSeleccionadosPrestamo;
	}
	
	public void setBorderResaltarSeleccionadosPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrestamo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPrestamo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPrestamo() {
		return this.jComboBoxTiposArchivosReportesPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPrestamo(
			JComboBox jComboBoxTiposArchivosReportesPrestamo) {
		this.jComboBoxTiposArchivosReportesPrestamo = jComboBoxTiposArchivosReportesPrestamo;
	}

	public void setBorderResaltarTiposArchivosReportesPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPrestamo() {
		return this.jComboBoxTiposReportesPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPrestamo(
			JComboBox jComboBoxTiposReportesPrestamo) {
		this.jComboBoxTiposReportesPrestamo = jComboBoxTiposReportesPrestamo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPrestamo() {
	//	return jComboBoxTiposReportesDinamicoPrestamo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPrestamo(
	//		JComboBox jComboBoxTiposReportesDinamicoPrestamo) {
	//	this.jComboBoxTiposReportesDinamicoPrestamo = jComboBoxTiposReportesDinamicoPrestamo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPrestamo() {
	//	return jComboBoxTiposArchivosReportesDinamicoPrestamo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPrestamo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPrestamo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPrestamo = jComboBoxTiposArchivosReportesDinamicoPrestamo;
	//}
	
	public void setBorderResaltarTiposReportesPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPrestamo() {
		return this.jComboBoxTiposGraficosReportesPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPrestamo(
			JComboBox jComboBoxTiposGraficosReportesPrestamo) {
		this.jComboBoxTiposGraficosReportesPrestamo = jComboBoxTiposGraficosReportesPrestamo;
	}
	
	public void setBorderResaltarTiposGraficosReportesPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPrestamo() {
		return this.jComboBoxTiposPaginacionPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPrestamo(
			JComboBox jComboBoxTiposPaginacionPrestamo) {
		this.jComboBoxTiposPaginacionPrestamo = jComboBoxTiposPaginacionPrestamo;
	}
	
	public void setBorderResaltarTiposPaginacionPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPrestamo() {
		return this.jComboBoxTiposRelacionesPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPrestamo() {
		return this.jComboBoxTiposAccionesPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPrestamo(
			JComboBox jComboBoxTiposRelacionesPrestamo) {
		this.jComboBoxTiposRelacionesPrestamo = jComboBoxTiposRelacionesPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPrestamo(
			JComboBox jComboBoxTiposAccionesPrestamo) {
		this.jComboBoxTiposAccionesPrestamo = jComboBoxTiposAccionesPrestamo;
	}
	
	public void setBorderResaltarTiposRelacionesPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPrestamo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPrestamo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPrestamo() {
	//	return jCheckBoxConGraficoDinamicoPrestamo;
	//}

	//public void setjCheckBoxConGraficoDinamicoPrestamo(
	//		JCheckBox jCheckBoxConGraficoDinamicoPrestamo) {
	//	this.jCheckBoxConGraficoDinamicoPrestamo = jCheckBoxConGraficoDinamicoPrestamo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPrestamo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPrestamo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPrestamo .setBorder(borderResaltar);		
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
		this.prestamoSessionBean=new PrestamoSessionBean();
		
		this.prestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.prestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.prestamoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PrestamoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Prestamo MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
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
		
		PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Prestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPrestamo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPrestamo,this.jTtoolBarPrestamo,
							"nuevo","nuevo","Nuevo"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPrestamo,this.jTtoolBarPrestamo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPrestamo,this.jTtoolBarPrestamo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPrestamo,this.jTtoolBarPrestamo,
							"duplicar","duplicar","Duplicar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPrestamo,this.jTtoolBarPrestamo,
							"copiar","copiar","Copiar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPrestamo,this.jTtoolBarPrestamo,
							"ver_form","ver_form","Ver"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPrestamo,this.jTtoolBarPrestamo,
							"recargar","recargar","Recargar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPrestamo,this.jTtoolBarPrestamo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPrestamo,this.jTtoolBarPrestamo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPrestamo,this.jTtoolBarPrestamo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPrestamo,this.jTtoolBarPrestamo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPrestamo,this.jTtoolBarPrestamo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPrestamo,this.jTtoolBarPrestamo,
							"cerrar","cerrar","Salir"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPrestamo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPrestamo;
			
				this.jButtonProcesarInformacionToolBarPrestamo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPrestamo;
				
		//protected JButton jButtonModificarToolBarPrestamo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPrestamo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPrestamo=new JMenuMe("General");
		this.jmenuArchivoPrestamo=new JMenuMe("Archivo");
		this.jmenuAccionesPrestamo=new JMenuMe("Acciones");
		this.jmenuDatosPrestamo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPrestamo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPrestamo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPrestamo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPrestamo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPrestamo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPrestamo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPrestamo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPrestamo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPrestamo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPrestamo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPrestamo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPrestamo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPrestamo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPrestamo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPrestamo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPrestamo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPrestamo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPrestamo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPrestamo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPrestamo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPrestamo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPrestamo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPrestamo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPrestamo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPrestamo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPrestamo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPrestamo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPrestamo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPrestamo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPrestamo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPrestamo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPrestamo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPrestamo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPrestamo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPrestamo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPrestamo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPrestamo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPrestamo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPrestamo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPrestamo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPrestamo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPrestamo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPrestamo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPrestamo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPrestamo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPrestamo.add(this.jMenuItemCerrarPrestamo);
			
			this.jmenuAccionesPrestamo.add(this.jMenuItemNuevoPrestamo);
			this.jmenuAccionesPrestamo.add(this.jMenuItemNuevoGuardarCambiosPrestamo);
			this.jmenuAccionesPrestamo.add(this.jMenuItemNuevoRelacionesPrestamo);
			this.jmenuAccionesPrestamo.add(this.jMenuItemGuardarCambiosTablaPrestamo);		
			this.jmenuAccionesPrestamo.add(this.jMenuItemDuplicarPrestamo);		
			this.jmenuAccionesPrestamo.add(this.jMenuItemCopiarPrestamo);		
			this.jmenuAccionesPrestamo.add(this.jMenuItemVerFormPrestamo);		
			
			this.jmenuDatosPrestamo.add(this.jMenuItemRecargarInformacionPrestamo);				
			this.jmenuDatosPrestamo.add(this.jMenuItemAnterioresPrestamo);				
			this.jmenuDatosPrestamo.add(this.jMenuItemSiguientesPrestamo);				
			this.jmenuDatosPrestamo.add(this.jMenuItemAbrirOrderByPrestamo);				
			this.jmenuDatosPrestamo.add(this.jMenuItemMostrarOcultarPrestamo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPrestamo.add(this.jMenuItemGuardarCambiosPrestamo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPrestamo.add(this.jmenuArchivoPrestamo);		
			this.jmenuBarPrestamo.add(this.jmenuAccionesPrestamo);		
			this.jmenuBarPrestamo.add(this.jmenuDatosPrestamo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPrestamo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPrestamo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContablePrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContablePrestamo.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContablePrestamo= new JButtonMe();
		this.jButtonFK_IdAsientoContablePrestamo.setText("Buscar");
		this.jButtonFK_IdAsientoContablePrestamo.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContablePrestamo,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContablePrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContablePrestamo = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContablePrestamo.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContablePrestamo.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContablePrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContablePrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContablePrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContablePrestamo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePrestamo= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePrestamo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePrestamo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePrestamo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePrestamo.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePrestamo.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePrestamo.setFocusable(false);

		this.jPanelFK_IdEmpleadoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoPrestamo.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoPrestamo= new JButtonMe();
		this.jButtonFK_IdEmpleadoPrestamo.setText("Buscar");
		this.jButtonFK_IdEmpleadoPrestamo.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoPrestamo,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoPrestamo = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoPrestamo.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoPrestamo.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoPrestamo= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoPrestamo= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPrestamo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPrestamo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPrestamo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPrestamo.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPrestamo.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPrestamo.setFocusable(false);

		this.jPanelFK_IdTipoCuotaPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCuotaPrestamo.setToolTipText("Buscar Por Tipo Cuota ");
		this.jButtonFK_IdTipoCuotaPrestamo= new JButtonMe();
		this.jButtonFK_IdTipoCuotaPrestamo.setText("Buscar");
		this.jButtonFK_IdTipoCuotaPrestamo.setToolTipText("Buscar Por Tipo Cuota ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCuotaPrestamo,"buscar_button","Buscar Por Tipo Cuota ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCuotaPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cuotaFK_IdTipoCuotaPrestamo = new JLabelMe();
		jLabelid_tipo_cuotaFK_IdTipoCuotaPrestamo.setText("Tipo Cuota :");
		jLabelid_tipo_cuotaFK_IdTipoCuotaPrestamo.setToolTipText("Tipo Cuota");
		jLabelid_tipo_cuotaFK_IdTipoCuotaPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cuotaFK_IdTipoCuotaPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cuotaFK_IdTipoCuotaPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuotaFK_IdTipoCuotaPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo= new JComboBoxMe();
		jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrestamoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrestamoPrestamo.setToolTipText("Buscar Por Tipo Prestamo ");
		this.jButtonFK_IdTipoPrestamoPrestamo= new JButtonMe();
		this.jButtonFK_IdTipoPrestamoPrestamo.setText("Buscar");
		this.jButtonFK_IdTipoPrestamoPrestamo.setToolTipText("Buscar Por Tipo Prestamo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrestamoPrestamo,"buscar_button","Buscar Por Tipo Prestamo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrestamoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_prestamoFK_IdTipoPrestamoPrestamo = new JLabelMe();
		jLabelid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setText("Tipo Prestamo :");
		jLabelid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setToolTipText("Tipo Prestamo");
		jLabelid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_prestamoFK_IdTipoPrestamoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo= new JComboBoxMe();
		jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPrestamo=new JTabbedPane();


		this.jTabbedPaneBusquedasPrestamo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPrestamo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPrestamo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);

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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetallePrestamo = new PrestamoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Prestamo DATOS");
			this.jInternalFrameDetalleFormPrestamo = new PrestamoDetalleFormJInternalFrame(jDesktopPane,this.prestamoSessionBean.getConGuardarRelaciones(),this.prestamoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPrestamo = null;//new PrestamoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPrestamo= new GridBagLayout();
		
		
		this.jTableDatosPrestamo = new JTableMe();      
		
		String sToolTipPrestamo="";
		sToolTipPrestamo=PrestamoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPrestamo+="(Nomina.Prestamo)";
		}
		
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPrestamo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPrestamo.setToolTipText(sToolTipPrestamo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPrestamo);
		this.jTableDatosPrestamo.setAutoCreateRowSorter(true);
		this.jTableDatosPrestamo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPrestamo.setRowSelectionAllowed(true);
		this.jTableDatosPrestamo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPrestamo = new JButtonMe();
		this.jButtonDuplicarPrestamo = new JButtonMe();
		this.jButtonCopiarPrestamo = new JButtonMe();
		this.jButtonVerFormPrestamo = new JButtonMe();
		this.jButtonNuevoRelacionesPrestamo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPrestamo = new JButtonMe();
		this.jButtonCerrarPrestamo = new JButtonMe();
		
		this.jScrollPanelDatosPrestamo = new JScrollPane();   
        this.jScrollPanelDatosGeneralPrestamo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Prestamo";
		
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prestamos" + this.sPath));
		} else {
			this.jScrollPanelDatosPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPrestamo.setToolTipText("Acciones");
        this.jPanelAccionesPrestamo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPrestamo=new ReporteDinamicoJInternalFrame(PrestamoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPrestamo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPrestamo=new ImportacionJInternalFrame(PrestamoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPrestamo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPrestamo = new JButtonMe();
		
		this.jButtonAbrirOrderByPrestamo.setText("Orden");
		this.jButtonAbrirOrderByPrestamo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPrestamo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrestamo,false,this);
			
			//this.cargarOrderByPrestamo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrestamo,true,this);
			
			//this.cargarOrderByPrestamo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPrestamo.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosPrestamo.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosPrestamo.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosPrestamo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPrestamo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPrestamo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPrestamo.setText("Nuevo");
		this.jButtonDuplicarPrestamo.setText("Duplicar");
		this.jButtonCopiarPrestamo.setText("Copiar");
		this.jButtonVerFormPrestamo.setText("Ver");
		this.jButtonNuevoRelacionesPrestamo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPrestamo.setText("Guardar");
		this.jButtonCerrarPrestamo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPrestamo,"nuevo_button","Nuevo",this.prestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPrestamo,"duplicar_button","Duplicar",this.prestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPrestamo,"copiar_button","Copiar",this.prestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPrestamo,"ver_form","Ver",this.prestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPrestamo,"nuevorelaciones_button","Nuevo Rel",this.prestamoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPrestamo,"guardarcambiostabla_button","Guardar",this.prestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPrestamo,"cerrar_button","Salir",this.prestamoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPrestamo.setToolTipText("Nuevo"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPrestamo.setToolTipText("Duplicar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPrestamo.setToolTipText("Copiar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPrestamo.setToolTipText("Ver"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPrestamo.setToolTipText("Nuevo Rel"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPrestamo.setToolTipText("Guardar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPrestamo.setToolTipText("Salir"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPrestamo";
		inputMap = this.jButtonNuevoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPrestamo"));
		
		//DUPLICAR
		sMapKey = "DuplicarPrestamo";
		inputMap = this.jButtonDuplicarPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPrestamo"));
		
		//COPIAR
		sMapKey = "CopiarPrestamo";
		inputMap = this.jButtonCopiarPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPrestamo"));
		
		//VEr FORM
		sMapKey = "VerFormPrestamo";
		inputMap = this.jButtonVerFormPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPrestamo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPrestamo";
		inputMap = this.jButtonNuevoRelacionesPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPrestamo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPrestamo";
		inputMap = this.jButtonModificarPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPrestamo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPrestamo";
		inputMap = this.jButtonCerrarPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPrestamo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPrestamo";
		inputMap = this.jButtonGuardarCambiosTablaPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPrestamo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Prestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Prestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Prestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Prestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Prestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPrestamo.setName("jPanelParametrosReportesPrestamo"); 
		
		this.jPanelParametrosReportesAccionesPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPrestamo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPrestamo.setName("jPanelParametrosReportesAccionesPrestamo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPrestamo = new JButtonMe();
		this.jButtonRecargarInformacionPrestamo.setText("Recargar");
		this.jButtonRecargarInformacionPrestamo.setToolTipText("Recargar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPrestamo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPrestamo = new JButtonMe();
		this.jButtonProcesarInformacionPrestamo.setText("Procesar");
		this.jButtonProcesarInformacionPrestamo.setToolTipText("Procesar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPrestamo.setVisible(false);
			
		this.jButtonProcesarInformacionPrestamo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPrestamo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPrestamo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPrestamo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPrestamo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPrestamo.setText("TIPO");       
		this.jComboBoxTiposReportesPrestamo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPrestamo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPrestamo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPrestamo.setText("Paginacion");
		this.jComboBoxTiposPaginacionPrestamo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPrestamo.setText("Accion");
		this.jComboBoxTiposRelacionesPrestamo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPrestamo.setText("Accion");
		this.jComboBoxTiposAccionesPrestamo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPrestamo.setText("Accion");
		this.jComboBoxTiposSeleccionarPrestamo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPrestamo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPrestamo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPrestamo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPrestamo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPrestamo = new JLabelMe();
		
		this.jLabelAccionesPrestamo.setText("Acciones");		
		this.jLabelAccionesPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPrestamo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPrestamo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPrestamo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPrestamo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPrestamo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPrestamo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPrestamo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPrestamo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPrestamo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePrestamo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePrestamo.setText("Graf.");
		this.jCheckBoxConGraficoReportePrestamo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPrestamo = new JButtonMe();
		//this.jButtonAnterioresPrestamo.setText("<<");
        this.jButtonAnterioresPrestamo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPrestamo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPrestamo = new JButtonMe();
		//this.jButtonSiguientesPrestamo.setText(">>");
        this.jButtonSiguientesPrestamo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPrestamo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPrestamo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPrestamo.setText("Nue");
        this.jButtonNuevoGuardarCambiosPrestamo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPrestamo,"nuevoguardarcambios_button","Nue",this.prestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPrestamo";
		inputMap = this.jButtonNuevoGuardarCambiosPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPrestamo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPrestamo";
		inputMap = this.jButtonRecargarInformacionPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPrestamo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPrestamo";
		inputMap = this.jButtonSiguientesPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPrestamo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPrestamo";
		inputMap = this.jButtonAnterioresPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPrestamo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPrestamo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPrestamo.setMinimumSize(new Dimension(this.getWidth(),PrestamoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PrestamoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPrestamo.setMaximumSize(new Dimension(this.getWidth(),PrestamoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PrestamoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPrestamo.setPreferredSize(new Dimension(this.getWidth(),PrestamoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PrestamoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPrestamo = new GridBagLayout();

			this.jPanelPaginacionPrestamo.setLayout(gridaBagLayoutPaginacionPrestamo);						
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy = 0;
			this.gridBagConstraintsPrestamo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPrestamo.add(this.jButtonAnterioresPrestamo, this.gridBagConstraintsPrestamo);
					
						
			this.gridBagConstraintsPrestamo = new GridBagConstraints();//
			this.gridBagConstraintsPrestamo.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsPrestamo.gridy = 0;//
			
			this.jPanelPaginacionPrestamo.add(this.jButtonNuevoGuardarCambiosPrestamo, this.gridBagConstraintsPrestamo);//
						
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPrestamo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPrestamo.gridy = 0;
			this.jPanelPaginacionPrestamo.add(this.jButtonSiguientesPrestamo, this.gridBagConstraintsPrestamo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();//
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPrestamo.gridy = 1;//
			this.gridBagConstraintsPrestamo.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPrestamo.add(this.jButtonNuevoPrestamo, this.gridBagConstraintsPrestamo);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPrestamo = new GridBagConstraints();
				this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPrestamo.gridy = 1;
				this.gridBagConstraintsPrestamo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPrestamo.add(this.jButtonNuevoRelacionesPrestamo, this.gridBagConstraintsPrestamo);
			}
			
			
			if(!this.prestamoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPrestamo = new GridBagConstraints();//
				this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsPrestamo.gridy = 1;//
				this.gridBagConstraintsPrestamo.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionPrestamo.add(this.jButtonGuardarCambiosTablaPrestamo, this.gridBagConstraintsPrestamo);//
			}
			
			
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();//
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPrestamo.gridy = 1;//
			this.gridBagConstraintsPrestamo.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPrestamo.add(this.jButtonDuplicarPrestamo, this.gridBagConstraintsPrestamo);//
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();//
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPrestamo.gridy = 1;//
			this.gridBagConstraintsPrestamo.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPrestamo.add(this.jButtonCopiarPrestamo, this.gridBagConstraintsPrestamo);//
		
			this.gridBagConstraintsPrestamo = new GridBagConstraints();//
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPrestamo.gridy = 1;//
			this.gridBagConstraintsPrestamo.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPrestamo.add(this.jButtonVerFormPrestamo, this.gridBagConstraintsPrestamo);//
		
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy = 1;
			this.gridBagConstraintsPrestamo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPrestamo.add(this.jButtonCerrarPrestamo, this.gridBagConstraintsPrestamo);
		
		
		
		this.jButtonRecargarInformacionPrestamo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPrestamo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPrestamo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPrestamo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPrestamo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPrestamo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPrestamo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPrestamo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPrestamo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPrestamo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPrestamo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPrestamo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPrestamo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPrestamo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPrestamo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPrestamo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPrestamo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPrestamo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePrestamo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePrestamo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePrestamo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePrestamo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPrestamo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPrestamo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPrestamo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPrestamo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPrestamo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPrestamo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPrestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPrestamo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Prestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Prestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Prestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Prestamo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPrestamo.setLayout(gridaBagParametrosReportesPrestamo);
			this.jPanelParametrosReportesAccionesPrestamo.setLayout(gridaBagParametrosReportesAccionesPrestamo);
			
			
			this.jPanelParametrosAuxiliar1Prestamo.setLayout(gridaBagParametrosAuxiliar1Prestamo);
			this.jPanelParametrosAuxiliar2Prestamo.setLayout(gridaBagParametrosAuxiliar2Prestamo);
			this.jPanelParametrosAuxiliar3Prestamo.setLayout(gridaBagParametrosAuxiliar3Prestamo);
			this.jPanelParametrosAuxiliar4Prestamo.setLayout(gridaBagParametrosAuxiliar4Prestamo);
			//this.jPanelParametrosAuxiliar5Prestamo.setLayout(gridaBagParametrosAuxiliar2Prestamo);			
			
			
			
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrestamo.add(this.jButtonRecargarInformacionPrestamo, this.gridBagConstraintsPrestamo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Prestamo.add(this.jComboBoxTiposPaginacionPrestamo, this.gridBagConstraintsPrestamo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Prestamo.add(this.jCheckBoxConAltoMaximoTablaPrestamo, this.gridBagConstraintsPrestamo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Prestamo.add(this.jComboBoxTiposArchivosReportesPrestamo, this.gridBagConstraintsPrestamo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrestamo.add(this.jPanelParametrosAuxiliar1Prestamo, this.gridBagConstraintsPrestamo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Prestamo.add(this.jComboBoxTiposReportesPrestamo, this.gridBagConstraintsPrestamo);																		
			
			
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Prestamo.add(this.jComboBoxTiposGraficosReportesPrestamo, this.gridBagConstraintsPrestamo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrestamo.add(this.jPanelParametrosAuxiliar4Prestamo, this.gridBagConstraintsPrestamo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrestamo.add(this.jComboBoxTiposReportesPrestamo, this.gridBagConstraintsPrestamo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPrestamo.add(this.jCheckBoxGenerarReportePrestamo, this.gridBagConstraintsPrestamo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrestamo.add(this.jPanelParametrosAuxiliar2Prestamo, this.gridBagConstraintsPrestamo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPrestamo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPrestamo.add(this.jLabelAccionesPrestamo, this.gridBagConstraintsPrestamo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPrestamo = new GridBagConstraints();
				this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPrestamo.add(this.jButtonAbrirOrderByPrestamo, this.gridBagConstraintsPrestamo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrestamo.add(this.jComboBoxTiposSeleccionarPrestamo, this.gridBagConstraintsPrestamo);			
			
			
			/*
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPrestamo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPrestamo.add(this.jCheckBoxSeleccionarTodosPrestamo, this.gridBagConstraintsPrestamo);
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPrestamo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPrestamo.add(this.jCheckBoxConGraficoReportePrestamo, this.gridBagConstraintsPrestamo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Prestamo.add(this.jCheckBoxSeleccionarTodosPrestamo, this.gridBagConstraintsPrestamo);															
				
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Prestamo.add(this.jCheckBoxSeleccionadosPrestamo, this.gridBagConstraintsPrestamo);															
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Prestamo.add(this.jCheckBoxConGraficoReportePrestamo, this.gridBagConstraintsPrestamo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrestamo.add(this.jPanelParametrosAuxiliar3Prestamo, this.gridBagConstraintsPrestamo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrestamo.add(this.jComboBoxTiposRelacionesPrestamo, this.gridBagConstraintsPrestamo);
				
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrestamo.add(this.jComboBoxTiposAccionesPrestamo, this.gridBagConstraintsPrestamo);
	
				
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrestamo.add(this.jTextFieldValorCampoGeneralPrestamo, this.gridBagConstraintsPrestamo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPrestamo = new GridBagLayout();

			this.jScrollPanelDatosPrestamo.setLayout(gridaBagLayoutDatosPrestamo);
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy = 0;
			this.gridBagConstraintsPrestamo.gridx = 0;
			
			this.jScrollPanelDatosPrestamo.add(this.jTableDatosPrestamo, this.gridBagConstraintsPrestamo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPrestamo.setViewportView(this.jTableDatosPrestamo);
		this.jTableDatosPrestamo.setFillsViewportHeight(true);
		this.jTableDatosPrestamo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPrestamo= new GridBagLayout();
		this.jPanelAccionesPrestamo.setLayout(gridaBagLayoutAccionesPrestamo);
		
		
		/*	
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 0;
			
		this.jPanelAccionesPrestamo.add(this.jButtonNuevoPrestamo, this.gridBagConstraintsPrestamo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContablePrestamo= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContablePrestamo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContablePrestamo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContablePrestamo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContablePrestamo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContablePrestamo.setLayout(gridaBagLayoutFK_IdAsientoContablePrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 0;
		gridBagConstraintsPrestamo.gridx = 0;
		jPanelFK_IdAsientoContablePrestamo.add(jLabelid_asiento_contableFK_IdAsientoContablePrestamo, gridBagConstraintsPrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 0;
		gridBagConstraintsPrestamo.gridx = 1;
		jPanelFK_IdAsientoContablePrestamo.add(jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo, gridBagConstraintsPrestamo);


		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
		gridBagConstraintsPrestamo.gridy = 0;
		gridBagConstraintsPrestamo.gridx = 0;
		jPanelFK_IdAsientoContablePrestamo.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePrestamo, gridBagConstraintsPrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 1;
		gridBagConstraintsPrestamo.gridx =1;
		jPanelFK_IdAsientoContablePrestamo.add(jButtonFK_IdAsientoContablePrestamo, gridBagConstraintsPrestamo);

		jTabbedPaneBusquedasPrestamo.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContablePrestamo);
		jTabbedPaneBusquedasPrestamo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoPrestamo= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoPrestamo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPrestamo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPrestamo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoPrestamo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoPrestamo.setLayout(gridaBagLayoutFK_IdEmpleadoPrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 0;
		gridBagConstraintsPrestamo.gridx = 0;
		jPanelFK_IdEmpleadoPrestamo.add(jLabelid_empleadoFK_IdEmpleadoPrestamo, gridBagConstraintsPrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 0;
		gridBagConstraintsPrestamo.gridx = 1;
		jPanelFK_IdEmpleadoPrestamo.add(jComboBoxid_empleadoFK_IdEmpleadoPrestamo, gridBagConstraintsPrestamo);


		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
		gridBagConstraintsPrestamo.gridy = 0;
		gridBagConstraintsPrestamo.gridx = 0;
		jPanelFK_IdEmpleadoPrestamo.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoPrestamo, gridBagConstraintsPrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 1;
		gridBagConstraintsPrestamo.gridx =1;
		jPanelFK_IdEmpleadoPrestamo.add(jButtonFK_IdEmpleadoPrestamo, gridBagConstraintsPrestamo);

		jTabbedPaneBusquedasPrestamo.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoPrestamo);
		jTabbedPaneBusquedasPrestamo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoCuotaPrestamo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCuotaPrestamo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCuotaPrestamo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCuotaPrestamo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCuotaPrestamo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCuotaPrestamo.setLayout(gridaBagLayoutFK_IdTipoCuotaPrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 0;
		gridBagConstraintsPrestamo.gridx = 0;
		jPanelFK_IdTipoCuotaPrestamo.add(jLabelid_tipo_cuotaFK_IdTipoCuotaPrestamo, gridBagConstraintsPrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 0;
		gridBagConstraintsPrestamo.gridx = 1;
		jPanelFK_IdTipoCuotaPrestamo.add(jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo, gridBagConstraintsPrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 1;
		gridBagConstraintsPrestamo.gridx =1;
		jPanelFK_IdTipoCuotaPrestamo.add(jButtonFK_IdTipoCuotaPrestamo, gridBagConstraintsPrestamo);

		jTabbedPaneBusquedasPrestamo.addTab("3.-Por Tipo Cuota ", jPanelFK_IdTipoCuotaPrestamo);
		jTabbedPaneBusquedasPrestamo.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoPrestamoPrestamo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrestamoPrestamo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrestamoPrestamo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrestamoPrestamo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrestamoPrestamo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrestamoPrestamo.setLayout(gridaBagLayoutFK_IdTipoPrestamoPrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 0;
		gridBagConstraintsPrestamo.gridx = 0;
		jPanelFK_IdTipoPrestamoPrestamo.add(jLabelid_tipo_prestamoFK_IdTipoPrestamoPrestamo, gridBagConstraintsPrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 0;
		gridBagConstraintsPrestamo.gridx = 1;
		jPanelFK_IdTipoPrestamoPrestamo.add(jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo, gridBagConstraintsPrestamo);

		gridBagConstraintsPrestamo = new GridBagConstraints();
		gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrestamo.gridy = 1;
		gridBagConstraintsPrestamo.gridx =1;
		jPanelFK_IdTipoPrestamoPrestamo.add(jButtonFK_IdTipoPrestamoPrestamo, gridBagConstraintsPrestamo);

		jTabbedPaneBusquedasPrestamo.addTab("4.-Por Tipo Prestamo ", jPanelFK_IdTipoPrestamoPrestamo);
		jTabbedPaneBusquedasPrestamo.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPrestamo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPrestamo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.prestamoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPrestamo = new GridBagConstraints();						
			this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPrestamo.gridx = 0;		
			//this.gridBagConstraintsPrestamo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPrestamo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPrestamo, this.gridBagConstraintsPrestamo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPrestamo.gridx = 0;		
		//this.gridBagConstraintsPrestamo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPrestamo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPrestamo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPrestamo.gridx = 0;		
			this.gridBagConstraintsPrestamo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPrestamo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPrestamo, this.gridBagConstraintsPrestamo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrestamo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPrestamo, this.gridBagConstraintsPrestamo);								
		
		
		/*
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrestamo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPrestamo, this.gridBagConstraintsPrestamo);
		*/		
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPrestamo.gridx =0;
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPrestamo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPrestamo, this.gridBagConstraintsPrestamo);
				
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrestamo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPrestamo, this.gridBagConstraintsPrestamo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PrestamoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPrestamo = new GridBagLayout();
			this.jPanelBusquedasParametrosPrestamo.setLayout(gridaBagLayoutBusquedasParametrosPrestamo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPrestamo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPrestamo, this.gridBagConstraintsPrestamo);
			
			
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPrestamo, this.gridBagConstraintsPrestamo);
		
			
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPrestamo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPrestamo, this.gridBagConstraintsPrestamo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPrestamo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPrestamo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPrestamo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPrestamo.setName("jPanelReporteDinamicoPrestamo"); 
		
		this.jPanelReporteDinamicoPrestamo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPrestamo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPrestamo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPrestamo.setLayout(gridaBagLayoutReporteDinamicoPrestamo);
		
		
		this.jInternalFrameReporteDinamicoPrestamo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPrestamo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePrestamo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPrestamo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPrestamo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPrestamo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPrestamo.setResizable(true);
	    this.jInternalFrameReporteDinamicoPrestamo.setClosable(true);
	    this.jInternalFrameReporteDinamicoPrestamo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPrestamo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPrestamo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPrestamo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prestamos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePrestamo = new JLabelMe();

		this.jLabelColumnasSelectReportePrestamo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPrestamo.add(this.jLabelColumnasSelectReportePrestamo, this.gridBagConstraintsPrestamo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePrestamo = new JList<Reporte>();
		this.jListColumnasSelectReportePrestamo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePrestamo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePrestamo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePrestamo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePrestamo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePrestamo=new JScrollPane(this.jListColumnasSelectReportePrestamo);
			
			this.jScrollColumnasSelectReportePrestamo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePrestamo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePrestamo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPrestamo.add(this.jListColumnasSelectReportePrestamo, this.gridBagConstraintsPrestamo);
		this.jPanelReporteDinamicoPrestamo.add(this.jScrollColumnasSelectReportePrestamo, this.gridBagConstraintsPrestamo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePrestamo = new JLabelMe();

		this.jLabelRelacionesSelectReportePrestamo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPrestamo.add(this.jLabelRelacionesSelectReportePrestamo, this.gridBagConstraintsPrestamo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePrestamo = new JList<Reporte>();
		this.jListRelacionesSelectReportePrestamo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePrestamo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePrestamo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePrestamo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePrestamo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePrestamo=new JScrollPane(this.jListRelacionesSelectReportePrestamo);
			
			this.jScrollRelacionesSelectReportePrestamo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePrestamo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePrestamo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPrestamo.add(this.jListRelacionesSelectReportePrestamo, this.gridBagConstraintsPrestamo);
		this.jPanelReporteDinamicoPrestamo.add(this.jScrollRelacionesSelectReportePrestamo, this.gridBagConstraintsPrestamo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPrestamo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPrestamo = new JComboBoxMe();
		this.jListColumnasValoresGraficoPrestamo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPrestamo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPrestamo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPrestamo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPrestamo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPrestamo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPrestamo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPrestamo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPrestamo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPrestamo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPrestamo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPrestamo = new JLabelMe();

		this.jLabelConGraficoDinamicoPrestamo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPrestamo.add(this.jLabelConGraficoDinamicoPrestamo, this.gridBagConstraintsPrestamo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPrestamo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPrestamo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPrestamo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPrestamo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPrestamo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPrestamo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrestamo.add(this.jCheckBoxConGraficoDinamicoPrestamo, this.gridBagConstraintsPrestamo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPrestamo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPrestamo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPrestamo.add(this.jLabelColumnaCategoriaGraficoPrestamo, this.gridBagConstraintsPrestamo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPrestamo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPrestamo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPrestamo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPrestamo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPrestamo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPrestamo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPrestamo.add(this.jComboBoxColumnaCategoriaGraficoPrestamo, this.gridBagConstraintsPrestamo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPrestamo = new JLabelMe();

		this.jLabelColumnaCategoriaValorPrestamo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrestamo.add(this.jLabelColumnaCategoriaValorPrestamo, this.gridBagConstraintsPrestamo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPrestamo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPrestamo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPrestamo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPrestamo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPrestamo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPrestamo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPrestamo.add(this.jComboBoxColumnaCategoriaValorPrestamo, this.gridBagConstraintsPrestamo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPrestamo = new JLabelMe();

		this.jLabelColumnasValoresGraficoPrestamo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrestamo.add(this.jLabelColumnasValoresGraficoPrestamo, this.gridBagConstraintsPrestamo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPrestamo = new JList<Reporte>();
		this.jListColumnasValoresGraficoPrestamo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPrestamo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPrestamo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPrestamo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPrestamo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPrestamo=new JScrollPane(this.jListColumnasValoresGraficoPrestamo);
			
			this.jScrollColumnasValoresGraficoPrestamo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPrestamo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPrestamo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPrestamo.add(this.jListColumnasSelectReportePrestamo, this.gridBagConstraintsPrestamo);
		this.jPanelReporteDinamicoPrestamo.add(this.jScrollColumnasValoresGraficoPrestamo, this.gridBagConstraintsPrestamo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPrestamo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPrestamo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrestamo.add(this.jLabelTiposGraficosReportesDinamicoPrestamo, this.gridBagConstraintsPrestamo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPrestamo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPrestamo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPrestamo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPrestamo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPrestamo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPrestamo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrestamo.add(this.jComboBoxTiposGraficosReportesDinamicoPrestamo, this.gridBagConstraintsPrestamo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPrestamo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPrestamo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrestamo.add(this.jLabelGenerarExcelReporteDinamicoPrestamo, this.gridBagConstraintsPrestamo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPrestamo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPrestamo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPrestamo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPrestamo.setToolTipText("Generar EXCEL"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPrestamo.add(this.jButtonGenerarExcelReporteDinamicoPrestamo, this.gridBagConstraintsPrestamo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrestamo.add(this.jComboBoxTiposReportesDinamicoPrestamo, this.gridBagConstraintsPrestamo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPrestamo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPrestamo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrestamo.add(this.jLabelTiposArchivoReporteDinamicoPrestamo, this.gridBagConstraintsPrestamo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrestamo.add(this.jComboBoxTiposArchivosReportesDinamicoPrestamo, this.gridBagConstraintsPrestamo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPrestamo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPrestamo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPrestamo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPrestamo.setToolTipText("Generar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrestamo.add(this.jButtonGenerarReporteDinamicoPrestamo, this.gridBagConstraintsPrestamo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPrestamo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPrestamo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPrestamo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPrestamo.setToolTipText("Cancelar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrestamo.add(this.jButtonCerrarReporteDinamicoPrestamo, this.gridBagConstraintsPrestamo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPrestamo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPrestamo= new JScrollPane(jPanelReporteDinamicoPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPrestamo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPrestamo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPrestamo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prestamos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPrestamo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPrestamo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPrestamo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPrestamo);
		this.jInternalFrameReporteDinamicoPrestamo.getContentPane().add(this.jScrollPanelReporteDinamicoPrestamo, this.gridBagConstraintsPrestamo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPrestamo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPrestamo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPrestamo.setName("jPanelImportacionPrestamo"); 
		
		this.jPanelImportacionPrestamo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPrestamo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPrestamo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPrestamo.setLayout(gridaBagLayoutImportacionPrestamo);
		
		
		this.jInternalFrameImportacionPrestamo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPrestamo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPrestamo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePrestamo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPrestamo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPrestamo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPrestamo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPrestamo.setResizable(true);
	    this.jInternalFrameImportacionPrestamo.setClosable(true);
	    this.jInternalFrameImportacionPrestamo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPrestamo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPrestamo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPrestamo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPrestamo.setResizable(true);
	    this.jInternalFrameImportacionPrestamo.setClosable(true);
	    this.jInternalFrameImportacionPrestamo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPrestamo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPrestamo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPrestamo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prestamos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPrestamo = new JLabelMe();

		this.jLabelArchivoImportacionPrestamo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYImportacion;		
		this.gridBagConstraintsPrestamo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPrestamo.add(this.jLabelArchivoImportacionPrestamo, this.gridBagConstraintsPrestamo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPrestamo = new JFileChooser();		
		this.jFileChooserImportacionPrestamo.setToolTipText("ESCOGER ARCHIVO"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPrestamo = new JButtonMe();
		this.jButtonAbrirImportacionPrestamo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPrestamo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPrestamo.setToolTipText("Generar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrestamo.add(this.jButtonAbrirImportacionPrestamo, this.gridBagConstraintsPrestamo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPrestamo = new JLabelMe();

		this.jLabelPathArchivoImportacionPrestamo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYImportacion;		
		this.gridBagConstraintsPrestamo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPrestamo.add(this.jLabelPathArchivoImportacionPrestamo, this.gridBagConstraintsPrestamo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPrestamo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPrestamo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPrestamo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPrestamo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrestamo.add(this.jTextFieldPathArchivoImportacionPrestamo, this.gridBagConstraintsPrestamo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPrestamo = new JButtonMe();
		this.jButtonGenerarImportacionPrestamo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPrestamo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPrestamo.setToolTipText("Generar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrestamo.add(this.jButtonGenerarImportacionPrestamo, this.gridBagConstraintsPrestamo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPrestamo = new JButtonMe();
		this.jButtonCerrarImportacionPrestamo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPrestamo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPrestamo.setToolTipText("Cancelar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrestamo.add(this.jButtonCerrarImportacionPrestamo, this.gridBagConstraintsPrestamo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPrestamo = new GridBagLayout();
		
		this.jScrollPanelImportacionPrestamo= new JScrollPane(jPanelImportacionPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy =iPosYImportacion;
		this.gridBagConstraintsPrestamo.gridx =iPosXImportacion;
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPrestamo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPrestamo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPrestamo);
		this.jInternalFrameImportacionPrestamo.getContentPane().add(this.jScrollPanelImportacionPrestamo, this.gridBagConstraintsPrestamo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPrestamo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPrestamo = new JButtonMe();
			this.jButtonAbrirOrderByPrestamo.setText("Orden");
			this.jButtonAbrirOrderByPrestamo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPrestamo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPrestamo";
			inputMap = this.jButtonAbrirOrderByPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPrestamo"));
		
		
			GridBagLayout gridaBagLayoutOrderByPrestamo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPrestamo.setName("jPanelOrderByPrestamo"); 
			
			this.jPanelOrderByPrestamo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPrestamo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPrestamo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPrestamo.setLayout(gridaBagLayoutOrderByPrestamo);
			
			
			this.jTableDatosPrestamoOrderBy = new JTableMe();        
			this.jTableDatosPrestamoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPrestamoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPrestamoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPrestamoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPrestamoOrderBy.setViewportView(this.jTableDatosPrestamoOrderBy);
			this.jTableDatosPrestamoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPrestamoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPrestamo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPrestamo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPrestamo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePrestamo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPrestamo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPrestamo.setTitle("Orden");
			this.jInternalFrameOrderByPrestamo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPrestamo.setResizable(true);
			this.jInternalFrameOrderByPrestamo.setClosable(true);
			this.jInternalFrameOrderByPrestamo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPrestamo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPrestamo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPrestamo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prestamos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPrestamo.gridx =iPosXOrderBy;
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPrestamo.ipady =150;
				
			this.jPanelOrderByPrestamo.add(jScrollPanelDatosPrestamoOrderBy, this.gridBagConstraintsPrestamo);//this.jTableDatosPrestamoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPrestamo = new JButtonMe();
			this.jButtonCerrarOrderByPrestamo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPrestamo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPrestamo.setToolTipText("Cancelar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPrestamo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPrestamo.add(this.jButtonCerrarOrderByPrestamo, this.gridBagConstraintsPrestamo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPrestamo = new GridBagLayout();
			
			this.jScrollPanelOrderByPrestamo= new JScrollPane(jPanelOrderByPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.gridy =iPosYOrderBy;
			this.gridBagConstraintsPrestamo.gridx =iPosXOrderBy;
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPrestamo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPrestamo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPrestamo);
			
			this.jInternalFrameOrderByPrestamo.getContentPane().add(this.jScrollPanelOrderByPrestamo, this.gridBagConstraintsPrestamo);			
		
		} else {
			this.jButtonAbrirOrderByPrestamo = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.prestamoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPrestamo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPrestamo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPrestamo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPrestamo.getRowHeight();//PrestamoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPrestamo.isSelected()) {
					iHeightTable=PrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPrestamo.isSelected()) {
					iHeightTable=PrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPrestamo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPrestamo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPrestamo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPrestamo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPrestamo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPrestamo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPrestamo!=null && this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy()!=null) {
			//if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPrestamo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPrestamo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPrestamo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPrestamo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPrestamo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPrestamo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=prestamoLogic.getPrestamos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=prestamos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	/*
	PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS SE DEBE MODIFICAR Y VERIFICAR LOS VALORES CONTANTES:	
		final public static Integer ISWING_TAMANIOMAXIMO_TABLADATOSREL=240;//230;350;		
		final public static Integer ISWING_TAMANIOMINIMO_TABLADATOSREL=240;//230;260
		
		final public static Integer ISWING_ALTO_TABPANE=375;//375;400;260;
	CASO CONTRARIO, ESTOS VALORES SERIAN PARA CADA CASO (NO CONSTANTES)
	
	NOTA:
	* LA ALINEACION HORIZONTAL,FALTA
	*/
	
	//PARA REPORTES
	public static List<Prestamo> TraerPrestamoBeans(List<Prestamo> prestamos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Prestamo prestamo:prestamos) {
					
				if(!(PrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					prestamo.setsDetalleGeneralEntityReporte(PrestamoConstantesFunciones.getPrestamoDescripcion(prestamo));
										
						
					
					

					if(prestamo.getAbonoPrestamos()!=null && Funciones.existeClass(classes,AbonoPrestamo.class)) {
						try{prestamo.setabonoprestamosDescripcionReporte(new JRBeanCollectionDataSource(AbonoPrestamoJInternalFrame.TraerAbonoPrestamoBeans(prestamo.getAbonoPrestamos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(prestamo.getCuotas()!=null && Funciones.existeClass(classes,Cuota.class)) {
						try{prestamo.setcuotasDescripcionReporte(new JRBeanCollectionDataSource(CuotaJInternalFrame.TraerCuotaBeans(prestamo.getCuotas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//prestamo.setsDetalleGeneralEntityReporte(prestamo.getsDetalleGeneralEntityReporte());
										
				}
				
				//prestamobeans.add(prestamobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return prestamos;
    }
	//PARA REPORTES FIN
}
