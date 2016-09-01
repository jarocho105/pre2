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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.DetallesIngresosFacturasConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class DetallesIngresosFacturasJInternalFrame extends DetallesIngresosFacturasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetallesIngresosFacturas;
	
	protected JMenuBar jmenuBarDetallesIngresosFacturas;
	
	protected JMenu jmenuDetallesIngresosFacturas;
	protected JMenu jmenuDatosDetallesIngresosFacturas;
	protected JMenu jmenuArchivoDetallesIngresosFacturas;
	protected JMenu jmenuAccionesDetallesIngresosFacturas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallesIngresosFacturas;	
	protected GridBagConstraints gridBagConstraintsDetallesIngresosFacturas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetallesIngresosFacturasDetalleFormJInternalFrame jInternalFrameDetalleFormDetallesIngresosFacturas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetallesIngresosFacturas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetallesIngresosFacturas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public DetallesIngresosFacturasSessionBean detallesingresosfacturasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetallesIngresosFacturas> detallesingresosfacturass;		
	public List<DetallesIngresosFacturas> detallesingresosfacturassEliminados;	
	public List<DetallesIngresosFacturas> detallesingresosfacturassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetallesIngresosFacturas;		
	protected JButton jButtonAbrirOrderByDetallesIngresosFacturas;
	
	
	//protected JPanel jPanelOrderByDetallesIngresosFacturas;
	//public JScrollPane jScrollPanelOrderByDetallesIngresosFacturas;	
	//protected JButton jButtonCerrarOrderByDetallesIngresosFacturas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetallesIngresosFacturasLogic detallesingresosfacturasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetallesIngresosFacturas;
	public JScrollPane jScrollPanelDatosEdicionDetallesIngresosFacturas;
	public JScrollPane jScrollPanelDatosGeneralDetallesIngresosFacturas;
    
	
	
	//public JScrollPane jScrollPanelDatosDetallesIngresosFacturasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetallesIngresosFacturas;
	//public JScrollPane jScrollPanelImportacionDetallesIngresosFacturas;
	
	
	
	protected JPanel jPanelAccionesDetallesIngresosFacturas;
	
    protected JPanel jPanelPaginacionDetallesIngresosFacturas;
    protected JPanel jPanelParametrosReportesDetallesIngresosFacturas;
	protected JPanel jPanelParametrosReportesAccionesDetallesIngresosFacturas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetallesIngresosFacturas;
	protected JPanel jPanelParametrosAuxiliar2DetallesIngresosFacturas;
	protected JPanel jPanelParametrosAuxiliar3DetallesIngresosFacturas;
	protected JPanel jPanelParametrosAuxiliar4DetallesIngresosFacturas;
	//protected JPanel jPanelParametrosAuxiliar5DetallesIngresosFacturas;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetallesIngresosFacturas;
	//protected JPanel jPanelImportacionDetallesIngresosFacturas;
	
	
	public JTable jTableDatosDetallesIngresosFacturas;
	
	
	
	//public JTable jTableDatosDetallesIngresosFacturasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetallesIngresosFacturas;
	protected JButton jButtonDuplicarDetallesIngresosFacturas;
	protected JButton jButtonCopiarDetallesIngresosFacturas;
	protected JButton jButtonVerFormDetallesIngresosFacturas;
	protected JButton jButtonNuevoRelacionesDetallesIngresosFacturas;
	protected JButton jButtonModificarDetallesIngresosFacturas;
	
    protected JButton jButtonGuardarCambiosTablaDetallesIngresosFacturas;
	protected JButton jButtonCerrarDetallesIngresosFacturas;
	
	
	protected JButton jButtonRecargarInformacionDetallesIngresosFacturas;
	protected JButton jButtonProcesarInformacionDetallesIngresosFacturas;
	
	
	protected JButton jButtonAnterioresDetallesIngresosFacturas;
	protected JButton jButtonSiguientesDetallesIngresosFacturas;
	protected JButton jButtonNuevoGuardarCambiosDetallesIngresosFacturas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetallesIngresosFacturas;
	//protected JButton jButtonCerrarReporteDinamicoDetallesIngresosFacturas;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturas;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetallesIngresosFacturas;
	//protected JButton jButtonGenerarImportacionDetallesIngresosFacturas;
	//protected JButton jButtonCerrarImportacionDetallesIngresosFacturas;
	//protected JFileChooser jFileChooserImportacionDetallesIngresosFacturas;
	//protected File fileImportacionDetallesIngresosFacturas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallesIngresosFacturas;
	protected JButton jButtonDuplicarToolBarDetallesIngresosFacturas;
	protected JButton jButtonNuevoRelacionesToolBarDetallesIngresosFacturas;
	
	
	public JButton jButtonGuardarCambiosToolBarDetallesIngresosFacturas;
	protected JButton jButtonCopiarToolBarDetallesIngresosFacturas;
	protected JButton jButtonVerFormToolBarDetallesIngresosFacturas;
	public JButton jButtonGuardarCambiosTablaToolBarDetallesIngresosFacturas;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallesIngresosFacturas;
	protected JButton jButtonCerrarToolBarDetallesIngresosFacturas;
	
	protected JButton jButtonRecargarInformacionToolBarDetallesIngresosFacturas;
	protected JButton jButtonProcesarInformacionToolBarDetallesIngresosFacturas;
	protected JButton jButtonAnterioresToolBarDetallesIngresosFacturas;
	protected JButton jButtonSiguientesToolBarDetallesIngresosFacturas;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetallesIngresosFacturas;
	protected JButton jButtonAbrirOrderByToolBarDetallesIngresosFacturas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallesIngresosFacturas;
	protected JMenuItem jMenuItemDuplicarDetallesIngresosFacturas;
	protected JMenuItem jMenuItemNuevoRelacionesDetallesIngresosFacturas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetallesIngresosFacturas;
	protected JMenuItem jMenuItemCopiarDetallesIngresosFacturas;
	protected JMenuItem jMenuItemVerFormDetallesIngresosFacturas;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallesIngresosFacturas;
	protected JMenuItem jMenuItemCerrarDetallesIngresosFacturas;
	protected JMenuItem jMenuItemDetalleCerrarDetallesIngresosFacturas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetallesIngresosFacturas;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallesIngresosFacturas;
	
	protected JMenuItem jMenuItemRecargarInformacionDetallesIngresosFacturas;
	protected JMenuItem jMenuItemProcesarInformacionDetallesIngresosFacturas;
	protected JMenuItem jMenuItemAnterioresDetallesIngresosFacturas;
	protected JMenuItem jMenuItemSiguientesDetallesIngresosFacturas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallesIngresosFacturas;
	protected JMenuItem jMenuItemAbrirOrderByDetallesIngresosFacturas;
	protected JMenuItem jMenuItemMostrarOcultarDetallesIngresosFacturas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallesIngresosFacturas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetallesIngresosFacturas;
	protected JCheckBox jCheckBoxSeleccionadosDetallesIngresosFacturas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetallesIngresosFacturas;
	protected JCheckBox jCheckBoxConGraficoReporteDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetallesIngresosFacturas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetallesIngresosFacturas;
	protected JTextField jTextFieldValorCampoGeneralDetallesIngresosFacturas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetallesIngresosFacturas;
	//public JList<Reporte> jListColumnasSelectReporteDetallesIngresosFacturas;
	//public JScrollPane jScrollColumnasSelectReporteDetallesIngresosFacturas;
	
	//public JLabel jLabelRelacionesSelectReporteDetallesIngresosFacturas;
	//public JList<Reporte> jListRelacionesSelectReporteDetallesIngresosFacturas;
	//public JScrollPane jScrollRelacionesSelectReporteDetallesIngresosFacturas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetallesIngresosFacturas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetallesIngresosFacturas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetallesIngresosFacturas;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetallesIngresosFacturas;
	
		
	//public JLabel jLabelArchivoImportacionDetallesIngresosFacturas;	
	//public JLabel jLabelPathArchivoImportacionDetallesIngresosFacturas;
	//protected JTextField jTextFieldPathArchivoImportacionDetallesIngresosFacturas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetallesIngresosFacturas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetallesIngresosFacturas;
	
	//public JLabel jLabelColumnaCategoriaValorDetallesIngresosFacturas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetallesIngresosFacturas;
	
	//public JLabel jLabelColumnasValoresGraficoDetallesIngresosFacturas;
	//public JList<Reporte> jListColumnasValoresGraficoDetallesIngresosFacturas;
	//public JScrollPane jScrollColumnasValoresGraficoDetallesIngresosFacturas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetallesIngresosFacturas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetallesIngresosFacturas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetallesIngresosFacturas;
	public JPanel jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas;
	public JButton jButtonBusquedaDetallesIngresosFacturasDetallesIngresosFacturas;
	
	public JPanel jPanelid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas;
	public JLabel jLabelid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas;
	public JButton jButtonid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturasBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public DetallesIngresosFacturasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetallesIngresosFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallesIngresosFacturasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallesIngresosFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallesIngresosFacturasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallesIngresosFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallesIngresosFacturasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallesIngresosFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetallesIngresosFacturas)	{
		this.jButtonRecargarInformacionDetallesIngresosFacturas = jButtonRecargarInformacionDetallesIngresosFacturas;
	}
	
	public JButton getjButtonProcesarInformacionDetallesIngresosFacturas() {
		return this.jButtonProcesarInformacionDetallesIngresosFacturas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallesIngresosFacturas)	{
		this.jButtonProcesarInformacionDetallesIngresosFacturas = jButtonProcesarInformacionDetallesIngresosFacturas;
	}
	
	
	public JButton getjButtonRecargarInformacionDetallesIngresosFacturas() {
		return this.jButtonRecargarInformacionDetallesIngresosFacturas;
	}
	
	
	public List<DetallesIngresosFacturas> getdetallesingresosfacturass() {
		return this.detallesingresosfacturass;
	}

	public void setdetallesingresosfacturass(List<DetallesIngresosFacturas> detallesingresosfacturass) {
		this.detallesingresosfacturass = detallesingresosfacturass;
	}
	
	public List<DetallesIngresosFacturas> getdetallesingresosfacturassAux() {
		return this.detallesingresosfacturassAux;
	}

	public void setdetallesingresosfacturassAux(List<DetallesIngresosFacturas> detallesingresosfacturassAux) {
		this.detallesingresosfacturassAux = detallesingresosfacturassAux;
	}
	
	public List<DetallesIngresosFacturas> getdetallesingresosfacturassEliminados() {
		return this.detallesingresosfacturassEliminados;
	}

	public void setDetallesIngresosFacturassEliminados(List<DetallesIngresosFacturas> detallesingresosfacturassEliminados) {
		this.detallesingresosfacturassEliminados = detallesingresosfacturassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetallesIngresosFacturas() {
		return jComboBoxTiposSeleccionarDetallesIngresosFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetallesIngresosFacturas(
			JComboBox jComboBoxTiposSeleccionarDetallesIngresosFacturas) {
		this.jComboBoxTiposSeleccionarDetallesIngresosFacturas = jComboBoxTiposSeleccionarDetallesIngresosFacturas;
	}
	
	public void setBorderResaltarTiposSeleccionarDetallesIngresosFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetallesIngresosFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetallesIngresosFacturas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetallesIngresosFacturas() {
		return jTextFieldValorCampoGeneralDetallesIngresosFacturas;
	}

	public void setjTextFieldValorCampoGeneralDetallesIngresosFacturas(
			JTextField jTextFieldValorCampoGeneralDetallesIngresosFacturas) {
		this.jTextFieldValorCampoGeneralDetallesIngresosFacturas = jTextFieldValorCampoGeneralDetallesIngresosFacturas;
	}

	public void setBorderResaltarValorCampoGeneralDetallesIngresosFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallesIngresosFacturas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetallesIngresosFacturas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetallesIngresosFacturas() {
		return this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas;
	}

	public void setjCheckBoxSeleccionarTodosDetallesIngresosFacturas(
			JCheckBox jCheckBoxSeleccionarTodosDetallesIngresosFacturas) {
		this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas = jCheckBoxSeleccionarTodosDetallesIngresosFacturas;
	}

	public void setBorderResaltarSeleccionarTodosDetallesIngresosFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallesIngresosFacturas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetallesIngresosFacturas() {
		return this.jCheckBoxSeleccionadosDetallesIngresosFacturas;
	}

	public void setjCheckBoxSeleccionadosDetallesIngresosFacturas(
			JCheckBox jCheckBoxSeleccionadosDetallesIngresosFacturas) {
		this.jCheckBoxSeleccionadosDetallesIngresosFacturas = jCheckBoxSeleccionadosDetallesIngresosFacturas;
	}
	
	public void setBorderResaltarSeleccionadosDetallesIngresosFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallesIngresosFacturas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetallesIngresosFacturas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetallesIngresosFacturas() {
		return this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetallesIngresosFacturas(
			JComboBox jComboBoxTiposArchivosReportesDetallesIngresosFacturas) {
		this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas = jComboBoxTiposArchivosReportesDetallesIngresosFacturas;
	}

	public void setBorderResaltarTiposArchivosReportesDetallesIngresosFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallesIngresosFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetallesIngresosFacturas() {
		return this.jComboBoxTiposReportesDetallesIngresosFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetallesIngresosFacturas(
			JComboBox jComboBoxTiposReportesDetallesIngresosFacturas) {
		this.jComboBoxTiposReportesDetallesIngresosFacturas = jComboBoxTiposReportesDetallesIngresosFacturas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetallesIngresosFacturas() {
	//	return jComboBoxTiposReportesDinamicoDetallesIngresosFacturas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetallesIngresosFacturas(
	//		JComboBox jComboBoxTiposReportesDinamicoDetallesIngresosFacturas) {
	//	this.jComboBoxTiposReportesDinamicoDetallesIngresosFacturas = jComboBoxTiposReportesDinamicoDetallesIngresosFacturas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas = jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas;
	//}
	
	public void setBorderResaltarTiposReportesDetallesIngresosFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallesIngresosFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetallesIngresosFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetallesIngresosFacturas() {
		return this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetallesIngresosFacturas(
			JComboBox jComboBoxTiposGraficosReportesDetallesIngresosFacturas) {
		this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas = jComboBoxTiposGraficosReportesDetallesIngresosFacturas;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetallesIngresosFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallesIngresosFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetallesIngresosFacturas() {
		return this.jComboBoxTiposPaginacionDetallesIngresosFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetallesIngresosFacturas(
			JComboBox jComboBoxTiposPaginacionDetallesIngresosFacturas) {
		this.jComboBoxTiposPaginacionDetallesIngresosFacturas = jComboBoxTiposPaginacionDetallesIngresosFacturas;
	}
	
	public void setBorderResaltarTiposPaginacionDetallesIngresosFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallesIngresosFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetallesIngresosFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetallesIngresosFacturas() {
		return this.jComboBoxTiposRelacionesDetallesIngresosFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallesIngresosFacturas() {
		return this.jComboBoxTiposAccionesDetallesIngresosFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallesIngresosFacturas(
			JComboBox jComboBoxTiposRelacionesDetallesIngresosFacturas) {
		this.jComboBoxTiposRelacionesDetallesIngresosFacturas = jComboBoxTiposRelacionesDetallesIngresosFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallesIngresosFacturas(
			JComboBox jComboBoxTiposAccionesDetallesIngresosFacturas) {
		this.jComboBoxTiposAccionesDetallesIngresosFacturas = jComboBoxTiposAccionesDetallesIngresosFacturas;
	}
	
	public void setBorderResaltarTiposRelacionesDetallesIngresosFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallesIngresosFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetallesIngresosFacturas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetallesIngresosFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallesIngresosFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetallesIngresosFacturas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetallesIngresosFacturas() {
	//	return jCheckBoxConGraficoDinamicoDetallesIngresosFacturas;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetallesIngresosFacturas(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetallesIngresosFacturas) {
	//	this.jCheckBoxConGraficoDinamicoDetallesIngresosFacturas = jCheckBoxConGraficoDinamicoDetallesIngresosFacturas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetallesIngresosFacturas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetallesIngresosFacturas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetallesIngresosFacturas .setBorder(borderResaltar);		
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
		this.detallesingresosfacturasSessionBean=new DetallesIngresosFacturasSessionBean();
		
		this.detallesingresosfacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallesingresosfacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetallesIngresosFacturasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetallesIngresosFacturasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallesIngresosFacturasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallesIngresosFacturasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallesIngresosFacturasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalles Ingresos Facturas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
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
		
		DetallesIngresosFacturasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetallesIngresosFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallesIngresosFacturas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"nuevo","nuevo","Nuevo"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"duplicar","duplicar","Duplicar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"copiar","copiar","Copiar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"ver_form","ver_form","Ver"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"recargar","recargar","Buscar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,
							"cerrar","cerrar","Salir"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetallesIngresosFacturas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetallesIngresosFacturas;
			
				this.jButtonProcesarInformacionToolBarDetallesIngresosFacturas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetallesIngresosFacturas;
				
		//protected JButton jButtonModificarToolBarDetallesIngresosFacturas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetallesIngresosFacturas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetallesIngresosFacturas=new JMenuMe("General");
		this.jmenuArchivoDetallesIngresosFacturas=new JMenuMe("Archivo");
		this.jmenuAccionesDetallesIngresosFacturas=new JMenuMe("Acciones");
		this.jmenuDatosDetallesIngresosFacturas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallesIngresosFacturas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallesIngresosFacturas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallesIngresosFacturas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetallesIngresosFacturas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetallesIngresosFacturas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetallesIngresosFacturas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetallesIngresosFacturas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetallesIngresosFacturas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetallesIngresosFacturas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetallesIngresosFacturas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallesIngresosFacturas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallesIngresosFacturas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetallesIngresosFacturas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetallesIngresosFacturas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetallesIngresosFacturas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetallesIngresosFacturas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetallesIngresosFacturas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetallesIngresosFacturas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetallesIngresosFacturas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetallesIngresosFacturas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetallesIngresosFacturas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallesIngresosFacturas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallesIngresosFacturas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallesIngresosFacturas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetallesIngresosFacturas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetallesIngresosFacturas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetallesIngresosFacturas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetallesIngresosFacturas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetallesIngresosFacturas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetallesIngresosFacturas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetallesIngresosFacturas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetallesIngresosFacturas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetallesIngresosFacturas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetallesIngresosFacturas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetallesIngresosFacturas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetallesIngresosFacturas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetallesIngresosFacturas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetallesIngresosFacturas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetallesIngresosFacturas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallesIngresosFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallesIngresosFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallesIngresosFacturas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetallesIngresosFacturas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetallesIngresosFacturas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetallesIngresosFacturas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallesIngresosFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallesIngresosFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallesIngresosFacturas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetallesIngresosFacturas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetallesIngresosFacturas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetallesIngresosFacturas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetallesIngresosFacturas.add(this.jMenuItemCerrarDetallesIngresosFacturas);
			
			this.jmenuAccionesDetallesIngresosFacturas.add(this.jMenuItemNuevoDetallesIngresosFacturas);
			this.jmenuAccionesDetallesIngresosFacturas.add(this.jMenuItemNuevoGuardarCambiosDetallesIngresosFacturas);
			this.jmenuAccionesDetallesIngresosFacturas.add(this.jMenuItemNuevoRelacionesDetallesIngresosFacturas);
			this.jmenuAccionesDetallesIngresosFacturas.add(this.jMenuItemGuardarCambiosTablaDetallesIngresosFacturas);		
			this.jmenuAccionesDetallesIngresosFacturas.add(this.jMenuItemDuplicarDetallesIngresosFacturas);		
			this.jmenuAccionesDetallesIngresosFacturas.add(this.jMenuItemCopiarDetallesIngresosFacturas);		
			this.jmenuAccionesDetallesIngresosFacturas.add(this.jMenuItemVerFormDetallesIngresosFacturas);		
			
			this.jmenuDatosDetallesIngresosFacturas.add(this.jMenuItemRecargarInformacionDetallesIngresosFacturas);				
			this.jmenuDatosDetallesIngresosFacturas.add(this.jMenuItemAnterioresDetallesIngresosFacturas);				
			this.jmenuDatosDetallesIngresosFacturas.add(this.jMenuItemSiguientesDetallesIngresosFacturas);				
			this.jmenuDatosDetallesIngresosFacturas.add(this.jMenuItemAbrirOrderByDetallesIngresosFacturas);				
			this.jmenuDatosDetallesIngresosFacturas.add(this.jMenuItemMostrarOcultarDetallesIngresosFacturas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetallesIngresosFacturas.add(this.jMenuItemGuardarCambiosDetallesIngresosFacturas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallesIngresosFacturas.add(this.jmenuArchivoDetallesIngresosFacturas);		
			this.jmenuBarDetallesIngresosFacturas.add(this.jmenuAccionesDetallesIngresosFacturas);		
			this.jmenuBarDetallesIngresosFacturas.add(this.jmenuDatosDetallesIngresosFacturas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetallesIngresosFacturas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetallesIngresosFacturas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setToolTipText("Buscar Por Ejercicio ");
		this.jButtonBusquedaDetallesIngresosFacturasDetallesIngresosFacturas= new JButtonMe();
		this.jButtonBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setText("Buscar");
		this.jButtonBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setToolTipText("Buscar Por Ejercicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaDetallesIngresosFacturasDetallesIngresosFacturas,"buscar_button","Buscar Por Ejercicio ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaDetallesIngresosFacturasDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas = new JLabelMe();
		jLabelid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetallesIngresosFacturas=new JTabbedPane();


		this.jTabbedPaneBusquedasDetallesIngresosFacturas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDetallesIngresosFacturas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDetallesIngresosFacturas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetallesIngresosFacturas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetallesIngresosFacturas = new DetallesIngresosFacturasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalles Ingresos Facturas DATOS");
			this.jInternalFrameDetalleFormDetallesIngresosFacturas = new DetallesIngresosFacturasDetalleFormJInternalFrame(jDesktopPane,this.detallesingresosfacturasSessionBean.getConGuardarRelaciones(),this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas = null;//new DetallesIngresosFacturasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallesIngresosFacturas= new GridBagLayout();
		
		
		this.jTableDatosDetallesIngresosFacturas = new JTableMe();      
		
		String sToolTipDetallesIngresosFacturas="";
		sToolTipDetallesIngresosFacturas=DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallesIngresosFacturas+="(Tesoreria.DetallesIngresosFacturas)";
		}
		
		if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallesIngresosFacturas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetallesIngresosFacturas.setToolTipText(sToolTipDetallesIngresosFacturas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetallesIngresosFacturas);
		this.jTableDatosDetallesIngresosFacturas.setAutoCreateRowSorter(true);
		this.jTableDatosDetallesIngresosFacturas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetallesIngresosFacturas.setRowSelectionAllowed(true);
		this.jTableDatosDetallesIngresosFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetallesIngresosFacturas = new JButtonMe();
		this.jButtonDuplicarDetallesIngresosFacturas = new JButtonMe();
		this.jButtonCopiarDetallesIngresosFacturas = new JButtonMe();
		this.jButtonVerFormDetallesIngresosFacturas = new JButtonMe();
		this.jButtonNuevoRelacionesDetallesIngresosFacturas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetallesIngresosFacturas = new JButtonMe();
		this.jButtonCerrarDetallesIngresosFacturas = new JButtonMe();
		
		this.jScrollPanelDatosDetallesIngresosFacturas = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetallesIngresosFacturas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalles Ingresos Facturas";
		
		if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalles Ingresos Facturases" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallesIngresosFacturas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallesIngresosFacturas.setToolTipText("Acciones");
        this.jPanelAccionesDetallesIngresosFacturas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetallesIngresosFacturas=new ReporteDinamicoJInternalFrame(DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetallesIngresosFacturas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetallesIngresosFacturas=new ImportacionJInternalFrame(DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetallesIngresosFacturas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetallesIngresosFacturas = new JButtonMe();
		
		this.jButtonAbrirOrderByDetallesIngresosFacturas.setText("Orden");
		this.jButtonAbrirOrderByDetallesIngresosFacturas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallesIngresosFacturas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallesIngresosFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallesIngresosFacturas,false,this);
			
			//this.cargarOrderByDetallesIngresosFacturas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallesIngresosFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallesIngresosFacturas,true,this);
			
			//this.cargarOrderByDetallesIngresosFacturas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetallesIngresosFacturas.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosDetallesIngresosFacturas.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosDetallesIngresosFacturas.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosDetallesIngresosFacturas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallesIngresosFacturas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallesIngresosFacturas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetallesIngresosFacturas.setText("Nuevo");
		this.jButtonDuplicarDetallesIngresosFacturas.setText("Duplicar");
		this.jButtonCopiarDetallesIngresosFacturas.setText("Copiar");
		this.jButtonVerFormDetallesIngresosFacturas.setText("Ver");
		this.jButtonNuevoRelacionesDetallesIngresosFacturas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.setText("Guardar");
		this.jButtonCerrarDetallesIngresosFacturas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallesIngresosFacturas,"nuevo_button","Nuevo",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetallesIngresosFacturas,"duplicar_button","Duplicar",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetallesIngresosFacturas,"copiar_button","Copiar",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetallesIngresosFacturas,"ver_form","Ver",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetallesIngresosFacturas,"nuevorelaciones_button","Nuevo Rel",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallesIngresosFacturas,"guardarcambiostabla_button","Guardar",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallesIngresosFacturas,"cerrar_button","Salir",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallesIngresosFacturas.setToolTipText("Nuevo"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetallesIngresosFacturas.setToolTipText("Duplicar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetallesIngresosFacturas.setToolTipText("Copiar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetallesIngresosFacturas.setToolTipText("Ver"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetallesIngresosFacturas.setToolTipText("Nuevo Rel"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.setToolTipText("Guardar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallesIngresosFacturas.setToolTipText("Salir"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallesIngresosFacturas";
		inputMap = this.jButtonNuevoDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallesIngresosFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallesIngresosFacturas"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetallesIngresosFacturas";
		inputMap = this.jButtonDuplicarDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetallesIngresosFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetallesIngresosFacturas"));
		
		//COPIAR
		sMapKey = "CopiarDetallesIngresosFacturas";
		inputMap = this.jButtonCopiarDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetallesIngresosFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetallesIngresosFacturas"));
		
		//VEr FORM
		sMapKey = "VerFormDetallesIngresosFacturas";
		inputMap = this.jButtonVerFormDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetallesIngresosFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetallesIngresosFacturas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetallesIngresosFacturas";
		inputMap = this.jButtonNuevoRelacionesDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetallesIngresosFacturas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetallesIngresosFacturas";
		inputMap = this.jButtonModificarDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetallesIngresosFacturas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetallesIngresosFacturas";
		inputMap = this.jButtonCerrarDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallesIngresosFacturas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallesIngresosFacturas";
		inputMap = this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallesIngresosFacturas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetallesIngresosFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetallesIngresosFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetallesIngresosFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetallesIngresosFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetallesIngresosFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetallesIngresosFacturas.setName("jPanelParametrosReportesDetallesIngresosFacturas"); 
		
		this.jPanelParametrosReportesAccionesDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetallesIngresosFacturas.setName("jPanelParametrosReportesAccionesDetallesIngresosFacturas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetallesIngresosFacturas = new JButtonMe();
		this.jButtonRecargarInformacionDetallesIngresosFacturas.setText("Buscar");
		this.jButtonRecargarInformacionDetallesIngresosFacturas.setToolTipText("Buscar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetallesIngresosFacturas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionDetallesIngresosFacturas.setVisible(false);
		
		
		this.jButtonProcesarInformacionDetallesIngresosFacturas = new JButtonMe();
		this.jButtonProcesarInformacionDetallesIngresosFacturas.setText("Procesar");
		this.jButtonProcesarInformacionDetallesIngresosFacturas.setToolTipText("Procesar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetallesIngresosFacturas.setVisible(false);
			
		this.jButtonProcesarInformacionDetallesIngresosFacturas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallesIngresosFacturas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallesIngresosFacturas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas.setText("TIPO");       
		this.jComboBoxTiposReportesDetallesIngresosFacturas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetallesIngresosFacturas.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetallesIngresosFacturas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetallesIngresosFacturas.setText("Accion");
		this.jComboBoxTiposRelacionesDetallesIngresosFacturas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallesIngresosFacturas.setText("Accion");
		this.jComboBoxTiposAccionesDetallesIngresosFacturas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.setText("Accion");
		this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetallesIngresosFacturas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetallesIngresosFacturas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallesIngresosFacturas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallesIngresosFacturas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetallesIngresosFacturas = new JLabelMe();
		
		this.jLabelAccionesDetallesIngresosFacturas.setText("Acciones");		
		this.jLabelAccionesDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetallesIngresosFacturas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetallesIngresosFacturas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetallesIngresosFacturas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetallesIngresosFacturas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetallesIngresosFacturas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetallesIngresosFacturas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetallesIngresosFacturas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetallesIngresosFacturas.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetallesIngresosFacturas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetallesIngresosFacturas = new JButtonMe();
		//this.jButtonAnterioresDetallesIngresosFacturas.setText("<<");
        this.jButtonAnterioresDetallesIngresosFacturas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetallesIngresosFacturas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetallesIngresosFacturas = new JButtonMe();
		//this.jButtonSiguientesDetallesIngresosFacturas.setText(">>");
        this.jButtonSiguientesDetallesIngresosFacturas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetallesIngresosFacturas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetallesIngresosFacturas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetallesIngresosFacturas.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetallesIngresosFacturas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetallesIngresosFacturas,"nuevoguardarcambios_button","Nue",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetallesIngresosFacturas";
		inputMap = this.jButtonNuevoGuardarCambiosDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetallesIngresosFacturas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetallesIngresosFacturas";
		inputMap = this.jButtonRecargarInformacionDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetallesIngresosFacturas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetallesIngresosFacturas";
		inputMap = this.jButtonSiguientesDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetallesIngresosFacturas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetallesIngresosFacturas";
		inputMap = this.jButtonAnterioresDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetallesIngresosFacturas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetallesIngresosFacturas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetallesIngresosFacturas.setMinimumSize(new Dimension(this.getWidth(),DetallesIngresosFacturasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallesIngresosFacturasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallesIngresosFacturas.setMaximumSize(new Dimension(this.getWidth(),DetallesIngresosFacturasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallesIngresosFacturasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallesIngresosFacturas.setPreferredSize(new Dimension(this.getWidth(),DetallesIngresosFacturasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallesIngresosFacturasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetallesIngresosFacturas = new GridBagLayout();

			this.jPanelPaginacionDetallesIngresosFacturas.setLayout(gridaBagLayoutPaginacionDetallesIngresosFacturas);						
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallesIngresosFacturas.add(this.jButtonAnterioresDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
					
						
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
			
			this.jPanelPaginacionDetallesIngresosFacturas.add(this.jButtonNuevoGuardarCambiosDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
						
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
			this.jPanelPaginacionDetallesIngresosFacturas.add(this.jButtonSiguientesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = 1;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallesIngresosFacturas.add(this.jButtonNuevoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
						
			
			
			if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
				this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetallesIngresosFacturas.gridy = 1;
				this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetallesIngresosFacturas.add(this.jButtonGuardarCambiosTablaDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			}
			
			
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = 1;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallesIngresosFacturas.add(this.jButtonDuplicarDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = 1;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallesIngresosFacturas.add(this.jButtonCopiarDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = 1;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallesIngresosFacturas.add(this.jButtonVerFormDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = 1;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetallesIngresosFacturas.add(this.jButtonCerrarDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
		
		
		this.jButtonRecargarInformacionDetallesIngresosFacturas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallesIngresosFacturas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallesIngresosFacturas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetallesIngresosFacturas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallesIngresosFacturas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallesIngresosFacturas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetallesIngresosFacturas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallesIngresosFacturas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallesIngresosFacturas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetallesIngresosFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallesIngresosFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallesIngresosFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetallesIngresosFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallesIngresosFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallesIngresosFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetallesIngresosFacturas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallesIngresosFacturas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallesIngresosFacturas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetallesIngresosFacturas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallesIngresosFacturas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallesIngresosFacturas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetallesIngresosFacturas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallesIngresosFacturas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallesIngresosFacturas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetallesIngresosFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetallesIngresosFacturas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetallesIngresosFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetallesIngresosFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetallesIngresosFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetallesIngresosFacturas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetallesIngresosFacturas.setLayout(gridaBagParametrosReportesDetallesIngresosFacturas);
			this.jPanelParametrosReportesAccionesDetallesIngresosFacturas.setLayout(gridaBagParametrosReportesAccionesDetallesIngresosFacturas);
			
			
			this.jPanelParametrosAuxiliar1DetallesIngresosFacturas.setLayout(gridaBagParametrosAuxiliar1DetallesIngresosFacturas);
			this.jPanelParametrosAuxiliar2DetallesIngresosFacturas.setLayout(gridaBagParametrosAuxiliar2DetallesIngresosFacturas);
			this.jPanelParametrosAuxiliar3DetallesIngresosFacturas.setLayout(gridaBagParametrosAuxiliar3DetallesIngresosFacturas);
			this.jPanelParametrosAuxiliar4DetallesIngresosFacturas.setLayout(gridaBagParametrosAuxiliar4DetallesIngresosFacturas);
			//this.jPanelParametrosAuxiliar5DetallesIngresosFacturas.setLayout(gridaBagParametrosAuxiliar2DetallesIngresosFacturas);			
			
			
			
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jButtonRecargarInformacionDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallesIngresosFacturas.add(this.jComboBoxTiposPaginacionDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallesIngresosFacturas.add(this.jCheckBoxConAltoMaximoTablaDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallesIngresosFacturas.add(this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jPanelParametrosAuxiliar1DetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetallesIngresosFacturas.add(this.jComboBoxTiposReportesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);																		
			
			
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetallesIngresosFacturas.add(this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jPanelParametrosAuxiliar4DetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jComboBoxTiposReportesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jCheckBoxGenerarReporteDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jPanelParametrosAuxiliar2DetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jLabelAccionesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
				this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jButtonAbrirOrderByDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jComboBoxTiposSeleccionarDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);			
			
			
			/*
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jCheckBoxConGraficoReporteDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallesIngresosFacturas.add(this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);															
				
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallesIngresosFacturas.add(this.jCheckBoxSeleccionadosDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);															
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallesIngresosFacturas.add(this.jCheckBoxConGraficoReporteDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jPanelParametrosAuxiliar3DetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallesIngresosFacturas.add(this.jComboBoxTiposAccionesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetallesIngresosFacturas = new GridBagLayout();

			this.jScrollPanelDatosDetallesIngresosFacturas.setLayout(gridaBagLayoutDatosDetallesIngresosFacturas);
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
			
			this.jScrollPanelDatosDetallesIngresosFacturas.add(this.jTableDatosDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetallesIngresosFacturas.setViewportView(this.jTableDatosDetallesIngresosFacturas);
		this.jTableDatosDetallesIngresosFacturas.setFillsViewportHeight(true);
		this.jTableDatosDetallesIngresosFacturas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetallesIngresosFacturas= new GridBagLayout();
		this.jPanelAccionesDetallesIngresosFacturas.setLayout(gridaBagLayoutAccionesDetallesIngresosFacturas);
		
		
		/*	
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
			
		this.jPanelAccionesDetallesIngresosFacturas.add(this.jButtonNuevoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaDetallesIngresosFacturasDetallesIngresosFacturas= new GridBagLayout();
		gridaBagLayoutBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setLayout(gridaBagLayoutBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);

		gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
		jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.add(jLabelid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas, gridBagConstraintsDetallesIngresosFacturas);

		gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
		jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.add(jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas, gridBagConstraintsDetallesIngresosFacturas);

		gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallesIngresosFacturas.gridy = 1;
		gridBagConstraintsDetallesIngresosFacturas.gridx =1;
		jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.add(jButtonBusquedaDetallesIngresosFacturasDetallesIngresosFacturas, gridBagConstraintsDetallesIngresosFacturas);

		jTabbedPaneBusquedasDetallesIngresosFacturas.addTab("1.-Por Ejercicio ", jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);
		jTabbedPaneBusquedasDetallesIngresosFacturas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallesIngresosFacturas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();						
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;		
			//this.gridBagConstraintsDetallesIngresosFacturas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;		
		//this.gridBagConstraintsDetallesIngresosFacturas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetallesIngresosFacturas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;		
			this.gridBagConstraintsDetallesIngresosFacturas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);								
		
		
		/*
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		*/		
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx =0;
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallesIngresosFacturas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
				
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetallesIngresosFacturasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetallesIngresosFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallesIngresosFacturas = new GridBagLayout();
			this.jPanelBusquedasParametrosDetallesIngresosFacturas.setLayout(gridaBagLayoutBusquedasParametrosDetallesIngresosFacturas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetallesIngresosFacturas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			
			
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
			
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetallesIngresosFacturas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetallesIngresosFacturas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetallesIngresosFacturas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetallesIngresosFacturas.setName("jPanelReporteDinamicoDetallesIngresosFacturas"); 
		
		this.jPanelReporteDinamicoDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetallesIngresosFacturas.setLayout(gridaBagLayoutReporteDinamicoDetallesIngresosFacturas);
		
		
		this.jInternalFrameReporteDinamicoDetallesIngresosFacturas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetallesIngresosFacturas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallesIngresosFacturas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalles Ingresos Facturases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetallesIngresosFacturas = new JLabelMe();

		this.jLabelColumnasSelectReporteDetallesIngresosFacturas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jLabelColumnasSelectReporteDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetallesIngresosFacturas = new JList<Reporte>();
		this.jListColumnasSelectReporteDetallesIngresosFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetallesIngresosFacturas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetallesIngresosFacturas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallesIngresosFacturas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallesIngresosFacturas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetallesIngresosFacturas=new JScrollPane(this.jListColumnasSelectReporteDetallesIngresosFacturas);
			
			this.jScrollColumnasSelectReporteDetallesIngresosFacturas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallesIngresosFacturas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallesIngresosFacturas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jListColumnasSelectReporteDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jScrollColumnasSelectReporteDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetallesIngresosFacturas = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetallesIngresosFacturas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetallesIngresosFacturas = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetallesIngresosFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetallesIngresosFacturas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetallesIngresosFacturas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallesIngresosFacturas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallesIngresosFacturas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetallesIngresosFacturas=new JScrollPane(this.jListRelacionesSelectReporteDetallesIngresosFacturas);
			
			this.jScrollRelacionesSelectReporteDetallesIngresosFacturas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallesIngresosFacturas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallesIngresosFacturas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetallesIngresosFacturas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetallesIngresosFacturas = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetallesIngresosFacturas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetallesIngresosFacturas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetallesIngresosFacturas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetallesIngresosFacturas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallesIngresosFacturas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallesIngresosFacturas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetallesIngresosFacturas = new JLabelMe();

		this.jLabelConGraficoDinamicoDetallesIngresosFacturas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jLabelConGraficoDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetallesIngresosFacturas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetallesIngresosFacturas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetallesIngresosFacturas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetallesIngresosFacturas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallesIngresosFacturas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallesIngresosFacturas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jCheckBoxConGraficoDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetallesIngresosFacturas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetallesIngresosFacturas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jLabelColumnaCategoriaGraficoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallesIngresosFacturas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetallesIngresosFacturas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetallesIngresosFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallesIngresosFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallesIngresosFacturas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jComboBoxColumnaCategoriaGraficoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetallesIngresosFacturas = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetallesIngresosFacturas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jLabelColumnaCategoriaValorDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetallesIngresosFacturas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetallesIngresosFacturas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetallesIngresosFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallesIngresosFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallesIngresosFacturas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jComboBoxColumnaCategoriaValorDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetallesIngresosFacturas = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetallesIngresosFacturas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jLabelColumnasValoresGraficoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetallesIngresosFacturas = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetallesIngresosFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetallesIngresosFacturas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetallesIngresosFacturas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallesIngresosFacturas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallesIngresosFacturas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetallesIngresosFacturas=new JScrollPane(this.jListColumnasValoresGraficoDetallesIngresosFacturas);
			
			this.jScrollColumnasValoresGraficoDetallesIngresosFacturas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallesIngresosFacturas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallesIngresosFacturas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jListColumnasSelectReporteDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jScrollColumnasValoresGraficoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetallesIngresosFacturas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetallesIngresosFacturas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jLabelTiposGraficosReportesDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallesIngresosFacturas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetallesIngresosFacturas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetallesIngresosFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallesIngresosFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallesIngresosFacturas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jComboBoxTiposGraficosReportesDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetallesIngresosFacturas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetallesIngresosFacturas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jLabelGenerarExcelReporteDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturas.setToolTipText("Generar EXCEL"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jComboBoxTiposReportesDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetallesIngresosFacturas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetallesIngresosFacturas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jLabelTiposArchivoReporteDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jComboBoxTiposArchivosReportesDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetallesIngresosFacturas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetallesIngresosFacturas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetallesIngresosFacturas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetallesIngresosFacturas.setToolTipText("Generar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jButtonGenerarReporteDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetallesIngresosFacturas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetallesIngresosFacturas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetallesIngresosFacturas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetallesIngresosFacturas.setToolTipText("Cancelar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallesIngresosFacturas.add(this.jButtonCerrarReporteDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetallesIngresosFacturas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetallesIngresosFacturas= new JScrollPane(jPanelReporteDinamicoDetallesIngresosFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalles Ingresos Facturases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetallesIngresosFacturas);
		this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getContentPane().add(this.jScrollPanelReporteDinamicoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetallesIngresosFacturas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetallesIngresosFacturas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetallesIngresosFacturas.setName("jPanelImportacionDetallesIngresosFacturas"); 
		
		this.jPanelImportacionDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetallesIngresosFacturas.setLayout(gridaBagLayoutImportacionDetallesIngresosFacturas);
		
		
		this.jInternalFrameImportacionDetallesIngresosFacturas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetallesIngresosFacturas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetallesIngresosFacturas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallesIngresosFacturas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetallesIngresosFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallesIngresosFacturas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallesIngresosFacturas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetallesIngresosFacturas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallesIngresosFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallesIngresosFacturas.setResizable(true);
	    this.jInternalFrameImportacionDetallesIngresosFacturas.setClosable(true);
	    this.jInternalFrameImportacionDetallesIngresosFacturas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetallesIngresosFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallesIngresosFacturas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallesIngresosFacturas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetallesIngresosFacturas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallesIngresosFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallesIngresosFacturas.setResizable(true);
	    this.jInternalFrameImportacionDetallesIngresosFacturas.setClosable(true);
	    this.jInternalFrameImportacionDetallesIngresosFacturas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalles Ingresos Facturases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetallesIngresosFacturas = new JLabelMe();

		this.jLabelArchivoImportacionDetallesIngresosFacturas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallesIngresosFacturas.add(this.jLabelArchivoImportacionDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetallesIngresosFacturas = new JFileChooser();		
		this.jFileChooserImportacionDetallesIngresosFacturas.setToolTipText("ESCOGER ARCHIVO"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetallesIngresosFacturas = new JButtonMe();
		this.jButtonAbrirImportacionDetallesIngresosFacturas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetallesIngresosFacturas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetallesIngresosFacturas.setToolTipText("Generar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallesIngresosFacturas.add(this.jButtonAbrirImportacionDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetallesIngresosFacturas = new JLabelMe();

		this.jLabelPathArchivoImportacionDetallesIngresosFacturas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallesIngresosFacturas.add(this.jLabelPathArchivoImportacionDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetallesIngresosFacturas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetallesIngresosFacturas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallesIngresosFacturas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallesIngresosFacturas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallesIngresosFacturas.add(this.jTextFieldPathArchivoImportacionDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetallesIngresosFacturas = new JButtonMe();
		this.jButtonGenerarImportacionDetallesIngresosFacturas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetallesIngresosFacturas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetallesIngresosFacturas.setToolTipText("Generar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallesIngresosFacturas.add(this.jButtonGenerarImportacionDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetallesIngresosFacturas = new JButtonMe();
		this.jButtonCerrarImportacionDetallesIngresosFacturas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetallesIngresosFacturas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetallesIngresosFacturas.setToolTipText("Cancelar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallesIngresosFacturas.add(this.jButtonCerrarImportacionDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetallesIngresosFacturas = new GridBagLayout();
		
		this.jScrollPanelImportacionDetallesIngresosFacturas= new JScrollPane(jPanelImportacionDetallesIngresosFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy =iPosYImportacion;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx =iPosXImportacion;
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetallesIngresosFacturas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetallesIngresosFacturas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetallesIngresosFacturas);
		this.jInternalFrameImportacionDetallesIngresosFacturas.getContentPane().add(this.jScrollPanelImportacionDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetallesIngresosFacturas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetallesIngresosFacturas = new JButtonMe();
			this.jButtonAbrirOrderByDetallesIngresosFacturas.setText("Orden");
			this.jButtonAbrirOrderByDetallesIngresosFacturas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallesIngresosFacturas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetallesIngresosFacturas";
			inputMap = this.jButtonAbrirOrderByDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetallesIngresosFacturas"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetallesIngresosFacturas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetallesIngresosFacturas.setName("jPanelOrderByDetallesIngresosFacturas"); 
			
			this.jPanelOrderByDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetallesIngresosFacturas.setLayout(gridaBagLayoutOrderByDetallesIngresosFacturas);
			
			
			this.jTableDatosDetallesIngresosFacturasOrderBy = new JTableMe();        
			this.jTableDatosDetallesIngresosFacturasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetallesIngresosFacturasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetallesIngresosFacturasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetallesIngresosFacturasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetallesIngresosFacturasOrderBy.setViewportView(this.jTableDatosDetallesIngresosFacturasOrderBy);
			this.jTableDatosDetallesIngresosFacturasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetallesIngresosFacturasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetallesIngresosFacturas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetallesIngresosFacturas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetallesIngresosFacturas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetallesIngresosFacturas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetallesIngresosFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetallesIngresosFacturas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetallesIngresosFacturas.setTitle("Orden");
			this.jInternalFrameOrderByDetallesIngresosFacturas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetallesIngresosFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetallesIngresosFacturas.setResizable(true);
			this.jInternalFrameOrderByDetallesIngresosFacturas.setClosable(true);
			this.jInternalFrameOrderByDetallesIngresosFacturas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalles Ingresos Facturases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetallesIngresosFacturas.ipady =150;
				
			this.jPanelOrderByDetallesIngresosFacturas.add(jScrollPanelDatosDetallesIngresosFacturasOrderBy, this.gridBagConstraintsDetallesIngresosFacturas);//this.jTableDatosDetallesIngresosFacturasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetallesIngresosFacturas = new JButtonMe();
			this.jButtonCerrarOrderByDetallesIngresosFacturas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetallesIngresosFacturas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetallesIngresosFacturas.setToolTipText("Cancelar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetallesIngresosFacturas.add(this.jButtonCerrarOrderByDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetallesIngresosFacturas = new GridBagLayout();
			
			this.jScrollPanelOrderByDetallesIngresosFacturas= new JScrollPane(jPanelOrderByDetallesIngresosFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetallesIngresosFacturas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetallesIngresosFacturas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetallesIngresosFacturas);
			
			this.jInternalFrameOrderByDetallesIngresosFacturas.getContentPane().add(this.jScrollPanelOrderByDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);			
		
		} else {
			this.jButtonAbrirOrderByDetallesIngresosFacturas = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.detallesingresosfacturasSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosDetallesIngresosFacturas.getRowHeight();//DetallesIngresosFacturasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetallesIngresosFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallesIngresosFacturas.isSelected()) {
					iHeightTable=DetallesIngresosFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallesIngresosFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallesIngresosFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetallesIngresosFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallesIngresosFacturas.isSelected()) {
					iHeightTable=DetallesIngresosFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallesIngresosFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallesIngresosFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetallesIngresosFacturas!=null && this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy()!=null) {
			//if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetallesIngresosFacturas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetallesIngresosFacturas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetallesIngresosFacturas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=detallesingresosfacturasLogic.getDetallesIngresosFacturass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallesingresosfacturass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetallesIngresosFacturas> TraerDetallesIngresosFacturasBeans(List<DetallesIngresosFacturas> detallesingresosfacturass,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturass) {
					
				if(!(DetallesIngresosFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetallesIngresosFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallesingresosfacturas.setsDetalleGeneralEntityReporte(DetallesIngresosFacturasConstantesFunciones.getDetallesIngresosFacturasDescripcion(detallesingresosfacturas));
										
						
					
						
					
				} else  {
							
					//detallesingresosfacturas.setsDetalleGeneralEntityReporte(detallesingresosfacturas.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallesingresosfacturasbeans.add(detallesingresosfacturasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallesingresosfacturass;
    }
	//PARA REPORTES FIN
}
