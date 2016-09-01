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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.NovedadSeguimientoConstantesFunciones;

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
public class NovedadSeguimientoJInternalFrame extends NovedadSeguimientoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNovedadSeguimiento;
	
	protected JMenuBar jmenuBarNovedadSeguimiento;
	
	protected JMenu jmenuNovedadSeguimiento;
	protected JMenu jmenuDatosNovedadSeguimiento;
	protected JMenu jmenuArchivoNovedadSeguimiento;
	protected JMenu jmenuAccionesNovedadSeguimiento;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNovedadSeguimiento;	
	protected GridBagConstraints gridBagConstraintsNovedadSeguimiento;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NovedadSeguimientoDetalleFormJInternalFrame jInternalFrameDetalleFormNovedadSeguimiento;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNovedadSeguimiento;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNovedadSeguimiento;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallemovimientoinventario="";

	protected NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_novedadproducto="";

	protected EstadoNovedadSeguimientoBeanSwingJInternalFrame estadonovedadseguimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadonovedadseguimiento="";
	
	public NovedadSeguimientoSessionBean novedadseguimientoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleMovimientoInventarioSessionBean detallemovimientoinventarioSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public EstadoNovedadSeguimientoSessionBean estadonovedadseguimientoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NovedadSeguimiento> novedadseguimientos;		
	public List<NovedadSeguimiento> novedadseguimientosEliminados;	
	public List<NovedadSeguimiento> novedadseguimientosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNovedadSeguimiento;		
	protected JButton jButtonAbrirOrderByNovedadSeguimiento;
	
	
	//protected JPanel jPanelOrderByNovedadSeguimiento;
	//public JScrollPane jScrollPanelOrderByNovedadSeguimiento;	
	//protected JButton jButtonCerrarOrderByNovedadSeguimiento;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NovedadSeguimientoLogic novedadseguimientoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNovedadSeguimiento;
	public JScrollPane jScrollPanelDatosEdicionNovedadSeguimiento;
	public JScrollPane jScrollPanelDatosGeneralNovedadSeguimiento;
    
	
	
	//public JScrollPane jScrollPanelDatosNovedadSeguimientoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNovedadSeguimiento;
	//public JScrollPane jScrollPanelImportacionNovedadSeguimiento;
	
	
	
	protected JPanel jPanelAccionesNovedadSeguimiento;
	
    protected JPanel jPanelPaginacionNovedadSeguimiento;
    protected JPanel jPanelParametrosReportesNovedadSeguimiento;
	protected JPanel jPanelParametrosReportesAccionesNovedadSeguimiento;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NovedadSeguimiento;
	protected JPanel jPanelParametrosAuxiliar2NovedadSeguimiento;
	protected JPanel jPanelParametrosAuxiliar3NovedadSeguimiento;
	protected JPanel jPanelParametrosAuxiliar4NovedadSeguimiento;
	//protected JPanel jPanelParametrosAuxiliar5NovedadSeguimiento;
	
	
	
	//protected JPanel jPanelReporteDinamicoNovedadSeguimiento;
	//protected JPanel jPanelImportacionNovedadSeguimiento;
	
	
	public JTable jTableDatosNovedadSeguimiento;
	
	
	
	//public JTable jTableDatosNovedadSeguimientoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNovedadSeguimiento;
	protected JButton jButtonDuplicarNovedadSeguimiento;
	protected JButton jButtonCopiarNovedadSeguimiento;
	protected JButton jButtonVerFormNovedadSeguimiento;
	protected JButton jButtonNuevoRelacionesNovedadSeguimiento;
	protected JButton jButtonModificarNovedadSeguimiento;
	
    protected JButton jButtonGuardarCambiosTablaNovedadSeguimiento;
	protected JButton jButtonCerrarNovedadSeguimiento;
	
	
	protected JButton jButtonRecargarInformacionNovedadSeguimiento;
	protected JButton jButtonProcesarInformacionNovedadSeguimiento;
	
	
	protected JButton jButtonAnterioresNovedadSeguimiento;
	protected JButton jButtonSiguientesNovedadSeguimiento;
	protected JButton jButtonNuevoGuardarCambiosNovedadSeguimiento;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNovedadSeguimiento;
	//protected JButton jButtonCerrarReporteDinamicoNovedadSeguimiento;
	//protected JButton jButtonGenerarExcelReporteDinamicoNovedadSeguimiento;	
	
	
	
	//protected JButton jButtonAbrirImportacionNovedadSeguimiento;
	//protected JButton jButtonGenerarImportacionNovedadSeguimiento;
	//protected JButton jButtonCerrarImportacionNovedadSeguimiento;
	//protected JFileChooser jFileChooserImportacionNovedadSeguimiento;
	//protected File fileImportacionNovedadSeguimiento;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNovedadSeguimiento;
	protected JButton jButtonDuplicarToolBarNovedadSeguimiento;
	protected JButton jButtonNuevoRelacionesToolBarNovedadSeguimiento;
	
	
	public JButton jButtonGuardarCambiosToolBarNovedadSeguimiento;
	protected JButton jButtonCopiarToolBarNovedadSeguimiento;
	protected JButton jButtonVerFormToolBarNovedadSeguimiento;
	public JButton jButtonGuardarCambiosTablaToolBarNovedadSeguimiento;
	protected JButton jButtonMostrarOcultarTablaToolBarNovedadSeguimiento;
	protected JButton jButtonCerrarToolBarNovedadSeguimiento;
	
	protected JButton jButtonRecargarInformacionToolBarNovedadSeguimiento;
	protected JButton jButtonProcesarInformacionToolBarNovedadSeguimiento;
	protected JButton jButtonAnterioresToolBarNovedadSeguimiento;
	protected JButton jButtonSiguientesToolBarNovedadSeguimiento;
	protected JButton jButtonNuevoGuardarCambiosToolBarNovedadSeguimiento;
	protected JButton jButtonAbrirOrderByToolBarNovedadSeguimiento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNovedadSeguimiento;
	protected JMenuItem jMenuItemDuplicarNovedadSeguimiento;
	protected JMenuItem jMenuItemNuevoRelacionesNovedadSeguimiento;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNovedadSeguimiento;
	protected JMenuItem jMenuItemCopiarNovedadSeguimiento;
	protected JMenuItem jMenuItemVerFormNovedadSeguimiento;
	protected JMenuItem jMenuItemGuardarCambiosTablaNovedadSeguimiento;
	protected JMenuItem jMenuItemCerrarNovedadSeguimiento;
	protected JMenuItem jMenuItemDetalleCerrarNovedadSeguimiento;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNovedadSeguimiento;
	protected JMenuItem jMenuItemDetalleMostarOcultarNovedadSeguimiento;
	
	protected JMenuItem jMenuItemRecargarInformacionNovedadSeguimiento;
	protected JMenuItem jMenuItemProcesarInformacionNovedadSeguimiento;
	protected JMenuItem jMenuItemAnterioresNovedadSeguimiento;
	protected JMenuItem jMenuItemSiguientesNovedadSeguimiento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNovedadSeguimiento;
	protected JMenuItem jMenuItemAbrirOrderByNovedadSeguimiento;
	protected JMenuItem jMenuItemMostrarOcultarNovedadSeguimiento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNovedadSeguimiento;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNovedadSeguimiento;
	protected JCheckBox jCheckBoxSeleccionadosNovedadSeguimiento;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNovedadSeguimiento;
	protected JCheckBox jCheckBoxConGraficoReporteNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNovedadSeguimiento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNovedadSeguimiento;
	protected JTextField jTextFieldValorCampoGeneralNovedadSeguimiento;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNovedadSeguimiento;
	//public JList<Reporte> jListColumnasSelectReporteNovedadSeguimiento;
	//public JScrollPane jScrollColumnasSelectReporteNovedadSeguimiento;
	
	//public JLabel jLabelRelacionesSelectReporteNovedadSeguimiento;
	//public JList<Reporte> jListRelacionesSelectReporteNovedadSeguimiento;
	//public JScrollPane jScrollRelacionesSelectReporteNovedadSeguimiento;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNovedadSeguimiento;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNovedadSeguimiento;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNovedadSeguimiento;
	//public JLabel jLabelTiposArchivoReporteDinamicoNovedadSeguimiento;
	
		
	//public JLabel jLabelArchivoImportacionNovedadSeguimiento;	
	//public JLabel jLabelPathArchivoImportacionNovedadSeguimiento;
	//protected JTextField jTextFieldPathArchivoImportacionNovedadSeguimiento;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNovedadSeguimiento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNovedadSeguimiento;
	
	//public JLabel jLabelColumnaCategoriaValorNovedadSeguimiento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNovedadSeguimiento;
	
	//public JLabel jLabelColumnasValoresGraficoNovedadSeguimiento;
	//public JList<Reporte> jListColumnasValoresGraficoNovedadSeguimiento;
	//public JScrollPane jScrollColumnasValoresGraficoNovedadSeguimiento;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNovedadSeguimiento;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNovedadSeguimiento;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNovedadSeguimiento;
	public JPanel jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento;
	public JButton jButtonFK_IdDetalleMovimientoInventarioNovedadSeguimiento;
	public JPanel jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento;
	public JButton jButtonFK_IdEstadoNovedadSeguimientoNovedadSeguimiento;
	public JPanel jPanelFK_IdNovedadProductoNovedadSeguimiento;
	public JButton jButtonFK_IdNovedadProductoNovedadSeguimiento;
	
	public JPanel jPanelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento;
	public JLabel jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento;
	public JButton jButtonid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento= new JButtonMe();
	public JButton jButtonid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimientoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimientoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento;
	public JLabel jLabelid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento;
	public JButton jButtonid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento= new JButtonMe();
	public JButton jButtonid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimientoUpdate= new JButtonMe();
	public JButton jButtonid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimientoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento;
	public JLabel jLabelid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento;
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoNovedadSeguimientoUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoNovedadSeguimientoBusqueda= new JButtonMe();

	
	
	
	
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
	public NovedadSeguimientoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadSeguimientoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadSeguimientoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadSeguimientoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNovedadSeguimiento)	{
		this.jButtonRecargarInformacionNovedadSeguimiento = jButtonRecargarInformacionNovedadSeguimiento;
	}
	
	public JButton getjButtonProcesarInformacionNovedadSeguimiento() {
		return this.jButtonProcesarInformacionNovedadSeguimiento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNovedadSeguimiento)	{
		this.jButtonProcesarInformacionNovedadSeguimiento = jButtonProcesarInformacionNovedadSeguimiento;
	}
	
	
	public JButton getjButtonRecargarInformacionNovedadSeguimiento() {
		return this.jButtonRecargarInformacionNovedadSeguimiento;
	}
	
	
	public List<NovedadSeguimiento> getnovedadseguimientos() {
		return this.novedadseguimientos;
	}

	public void setnovedadseguimientos(List<NovedadSeguimiento> novedadseguimientos) {
		this.novedadseguimientos = novedadseguimientos;
	}
	
	public List<NovedadSeguimiento> getnovedadseguimientosAux() {
		return this.novedadseguimientosAux;
	}

	public void setnovedadseguimientosAux(List<NovedadSeguimiento> novedadseguimientosAux) {
		this.novedadseguimientosAux = novedadseguimientosAux;
	}
	
	public List<NovedadSeguimiento> getnovedadseguimientosEliminados() {
		return this.novedadseguimientosEliminados;
	}

	public void setNovedadSeguimientosEliminados(List<NovedadSeguimiento> novedadseguimientosEliminados) {
		this.novedadseguimientosEliminados = novedadseguimientosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNovedadSeguimiento() {
		return jComboBoxTiposSeleccionarNovedadSeguimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNovedadSeguimiento(
			JComboBox jComboBoxTiposSeleccionarNovedadSeguimiento) {
		this.jComboBoxTiposSeleccionarNovedadSeguimiento = jComboBoxTiposSeleccionarNovedadSeguimiento;
	}
	
	public void setBorderResaltarTiposSeleccionarNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNovedadSeguimiento() {
		return jTextFieldValorCampoGeneralNovedadSeguimiento;
	}

	public void setjTextFieldValorCampoGeneralNovedadSeguimiento(
			JTextField jTextFieldValorCampoGeneralNovedadSeguimiento) {
		this.jTextFieldValorCampoGeneralNovedadSeguimiento = jTextFieldValorCampoGeneralNovedadSeguimiento;
	}

	public void setBorderResaltarValorCampoGeneralNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNovedadSeguimiento .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNovedadSeguimiento() {
		return this.jCheckBoxSeleccionarTodosNovedadSeguimiento;
	}

	public void setjCheckBoxSeleccionarTodosNovedadSeguimiento(
			JCheckBox jCheckBoxSeleccionarTodosNovedadSeguimiento) {
		this.jCheckBoxSeleccionarTodosNovedadSeguimiento = jCheckBoxSeleccionarTodosNovedadSeguimiento;
	}

	public void setBorderResaltarSeleccionarTodosNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNovedadSeguimiento() {
		return this.jCheckBoxSeleccionadosNovedadSeguimiento;
	}

	public void setjCheckBoxSeleccionadosNovedadSeguimiento(
			JCheckBox jCheckBoxSeleccionadosNovedadSeguimiento) {
		this.jCheckBoxSeleccionadosNovedadSeguimiento = jCheckBoxSeleccionadosNovedadSeguimiento;
	}
	
	public void setBorderResaltarSeleccionadosNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNovedadSeguimiento() {
		return this.jComboBoxTiposArchivosReportesNovedadSeguimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNovedadSeguimiento(
			JComboBox jComboBoxTiposArchivosReportesNovedadSeguimiento) {
		this.jComboBoxTiposArchivosReportesNovedadSeguimiento = jComboBoxTiposArchivosReportesNovedadSeguimiento;
	}

	public void setBorderResaltarTiposArchivosReportesNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNovedadSeguimiento() {
		return this.jComboBoxTiposReportesNovedadSeguimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNovedadSeguimiento(
			JComboBox jComboBoxTiposReportesNovedadSeguimiento) {
		this.jComboBoxTiposReportesNovedadSeguimiento = jComboBoxTiposReportesNovedadSeguimiento;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNovedadSeguimiento() {
	//	return jComboBoxTiposReportesDinamicoNovedadSeguimiento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNovedadSeguimiento(
	//		JComboBox jComboBoxTiposReportesDinamicoNovedadSeguimiento) {
	//	this.jComboBoxTiposReportesDinamicoNovedadSeguimiento = jComboBoxTiposReportesDinamicoNovedadSeguimiento;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento() {
	//	return jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento = jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento;
	//}
	
	public void setBorderResaltarTiposReportesNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNovedadSeguimiento() {
		return this.jComboBoxTiposGraficosReportesNovedadSeguimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNovedadSeguimiento(
			JComboBox jComboBoxTiposGraficosReportesNovedadSeguimiento) {
		this.jComboBoxTiposGraficosReportesNovedadSeguimiento = jComboBoxTiposGraficosReportesNovedadSeguimiento;
	}
	
	public void setBorderResaltarTiposGraficosReportesNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNovedadSeguimiento() {
		return this.jComboBoxTiposPaginacionNovedadSeguimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNovedadSeguimiento(
			JComboBox jComboBoxTiposPaginacionNovedadSeguimiento) {
		this.jComboBoxTiposPaginacionNovedadSeguimiento = jComboBoxTiposPaginacionNovedadSeguimiento;
	}
	
	public void setBorderResaltarTiposPaginacionNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNovedadSeguimiento() {
		return this.jComboBoxTiposRelacionesNovedadSeguimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNovedadSeguimiento() {
		return this.jComboBoxTiposAccionesNovedadSeguimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNovedadSeguimiento(
			JComboBox jComboBoxTiposRelacionesNovedadSeguimiento) {
		this.jComboBoxTiposRelacionesNovedadSeguimiento = jComboBoxTiposRelacionesNovedadSeguimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNovedadSeguimiento(
			JComboBox jComboBoxTiposAccionesNovedadSeguimiento) {
		this.jComboBoxTiposAccionesNovedadSeguimiento = jComboBoxTiposAccionesNovedadSeguimiento;
	}
	
	public void setBorderResaltarTiposRelacionesNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNovedadSeguimiento() {
	//	return jCheckBoxConGraficoDinamicoNovedadSeguimiento;
	//}

	//public void setjCheckBoxConGraficoDinamicoNovedadSeguimiento(
	//		JCheckBox jCheckBoxConGraficoDinamicoNovedadSeguimiento) {
	//	this.jCheckBoxConGraficoDinamicoNovedadSeguimiento = jCheckBoxConGraficoDinamicoNovedadSeguimiento;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNovedadSeguimiento() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNovedadSeguimiento.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNovedadSeguimiento .setBorder(borderResaltar);		
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
		this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
		
		this.novedadseguimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadseguimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.novedadseguimientoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NovedadSeguimientoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Novedad Seguimiento MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
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
		
		NovedadSeguimientoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNovedadSeguimiento= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"nuevo","nuevo","Nuevo"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"duplicar","duplicar","Duplicar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"copiar","copiar","Copiar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"ver_form","ver_form","Ver"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"recargar","recargar","Recargar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,
							"cerrar","cerrar","Salir"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNovedadSeguimiento=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNovedadSeguimiento;
			
				this.jButtonProcesarInformacionToolBarNovedadSeguimiento=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNovedadSeguimiento;
				
		//protected JButton jButtonModificarToolBarNovedadSeguimiento;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNovedadSeguimiento=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNovedadSeguimiento=new JMenuMe("General");
		this.jmenuArchivoNovedadSeguimiento=new JMenuMe("Archivo");
		this.jmenuAccionesNovedadSeguimiento=new JMenuMe("Acciones");
		this.jmenuDatosNovedadSeguimiento=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNovedadSeguimiento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNovedadSeguimiento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNovedadSeguimiento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNovedadSeguimiento= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNovedadSeguimiento.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNovedadSeguimiento,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNovedadSeguimiento= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNovedadSeguimiento.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNovedadSeguimiento,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNovedadSeguimiento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNovedadSeguimiento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNovedadSeguimiento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNovedadSeguimiento= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNovedadSeguimiento.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNovedadSeguimiento,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNovedadSeguimiento= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNovedadSeguimiento.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNovedadSeguimiento,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNovedadSeguimiento= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNovedadSeguimiento.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNovedadSeguimiento,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNovedadSeguimiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNovedadSeguimiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNovedadSeguimiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNovedadSeguimiento= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNovedadSeguimiento.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNovedadSeguimiento,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNovedadSeguimiento= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNovedadSeguimiento.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNovedadSeguimiento,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNovedadSeguimiento= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNovedadSeguimiento.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNovedadSeguimiento,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNovedadSeguimiento= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNovedadSeguimiento.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNovedadSeguimiento,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNovedadSeguimiento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNovedadSeguimiento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNovedadSeguimiento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNovedadSeguimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNovedadSeguimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNovedadSeguimiento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNovedadSeguimiento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNovedadSeguimiento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNovedadSeguimiento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNovedadSeguimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNovedadSeguimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNovedadSeguimiento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNovedadSeguimiento= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNovedadSeguimiento.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNovedadSeguimiento,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNovedadSeguimiento.add(this.jMenuItemCerrarNovedadSeguimiento);
			
			this.jmenuAccionesNovedadSeguimiento.add(this.jMenuItemNuevoNovedadSeguimiento);
			this.jmenuAccionesNovedadSeguimiento.add(this.jMenuItemNuevoGuardarCambiosNovedadSeguimiento);
			this.jmenuAccionesNovedadSeguimiento.add(this.jMenuItemNuevoRelacionesNovedadSeguimiento);
			this.jmenuAccionesNovedadSeguimiento.add(this.jMenuItemGuardarCambiosTablaNovedadSeguimiento);		
			this.jmenuAccionesNovedadSeguimiento.add(this.jMenuItemDuplicarNovedadSeguimiento);		
			this.jmenuAccionesNovedadSeguimiento.add(this.jMenuItemCopiarNovedadSeguimiento);		
			this.jmenuAccionesNovedadSeguimiento.add(this.jMenuItemVerFormNovedadSeguimiento);		
			
			this.jmenuDatosNovedadSeguimiento.add(this.jMenuItemRecargarInformacionNovedadSeguimiento);				
			this.jmenuDatosNovedadSeguimiento.add(this.jMenuItemAnterioresNovedadSeguimiento);				
			this.jmenuDatosNovedadSeguimiento.add(this.jMenuItemSiguientesNovedadSeguimiento);				
			this.jmenuDatosNovedadSeguimiento.add(this.jMenuItemAbrirOrderByNovedadSeguimiento);				
			this.jmenuDatosNovedadSeguimiento.add(this.jMenuItemMostrarOcultarNovedadSeguimiento);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNovedadSeguimiento.add(this.jMenuItemGuardarCambiosNovedadSeguimiento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNovedadSeguimiento.add(this.jmenuArchivoNovedadSeguimiento);		
			this.jmenuBarNovedadSeguimiento.add(this.jmenuAccionesNovedadSeguimiento);		
			this.jmenuBarNovedadSeguimiento.add(this.jmenuDatosNovedadSeguimiento);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNovedadSeguimiento);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNovedadSeguimiento() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setToolTipText("Buscar Por Detalle Movimiento Inventario ");
		this.jButtonFK_IdDetalleMovimientoInventarioNovedadSeguimiento= new JButtonMe();
		this.jButtonFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setText("Buscar");
		this.jButtonFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setToolTipText("Buscar Por Detalle Movimiento Inventario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleMovimientoInventarioNovedadSeguimiento,"buscar_button","Buscar Por Detalle Movimiento Inventario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleMovimientoInventarioNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento = new JLabelMe();
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setText("Detalle Movimiento Inventario :");
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setToolTipText("Detalle Movimiento Inventario");
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento= new JComboBoxMe();
		jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setToolTipText("Buscar Por Estado Novedad Seguimiento ");
		this.jButtonFK_IdEstadoNovedadSeguimientoNovedadSeguimiento= new JButtonMe();
		this.jButtonFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setText("Buscar");
		this.jButtonFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setToolTipText("Buscar Por Estado Novedad Seguimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoNovedadSeguimientoNovedadSeguimiento,"buscar_button","Buscar Por Estado Novedad Seguimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoNovedadSeguimientoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento = new JLabelMe();
		jLabelid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setText("Estado Novedad Seguimiento :");
		jLabelid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setToolTipText("Estado Novedad Seguimiento");
		jLabelid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento= new JComboBoxMe();
		jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNovedadProductoNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNovedadProductoNovedadSeguimiento.setToolTipText("Buscar Por Novedad Producto ");
		this.jButtonFK_IdNovedadProductoNovedadSeguimiento= new JButtonMe();
		this.jButtonFK_IdNovedadProductoNovedadSeguimiento.setText("Buscar");
		this.jButtonFK_IdNovedadProductoNovedadSeguimiento.setToolTipText("Buscar Por Novedad Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNovedadProductoNovedadSeguimiento,"buscar_button","Buscar Por Novedad Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNovedadProductoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento = new JLabelMe();
		jLabelid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setText("Novedad Producto :");
		jLabelid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setToolTipText("Novedad Producto");
		jLabelid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento= new JComboBoxMe();
		jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasNovedadSeguimiento=new JTabbedPane();


		this.jTabbedPaneBusquedasNovedadSeguimiento.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNovedadSeguimiento.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNovedadSeguimiento.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNovedadSeguimiento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNovedadSeguimiento = new NovedadSeguimientoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Novedad Seguimiento DATOS");
			this.jInternalFrameDetalleFormNovedadSeguimiento = new NovedadSeguimientoDetalleFormJInternalFrame(jDesktopPane,this.novedadseguimientoSessionBean.getConGuardarRelaciones(),this.novedadseguimientoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNovedadSeguimiento = null;//new NovedadSeguimientoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNovedadSeguimiento= new GridBagLayout();
		
		
		this.jTableDatosNovedadSeguimiento = new JTableMe();      
		
		String sToolTipNovedadSeguimiento="";
		sToolTipNovedadSeguimiento=NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNovedadSeguimiento+="(Inventario.NovedadSeguimiento)";
		}
		
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			sToolTipNovedadSeguimiento+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNovedadSeguimiento.setToolTipText(sToolTipNovedadSeguimiento);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNovedadSeguimiento);
		this.jTableDatosNovedadSeguimiento.setAutoCreateRowSorter(true);
		this.jTableDatosNovedadSeguimiento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNovedadSeguimiento.setRowSelectionAllowed(true);
		this.jTableDatosNovedadSeguimiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNovedadSeguimiento = new JButtonMe();
		this.jButtonDuplicarNovedadSeguimiento = new JButtonMe();
		this.jButtonCopiarNovedadSeguimiento = new JButtonMe();
		this.jButtonVerFormNovedadSeguimiento = new JButtonMe();
		this.jButtonNuevoRelacionesNovedadSeguimiento = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNovedadSeguimiento = new JButtonMe();
		this.jButtonCerrarNovedadSeguimiento = new JButtonMe();
		
		this.jScrollPanelDatosNovedadSeguimiento = new JScrollPane();   
        this.jScrollPanelDatosGeneralNovedadSeguimiento = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Novedad Seguimiento";
		
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Seguimientoes" + this.sPath));
		} else {
			this.jScrollPanelDatosNovedadSeguimiento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNovedadSeguimiento.setToolTipText("Acciones");
        this.jPanelAccionesNovedadSeguimiento.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNovedadSeguimiento=new ReporteDinamicoJInternalFrame(NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNovedadSeguimiento();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNovedadSeguimiento=new ImportacionJInternalFrame(NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNovedadSeguimiento();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNovedadSeguimiento = new JButtonMe();
		
		this.jButtonAbrirOrderByNovedadSeguimiento.setText("Orden");
		this.jButtonAbrirOrderByNovedadSeguimiento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNovedadSeguimiento,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNovedadSeguimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadSeguimiento,false,this);
			
			//this.cargarOrderByNovedadSeguimiento(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNovedadSeguimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadSeguimiento,true,this);
			
			//this.cargarOrderByNovedadSeguimiento(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNovedadSeguimiento.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosNovedadSeguimiento.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosNovedadSeguimiento.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosNovedadSeguimiento.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNovedadSeguimiento.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNovedadSeguimiento.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNovedadSeguimiento.setText("Nuevo");
		this.jButtonDuplicarNovedadSeguimiento.setText("Duplicar");
		this.jButtonCopiarNovedadSeguimiento.setText("Copiar");
		this.jButtonVerFormNovedadSeguimiento.setText("Ver");
		this.jButtonNuevoRelacionesNovedadSeguimiento.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNovedadSeguimiento.setText("Guardar");
		this.jButtonCerrarNovedadSeguimiento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNovedadSeguimiento,"nuevo_button","Nuevo",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNovedadSeguimiento,"duplicar_button","Duplicar",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNovedadSeguimiento,"copiar_button","Copiar",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNovedadSeguimiento,"ver_form","Ver",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNovedadSeguimiento,"nuevorelaciones_button","Nuevo Rel",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNovedadSeguimiento,"guardarcambiostabla_button","Guardar",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNovedadSeguimiento,"cerrar_button","Salir",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNovedadSeguimiento.setToolTipText("Nuevo"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNovedadSeguimiento.setToolTipText("Duplicar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNovedadSeguimiento.setToolTipText("Copiar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNovedadSeguimiento.setToolTipText("Ver"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNovedadSeguimiento.setToolTipText("Nuevo Rel"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNovedadSeguimiento.setToolTipText("Guardar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNovedadSeguimiento.setToolTipText("Salir"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNovedadSeguimiento";
		inputMap = this.jButtonNuevoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNovedadSeguimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNovedadSeguimiento"));
		
		//DUPLICAR
		sMapKey = "DuplicarNovedadSeguimiento";
		inputMap = this.jButtonDuplicarNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNovedadSeguimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNovedadSeguimiento"));
		
		//COPIAR
		sMapKey = "CopiarNovedadSeguimiento";
		inputMap = this.jButtonCopiarNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNovedadSeguimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNovedadSeguimiento"));
		
		//VEr FORM
		sMapKey = "VerFormNovedadSeguimiento";
		inputMap = this.jButtonVerFormNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNovedadSeguimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNovedadSeguimiento"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNovedadSeguimiento";
		inputMap = this.jButtonNuevoRelacionesNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNovedadSeguimiento"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNovedadSeguimiento";
		inputMap = this.jButtonModificarNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNovedadSeguimiento"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNovedadSeguimiento";
		inputMap = this.jButtonCerrarNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNovedadSeguimiento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNovedadSeguimiento";
		inputMap = this.jButtonGuardarCambiosTablaNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNovedadSeguimiento"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNovedadSeguimiento.setName("jPanelParametrosReportesNovedadSeguimiento"); 
		
		this.jPanelParametrosReportesAccionesNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNovedadSeguimiento.setName("jPanelParametrosReportesAccionesNovedadSeguimiento"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNovedadSeguimiento = new JButtonMe();
		this.jButtonRecargarInformacionNovedadSeguimiento.setText("Recargar");
		this.jButtonRecargarInformacionNovedadSeguimiento.setToolTipText("Recargar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNovedadSeguimiento,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNovedadSeguimiento = new JButtonMe();
		this.jButtonProcesarInformacionNovedadSeguimiento.setText("Procesar");
		this.jButtonProcesarInformacionNovedadSeguimiento.setToolTipText("Procesar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNovedadSeguimiento.setVisible(false);
			
		this.jButtonProcesarInformacionNovedadSeguimiento.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNovedadSeguimiento.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNovedadSeguimiento.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedadSeguimiento.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNovedadSeguimiento.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedadSeguimiento.setText("TIPO");       
		this.jComboBoxTiposReportesNovedadSeguimiento.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedadSeguimiento.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNovedadSeguimiento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNovedadSeguimiento.setText("Paginacion");
		this.jComboBoxTiposPaginacionNovedadSeguimiento.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNovedadSeguimiento.setText("Accion");
		this.jComboBoxTiposRelacionesNovedadSeguimiento.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNovedadSeguimiento.setText("Accion");
		this.jComboBoxTiposAccionesNovedadSeguimiento.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNovedadSeguimiento.setText("Accion");
		this.jComboBoxTiposSeleccionarNovedadSeguimiento.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNovedadSeguimiento=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNovedadSeguimiento.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNovedadSeguimiento.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNovedadSeguimiento.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNovedadSeguimiento = new JLabelMe();
		
		this.jLabelAccionesNovedadSeguimiento.setText("Acciones");		
		this.jLabelAccionesNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNovedadSeguimiento = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNovedadSeguimiento.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNovedadSeguimiento.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNovedadSeguimiento = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNovedadSeguimiento.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNovedadSeguimiento.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNovedadSeguimiento = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNovedadSeguimiento.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNovedadSeguimiento.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNovedadSeguimiento = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNovedadSeguimiento.setText("Graf.");
		this.jCheckBoxConGraficoReporteNovedadSeguimiento.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNovedadSeguimiento = new JButtonMe();
		//this.jButtonAnterioresNovedadSeguimiento.setText("<<");
        this.jButtonAnterioresNovedadSeguimiento.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNovedadSeguimiento,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNovedadSeguimiento = new JButtonMe();
		//this.jButtonSiguientesNovedadSeguimiento.setText(">>");
        this.jButtonSiguientesNovedadSeguimiento.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNovedadSeguimiento,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNovedadSeguimiento = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNovedadSeguimiento.setText("Nue");
        this.jButtonNuevoGuardarCambiosNovedadSeguimiento.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNovedadSeguimiento,"nuevoguardarcambios_button","Nue",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNovedadSeguimiento";
		inputMap = this.jButtonNuevoGuardarCambiosNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNovedadSeguimiento"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNovedadSeguimiento";
		inputMap = this.jButtonRecargarInformacionNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNovedadSeguimiento"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNovedadSeguimiento";
		inputMap = this.jButtonSiguientesNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNovedadSeguimiento"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNovedadSeguimiento";
		inputMap = this.jButtonAnterioresNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNovedadSeguimiento"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNovedadSeguimiento();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNovedadSeguimiento.setMinimumSize(new Dimension(this.getWidth(),NovedadSeguimientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadSeguimientoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNovedadSeguimiento.setMaximumSize(new Dimension(this.getWidth(),NovedadSeguimientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadSeguimientoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNovedadSeguimiento.setPreferredSize(new Dimension(this.getWidth(),NovedadSeguimientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadSeguimientoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNovedadSeguimiento = new GridBagLayout();

			this.jPanelPaginacionNovedadSeguimiento.setLayout(gridaBagLayoutPaginacionNovedadSeguimiento);						
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
			this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNovedadSeguimiento.add(this.jButtonAnterioresNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
					
						
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
			
			this.jPanelPaginacionNovedadSeguimiento.add(this.jButtonNuevoGuardarCambiosNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
						
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
			this.jPanelPaginacionNovedadSeguimiento.add(this.jButtonSiguientesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = 1;
			this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadSeguimiento.add(this.jButtonNuevoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
						
			
			
			if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
				this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNovedadSeguimiento.gridy = 1;
				this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNovedadSeguimiento.add(this.jButtonGuardarCambiosTablaNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			}
			
			
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = 1;
			this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadSeguimiento.add(this.jButtonDuplicarNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = 1;
			this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadSeguimiento.add(this.jButtonCopiarNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = 1;
			this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadSeguimiento.add(this.jButtonVerFormNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = 1;
			this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNovedadSeguimiento.add(this.jButtonCerrarNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		
		
		
		this.jButtonRecargarInformacionNovedadSeguimiento.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNovedadSeguimiento.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNovedadSeguimiento.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNovedadSeguimiento.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNovedadSeguimiento.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNovedadSeguimiento.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNovedadSeguimiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNovedadSeguimiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNovedadSeguimiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNovedadSeguimiento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNovedadSeguimiento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNovedadSeguimiento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNovedadSeguimiento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNovedadSeguimiento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNovedadSeguimiento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNovedadSeguimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNovedadSeguimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNovedadSeguimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNovedadSeguimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadSeguimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadSeguimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNovedadSeguimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNovedadSeguimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNovedadSeguimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNovedadSeguimiento.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNovedadSeguimiento.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNovedadSeguimiento.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNovedadSeguimiento.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNovedadSeguimiento.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNovedadSeguimiento.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNovedadSeguimiento.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNovedadSeguimiento.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNovedadSeguimiento.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNovedadSeguimiento.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNovedadSeguimiento.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNovedadSeguimiento.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNovedadSeguimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNovedadSeguimiento = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NovedadSeguimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NovedadSeguimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NovedadSeguimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NovedadSeguimiento = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNovedadSeguimiento.setLayout(gridaBagParametrosReportesNovedadSeguimiento);
			this.jPanelParametrosReportesAccionesNovedadSeguimiento.setLayout(gridaBagParametrosReportesAccionesNovedadSeguimiento);
			
			
			this.jPanelParametrosAuxiliar1NovedadSeguimiento.setLayout(gridaBagParametrosAuxiliar1NovedadSeguimiento);
			this.jPanelParametrosAuxiliar2NovedadSeguimiento.setLayout(gridaBagParametrosAuxiliar2NovedadSeguimiento);
			this.jPanelParametrosAuxiliar3NovedadSeguimiento.setLayout(gridaBagParametrosAuxiliar3NovedadSeguimiento);
			this.jPanelParametrosAuxiliar4NovedadSeguimiento.setLayout(gridaBagParametrosAuxiliar4NovedadSeguimiento);
			//this.jPanelParametrosAuxiliar5NovedadSeguimiento.setLayout(gridaBagParametrosAuxiliar2NovedadSeguimiento);			
			
			
			
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jButtonRecargarInformacionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NovedadSeguimiento.add(this.jComboBoxTiposPaginacionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NovedadSeguimiento.add(this.jCheckBoxConAltoMaximoTablaNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NovedadSeguimiento.add(this.jComboBoxTiposArchivosReportesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jPanelParametrosAuxiliar1NovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedadSeguimiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NovedadSeguimiento.add(this.jComboBoxTiposReportesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jPanelParametrosAuxiliar4NovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jComboBoxTiposReportesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jCheckBoxGenerarReporteNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jPanelParametrosAuxiliar2NovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedadSeguimiento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jLabelAccionesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
				this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNovedadSeguimiento.add(this.jButtonAbrirOrderByNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jComboBoxTiposSeleccionarNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);			
			
			
			/*
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedadSeguimiento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jCheckBoxSeleccionarTodosNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedadSeguimiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NovedadSeguimiento.add(this.jCheckBoxSeleccionarTodosNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);															
				
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedadSeguimiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NovedadSeguimiento.add(this.jCheckBoxSeleccionadosNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jPanelParametrosAuxiliar3NovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jComboBoxTiposAccionesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
	
				
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadSeguimiento.add(this.jTextFieldValorCampoGeneralNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNovedadSeguimiento = new GridBagLayout();

			this.jScrollPanelDatosNovedadSeguimiento.setLayout(gridaBagLayoutDatosNovedadSeguimiento);
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
			this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
			
			this.jScrollPanelDatosNovedadSeguimiento.add(this.jTableDatosNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNovedadSeguimiento.setViewportView(this.jTableDatosNovedadSeguimiento);
		this.jTableDatosNovedadSeguimiento.setFillsViewportHeight(true);
		this.jTableDatosNovedadSeguimiento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNovedadSeguimiento= new GridBagLayout();
		this.jPanelAccionesNovedadSeguimiento.setLayout(gridaBagLayoutAccionesNovedadSeguimiento);
		
		
		/*	
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
			
		this.jPanelAccionesNovedadSeguimiento.add(this.jButtonNuevoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdDetalleMovimientoInventarioNovedadSeguimiento= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleMovimientoInventarioNovedadSeguimiento.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleMovimientoInventarioNovedadSeguimiento.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleMovimientoInventarioNovedadSeguimiento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleMovimientoInventarioNovedadSeguimiento.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setLayout(gridaBagLayoutFK_IdDetalleMovimientoInventarioNovedadSeguimiento);

		gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadSeguimiento.gridy = 0;
		gridBagConstraintsNovedadSeguimiento.gridx = 0;
		jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento.add(jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);

		gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadSeguimiento.gridy = 0;
		gridBagConstraintsNovedadSeguimiento.gridx = 1;
		jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento.add(jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);

		gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadSeguimiento.gridy = 1;
		gridBagConstraintsNovedadSeguimiento.gridx =1;
		jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento.add(jButtonFK_IdDetalleMovimientoInventarioNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);

		jTabbedPaneBusquedasNovedadSeguimiento.addTab("1.-Por Detalle Movimiento Inventario ", jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento);
		jTabbedPaneBusquedasNovedadSeguimiento.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoNovedadSeguimientoNovedadSeguimiento= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setLayout(gridaBagLayoutFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);

		gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadSeguimiento.gridy = 0;
		gridBagConstraintsNovedadSeguimiento.gridx = 0;
		jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.add(jLabelid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);

		gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadSeguimiento.gridy = 0;
		gridBagConstraintsNovedadSeguimiento.gridx = 1;
		jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.add(jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);

		gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadSeguimiento.gridy = 1;
		gridBagConstraintsNovedadSeguimiento.gridx =1;
		jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.add(jButtonFK_IdEstadoNovedadSeguimientoNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);

		jTabbedPaneBusquedasNovedadSeguimiento.addTab("2.-Por Estado Novedad Seguimiento ", jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);
		jTabbedPaneBusquedasNovedadSeguimiento.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdNovedadProductoNovedadSeguimiento= new GridBagLayout();
		gridaBagLayoutFK_IdNovedadProductoNovedadSeguimiento.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoNovedadSeguimiento.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoNovedadSeguimiento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNovedadProductoNovedadSeguimiento.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNovedadProductoNovedadSeguimiento.setLayout(gridaBagLayoutFK_IdNovedadProductoNovedadSeguimiento);

		gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadSeguimiento.gridy = 0;
		gridBagConstraintsNovedadSeguimiento.gridx = 0;
		jPanelFK_IdNovedadProductoNovedadSeguimiento.add(jLabelid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);

		gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadSeguimiento.gridy = 0;
		gridBagConstraintsNovedadSeguimiento.gridx = 1;
		jPanelFK_IdNovedadProductoNovedadSeguimiento.add(jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);

		gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadSeguimiento.gridy = 1;
		gridBagConstraintsNovedadSeguimiento.gridx =1;
		jPanelFK_IdNovedadProductoNovedadSeguimiento.add(jButtonFK_IdNovedadProductoNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);

		jTabbedPaneBusquedasNovedadSeguimiento.addTab("3.-Por Novedad Producto ", jPanelFK_IdNovedadProductoNovedadSeguimiento);
		jTabbedPaneBusquedasNovedadSeguimiento.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNovedadSeguimiento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNovedadSeguimiento);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();						
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedadSeguimiento.gridx = 0;		
			//this.gridBagConstraintsNovedadSeguimiento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNovedadSeguimiento.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 0;		
		//this.gridBagConstraintsNovedadSeguimiento.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNovedadSeguimiento);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedadSeguimiento.gridx = 0;		
			this.gridBagConstraintsNovedadSeguimiento.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsNovedadSeguimiento.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);								
		
		
		/*
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		*/		
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNovedadSeguimiento.gridx =0;
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNovedadSeguimiento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
				
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(NovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNovedadSeguimiento = new GridBagLayout();
			this.jPanelBusquedasParametrosNovedadSeguimiento.setLayout(gridaBagLayoutBusquedasParametrosNovedadSeguimiento);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNovedadSeguimiento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNovedadSeguimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadSeguimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadSeguimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			
			
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		
			
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNovedadSeguimiento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNovedadSeguimiento;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNovedadSeguimiento() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNovedadSeguimiento = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNovedadSeguimiento.setName("jPanelReporteDinamicoNovedadSeguimiento"); 
		
		this.jPanelReporteDinamicoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNovedadSeguimiento.setLayout(gridaBagLayoutReporteDinamicoNovedadSeguimiento);
		
		
		this.jInternalFrameReporteDinamicoNovedadSeguimiento= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNovedadSeguimiento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNovedadSeguimiento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNovedadSeguimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNovedadSeguimiento.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNovedadSeguimiento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNovedadSeguimiento.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNovedadSeguimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNovedadSeguimiento.setResizable(true);
	    this.jInternalFrameReporteDinamicoNovedadSeguimiento.setClosable(true);
	    this.jInternalFrameReporteDinamicoNovedadSeguimiento.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Seguimientoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNovedadSeguimiento = new JLabelMe();

		this.jLabelColumnasSelectReporteNovedadSeguimiento.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNovedadSeguimiento.add(this.jLabelColumnasSelectReporteNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNovedadSeguimiento = new JList<Reporte>();
		this.jListColumnasSelectReporteNovedadSeguimiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNovedadSeguimiento.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNovedadSeguimiento.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNovedadSeguimiento.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNovedadSeguimiento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNovedadSeguimiento=new JScrollPane(this.jListColumnasSelectReporteNovedadSeguimiento);
			
			this.jScrollColumnasSelectReporteNovedadSeguimiento.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNovedadSeguimiento.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNovedadSeguimiento.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNovedadSeguimiento.add(this.jListColumnasSelectReporteNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		this.jPanelReporteDinamicoNovedadSeguimiento.add(this.jScrollColumnasSelectReporteNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNovedadSeguimiento = new JLabelMe();

		this.jLabelRelacionesSelectReporteNovedadSeguimiento.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNovedadSeguimiento = new JList<Reporte>();
		this.jListRelacionesSelectReporteNovedadSeguimiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNovedadSeguimiento.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNovedadSeguimiento.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNovedadSeguimiento.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNovedadSeguimiento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNovedadSeguimiento=new JScrollPane(this.jListRelacionesSelectReporteNovedadSeguimiento);
			
			this.jScrollRelacionesSelectReporteNovedadSeguimiento.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNovedadSeguimiento.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNovedadSeguimiento.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoNovedadSeguimiento = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNovedadSeguimiento = new JComboBoxMe();
		this.jListColumnasValoresGraficoNovedadSeguimiento = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNovedadSeguimiento = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNovedadSeguimiento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNovedadSeguimiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNovedadSeguimiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNovedadSeguimiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNovedadSeguimiento = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNovedadSeguimiento.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNovedadSeguimiento.add(this.jLabelGenerarExcelReporteDinamicoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNovedadSeguimiento = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNovedadSeguimiento.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNovedadSeguimiento,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNovedadSeguimiento.setToolTipText("Generar EXCEL"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNovedadSeguimiento.add(this.jButtonGenerarExcelReporteDinamicoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadSeguimiento.add(this.jComboBoxTiposReportesDinamicoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNovedadSeguimiento = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNovedadSeguimiento.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNovedadSeguimiento.add(this.jLabelTiposArchivoReporteDinamicoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadSeguimiento.add(this.jComboBoxTiposArchivosReportesDinamicoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNovedadSeguimiento = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNovedadSeguimiento.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNovedadSeguimiento,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNovedadSeguimiento.setToolTipText("Generar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadSeguimiento.add(this.jButtonGenerarReporteDinamicoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNovedadSeguimiento = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNovedadSeguimiento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNovedadSeguimiento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNovedadSeguimiento.setToolTipText("Cancelar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadSeguimiento.add(this.jButtonCerrarReporteDinamicoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNovedadSeguimiento = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNovedadSeguimiento= new JScrollPane(jPanelReporteDinamicoNovedadSeguimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Seguimientoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNovedadSeguimiento.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNovedadSeguimiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNovedadSeguimiento.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNovedadSeguimiento);
		this.jInternalFrameReporteDinamicoNovedadSeguimiento.getContentPane().add(this.jScrollPanelReporteDinamicoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNovedadSeguimiento() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNovedadSeguimiento = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNovedadSeguimiento.setName("jPanelImportacionNovedadSeguimiento"); 
		
		this.jPanelImportacionNovedadSeguimiento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNovedadSeguimiento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNovedadSeguimiento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNovedadSeguimiento.setLayout(gridaBagLayoutImportacionNovedadSeguimiento);
		
		
		this.jInternalFrameImportacionNovedadSeguimiento= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNovedadSeguimiento= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNovedadSeguimiento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNovedadSeguimiento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNovedadSeguimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNovedadSeguimiento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNovedadSeguimiento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNovedadSeguimiento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNovedadSeguimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNovedadSeguimiento.setResizable(true);
	    this.jInternalFrameImportacionNovedadSeguimiento.setClosable(true);
	    this.jInternalFrameImportacionNovedadSeguimiento.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNovedadSeguimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNovedadSeguimiento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNovedadSeguimiento.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNovedadSeguimiento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNovedadSeguimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNovedadSeguimiento.setResizable(true);
	    this.jInternalFrameImportacionNovedadSeguimiento.setClosable(true);
	    this.jInternalFrameImportacionNovedadSeguimiento.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNovedadSeguimiento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNovedadSeguimiento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNovedadSeguimiento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Seguimientoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNovedadSeguimiento = new JLabelMe();

		this.jLabelArchivoImportacionNovedadSeguimiento.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYImportacion;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNovedadSeguimiento.add(this.jLabelArchivoImportacionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNovedadSeguimiento = new JFileChooser();		
		this.jFileChooserImportacionNovedadSeguimiento.setToolTipText("ESCOGER ARCHIVO"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNovedadSeguimiento = new JButtonMe();
		this.jButtonAbrirImportacionNovedadSeguimiento.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNovedadSeguimiento,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNovedadSeguimiento.setToolTipText("Generar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadSeguimiento.add(this.jButtonAbrirImportacionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNovedadSeguimiento = new JLabelMe();

		this.jLabelPathArchivoImportacionNovedadSeguimiento.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYImportacion;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNovedadSeguimiento.add(this.jLabelPathArchivoImportacionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNovedadSeguimiento=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNovedadSeguimiento.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNovedadSeguimiento.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNovedadSeguimiento.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadSeguimiento.add(this.jTextFieldPathArchivoImportacionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNovedadSeguimiento = new JButtonMe();
		this.jButtonGenerarImportacionNovedadSeguimiento.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNovedadSeguimiento,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNovedadSeguimiento.setToolTipText("Generar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadSeguimiento.add(this.jButtonGenerarImportacionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNovedadSeguimiento = new JButtonMe();
		this.jButtonCerrarImportacionNovedadSeguimiento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNovedadSeguimiento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNovedadSeguimiento.setToolTipText("Cancelar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadSeguimiento.add(this.jButtonCerrarImportacionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNovedadSeguimiento = new GridBagLayout();
		
		this.jScrollPanelImportacionNovedadSeguimiento= new JScrollPane(jPanelImportacionNovedadSeguimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy =iPosYImportacion;
		this.gridBagConstraintsNovedadSeguimiento.gridx =iPosXImportacion;
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNovedadSeguimiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNovedadSeguimiento.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNovedadSeguimiento);
		this.jInternalFrameImportacionNovedadSeguimiento.getContentPane().add(this.jScrollPanelImportacionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNovedadSeguimiento(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNovedadSeguimiento = new JButtonMe();
			this.jButtonAbrirOrderByNovedadSeguimiento.setText("Orden");
			this.jButtonAbrirOrderByNovedadSeguimiento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNovedadSeguimiento,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNovedadSeguimiento";
			inputMap = this.jButtonAbrirOrderByNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNovedadSeguimiento"));
		
		
			GridBagLayout gridaBagLayoutOrderByNovedadSeguimiento = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNovedadSeguimiento.setName("jPanelOrderByNovedadSeguimiento"); 
			
			this.jPanelOrderByNovedadSeguimiento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNovedadSeguimiento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNovedadSeguimiento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNovedadSeguimiento.setLayout(gridaBagLayoutOrderByNovedadSeguimiento);
			
			
			this.jTableDatosNovedadSeguimientoOrderBy = new JTableMe();        
			this.jTableDatosNovedadSeguimientoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNovedadSeguimientoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNovedadSeguimientoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNovedadSeguimientoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNovedadSeguimientoOrderBy.setViewportView(this.jTableDatosNovedadSeguimientoOrderBy);
			this.jTableDatosNovedadSeguimientoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNovedadSeguimientoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNovedadSeguimiento= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNovedadSeguimiento= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNovedadSeguimiento = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNovedadSeguimiento= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNovedadSeguimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNovedadSeguimiento.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNovedadSeguimiento.setTitle("Orden");
			this.jInternalFrameOrderByNovedadSeguimiento.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNovedadSeguimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNovedadSeguimiento.setResizable(true);
			this.jInternalFrameOrderByNovedadSeguimiento.setClosable(true);
			this.jInternalFrameOrderByNovedadSeguimiento.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNovedadSeguimiento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNovedadSeguimiento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNovedadSeguimiento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Seguimientoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNovedadSeguimiento.gridx =iPosXOrderBy;
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNovedadSeguimiento.ipady =150;
				
			this.jPanelOrderByNovedadSeguimiento.add(jScrollPanelDatosNovedadSeguimientoOrderBy, this.gridBagConstraintsNovedadSeguimiento);//this.jTableDatosNovedadSeguimientoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNovedadSeguimiento = new JButtonMe();
			this.jButtonCerrarOrderByNovedadSeguimiento.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNovedadSeguimiento,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNovedadSeguimiento.setToolTipText("Cancelar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNovedadSeguimiento.add(this.jButtonCerrarOrderByNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNovedadSeguimiento = new GridBagLayout();
			
			this.jScrollPanelOrderByNovedadSeguimiento= new JScrollPane(jPanelOrderByNovedadSeguimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.gridy =iPosYOrderBy;
			this.gridBagConstraintsNovedadSeguimiento.gridx =iPosXOrderBy;
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNovedadSeguimiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNovedadSeguimiento.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNovedadSeguimiento);
			
			this.jInternalFrameOrderByNovedadSeguimiento.getContentPane().add(this.jScrollPanelOrderByNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);			
		
		} else {
			this.jButtonAbrirOrderByNovedadSeguimiento = new JButtonMe();
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
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.novedadseguimientoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNovedadSeguimiento.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNovedadSeguimiento.getRowHeight();//NovedadSeguimientoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNovedadSeguimiento.isSelected()) {
					iHeightTable=NovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNovedadSeguimiento.isSelected()) {
					iHeightTable=NovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNovedadSeguimiento.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNovedadSeguimiento.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNovedadSeguimiento.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNovedadSeguimiento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNovedadSeguimiento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNovedadSeguimiento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNovedadSeguimiento!=null && this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy()!=null) {
			//if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNovedadSeguimiento.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNovedadSeguimiento.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNovedadSeguimiento.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNovedadSeguimiento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNovedadSeguimiento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNovedadSeguimiento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=novedadseguimientoLogic.getNovedadSeguimientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedadseguimientos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<NovedadSeguimiento> TraerNovedadSeguimientoBeans(List<NovedadSeguimiento> novedadseguimientos,ArrayList<Classe> classes)throws Exception {
		try {
			for(NovedadSeguimiento novedadseguimiento:novedadseguimientos) {
					
				if(!(NovedadSeguimientoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NovedadSeguimientoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					novedadseguimiento.setsDetalleGeneralEntityReporte(NovedadSeguimientoConstantesFunciones.getNovedadSeguimientoDescripcion(novedadseguimiento));
										
						
					
						
					
				} else  {
							
					//novedadseguimiento.setsDetalleGeneralEntityReporte(novedadseguimiento.getsDetalleGeneralEntityReporte());
										
				}
				
				//novedadseguimientobeans.add(novedadseguimientobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return novedadseguimientos;
    }
	//PARA REPORTES FIN
}
