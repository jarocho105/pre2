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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.PresupuestoProductoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class PresupuestoProductoJInternalFrame extends PresupuestoProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresupuestoProducto;
	
	protected JMenuBar jmenuBarPresupuestoProducto;
	
	protected JMenu jmenuPresupuestoProducto;
	protected JMenu jmenuDatosPresupuestoProducto;
	protected JMenu jmenuArchivoPresupuestoProducto;
	protected JMenu jmenuAccionesPresupuestoProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoProducto;	
	protected GridBagConstraints gridBagConstraintsPresupuestoProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresupuestoProductoDetalleFormJInternalFrame jInternalFrameDetalleFormPresupuestoProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresupuestoProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresupuestoProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public PresupuestoProductoSessionBean presupuestoproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresupuestoProducto> presupuestoproductos;		
	public List<PresupuestoProducto> presupuestoproductosEliminados;	
	public List<PresupuestoProducto> presupuestoproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresupuestoProducto;		
	protected JButton jButtonAbrirOrderByPresupuestoProducto;
	
	
	//protected JPanel jPanelOrderByPresupuestoProducto;
	//public JScrollPane jScrollPanelOrderByPresupuestoProducto;	
	//protected JButton jButtonCerrarOrderByPresupuestoProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresupuestoProductoLogic presupuestoproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresupuestoProducto;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoProducto;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosPresupuestoProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresupuestoProducto;
	//public JScrollPane jScrollPanelImportacionPresupuestoProducto;
	
	
	
	protected JPanel jPanelAccionesPresupuestoProducto;
	
    protected JPanel jPanelPaginacionPresupuestoProducto;
    protected JPanel jPanelParametrosReportesPresupuestoProducto;
	protected JPanel jPanelParametrosReportesAccionesPresupuestoProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresupuestoProducto;
	protected JPanel jPanelParametrosAuxiliar2PresupuestoProducto;
	protected JPanel jPanelParametrosAuxiliar3PresupuestoProducto;
	protected JPanel jPanelParametrosAuxiliar4PresupuestoProducto;
	//protected JPanel jPanelParametrosAuxiliar5PresupuestoProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresupuestoProducto;
	//protected JPanel jPanelImportacionPresupuestoProducto;
	
	
	public JTable jTableDatosPresupuestoProducto;
	
	
	
	//public JTable jTableDatosPresupuestoProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresupuestoProducto;
	protected JButton jButtonDuplicarPresupuestoProducto;
	protected JButton jButtonCopiarPresupuestoProducto;
	protected JButton jButtonVerFormPresupuestoProducto;
	protected JButton jButtonNuevoRelacionesPresupuestoProducto;
	protected JButton jButtonModificarPresupuestoProducto;
	
    protected JButton jButtonGuardarCambiosTablaPresupuestoProducto;
	protected JButton jButtonCerrarPresupuestoProducto;
	
	
	protected JButton jButtonRecargarInformacionPresupuestoProducto;
	protected JButton jButtonProcesarInformacionPresupuestoProducto;
	
	
	protected JButton jButtonAnterioresPresupuestoProducto;
	protected JButton jButtonSiguientesPresupuestoProducto;
	protected JButton jButtonNuevoGuardarCambiosPresupuestoProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresupuestoProducto;
	//protected JButton jButtonCerrarReporteDinamicoPresupuestoProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresupuestoProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresupuestoProducto;
	//protected JButton jButtonGenerarImportacionPresupuestoProducto;
	//protected JButton jButtonCerrarImportacionPresupuestoProducto;
	//protected JFileChooser jFileChooserImportacionPresupuestoProducto;
	//protected File fileImportacionPresupuestoProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoProducto;
	protected JButton jButtonDuplicarToolBarPresupuestoProducto;
	protected JButton jButtonNuevoRelacionesToolBarPresupuestoProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarPresupuestoProducto;
	protected JButton jButtonCopiarToolBarPresupuestoProducto;
	protected JButton jButtonVerFormToolBarPresupuestoProducto;
	public JButton jButtonGuardarCambiosTablaToolBarPresupuestoProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoProducto;
	protected JButton jButtonCerrarToolBarPresupuestoProducto;
	
	protected JButton jButtonRecargarInformacionToolBarPresupuestoProducto;
	protected JButton jButtonProcesarInformacionToolBarPresupuestoProducto;
	protected JButton jButtonAnterioresToolBarPresupuestoProducto;
	protected JButton jButtonSiguientesToolBarPresupuestoProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresupuestoProducto;
	protected JButton jButtonAbrirOrderByToolBarPresupuestoProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoProducto;
	protected JMenuItem jMenuItemDuplicarPresupuestoProducto;
	protected JMenuItem jMenuItemNuevoRelacionesPresupuestoProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresupuestoProducto;
	protected JMenuItem jMenuItemCopiarPresupuestoProducto;
	protected JMenuItem jMenuItemVerFormPresupuestoProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoProducto;
	protected JMenuItem jMenuItemCerrarPresupuestoProducto;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresupuestoProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionPresupuestoProducto;
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoProducto;
	protected JMenuItem jMenuItemAnterioresPresupuestoProducto;
	protected JMenuItem jMenuItemSiguientesPresupuestoProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoProducto;
	protected JMenuItem jMenuItemAbrirOrderByPresupuestoProducto;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresupuestoProducto;
	protected JCheckBox jCheckBoxSeleccionadosPresupuestoProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresupuestoProducto;
	protected JCheckBox jCheckBoxConGraficoReportePresupuestoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresupuestoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresupuestoProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresupuestoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresupuestoProducto;
	protected JTextField jTextFieldValorCampoGeneralPresupuestoProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresupuestoProducto;
	//public JList<Reporte> jListColumnasSelectReportePresupuestoProducto;
	//public JScrollPane jScrollColumnasSelectReportePresupuestoProducto;
	
	//public JLabel jLabelRelacionesSelectReportePresupuestoProducto;
	//public JList<Reporte> jListRelacionesSelectReportePresupuestoProducto;
	//public JScrollPane jScrollRelacionesSelectReportePresupuestoProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresupuestoProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresupuestoProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresupuestoProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresupuestoProducto;
	
		
	//public JLabel jLabelArchivoImportacionPresupuestoProducto;	
	//public JLabel jLabelPathArchivoImportacionPresupuestoProducto;
	//protected JTextField jTextFieldPathArchivoImportacionPresupuestoProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresupuestoProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresupuestoProducto;
	
	//public JLabel jLabelColumnaCategoriaValorPresupuestoProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresupuestoProducto;
	
	//public JLabel jLabelColumnasValoresGraficoPresupuestoProducto;
	//public JList<Reporte> jListColumnasValoresGraficoPresupuestoProducto;
	//public JScrollPane jScrollColumnasValoresGraficoPresupuestoProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresupuestoProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresupuestoProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresupuestoProducto;
	public JPanel jPanelFK_IdBodegaPresupuestoProducto;
	public JButton jButtonFK_IdBodegaPresupuestoProducto;
	public JPanel jPanelFK_IdCuentaContablePresupuestoProducto;
	public JButton jButtonFK_IdCuentaContablePresupuestoProducto;
	public JPanel jPanelFK_IdProductoPresupuestoProducto;
	public JButton jButtonFK_IdProductoPresupuestoProducto;
	
	public JPanel jPanelid_bodegaFK_IdBodegaPresupuestoProducto;
	public JLabel jLabelid_bodegaFK_IdBodegaPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto;
	public JButton jButtonid_bodegaFK_IdBodegaPresupuestoProducto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaPresupuestoProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaPresupuestoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContablePresupuestoProducto;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoPresupuestoProducto;
	public JLabel jLabelid_productoFK_IdProductoPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoPresupuestoProducto;
	public JButton jButtonid_productoFK_IdProductoPresupuestoProducto= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPresupuestoProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPresupuestoProductoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoPresupuestoProducto;
	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PresupuestoProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresupuestoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresupuestoProducto)	{
		this.jButtonRecargarInformacionPresupuestoProducto = jButtonRecargarInformacionPresupuestoProducto;
	}
	
	public JButton getjButtonProcesarInformacionPresupuestoProducto() {
		return this.jButtonProcesarInformacionPresupuestoProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoProducto)	{
		this.jButtonProcesarInformacionPresupuestoProducto = jButtonProcesarInformacionPresupuestoProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionPresupuestoProducto() {
		return this.jButtonRecargarInformacionPresupuestoProducto;
	}
	
	
	public List<PresupuestoProducto> getpresupuestoproductos() {
		return this.presupuestoproductos;
	}

	public void setpresupuestoproductos(List<PresupuestoProducto> presupuestoproductos) {
		this.presupuestoproductos = presupuestoproductos;
	}
	
	public List<PresupuestoProducto> getpresupuestoproductosAux() {
		return this.presupuestoproductosAux;
	}

	public void setpresupuestoproductosAux(List<PresupuestoProducto> presupuestoproductosAux) {
		this.presupuestoproductosAux = presupuestoproductosAux;
	}
	
	public List<PresupuestoProducto> getpresupuestoproductosEliminados() {
		return this.presupuestoproductosEliminados;
	}

	public void setPresupuestoProductosEliminados(List<PresupuestoProducto> presupuestoproductosEliminados) {
		this.presupuestoproductosEliminados = presupuestoproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresupuestoProducto() {
		return jComboBoxTiposSeleccionarPresupuestoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresupuestoProducto(
			JComboBox jComboBoxTiposSeleccionarPresupuestoProducto) {
		this.jComboBoxTiposSeleccionarPresupuestoProducto = jComboBoxTiposSeleccionarPresupuestoProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarPresupuestoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresupuestoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresupuestoProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresupuestoProducto() {
		return jTextFieldValorCampoGeneralPresupuestoProducto;
	}

	public void setjTextFieldValorCampoGeneralPresupuestoProducto(
			JTextField jTextFieldValorCampoGeneralPresupuestoProducto) {
		this.jTextFieldValorCampoGeneralPresupuestoProducto = jTextFieldValorCampoGeneralPresupuestoProducto;
	}

	public void setBorderResaltarValorCampoGeneralPresupuestoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresupuestoProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresupuestoProducto() {
		return this.jCheckBoxSeleccionarTodosPresupuestoProducto;
	}

	public void setjCheckBoxSeleccionarTodosPresupuestoProducto(
			JCheckBox jCheckBoxSeleccionarTodosPresupuestoProducto) {
		this.jCheckBoxSeleccionarTodosPresupuestoProducto = jCheckBoxSeleccionarTodosPresupuestoProducto;
	}

	public void setBorderResaltarSeleccionarTodosPresupuestoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresupuestoProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresupuestoProducto() {
		return this.jCheckBoxSeleccionadosPresupuestoProducto;
	}

	public void setjCheckBoxSeleccionadosPresupuestoProducto(
			JCheckBox jCheckBoxSeleccionadosPresupuestoProducto) {
		this.jCheckBoxSeleccionadosPresupuestoProducto = jCheckBoxSeleccionadosPresupuestoProducto;
	}
	
	public void setBorderResaltarSeleccionadosPresupuestoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresupuestoProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresupuestoProducto() {
		return this.jComboBoxTiposArchivosReportesPresupuestoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresupuestoProducto(
			JComboBox jComboBoxTiposArchivosReportesPresupuestoProducto) {
		this.jComboBoxTiposArchivosReportesPresupuestoProducto = jComboBoxTiposArchivosReportesPresupuestoProducto;
	}

	public void setBorderResaltarTiposArchivosReportesPresupuestoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresupuestoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresupuestoProducto() {
		return this.jComboBoxTiposReportesPresupuestoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresupuestoProducto(
			JComboBox jComboBoxTiposReportesPresupuestoProducto) {
		this.jComboBoxTiposReportesPresupuestoProducto = jComboBoxTiposReportesPresupuestoProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresupuestoProducto() {
	//	return jComboBoxTiposReportesDinamicoPresupuestoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresupuestoProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoPresupuestoProducto) {
	//	this.jComboBoxTiposReportesDinamicoPresupuestoProducto = jComboBoxTiposReportesDinamicoPresupuestoProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresupuestoProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresupuestoProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto = jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto;
	//}
	
	public void setBorderResaltarTiposReportesPresupuestoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresupuestoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresupuestoProducto() {
		return this.jComboBoxTiposGraficosReportesPresupuestoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresupuestoProducto(
			JComboBox jComboBoxTiposGraficosReportesPresupuestoProducto) {
		this.jComboBoxTiposGraficosReportesPresupuestoProducto = jComboBoxTiposGraficosReportesPresupuestoProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresupuestoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresupuestoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresupuestoProducto() {
		return this.jComboBoxTiposPaginacionPresupuestoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresupuestoProducto(
			JComboBox jComboBoxTiposPaginacionPresupuestoProducto) {
		this.jComboBoxTiposPaginacionPresupuestoProducto = jComboBoxTiposPaginacionPresupuestoProducto;
	}
	
	public void setBorderResaltarTiposPaginacionPresupuestoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresupuestoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresupuestoProducto() {
		return this.jComboBoxTiposRelacionesPresupuestoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoProducto() {
		return this.jComboBoxTiposAccionesPresupuestoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoProducto(
			JComboBox jComboBoxTiposRelacionesPresupuestoProducto) {
		this.jComboBoxTiposRelacionesPresupuestoProducto = jComboBoxTiposRelacionesPresupuestoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoProducto(
			JComboBox jComboBoxTiposAccionesPresupuestoProducto) {
		this.jComboBoxTiposAccionesPresupuestoProducto = jComboBoxTiposAccionesPresupuestoProducto;
	}
	
	public void setBorderResaltarTiposRelacionesPresupuestoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresupuestoProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresupuestoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresupuestoProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresupuestoProducto() {
	//	return jCheckBoxConGraficoDinamicoPresupuestoProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresupuestoProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresupuestoProducto) {
	//	this.jCheckBoxConGraficoDinamicoPresupuestoProducto = jCheckBoxConGraficoDinamicoPresupuestoProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresupuestoProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresupuestoProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresupuestoProducto .setBorder(borderResaltar);		
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
		this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
		
		this.presupuestoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresupuestoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresupuestoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Producto MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		PresupuestoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresupuestoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresupuestoProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"nuevo","nuevo","Nuevo"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"duplicar","duplicar","Duplicar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"copiar","copiar","Copiar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"ver_form","ver_form","Ver"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"recargar","recargar","Recargar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresupuestoProducto,this.jTtoolBarPresupuestoProducto,
							"cerrar","cerrar","Salir"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresupuestoProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresupuestoProducto;
			
				this.jButtonProcesarInformacionToolBarPresupuestoProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresupuestoProducto;
				
		//protected JButton jButtonModificarToolBarPresupuestoProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresupuestoProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresupuestoProducto=new JMenuMe("General");
		this.jmenuArchivoPresupuestoProducto=new JMenuMe("Archivo");
		this.jmenuAccionesPresupuestoProducto=new JMenuMe("Acciones");
		this.jmenuDatosPresupuestoProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresupuestoProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresupuestoProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresupuestoProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresupuestoProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresupuestoProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresupuestoProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresupuestoProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresupuestoProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresupuestoProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresupuestoProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresupuestoProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresupuestoProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresupuestoProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresupuestoProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresupuestoProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresupuestoProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresupuestoProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresupuestoProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresupuestoProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresupuestoProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresupuestoProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresupuestoProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresupuestoProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresupuestoProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresupuestoProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresupuestoProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresupuestoProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresupuestoProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresupuestoProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresupuestoProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresupuestoProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresupuestoProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresupuestoProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresupuestoProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresupuestoProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresupuestoProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresupuestoProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresupuestoProducto.add(this.jMenuItemCerrarPresupuestoProducto);
			
			this.jmenuAccionesPresupuestoProducto.add(this.jMenuItemNuevoPresupuestoProducto);
			this.jmenuAccionesPresupuestoProducto.add(this.jMenuItemNuevoGuardarCambiosPresupuestoProducto);
			this.jmenuAccionesPresupuestoProducto.add(this.jMenuItemNuevoRelacionesPresupuestoProducto);
			this.jmenuAccionesPresupuestoProducto.add(this.jMenuItemGuardarCambiosTablaPresupuestoProducto);		
			this.jmenuAccionesPresupuestoProducto.add(this.jMenuItemDuplicarPresupuestoProducto);		
			this.jmenuAccionesPresupuestoProducto.add(this.jMenuItemCopiarPresupuestoProducto);		
			this.jmenuAccionesPresupuestoProducto.add(this.jMenuItemVerFormPresupuestoProducto);		
			
			this.jmenuDatosPresupuestoProducto.add(this.jMenuItemRecargarInformacionPresupuestoProducto);				
			this.jmenuDatosPresupuestoProducto.add(this.jMenuItemAnterioresPresupuestoProducto);				
			this.jmenuDatosPresupuestoProducto.add(this.jMenuItemSiguientesPresupuestoProducto);				
			this.jmenuDatosPresupuestoProducto.add(this.jMenuItemAbrirOrderByPresupuestoProducto);				
			this.jmenuDatosPresupuestoProducto.add(this.jMenuItemMostrarOcultarPresupuestoProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresupuestoProducto.add(this.jMenuItemGuardarCambiosPresupuestoProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresupuestoProducto.add(this.jmenuArchivoPresupuestoProducto);		
			this.jmenuBarPresupuestoProducto.add(this.jmenuAccionesPresupuestoProducto);		
			this.jmenuBarPresupuestoProducto.add(this.jmenuDatosPresupuestoProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresupuestoProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresupuestoProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaPresupuestoProducto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaPresupuestoProducto= new JButtonMe();
		this.jButtonFK_IdBodegaPresupuestoProducto.setText("Buscar");
		this.jButtonFK_IdBodegaPresupuestoProducto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaPresupuestoProducto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaPresupuestoProducto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaPresupuestoProducto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaPresupuestoProducto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContablePresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContablePresupuestoProducto.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContablePresupuestoProducto= new JButtonMe();
		this.jButtonFK_IdCuentaContablePresupuestoProducto.setText("Buscar");
		this.jButtonFK_IdCuentaContablePresupuestoProducto.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContablePresupuestoProducto,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContablePresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoProducto = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoPresupuestoProducto.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoPresupuestoProducto= new JButtonMe();
		this.jButtonFK_IdProductoPresupuestoProducto.setText("Buscar");
		this.jButtonFK_IdProductoPresupuestoProducto.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoPresupuestoProducto,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoPresupuestoProducto = new JLabelMe();
		jLabelid_productoFK_IdProductoPresupuestoProducto.setText("Producto :");
		jLabelid_productoFK_IdProductoPresupuestoProducto.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoPresupuestoProducto= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoPresupuestoProducto= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoPresupuestoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPresupuestoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPresupuestoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoPresupuestoProducto.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPresupuestoProducto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPresupuestoProducto.setFocusable(false);


		this.jTabbedPaneBusquedasPresupuestoProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasPresupuestoProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresupuestoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresupuestoProducto = new PresupuestoProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Presupuesto Producto DATOS");
			this.jInternalFrameDetalleFormPresupuestoProducto = new PresupuestoProductoDetalleFormJInternalFrame(jDesktopPane,this.presupuestoproductoSessionBean.getConGuardarRelaciones(),this.presupuestoproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresupuestoProducto = null;//new PresupuestoProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoProducto= new GridBagLayout();
		
		
		this.jTableDatosPresupuestoProducto = new JTableMe();      
		
		String sToolTipPresupuestoProducto="";
		sToolTipPresupuestoProducto=PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoProducto+="(Inventario.PresupuestoProducto)";
		}
		
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresupuestoProducto.setToolTipText(sToolTipPresupuestoProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresupuestoProducto);
		this.jTableDatosPresupuestoProducto.setAutoCreateRowSorter(true);
		this.jTableDatosPresupuestoProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresupuestoProducto.setRowSelectionAllowed(true);
		this.jTableDatosPresupuestoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresupuestoProducto = new JButtonMe();
		this.jButtonDuplicarPresupuestoProducto = new JButtonMe();
		this.jButtonCopiarPresupuestoProducto = new JButtonMe();
		this.jButtonVerFormPresupuestoProducto = new JButtonMe();
		this.jButtonNuevoRelacionesPresupuestoProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresupuestoProducto = new JButtonMe();
		this.jButtonCerrarPresupuestoProducto = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresupuestoProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Producto";
		
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoProducto.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresupuestoProducto=new ReporteDinamicoJInternalFrame(PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresupuestoProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresupuestoProducto=new ImportacionJInternalFrame(PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresupuestoProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresupuestoProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByPresupuestoProducto.setText("Orden");
		this.jButtonAbrirOrderByPresupuestoProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoProducto,false,this);
			
			//this.cargarOrderByPresupuestoProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoProducto,true,this);
			
			//this.cargarOrderByPresupuestoProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresupuestoProducto.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosPresupuestoProducto.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosPresupuestoProducto.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosPresupuestoProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresupuestoProducto.setText("Nuevo");
		this.jButtonDuplicarPresupuestoProducto.setText("Duplicar");
		this.jButtonCopiarPresupuestoProducto.setText("Copiar");
		this.jButtonVerFormPresupuestoProducto.setText("Ver");
		this.jButtonNuevoRelacionesPresupuestoProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresupuestoProducto.setText("Guardar");
		this.jButtonCerrarPresupuestoProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoProducto,"nuevo_button","Nuevo",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresupuestoProducto,"duplicar_button","Duplicar",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresupuestoProducto,"copiar_button","Copiar",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresupuestoProducto,"ver_form","Ver",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresupuestoProducto,"nuevorelaciones_button","Nuevo Rel",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoProducto,"guardarcambiostabla_button","Guardar",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoProducto,"cerrar_button","Salir",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresupuestoProducto.setToolTipText("Nuevo"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresupuestoProducto.setToolTipText("Duplicar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresupuestoProducto.setToolTipText("Copiar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresupuestoProducto.setToolTipText("Ver"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresupuestoProducto.setToolTipText("Nuevo Rel"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresupuestoProducto.setToolTipText("Guardar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoProducto.setToolTipText("Salir"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoProducto";
		inputMap = this.jButtonNuevoPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresupuestoProducto";
		inputMap = this.jButtonDuplicarPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresupuestoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresupuestoProducto"));
		
		//COPIAR
		sMapKey = "CopiarPresupuestoProducto";
		inputMap = this.jButtonCopiarPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresupuestoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresupuestoProducto"));
		
		//VEr FORM
		sMapKey = "VerFormPresupuestoProducto";
		inputMap = this.jButtonVerFormPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresupuestoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresupuestoProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresupuestoProducto";
		inputMap = this.jButtonNuevoRelacionesPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresupuestoProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresupuestoProducto";
		inputMap = this.jButtonModificarPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresupuestoProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoProducto";
		inputMap = this.jButtonCerrarPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoProducto";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresupuestoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresupuestoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresupuestoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresupuestoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresupuestoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresupuestoProducto.setName("jPanelParametrosReportesPresupuestoProducto"); 
		
		this.jPanelParametrosReportesAccionesPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresupuestoProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresupuestoProducto.setName("jPanelParametrosReportesAccionesPresupuestoProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresupuestoProducto = new JButtonMe();
		this.jButtonRecargarInformacionPresupuestoProducto.setText("Recargar");
		this.jButtonRecargarInformacionPresupuestoProducto.setToolTipText("Recargar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresupuestoProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresupuestoProducto = new JButtonMe();
		this.jButtonProcesarInformacionPresupuestoProducto.setText("Procesar");
		this.jButtonProcesarInformacionPresupuestoProducto.setToolTipText("Procesar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresupuestoProducto.setVisible(false);
			
		this.jButtonProcesarInformacionPresupuestoProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresupuestoProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoProducto.setText("TIPO");       
		this.jComboBoxTiposReportesPresupuestoProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresupuestoProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresupuestoProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresupuestoProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresupuestoProducto.setText("Accion");
		this.jComboBoxTiposRelacionesPresupuestoProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoProducto.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresupuestoProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarPresupuestoProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresupuestoProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresupuestoProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresupuestoProducto = new JLabelMe();
		
		this.jLabelAccionesPresupuestoProducto.setText("Acciones");		
		this.jLabelAccionesPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresupuestoProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresupuestoProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresupuestoProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresupuestoProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresupuestoProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresupuestoProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresupuestoProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresupuestoProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresupuestoProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresupuestoProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresupuestoProducto.setText("Graf.");
		this.jCheckBoxConGraficoReportePresupuestoProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresupuestoProducto = new JButtonMe();
		//this.jButtonAnterioresPresupuestoProducto.setText("<<");
        this.jButtonAnterioresPresupuestoProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresupuestoProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresupuestoProducto = new JButtonMe();
		//this.jButtonSiguientesPresupuestoProducto.setText(">>");
        this.jButtonSiguientesPresupuestoProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresupuestoProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresupuestoProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresupuestoProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresupuestoProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresupuestoProducto,"nuevoguardarcambios_button","Nue",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresupuestoProducto";
		inputMap = this.jButtonNuevoGuardarCambiosPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresupuestoProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresupuestoProducto";
		inputMap = this.jButtonRecargarInformacionPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresupuestoProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresupuestoProducto";
		inputMap = this.jButtonSiguientesPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresupuestoProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresupuestoProducto";
		inputMap = this.jButtonAnterioresPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresupuestoProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresupuestoProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresupuestoProducto.setMinimumSize(new Dimension(this.getWidth(),PresupuestoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoProducto.setMaximumSize(new Dimension(this.getWidth(),PresupuestoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoProducto.setPreferredSize(new Dimension(this.getWidth(),PresupuestoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresupuestoProducto = new GridBagLayout();

			this.jPanelPaginacionPresupuestoProducto.setLayout(gridaBagLayoutPaginacionPresupuestoProducto);						
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = 0;
			this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresupuestoProducto.add(this.jButtonAnterioresPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
					
						
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoProducto.gridy = 0;
			
			this.jPanelPaginacionPresupuestoProducto.add(this.jButtonNuevoGuardarCambiosPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
						
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoProducto.gridy = 0;
			this.jPanelPaginacionPresupuestoProducto.add(this.jButtonSiguientesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = 1;
			this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoProducto.add(this.jButtonNuevoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
						
			
			
			if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresupuestoProducto.gridy = 1;
				this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresupuestoProducto.add(this.jButtonGuardarCambiosTablaPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			}
			
			
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = 1;
			this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoProducto.add(this.jButtonDuplicarPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = 1;
			this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoProducto.add(this.jButtonCopiarPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = 1;
			this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoProducto.add(this.jButtonVerFormPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = 1;
			this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresupuestoProducto.add(this.jButtonCerrarPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
		
		
		this.jButtonRecargarInformacionPresupuestoProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresupuestoProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresupuestoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresupuestoProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresupuestoProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresupuestoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresupuestoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresupuestoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresupuestoProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresupuestoProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresupuestoProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresupuestoProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresupuestoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresupuestoProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresupuestoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresupuestoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresupuestoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresupuestoProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresupuestoProducto.setLayout(gridaBagParametrosReportesPresupuestoProducto);
			this.jPanelParametrosReportesAccionesPresupuestoProducto.setLayout(gridaBagParametrosReportesAccionesPresupuestoProducto);
			
			
			this.jPanelParametrosAuxiliar1PresupuestoProducto.setLayout(gridaBagParametrosAuxiliar1PresupuestoProducto);
			this.jPanelParametrosAuxiliar2PresupuestoProducto.setLayout(gridaBagParametrosAuxiliar2PresupuestoProducto);
			this.jPanelParametrosAuxiliar3PresupuestoProducto.setLayout(gridaBagParametrosAuxiliar3PresupuestoProducto);
			this.jPanelParametrosAuxiliar4PresupuestoProducto.setLayout(gridaBagParametrosAuxiliar4PresupuestoProducto);
			//this.jPanelParametrosAuxiliar5PresupuestoProducto.setLayout(gridaBagParametrosAuxiliar2PresupuestoProducto);			
			
			
			
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jButtonRecargarInformacionPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoProducto.add(this.jComboBoxTiposPaginacionPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoProducto.add(this.jCheckBoxConAltoMaximoTablaPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoProducto.add(this.jComboBoxTiposArchivosReportesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jPanelParametrosAuxiliar1PresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresupuestoProducto.add(this.jComboBoxTiposReportesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);																		
			
			
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresupuestoProducto.add(this.jComboBoxTiposGraficosReportesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jPanelParametrosAuxiliar4PresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jComboBoxTiposReportesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jCheckBoxGenerarReportePresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jPanelParametrosAuxiliar2PresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jLabelAccionesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresupuestoProducto.add(this.jButtonAbrirOrderByPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jComboBoxTiposSeleccionarPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);			
			
			
			/*
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jCheckBoxSeleccionarTodosPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jCheckBoxConGraficoReportePresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoProducto.add(this.jCheckBoxSeleccionarTodosPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);															
				
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoProducto.add(this.jCheckBoxSeleccionadosPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);															
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoProducto.add(this.jCheckBoxConGraficoReportePresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jPanelParametrosAuxiliar3PresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jComboBoxTiposAccionesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
	
				
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoProducto.add(this.jTextFieldValorCampoGeneralPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresupuestoProducto = new GridBagLayout();

			this.jScrollPanelDatosPresupuestoProducto.setLayout(gridaBagLayoutDatosPresupuestoProducto);
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = 0;
			this.gridBagConstraintsPresupuestoProducto.gridx = 0;
			
			this.jScrollPanelDatosPresupuestoProducto.add(this.jTableDatosPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresupuestoProducto.setViewportView(this.jTableDatosPresupuestoProducto);
		this.jTableDatosPresupuestoProducto.setFillsViewportHeight(true);
		this.jTableDatosPresupuestoProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoProducto= new GridBagLayout();
		this.jPanelAccionesPresupuestoProducto.setLayout(gridaBagLayoutAccionesPresupuestoProducto);
		
		
		/*	
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 0;
			
		this.jPanelAccionesPresupuestoProducto.add(this.jButtonNuevoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaPresupuestoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaPresupuestoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaPresupuestoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaPresupuestoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaPresupuestoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaPresupuestoProducto.setLayout(gridaBagLayoutFK_IdBodegaPresupuestoProducto);

		gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoProducto.gridy = 0;
		gridBagConstraintsPresupuestoProducto.gridx = 0;
		jPanelFK_IdBodegaPresupuestoProducto.add(jLabelid_bodegaFK_IdBodegaPresupuestoProducto, gridBagConstraintsPresupuestoProducto);

		gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoProducto.gridy = 0;
		gridBagConstraintsPresupuestoProducto.gridx = 1;
		jPanelFK_IdBodegaPresupuestoProducto.add(jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto, gridBagConstraintsPresupuestoProducto);

		gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoProducto.gridy = 1;
		gridBagConstraintsPresupuestoProducto.gridx =1;
		jPanelFK_IdBodegaPresupuestoProducto.add(jButtonFK_IdBodegaPresupuestoProducto, gridBagConstraintsPresupuestoProducto);

		jTabbedPaneBusquedasPresupuestoProducto.addTab("1.-Por Bodega ", jPanelFK_IdBodegaPresupuestoProducto);
		jTabbedPaneBusquedasPresupuestoProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContablePresupuestoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContablePresupuestoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContablePresupuestoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContablePresupuestoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContablePresupuestoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContablePresupuestoProducto.setLayout(gridaBagLayoutFK_IdCuentaContablePresupuestoProducto);

		gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoProducto.gridy = 0;
		gridBagConstraintsPresupuestoProducto.gridx = 0;
		jPanelFK_IdCuentaContablePresupuestoProducto.add(jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoProducto, gridBagConstraintsPresupuestoProducto);

		gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoProducto.gridy = 0;
		gridBagConstraintsPresupuestoProducto.gridx = 1;
		jPanelFK_IdCuentaContablePresupuestoProducto.add(jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto, gridBagConstraintsPresupuestoProducto);

		gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoProducto.gridy = 1;
		gridBagConstraintsPresupuestoProducto.gridx =1;
		jPanelFK_IdCuentaContablePresupuestoProducto.add(jButtonFK_IdCuentaContablePresupuestoProducto, gridBagConstraintsPresupuestoProducto);

		jTabbedPaneBusquedasPresupuestoProducto.addTab("2.-Por Cuenta Contable ", jPanelFK_IdCuentaContablePresupuestoProducto);
		jTabbedPaneBusquedasPresupuestoProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoPresupuestoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdProductoPresupuestoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoPresupuestoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoPresupuestoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoPresupuestoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoPresupuestoProducto.setLayout(gridaBagLayoutFK_IdProductoPresupuestoProducto);

		gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoProducto.gridy = 0;
		gridBagConstraintsPresupuestoProducto.gridx = 0;
		jPanelFK_IdProductoPresupuestoProducto.add(jLabelid_productoFK_IdProductoPresupuestoProducto, gridBagConstraintsPresupuestoProducto);

		gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoProducto.gridy = 0;
		gridBagConstraintsPresupuestoProducto.gridx = 1;
		jPanelFK_IdProductoPresupuestoProducto.add(jComboBoxid_productoFK_IdProductoPresupuestoProducto, gridBagConstraintsPresupuestoProducto);


		gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsPresupuestoProducto.gridy = 0;
		gridBagConstraintsPresupuestoProducto.gridx = 0;
		jPanelFK_IdProductoPresupuestoProducto.add(this.jButtonBuscarFK_IdProductoid_productoPresupuestoProducto, gridBagConstraintsPresupuestoProducto);

		gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoProducto.gridy = 1;
		gridBagConstraintsPresupuestoProducto.gridx =1;
		jPanelFK_IdProductoPresupuestoProducto.add(jButtonFK_IdProductoPresupuestoProducto, gridBagConstraintsPresupuestoProducto);

		jTabbedPaneBusquedasPresupuestoProducto.addTab("3.-Por Producto ", jPanelFK_IdProductoPresupuestoProducto);
		jTabbedPaneBusquedasPresupuestoProducto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoProducto.gridx = 0;		
			//this.gridBagConstraintsPresupuestoProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoProducto.gridx = 0;		
		//this.gridBagConstraintsPresupuestoProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresupuestoProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoProducto.gridx = 0;		
			this.gridBagConstraintsPresupuestoProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresupuestoProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);								
		
		
		/*
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		*/		
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoProducto.gridx =0;
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
				
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresupuestoProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresupuestoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosPresupuestoProducto.setLayout(gridaBagLayoutBusquedasParametrosPresupuestoProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresupuestoProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			
			
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
			
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresupuestoProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresupuestoProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresupuestoProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresupuestoProducto.setName("jPanelReporteDinamicoPresupuestoProducto"); 
		
		this.jPanelReporteDinamicoPresupuestoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresupuestoProducto.setLayout(gridaBagLayoutReporteDinamicoPresupuestoProducto);
		
		
		this.jInternalFrameReporteDinamicoPresupuestoProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresupuestoProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresupuestoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresupuestoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresupuestoProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresupuestoProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresupuestoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresupuestoProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresupuestoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresupuestoProducto = new JLabelMe();

		this.jLabelColumnasSelectReportePresupuestoProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jLabelColumnasSelectReportePresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresupuestoProducto = new JList<Reporte>();
		this.jListColumnasSelectReportePresupuestoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresupuestoProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresupuestoProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresupuestoProducto=new JScrollPane(this.jListColumnasSelectReportePresupuestoProducto);
			
			this.jScrollColumnasSelectReportePresupuestoProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresupuestoProducto.add(this.jListColumnasSelectReportePresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jScrollColumnasSelectReportePresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresupuestoProducto = new JLabelMe();

		this.jLabelRelacionesSelectReportePresupuestoProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresupuestoProducto = new JList<Reporte>();
		this.jListRelacionesSelectReportePresupuestoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresupuestoProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresupuestoProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresupuestoProducto=new JScrollPane(this.jListRelacionesSelectReportePresupuestoProducto);
			
			this.jScrollRelacionesSelectReportePresupuestoProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresupuestoProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresupuestoProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresupuestoProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresupuestoProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresupuestoProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresupuestoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresupuestoProducto = new JLabelMe();

		this.jLabelConGraficoDinamicoPresupuestoProducto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jLabelConGraficoDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresupuestoProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresupuestoProducto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresupuestoProducto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresupuestoProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoProducto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jCheckBoxConGraficoDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresupuestoProducto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresupuestoProducto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jLabelColumnaCategoriaGraficoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresupuestoProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresupuestoProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jComboBoxColumnaCategoriaGraficoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresupuestoProducto = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresupuestoProducto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jLabelColumnaCategoriaValorPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresupuestoProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresupuestoProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresupuestoProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jComboBoxColumnaCategoriaValorPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresupuestoProducto = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresupuestoProducto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jLabelColumnasValoresGraficoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresupuestoProducto = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresupuestoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresupuestoProducto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresupuestoProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresupuestoProducto=new JScrollPane(this.jListColumnasValoresGraficoPresupuestoProducto);
			
			this.jScrollColumnasValoresGraficoPresupuestoProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresupuestoProducto.add(this.jListColumnasSelectReportePresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jScrollColumnasValoresGraficoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresupuestoProducto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresupuestoProducto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jLabelTiposGraficosReportesDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoProducto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jComboBoxTiposGraficosReportesDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresupuestoProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresupuestoProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jLabelGenerarExcelReporteDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresupuestoProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresupuestoProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoProducto.setToolTipText("Generar EXCEL"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresupuestoProducto.add(this.jButtonGenerarExcelReporteDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jComboBoxTiposReportesDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresupuestoProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresupuestoProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jLabelTiposArchivoReporteDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresupuestoProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresupuestoProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresupuestoProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresupuestoProducto.setToolTipText("Generar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jButtonGenerarReporteDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresupuestoProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresupuestoProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresupuestoProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresupuestoProducto.setToolTipText("Cancelar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoProducto.add(this.jButtonCerrarReporteDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresupuestoProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresupuestoProducto= new JScrollPane(jPanelReporteDinamicoPresupuestoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresupuestoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresupuestoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresupuestoProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresupuestoProducto);
		this.jInternalFrameReporteDinamicoPresupuestoProducto.getContentPane().add(this.jScrollPanelReporteDinamicoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresupuestoProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresupuestoProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresupuestoProducto.setName("jPanelImportacionPresupuestoProducto"); 
		
		this.jPanelImportacionPresupuestoProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresupuestoProducto.setLayout(gridaBagLayoutImportacionPresupuestoProducto);
		
		
		this.jInternalFrameImportacionPresupuestoProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresupuestoProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresupuestoProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresupuestoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresupuestoProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoProducto.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoProducto.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresupuestoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresupuestoProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoProducto.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoProducto.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresupuestoProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresupuestoProducto = new JLabelMe();

		this.jLabelArchivoImportacionPresupuestoProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoProducto.add(this.jLabelArchivoImportacionPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresupuestoProducto = new JFileChooser();		
		this.jFileChooserImportacionPresupuestoProducto.setToolTipText("ESCOGER ARCHIVO"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresupuestoProducto = new JButtonMe();
		this.jButtonAbrirImportacionPresupuestoProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresupuestoProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresupuestoProducto.setToolTipText("Generar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoProducto.add(this.jButtonAbrirImportacionPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresupuestoProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionPresupuestoProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoProducto.add(this.jLabelPathArchivoImportacionPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresupuestoProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresupuestoProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoProducto.add(this.jTextFieldPathArchivoImportacionPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresupuestoProducto = new JButtonMe();
		this.jButtonGenerarImportacionPresupuestoProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresupuestoProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresupuestoProducto.setToolTipText("Generar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoProducto.add(this.jButtonGenerarImportacionPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresupuestoProducto = new JButtonMe();
		this.jButtonCerrarImportacionPresupuestoProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresupuestoProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresupuestoProducto.setToolTipText("Cancelar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoProducto.add(this.jButtonCerrarImportacionPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresupuestoProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionPresupuestoProducto= new JScrollPane(jPanelImportacionPresupuestoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsPresupuestoProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresupuestoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresupuestoProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresupuestoProducto);
		this.jInternalFrameImportacionPresupuestoProducto.getContentPane().add(this.jScrollPanelImportacionPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresupuestoProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresupuestoProducto = new JButtonMe();
			this.jButtonAbrirOrderByPresupuestoProducto.setText("Orden");
			this.jButtonAbrirOrderByPresupuestoProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresupuestoProducto";
			inputMap = this.jButtonAbrirOrderByPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresupuestoProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresupuestoProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresupuestoProducto.setName("jPanelOrderByPresupuestoProducto"); 
			
			this.jPanelOrderByPresupuestoProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresupuestoProducto.setLayout(gridaBagLayoutOrderByPresupuestoProducto);
			
			
			this.jTableDatosPresupuestoProductoOrderBy = new JTableMe();        
			this.jTableDatosPresupuestoProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresupuestoProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresupuestoProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresupuestoProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresupuestoProductoOrderBy.setViewportView(this.jTableDatosPresupuestoProductoOrderBy);
			this.jTableDatosPresupuestoProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresupuestoProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresupuestoProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresupuestoProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresupuestoProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresupuestoProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresupuestoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresupuestoProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresupuestoProducto.setTitle("Orden");
			this.jInternalFrameOrderByPresupuestoProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresupuestoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresupuestoProducto.setResizable(true);
			this.jInternalFrameOrderByPresupuestoProducto.setClosable(true);
			this.jInternalFrameOrderByPresupuestoProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresupuestoProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresupuestoProducto.ipady =150;
				
			this.jPanelOrderByPresupuestoProducto.add(jScrollPanelDatosPresupuestoProductoOrderBy, this.gridBagConstraintsPresupuestoProducto);//this.jTableDatosPresupuestoProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresupuestoProducto = new JButtonMe();
			this.jButtonCerrarOrderByPresupuestoProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresupuestoProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresupuestoProducto.setToolTipText("Cancelar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresupuestoProducto.add(this.jButtonCerrarOrderByPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresupuestoProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByPresupuestoProducto= new JScrollPane(jPanelOrderByPresupuestoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresupuestoProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresupuestoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresupuestoProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresupuestoProducto);
			
			this.jInternalFrameOrderByPresupuestoProducto.getContentPane().add(this.jScrollPanelOrderByPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);			
		
		} else {
			this.jButtonAbrirOrderByPresupuestoProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presupuestoproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresupuestoProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresupuestoProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresupuestoProducto.getRowHeight();//PresupuestoProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresupuestoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoProducto.isSelected()) {
					iHeightTable=PresupuestoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresupuestoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoProducto.isSelected()) {
					iHeightTable=PresupuestoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresupuestoProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresupuestoProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresupuestoProducto!=null && this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresupuestoProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresupuestoProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresupuestoProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresupuestoProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presupuestoproductoLogic.getPresupuestoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresupuestoProducto> TraerPresupuestoProductoBeans(List<PresupuestoProducto> presupuestoproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresupuestoProducto presupuestoproducto:presupuestoproductos) {
					
				if(!(PresupuestoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresupuestoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presupuestoproducto.setsDetalleGeneralEntityReporte(PresupuestoProductoConstantesFunciones.getPresupuestoProductoDescripcion(presupuestoproducto));
										
						
					
						
					
				} else  {
							
					//presupuestoproducto.setsDetalleGeneralEntityReporte(presupuestoproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//presupuestoproductobeans.add(presupuestoproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presupuestoproductos;
    }
	//PARA REPORTES FIN
}
