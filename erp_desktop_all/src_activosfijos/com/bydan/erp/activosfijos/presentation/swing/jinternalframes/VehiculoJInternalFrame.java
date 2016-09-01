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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

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
import com.bydan.erp.activosfijos.util.VehiculoConstantesFunciones;

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
public class VehiculoJInternalFrame extends VehiculoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVehiculo;
	
	protected JMenuBar jmenuBarVehiculo;
	
	protected JMenu jmenuVehiculo;
	protected JMenu jmenuDatosVehiculo;
	protected JMenu jmenuArchivoVehiculo;
	protected JMenu jmenuAccionesVehiculo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVehiculo;	
	protected GridBagConstraints gridBagConstraintsVehiculo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VehiculoDetalleFormJInternalFrame jInternalFrameDetalleFormVehiculo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVehiculo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVehiculo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected AseguradoraBeanSwingJInternalFrame aseguradoraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_aseguradora="";
	
	public VehiculoSessionBean vehiculoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public AseguradoraSessionBean aseguradoraSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Vehiculo> vehiculos;		
	public List<Vehiculo> vehiculosEliminados;	
	public List<Vehiculo> vehiculosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVehiculo;		
	protected JButton jButtonAbrirOrderByVehiculo;
	
	
	//protected JPanel jPanelOrderByVehiculo;
	//public JScrollPane jScrollPanelOrderByVehiculo;	
	//protected JButton jButtonCerrarOrderByVehiculo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VehiculoLogic vehiculoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVehiculo;
	public JScrollPane jScrollPanelDatosEdicionVehiculo;
	public JScrollPane jScrollPanelDatosGeneralVehiculo;
    
	
	
	//public JScrollPane jScrollPanelDatosVehiculoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVehiculo;
	//public JScrollPane jScrollPanelImportacionVehiculo;
	
	
	
	protected JPanel jPanelAccionesVehiculo;
	
    protected JPanel jPanelPaginacionVehiculo;
    protected JPanel jPanelParametrosReportesVehiculo;
	protected JPanel jPanelParametrosReportesAccionesVehiculo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Vehiculo;
	protected JPanel jPanelParametrosAuxiliar2Vehiculo;
	protected JPanel jPanelParametrosAuxiliar3Vehiculo;
	protected JPanel jPanelParametrosAuxiliar4Vehiculo;
	//protected JPanel jPanelParametrosAuxiliar5Vehiculo;
	
	
	
	//protected JPanel jPanelReporteDinamicoVehiculo;
	//protected JPanel jPanelImportacionVehiculo;
	
	
	public JTable jTableDatosVehiculo;
	
	
	
	//public JTable jTableDatosVehiculoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVehiculo;
	protected JButton jButtonDuplicarVehiculo;
	protected JButton jButtonCopiarVehiculo;
	protected JButton jButtonVerFormVehiculo;
	protected JButton jButtonNuevoRelacionesVehiculo;
	protected JButton jButtonModificarVehiculo;
	
    protected JButton jButtonGuardarCambiosTablaVehiculo;
	protected JButton jButtonCerrarVehiculo;
	
	
	protected JButton jButtonRecargarInformacionVehiculo;
	protected JButton jButtonProcesarInformacionVehiculo;
	
	
	protected JButton jButtonAnterioresVehiculo;
	protected JButton jButtonSiguientesVehiculo;
	protected JButton jButtonNuevoGuardarCambiosVehiculo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVehiculo;
	//protected JButton jButtonCerrarReporteDinamicoVehiculo;
	//protected JButton jButtonGenerarExcelReporteDinamicoVehiculo;	
	
	
	
	//protected JButton jButtonAbrirImportacionVehiculo;
	//protected JButton jButtonGenerarImportacionVehiculo;
	//protected JButton jButtonCerrarImportacionVehiculo;
	//protected JFileChooser jFileChooserImportacionVehiculo;
	//protected File fileImportacionVehiculo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVehiculo;
	protected JButton jButtonDuplicarToolBarVehiculo;
	protected JButton jButtonNuevoRelacionesToolBarVehiculo;
	
	
	public JButton jButtonGuardarCambiosToolBarVehiculo;
	protected JButton jButtonCopiarToolBarVehiculo;
	protected JButton jButtonVerFormToolBarVehiculo;
	public JButton jButtonGuardarCambiosTablaToolBarVehiculo;
	protected JButton jButtonMostrarOcultarTablaToolBarVehiculo;
	protected JButton jButtonCerrarToolBarVehiculo;
	
	protected JButton jButtonRecargarInformacionToolBarVehiculo;
	protected JButton jButtonProcesarInformacionToolBarVehiculo;
	protected JButton jButtonAnterioresToolBarVehiculo;
	protected JButton jButtonSiguientesToolBarVehiculo;
	protected JButton jButtonNuevoGuardarCambiosToolBarVehiculo;
	protected JButton jButtonAbrirOrderByToolBarVehiculo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVehiculo;
	protected JMenuItem jMenuItemDuplicarVehiculo;
	protected JMenuItem jMenuItemNuevoRelacionesVehiculo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVehiculo;
	protected JMenuItem jMenuItemCopiarVehiculo;
	protected JMenuItem jMenuItemVerFormVehiculo;
	protected JMenuItem jMenuItemGuardarCambiosTablaVehiculo;
	protected JMenuItem jMenuItemCerrarVehiculo;
	protected JMenuItem jMenuItemDetalleCerrarVehiculo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVehiculo;
	protected JMenuItem jMenuItemDetalleMostarOcultarVehiculo;
	
	protected JMenuItem jMenuItemRecargarInformacionVehiculo;
	protected JMenuItem jMenuItemProcesarInformacionVehiculo;
	protected JMenuItem jMenuItemAnterioresVehiculo;
	protected JMenuItem jMenuItemSiguientesVehiculo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVehiculo;
	protected JMenuItem jMenuItemAbrirOrderByVehiculo;
	protected JMenuItem jMenuItemMostrarOcultarVehiculo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVehiculo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVehiculo;
	protected JCheckBox jCheckBoxSeleccionadosVehiculo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVehiculo;
	protected JCheckBox jCheckBoxConGraficoReporteVehiculo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVehiculo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVehiculo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVehiculo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVehiculo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVehiculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVehiculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVehiculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVehiculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVehiculo;
	protected JTextField jTextFieldValorCampoGeneralVehiculo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVehiculo;
	//public JList<Reporte> jListColumnasSelectReporteVehiculo;
	//public JScrollPane jScrollColumnasSelectReporteVehiculo;
	
	//public JLabel jLabelRelacionesSelectReporteVehiculo;
	//public JList<Reporte> jListRelacionesSelectReporteVehiculo;
	//public JScrollPane jScrollRelacionesSelectReporteVehiculo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVehiculo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVehiculo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVehiculo;
	//public JLabel jLabelTiposArchivoReporteDinamicoVehiculo;
	
		
	//public JLabel jLabelArchivoImportacionVehiculo;	
	//public JLabel jLabelPathArchivoImportacionVehiculo;
	//protected JTextField jTextFieldPathArchivoImportacionVehiculo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVehiculo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVehiculo;
	
	//public JLabel jLabelColumnaCategoriaValorVehiculo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVehiculo;
	
	//public JLabel jLabelColumnasValoresGraficoVehiculo;
	//public JList<Reporte> jListColumnasValoresGraficoVehiculo;
	//public JScrollPane jScrollColumnasValoresGraficoVehiculo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVehiculo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVehiculo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVehiculo;
	public JPanel jPanelFK_IdAseguradoraVehiculo;
	public JButton jButtonFK_IdAseguradoraVehiculo;
	public JPanel jPanelFK_IdDetalleActivoFijoVehiculo;
	public JButton jButtonFK_IdDetalleActivoFijoVehiculo;
	
	public JPanel jPanelid_aseguradoraFK_IdAseguradoraVehiculo;
	public JLabel jLabelid_aseguradoraFK_IdAseguradoraVehiculo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo;
	public JButton jButtonid_aseguradoraFK_IdAseguradoraVehiculo= new JButtonMe();
	public JButton jButtonid_aseguradoraFK_IdAseguradoraVehiculoUpdate= new JButtonMe();
	public JButton jButtonid_aseguradoraFK_IdAseguradoraVehiculoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo;
	public JLabel jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo;
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VehiculoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Vehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Vehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVehiculo)	{
		this.jButtonRecargarInformacionVehiculo = jButtonRecargarInformacionVehiculo;
	}
	
	public JButton getjButtonProcesarInformacionVehiculo() {
		return this.jButtonProcesarInformacionVehiculo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVehiculo)	{
		this.jButtonProcesarInformacionVehiculo = jButtonProcesarInformacionVehiculo;
	}
	
	
	public JButton getjButtonRecargarInformacionVehiculo() {
		return this.jButtonRecargarInformacionVehiculo;
	}
	
	
	public List<Vehiculo> getvehiculos() {
		return this.vehiculos;
	}

	public void setvehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public List<Vehiculo> getvehiculosAux() {
		return this.vehiculosAux;
	}

	public void setvehiculosAux(List<Vehiculo> vehiculosAux) {
		this.vehiculosAux = vehiculosAux;
	}
	
	public List<Vehiculo> getvehiculosEliminados() {
		return this.vehiculosEliminados;
	}

	public void setVehiculosEliminados(List<Vehiculo> vehiculosEliminados) {
		this.vehiculosEliminados = vehiculosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVehiculo() {
		return jComboBoxTiposSeleccionarVehiculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVehiculo(
			JComboBox jComboBoxTiposSeleccionarVehiculo) {
		this.jComboBoxTiposSeleccionarVehiculo = jComboBoxTiposSeleccionarVehiculo;
	}
	
	public void setBorderResaltarTiposSeleccionarVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVehiculo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVehiculo() {
		return jTextFieldValorCampoGeneralVehiculo;
	}

	public void setjTextFieldValorCampoGeneralVehiculo(
			JTextField jTextFieldValorCampoGeneralVehiculo) {
		this.jTextFieldValorCampoGeneralVehiculo = jTextFieldValorCampoGeneralVehiculo;
	}

	public void setBorderResaltarValorCampoGeneralVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVehiculo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVehiculo() {
		return this.jCheckBoxSeleccionarTodosVehiculo;
	}

	public void setjCheckBoxSeleccionarTodosVehiculo(
			JCheckBox jCheckBoxSeleccionarTodosVehiculo) {
		this.jCheckBoxSeleccionarTodosVehiculo = jCheckBoxSeleccionarTodosVehiculo;
	}

	public void setBorderResaltarSeleccionarTodosVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVehiculo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVehiculo() {
		return this.jCheckBoxSeleccionadosVehiculo;
	}

	public void setjCheckBoxSeleccionadosVehiculo(
			JCheckBox jCheckBoxSeleccionadosVehiculo) {
		this.jCheckBoxSeleccionadosVehiculo = jCheckBoxSeleccionadosVehiculo;
	}
	
	public void setBorderResaltarSeleccionadosVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVehiculo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVehiculo() {
		return this.jComboBoxTiposArchivosReportesVehiculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVehiculo(
			JComboBox jComboBoxTiposArchivosReportesVehiculo) {
		this.jComboBoxTiposArchivosReportesVehiculo = jComboBoxTiposArchivosReportesVehiculo;
	}

	public void setBorderResaltarTiposArchivosReportesVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVehiculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVehiculo() {
		return this.jComboBoxTiposReportesVehiculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVehiculo(
			JComboBox jComboBoxTiposReportesVehiculo) {
		this.jComboBoxTiposReportesVehiculo = jComboBoxTiposReportesVehiculo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVehiculo() {
	//	return jComboBoxTiposReportesDinamicoVehiculo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVehiculo(
	//		JComboBox jComboBoxTiposReportesDinamicoVehiculo) {
	//	this.jComboBoxTiposReportesDinamicoVehiculo = jComboBoxTiposReportesDinamicoVehiculo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVehiculo() {
	//	return jComboBoxTiposArchivosReportesDinamicoVehiculo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVehiculo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVehiculo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVehiculo = jComboBoxTiposArchivosReportesDinamicoVehiculo;
	//}
	
	public void setBorderResaltarTiposReportesVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVehiculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVehiculo() {
		return this.jComboBoxTiposGraficosReportesVehiculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVehiculo(
			JComboBox jComboBoxTiposGraficosReportesVehiculo) {
		this.jComboBoxTiposGraficosReportesVehiculo = jComboBoxTiposGraficosReportesVehiculo;
	}
	
	public void setBorderResaltarTiposGraficosReportesVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVehiculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVehiculo() {
		return this.jComboBoxTiposPaginacionVehiculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVehiculo(
			JComboBox jComboBoxTiposPaginacionVehiculo) {
		this.jComboBoxTiposPaginacionVehiculo = jComboBoxTiposPaginacionVehiculo;
	}
	
	public void setBorderResaltarTiposPaginacionVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVehiculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVehiculo() {
		return this.jComboBoxTiposRelacionesVehiculo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVehiculo() {
		return this.jComboBoxTiposAccionesVehiculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVehiculo(
			JComboBox jComboBoxTiposRelacionesVehiculo) {
		this.jComboBoxTiposRelacionesVehiculo = jComboBoxTiposRelacionesVehiculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVehiculo(
			JComboBox jComboBoxTiposAccionesVehiculo) {
		this.jComboBoxTiposAccionesVehiculo = jComboBoxTiposAccionesVehiculo;
	}
	
	public void setBorderResaltarTiposRelacionesVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVehiculo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVehiculo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVehiculo() {
	//	return jCheckBoxConGraficoDinamicoVehiculo;
	//}

	//public void setjCheckBoxConGraficoDinamicoVehiculo(
	//		JCheckBox jCheckBoxConGraficoDinamicoVehiculo) {
	//	this.jCheckBoxConGraficoDinamicoVehiculo = jCheckBoxConGraficoDinamicoVehiculo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVehiculo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVehiculo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVehiculo .setBorder(borderResaltar);		
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
		this.vehiculoSessionBean=new VehiculoSessionBean();
		
		this.vehiculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vehiculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vehiculoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VehiculoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vehiculo MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
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
		
		VehiculoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Vehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVehiculo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVehiculo,this.jTtoolBarVehiculo,
							"nuevo","nuevo","Nuevo"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVehiculo,this.jTtoolBarVehiculo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVehiculo,this.jTtoolBarVehiculo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVehiculo,this.jTtoolBarVehiculo,
							"duplicar","duplicar","Duplicar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVehiculo,this.jTtoolBarVehiculo,
							"copiar","copiar","Copiar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVehiculo,this.jTtoolBarVehiculo,
							"ver_form","ver_form","Ver"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVehiculo,this.jTtoolBarVehiculo,
							"recargar","recargar","Recargar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVehiculo,this.jTtoolBarVehiculo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVehiculo,this.jTtoolBarVehiculo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVehiculo,this.jTtoolBarVehiculo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVehiculo,this.jTtoolBarVehiculo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVehiculo,this.jTtoolBarVehiculo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVehiculo,this.jTtoolBarVehiculo,
							"cerrar","cerrar","Salir"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVehiculo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVehiculo;
			
				this.jButtonProcesarInformacionToolBarVehiculo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVehiculo;
				
		//protected JButton jButtonModificarToolBarVehiculo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVehiculo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVehiculo=new JMenuMe("General");
		this.jmenuArchivoVehiculo=new JMenuMe("Archivo");
		this.jmenuAccionesVehiculo=new JMenuMe("Acciones");
		this.jmenuDatosVehiculo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVehiculo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVehiculo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVehiculo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVehiculo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVehiculo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVehiculo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVehiculo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVehiculo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVehiculo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVehiculo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVehiculo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVehiculo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVehiculo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVehiculo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVehiculo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVehiculo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVehiculo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVehiculo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVehiculo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVehiculo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVehiculo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVehiculo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVehiculo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVehiculo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVehiculo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVehiculo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVehiculo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVehiculo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVehiculo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVehiculo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVehiculo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVehiculo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVehiculo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVehiculo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVehiculo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVehiculo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVehiculo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVehiculo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVehiculo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVehiculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVehiculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVehiculo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVehiculo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVehiculo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVehiculo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVehiculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVehiculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVehiculo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVehiculo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVehiculo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVehiculo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVehiculo.add(this.jMenuItemCerrarVehiculo);
			
			this.jmenuAccionesVehiculo.add(this.jMenuItemNuevoVehiculo);
			this.jmenuAccionesVehiculo.add(this.jMenuItemNuevoGuardarCambiosVehiculo);
			this.jmenuAccionesVehiculo.add(this.jMenuItemNuevoRelacionesVehiculo);
			this.jmenuAccionesVehiculo.add(this.jMenuItemGuardarCambiosTablaVehiculo);		
			this.jmenuAccionesVehiculo.add(this.jMenuItemDuplicarVehiculo);		
			this.jmenuAccionesVehiculo.add(this.jMenuItemCopiarVehiculo);		
			this.jmenuAccionesVehiculo.add(this.jMenuItemVerFormVehiculo);		
			
			this.jmenuDatosVehiculo.add(this.jMenuItemRecargarInformacionVehiculo);				
			this.jmenuDatosVehiculo.add(this.jMenuItemAnterioresVehiculo);				
			this.jmenuDatosVehiculo.add(this.jMenuItemSiguientesVehiculo);				
			this.jmenuDatosVehiculo.add(this.jMenuItemAbrirOrderByVehiculo);				
			this.jmenuDatosVehiculo.add(this.jMenuItemMostrarOcultarVehiculo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVehiculo.add(this.jMenuItemGuardarCambiosVehiculo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVehiculo.add(this.jmenuArchivoVehiculo);		
			this.jmenuBarVehiculo.add(this.jmenuAccionesVehiculo);		
			this.jmenuBarVehiculo.add(this.jmenuDatosVehiculo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVehiculo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVehiculo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAseguradoraVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAseguradoraVehiculo.setToolTipText("Buscar Por Aseguradora ");
		this.jButtonFK_IdAseguradoraVehiculo= new JButtonMe();
		this.jButtonFK_IdAseguradoraVehiculo.setText("Buscar");
		this.jButtonFK_IdAseguradoraVehiculo.setToolTipText("Buscar Por Aseguradora ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAseguradoraVehiculo,"buscar_button","Buscar Por Aseguradora ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAseguradoraVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_aseguradoraFK_IdAseguradoraVehiculo = new JLabelMe();
		jLabelid_aseguradoraFK_IdAseguradoraVehiculo.setText("Aseguradora :");
		jLabelid_aseguradoraFK_IdAseguradoraVehiculo.setToolTipText("Aseguradora");
		jLabelid_aseguradoraFK_IdAseguradoraVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_aseguradoraFK_IdAseguradoraVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_aseguradoraFK_IdAseguradoraVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_aseguradoraFK_IdAseguradoraVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo= new JComboBoxMe();
		jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDetalleActivoFijoVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleActivoFijoVehiculo.setToolTipText("Buscar Por Detalle Activo Fijo ");
		this.jButtonFK_IdDetalleActivoFijoVehiculo= new JButtonMe();
		this.jButtonFK_IdDetalleActivoFijoVehiculo.setText("Buscar");
		this.jButtonFK_IdDetalleActivoFijoVehiculo.setToolTipText("Buscar Por Detalle Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleActivoFijoVehiculo,"buscar_button","Buscar Por Detalle Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleActivoFijoVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo = new JLabelMe();
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setText("Detalle Activo Fijo :");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setToolTipText("Detalle Activo Fijo");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasVehiculo=new JTabbedPane();


		this.jTabbedPaneBusquedasVehiculo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasVehiculo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasVehiculo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVehiculo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVehiculo = new VehiculoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Vehiculo DATOS");
			this.jInternalFrameDetalleFormVehiculo = new VehiculoDetalleFormJInternalFrame(jDesktopPane,this.vehiculoSessionBean.getConGuardarRelaciones(),this.vehiculoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVehiculo = null;//new VehiculoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVehiculo= new GridBagLayout();
		
		
		this.jTableDatosVehiculo = new JTableMe();      
		
		String sToolTipVehiculo="";
		sToolTipVehiculo=VehiculoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVehiculo+="(ActivosFijos.Vehiculo)";
		}
		
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
			sToolTipVehiculo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVehiculo.setToolTipText(sToolTipVehiculo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVehiculo);
		this.jTableDatosVehiculo.setAutoCreateRowSorter(true);
		this.jTableDatosVehiculo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVehiculo.setRowSelectionAllowed(true);
		this.jTableDatosVehiculo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVehiculo = new JButtonMe();
		this.jButtonDuplicarVehiculo = new JButtonMe();
		this.jButtonCopiarVehiculo = new JButtonMe();
		this.jButtonVerFormVehiculo = new JButtonMe();
		this.jButtonNuevoRelacionesVehiculo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVehiculo = new JButtonMe();
		this.jButtonCerrarVehiculo = new JButtonMe();
		
		this.jScrollPanelDatosVehiculo = new JScrollPane();   
        this.jScrollPanelDatosGeneralVehiculo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Vehiculo";
		
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculos" + this.sPath));
		} else {
			this.jScrollPanelDatosVehiculo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVehiculo.setToolTipText("Acciones");
        this.jPanelAccionesVehiculo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVehiculo=new ReporteDinamicoJInternalFrame(VehiculoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVehiculo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVehiculo=new ImportacionJInternalFrame(VehiculoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVehiculo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVehiculo = new JButtonMe();
		
		this.jButtonAbrirOrderByVehiculo.setText("Orden");
		this.jButtonAbrirOrderByVehiculo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVehiculo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVehiculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVehiculo,false,this);
			
			//this.cargarOrderByVehiculo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVehiculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVehiculo,true,this);
			
			//this.cargarOrderByVehiculo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVehiculo.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosVehiculo.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosVehiculo.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosVehiculo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVehiculo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVehiculo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVehiculo.setText("Nuevo");
		this.jButtonDuplicarVehiculo.setText("Duplicar");
		this.jButtonCopiarVehiculo.setText("Copiar");
		this.jButtonVerFormVehiculo.setText("Ver");
		this.jButtonNuevoRelacionesVehiculo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVehiculo.setText("Guardar");
		this.jButtonCerrarVehiculo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVehiculo,"nuevo_button","Nuevo",this.vehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVehiculo,"duplicar_button","Duplicar",this.vehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVehiculo,"copiar_button","Copiar",this.vehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVehiculo,"ver_form","Ver",this.vehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVehiculo,"nuevorelaciones_button","Nuevo Rel",this.vehiculoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVehiculo,"guardarcambiostabla_button","Guardar",this.vehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVehiculo,"cerrar_button","Salir",this.vehiculoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVehiculo.setToolTipText("Nuevo"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVehiculo.setToolTipText("Duplicar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVehiculo.setToolTipText("Copiar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVehiculo.setToolTipText("Ver"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVehiculo.setToolTipText("Nuevo Rel"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVehiculo.setToolTipText("Guardar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVehiculo.setToolTipText("Salir"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVehiculo";
		inputMap = this.jButtonNuevoVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVehiculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVehiculo"));
		
		//DUPLICAR
		sMapKey = "DuplicarVehiculo";
		inputMap = this.jButtonDuplicarVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVehiculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVehiculo"));
		
		//COPIAR
		sMapKey = "CopiarVehiculo";
		inputMap = this.jButtonCopiarVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVehiculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVehiculo"));
		
		//VEr FORM
		sMapKey = "VerFormVehiculo";
		inputMap = this.jButtonVerFormVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVehiculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVehiculo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVehiculo";
		inputMap = this.jButtonNuevoRelacionesVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVehiculo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVehiculo";
		inputMap = this.jButtonModificarVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVehiculo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVehiculo";
		inputMap = this.jButtonCerrarVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVehiculo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVehiculo";
		inputMap = this.jButtonGuardarCambiosTablaVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVehiculo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Vehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Vehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Vehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Vehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Vehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVehiculo.setName("jPanelParametrosReportesVehiculo"); 
		
		this.jPanelParametrosReportesAccionesVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVehiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVehiculo.setName("jPanelParametrosReportesAccionesVehiculo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVehiculo = new JButtonMe();
		this.jButtonRecargarInformacionVehiculo.setText("Recargar");
		this.jButtonRecargarInformacionVehiculo.setToolTipText("Recargar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVehiculo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionVehiculo = new JButtonMe();
		this.jButtonProcesarInformacionVehiculo.setText("Procesar");
		this.jButtonProcesarInformacionVehiculo.setToolTipText("Procesar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVehiculo.setVisible(false);
			
		this.jButtonProcesarInformacionVehiculo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVehiculo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVehiculo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVehiculo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVehiculo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVehiculo.setText("TIPO");       
		this.jComboBoxTiposReportesVehiculo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVehiculo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVehiculo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVehiculo.setText("Paginacion");
		this.jComboBoxTiposPaginacionVehiculo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVehiculo.setText("Accion");
		this.jComboBoxTiposRelacionesVehiculo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVehiculo.setText("Accion");
		this.jComboBoxTiposAccionesVehiculo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVehiculo.setText("Accion");
		this.jComboBoxTiposSeleccionarVehiculo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVehiculo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVehiculo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVehiculo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVehiculo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVehiculo = new JLabelMe();
		
		this.jLabelAccionesVehiculo.setText("Acciones");		
		this.jLabelAccionesVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVehiculo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVehiculo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVehiculo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVehiculo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVehiculo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVehiculo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVehiculo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVehiculo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVehiculo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVehiculo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVehiculo.setText("Graf.");
		this.jCheckBoxConGraficoReporteVehiculo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVehiculo = new JButtonMe();
		//this.jButtonAnterioresVehiculo.setText("<<");
        this.jButtonAnterioresVehiculo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVehiculo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVehiculo = new JButtonMe();
		//this.jButtonSiguientesVehiculo.setText(">>");
        this.jButtonSiguientesVehiculo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVehiculo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVehiculo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVehiculo.setText("Nue");
        this.jButtonNuevoGuardarCambiosVehiculo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVehiculo,"nuevoguardarcambios_button","Nue",this.vehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVehiculo";
		inputMap = this.jButtonNuevoGuardarCambiosVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVehiculo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVehiculo";
		inputMap = this.jButtonRecargarInformacionVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVehiculo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVehiculo";
		inputMap = this.jButtonSiguientesVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVehiculo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVehiculo";
		inputMap = this.jButtonAnterioresVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVehiculo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVehiculo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVehiculo.setMinimumSize(new Dimension(this.getWidth(),VehiculoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VehiculoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVehiculo.setMaximumSize(new Dimension(this.getWidth(),VehiculoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VehiculoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVehiculo.setPreferredSize(new Dimension(this.getWidth(),VehiculoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VehiculoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVehiculo = new GridBagLayout();

			this.jPanelPaginacionVehiculo.setLayout(gridaBagLayoutPaginacionVehiculo);						
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = 0;
			this.gridBagConstraintsVehiculo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVehiculo.add(this.jButtonAnterioresVehiculo, this.gridBagConstraintsVehiculo);
					
						
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVehiculo.gridy = 0;
			
			this.jPanelPaginacionVehiculo.add(this.jButtonNuevoGuardarCambiosVehiculo, this.gridBagConstraintsVehiculo);
						
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVehiculo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVehiculo.gridy = 0;
			this.jPanelPaginacionVehiculo.add(this.jButtonSiguientesVehiculo, this.gridBagConstraintsVehiculo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = 1;
			this.gridBagConstraintsVehiculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVehiculo.add(this.jButtonNuevoVehiculo, this.gridBagConstraintsVehiculo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsVehiculo = new GridBagConstraints();
				this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVehiculo.gridy = 1;
				this.gridBagConstraintsVehiculo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionVehiculo.add(this.jButtonNuevoRelacionesVehiculo, this.gridBagConstraintsVehiculo);
			}
			
			
			if(!this.vehiculoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVehiculo = new GridBagConstraints();
				this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVehiculo.gridy = 1;
				this.gridBagConstraintsVehiculo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVehiculo.add(this.jButtonGuardarCambiosTablaVehiculo, this.gridBagConstraintsVehiculo);
			}
			
			
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = 1;
			this.gridBagConstraintsVehiculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVehiculo.add(this.jButtonDuplicarVehiculo, this.gridBagConstraintsVehiculo);
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = 1;
			this.gridBagConstraintsVehiculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVehiculo.add(this.jButtonCopiarVehiculo, this.gridBagConstraintsVehiculo);
		
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = 1;
			this.gridBagConstraintsVehiculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVehiculo.add(this.jButtonVerFormVehiculo, this.gridBagConstraintsVehiculo);
		
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = 1;
			this.gridBagConstraintsVehiculo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVehiculo.add(this.jButtonCerrarVehiculo, this.gridBagConstraintsVehiculo);
		
		
		
		this.jButtonRecargarInformacionVehiculo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVehiculo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVehiculo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVehiculo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVehiculo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVehiculo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVehiculo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVehiculo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVehiculo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVehiculo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVehiculo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVehiculo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVehiculo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVehiculo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVehiculo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVehiculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVehiculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVehiculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVehiculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVehiculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVehiculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVehiculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVehiculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVehiculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVehiculo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVehiculo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVehiculo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVehiculo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVehiculo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVehiculo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVehiculo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVehiculo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVehiculo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVehiculo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVehiculo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVehiculo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVehiculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVehiculo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Vehiculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Vehiculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Vehiculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Vehiculo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVehiculo.setLayout(gridaBagParametrosReportesVehiculo);
			this.jPanelParametrosReportesAccionesVehiculo.setLayout(gridaBagParametrosReportesAccionesVehiculo);
			
			
			this.jPanelParametrosAuxiliar1Vehiculo.setLayout(gridaBagParametrosAuxiliar1Vehiculo);
			this.jPanelParametrosAuxiliar2Vehiculo.setLayout(gridaBagParametrosAuxiliar2Vehiculo);
			this.jPanelParametrosAuxiliar3Vehiculo.setLayout(gridaBagParametrosAuxiliar3Vehiculo);
			this.jPanelParametrosAuxiliar4Vehiculo.setLayout(gridaBagParametrosAuxiliar4Vehiculo);
			//this.jPanelParametrosAuxiliar5Vehiculo.setLayout(gridaBagParametrosAuxiliar2Vehiculo);			
			
			
			
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVehiculo.add(this.jButtonRecargarInformacionVehiculo, this.gridBagConstraintsVehiculo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Vehiculo.add(this.jComboBoxTiposPaginacionVehiculo, this.gridBagConstraintsVehiculo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Vehiculo.add(this.jCheckBoxConAltoMaximoTablaVehiculo, this.gridBagConstraintsVehiculo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Vehiculo.add(this.jComboBoxTiposArchivosReportesVehiculo, this.gridBagConstraintsVehiculo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVehiculo.add(this.jPanelParametrosAuxiliar1Vehiculo, this.gridBagConstraintsVehiculo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVehiculo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Vehiculo.add(this.jComboBoxTiposReportesVehiculo, this.gridBagConstraintsVehiculo);																		
			
			
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVehiculo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Vehiculo.add(this.jComboBoxTiposGraficosReportesVehiculo, this.gridBagConstraintsVehiculo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVehiculo.add(this.jPanelParametrosAuxiliar4Vehiculo, this.gridBagConstraintsVehiculo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVehiculo.add(this.jComboBoxTiposReportesVehiculo, this.gridBagConstraintsVehiculo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVehiculo.add(this.jCheckBoxGenerarReporteVehiculo, this.gridBagConstraintsVehiculo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVehiculo.add(this.jPanelParametrosAuxiliar2Vehiculo, this.gridBagConstraintsVehiculo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVehiculo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVehiculo.add(this.jLabelAccionesVehiculo, this.gridBagConstraintsVehiculo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVehiculo = new GridBagConstraints();
				this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVehiculo.add(this.jButtonAbrirOrderByVehiculo, this.gridBagConstraintsVehiculo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVehiculo.add(this.jComboBoxTiposSeleccionarVehiculo, this.gridBagConstraintsVehiculo);			
			
			
			/*
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVehiculo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVehiculo.add(this.jCheckBoxSeleccionarTodosVehiculo, this.gridBagConstraintsVehiculo);
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVehiculo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVehiculo.add(this.jCheckBoxConGraficoReporteVehiculo, this.gridBagConstraintsVehiculo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVehiculo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Vehiculo.add(this.jCheckBoxSeleccionarTodosVehiculo, this.gridBagConstraintsVehiculo);															
				
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVehiculo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Vehiculo.add(this.jCheckBoxSeleccionadosVehiculo, this.gridBagConstraintsVehiculo);															
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVehiculo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Vehiculo.add(this.jCheckBoxConGraficoReporteVehiculo, this.gridBagConstraintsVehiculo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVehiculo.add(this.jPanelParametrosAuxiliar3Vehiculo, this.gridBagConstraintsVehiculo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVehiculo.add(this.jComboBoxTiposRelacionesVehiculo, this.gridBagConstraintsVehiculo);
				
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVehiculo.add(this.jComboBoxTiposAccionesVehiculo, this.gridBagConstraintsVehiculo);
	
				
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVehiculo.add(this.jTextFieldValorCampoGeneralVehiculo, this.gridBagConstraintsVehiculo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVehiculo = new GridBagLayout();

			this.jScrollPanelDatosVehiculo.setLayout(gridaBagLayoutDatosVehiculo);
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = 0;
			this.gridBagConstraintsVehiculo.gridx = 0;
			
			this.jScrollPanelDatosVehiculo.add(this.jTableDatosVehiculo, this.gridBagConstraintsVehiculo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVehiculo.setViewportView(this.jTableDatosVehiculo);
		this.jTableDatosVehiculo.setFillsViewportHeight(true);
		this.jTableDatosVehiculo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVehiculo= new GridBagLayout();
		this.jPanelAccionesVehiculo.setLayout(gridaBagLayoutAccionesVehiculo);
		
		
		/*	
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 0;
			
		this.jPanelAccionesVehiculo.add(this.jButtonNuevoVehiculo, this.gridBagConstraintsVehiculo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAseguradoraVehiculo= new GridBagLayout();
		gridaBagLayoutFK_IdAseguradoraVehiculo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAseguradoraVehiculo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAseguradoraVehiculo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAseguradoraVehiculo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAseguradoraVehiculo.setLayout(gridaBagLayoutFK_IdAseguradoraVehiculo);

		gridBagConstraintsVehiculo = new GridBagConstraints();
		gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVehiculo.gridy = 0;
		gridBagConstraintsVehiculo.gridx = 0;
		jPanelFK_IdAseguradoraVehiculo.add(jLabelid_aseguradoraFK_IdAseguradoraVehiculo, gridBagConstraintsVehiculo);

		gridBagConstraintsVehiculo = new GridBagConstraints();
		gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVehiculo.gridy = 0;
		gridBagConstraintsVehiculo.gridx = 1;
		jPanelFK_IdAseguradoraVehiculo.add(jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo, gridBagConstraintsVehiculo);

		gridBagConstraintsVehiculo = new GridBagConstraints();
		gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVehiculo.gridy = 1;
		gridBagConstraintsVehiculo.gridx =1;
		jPanelFK_IdAseguradoraVehiculo.add(jButtonFK_IdAseguradoraVehiculo, gridBagConstraintsVehiculo);

		jTabbedPaneBusquedasVehiculo.addTab("1.-Por Aseguradora ", jPanelFK_IdAseguradoraVehiculo);
		jTabbedPaneBusquedasVehiculo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDetalleActivoFijoVehiculo= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleActivoFijoVehiculo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoVehiculo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoVehiculo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleActivoFijoVehiculo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleActivoFijoVehiculo.setLayout(gridaBagLayoutFK_IdDetalleActivoFijoVehiculo);

		gridBagConstraintsVehiculo = new GridBagConstraints();
		gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVehiculo.gridy = 0;
		gridBagConstraintsVehiculo.gridx = 0;
		jPanelFK_IdDetalleActivoFijoVehiculo.add(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo, gridBagConstraintsVehiculo);

		gridBagConstraintsVehiculo = new GridBagConstraints();
		gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVehiculo.gridy = 0;
		gridBagConstraintsVehiculo.gridx = 1;
		jPanelFK_IdDetalleActivoFijoVehiculo.add(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo, gridBagConstraintsVehiculo);

		gridBagConstraintsVehiculo = new GridBagConstraints();
		gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVehiculo.gridy = 1;
		gridBagConstraintsVehiculo.gridx =1;
		jPanelFK_IdDetalleActivoFijoVehiculo.add(jButtonFK_IdDetalleActivoFijoVehiculo, gridBagConstraintsVehiculo);

		jTabbedPaneBusquedasVehiculo.addTab("2.-Por Detalle Activo Fijo ", jPanelFK_IdDetalleActivoFijoVehiculo);
		jTabbedPaneBusquedasVehiculo.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVehiculo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVehiculo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVehiculo = new GridBagConstraints();						
			this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVehiculo.gridx = 0;		
			//this.gridBagConstraintsVehiculo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVehiculo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVehiculo, this.gridBagConstraintsVehiculo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVehiculo.gridx = 0;		
		//this.gridBagConstraintsVehiculo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVehiculo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVehiculo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVehiculo.gridx = 0;		
			this.gridBagConstraintsVehiculo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVehiculo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVehiculo, this.gridBagConstraintsVehiculo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVehiculo, this.gridBagConstraintsVehiculo);								
		
		
		/*
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVehiculo, this.gridBagConstraintsVehiculo);
		*/		
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVehiculo.gridx =0;
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVehiculo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVehiculo, this.gridBagConstraintsVehiculo);
				
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVehiculo, this.gridBagConstraintsVehiculo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(VehiculoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVehiculo = new GridBagLayout();
			this.jPanelBusquedasParametrosVehiculo.setLayout(gridaBagLayoutBusquedasParametrosVehiculo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVehiculo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVehiculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVehiculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVehiculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVehiculo, this.gridBagConstraintsVehiculo);
			
			
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVehiculo, this.gridBagConstraintsVehiculo);
		
			
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVehiculo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVehiculo, this.gridBagConstraintsVehiculo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVehiculo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVehiculo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVehiculo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVehiculo.setName("jPanelReporteDinamicoVehiculo"); 
		
		this.jPanelReporteDinamicoVehiculo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVehiculo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVehiculo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVehiculo.setLayout(gridaBagLayoutReporteDinamicoVehiculo);
		
		
		this.jInternalFrameReporteDinamicoVehiculo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVehiculo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVehiculo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVehiculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVehiculo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVehiculo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVehiculo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVehiculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVehiculo.setResizable(true);
	    this.jInternalFrameReporteDinamicoVehiculo.setClosable(true);
	    this.jInternalFrameReporteDinamicoVehiculo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVehiculo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVehiculo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVehiculo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVehiculo = new JLabelMe();

		this.jLabelColumnasSelectReporteVehiculo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVehiculo.add(this.jLabelColumnasSelectReporteVehiculo, this.gridBagConstraintsVehiculo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVehiculo = new JList<Reporte>();
		this.jListColumnasSelectReporteVehiculo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVehiculo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVehiculo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVehiculo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVehiculo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVehiculo=new JScrollPane(this.jListColumnasSelectReporteVehiculo);
			
			this.jScrollColumnasSelectReporteVehiculo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVehiculo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVehiculo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVehiculo.add(this.jListColumnasSelectReporteVehiculo, this.gridBagConstraintsVehiculo);
		this.jPanelReporteDinamicoVehiculo.add(this.jScrollColumnasSelectReporteVehiculo, this.gridBagConstraintsVehiculo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVehiculo = new JLabelMe();

		this.jLabelRelacionesSelectReporteVehiculo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVehiculo.add(this.jLabelRelacionesSelectReporteVehiculo, this.gridBagConstraintsVehiculo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVehiculo = new JList<Reporte>();
		this.jListRelacionesSelectReporteVehiculo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVehiculo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVehiculo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVehiculo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVehiculo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVehiculo=new JScrollPane(this.jListRelacionesSelectReporteVehiculo);
			
			this.jScrollRelacionesSelectReporteVehiculo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVehiculo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVehiculo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVehiculo.add(this.jListRelacionesSelectReporteVehiculo, this.gridBagConstraintsVehiculo);
		this.jPanelReporteDinamicoVehiculo.add(this.jScrollRelacionesSelectReporteVehiculo, this.gridBagConstraintsVehiculo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoVehiculo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVehiculo = new JComboBoxMe();
		this.jListColumnasValoresGraficoVehiculo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVehiculo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVehiculo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVehiculo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVehiculo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVehiculo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVehiculo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVehiculo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVehiculo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVehiculo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVehiculo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVehiculo = new JLabelMe();

		this.jLabelConGraficoDinamicoVehiculo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVehiculo.add(this.jLabelConGraficoDinamicoVehiculo, this.gridBagConstraintsVehiculo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVehiculo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVehiculo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVehiculo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVehiculo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVehiculo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVehiculo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculo.add(this.jCheckBoxConGraficoDinamicoVehiculo, this.gridBagConstraintsVehiculo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVehiculo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVehiculo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVehiculo.add(this.jLabelColumnaCategoriaGraficoVehiculo, this.gridBagConstraintsVehiculo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVehiculo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVehiculo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVehiculo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVehiculo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVehiculo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVehiculo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVehiculo.add(this.jComboBoxColumnaCategoriaGraficoVehiculo, this.gridBagConstraintsVehiculo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVehiculo = new JLabelMe();

		this.jLabelColumnaCategoriaValorVehiculo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculo.add(this.jLabelColumnaCategoriaValorVehiculo, this.gridBagConstraintsVehiculo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVehiculo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVehiculo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVehiculo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVehiculo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVehiculo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVehiculo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVehiculo.add(this.jComboBoxColumnaCategoriaValorVehiculo, this.gridBagConstraintsVehiculo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVehiculo = new JLabelMe();

		this.jLabelColumnasValoresGraficoVehiculo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculo.add(this.jLabelColumnasValoresGraficoVehiculo, this.gridBagConstraintsVehiculo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVehiculo = new JList<Reporte>();
		this.jListColumnasValoresGraficoVehiculo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVehiculo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVehiculo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVehiculo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVehiculo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVehiculo=new JScrollPane(this.jListColumnasValoresGraficoVehiculo);
			
			this.jScrollColumnasValoresGraficoVehiculo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVehiculo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVehiculo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVehiculo.add(this.jListColumnasSelectReporteVehiculo, this.gridBagConstraintsVehiculo);
		this.jPanelReporteDinamicoVehiculo.add(this.jScrollColumnasValoresGraficoVehiculo, this.gridBagConstraintsVehiculo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVehiculo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVehiculo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculo.add(this.jLabelTiposGraficosReportesDinamicoVehiculo, this.gridBagConstraintsVehiculo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVehiculo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVehiculo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVehiculo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVehiculo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVehiculo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVehiculo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculo.add(this.jComboBoxTiposGraficosReportesDinamicoVehiculo, this.gridBagConstraintsVehiculo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVehiculo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVehiculo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculo.add(this.jLabelGenerarExcelReporteDinamicoVehiculo, this.gridBagConstraintsVehiculo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVehiculo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVehiculo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVehiculo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVehiculo.setToolTipText("Generar EXCEL"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVehiculo.add(this.jButtonGenerarExcelReporteDinamicoVehiculo, this.gridBagConstraintsVehiculo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVehiculo.add(this.jComboBoxTiposReportesDinamicoVehiculo, this.gridBagConstraintsVehiculo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVehiculo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVehiculo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculo.add(this.jLabelTiposArchivoReporteDinamicoVehiculo, this.gridBagConstraintsVehiculo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVehiculo.add(this.jComboBoxTiposArchivosReportesDinamicoVehiculo, this.gridBagConstraintsVehiculo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVehiculo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVehiculo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVehiculo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVehiculo.setToolTipText("Generar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVehiculo.add(this.jButtonGenerarReporteDinamicoVehiculo, this.gridBagConstraintsVehiculo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVehiculo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVehiculo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVehiculo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVehiculo.setToolTipText("Cancelar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVehiculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVehiculo.add(this.jButtonCerrarReporteDinamicoVehiculo, this.gridBagConstraintsVehiculo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVehiculo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVehiculo= new JScrollPane(jPanelReporteDinamicoVehiculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVehiculo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVehiculo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVehiculo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVehiculo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVehiculo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVehiculo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVehiculo);
		this.jInternalFrameReporteDinamicoVehiculo.getContentPane().add(this.jScrollPanelReporteDinamicoVehiculo, this.gridBagConstraintsVehiculo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVehiculo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVehiculo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVehiculo.setName("jPanelImportacionVehiculo"); 
		
		this.jPanelImportacionVehiculo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVehiculo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVehiculo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVehiculo.setLayout(gridaBagLayoutImportacionVehiculo);
		
		
		this.jInternalFrameImportacionVehiculo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVehiculo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVehiculo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVehiculo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVehiculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVehiculo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVehiculo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVehiculo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVehiculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVehiculo.setResizable(true);
	    this.jInternalFrameImportacionVehiculo.setClosable(true);
	    this.jInternalFrameImportacionVehiculo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVehiculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVehiculo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVehiculo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVehiculo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVehiculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVehiculo.setResizable(true);
	    this.jInternalFrameImportacionVehiculo.setClosable(true);
	    this.jInternalFrameImportacionVehiculo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVehiculo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVehiculo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVehiculo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVehiculo = new JLabelMe();

		this.jLabelArchivoImportacionVehiculo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYImportacion;		
		this.gridBagConstraintsVehiculo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVehiculo.add(this.jLabelArchivoImportacionVehiculo, this.gridBagConstraintsVehiculo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVehiculo = new JFileChooser();		
		this.jFileChooserImportacionVehiculo.setToolTipText("ESCOGER ARCHIVO"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVehiculo = new JButtonMe();
		this.jButtonAbrirImportacionVehiculo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVehiculo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVehiculo.setToolTipText("Generar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYImportacion;
		this.gridBagConstraintsVehiculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVehiculo.add(this.jButtonAbrirImportacionVehiculo, this.gridBagConstraintsVehiculo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVehiculo = new JLabelMe();

		this.jLabelPathArchivoImportacionVehiculo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYImportacion;		
		this.gridBagConstraintsVehiculo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVehiculo.add(this.jLabelPathArchivoImportacionVehiculo, this.gridBagConstraintsVehiculo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVehiculo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVehiculo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVehiculo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVehiculo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYImportacion;
		this.gridBagConstraintsVehiculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVehiculo.add(this.jTextFieldPathArchivoImportacionVehiculo, this.gridBagConstraintsVehiculo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVehiculo = new JButtonMe();
		this.jButtonGenerarImportacionVehiculo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVehiculo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVehiculo.setToolTipText("Generar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYImportacion;
		this.gridBagConstraintsVehiculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVehiculo.add(this.jButtonGenerarImportacionVehiculo, this.gridBagConstraintsVehiculo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVehiculo = new JButtonMe();
		this.jButtonCerrarImportacionVehiculo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVehiculo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVehiculo.setToolTipText("Cancelar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.gridy = iPosYImportacion;
		this.gridBagConstraintsVehiculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVehiculo.add(this.jButtonCerrarImportacionVehiculo, this.gridBagConstraintsVehiculo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVehiculo = new GridBagLayout();
		
		this.jScrollPanelImportacionVehiculo= new JScrollPane(jPanelImportacionVehiculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy =iPosYImportacion;
		this.gridBagConstraintsVehiculo.gridx =iPosXImportacion;
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVehiculo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVehiculo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVehiculo);
		this.jInternalFrameImportacionVehiculo.getContentPane().add(this.jScrollPanelImportacionVehiculo, this.gridBagConstraintsVehiculo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVehiculo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVehiculo = new JButtonMe();
			this.jButtonAbrirOrderByVehiculo.setText("Orden");
			this.jButtonAbrirOrderByVehiculo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVehiculo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVehiculo";
			inputMap = this.jButtonAbrirOrderByVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVehiculo"));
		
		
			GridBagLayout gridaBagLayoutOrderByVehiculo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVehiculo.setName("jPanelOrderByVehiculo"); 
			
			this.jPanelOrderByVehiculo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVehiculo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVehiculo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVehiculo.setLayout(gridaBagLayoutOrderByVehiculo);
			
			
			this.jTableDatosVehiculoOrderBy = new JTableMe();        
			this.jTableDatosVehiculoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVehiculoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVehiculoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVehiculoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVehiculoOrderBy.setViewportView(this.jTableDatosVehiculoOrderBy);
			this.jTableDatosVehiculoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVehiculoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVehiculo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVehiculo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVehiculo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVehiculo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVehiculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVehiculo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVehiculo.setTitle("Orden");
			this.jInternalFrameOrderByVehiculo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVehiculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVehiculo.setResizable(true);
			this.jInternalFrameOrderByVehiculo.setClosable(true);
			this.jInternalFrameOrderByVehiculo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVehiculo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVehiculo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVehiculo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVehiculo.gridx =iPosXOrderBy;
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVehiculo.ipady =150;
				
			this.jPanelOrderByVehiculo.add(jScrollPanelDatosVehiculoOrderBy, this.gridBagConstraintsVehiculo);//this.jTableDatosVehiculoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVehiculo = new JButtonMe();
			this.jButtonCerrarOrderByVehiculo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVehiculo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVehiculo.setToolTipText("Cancelar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVehiculo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVehiculo.add(this.jButtonCerrarOrderByVehiculo, this.gridBagConstraintsVehiculo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVehiculo = new GridBagLayout();
			
			this.jScrollPanelOrderByVehiculo= new JScrollPane(jPanelOrderByVehiculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridy =iPosYOrderBy;
			this.gridBagConstraintsVehiculo.gridx =iPosXOrderBy;
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVehiculo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVehiculo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVehiculo);
			
			this.jInternalFrameOrderByVehiculo.getContentPane().add(this.jScrollPanelOrderByVehiculo, this.gridBagConstraintsVehiculo);			
		
		} else {
			this.jButtonAbrirOrderByVehiculo = new JButtonMe();
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
		int iWidthTableCalculado=0;//3230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.vehiculoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVehiculo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVehiculo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVehiculo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosVehiculo.getRowHeight();//VehiculoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VehiculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVehiculo.isSelected()) {
					iHeightTable=VehiculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VehiculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VehiculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VehiculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVehiculo.isSelected()) {
					iHeightTable=VehiculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VehiculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VehiculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVehiculo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVehiculo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVehiculo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVehiculo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVehiculo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVehiculo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVehiculo!=null && this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy()!=null) {
			//if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVehiculo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVehiculo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVehiculo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVehiculo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVehiculo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVehiculo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=vehiculoLogic.getVehiculos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vehiculos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Vehiculo> TraerVehiculoBeans(List<Vehiculo> vehiculos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Vehiculo vehiculo:vehiculos) {
					
				if(!(VehiculoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VehiculoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					vehiculo.setsDetalleGeneralEntityReporte(VehiculoConstantesFunciones.getVehiculoDescripcion(vehiculo));
										
						
					
					

					if(vehiculo.getServicioTransportes()!=null && Funciones.existeClass(classes,ServicioTransporte.class)) {
						try{vehiculo.setserviciotransportesDescripcionReporte(new JRBeanCollectionDataSource(ServicioTransporteJInternalFrame.TraerServicioTransporteBeans(vehiculo.getServicioTransportes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//vehiculo.setsDetalleGeneralEntityReporte(vehiculo.getsDetalleGeneralEntityReporte());
										
				}
				
				//vehiculobeans.add(vehiculobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return vehiculos;
    }
	//PARA REPORTES FIN
}
