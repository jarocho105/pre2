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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.nomina.util.CuotaConstantesFunciones;

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
public class CuotaJInternalFrame extends CuotaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCuota;
	
	protected JMenuBar jmenuBarCuota;
	
	protected JMenu jmenuCuota;
	protected JMenu jmenuDatosCuota;
	protected JMenu jmenuArchivoCuota;
	protected JMenu jmenuAccionesCuota;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuota;	
	protected GridBagConstraints gridBagConstraintsCuota;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CuotaDetalleFormJInternalFrame jInternalFrameDetalleFormCuota;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCuota;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCuota;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_prestamo="";

	protected EstadoCuotaBeanSwingJInternalFrame estadocuotaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocuota="";

	protected DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_defiprovisionempleado="";
	
	public CuotaSessionBean cuotaSessionBean;
		
	
	
	public PrestamoSessionBean prestamoSessionBean;
	public EstadoCuotaSessionBean estadocuotaSessionBean;
	public DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Cuota> cuotas;		
	public List<Cuota> cuotasEliminados;	
	public List<Cuota> cuotasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCuota;		
	protected JButton jButtonAbrirOrderByCuota;
	
	
	//protected JPanel jPanelOrderByCuota;
	//public JScrollPane jScrollPanelOrderByCuota;	
	//protected JButton jButtonCerrarOrderByCuota;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CuotaLogic cuotaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCuota;
	public JScrollPane jScrollPanelDatosEdicionCuota;
	public JScrollPane jScrollPanelDatosGeneralCuota;
    
	
	
	//public JScrollPane jScrollPanelDatosCuotaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCuota;
	//public JScrollPane jScrollPanelImportacionCuota;
	
	
	
	protected JPanel jPanelAccionesCuota;
	
    protected JPanel jPanelPaginacionCuota;
    protected JPanel jPanelParametrosReportesCuota;
	protected JPanel jPanelParametrosReportesAccionesCuota;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Cuota;
	protected JPanel jPanelParametrosAuxiliar2Cuota;
	protected JPanel jPanelParametrosAuxiliar3Cuota;
	protected JPanel jPanelParametrosAuxiliar4Cuota;
	//protected JPanel jPanelParametrosAuxiliar5Cuota;
	
	
	
	//protected JPanel jPanelReporteDinamicoCuota;
	//protected JPanel jPanelImportacionCuota;
	
	
	public JTable jTableDatosCuota;
	
	
	
	//public JTable jTableDatosCuotaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCuota;
	protected JButton jButtonDuplicarCuota;
	protected JButton jButtonCopiarCuota;
	protected JButton jButtonVerFormCuota;
	protected JButton jButtonNuevoRelacionesCuota;
	protected JButton jButtonModificarCuota;
	
    protected JButton jButtonGuardarCambiosTablaCuota;
	protected JButton jButtonCerrarCuota;
	
	
	protected JButton jButtonRecargarInformacionCuota;
	protected JButton jButtonProcesarInformacionCuota;
	
	
	protected JButton jButtonAnterioresCuota;
	protected JButton jButtonSiguientesCuota;
	protected JButton jButtonNuevoGuardarCambiosCuota;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCuota;
	//protected JButton jButtonCerrarReporteDinamicoCuota;
	//protected JButton jButtonGenerarExcelReporteDinamicoCuota;	
	
	
	
	//protected JButton jButtonAbrirImportacionCuota;
	//protected JButton jButtonGenerarImportacionCuota;
	//protected JButton jButtonCerrarImportacionCuota;
	//protected JFileChooser jFileChooserImportacionCuota;
	//protected File fileImportacionCuota;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuota;
	protected JButton jButtonDuplicarToolBarCuota;
	protected JButton jButtonNuevoRelacionesToolBarCuota;
	
	
	public JButton jButtonGuardarCambiosToolBarCuota;
	protected JButton jButtonCopiarToolBarCuota;
	protected JButton jButtonVerFormToolBarCuota;
	public JButton jButtonGuardarCambiosTablaToolBarCuota;
	protected JButton jButtonMostrarOcultarTablaToolBarCuota;
	protected JButton jButtonCerrarToolBarCuota;
	
	protected JButton jButtonRecargarInformacionToolBarCuota;
	protected JButton jButtonProcesarInformacionToolBarCuota;
	protected JButton jButtonAnterioresToolBarCuota;
	protected JButton jButtonSiguientesToolBarCuota;
	protected JButton jButtonNuevoGuardarCambiosToolBarCuota;
	protected JButton jButtonAbrirOrderByToolBarCuota;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuota;
	protected JMenuItem jMenuItemDuplicarCuota;
	protected JMenuItem jMenuItemNuevoRelacionesCuota;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCuota;
	protected JMenuItem jMenuItemCopiarCuota;
	protected JMenuItem jMenuItemVerFormCuota;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuota;
	protected JMenuItem jMenuItemCerrarCuota;
	protected JMenuItem jMenuItemDetalleCerrarCuota;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCuota;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuota;
	
	protected JMenuItem jMenuItemRecargarInformacionCuota;
	protected JMenuItem jMenuItemProcesarInformacionCuota;
	protected JMenuItem jMenuItemAnterioresCuota;
	protected JMenuItem jMenuItemSiguientesCuota;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuota;
	protected JMenuItem jMenuItemAbrirOrderByCuota;
	protected JMenuItem jMenuItemMostrarOcultarCuota;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuota;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCuota;
	protected JCheckBox jCheckBoxSeleccionadosCuota;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCuota;
	protected JCheckBox jCheckBoxConGraficoReporteCuota;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCuota;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCuota;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCuota;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCuota;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCuota;
	protected JTextField jTextFieldValorCampoGeneralCuota;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCuota;
	//public JList<Reporte> jListColumnasSelectReporteCuota;
	//public JScrollPane jScrollColumnasSelectReporteCuota;
	
	//public JLabel jLabelRelacionesSelectReporteCuota;
	//public JList<Reporte> jListRelacionesSelectReporteCuota;
	//public JScrollPane jScrollRelacionesSelectReporteCuota;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCuota;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCuota;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCuota;
	//public JLabel jLabelTiposArchivoReporteDinamicoCuota;
	
		
	//public JLabel jLabelArchivoImportacionCuota;	
	//public JLabel jLabelPathArchivoImportacionCuota;
	//protected JTextField jTextFieldPathArchivoImportacionCuota;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCuota;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCuota;
	
	//public JLabel jLabelColumnaCategoriaValorCuota;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCuota;
	
	//public JLabel jLabelColumnasValoresGraficoCuota;
	//public JList<Reporte> jListColumnasValoresGraficoCuota;
	//public JScrollPane jScrollColumnasValoresGraficoCuota;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCuota;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCuota;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCuota;
	public JPanel jPanelFK_IdDefiProvisionEmpleadoCuota;
	public JButton jButtonFK_IdDefiProvisionEmpleadoCuota;
	public JPanel jPanelFK_IdEstadoCuotaCuota;
	public JButton jButtonFK_IdEstadoCuotaCuota;
	public JPanel jPanelFK_IdPrestamoCuota;
	public JButton jButtonFK_IdPrestamoCuota;
	
	public JPanel jPanelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota;
	public JLabel jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota;
	public JButton jButtonid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuotaUpdate= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuotaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_cuotaFK_IdEstadoCuotaCuota;
	public JLabel jLabelid_estado_cuotaFK_IdEstadoCuotaCuota;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota;
	public JButton jButtonid_estado_cuotaFK_IdEstadoCuotaCuota= new JButtonMe();
	public JButton jButtonid_estado_cuotaFK_IdEstadoCuotaCuotaUpdate= new JButtonMe();
	public JButton jButtonid_estado_cuotaFK_IdEstadoCuotaCuotaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_prestamoFK_IdPrestamoCuota;
	public JLabel jLabelid_prestamoFK_IdPrestamoCuota;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_prestamoFK_IdPrestamoCuota;
	public JButton jButtonid_prestamoFK_IdPrestamoCuota= new JButtonMe();
	public JButton jButtonid_prestamoFK_IdPrestamoCuotaUpdate= new JButtonMe();
	public JButton jButtonid_prestamoFK_IdPrestamoCuotaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CuotaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Cuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuotaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuotaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuotaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCuota)	{
		this.jButtonRecargarInformacionCuota = jButtonRecargarInformacionCuota;
	}
	
	public JButton getjButtonProcesarInformacionCuota() {
		return this.jButtonProcesarInformacionCuota;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuota)	{
		this.jButtonProcesarInformacionCuota = jButtonProcesarInformacionCuota;
	}
	
	
	public JButton getjButtonRecargarInformacionCuota() {
		return this.jButtonRecargarInformacionCuota;
	}
	
	
	public List<Cuota> getcuotas() {
		return this.cuotas;
	}

	public void setcuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}
	
	public List<Cuota> getcuotasAux() {
		return this.cuotasAux;
	}

	public void setcuotasAux(List<Cuota> cuotasAux) {
		this.cuotasAux = cuotasAux;
	}
	
	public List<Cuota> getcuotasEliminados() {
		return this.cuotasEliminados;
	}

	public void setCuotasEliminados(List<Cuota> cuotasEliminados) {
		this.cuotasEliminados = cuotasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCuota() {
		return jComboBoxTiposSeleccionarCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCuota(
			JComboBox jComboBoxTiposSeleccionarCuota) {
		this.jComboBoxTiposSeleccionarCuota = jComboBoxTiposSeleccionarCuota;
	}
	
	public void setBorderResaltarTiposSeleccionarCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCuota .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCuota() {
		return jTextFieldValorCampoGeneralCuota;
	}

	public void setjTextFieldValorCampoGeneralCuota(
			JTextField jTextFieldValorCampoGeneralCuota) {
		this.jTextFieldValorCampoGeneralCuota = jTextFieldValorCampoGeneralCuota;
	}

	public void setBorderResaltarValorCampoGeneralCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuota.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCuota .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCuota() {
		return this.jCheckBoxSeleccionarTodosCuota;
	}

	public void setjCheckBoxSeleccionarTodosCuota(
			JCheckBox jCheckBoxSeleccionarTodosCuota) {
		this.jCheckBoxSeleccionarTodosCuota = jCheckBoxSeleccionarTodosCuota;
	}

	public void setBorderResaltarSeleccionarTodosCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuota.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCuota .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCuota() {
		return this.jCheckBoxSeleccionadosCuota;
	}

	public void setjCheckBoxSeleccionadosCuota(
			JCheckBox jCheckBoxSeleccionadosCuota) {
		this.jCheckBoxSeleccionadosCuota = jCheckBoxSeleccionadosCuota;
	}
	
	public void setBorderResaltarSeleccionadosCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuota.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCuota .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCuota() {
		return this.jComboBoxTiposArchivosReportesCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCuota(
			JComboBox jComboBoxTiposArchivosReportesCuota) {
		this.jComboBoxTiposArchivosReportesCuota = jComboBoxTiposArchivosReportesCuota;
	}

	public void setBorderResaltarTiposArchivosReportesCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCuota() {
		return this.jComboBoxTiposReportesCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCuota(
			JComboBox jComboBoxTiposReportesCuota) {
		this.jComboBoxTiposReportesCuota = jComboBoxTiposReportesCuota;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCuota() {
	//	return jComboBoxTiposReportesDinamicoCuota;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCuota(
	//		JComboBox jComboBoxTiposReportesDinamicoCuota) {
	//	this.jComboBoxTiposReportesDinamicoCuota = jComboBoxTiposReportesDinamicoCuota;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCuota() {
	//	return jComboBoxTiposArchivosReportesDinamicoCuota;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCuota(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCuota) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCuota = jComboBoxTiposArchivosReportesDinamicoCuota;
	//}
	
	public void setBorderResaltarTiposReportesCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCuota() {
		return this.jComboBoxTiposGraficosReportesCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCuota(
			JComboBox jComboBoxTiposGraficosReportesCuota) {
		this.jComboBoxTiposGraficosReportesCuota = jComboBoxTiposGraficosReportesCuota;
	}
	
	public void setBorderResaltarTiposGraficosReportesCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCuota() {
		return this.jComboBoxTiposPaginacionCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCuota(
			JComboBox jComboBoxTiposPaginacionCuota) {
		this.jComboBoxTiposPaginacionCuota = jComboBoxTiposPaginacionCuota;
	}
	
	public void setBorderResaltarTiposPaginacionCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCuota() {
		return this.jComboBoxTiposRelacionesCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuota() {
		return this.jComboBoxTiposAccionesCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuota(
			JComboBox jComboBoxTiposRelacionesCuota) {
		this.jComboBoxTiposRelacionesCuota = jComboBoxTiposRelacionesCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuota(
			JComboBox jComboBoxTiposAccionesCuota) {
		this.jComboBoxTiposAccionesCuota = jComboBoxTiposAccionesCuota;
	}
	
	public void setBorderResaltarTiposRelacionesCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCuota .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCuota .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCuota() {
	//	return jCheckBoxConGraficoDinamicoCuota;
	//}

	//public void setjCheckBoxConGraficoDinamicoCuota(
	//		JCheckBox jCheckBoxConGraficoDinamicoCuota) {
	//	this.jCheckBoxConGraficoDinamicoCuota = jCheckBoxConGraficoDinamicoCuota;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCuota() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCuota.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCuota .setBorder(borderResaltar);		
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
		this.cuotaSessionBean=new CuotaSessionBean();
		
		this.cuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuotaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CuotaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuotaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuotaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuota MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
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
		
		CuotaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Cuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCuota= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCuota,this.jTtoolBarCuota,
							"nuevo","nuevo","Nuevo"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCuota,this.jTtoolBarCuota,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCuota,this.jTtoolBarCuota,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCuota,this.jTtoolBarCuota,
							"duplicar","duplicar","Duplicar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCuota,this.jTtoolBarCuota,
							"copiar","copiar","Copiar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCuota,this.jTtoolBarCuota,
							"ver_form","ver_form","Ver"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuota,this.jTtoolBarCuota,
							"recargar","recargar","Recargar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuota,this.jTtoolBarCuota,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuota,this.jTtoolBarCuota,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCuota,this.jTtoolBarCuota,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCuota,this.jTtoolBarCuota,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCuota,this.jTtoolBarCuota,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCuota,this.jTtoolBarCuota,
							"cerrar","cerrar","Salir"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCuota=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCuota;
			
				this.jButtonProcesarInformacionToolBarCuota=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCuota;
				
		//protected JButton jButtonModificarToolBarCuota;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCuota=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCuota=new JMenuMe("General");
		this.jmenuArchivoCuota=new JMenuMe("Archivo");
		this.jmenuAccionesCuota=new JMenuMe("Acciones");
		this.jmenuDatosCuota=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuota= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuota.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuota,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCuota= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCuota.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCuota,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCuota= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCuota.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCuota,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCuota= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuota.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuota,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCuota= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCuota.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCuota,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCuota= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCuota.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCuota,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCuota= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCuota.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCuota,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuota= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuota.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuota,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCuota= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCuota.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCuota,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCuota= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCuota.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCuota,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCuota= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCuota.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCuota,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCuota= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCuota.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCuota,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCuota= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCuota.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCuota,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuota,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCuota= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCuota.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCuota,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuota,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCuota= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCuota.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCuota,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCuota.add(this.jMenuItemCerrarCuota);
			
			this.jmenuAccionesCuota.add(this.jMenuItemNuevoCuota);
			this.jmenuAccionesCuota.add(this.jMenuItemNuevoGuardarCambiosCuota);
			this.jmenuAccionesCuota.add(this.jMenuItemNuevoRelacionesCuota);
			this.jmenuAccionesCuota.add(this.jMenuItemGuardarCambiosTablaCuota);		
			this.jmenuAccionesCuota.add(this.jMenuItemDuplicarCuota);		
			this.jmenuAccionesCuota.add(this.jMenuItemCopiarCuota);		
			this.jmenuAccionesCuota.add(this.jMenuItemVerFormCuota);		
			
			this.jmenuDatosCuota.add(this.jMenuItemRecargarInformacionCuota);				
			this.jmenuDatosCuota.add(this.jMenuItemAnterioresCuota);				
			this.jmenuDatosCuota.add(this.jMenuItemSiguientesCuota);				
			this.jmenuDatosCuota.add(this.jMenuItemAbrirOrderByCuota);				
			this.jmenuDatosCuota.add(this.jMenuItemMostrarOcultarCuota);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCuota.add(this.jMenuItemGuardarCambiosCuota);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCuota.add(this.jmenuArchivoCuota);		
			this.jmenuBarCuota.add(this.jmenuAccionesCuota);		
			this.jmenuBarCuota.add(this.jmenuDatosCuota);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCuota);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCuota() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdDefiProvisionEmpleadoCuota=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDefiProvisionEmpleadoCuota.setToolTipText("Buscar Por Defi Provision Empleado ");
		this.jButtonFK_IdDefiProvisionEmpleadoCuota= new JButtonMe();
		this.jButtonFK_IdDefiProvisionEmpleadoCuota.setText("Buscar");
		this.jButtonFK_IdDefiProvisionEmpleadoCuota.setToolTipText("Buscar Por Defi Provision Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDefiProvisionEmpleadoCuota,"buscar_button","Buscar Por Defi Provision Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDefiProvisionEmpleadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota = new JLabelMe();
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setText("Defi Provision Empleado :");
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setToolTipText("Defi Provision Empleado");
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota= new JComboBoxMe();
		jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoCuotaCuota=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoCuotaCuota.setToolTipText("Buscar Por Estado Cuota ");
		this.jButtonFK_IdEstadoCuotaCuota= new JButtonMe();
		this.jButtonFK_IdEstadoCuotaCuota.setText("Buscar");
		this.jButtonFK_IdEstadoCuotaCuota.setToolTipText("Buscar Por Estado Cuota ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoCuotaCuota,"buscar_button","Buscar Por Estado Cuota ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoCuotaCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_cuotaFK_IdEstadoCuotaCuota = new JLabelMe();
		jLabelid_estado_cuotaFK_IdEstadoCuotaCuota.setText("Estado Cuota :");
		jLabelid_estado_cuotaFK_IdEstadoCuotaCuota.setToolTipText("Estado Cuota");
		jLabelid_estado_cuotaFK_IdEstadoCuotaCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_cuotaFK_IdEstadoCuotaCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_cuotaFK_IdEstadoCuotaCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_cuotaFK_IdEstadoCuotaCuota,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota= new JComboBoxMe();
		jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPrestamoCuota=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPrestamoCuota.setToolTipText("Buscar Por Prestamo ");
		this.jButtonFK_IdPrestamoCuota= new JButtonMe();
		this.jButtonFK_IdPrestamoCuota.setText("Buscar");
		this.jButtonFK_IdPrestamoCuota.setToolTipText("Buscar Por Prestamo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPrestamoCuota,"buscar_button","Buscar Por Prestamo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPrestamoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_prestamoFK_IdPrestamoCuota = new JLabelMe();
		jLabelid_prestamoFK_IdPrestamoCuota.setText("Prestamo :");
		jLabelid_prestamoFK_IdPrestamoCuota.setToolTipText("Prestamo");
		jLabelid_prestamoFK_IdPrestamoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_prestamoFK_IdPrestamoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_prestamoFK_IdPrestamoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_prestamoFK_IdPrestamoCuota,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_prestamoFK_IdPrestamoCuota= new JComboBoxMe();
		jComboBoxid_prestamoFK_IdPrestamoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prestamoFK_IdPrestamoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prestamoFK_IdPrestamoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_prestamoFK_IdPrestamoCuota,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCuota=new JTabbedPane();


		this.jTabbedPaneBusquedasCuota.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuota.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuota.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCuota.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCuota,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCuota = new CuotaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuota DATOS");
			this.jInternalFrameDetalleFormCuota = new CuotaDetalleFormJInternalFrame(jDesktopPane,this.cuotaSessionBean.getConGuardarRelaciones(),this.cuotaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCuota = null;//new CuotaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuota= new GridBagLayout();
		
		
		this.jTableDatosCuota = new JTableMe();      
		
		String sToolTipCuota="";
		sToolTipCuota=CuotaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuota+="(Nomina.Cuota)";
		}
		
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuota+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCuota.setToolTipText(sToolTipCuota);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCuota);
		this.jTableDatosCuota.setAutoCreateRowSorter(true);
		this.jTableDatosCuota.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCuota.setRowSelectionAllowed(true);
		this.jTableDatosCuota.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCuota,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCuota = new JButtonMe();
		this.jButtonDuplicarCuota = new JButtonMe();
		this.jButtonCopiarCuota = new JButtonMe();
		this.jButtonVerFormCuota = new JButtonMe();
		this.jButtonNuevoRelacionesCuota = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCuota = new JButtonMe();
		this.jButtonCerrarCuota = new JButtonMe();
		
		this.jScrollPanelDatosCuota = new JScrollPane();   
        this.jScrollPanelDatosGeneralCuota = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cuota";
		
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuotas" + this.sPath));
		} else {
			this.jScrollPanelDatosCuota.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuota.setToolTipText("Acciones");
        this.jPanelAccionesCuota.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuota, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCuota=new ReporteDinamicoJInternalFrame(CuotaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCuota();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCuota=new ImportacionJInternalFrame(CuotaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCuota();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCuota = new JButtonMe();
		
		this.jButtonAbrirOrderByCuota.setText("Orden");
		this.jButtonAbrirOrderByCuota.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuota,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuota,false,this);
			
			//this.cargarOrderByCuota(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuota,true,this);
			
			//this.cargarOrderByCuota(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCuota.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosCuota.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosCuota.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosCuota.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuota.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuota.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCuota.setText("Nuevo");
		this.jButtonDuplicarCuota.setText("Duplicar");
		this.jButtonCopiarCuota.setText("Copiar");
		this.jButtonVerFormCuota.setText("Ver");
		this.jButtonNuevoRelacionesCuota.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCuota.setText("Guardar");
		this.jButtonCerrarCuota.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuota,"nuevo_button","Nuevo",this.cuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCuota,"duplicar_button","Duplicar",this.cuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCuota,"copiar_button","Copiar",this.cuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCuota,"ver_form","Ver",this.cuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCuota,"nuevorelaciones_button","Nuevo Rel",this.cuotaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuota,"guardarcambiostabla_button","Guardar",this.cuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuota,"cerrar_button","Salir",this.cuotaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCuota, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCuota.setToolTipText("Nuevo"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCuota.setToolTipText("Duplicar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCuota.setToolTipText("Copiar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCuota.setToolTipText("Ver"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCuota.setToolTipText("Nuevo Rel"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCuota.setToolTipText("Guardar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuota.setToolTipText("Salir"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuota";
		inputMap = this.jButtonNuevoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuota"));
		
		//DUPLICAR
		sMapKey = "DuplicarCuota";
		inputMap = this.jButtonDuplicarCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCuota"));
		
		//COPIAR
		sMapKey = "CopiarCuota";
		inputMap = this.jButtonCopiarCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCuota"));
		
		//VEr FORM
		sMapKey = "VerFormCuota";
		inputMap = this.jButtonVerFormCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCuota"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCuota";
		inputMap = this.jButtonNuevoRelacionesCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCuota"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCuota";
		inputMap = this.jButtonModificarCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCuota"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCuota";
		inputMap = this.jButtonCerrarCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuota"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuota";
		inputMap = this.jButtonGuardarCambiosTablaCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuota"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Cuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Cuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Cuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Cuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Cuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCuota.setName("jPanelParametrosReportesCuota"); 
		
		this.jPanelParametrosReportesAccionesCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCuota.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCuota.setName("jPanelParametrosReportesAccionesCuota"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCuota, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCuota, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCuota = new JButtonMe();
		this.jButtonRecargarInformacionCuota.setText("Recargar");
		this.jButtonRecargarInformacionCuota.setToolTipText("Recargar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCuota,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCuota = new JButtonMe();
		this.jButtonProcesarInformacionCuota.setText("Procesar");
		this.jButtonProcesarInformacionCuota.setToolTipText("Procesar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCuota.setVisible(false);
			
		this.jButtonProcesarInformacionCuota.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuota.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuota.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCuota = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuota.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCuota.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCuota = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuota.setText("TIPO");       
		this.jComboBoxTiposReportesCuota.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCuota = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuota.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCuota.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCuota = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCuota.setText("Paginacion");
		this.jComboBoxTiposPaginacionCuota.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCuota = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCuota.setText("Accion");
		this.jComboBoxTiposRelacionesCuota.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCuota = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuota.setText("Accion");
		this.jComboBoxTiposAccionesCuota.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCuota = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCuota.setText("Accion");
		this.jComboBoxTiposSeleccionarCuota.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCuota=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCuota.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuota.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuota.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCuota = new JLabelMe();
		
		this.jLabelAccionesCuota.setText("Acciones");		
		this.jLabelAccionesCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCuota = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCuota.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCuota.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCuota = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCuota.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCuota.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCuota = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCuota.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCuota.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCuota = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCuota.setText("Graf.");
		this.jCheckBoxConGraficoReporteCuota.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCuota = new JButtonMe();
		//this.jButtonAnterioresCuota.setText("<<");
        this.jButtonAnterioresCuota.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCuota,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCuota = new JButtonMe();
		//this.jButtonSiguientesCuota.setText(">>");
        this.jButtonSiguientesCuota.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCuota,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCuota = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCuota.setText("Nue");
        this.jButtonNuevoGuardarCambiosCuota.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCuota,"nuevoguardarcambios_button","Nue",this.cuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCuota";
		inputMap = this.jButtonNuevoGuardarCambiosCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCuota"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCuota";
		inputMap = this.jButtonRecargarInformacionCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCuota"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCuota";
		inputMap = this.jButtonSiguientesCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCuota"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCuota";
		inputMap = this.jButtonAnterioresCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCuota"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCuota();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCuota.setMinimumSize(new Dimension(this.getWidth(),CuotaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuotaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuota.setMaximumSize(new Dimension(this.getWidth(),CuotaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuotaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuota.setPreferredSize(new Dimension(this.getWidth(),CuotaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuotaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCuota = new GridBagLayout();

			this.jPanelPaginacionCuota.setLayout(gridaBagLayoutPaginacionCuota);						
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = 0;
			this.gridBagConstraintsCuota.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCuota.add(this.jButtonAnterioresCuota, this.gridBagConstraintsCuota);
					
						
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuota.gridy = 0;
			
			this.jPanelPaginacionCuota.add(this.jButtonNuevoGuardarCambiosCuota, this.gridBagConstraintsCuota);
						
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCuota.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuota.gridy = 0;
			this.jPanelPaginacionCuota.add(this.jButtonSiguientesCuota, this.gridBagConstraintsCuota);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = 1;
			this.gridBagConstraintsCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuota.add(this.jButtonNuevoCuota, this.gridBagConstraintsCuota);
						
			
			
			if(!this.cuotaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCuota = new GridBagConstraints();
				this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuota.gridy = 1;
				this.gridBagConstraintsCuota.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCuota.add(this.jButtonGuardarCambiosTablaCuota, this.gridBagConstraintsCuota);
			}
			
			
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = 1;
			this.gridBagConstraintsCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuota.add(this.jButtonDuplicarCuota, this.gridBagConstraintsCuota);
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = 1;
			this.gridBagConstraintsCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuota.add(this.jButtonCopiarCuota, this.gridBagConstraintsCuota);
		
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = 1;
			this.gridBagConstraintsCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuota.add(this.jButtonVerFormCuota, this.gridBagConstraintsCuota);
		
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = 1;
			this.gridBagConstraintsCuota.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCuota.add(this.jButtonCerrarCuota, this.gridBagConstraintsCuota);
		
		
		
		this.jButtonRecargarInformacionCuota.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuota.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuota.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCuota, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCuota.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuota.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuota.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCuota.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuota.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuota.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCuota.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuota.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuota.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCuota.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuota.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuota.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCuota.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuota.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuota.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCuota.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuota.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuota.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCuota, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCuota.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuota.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuota.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCuota.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuota.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuota.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCuota = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Cuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Cuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Cuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Cuota = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCuota.setLayout(gridaBagParametrosReportesCuota);
			this.jPanelParametrosReportesAccionesCuota.setLayout(gridaBagParametrosReportesAccionesCuota);
			
			
			this.jPanelParametrosAuxiliar1Cuota.setLayout(gridaBagParametrosAuxiliar1Cuota);
			this.jPanelParametrosAuxiliar2Cuota.setLayout(gridaBagParametrosAuxiliar2Cuota);
			this.jPanelParametrosAuxiliar3Cuota.setLayout(gridaBagParametrosAuxiliar3Cuota);
			this.jPanelParametrosAuxiliar4Cuota.setLayout(gridaBagParametrosAuxiliar4Cuota);
			//this.jPanelParametrosAuxiliar5Cuota.setLayout(gridaBagParametrosAuxiliar2Cuota);			
			
			
			
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuota.add(this.jButtonRecargarInformacionCuota, this.gridBagConstraintsCuota);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cuota.add(this.jComboBoxTiposPaginacionCuota, this.gridBagConstraintsCuota);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cuota.add(this.jCheckBoxConAltoMaximoTablaCuota, this.gridBagConstraintsCuota);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cuota.add(this.jComboBoxTiposArchivosReportesCuota, this.gridBagConstraintsCuota);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuota.add(this.jPanelParametrosAuxiliar1Cuota, this.gridBagConstraintsCuota);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuota.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Cuota.add(this.jComboBoxTiposReportesCuota, this.gridBagConstraintsCuota);																		
			
			
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuota.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Cuota.add(this.jComboBoxTiposGraficosReportesCuota, this.gridBagConstraintsCuota);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuota.add(this.jPanelParametrosAuxiliar4Cuota, this.gridBagConstraintsCuota);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuota.add(this.jComboBoxTiposReportesCuota, this.gridBagConstraintsCuota);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuota.add(this.jCheckBoxGenerarReporteCuota, this.gridBagConstraintsCuota);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuota.add(this.jPanelParametrosAuxiliar2Cuota, this.gridBagConstraintsCuota);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuota.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuota.add(this.jLabelAccionesCuota, this.gridBagConstraintsCuota);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCuota = new GridBagConstraints();
				this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCuota.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCuota.add(this.jButtonAbrirOrderByCuota, this.gridBagConstraintsCuota);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuota.add(this.jComboBoxTiposSeleccionarCuota, this.gridBagConstraintsCuota);			
			
			
			/*
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuota.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuota.add(this.jCheckBoxSeleccionarTodosCuota, this.gridBagConstraintsCuota);
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuota.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuota.add(this.jCheckBoxConGraficoReporteCuota, this.gridBagConstraintsCuota);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuota.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cuota.add(this.jCheckBoxSeleccionarTodosCuota, this.gridBagConstraintsCuota);															
				
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuota.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cuota.add(this.jCheckBoxSeleccionadosCuota, this.gridBagConstraintsCuota);															
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuota.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cuota.add(this.jCheckBoxConGraficoReporteCuota, this.gridBagConstraintsCuota);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuota.add(this.jPanelParametrosAuxiliar3Cuota, this.gridBagConstraintsCuota);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuota.add(this.jComboBoxTiposAccionesCuota, this.gridBagConstraintsCuota);
	
				
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuota.add(this.jTextFieldValorCampoGeneralCuota, this.gridBagConstraintsCuota);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCuota = new GridBagLayout();

			this.jScrollPanelDatosCuota.setLayout(gridaBagLayoutDatosCuota);
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = 0;
			this.gridBagConstraintsCuota.gridx = 0;
			
			this.jScrollPanelDatosCuota.add(this.jTableDatosCuota, this.gridBagConstraintsCuota);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCuota.setViewportView(this.jTableDatosCuota);
		this.jTableDatosCuota.setFillsViewportHeight(true);
		this.jTableDatosCuota.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCuota= new GridBagLayout();
		this.jPanelAccionesCuota.setLayout(gridaBagLayoutAccionesCuota);
		
		
		/*	
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.gridy = 0;
		this.gridBagConstraintsCuota.gridx = 0;
			
		this.jPanelAccionesCuota.add(this.jButtonNuevoCuota, this.gridBagConstraintsCuota);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdDefiProvisionEmpleadoCuota= new GridBagLayout();
		gridaBagLayoutFK_IdDefiProvisionEmpleadoCuota.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDefiProvisionEmpleadoCuota.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDefiProvisionEmpleadoCuota.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDefiProvisionEmpleadoCuota.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDefiProvisionEmpleadoCuota.setLayout(gridaBagLayoutFK_IdDefiProvisionEmpleadoCuota);

		gridBagConstraintsCuota = new GridBagConstraints();
		gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuota.gridy = 0;
		gridBagConstraintsCuota.gridx = 0;
		jPanelFK_IdDefiProvisionEmpleadoCuota.add(jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota, gridBagConstraintsCuota);

		gridBagConstraintsCuota = new GridBagConstraints();
		gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuota.gridy = 0;
		gridBagConstraintsCuota.gridx = 1;
		jPanelFK_IdDefiProvisionEmpleadoCuota.add(jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota, gridBagConstraintsCuota);

		gridBagConstraintsCuota = new GridBagConstraints();
		gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuota.gridy = 1;
		gridBagConstraintsCuota.gridx =1;
		jPanelFK_IdDefiProvisionEmpleadoCuota.add(jButtonFK_IdDefiProvisionEmpleadoCuota, gridBagConstraintsCuota);

		jTabbedPaneBusquedasCuota.addTab("1.-Por Defi Provision Empleado ", jPanelFK_IdDefiProvisionEmpleadoCuota);
		jTabbedPaneBusquedasCuota.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoCuotaCuota= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoCuotaCuota.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoCuotaCuota.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoCuotaCuota.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoCuotaCuota.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoCuotaCuota.setLayout(gridaBagLayoutFK_IdEstadoCuotaCuota);

		gridBagConstraintsCuota = new GridBagConstraints();
		gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuota.gridy = 0;
		gridBagConstraintsCuota.gridx = 0;
		jPanelFK_IdEstadoCuotaCuota.add(jLabelid_estado_cuotaFK_IdEstadoCuotaCuota, gridBagConstraintsCuota);

		gridBagConstraintsCuota = new GridBagConstraints();
		gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuota.gridy = 0;
		gridBagConstraintsCuota.gridx = 1;
		jPanelFK_IdEstadoCuotaCuota.add(jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota, gridBagConstraintsCuota);

		gridBagConstraintsCuota = new GridBagConstraints();
		gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuota.gridy = 1;
		gridBagConstraintsCuota.gridx =1;
		jPanelFK_IdEstadoCuotaCuota.add(jButtonFK_IdEstadoCuotaCuota, gridBagConstraintsCuota);

		jTabbedPaneBusquedasCuota.addTab("2.-Por Estado Cuota ", jPanelFK_IdEstadoCuotaCuota);
		jTabbedPaneBusquedasCuota.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPrestamoCuota= new GridBagLayout();
		gridaBagLayoutFK_IdPrestamoCuota.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPrestamoCuota.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPrestamoCuota.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPrestamoCuota.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPrestamoCuota.setLayout(gridaBagLayoutFK_IdPrestamoCuota);

		gridBagConstraintsCuota = new GridBagConstraints();
		gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuota.gridy = 0;
		gridBagConstraintsCuota.gridx = 0;
		jPanelFK_IdPrestamoCuota.add(jLabelid_prestamoFK_IdPrestamoCuota, gridBagConstraintsCuota);

		gridBagConstraintsCuota = new GridBagConstraints();
		gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuota.gridy = 0;
		gridBagConstraintsCuota.gridx = 1;
		jPanelFK_IdPrestamoCuota.add(jComboBoxid_prestamoFK_IdPrestamoCuota, gridBagConstraintsCuota);

		gridBagConstraintsCuota = new GridBagConstraints();
		gridBagConstraintsCuota.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuota.gridy = 1;
		gridBagConstraintsCuota.gridx =1;
		jPanelFK_IdPrestamoCuota.add(jButtonFK_IdPrestamoCuota, gridBagConstraintsCuota);

		jTabbedPaneBusquedasCuota.addTab("3.-Por Prestamo ", jPanelFK_IdPrestamoCuota);
		jTabbedPaneBusquedasCuota.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuota = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuota);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuotaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuota = new GridBagConstraints();						
			this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuota.gridx = 0;		
			//this.gridBagConstraintsCuota.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuota.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCuota, this.gridBagConstraintsCuota);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCuota.gridx = 0;		
		//this.gridBagConstraintsCuota.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCuota.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCuota);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuota.gridx = 0;		
			this.gridBagConstraintsCuota.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCuota.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCuota, this.gridBagConstraintsCuota);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuota.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCuota, this.gridBagConstraintsCuota);								
		
		
		/*
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuota.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCuota, this.gridBagConstraintsCuota);
		*/		
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuota.gridx =0;
		this.gridBagConstraintsCuota.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuota.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuota, this.gridBagConstraintsCuota);
				
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuota.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCuota, this.gridBagConstraintsCuota);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CuotaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuota = new GridBagLayout();
			this.jPanelBusquedasParametrosCuota.setLayout(gridaBagLayoutBusquedasParametrosCuota);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCuota=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuota, this.gridBagConstraintsCuota);
			
			
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuota, this.gridBagConstraintsCuota);
		
			
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuota.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuota, this.gridBagConstraintsCuota);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCuota;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCuota() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCuota = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCuota.setName("jPanelReporteDinamicoCuota"); 
		
		this.jPanelReporteDinamicoCuota.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuota.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuota.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCuota.setLayout(gridaBagLayoutReporteDinamicoCuota);
		
		
		this.jInternalFrameReporteDinamicoCuota= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCuota = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuota= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCuota.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCuota.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCuota.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCuota.setResizable(true);
	    this.jInternalFrameReporteDinamicoCuota.setClosable(true);
	    this.jInternalFrameReporteDinamicoCuota.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCuota.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuota.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuota.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuotas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCuota = new JLabelMe();

		this.jLabelColumnasSelectReporteCuota.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuota.add(this.jLabelColumnasSelectReporteCuota, this.gridBagConstraintsCuota);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCuota = new JList<Reporte>();
		this.jListColumnasSelectReporteCuota.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCuota.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCuota.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuota.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuota.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCuota=new JScrollPane(this.jListColumnasSelectReporteCuota);
			
			this.jScrollColumnasSelectReporteCuota.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuota.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuota.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuota.add(this.jListColumnasSelectReporteCuota, this.gridBagConstraintsCuota);
		this.jPanelReporteDinamicoCuota.add(this.jScrollColumnasSelectReporteCuota, this.gridBagConstraintsCuota);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCuota = new JLabelMe();

		this.jLabelRelacionesSelectReporteCuota.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCuota = new JList<Reporte>();
		this.jListRelacionesSelectReporteCuota.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCuota.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCuota.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuota.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuota.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCuota=new JScrollPane(this.jListRelacionesSelectReporteCuota);
			
			this.jScrollRelacionesSelectReporteCuota.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuota.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuota.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCuota = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCuota = new JComboBoxMe();
		this.jListColumnasValoresGraficoCuota = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCuota = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCuota.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCuota.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuota.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuota.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCuota = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCuota.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCuota.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuota.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuota.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCuota = new JLabelMe();

		this.jLabelConGraficoDinamicoCuota.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuota.add(this.jLabelConGraficoDinamicoCuota, this.gridBagConstraintsCuota);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCuota = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCuota.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCuota.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCuota.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCuota.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCuota.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuota.add(this.jCheckBoxConGraficoDinamicoCuota, this.gridBagConstraintsCuota);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCuota = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCuota.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuota.add(this.jLabelColumnaCategoriaGraficoCuota, this.gridBagConstraintsCuota);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCuota = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCuota.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCuota.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCuota.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCuota.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCuota.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCuota.add(this.jComboBoxColumnaCategoriaGraficoCuota, this.gridBagConstraintsCuota);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCuota = new JLabelMe();

		this.jLabelColumnaCategoriaValorCuota.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuota.add(this.jLabelColumnaCategoriaValorCuota, this.gridBagConstraintsCuota);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCuota = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCuota.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCuota.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCuota.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCuota.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCuota.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCuota.add(this.jComboBoxColumnaCategoriaValorCuota, this.gridBagConstraintsCuota);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCuota = new JLabelMe();

		this.jLabelColumnasValoresGraficoCuota.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuota.add(this.jLabelColumnasValoresGraficoCuota, this.gridBagConstraintsCuota);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCuota = new JList<Reporte>();
		this.jListColumnasValoresGraficoCuota.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCuota.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCuota.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCuota.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCuota.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCuota=new JScrollPane(this.jListColumnasValoresGraficoCuota);
			
			this.jScrollColumnasValoresGraficoCuota.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCuota.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCuota.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCuota.add(this.jListColumnasSelectReporteCuota, this.gridBagConstraintsCuota);
		this.jPanelReporteDinamicoCuota.add(this.jScrollColumnasValoresGraficoCuota, this.gridBagConstraintsCuota);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCuota = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCuota.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuota.add(this.jLabelTiposGraficosReportesDinamicoCuota, this.gridBagConstraintsCuota);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCuota = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCuota.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCuota.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCuota.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCuota.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCuota.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuota.add(this.jComboBoxTiposGraficosReportesDinamicoCuota, this.gridBagConstraintsCuota);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCuota = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCuota.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuota.add(this.jLabelGenerarExcelReporteDinamicoCuota, this.gridBagConstraintsCuota);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCuota = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCuota.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCuota,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCuota.setToolTipText("Generar EXCEL"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCuota = new GridBagConstraints();
		//this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCuota.add(this.jButtonGenerarExcelReporteDinamicoCuota, this.gridBagConstraintsCuota);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuota.add(this.jComboBoxTiposReportesDinamicoCuota, this.gridBagConstraintsCuota);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCuota = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCuota.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuota.add(this.jLabelTiposArchivoReporteDinamicoCuota, this.gridBagConstraintsCuota);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuota.add(this.jComboBoxTiposArchivosReportesDinamicoCuota, this.gridBagConstraintsCuota);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCuota = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCuota.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCuota,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCuota.setToolTipText("Generar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuota.add(this.jButtonGenerarReporteDinamicoCuota, this.gridBagConstraintsCuota);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCuota = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCuota.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCuota,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCuota.setToolTipText("Cancelar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuota.add(this.jButtonCerrarReporteDinamicoCuota, this.gridBagConstraintsCuota);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCuota = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCuota= new JScrollPane(jPanelReporteDinamicoCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCuota.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuota.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuota.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuotas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCuota.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCuota.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCuota.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCuota.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCuota);
		this.jInternalFrameReporteDinamicoCuota.getContentPane().add(this.jScrollPanelReporteDinamicoCuota, this.gridBagConstraintsCuota);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCuota() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCuota = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCuota.setName("jPanelImportacionCuota"); 
		
		this.jPanelImportacionCuota.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuota.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuota.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCuota.setLayout(gridaBagLayoutImportacionCuota);
		
		
		this.jInternalFrameImportacionCuota= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCuota= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCuota = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuota= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuota.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuota.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCuota.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuota.setResizable(true);
	    this.jInternalFrameImportacionCuota.setClosable(true);
	    this.jInternalFrameImportacionCuota.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuota.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuota.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCuota.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuota.setResizable(true);
	    this.jInternalFrameImportacionCuota.setClosable(true);
	    this.jInternalFrameImportacionCuota.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCuota.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuota.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuota.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuotas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCuota = new JLabelMe();

		this.jLabelArchivoImportacionCuota.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuota.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuota.add(this.jLabelArchivoImportacionCuota, this.gridBagConstraintsCuota);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCuota = new JFileChooser();		
		this.jFileChooserImportacionCuota.setToolTipText("ESCOGER ARCHIVO"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCuota = new JButtonMe();
		this.jButtonAbrirImportacionCuota.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCuota,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCuota.setToolTipText("Generar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuota.add(this.jButtonAbrirImportacionCuota, this.gridBagConstraintsCuota);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCuota = new JLabelMe();

		this.jLabelPathArchivoImportacionCuota.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuota.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuota.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuota.add(this.jLabelPathArchivoImportacionCuota, this.gridBagConstraintsCuota);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCuota=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCuota.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuota.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuota.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuota.add(this.jTextFieldPathArchivoImportacionCuota, this.gridBagConstraintsCuota);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCuota = new JButtonMe();
		this.jButtonGenerarImportacionCuota.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCuota,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCuota.setToolTipText("Generar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuota.add(this.jButtonGenerarImportacionCuota, this.gridBagConstraintsCuota);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCuota = new JButtonMe();
		this.jButtonCerrarImportacionCuota.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCuota,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCuota.setToolTipText("Cancelar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuota.add(this.jButtonCerrarImportacionCuota, this.gridBagConstraintsCuota);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCuota = new GridBagLayout();
		
		this.jScrollPanelImportacionCuota= new JScrollPane(jPanelImportacionCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCuota = new GridBagConstraints();
		this.gridBagConstraintsCuota.gridy =iPosYImportacion;
		this.gridBagConstraintsCuota.gridx =iPosXImportacion;
		this.gridBagConstraintsCuota.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCuota.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCuota.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCuota);
		this.jInternalFrameImportacionCuota.getContentPane().add(this.jScrollPanelImportacionCuota, this.gridBagConstraintsCuota);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCuota(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCuota = new JButtonMe();
			this.jButtonAbrirOrderByCuota.setText("Orden");
			this.jButtonAbrirOrderByCuota.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuota,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCuota";
			inputMap = this.jButtonAbrirOrderByCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCuota"));
		
		
			GridBagLayout gridaBagLayoutOrderByCuota = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCuota.setName("jPanelOrderByCuota"); 
			
			this.jPanelOrderByCuota.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuota.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuota.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCuota.setLayout(gridaBagLayoutOrderByCuota);
			
			
			this.jTableDatosCuotaOrderBy = new JTableMe();        
			this.jTableDatosCuotaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCuotaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCuotaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCuotaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCuotaOrderBy.setViewportView(this.jTableDatosCuotaOrderBy);
			this.jTableDatosCuotaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCuotaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCuota= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCuota= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCuota = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCuota= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCuota.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCuota.setTitle("Orden");
			this.jInternalFrameOrderByCuota.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCuota.setResizable(true);
			this.jInternalFrameOrderByCuota.setClosable(true);
			this.jInternalFrameOrderByCuota.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCuota.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuota.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuota.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuotas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCuota.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuota.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCuota.ipady =150;
				
			this.jPanelOrderByCuota.add(jScrollPanelDatosCuotaOrderBy, this.gridBagConstraintsCuota);//this.jTableDatosCuotaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCuota = new JButtonMe();
			this.jButtonCerrarOrderByCuota.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCuota,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCuota.setToolTipText("Cancelar"+" "+CuotaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuota.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCuota.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCuota.add(this.jButtonCerrarOrderByCuota, this.gridBagConstraintsCuota);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCuota = new GridBagLayout();
			
			this.jScrollPanelOrderByCuota= new JScrollPane(jPanelOrderByCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCuota = new GridBagConstraints();
			this.gridBagConstraintsCuota.gridy =iPosYOrderBy;
			this.gridBagConstraintsCuota.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuota.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCuota.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCuota.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCuota);
			
			this.jInternalFrameOrderByCuota.getContentPane().add(this.jScrollPanelOrderByCuota, this.gridBagConstraintsCuota);			
		
		} else {
			this.jButtonAbrirOrderByCuota = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cuotaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCuota.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCuota.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCuota.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCuota.getRowHeight();//CuotaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuota.isSelected()) {
					iHeightTable=CuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuota.isSelected()) {
					iHeightTable=CuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCuota.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuota.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuota.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCuota.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuota.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuota.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCuota!=null && this.jInternalFrameOrderByCuota.getjTableDatosOrderBy()!=null) {
			//if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCuota.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCuota.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCuota.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCuota.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCuota.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCuota.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCuota.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCuota.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuota.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuota.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cuotaLogic.getCuotas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuotas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Cuota> TraerCuotaBeans(List<Cuota> cuotas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Cuota cuota:cuotas) {
					
				if(!(CuotaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CuotaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cuota.setsDetalleGeneralEntityReporte(CuotaConstantesFunciones.getCuotaDescripcion(cuota));
										
						
					
						
					
				} else  {
							
					//cuota.setsDetalleGeneralEntityReporte(cuota.getsDetalleGeneralEntityReporte());
										
				}
				
				//cuotabeans.add(cuotabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cuotas;
    }
	//PARA REPORTES FIN
}
